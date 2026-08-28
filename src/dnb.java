import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnb extends dju implements dhp {
   public static final MapCodec<dnb> c = b(dnb::new);
   public static final dvs d = dvi.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ezq h = dhm.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ezq i = dhm.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ezq j = dhm.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ezq k = dhm.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ezq[] l = new ezq[]{dhm.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ezq[] m = new ezq[]{j, dhm.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dnb> a() {
      return c;
   }

   public dnb(dur.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      return this.n();
   }

   @Override
   public ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return $$0.c(b) == dvo.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dvo.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dho.a.n();
      }
   }

   @Override
   public boolean a(dus $$0, dem $$1, jf $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(dho.cC);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if ($$3 instanceof cli && $$1.ac().b(def.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dus $$0, czn $$1) {
      return false;
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
   }

   @Override
   public boolean f(dus $$0) {
      return $$0.c(b) == dvo.b && !this.q($$0);
   }

   @Override
   public void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      float $$4 = djh.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arj $$0, dus $$1, jf $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dus $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, dvo.a), 3);
         }
      }
   }

   private static boolean a(dem $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dho.kB);
   }

   private static boolean b(dem $$0, jf $$1) {
      return djh.a($$0, $$1);
   }

   private static boolean o(dus $$0) {
      return $$0.a(dho.kB) && $$0.c(b) == dvo.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dem $$0, jf $$1, dus $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dus $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dnb.a d(dem $$0, jf $$1, dus $$2) {
      if (o($$2)) {
         return new dnb.a($$1, $$2);
      } else {
         jf $$3 = $$1.e();
         dus $$4 = $$0.a_($$3);
         return o($$4) ? new dnb.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      dnb.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      dnb.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jf a, dus b) {
   }
}
