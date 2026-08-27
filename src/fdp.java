import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdp extends gxb {
   static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("mco.configure.world.backup");
   static final xe c = xe.c("mco.backup.button.restore");
   static final xe B = xe.c("mco.backup.changes.tooltip");
   private static final xe C = xe.c("mco.backup.nobackups");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fds F;
   List<fby> G = Collections.emptyList();
   @Nullable
   fdp.a H;
   final fma I = new fma(this);
   private final int J;
   @Nullable
   fin K;
   final fcj L;
   boolean M = false;

   public fdp(fds $$0, fcj $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aN_() {
      this.I.a(b, this.p);
      this.H = this.I.c(new fdp.a());
      fme $$0 = this.I.b(fme.e().a(8));
      this.K = $$0.a(fin.a(xe.c("mco.backup.button.download"), $$0x -> this.D()).a());
      this.K.j = false;
      $$0.a(fin.a(xd.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M && this.H != null) {
         $$0.a(this.p, C, this.n / 2 - this.p.a(C) / 2, this.H.D() + this.H.v() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.I.a();
      if (this.H != null) {
         this.H.a(this.n, this.I);
      }
   }

   private void C() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fbs $$0 = fbs.a();

            try {
               List<fby> $$1 = $$0.e(fdp.this.L.a).a;
               fdp.this.m.execute(() -> {
                  fdp.this.G = $$1;
                  fdp.this.M = fdp.this.G.isEmpty();
                  if (!fdp.this.M && fdp.this.K != null) {
                     fdp.this.K.j = true;
                  }

                  if (fdp.this.H != null) {
                     fdp.this.H.aE_().clear();

                     for (fby $$1x : fdp.this.G) {
                        fdp.this.H.a($$1x);
                     }
                  }
               });
            } catch (fdf var3) {
               fdp.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.m.a(this.F);
   }

   private void D() {
      xe $$0 = xe.c("mco.configure.world.restore.download.question.line1");
      xe $$1 = xe.c("mco.configure.world.restore.download.question.line2");
      this.m.a(new fdy($$0x -> {
         if ($$0x) {
            this.m.a(new fdz(this.F.f(), new ffh(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)));
         } else {
            this.m.a(this);
         }
      }, fdy.a.b, $$0, $$1, true));
   }

   class a extends fit<fdp.b> {
      private static final int m = 36;

      public a() {
         super(fgj.Q(), fdp.this.n, fdp.this.I.d(), fdp.this.I.c(), 36);
      }

      public void a(fby $$0) {
         this.b(fdp.this.new b($$0));
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

   class b extends fit.a<fdp.b> {
      private static final int b = 2;
      private final fby c;
      @Nullable
      private fin d;
      @Nullable
      private fin e;
      private final List<fil> f = new ArrayList<>();

      public b(fby $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fin.a(fdp.B, $$0x -> fdp.this.m.a(new fdo(fdp.this, this.c)))
               .a(8 + fdp.this.p.a(fdp.B))
               .a($$0x -> xd.a(xe.a("mco.backup.narration", this.c()), (xe)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fdp.this.L.j) {
            this.d = fin.a(fdp.c, $$0x -> this.d()).a(8 + fdp.this.p.a(fdp.B)).a($$0x -> xd.a(xe.a("mco.backup.narration", this.c()), (xe)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fby $$0) {
         int $$1 = fdp.this.G.indexOf($$0);
         if ($$1 != fdp.this.G.size() - 1) {
            fby $$2 = fdp.this.G.get($$1 + 1);

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
         xe $$0 = fez.a(this.c.b);
         xe $$1 = xe.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         xe $$2 = xe.c("mco.configure.world.restore.question.line2");
         fdp.this.m.a(new fdy($$0x -> {
            if ($$0x) {
               fdp.this.m.a(new fdz(fdp.this.F.f(), new ffp(this.c, fdp.this.L.a, fdp.this.F)));
            } else {
               fdp.this.m.a(fdp.this);
            }
         }, fdy.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends fkj> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fmh> b() {
         return this.f;
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fdp.this.p, xe.a("mco.backup.entry", fez.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fdp.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.x() + 8;
            this.d.m($$3 + $$4 - $$14);
            this.d.n($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.x() + 8;
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
