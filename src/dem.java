import com.mojang.serialization.MapCodec;

public class dem extends cxc {
   public static final MapCodec<dem> n = b(dem::new);

   @Override
   public MapCodec<dem> a() {
      return n;
   }

   public dem(dio.d $$0) {
      super($$0, () -> dgf.c);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhv($$0, $$1);
   }

   @Override
   protected arj<agt> c() {
      return arm.i.b(arm.ai);
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return aty.a(dgk.a($$1, $$2), 0, 15);
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$3 == ia.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
