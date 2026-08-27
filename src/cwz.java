import com.mojang.serialization.MapCodec;

public class cwz extends cvf {
   public static final MapCodec<cwz> a = b(cwz::new);
   private static final uv b = uv.c("container.crafting");

   @Override
   public MapCodec<? extends cwz> a() {
      return a;
   }

   protected cwz(dhm.d $$0) {
      super($$0);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arf.an);
         return bjb.b;
      }
   }

   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return new bjk(($$2x, $$3, $$4) -> new chi($$2x, $$3, chc.a($$1, $$2)), b);
   }
}
