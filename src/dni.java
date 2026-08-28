import com.mojang.serialization.MapCodec;

public class dni extends dfx {
   public static final MapCodec<dni> n = b(dni::new);

   @Override
   public MapCodec<dni> a() {
      return n;
   }

   public dni(drw.d $$0) {
      super($$0, () -> dpe.c);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqv($$0, $$1);
   }

   @Override
   protected awd<alb> c() {
      return awg.i.b(awg.ai);
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return ayu.a(dpj.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
