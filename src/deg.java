import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deg extends cwy {
   public static final MapCodec<deg> a = b(deg::new);
   public static final int b = 8;
   public static final dkp c = dkf.aF;
   protected static final emv[] d = new emv[]{
      ems.a(),
      cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   protected deg(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
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
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public emv c(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public float d(djp $$0, ctd $$1, hx $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      djp $$3 = $$1.a_($$2.d());
      if ($$3.a(asi.cg)) {
         return false;
      } else {
         return $$3.a(asi.ch) ? true : cwy.a($$3.k($$1, $$2.d()), ic.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.a(cug.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ic.b : true;
      }
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }
}
