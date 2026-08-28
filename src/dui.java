import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dui extends dmi implements duh {
   public static final MapCodec<dui> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duh.a.e.fieldOf("weathering_state").forGetter(dui::q), t()).apply($$0, dui::new)
   );
   private final duh.a e;

   @Override
   protected MapCodec<dui> a() {
      return d;
   }

   public dui(duh.a $$0, dyl.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dym $$0) {
      return duh.c($$0.b()).isPresent();
   }

   public duh.a q() {
      return this.e;
   }
}
