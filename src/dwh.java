import com.mojang.serialization.MapCodec;

public class dwh extends doi {
   public static final MapCodec<dwh> g = b(dwh::new);

   @Override
   public MapCodec<dwh> a() {
      return g;
   }

   public dwh(ebf.d $$0) {
      super(() -> dyg.c, $$0);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new ead($$0, $$1);
   }

   @Override
   protected awy<alk> c() {
      return axb.i.b(axb.ai);
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return azq.a(dym.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$3 == jc.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
