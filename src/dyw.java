import com.mojang.serialization.Codec;

public class dyw extends dzn {
   public static final Codec<dyw> a = jy.f.q().fieldOf("block").xmap(dyw::new, $$0 -> $$0.b).codec();
   private final cua b;

   public dyw(cua $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dgb $$0, ate $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dzo<?> a() {
      return dzo.b;
   }
}
