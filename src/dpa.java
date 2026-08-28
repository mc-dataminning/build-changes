import com.mojang.serialization.MapCodec;

public class dpa extends dod {
   public static final MapCodec<dpa> a = b(dpa::new);
   private static final wp b = wp.c("container.loom");

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   protected dpa(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.ax);
      }

      return bsy.a;
   }

   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return new btg(($$2x, $$3, $$4) -> new cud($$2x, $$3, ctj.a($$1, $$2)), b);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e);
   }
}
