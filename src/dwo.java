import com.mojang.serialization.MapCodec;

public class dwo extends dpl {
   public static final MapCodec<dwo> a = b(dwo::new);
   public static final int b = 1;
   public static final ecq c = ecg.at;
   private static final fgw[] g = dno.a(1, $$0 -> dno.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dwo> a() {
      return a;
   }

   public dwo(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }

   @Override
   public fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected ecq b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dki d() {
      return dao.wt;
   }

   @Override
   public ebq b(int $$0) {
      return $$0 == 2 ? dnq.cc.m() : super.b($$0);
   }

   @Override
   public void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dkj $$0) {
      return 1;
   }
}
