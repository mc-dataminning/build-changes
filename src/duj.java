import com.mojang.serialization.Codec;

public class duj extends dua {
   public static final Codec<duj> b = dhi.b.fieldOf("state").xmap(duj::new, $$0 -> $$0.c).codec();
   private final dhi c;

   protected duj(dhi $$0) {
      this.c = $$0;
   }

   @Override
   protected dub<?> a() {
      return dub.a;
   }

   @Override
   public dhi a(ats $$0, ht $$1) {
      return this.c;
   }
}
