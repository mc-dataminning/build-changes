import com.mojang.serialization.MapCodec;

public class dck extends cwz {
   public static final MapCodec<dck> b = b(dck::new);
   private static final uv c = uv.c("container.upgrade");

   @Override
   public MapCodec<dck> a() {
      return b;
   }

   protected dck(dhm.d $$0) {
      super($$0);
   }

   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return new bjk(($$2x, $$3, $$4) -> new cin($$2x, $$3, chc.a($$1, $$2)), c);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arf.aF);
         return bjb.b;
      }
   }
}
