import com.mojang.serialization.Codec;

public class dye extends dyv {
   public static final Codec<dye> a = jb.f.q().fieldOf("block").xmap(dye::new, $$0 -> $$0.b).codec();
   private final csv b;

   public dye(csv $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfj $$0, asc $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyw<?> a() {
      return dyw.b;
   }
}
