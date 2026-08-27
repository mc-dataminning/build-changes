import com.mojang.serialization.MapCodec;

public class dhb extends czr {
   public static final MapCodec<dhb> n = b(dhb::new);

   @Override
   public MapCodec<dhb> a() {
      return n;
   }

   public dhb(dle.d $$0) {
      super($$0, () -> div.c);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dkl($$0, $$1);
   }

   @Override
   protected atr<aiy> c() {
      return atu.i.b(atu.ai);
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return awh.a(dja.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$3 == ie.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
