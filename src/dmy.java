import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmy extends djr implements dhm {
   public static final MapCodec<dmy> c = b(dmy::new);
   public static final dvo d = dve.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ezm h = dhj.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ezm i = dhj.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ezm j = dhj.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ezm k = dhj.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ezm[] l = new ezm[]{dhj.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ezm[] m = new ezm[]{j, dhj.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dmy> a() {
      return c;
   }

   public dmy(dun.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      return this.o();
   }

   @Override
   public ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return $$0.c(b) == dvk.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dvk.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dhl.a.o();
      }
   }

   @Override
   public boolean a(duo $$0, dej $$1, je $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(dhl.cC);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if ($$3 instanceof clf && $$1.ac().b(dec.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(duo $$0, czk $$1) {
      return false;
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
   }

   @Override
   public boolean f(duo $$0) {
      return $$0.c(b) == dvk.b && !this.q($$0);
   }

   @Override
   public void b(duo $$0, arh $$1, je $$2, azl $$3) {
      float $$4 = dje.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arh $$0, duo $$1, je $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         duo $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dvk.a), 3);
         }
      }
   }

   private static boolean a(dej $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dhl.kB);
   }

   private static boolean b(dej $$0, je $$1) {
      return dje.a($$0, $$1);
   }

   private static boolean o(duo $$0) {
      return $$0.a(dhl.kB) && $$0.c(b) == dvk.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dej $$0, je $$1, duo $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(duo $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dmy.a d(dej $$0, je $$1, duo $$2) {
      if (o($$2)) {
         return new dmy.a($$1, $$2);
      } else {
         je $$3 = $$1.e();
         duo $$4 = $$0.a_($$3);
         return o($$4) ? new dmy.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      dmy.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      dmy.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(je a, duo b) {
   }
}
