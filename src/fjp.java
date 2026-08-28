import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjp extends hhw {
   static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("mco.configure.world.backup");
   static final xv c = xv.c("mco.backup.button.restore");
   static final xv C = xv.c("mco.backup.changes.tooltip");
   private static final xv D = xv.c("mco.backup.nobackups");
   private static final xv E = xv.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fjs H;
   List<fhy> I = Collections.emptyList();
   @Nullable
   fjp.a J;
   final fru K = new fru(this);
   private final int L;
   @Nullable
   fof M;
   final fij N;
   boolean O = false;

   public fjp(fjs $$0, fij $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aT_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fjp.a());
      fry $$0 = this.K.b(fry.e().a(8));
      this.M = $$0.a(fof.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fof.a(xu.k, $$0x -> this.aP_()).a());
      this.K.a($$1 -> {
         fod var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
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
            fhi $$0 = fhi.a();

            try {
               List<fhy> $$1 = $$0.e(fjp.this.N.a).a;
               fjp.this.m.execute(() -> {
                  fjp.this.I = $$1;
                  fjp.this.O = fjp.this.I.isEmpty();
                  if (!fjp.this.O && fjp.this.M != null) {
                     fjp.this.M.j = true;
                  }

                  if (fjp.this.J != null) {
                     fjp.this.J.a(fjp.this.I.stream().map($$0xx -> fjp.this.new b($$0xx)).toList());
                  }
               });
            } catch (fje var3) {
               fjp.a.error("Couldn't request backups", var3);
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
            fke.a(
               this,
               xv.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fjy(
                           this.H.g(),
                           new fld(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fol<fjp.b> {
      private static final int a = 36;

      public a() {
         super(fmg.Q(), fjp.this.n, fjp.this.K.d(), fjp.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fol.a<fjp.b> {
      private static final int b = 2;
      private final fhy c;
      @Nullable
      private fof d;
      @Nullable
      private fof e;
      private final List<fod> f = new ArrayList<>();

      public b(final fhy $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fof.a(fjp.C, $$0x -> fjp.this.m.a(new fjo(fjp.this, this.c)))
               .a(8 + fjp.this.p.a(fjp.C))
               .a($$0x -> xu.a(xv.a("mco.backup.narration", this.c()), (xv)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fjp.this.N.j) {
            this.d = fof.a(fjp.c, $$0x -> this.g()).a(8 + fjp.this.p.a(fjp.C)).a($$0x -> xu.a(xv.a("mco.backup.narration", this.c()), (xv)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fhy $$0) {
         int $$1 = fjp.this.I.indexOf($$0);
         if ($$1 != fjp.this.I.size() - 1) {
            fhy $$2 = fjp.this.I.get($$1 + 1);

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
         xv $$0 = fkx.a(this.c.b);
         xv $$1 = xv.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fjp.this.m.a(fke.b(fjp.this, $$1, $$0x -> fjp.this.m.a(new fjy(fjp.this.H.g(), new flk(this.c, fjp.this.N.a, fjp.this.H)))));
      }

      @Override
      public List<? extends fqd> aI_() {
         return this.f;
      }

      @Override
      public List<? extends fsb> b() {
         return this.f;
      }

      @Override
      public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fjp.this.p, xv.a("mco.backup.entry", fkx.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fjp.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
