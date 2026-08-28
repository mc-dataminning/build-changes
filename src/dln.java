import com.mojang.serialization.MapCodec;

public class dln extends dhy {
   public static final MapCodec<dln> d = b(dln::new);

   @Override
   protected MapCodec<? extends dln> a() {
      return d;
   }

   protected dln(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dvd $$0, dvd $$1, jl $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
