import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhn extends hfq {
   static final Logger a = LogUtils.getLogger();
   private static final xj b = xj.c("mco.configure.world.backup");
   static final xj c = xj.c("mco.backup.button.restore");
   static final xj B = xj.c("mco.backup.changes.tooltip");
   private static final xj C = xj.c("mco.backup.nobackups");
   private static final xj D = xj.c("mco.backup.button.download");
   private static final String E = "uploaded";
   private static final int F = 8;
   final fhq G;
   List<ffx> H = Collections.emptyList();
   @Nullable
   fhn.a I;
   final fps J = new fps(this);
   private final int K;
   @Nullable
   fmd L;
   final fgi M;
   boolean N = false;

   public fhn(fhq $$0, fgi $$1, int $$2) {
      super(b);
      this.G = $$0;
      this.M = $$1;
      this.K = $$2;
   }

   @Override
   public void aR_() {
      this.J.a(b, this.p);
      this.I = this.J.c(new fhn.a());
      fpw $$0 = this.J.b(fpw.e().a(8));
      this.L = $$0.a(fmd.a(D, $$0x -> this.G()).a());
      this.L.j = false;
      $$0.a(fmd.a(xi.k, $$0x -> this.aO_()).a());
      this.J.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
      this.F();
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
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

   private void F() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            ffh $$0 = ffh.a();

            try {
               List<ffx> $$1 = $$0.e(fhn.this.M.a).a;
               fhn.this.m.execute(() -> {
                  fhn.this.H = $$1;
                  fhn.this.N = fhn.this.H.isEmpty();
                  if (!fhn.this.N && fhn.this.L != null) {
                     fhn.this.L.j = true;
                  }

                  if (fhn.this.I != null) {
                     fhn.this.I.aH_().clear();

                     for (ffx $$1x : fhn.this.H) {
                        fhn.this.I.a($$1x);
                     }
                  }
               });
            } catch (fhc var3) {
               fhn.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aO_() {
      this.m.a(this.G);
   }

   private void G() {
      this.m
         .a(
            fic.a(
               this,
               xj.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m.a(new fhw(this.G.g(), new fjb(this.M.a, this.K, this.M.c + " (" + this.M.i.get(this.M.n).a(this.M.n) + ")", this)))
            )
         );
   }

   class a extends fmj<fhn.b> {
      private static final int m = 36;

      public a() {
         super(fke.Q(), fhn.this.n, fhn.this.J.d(), fhn.this.J.c(), 36);
      }

      public void a(ffx $$0) {
         this.b(fhn.this.new b($$0));
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

   class b extends fmj.a<fhn.b> {
      private static final int b = 2;
      private final ffx c;
      @Nullable
      private fmd d;
      @Nullable
      private fmd e;
      private final List<fmb> f = new ArrayList<>();

      public b(final ffx $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fmd.a(fhn.B, $$0x -> fhn.this.m.a(new fhm(fhn.this, this.c)))
               .a(8 + fhn.this.p.a(fhn.B))
               .a($$0x -> xi.a(xj.a("mco.backup.narration", this.c()), (xj)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fhn.this.M.j) {
            this.d = fmd.a(fhn.c, $$0x -> this.d()).a(8 + fhn.this.p.a(fhn.B)).a($$0x -> xi.a(xj.a("mco.backup.narration", this.c()), (xj)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(ffx $$0) {
         int $$1 = fhn.this.H.indexOf($$0);
         if ($$1 != fhn.this.H.size() - 1) {
            ffx $$2 = fhn.this.H.get($$1 + 1);

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
         xj $$0 = fiv.a(this.c.b);
         xj $$1 = xj.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fhn.this.m.a(fic.b(fhn.this, $$1, $$0x -> fhn.this.m.a(new fhw(fhn.this.G.g(), new fji(this.c, fhn.this.M.a, fhn.this.G)))));
      }

      @Override
      public List<? extends foa> aH_() {
         return this.f;
      }

      @Override
      public List<? extends fpz> b() {
         return this.f;
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fhn.this.p, xj.a("mco.backup.entry", fiv.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fhn.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
