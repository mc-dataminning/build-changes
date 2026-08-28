import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fom extends hro {
   static final Logger a = LogUtils.getLogger();
   private static final xc b = xc.c("mco.configure.world.backup");
   static final xc c = xc.c("mco.backup.button.restore");
   static final xc C = xc.c("mco.backup.changes.tooltip");
   private static final xc D = xc.c("mco.backup.nobackups");
   private static final xc E = xc.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fop H;
   List<fmv> I = Collections.emptyList();
   @Nullable
   fom.a J;
   final fyb K = new fyb(this);
   private final int L;
   @Nullable
   fun M;
   final fng N;
   boolean O = false;

   public fom(fop $$0, fng $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aS_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fom.a());
      fyf $$0 = this.K.b(fyf.e().a(8));
      this.M = $$0.a(fun.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fun.a(xb.k, $$0x -> this.aP_()).a());
      this.K.a($$1 -> {
         ful var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
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
            fmf $$0 = fmf.a();

            try {
               List<fmv> $$1 = $$0.e(fom.this.N.a).a;
               fom.this.m.execute(() -> {
                  fom.this.I = $$1;
                  fom.this.O = fom.this.I.isEmpty();
                  if (!fom.this.O && fom.this.M != null) {
                     fom.this.M.j = true;
                  }

                  if (fom.this.J != null) {
                     fom.this.J.a(fom.this.I.stream().map($$0xx -> fom.this.new b($$0xx)).toList());
                  }
               });
            } catch (fob var3) {
               fom.a.error("Couldn't request backups", var3);
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
            fpc.a(
               this,
               xc.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fow(
                           this.H.g(),
                           new fqb(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fut<fom.b> {
      private static final int a = 36;

      public a() {
         super(frf.Q(), fom.this.n, fom.this.K.d(), fom.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fut.a<fom.b> {
      private static final int b = 2;
      private final fmv c;
      @Nullable
      private fun d;
      @Nullable
      private fun e;
      private final List<ful> f = new ArrayList<>();

      public b(final fmv $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fun.a(fom.C, $$0x -> fom.this.m.a(new fol(fom.this, this.c)))
               .a(8 + fom.this.p.a(fom.C))
               .a($$0x -> xb.a(xc.a("mco.backup.narration", this.c()), (xc)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fom.this.N.j) {
            this.d = fun.a(fom.c, $$0x -> this.g()).a(8 + fom.this.p.a(fom.C)).a($$0x -> xb.a(xc.a("mco.backup.narration", this.c()), (xc)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fmv $$0) {
         int $$1 = fom.this.I.indexOf($$0);
         if ($$1 != fom.this.I.size() - 1) {
            fmv $$2 = fom.this.I.get($$1 + 1);

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
         xc $$0 = fpv.a(this.c.b);
         xc $$1 = xc.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fom.this.m.a(fpc.b(fom.this, $$1, $$0x -> fom.this.m.a(new fow(fom.this.H.g(), new fqi(this.c, fom.this.N.a, fom.this.H)))));
      }

      @Override
      public List<? extends fwk> aI_() {
         return this.f;
      }

      @Override
      public List<? extends fyi> b() {
         return this.f;
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fom.this.p, xc.a("mco.backup.entry", fpv.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fom.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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
