import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcm extends czg implements cxb {
   public static final MapCodec<dcm> c = b(dcm::new);
   public static final dkp d = dkf.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final emv h = cwy.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final emv i = cwy.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final emv j = cwy.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final emv k = cwy.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final emv[] l = new emv[]{cwy.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final emv[] m = new emv[]{j, cwy.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dcm> a() {
      return c;
   }

   public dcm(djo.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      return this.o();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return $$0.c(b) == dkl.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dkl.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cxa.a.o();
      }
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(cxa.cC);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if ($$3 instanceof cdb && $$1.Z().b(ctt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      return false;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
   }

   @Override
   public boolean e_(djp $$0) {
      return $$0.c(b) == dkl.b && !this.n($$0);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      float $$4 = cyt.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ane $$0, djp $$1, hx $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         djp $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dkl.a), 3);
         }
      }
   }

   private static boolean a(cua $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cxa.kB);
   }

   private static boolean b(cua $$0, hx $$1) {
      return cyt.a($$0, $$1);
   }

   private static boolean h(djp $$0) {
      return $$0.a(cxa.kB) && $$0.c(b) == dkl.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cua $$0, hx $$1, djp $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(djp $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dcm.a d(cua $$0, hx $$1, djp $$2) {
      if (h($$2)) {
         return new dcm.a($$1, $$2);
      } else {
         hx $$3 = $$1.d();
         djp $$4 = $$0.a_($$3);
         return h($$4) ? new dcm.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      dcm.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      dcm.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(hx a, djp b) {
   }
}
