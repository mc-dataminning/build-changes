import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcl extends gvg {
   static final Logger a = LogUtils.getLogger();
   private static final xp b = xp.c("mco.configure.world.backup");
   static final xp c = xp.c("mco.backup.button.restore");
   static final xp B = xp.c("mco.backup.changes.tooltip");
   private static final xp C = xp.c("mco.backup.nobackups");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fco F;
   List<fau> G = Collections.emptyList();
   @Nullable
   fcl.a H;
   final fkr I = new fkr(this);
   private final int J;
   @Nullable
   fhe K;
   final fbf L;
   boolean M = false;

   public fcl(fco $$0, fbf $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.I.a(b, this.p);
      this.H = this.I.c(new fcl.a());
      fkv $$0 = this.I.b(fkv.e().a(8));
      this.K = $$0.a(fhe.a(xp.c("mco.backup.button.download"), $$0x -> this.F()).a());
      this.K.j = false;
      $$0.a(fhe.a(xo.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fhc var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
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
            fao $$0 = fao.a();

            try {
               List<fau> $$1 = $$0.e(fcl.this.L.a).a;
               fcl.this.m.execute(() -> {
                  fcl.this.G = $$1;
                  fcl.this.M = fcl.this.G.isEmpty();
                  if (!fcl.this.M && fcl.this.K != null) {
                     fcl.this.K.j = true;
                  }

                  if (fcl.this.H != null) {
                     fcl.this.H.aD_().clear();

                     for (fau $$1x : fcl.this.G) {
                        fcl.this.H.a($$1x);
                     }
                  }
               });
            } catch (fcb var3) {
               fcl.a.error("Couldn't request backups", var3);
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
      this.m.a(new fcu($$0x -> {
         if ($$0x) {
            this.m.a(new fcv(this.F.f(), new fed(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)));
         } else {
            this.m.a(this);
         }
      }, fcu.a.b, $$0, $$1, true));
   }

   class a extends fhk<fcl.b> {
      private static final int m = 36;

      public a() {
         super(fff.Q(), fcl.this.n, fcl.this.I.d(), fcl.this.I.c(), 36);
      }

      public void a(fau $$0) {
         this.b(fcl.this.new b($$0));
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

   class b extends fhk.a<fcl.b> {
      private static final int b = 2;
      private final fau c;
      @Nullable
      private fhe d;
      @Nullable
      private fhe e;
      private final List<fhc> f = new ArrayList<>();

      public b(final fau $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fhe.a(fcl.B, $$0x -> fcl.this.m.a(new fck(fcl.this, this.c)))
               .a(8 + fcl.this.p.a(fcl.B))
               .a($$0x -> xo.a(xp.a("mco.backup.narration", this.c()), (xp)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fcl.this.L.j) {
            this.d = fhe.a(fcl.c, $$0x -> this.d()).a(8 + fcl.this.p.a(fcl.B)).a($$0x -> xo.a(xp.a("mco.backup.narration", this.c()), (xp)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fau $$0) {
         int $$1 = fcl.this.G.indexOf($$0);
         if ($$1 != fcl.this.G.size() - 1) {
            fau $$2 = fcl.this.G.get($$1 + 1);

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
         xp $$0 = fdv.a(this.c.b);
         xp $$1 = xp.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         xp $$2 = xp.c("mco.configure.world.restore.question.line2");
         fcl.this.m.a(new fcu($$0x -> {
            if ($$0x) {
               fcl.this.m.a(new fcv(fcl.this.F.f(), new fel(this.c, fcl.this.L.a, fcl.this.F)));
            } else {
               fcl.this.m.a(fcl.this);
            }
         }, fcu.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends fja> aD_() {
         return this.f;
      }

      @Override
      public List<? extends fky> b() {
         return this.f;
      }

      @Override
      public void a(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fcl.this.p, xp.a("mco.backup.entry", fdv.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fcl.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
