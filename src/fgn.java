import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgn extends hep {
   static final Logger a = LogUtils.getLogger();
   private static final xi b = xi.c("mco.configure.world.backup");
   static final xi c = xi.c("mco.backup.button.restore");
   static final xi B = xi.c("mco.backup.changes.tooltip");
   private static final xi C = xi.c("mco.backup.nobackups");
   private static final xi D = xi.c("mco.backup.button.download");
   private static final String E = "uploaded";
   private static final int F = 8;
   final fgq G;
   List<fex> H = Collections.emptyList();
   @Nullable
   fgn.a I;
   final fow J = new fow(this);
   private final int K;
   @Nullable
   flh L;
   final ffi M;
   boolean N = false;

   public fgn(fgq $$0, ffi $$1, int $$2) {
      super(b);
      this.G = $$0;
      this.M = $$1;
      this.K = $$2;
   }

   @Override
   public void aR_() {
      this.J.a(b, this.p);
      this.I = this.J.c(new fgn.a());
      fpa $$0 = this.J.b(fpa.e().a(8));
      this.L = $$0.a(flh.a(D, $$0x -> this.E()).a());
      this.L.j = false;
      $$0.a(flh.a(xh.k, $$0x -> this.d()).a());
      this.J.a($$1 -> {
         flf var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
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
            fer $$0 = fer.a();

            try {
               List<fex> $$1 = $$0.e(fgn.this.M.a).a;
               fgn.this.m.execute(() -> {
                  fgn.this.H = $$1;
                  fgn.this.N = fgn.this.H.isEmpty();
                  if (!fgn.this.N && fgn.this.L != null) {
                     fgn.this.L.j = true;
                  }

                  if (fgn.this.I != null) {
                     fgn.this.I.aI_().clear();

                     for (fex $$1x : fgn.this.H) {
                        fgn.this.I.a($$1x);
                     }
                  }
               });
            } catch (fgc var3) {
               fgn.a.error("Couldn't request backups", var3);
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
            fhc.a(
               this,
               xi.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m.a(new fgw(this.G.g(), new fie(this.M.a, this.K, this.M.c + " (" + this.M.i.get(this.M.n).a(this.M.n) + ")", this)))
            )
         );
   }

   class a extends fln<fgn.b> {
      private static final int m = 36;

      public a() {
         super(fji.Q(), fgn.this.n, fgn.this.J.d(), fgn.this.J.c(), 36);
      }

      public void a(fex $$0) {
         this.b(fgn.this.new b($$0));
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

   class b extends fln.a<fgn.b> {
      private static final int b = 2;
      private final fex c;
      @Nullable
      private flh d;
      @Nullable
      private flh e;
      private final List<flf> f = new ArrayList<>();

      public b(final fex $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = flh.a(fgn.B, $$0x -> fgn.this.m.a(new fgm(fgn.this, this.c)))
               .a(8 + fgn.this.p.a(fgn.B))
               .a($$0x -> xh.a(xi.a("mco.backup.narration", this.c()), (xi)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fgn.this.M.j) {
            this.d = flh.a(fgn.c, $$0x -> this.d()).a(8 + fgn.this.p.a(fgn.B)).a($$0x -> xh.a(xi.a("mco.backup.narration", this.c()), (xi)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fex $$0) {
         int $$1 = fgn.this.H.indexOf($$0);
         if ($$1 != fgn.this.H.size() - 1) {
            fex $$2 = fgn.this.H.get($$1 + 1);

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
         xi $$0 = fhw.a(this.c.b);
         xi $$1 = xi.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fgn.this.m.a(fhc.b(fgn.this, $$1, $$0x -> fgn.this.m.a(new fgw(fgn.this.G.g(), new fim(this.c, fgn.this.M.a, fgn.this.G)))));
      }

      @Override
      public List<? extends fne> aI_() {
         return this.f;
      }

      @Override
      public List<? extends fpd> b() {
         return this.f;
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fgn.this.p, xi.a("mco.backup.entry", fhw.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fgn.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
