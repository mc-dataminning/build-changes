import java.util.List;
import javax.annotation.Nullable;

public class ctb extends cry implements crf {
   public static final int a = 5;
   public static final float b = 3.0F;

   public ctb(cry.a $$0) {
      super($$0);
      dfa.a(this, cps.a);
   }

   @Override
   public String i(csd $$0) {
      cqw $$1 = $$0.a(jz.O);
      return $$1 != null ? this.a() + "." + $$1.b() : super.i($$0);
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      cpy.a($$0, $$2);
   }

   @Override
   public ctw c(csd $$0) {
      return ctw.d;
   }

   @Override
   public int b(csd $$0) {
      return 72000;
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      $$1.c($$2);
      return bor.b($$3);
   }

   @Override
   public boolean a(csd $$0, csd $$1) {
      return $$1.a(avw.b) || super.a($$0, $$1);
   }

   @Override
   public bqs k() {
      return bqs.b;
   }
}
