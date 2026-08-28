import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dro extends diz {
   public static final MapCodec<dro> c = b(dro::new);

   @Override
   public MapCodec<dro> a() {
      return c;
   }

   protected dro(dxm.d $$0) {
      super($$0);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$0, $$2, dur.C);
   }

   @Override
   protected void a(dha $$0, jh $$1, cps $$2) {
      dup $$3 = $$0.c_($$1);
      if ($$3 instanceof dwf) {
         $$2.a((btg)$$3);
         $$2.a(axp.at);
      }
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, axf.yI, axg.e, 1.0F, 1.0F, false);
         }

         $$1.a(ls.af, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
