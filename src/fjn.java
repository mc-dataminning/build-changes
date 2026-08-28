import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjn extends hhu {
   static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("mco.configure.world.backup");
   static final xv c = xv.c("mco.backup.button.restore");
   static final xv C = xv.c("mco.backup.changes.tooltip");
   private static final xv D = xv.c("mco.backup.nobackups");
   private static final xv E = xv.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fjq H;
   List<fhw> I = Collections.emptyList();
   @Nullable
   fjn.a J;
   final frs K = new frs(this);
   private final int L;
   @Nullable
   fod M;
   final fih N;
   boolean O = false;

   public fjn(fjq $$0, fih $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aT_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fjn.a());
      frw $$0 = this.K.b(frw.e().a(8));
      this.M = $$0.a(fod.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fod.a(xu.k, $$0x -> this.aP_()).a());
      this.K.a($$1 -> {
         fob var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.O && this.J != null) {
         $$0.a(this.p, D, this.n / 2 - this.p.a(D) / 2, this.J.E() + this.J.w() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.K.a();
      if (this.J != null) {
         this.J.a(this.n, this.K);
      }
   }

   private void E() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fhg $$0 = fhg.a();

            try {
               List<fhw> $$1 = $$0.e(fjn.this.N.a).a;
               fjn.this.m.execute(() -> {
                  fjn.this.I = $$1;
                  fjn.this.O = fjn.this.I.isEmpty();
                  if (!fjn.this.O && fjn.this.M != null) {
                     fjn.this.M.j = true;
                  }

                  if (fjn.this.J != null) {
                     fjn.this.J.a(fjn.this.I.stream().map($$0xx -> fjn.this.new b($$0xx)).toList());
                  }
               });
            } catch (fjc var3) {
               fjn.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aP_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fkc.a(
               this,
               xv.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m.a(new fjw(this.H.g(), new flb(this.N.a, this.L, this.N.c + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)))
            )
         );
   }

   class a extends foj<fjn.b> {
      private static final int a = 36;

      public a() {
         super(fme.Q(), fjn.this.n, fjn.this.K.d(), fjn.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends foj.a<fjn.b> {
      private static final int b = 2;
      private final fhw c;
      @Nullable
      private fod d;
      @Nullable
      private fod e;
      private final List<fob> f = new ArrayList<>();

      public b(final fhw $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fod.a(fjn.C, $$0x -> fjn.this.m.a(new fjm(fjn.this, this.c)))
               .a(8 + fjn.this.p.a(fjn.C))
               .a($$0x -> xu.a(xv.a("mco.backup.narration", this.c()), (xv)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fjn.this.N.j) {
            this.d = fod.a(fjn.c, $$0x -> this.g()).a(8 + fjn.this.p.a(fjn.C)).a($$0x -> xu.a(xv.a("mco.backup.narration", this.c()), (xv)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fhw $$0) {
         int $$1 = fjn.this.I.indexOf($$0);
         if ($$1 != fjn.this.I.size() - 1) {
            fhw $$2 = fjn.this.I.get($$1 + 1);

            for (String $$3 : $$0.d.keySet()) {
               if (!$$3.contains("uploaded") && $$2.d.containsKey($$3)) {
                  if (!$$0.d.get($$3).equals($$2.d.get($$3))) {
                     this.a($$3);
                  }
               } else {
                  this.a($$3);
               }
            }
         }
      }

      private void a(String $$0) {
         if ($$0.contains("uploaded")) {
            String $$1 = DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
            this.c.e.put($$0, $$1);
            this.c.a(true);
         } else {
            this.c.e.put($$0, this.c.d.get($$0));
         }
      }

      private String c() {
         return DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
      }

      private void g() {
         xv $$0 = fkv.a(this.c.b);
         xv $$1 = xv.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fjn.this.m.a(fkc.b(fjn.this, $$1, $$0x -> fjn.this.m.a(new fjw(fjn.this.H.g(), new fli(this.c, fjn.this.N.a, fjn.this.H)))));
      }

      @Override
      public List<? extends fqb> aI_() {
         return this.f;
      }

      @Override
      public List<? extends frz> b() {
         return this.f;
      }

      @Override
      public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fjn.this.p, xv.a("mco.backup.entry", fkv.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fjn.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.y() + 8;
            this.d.k($$3 + $$4 - $$14);
            this.d.l($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.y() + 8;
            this.e.k($$3 + $$4 - $$14);
            this.e.l($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}
