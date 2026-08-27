import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfq extends dck implements daf {
   public static final MapCodec<dfq> c = b(dfq::new);
   public static final dob d = dnr.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eqm h = dac.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eqm i = dac.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eqm j = dac.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eqm k = dac.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eqm[] l = new eqm[]{dac.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eqm[] m = new eqm[]{j, dac.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dfq> a() {
      return c;
   }

   public dfq(dna.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      return this.o();
   }

   @Override
   public eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return $$0.c(b) == dnx.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dnx.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dae.a.o();
      }
   }

   @Override
   public boolean a(dnb $$0, cxe $$1, ib $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(dae.cC);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if ($$3 instanceof cgf && $$1.Z().b(cwx.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dnb $$0, csu $$1) {
      return false;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
   }

   @Override
   public boolean e_(dnb $$0) {
      return $$0.c(b) == dnx.b && !this.n($$0);
   }

   @Override
   public void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      float $$4 = dbx.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(apf $$0, dnb $$1, ib $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dnb $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dnx.a), 3);
         }
      }
   }

   private static boolean a(cxe $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dae.kB);
   }

   private static boolean b(cxe $$0, ib $$1) {
      return dbx.a($$0, $$1);
   }

   private static boolean m(dnb $$0) {
      return $$0.a(dae.kB) && $$0.c(b) == dnx.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cxe $$0, ib $$1, dnb $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dnb $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dfq.a d(cxe $$0, ib $$1, dnb $$2) {
      if (m($$2)) {
         return new dfq.a($$1, $$2);
      } else {
         ib $$3 = $$1.d();
         dnb $$4 = $$0.a_($$3);
         return m($$4) ? new dfq.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      dfq.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      dfq.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ib a, dnb b) {
   }
}
