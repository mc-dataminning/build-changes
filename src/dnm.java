import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnm extends dkg implements dib {
   public static final MapCodec<dnm> c = b(dnm::new);
   public static final dwd d = dvt.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fab h = dhy.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fab i = dhy.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fab j = dhy.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fab k = dhy.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fab[] l = new fab[]{dhy.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fab[] m = new fab[]{j, dhy.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dnm> a() {
      return c;
   }

   public dnm(dvc.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      return this.m();
   }

   @Override
   public fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return $$0.c(b) == dvz.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dvz.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dia.a.m();
      }
   }

   @Override
   public boolean a(dvd $$0, dey $$1, jg $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(dia.cC);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if ($$3 instanceof clr && $$1.ac().b(der.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dvd $$0, czm $$1) {
      return false;
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
   }

   @Override
   public boolean f(dvd $$0) {
      return $$0.c(b) == dvz.b && !this.q($$0);
   }

   @Override
   public void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      float $$4 = djt.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arm $$0, dvd $$1, jg $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dvd $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dvz.a), 3);
         }
      }
   }

   private static boolean a(dey $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dia.kB);
   }

   private static boolean b(dey $$0, jg $$1) {
      return djt.a($$0, $$1);
   }

   private static boolean o(dvd $$0) {
      return $$0.a(dia.kB) && $$0.c(b) == dvz.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dey $$0, jg $$1, dvd $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dvd $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dnm.a d(dey $$0, jg $$1, dvd $$2) {
      if (o($$2)) {
         return new dnm.a($$1, $$2);
      } else {
         jg $$3 = $$1.e();
         dvd $$4 = $$0.a_($$3);
         return o($$4) ? new dnm.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      dnm.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      dnm.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jg a, dvd b) {
   }
}
