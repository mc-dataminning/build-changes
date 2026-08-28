import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffg extends hct {
   static final Logger a = LogUtils.getLogger();
   private static final xd b = xd.c("mco.configure.world.backup");
   static final xd c = xd.c("mco.backup.button.restore");
   static final xd B = xd.c("mco.backup.changes.tooltip");
   private static final xd C = xd.c("mco.backup.nobackups");
   private static final xd D = xd.c("mco.backup.button.download");
   private static final String E = "uploaded";
   private static final int F = 8;
   final ffj G;
   List<fdq> H = Collections.emptyList();
   @Nullable
   ffg.a I;
   final fno J = new fno(this);
   private final int K;
   @Nullable
   fka L;
   final feb M;
   boolean N = false;

   public ffg(ffj $$0, feb $$1, int $$2) {
      super(b);
      this.G = $$0;
      this.M = $$1;
      this.K = $$2;
   }

   @Override
   public void aT_() {
      this.J.a(b, this.p);
      this.I = this.J.c(new ffg.a());
      fns $$0 = this.J.b(fns.e().a(8));
      this.L = $$0.a(fka.a(D, $$0x -> this.E()).a());
      this.L.j = false;
      $$0.a(fka.a(xc.k, $$0x -> this.d()).a());
      this.J.a($$1 -> {
         fjy var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
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
            fdk $$0 = fdk.a();

            try {
               List<fdq> $$1 = $$0.e(ffg.this.M.a).a;
               ffg.this.m.execute(() -> {
                  ffg.this.H = $$1;
                  ffg.this.N = ffg.this.H.isEmpty();
                  if (!ffg.this.N && ffg.this.L != null) {
                     ffg.this.L.j = true;
                  }

                  if (ffg.this.I != null) {
                     ffg.this.I.aK_().clear();

                     for (fdq $$1x : ffg.this.H) {
                        ffg.this.I.a($$1x);
                     }
                  }
               });
            } catch (fev var3) {
               ffg.a.error("Couldn't request backups", var3);
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
            ffv.a(
               this,
               xd.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m.a(new ffp(this.G.g(), new fgx(this.M.a, this.K, this.M.c + " (" + this.M.i.get(this.M.n).a(this.M.n) + ")", this)))
            )
         );
   }

   class a extends fkg<ffg.b> {
      private static final int m = 36;

      public a() {
         super(fib.Q(), ffg.this.n, ffg.this.J.d(), ffg.this.J.c(), 36);
      }

      public void a(fdq $$0) {
         this.b(ffg.this.new b($$0));
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

   class b extends fkg.a<ffg.b> {
      private static final int b = 2;
      private final fdq c;
      @Nullable
      private fka d;
      @Nullable
      private fka e;
      private final List<fjy> f = new ArrayList<>();

      public b(final fdq $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fka.a(ffg.B, $$0x -> ffg.this.m.a(new fff(ffg.this, this.c)))
               .a(8 + ffg.this.p.a(ffg.B))
               .a($$0x -> xc.a(xd.a("mco.backup.narration", this.c()), (xd)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!ffg.this.M.j) {
            this.d = fka.a(ffg.c, $$0x -> this.d()).a(8 + ffg.this.p.a(ffg.B)).a($$0x -> xc.a(xd.a("mco.backup.narration", this.c()), (xd)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fdq $$0) {
         int $$1 = ffg.this.H.indexOf($$0);
         if ($$1 != ffg.this.H.size() - 1) {
            fdq $$2 = ffg.this.H.get($$1 + 1);

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
         xd $$0 = fgp.a(this.c.b);
         xd $$1 = xd.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         ffg.this.m.a(ffv.b(ffg.this, $$1, $$0x -> ffg.this.m.a(new ffp(ffg.this.G.g(), new fhf(this.c, ffg.this.M.a, ffg.this.G)))));
      }

      @Override
      public List<? extends flx> aK_() {
         return this.f;
      }

      @Override
      public List<? extends fnv> b() {
         return this.f;
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(ffg.this.p, xd.a("mco.backup.entry", fgp.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(ffg.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
