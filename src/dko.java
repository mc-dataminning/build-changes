import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dko extends die {
   public static final MapCodec<dko> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bri.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dko::new)
   );
   private final bri b;

   @Override
   public MapCodec<? extends dko> a() {
      return a;
   }

   public dko(bri $$0, dvi.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, cwb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
