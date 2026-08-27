import com.mojang.serialization.Codec;

public class dsa extends drr {
   public static final Codec<dsa> b = dez.b.fieldOf("state").xmap(dsa::new, $$0 -> $$0.c).codec();
   private final dez c;

   protected dsa(dez $$0) {
      this.c = $$0;
   }

   @Override
   protected drs<?> a() {
      return drs.a;
   }

   @Override
   public dez a(aru $$0, gu $$1) {
      return this.c;
   }
}
