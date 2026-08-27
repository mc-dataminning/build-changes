import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddx extends cwp {
   public static final MapCodec<ddx> a = b(ddx::new);
   public static final int b = 8;
   public static final dkg c = djw.aF;
   protected static final eml[] d = new eml[]{
      emi.a(),
      cwp.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cwp.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   protected ddx(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      switch ($$3) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public eml b_(djg $$0, csu $$1, hx $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public eml c(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public float d(djg $$0, csu $$1, hx $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      djg $$3 = $$1.a_($$2.d());
      if ($$3.a(asg.cg)) {
         return false;
      } else {
         return $$3.a(asg.ch) ? true : cwp.a($$3.k($$1, $$2.d()), ic.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.a(ctx.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ic.b : true;
      }
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }
}
