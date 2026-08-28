import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends djx implements dkc {
   public static final MapCodec<dkd> a = b(dkd::new);

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dxt.d $$0) {
      super($$0);
   }

   @Override
   public cwl b() {
      return cwl.a;
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dur($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.p, dur::a);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dur $$5) {
         $$3.a($$5);
         $$3.a(axp.ab);
      }

      return bti.a;
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }
}
