import com.mojang.serialization.MapCodec;

public class def extends cvo {
   public static final MapCodec<def> a = b(def::new);
   protected static final eks b = cvf.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<def> a() {
      return a;
   }

   protected def(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ami && $$3 instanceof cfs) {
         $$1.a(new hx($$2), true, $$3);
      }
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      ecx $$3 = $$1.b_($$2);
      ecx $$4 = $$1.b_($$2.c());
      return ($$3.a() == ecy.c || $$0.b() instanceof czc) && $$4.a() == ecy.a;
   }
}
