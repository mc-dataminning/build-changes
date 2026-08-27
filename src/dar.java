import com.mojang.serialization.MapCodec;

public class dar extends daa {
   public static final MapCodec<dar> a = b(dar::new);
   protected static final eqk b = daa.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dar> a() {
      return a;
   }

   public dar(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return !$$1.u($$2.d());
   }
}
