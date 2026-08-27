import com.mojang.serialization.Codec;

public class dsk extends dsb {
   public static final Codec<dsk> b = dfj.b.fieldOf("state").xmap(dsk::new, $$0 -> $$0.c).codec();
   private final dfj c;

   protected dsk(dfj $$0) {
      this.c = $$0;
   }

   @Override
   protected dsc<?> a() {
      return dsc.a;
   }

   @Override
   public dfj a(asc $$0, gw $$1) {
      return this.c;
   }
}
