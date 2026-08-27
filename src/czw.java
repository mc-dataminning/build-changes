import com.mojang.serialization.MapCodec;

public class czw extends cza {
   public static final MapCodec<czw> a = b(czw::new);
   private static final uv b = uv.c("container.loom");

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   protected czw(dhm.d $$0) {
      super($$0);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arf.ax);
         return bjb.b;
      }
   }

   @Override
   public bje b(dhn $$0, csf $$1, hx $$2) {
      return new bjk(($$2x, $$3, $$4) -> new chw($$2x, $$3, chc.a($$1, $$2)), b);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(aE);
   }
}
