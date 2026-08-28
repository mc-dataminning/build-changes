import com.mojang.serialization.MapCodec;

public class drp extends dqs {
   public static final MapCodec<drp> a = b(drp::new);
   private static final wy b = wy.c("container.loom");

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   protected drp(eas.d $$0) {
      super($$0);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.ax);
      }

      return bug.a;
   }

   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cwm($$2x, $$3, cvs.a($$1, $$2)), b);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e);
   }
}
