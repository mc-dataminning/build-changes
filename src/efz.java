import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class efz extends efp {
   public static final MapCodec<efz> b = boq.b(dsk.b).comapFlatMap(efz::a, $$0 -> $$0.c).fieldOf("entries");
   private final boq<dsk> c;

   private static DataResult<efz> a(boq<dsk> $$0) {
      return $$0.d() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new efz($$0));
   }

   public efz(boq<dsk> $$0) {
      this.c = $$0;
   }

   public efz(boq.a<dsk> $$0) {
      this($$0.a());
   }

   @Override
   protected efq<?> a() {
      return efq.b;
   }

   @Override
   public dsk a(ayo $$0, ja $$1) {
      return this.c.a($$0).orElseThrow(IllegalStateException::new);
   }
}
