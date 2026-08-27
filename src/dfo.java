import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfo extends dci implements dad {
   public static final MapCodec<dfo> c = b(dfo::new);
   public static final dnz d = dnp.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eqk h = daa.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eqk i = daa.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eqk j = daa.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eqk k = daa.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eqk[] l = new eqk[]{daa.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eqk[] m = new eqk[]{j, daa.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dfo> a() {
      return c;
   }

   public dfo(dmy.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      return this.o();
   }

   @Override
   public eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return $$0.c(b) == dnv.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dnv.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dac.a.o();
      }
   }

   @Override
   public boolean a(dmz $$0, cxc $$1, ib $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(dac.cC);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if ($$3 instanceof cgd && $$1.Z().b(cwv.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dmz $$0, css $$1) {
      return false;
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
   }

   @Override
   public boolean e_(dmz $$0) {
      return $$0.c(b) == dnv.b && !this.n($$0);
   }

   @Override
   public void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      float $$4 = dbv.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(apf $$0, dmz $$1, ib $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dmz $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dnv.a), 3);
         }
      }
   }

   private static boolean a(cxc $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dac.kB);
   }

   private static boolean b(cxc $$0, ib $$1) {
      return dbv.a($$0, $$1);
   }

   private static boolean m(dmz $$0) {
      return $$0.a(dac.kB) && $$0.c(b) == dnv.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cxc $$0, ib $$1, dmz $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dmz $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dfo.a d(cxc $$0, ib $$1, dmz $$2) {
      if (m($$2)) {
         return new dfo.a($$1, $$2);
      } else {
         ib $$3 = $$1.d();
         dmz $$4 = $$0.a_($$3);
         return m($$4) ? new dfo.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      dfo.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      dfo.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ib a, dmz b) {
   }
}
