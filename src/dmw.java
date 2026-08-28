import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmw extends deu {
   public static final MapCodec<dmw> a = b(dmw::new);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   protected dmw(dsk.d $$0) {
      super($$0);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new drf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return a($$2, dps.j, $$0.B ? drf::a : drf::b);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, cud $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcz.a($$0, $$2, "SpawnData");
   }
}
