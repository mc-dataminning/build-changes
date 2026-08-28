import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhq extends dhk implements dhp {
   public static final MapCodec<dhq> a = b(dhq::new);

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   public dhq(dvc.d $$0) {
      super($$0);
   }

   @Override
   public cuu b() {
      return cuu.a;
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.o, dsb::a);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsb $$5) {
         $$3.a($$5);
         $$3.a(awu.ab);
      }

      return bry.a;
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }
}
