import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doe extends dky implements dit {
   public static final MapCodec<doe> c = b(doe::new);
   public static final dwu d = dwl.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final fas h = diq.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final fas i = diq.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final fas j = diq.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final fas k = diq.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final fas[] l = new fas[]{diq.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final fas[] m = new fas[]{j, diq.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<doe> a() {
      return c;
   }

   public doe(dvu.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      return this.m();
   }

   @Override
   public fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return $$0.c(b) == dwq.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dwq.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dis.a.m();
      }
   }

   @Override
   public boolean a(dvv $$0, dfp $$1, jh $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(dis.cC);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$1 instanceof arp $$4 && $$3 instanceof cmd && $$4.N().b(dfi.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dvv $$0, dad $$1) {
      return false;
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bvh $$3, cwm $$4) {
   }

   @Override
   public boolean f(dvv $$0) {
      return $$0.c(b) == dwq.b && !this.q($$0);
   }

   @Override
   public void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      float $$4 = dkl.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arp $$0, dvv $$1, jh $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dvv $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dwq.a), 3);
         }
      }
   }

   private static boolean a(dfp $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dis.kB);
   }

   private static boolean b(dfp $$0, jh $$1) {
      return dkl.a($$0, $$1);
   }

   private static boolean o(dvv $$0) {
      return $$0.a(dis.kB) && $$0.c(b) == dwq.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dfp $$0, jh $$1, dvv $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dvv $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private doe.a d(dfp $$0, jh $$1, dvv $$2) {
      if (o($$2)) {
         return new doe.a($$1, $$2);
      } else {
         jh $$3 = $$1.e();
         dvv $$4 = $$0.a_($$3);
         return o($$4) ? new doe.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      doe.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      doe.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jh a, dvv b) {
   }
}
