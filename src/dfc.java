import com.mojang.serialization.MapCodec;

public class dfc extends cxs {
   public static final MapCodec<dfc> n = b(dfc::new);

   @Override
   public MapCodec<dfc> a() {
      return n;
   }

   public dfc(djf.d $$0) {
      super($$0, () -> dgw.c);
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dim($$0, $$1);
   }

   @Override
   protected ary<ahg> c() {
      return asb.i.b(asb.ai);
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return aun.a(dhb.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$3 == ic.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
