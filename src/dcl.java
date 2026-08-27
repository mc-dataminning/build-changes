import com.mojang.serialization.MapCodec;

public class dcl extends cvd {
   public static final MapCodec<dcl> n = b(dcl::new);

   @Override
   public MapCodec<dcl> a() {
      return n;
   }

   public dcl(dga.d $$0) {
      super($$0, () -> ddz.c);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfo($$0, $$1);
   }

   @Override
   protected aqk<afw> c() {
      return aqn.i.b(aqn.ai);
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return asy.a(dee.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$3 == hx.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
