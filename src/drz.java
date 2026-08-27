import com.mojang.serialization.Codec;

public class drz extends drq {
   public static final Codec<drz> b = dey.b.fieldOf("state").xmap(drz::new, $$0 -> $$0.c).codec();
   private final dey c;

   protected drz(dey $$0) {
      this.c = $$0;
   }

   @Override
   protected drr<?> a() {
      return drr.a;
   }

   @Override
   public dey a(art $$0, gv $$1) {
      return this.c;
   }
}
