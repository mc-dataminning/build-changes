import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffu extends hdp {
   static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("mco.configure.world.backup");
   static final xe c = xe.c("mco.backup.button.restore");
   static final xe B = xe.c("mco.backup.changes.tooltip");
   private static final xe C = xe.c("mco.backup.nobackups");
   private static final xe D = xe.c("mco.backup.button.download");
   private static final String E = "uploaded";
   private static final int F = 8;
   final ffx G;
   List<fee> H = Collections.emptyList();
   @Nullable
   ffu.a I;
   final foc J = new foc(this);
   private final int K;
   @Nullable
   fko L;
   final fep M;
   boolean N = false;

   public ffu(ffx $$0, fep $$1, int $$2) {
      super(b);
      this.G = $$0;
      this.M = $$1;
      this.K = $$2;
   }

   @Override
   public void aS_() {
      this.J.a(b, this.p);
      this.I = this.J.c(new ffu.a());
      fog $$0 = this.J.b(fog.e().a(8));
      this.L = $$0.a(fko.a(D, $$0x -> this.E()).a());
      this.L.j = false;
      $$0.a(fko.a(xd.k, $$0x -> this.d()).a());
      this.J.a($$1 -> {
         fkm var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
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
            fdy $$0 = fdy.a();

            try {
               List<fee> $$1 = $$0.e(ffu.this.M.a).a;
               ffu.this.m.execute(() -> {
                  ffu.this.H = $$1;
                  ffu.this.N = ffu.this.H.isEmpty();
                  if (!ffu.this.N && ffu.this.L != null) {
                     ffu.this.L.j = true;
                  }

                  if (ffu.this.I != null) {
                     ffu.this.I.aJ_().clear();

                     for (fee $$1x : ffu.this.H) {
                        ffu.this.I.a($$1x);
                     }
                  }
               });
            } catch (ffj var3) {
               ffu.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.m.a(this.G);
   }

   private void E() {
      this.m
         .a(
            fgj.a(
               this,
               xe.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m.a(new fgd(this.G.g(), new fhl(this.M.a, this.K, this.M.c + " (" + this.M.i.get(this.M.n).a(this.M.n) + ")", this)))
            )
         );
   }

   class a extends fku<ffu.b> {
      private static final int m = 36;

      public a() {
         super(fip.Q(), ffu.this.n, ffu.this.J.d(), ffu.this.J.c(), 36);
      }

      public void a(fee $$0) {
         this.b(ffu.this.new b($$0));
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

   class b extends fku.a<ffu.b> {
      private static final int b = 2;
      private final fee c;
      @Nullable
      private fko d;
      @Nullable
      private fko e;
      private final List<fkm> f = new ArrayList<>();

      public b(final fee $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fko.a(ffu.B, $$0x -> ffu.this.m.a(new fft(ffu.this, this.c)))
               .a(8 + ffu.this.p.a(ffu.B))
               .a($$0x -> xd.a(xe.a("mco.backup.narration", this.c()), (xe)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!ffu.this.M.j) {
            this.d = fko.a(ffu.c, $$0x -> this.d()).a(8 + ffu.this.p.a(ffu.B)).a($$0x -> xd.a(xe.a("mco.backup.narration", this.c()), (xe)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fee $$0) {
         int $$1 = ffu.this.H.indexOf($$0);
         if ($$1 != ffu.this.H.size() - 1) {
            fee $$2 = ffu.this.H.get($$1 + 1);

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
         xe $$0 = fhd.a(this.c.b);
         xe $$1 = xe.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         ffu.this.m.a(fgj.b(ffu.this, $$1, $$0x -> ffu.this.m.a(new fgd(ffu.this.G.g(), new fht(this.c, ffu.this.M.a, ffu.this.G)))));
      }

      @Override
      public List<? extends fml> aJ_() {
         return this.f;
      }

      @Override
      public List<? extends foj> b() {
         return this.f;
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(ffu.this.p, xe.a("mco.backup.entry", fhd.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(ffu.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
