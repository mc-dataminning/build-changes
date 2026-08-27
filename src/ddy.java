import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddy extends cwq {
   public static final MapCodec<ddy> a = b(ddy::new);
   public static final int b = 8;
   public static final dkh c = djx.aF;
   protected static final emm[] d = new emm[]{
      emj.a(),
      cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   protected ddy(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
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
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public emm b_(djh $$0, csv $$1, hx $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public emm c(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public float d(djh $$0, csv $$1, hx $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      djh $$3 = $$1.a_($$2.d());
      if ($$3.a(ash.cg)) {
         return false;
      } else {
         return $$3.a(ash.ch) ? true : cwq.a($$3.k($$1, $$2.d()), ic.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$1.a(cty.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ic.b : true;
      }
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c);
   }
}
