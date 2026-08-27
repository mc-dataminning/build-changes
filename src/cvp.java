import java.util.List;
import javax.annotation.Nullable;

public class cvp extends cuc implements cth {
   public static final int a = 5;
   public static final float b = 3.0F;

   public cvp(cuc.a $$0) {
      super($$0);
      dhi.a(this, crt.a);
   }

   @Override
   public String i(cuh $$0) {
      csy $$1 = $$0.a(ke.X);
      return $$1 != null ? this.a() + "." + $$1.b() : super.i($$0);
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      crz.a($$0, $$2);
   }

   @Override
   public cwk c(cuh $$0) {
      return cwk.d;
   }

   @Override
   public int b(cuh $$0) {
      return 72000;
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      $$1.c($$2);
      return bqb.b($$3);
   }

   @Override
   public boolean a(cuh $$0, cuh $$1) {
      return $$1.a(awm.b) || super.a($$0, $$1);
   }

   @Override
   public bsc k() {
      return bsc.b;
   }
}
