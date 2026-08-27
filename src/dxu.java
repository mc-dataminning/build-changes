import com.mojang.serialization.Codec;

public class dxu extends dyl {
   public static final Codec<dxu> a = jb.f.q().fieldOf("block").xmap(dxu::new, $$0 -> $$0.b).codec();
   private final csl b;

   public dxu(csl $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dez $$0, aru $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dym<?> a() {
      return dym.b;
   }
}
