import com.mojang.serialization.MapCodec;

public class duh extends dom {
   public static final MapCodec<duh> b = b(duh::new);
   private static final wy c = wy.c("container.upgrade");

   @Override
   public MapCodec<duh> a() {
      return b;
   }

   protected duh(eas.d $$0) {
      super($$0);
   }

   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cxf($$2x, $$3, cvs.a($$1, $$2)), c);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aF);
      }

      return bug.a;
   }
}
