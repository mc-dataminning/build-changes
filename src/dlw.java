import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlw extends dfh implements dfb, djp {
   public static final MapCodec<dlw> a = b(dlw::new);
   protected static final float b = 6.0F;
   protected static final ewj c = dey.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   protected dlw(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dfa.kJ);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      return $$1.a(awu.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      dsb $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return true;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   protected enu b_(dsb $$0) {
      return env.c.a(false);
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      dsb $$4 = dfa.bx.o();
      dsb $$5 = $$4.a(dne.d, dsx.a);
      iz $$6 = $$2.c();
      if ($$0.a_($$6).a(dfa.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cmw $$0, dbd $$1, iz $$2, dsb $$3, ent $$4) {
      return false;
   }

   @Override
   public boolean a(dby $$0, iz $$1, dsb $$2, enu $$3) {
      return false;
   }
}
