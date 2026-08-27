import com.mojang.serialization.MapCodec;

public class dbp extends dbr {
   public static final MapCodec<dbp> a = b(dbp::new);
   private static final etc b = dch.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dbp> a() {
      return a;
   }

   protected dbp(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }
}
