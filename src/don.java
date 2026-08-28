import com.mojang.serialization.MapCodec;

public class don extends dhb {
   public static final MapCodec<don> n = b(don::new);

   @Override
   public MapCodec<don> a() {
      return n;
   }

   public don(dtb.d $$0) {
      super($$0, () -> dqj.c);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dsb($$0, $$1);
   }

   @Override
   protected avw<akr> c() {
      return avz.i.b(avz.ai);
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return ayo.a(dqo.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$3 == ji.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
