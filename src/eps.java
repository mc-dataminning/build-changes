import com.mojang.serialization.MapCodec;

public class eps extends epo {
   public static final MapCodec<eps> a = ays.m.fieldOf("chance").xmap(eps::new, $$0 -> $$0.c);
   private final int c;

   private eps(int $$0) {
      this.c = $$0;
   }

   public static eps a(int $$0) {
      return new eps($$0);
   }

   @Override
   protected boolean a(epn $$0, azt $$1, iu $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public epq<?> b() {
      return epq.b;
   }
}
