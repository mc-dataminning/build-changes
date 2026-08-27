import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcb extends cut {
   public static final MapCodec<dcb> a = b(dcb::new);
   public static final int b = 8;
   public static final dhw c = dhm.aF;
   protected static final ekb[] d = new ekb[]{
      ejy.a(),
      cut.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   protected dcb(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
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
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   public ekb b_(dgw $$0, cqy $$1, ht $$2) {
      return d[$$0.c(c)];
   }

   @Override
   public ekb b(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return d[$$0.c(c)];
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public float b(dgw $$0, cqy $$1, ht $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2.d());
      if ($$3.a(arc.cg)) {
         return false;
      } else {
         return $$3.a(arc.ch) ? true : cut.a($$3.k($$1, $$2.d()), hx.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.a(csb.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.k()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == hx.b : true;
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }
}
