import com.mojang.serialization.Codec;

public class dxy extends dyp {
   public static final Codec<dxy> a = jb.f.q().fieldOf("block").xmap(dxy::new, $$0 -> $$0.b).codec();
   private final ctc b;

   public dxy(ctc $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfd $$0, ash $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyq<?> a() {
      return dyq.b;
   }
}
