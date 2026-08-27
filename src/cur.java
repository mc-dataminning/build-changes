import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cur extends cyo implements cuw, dbt {
   public static final MapCodec<cur> a = b(cur::new);
   private static final dhn f = dhm.C;
   private static final int g = 6;
   protected static final ekb b = cut.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final ekb c = cut.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final ekb d = cut.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final ekb e = cut.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cur> a() {
      return a;
   }

   protected cur(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, hx.c));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      switch ((hx)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(f) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgw $$4 = $$1.a_($$3);
      dgw $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(arc.bx)) && ($$5.a(this) || $$5.a(cuv.rC));
   }

   protected static boolean a(crt $$0, ht $$1, ecg $$2, hx $$3) {
      dgw $$4 = cuv.rD.o().a(f, Boolean.valueOf($$2.a(ech.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (($$1 == hx.a || $$1 == hx.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      Optional<ht> $$3 = l.a($$0, $$1, $$2.b(), hx.b, cuv.rC);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ht $$4 = $$3.get().c();
         dgw $$5 = $$0.a_($$4);
         return cuq.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      Optional<ht> $$4 = l.a($$0, $$2, $$3.b(), hx.b, cuv.rC);
      if (!$$4.isEmpty()) {
         ht $$5 = $$4.get();
         ht $$6 = $$5.c();
         hx $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         cuq.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(cuv.rC);
   }
}
