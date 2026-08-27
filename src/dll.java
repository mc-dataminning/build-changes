import com.mojang.serialization.MapCodec;

public class dll extends ddn {
   public static final MapCodec<dll> c = b(dll::new);

   @Override
   public MapCodec<dll> a() {
      return c;
   }

   public dll(drc.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : dec.a.n();
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(drd $$0) {
      return $$0.a(avx.aT);
   }

   @Override
   protected boolean f(drd $$0) {
      return true;
   }
}
