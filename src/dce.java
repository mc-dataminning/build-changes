import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dce extends cyy implements cwt {
   public static final MapCodec<dce> c = b(dce::new);
   public static final dkh d = djx.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final emm h = cwq.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final emm i = cwq.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final emm j = cwq.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final emm k = cwq.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final emm[] l = new emm[]{cwq.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final emm[] m = new emm[]{j, cwq.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dce> a() {
      return c;
   }

   public dce(djg.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      return this.o();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return $$0.c(b) == dkd.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dkd.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cws.a.o();
      }
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(cws.cC);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if ($$3 instanceof ccu && $$1.Z().b(ctl.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      return false;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
   }

   @Override
   public boolean e_(djh $$0) {
      return $$0.c(b) == dkd.b && !this.n($$0);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      float $$4 = cyl.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(and $$0, djh $$1, hx $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         djh $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dkd.a), 3);
         }
      }
   }

   private static boolean a(cts $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cws.kB);
   }

   private static boolean b(cts $$0, hx $$1) {
      return cyl.a($$0, $$1);
   }

   private static boolean h(djh $$0) {
      return $$0.a(cws.kB) && $$0.c(b) == dkd.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cts $$0, hx $$1, djh $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(djh $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dce.a d(cts $$0, hx $$1, djh $$2) {
      if (h($$2)) {
         return new dce.a($$1, $$2);
      } else {
         hx $$3 = $$1.d();
         djh $$4 = $$0.a_($$3);
         return h($$4) ? new dce.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      dce.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      dce.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(hx a, djh b) {
   }
}
