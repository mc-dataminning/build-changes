import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends dkm implements dih {
   public static final MapCodec<dns> c = b(dns::new);
   public static final dwj d = dvz.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fah h = die.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fah i = die.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fah j = die.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fah k = die.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fah[] l = new fah[]{die.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fah[] m = new fah[]{j, die.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dns> a() {
      return c;
   }

   public dns(dvi.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      return this.m();
   }

   @Override
   public fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return $$0.c(b) == dwf.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dwf.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dig.a.m();
      }
   }

   @Override
   public boolean a(dvj $$0, dfe $$1, jh $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(dig.cC);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if ($$3 instanceof clw && $$1.ac().b(dex.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dvj $$0, czs $$1) {
      return false;
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bva $$3, cwb $$4) {
   }

   @Override
   public boolean f(dvj $$0) {
      return $$0.c(b) == dwf.b && !this.q($$0);
   }

   @Override
   public void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      float $$4 = djz.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arn $$0, dvj $$1, jh $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dvj $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dwf.a), 3);
         }
      }
   }

   private static boolean a(dfe $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dig.kB);
   }

   private static boolean b(dfe $$0, jh $$1) {
      return djz.a($$0, $$1);
   }

   private static boolean o(dvj $$0) {
      return $$0.a(dig.kB) && $$0.c(b) == dwf.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dfe $$0, jh $$1, dvj $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dvj $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dns.a d(dfe $$0, jh $$1, dvj $$2) {
      if (o($$2)) {
         return new dns.a($$1, $$2);
      } else {
         jh $$3 = $$1.e();
         dvj $$4 = $$0.a_($$3);
         return o($$4) ? new dns.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      dns.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      dns.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jh a, dvj b) {
   }
}
