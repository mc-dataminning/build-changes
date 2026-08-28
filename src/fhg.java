import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhg extends hff {
   static final Logger a = LogUtils.getLogger();
   private static final xl b = xl.c("mco.configure.world.backup");
   static final xl c = xl.c("mco.backup.button.restore");
   static final xl B = xl.c("mco.backup.changes.tooltip");
   private static final xl C = xl.c("mco.backup.nobackups");
   private static final xl D = xl.c("mco.backup.button.download");
   private static final String E = "uploaded";
   private static final int F = 8;
   final fhj G;
   List<ffq> H = Collections.emptyList();
   @Nullable
   fhg.a I;
   final fpl J = new fpl(this);
   private final int K;
   @Nullable
   flw L;
   final fgb M;
   boolean N = false;

   public fhg(fhj $$0, fgb $$1, int $$2) {
      super(b);
      this.G = $$0;
      this.M = $$1;
      this.K = $$2;
   }

   @Override
   public void aS_() {
      this.J.a(b, this.p);
      this.I = this.J.c(new fhg.a());
      fpp $$0 = this.J.b(fpp.e().a(8));
      this.L = $$0.a(flw.a(D, $$0x -> this.E()).a());
      this.L.j = false;
      $$0.a(flw.a(xk.k, $$0x -> this.aP_()).a());
      this.J.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.N && this.I != null) {
         $$0.a(this.p, C, this.n / 2 - this.p.a(C) / 2, this.I.E() + this.I.w() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.J.a();
      if (this.I != null) {
         this.I.a(this.n, this.J);
      }
   }

   private void D() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            ffa $$0 = ffa.a();

            try {
               List<ffq> $$1 = $$0.e(fhg.this.M.a).a;
               fhg.this.m.execute(() -> {
                  fhg.this.H = $$1;
                  fhg.this.N = fhg.this.H.isEmpty();
                  if (!fhg.this.N && fhg.this.L != null) {
                     fhg.this.L.j = true;
                  }

                  if (fhg.this.I != null) {
                     fhg.this.I.aI_().clear();

                     for (ffq $$1x : fhg.this.H) {
                        fhg.this.I.a($$1x);
                     }
                  }
               });
            } catch (fgv var3) {
               fhg.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aP_() {
      this.m.a(this.G);
   }

   private void E() {
      this.m
         .a(
            fhv.a(
               this,
               xl.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m.a(new fhp(this.G.g(), new fiu(this.M.a, this.K, this.M.c + " (" + this.M.i.get(this.M.n).a(this.M.n) + ")", this)))
            )
         );
   }

   class a extends fmc<fhg.b> {
      private static final int m = 36;

      public a() {
         super(fjx.Q(), fhg.this.n, fhg.this.J.d(), fhg.this.J.c(), 36);
      }

      public void a(ffq $$0) {
         this.b(fhg.this.new b($$0));
      }

      @Override
      public int a() {
         return this.l() * 36 + this.f;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   class b extends fmc.a<fhg.b> {
      private static final int b = 2;
      private final ffq c;
      @Nullable
      private flw d;
      @Nullable
      private flw e;
      private final List<flu> f = new ArrayList<>();

      public b(final ffq $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = flw.a(fhg.B, $$0x -> fhg.this.m.a(new fhf(fhg.this, this.c)))
               .a(8 + fhg.this.p.a(fhg.B))
               .a($$0x -> xk.a(xl.a("mco.backup.narration", this.c()), (xl)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fhg.this.M.j) {
            this.d = flw.a(fhg.c, $$0x -> this.d()).a(8 + fhg.this.p.a(fhg.B)).a($$0x -> xk.a(xl.a("mco.backup.narration", this.c()), (xl)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(ffq $$0) {
         int $$1 = fhg.this.H.indexOf($$0);
         if ($$1 != fhg.this.H.size() - 1) {
            ffq $$2 = fhg.this.H.get($$1 + 1);

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

      private void d() {
         xl $$0 = fio.a(this.c.b);
         xl $$1 = xl.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fhg.this.m.a(fhv.b(fhg.this, $$1, $$0x -> fhg.this.m.a(new fhp(fhg.this.G.g(), new fjb(this.c, fhg.this.M.a, fhg.this.G)))));
      }

      @Override
      public List<? extends fnt> aI_() {
         return this.f;
      }

      @Override
      public List<? extends fps> b() {
         return this.f;
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fhg.this.p, xl.a("mco.backup.entry", fio.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fhg.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.y() + 8;
            this.d.m($$3 + $$4 - $$14);
            this.d.n($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.y() + 8;
            this.e.m($$3 + $$4 - $$14);
            this.e.n($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}
