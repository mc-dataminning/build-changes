import com.mojang.serialization.MapCodec;

public class epv extends epn {
   public static final MapCodec<epv> a = axp.a(ly.f).fieldOf("tag").xmap(epv::new, $$0 -> $$0.b);
   private final axp<dhy> b;

   public epv(axp<dhy> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvd $$0, azr $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected epo<?> a() {
      return epo.d;
   }
}
