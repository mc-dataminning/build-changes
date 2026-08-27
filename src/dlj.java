import com.mojang.serialization.MapCodec;

public class dlj extends dcq {
   public static final MapCodec<dlj> a = b(dlj::new);
   protected static final etc b = dch.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   protected dlj(dph.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof apu && $$3 instanceof clx) {
         $$1.a(new id($$2), true, $$3);
      }
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      elb $$3 = $$1.b_($$2);
      elb $$4 = $$1.b_($$2.c());
      return ($$3.a() == elc.c || $$0.b() instanceof dge) && $$4.a() == elc.a;
   }
}
