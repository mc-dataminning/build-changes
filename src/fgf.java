import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgf extends hee {
   static final Logger a = LogUtils.getLogger();
   private static final xh b = xh.c("mco.configure.world.backup");
   static final xh c = xh.c("mco.backup.button.restore");
   static final xh B = xh.c("mco.backup.changes.tooltip");
   private static final xh C = xh.c("mco.backup.nobackups");
   private static final xh D = xh.c("mco.backup.button.download");
   private static final String E = "uploaded";
   private static final int F = 8;
   final fgi G;
   List<fep> H = Collections.emptyList();
   @Nullable
   fgf.a I;
   final fon J = new fon(this);
   private final int K;
   @Nullable
   fkz L;
   final ffa M;
   boolean N = false;

   public fgf(fgi $$0, ffa $$1, int $$2) {
      super(b);
      this.G = $$0;
      this.M = $$1;
      this.K = $$2;
   }

   @Override
   public void aS_() {
      this.J.a(b, this.p);
      this.I = this.J.c(new fgf.a());
      fos $$0 = this.J.b(fos.e().a(8));
      this.L = $$0.a(fkz.a(D, $$0x -> this.E()).a());
      this.L.j = false;
      $$0.a(fkz.a(xg.k, $$0x -> this.d()).a());
      this.J.a($$1 -> {
         fkx var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
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
            fej $$0 = fej.a();

            try {
               List<fep> $$1 = $$0.e(fgf.this.M.a).a;
               fgf.this.m.execute(() -> {
                  fgf.this.H = $$1;
                  fgf.this.N = fgf.this.H.isEmpty();
                  if (!fgf.this.N && fgf.this.L != null) {
                     fgf.this.L.j = true;
                  }

                  if (fgf.this.I != null) {
                     fgf.this.I.aJ_().clear();

                     for (fep $$1x : fgf.this.H) {
                        fgf.this.I.a($$1x);
                     }
                  }
               });
            } catch (ffu var3) {
               fgf.a.error("Couldn't request backups", var3);
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
            fgu.a(
               this,
               xh.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m.a(new fgo(this.G.g(), new fhw(this.M.a, this.K, this.M.c + " (" + this.M.i.get(this.M.n).a(this.M.n) + ")", this)))
            )
         );
   }

   class a extends flf<fgf.b> {
      private static final int m = 36;

      public a() {
         super(fja.Q(), fgf.this.n, fgf.this.J.d(), fgf.this.J.c(), 36);
      }

      public void a(fep $$0) {
         this.b(fgf.this.new b($$0));
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

   class b extends flf.a<fgf.b> {
      private static final int b = 2;
      private final fep c;
      @Nullable
      private fkz d;
      @Nullable
      private fkz e;
      private final List<fkx> f = new ArrayList<>();

      public b(final fep $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fkz.a(fgf.B, $$0x -> fgf.this.m.a(new fge(fgf.this, this.c)))
               .a(8 + fgf.this.p.a(fgf.B))
               .a($$0x -> xg.a(xh.a("mco.backup.narration", this.c()), (xh)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fgf.this.M.j) {
            this.d = fkz.a(fgf.c, $$0x -> this.d()).a(8 + fgf.this.p.a(fgf.B)).a($$0x -> xg.a(xh.a("mco.backup.narration", this.c()), (xh)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fep $$0) {
         int $$1 = fgf.this.H.indexOf($$0);
         if ($$1 != fgf.this.H.size() - 1) {
            fep $$2 = fgf.this.H.get($$1 + 1);

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
         xh $$0 = fho.a(this.c.b);
         xh $$1 = xh.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fgf.this.m.a(fgu.b(fgf.this, $$1, $$0x -> fgf.this.m.a(new fgo(fgf.this.G.g(), new fie(this.c, fgf.this.M.a, fgf.this.G)))));
      }

      @Override
      public List<? extends fmw> aJ_() {
         return this.f;
      }

      @Override
      public List<? extends fov> b() {
         return this.f;
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fgf.this.p, xh.a("mco.backup.entry", fho.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fgf.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
