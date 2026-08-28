import com.mojang.serialization.MapCodec;

public class dwf extends dog {
   public static final MapCodec<dwf> g = b(dwf::new);

   @Override
   public MapCodec<dwf> a() {
      return g;
   }

   public dwf(ebd.d $$0) {
      super(() -> dye.c, $$0);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new eab($$0, $$1);
   }

   @Override
   protected aww<ali> c() {
      return awz.i.b(awz.ai);
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return azo.a(dyk.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$3 == jb.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
