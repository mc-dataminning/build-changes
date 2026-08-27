import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbq extends cvc implements cuw, czj {
   public static final MapCodec<dbq> a = b(dbq::new);
   protected static final float b = 6.0F;
   protected static final ekb c = cut.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   protected dbq(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.d($$1, $$2, hx.b) && !$$0.a(cuv.kJ);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      return $$1.a(arh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      dgw $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return true;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public ecg c_(dgw $$0) {
      return ech.c.a(false);
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      dgw $$4 = cuv.bx.o();
      dgw $$5 = $$4.a(dcy.d, dhs.a);
      ht $$6 = $$2.c();
      if ($$0.a_($$6).a(cuv.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cdm $$0, cqy $$1, ht $$2, dgw $$3, ecf $$4) {
      return false;
   }

   @Override
   public boolean a(crt $$0, ht $$1, dgw $$2, ecg $$3) {
      return false;
   }
}
