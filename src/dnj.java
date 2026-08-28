import com.mojang.serialization.MapCodec;

public class dnj extends dpl {
   public static final MapCodec<dnj> a = b(dnj::new);
   public static final int b = 3;
   public static final ecq c = ecg.av;
   private static final fgw[] g = dno.a(3, $$0 -> dno.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected ecq b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dki d() {
      return dao.ww;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dkj $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return g[this.h($$0)];
   }
}
