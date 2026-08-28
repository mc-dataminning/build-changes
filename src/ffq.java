import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffq extends hdk {
   static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("mco.configure.world.backup");
   static final xd c = xd.c("mco.backup.button.restore");
   static final xd B = xd.c("mco.backup.changes.tooltip");
   private static final xd C = xd.c("mco.backup.nobackups");
   private static final xd D = xd.c("mco.backup.button.download");
   private static final String E = "uploaded";
   private static final int F = 8;
   final fft G;
   List<fea> H = Collections.emptyList();
   @Nullable
   ffq.a I;
   final fny J = new fny(this);
   private final int K;
   @Nullable
   fkk L;
   final fel M;
   boolean N = false;

   public ffq(fft $$0, fel $$1, int $$2) {
      super(b);
      this.G = $$0;
      this.M = $$1;
      this.K = $$2;
   }

   @Override
   public void aR_() {
      this.J.a(b, this.p);
      this.I = this.J.c(new ffq.a());
      foc $$0 = this.J.b(foc.e().a(8));
      this.L = $$0.a(fkk.a(D, $$0x -> this.E()).a());
      this.L.j = false;
      $$0.a(fkk.a(xc.k, $$0x -> this.d()).a());
      this.J.a($$1 -> {
         fki var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
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
            fdu $$0 = fdu.a();

            try {
               List<fea> $$1 = $$0.e(ffq.this.M.a).a;
               ffq.this.m.execute(() -> {
                  ffq.this.H = $$1;
                  ffq.this.N = ffq.this.H.isEmpty();
                  if (!ffq.this.N && ffq.this.L != null) {
                     ffq.this.L.j = true;
                  }

                  if (ffq.this.I != null) {
                     ffq.this.I.aI_().clear();

                     for (fea $$1x : ffq.this.H) {
                        ffq.this.I.a($$1x);
                     }
                  }
               });
            } catch (fff var3) {
               ffq.a.error("Couldn't request backups", var3);
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
            fgf.a(
               this,
               xd.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m.a(new ffz(this.G.g(), new fhh(this.M.a, this.K, this.M.c + " (" + this.M.i.get(this.M.n).a(this.M.n) + ")", this)))
            )
         );
   }

   class a extends fkq<ffq.b> {
      private static final int m = 36;

      public a() {
         super(fil.Q(), ffq.this.n, ffq.this.J.d(), ffq.this.J.c(), 36);
      }

      public void a(fea $$0) {
         this.b(ffq.this.new b($$0));
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

   class b extends fkq.a<ffq.b> {
      private static final int b = 2;
      private final fea c;
      @Nullable
      private fkk d;
      @Nullable
      private fkk e;
      private final List<fki> f = new ArrayList<>();

      public b(final fea $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fkk.a(ffq.B, $$0x -> ffq.this.m.a(new ffp(ffq.this, this.c)))
               .a(8 + ffq.this.p.a(ffq.B))
               .a($$0x -> xc.a(xd.a("mco.backup.narration", this.c()), (xd)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!ffq.this.M.j) {
            this.d = fkk.a(ffq.c, $$0x -> this.d()).a(8 + ffq.this.p.a(ffq.B)).a($$0x -> xc.a(xd.a("mco.backup.narration", this.c()), (xd)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fea $$0) {
         int $$1 = ffq.this.H.indexOf($$0);
         if ($$1 != ffq.this.H.size() - 1) {
            fea $$2 = ffq.this.H.get($$1 + 1);

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
         xd $$0 = fgz.a(this.c.b);
         xd $$1 = xd.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         ffq.this.m.a(fgf.b(ffq.this, $$1, $$0x -> ffq.this.m.a(new ffz(ffq.this.G.g(), new fhp(this.c, ffq.this.M.a, ffq.this.G)))));
      }

      @Override
      public List<? extends fmh> aI_() {
         return this.f;
      }

      @Override
      public List<? extends fof> b() {
         return this.f;
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(ffq.this.p, xd.a("mco.backup.entry", fgz.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(ffq.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
