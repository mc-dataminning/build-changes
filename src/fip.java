import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fip extends hky {
   static final Logger a = LogUtils.getLogger();
   private static final wo b = wo.c("mco.configure.world.backup");
   static final wo c = wo.c("mco.backup.button.restore");
   static final wo C = wo.c("mco.backup.changes.tooltip");
   private static final wo D = wo.c("mco.backup.nobackups");
   private static final wo E = wo.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fis H;
   List<fgy> I = Collections.emptyList();
   @Nullable
   fip.a J;
   final fse K = new fse(this);
   private final int L;
   @Nullable
   fop M;
   final fhj N;
   boolean O = false;

   public fip(fis $$0, fhj $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aR_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fip.a());
      fsi $$0 = this.K.b(fsi.e().a(8));
      this.M = $$0.a(fop.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fop.a(wn.k, $$0x -> this.aO_()).a());
      this.K.a($$1 -> {
         fon var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.O && this.J != null) {
         $$0.b(this.p, D, this.n / 2 - this.p.a(D) / 2, this.J.G() + this.J.y() / 2 - 9 / 2, -1);
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
            fgi $$0 = fgi.a();

            try {
               List<fgy> $$1 = $$0.e(fip.this.N.a).a;
               fip.this.m.execute(() -> {
                  fip.this.I = $$1;
                  fip.this.O = fip.this.I.isEmpty();
                  if (!fip.this.O && fip.this.M != null) {
                     fip.this.M.j = true;
                  }

                  if (fip.this.J != null) {
                     fip.this.J.a(fip.this.I.stream().map($$0xx -> fip.this.new b($$0xx)).toList());
                  }
               });
            } catch (fie var3) {
               fip.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aO_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fje.a(
               this,
               wo.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fiy(
                           this.H.g(),
                           new fkd(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fow<fip.b> {
      private static final int a = 36;

      public a() {
         super(flh.Q(), fip.this.n, fip.this.K.d(), fip.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fow.a<fip.b> {
      private static final int b = 2;
      private final fgy c;
      @Nullable
      private fop d;
      @Nullable
      private fop e;
      private final List<fon> f = new ArrayList<>();

      public b(final fgy $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fop.a(fip.C, $$0x -> fip.this.m.a(new fio(fip.this, this.c)))
               .a(8 + fip.this.p.a(fip.C))
               .a($$0x -> wn.a(wo.a("mco.backup.narration", this.c()), (wo)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fip.this.N.j) {
            this.d = fop.a(fip.c, $$0x -> this.g()).a(8 + fip.this.p.a(fip.C)).a($$0x -> wn.a(wo.a("mco.backup.narration", this.c()), (wo)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fgy $$0) {
         int $$1 = fip.this.I.indexOf($$0);
         if ($$1 != fip.this.I.size() - 1) {
            fgy $$2 = fip.this.I.get($$1 + 1);

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
         wo $$0 = fjx.a(this.c.b);
         wo $$1 = wo.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fip.this.m.a(fje.b(fip.this, $$1, $$0x -> fip.this.m.a(new fiy(fip.this.H.g(), new fkk(this.c, fip.this.N.a, fip.this.H)))));
      }

      @Override
      public List<? extends fqn> aH_() {
         return this.f;
      }

      @Override
      public List<? extends fsl> b() {
         return this.f;
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fip.this.p, wo.a("mco.backup.entry", fjx.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fip.this.p, this.a(this.c.b), $$3, $$12, 5000268);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.A() + 8;
            this.d.j($$3 + $$4 - $$14);
            this.d.k($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.A() + 8;
            this.e.j($$3 + $$4 - $$14);
            this.e.k($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}
