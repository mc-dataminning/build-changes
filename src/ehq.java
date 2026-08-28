import com.mojang.serialization.MapCodec;

public class ehq extends ehh {
   public static final MapCodec<ehq> b = dua.a.fieldOf("state").xmap(ehq::new, $$0 -> $$0.c);
   private final dua c;

   protected ehq(dua $$0) {
      this.c = $$0;
   }

   @Override
   protected ehi<?> a() {
      return ehi.a;
   }

   @Override
   public dua a(azk $$0, je $$1) {
      return this.c;
   }
}
