import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fds extends gwo {
   static final Logger a = LogUtils.getLogger();
   private static final wz b = wz.c("mco.configure.world.backup");
   static final wz c = wz.c("mco.backup.button.restore");
   static final wz B = wz.c("mco.backup.changes.tooltip");
   private static final wz C = wz.c("mco.backup.nobackups");
   private static final wz D = wz.c("mco.backup.button.download");
   private static final String E = "uploaded";
   private static final int F = 8;
   final fdv G;
   List<fcc> H = Collections.emptyList();
   @Nullable
   fds.a I;
   final flx J = new flx(this);
   private final int K;
   @Nullable
   fik L;
   final fcn M;
   boolean N = false;

   public fds(fdv $$0, fcn $$1, int $$2) {
      super(b);
      this.G = $$0;
      this.M = $$1;
      this.K = $$2;
   }

   @Override
   public void aT_() {
      this.J.a(b, this.o);
      this.I = this.J.c(new fds.a());
      fmb $$0 = this.J.b(fmb.e().a(8));
      this.L = $$0.a(fik.a(D, $$0x -> this.D()).a());
      this.L.j = false;
      $$0.a(fik.a(wy.k, $$0x -> this.d()).a());
      this.J.a($$1 -> {
         fii var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.N && this.I != null) {
         $$0.a(this.o, C, this.m / 2 - this.o.a(C) / 2, this.I.E() + this.I.w() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.J.a();
      if (this.I != null) {
         this.I.a(this.m, this.J);
      }
   }

   private void C() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fbw $$0 = fbw.a();

            try {
               List<fcc> $$1 = $$0.e(fds.this.M.a).a;
               fds.this.l.execute(() -> {
                  fds.this.H = $$1;
                  fds.this.N = fds.this.H.isEmpty();
                  if (!fds.this.N && fds.this.L != null) {
                     fds.this.L.j = true;
                  }

                  if (fds.this.I != null) {
                     fds.this.I.aK_().clear();

                     for (fcc $$1x : fds.this.H) {
                        fds.this.I.a($$1x);
                     }
                  }
               });
            } catch (fdh var3) {
               fds.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.l.a(this.G);
   }

   private void D() {
      this.l
         .a(
            feh.a(
               this,
               wz.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.l.a(new feb(this.G.g(), new ffj(this.M.a, this.K, this.M.c + " (" + this.M.i.get(this.M.n).a(this.M.n) + ")", this)))
            )
         );
   }

   class a extends fiq<fds.b> {
      private static final int m = 36;

      public a() {
         super(fgm.Q(), fds.this.m, fds.this.J.d(), fds.this.J.c(), 36);
      }

      public void a(fcc $$0) {
         this.b(fds.this.new b($$0));
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

   class b extends fiq.a<fds.b> {
      private static final int b = 2;
      private final fcc c;
      @Nullable
      private fik d;
      @Nullable
      private fik e;
      private final List<fii> f = new ArrayList<>();

      public b(final fcc $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fik.a(fds.B, $$0x -> fds.this.l.a(new fdr(fds.this, this.c)))
               .a(8 + fds.this.o.a(fds.B))
               .a($$0x -> wy.a(wz.a("mco.backup.narration", this.c()), (wz)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fds.this.M.j) {
            this.d = fik.a(fds.c, $$0x -> this.d()).a(8 + fds.this.o.a(fds.B)).a($$0x -> wy.a(wz.a("mco.backup.narration", this.c()), (wz)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fcc $$0) {
         int $$1 = fds.this.H.indexOf($$0);
         if ($$1 != fds.this.H.size() - 1) {
            fcc $$2 = fds.this.H.get($$1 + 1);

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
         wz $$0 = ffb.a(this.c.b);
         wz $$1 = wz.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fds.this.l.a(feh.b(fds.this, $$1, $$0x -> fds.this.l.a(new feb(fds.this.G.g(), new ffr(this.c, fds.this.M.a, fds.this.G)))));
      }

      @Override
      public List<? extends fkg> aK_() {
         return this.f;
      }

      @Override
      public List<? extends fme> b() {
         return this.f;
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fds.this.o, wz.a("mco.backup.entry", ffb.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fds.this.o, this.a(this.c.b), $$3, $$12, 5000268, false);
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
