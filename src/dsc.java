import com.mojang.serialization.MapCodec;

public class dsc extends drf {
   public static final MapCodec<dsc> a = b(dsc::new);
   private static final xc b = xc.c("container.loom");

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   protected dsc(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axb.ax);
      }

      return but.a;
   }

   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return new bvb(($$2x, $$3, $$4) -> new cwz($$2x, $$3, cwf.a($$1, $$2)), b);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e);
   }
}
