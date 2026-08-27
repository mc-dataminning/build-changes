import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyv extends grl {
   static final Logger a = LogUtils.getLogger();
   private static final wg b = wg.c("mco.configure.world.backup");
   static final wg c = wg.c("mco.backup.button.restore");
   static final wg y = wg.c("mco.backup.changes.tooltip");
   private static final wg z = wg.c("mco.backup.nobackups");
   private static final String A = "uploaded";
   private static final int B = 8;
   final eyy C;
   List<exe> D = Collections.emptyList();
   @Nullable
   eyv.a E;
   final fhc F = new fhc(this);
   private final int G;
   @Nullable
   fdp H;
   final exp I;
   boolean J = false;

   public eyv(eyy $$0, exp $$1, int $$2) {
      super(b);
      this.C = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aN_() {
      this.F.a(b, this.m);
      this.E = this.F.c(new eyv.a());
      fhg $$0 = this.F.b(fhg.e().a(8));
      this.H = $$0.a(fdp.a(wg.c("mco.backup.button.download"), $$0x -> this.D()).a());
      this.H.j = false;
      $$0.a(fdp.a(wf.k, $$0x -> this.d()).a());
      this.F.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.E != null) {
         $$0.a(this.m, z, this.k / 2 - this.m.a(z) / 2, this.E.D() + this.E.v() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.F.a();
      if (this.E != null) {
         this.E.a(this.k, this.F);
      }
   }

   private void C() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            ewy $$0 = ewy.a();

            try {
               List<exe> $$1 = $$0.e(eyv.this.I.a).a;
               eyv.this.j.execute(() -> {
                  eyv.this.D = $$1;
                  eyv.this.J = eyv.this.D.isEmpty();
                  if (!eyv.this.J && eyv.this.H != null) {
                     eyv.this.H.j = true;
                  }

                  if (eyv.this.E != null) {
                     eyv.this.E.aF_().clear();

                     for (exe $$1x : eyv.this.D) {
                        eyv.this.E.a($$1x);
                     }
                  }
               });
            } catch (eyl var3) {
               eyv.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.j.a(this.C);
   }

   private void D() {
      wg $$0 = wg.c("mco.configure.world.restore.download.question.line1");
      wg $$1 = wg.c("mco.configure.world.restore.download.question.line2");
      this.j.a(new eze($$0x -> {
         if ($$0x) {
            this.j.a(new ezf(this.C.f(), new fan(this.I.a, this.G, this.I.c + " (" + this.I.i.get(this.I.n).a(this.I.n) + ")", this)));
         } else {
            this.j.a(this);
         }
      }, eze.a.b, $$0, $$1, true));
   }

   class a extends fdv<eyv.b> {
      private static final int m = 36;

      public a() {
         super(fbp.Q(), eyv.this.k, eyv.this.F.d(), eyv.this.F.c(), 36);
      }

      public void a(exe $$0) {
         this.b(eyv.this.new b($$0));
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

   class b extends fdv.a<eyv.b> {
      private static final int b = 2;
      private final exe c;
      @Nullable
      private fdp d;
      @Nullable
      private fdp e;
      private final List<fdn> f = new ArrayList<>();

      public b(exe $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fdp.a(eyv.y, $$0x -> eyv.this.j.a(new eyu(eyv.this, this.c)))
               .a(8 + eyv.this.m.a(eyv.y))
               .a($$0x -> wf.a(wg.a("mco.backup.narration", this.c()), (wg)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!eyv.this.I.j) {
            this.d = fdp.a(eyv.c, $$0x -> this.d()).a(8 + eyv.this.m.a(eyv.y)).a($$0x -> wf.a(wg.a("mco.backup.narration", this.c()), (wg)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(exe $$0) {
         int $$1 = eyv.this.D.indexOf($$0);
         if ($$1 != eyv.this.D.size() - 1) {
            exe $$2 = eyv.this.D.get($$1 + 1);

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
         wg $$0 = faf.a(this.c.b);
         wg $$1 = wg.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         wg $$2 = wg.c("mco.configure.world.restore.question.line2");
         eyv.this.j.a(new eze($$0x -> {
            if ($$0x) {
               eyv.this.j.a(new ezf(eyv.this.C.f(), new fav(this.c, eyv.this.I.a, eyv.this.C)));
            } else {
               eyv.this.j.a(eyv.this);
            }
         }, eze.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends ffl> aF_() {
         return this.f;
      }

      @Override
      public List<? extends fhj> b() {
         return this.f;
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(eyv.this.m, wg.a("mco.backup.entry", faf.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(eyv.this.m, this.a(this.c.b), $$3, $$12, 5000268, false);
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
