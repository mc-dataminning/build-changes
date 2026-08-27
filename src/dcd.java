import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcd extends cyx implements cws {
   public static final MapCodec<dcd> c = b(dcd::new);
   public static final dkg d = djw.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eml h = cwp.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eml i = cwp.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eml j = cwp.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eml k = cwp.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eml[] l = new eml[]{cwp.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eml[] m = new eml[]{j, cwp.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dcd> a() {
      return c;
   }

   public dcd(djf.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      return this.o();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return $$0.c(b) == dkc.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dkc.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cwr.a.o();
      }
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(cwr.cC);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if ($$3 instanceof cct && $$1.Z().b(ctk.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      return false;
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.c(b) == dkc.b && !this.n($$0);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      float $$4 = cyk.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(and $$0, djg $$1, hx $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         djg $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dkc.a), 3);
         }
      }
   }

   private static boolean a(ctr $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cwr.kB);
   }

   private static boolean b(ctr $$0, hx $$1) {
      return cyk.a($$0, $$1);
   }

   private static boolean h(djg $$0) {
      return $$0.a(cwr.kB) && $$0.c(b) == dkc.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(ctr $$0, hx $$1, djg $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(djg $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dcd.a d(ctr $$0, hx $$1, djg $$2) {
      if (h($$2)) {
         return new dcd.a($$1, $$2);
      } else {
         hx $$3 = $$1.d();
         djg $$4 = $$0.a_($$3);
         return h($$4) ? new dcd.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      dcd.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      dcd.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(hx a, djg b) {
   }
}
