import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcn extends gvi {
   static final Logger a = LogUtils.getLogger();
   private static final xp b = xp.c("mco.configure.world.backup");
   static final xp c = xp.c("mco.backup.button.restore");
   static final xp B = xp.c("mco.backup.changes.tooltip");
   private static final xp C = xp.c("mco.backup.nobackups");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fcq F;
   List<faw> G = Collections.emptyList();
   @Nullable
   fcn.a H;
   final fkt I = new fkt(this);
   private final int J;
   @Nullable
   fhg K;
   final fbh L;
   boolean M = false;

   public fcn(fcq $$0, fbh $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.I.a(b, this.p);
      this.H = this.I.c(new fcn.a());
      fkx $$0 = this.I.b(fkx.e().a(8));
      this.K = $$0.a(fhg.a(xp.c("mco.backup.button.download"), $$0x -> this.F()).a());
      this.K.j = false;
      $$0.a(fhg.a(xo.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fhe var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
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

   private void E() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            faq $$0 = faq.a();

            try {
               List<faw> $$1 = $$0.e(fcn.this.L.a).a;
               fcn.this.m.execute(() -> {
                  fcn.this.G = $$1;
                  fcn.this.M = fcn.this.G.isEmpty();
                  if (!fcn.this.M && fcn.this.K != null) {
                     fcn.this.K.j = true;
                  }

                  if (fcn.this.H != null) {
                     fcn.this.H.aD_().clear();

                     for (faw $$1x : fcn.this.G) {
                        fcn.this.H.a($$1x);
                     }
                  }
               });
            } catch (fcd var3) {
               fcn.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.m.a(this.F);
   }

   private void F() {
      xp $$0 = xp.c("mco.configure.world.restore.download.question.line1");
      xp $$1 = xp.c("mco.configure.world.restore.download.question.line2");
      this.m.a(new fcw($$0x -> {
         if ($$0x) {
            this.m.a(new fcx(this.F.f(), new fef(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)));
         } else {
            this.m.a(this);
         }
      }, fcw.a.b, $$0, $$1, true));
   }

   class a extends fhm<fcn.b> {
      private static final int m = 36;

      public a() {
         super(ffh.Q(), fcn.this.n, fcn.this.I.d(), fcn.this.I.c(), 36);
      }

      public void a(faw $$0) {
         this.b(fcn.this.new b($$0));
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

   class b extends fhm.a<fcn.b> {
      private static final int b = 2;
      private final faw c;
      @Nullable
      private fhg d;
      @Nullable
      private fhg e;
      private final List<fhe> f = new ArrayList<>();

      public b(final faw $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fhg.a(fcn.B, $$0x -> fcn.this.m.a(new fcm(fcn.this, this.c)))
               .a(8 + fcn.this.p.a(fcn.B))
               .a($$0x -> xo.a(xp.a("mco.backup.narration", this.c()), (xp)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fcn.this.L.j) {
            this.d = fhg.a(fcn.c, $$0x -> this.d()).a(8 + fcn.this.p.a(fcn.B)).a($$0x -> xo.a(xp.a("mco.backup.narration", this.c()), (xp)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(faw $$0) {
         int $$1 = fcn.this.G.indexOf($$0);
         if ($$1 != fcn.this.G.size() - 1) {
            faw $$2 = fcn.this.G.get($$1 + 1);

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
         xp $$0 = fdx.a(this.c.b);
         xp $$1 = xp.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         xp $$2 = xp.c("mco.configure.world.restore.question.line2");
         fcn.this.m.a(new fcw($$0x -> {
            if ($$0x) {
               fcn.this.m.a(new fcx(fcn.this.F.f(), new fen(this.c, fcn.this.L.a, fcn.this.F)));
            } else {
               fcn.this.m.a(fcn.this);
            }
         }, fcw.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends fjc> aD_() {
         return this.f;
      }

      @Override
      public List<? extends fla> b() {
         return this.f;
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fcn.this.p, xp.a("mco.backup.entry", fdx.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fcn.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
