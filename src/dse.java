import com.mojang.serialization.Codec;

public class dse extends drv {
   public static final Codec<dse> b = dfd.b.fieldOf("state").xmap(dse::new, $$0 -> $$0.c).codec();
   private final dfd c;

   protected dse(dfd $$0) {
      this.c = $$0;
   }

   @Override
   protected drw<?> a() {
      return drw.a;
   }

   @Override
   public dfd a(ash $$0, gw $$1) {
      return this.c;
   }
}
