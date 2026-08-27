import com.mojang.serialization.Codec;

public class dvq extends dvh {
   public static final Codec<dvq> b = dip.b.fieldOf("state").xmap(dvq::new, $$0 -> $$0.c).codec();
   private final dip c;

   protected dvq(dip $$0) {
      this.c = $$0;
   }

   @Override
   protected dvi<?> a() {
      return dvi.a;
   }

   @Override
   public dip a(auf $$0, hv $$1) {
      return this.c;
   }
}
