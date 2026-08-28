import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dly extends djn {
   public static final MapCodec<dly> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brq.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dly::new)
   );
   private final brq b;

   @Override
   public MapCodec<? extends dly> a() {
      return a;
   }

   public dly(brq $$0, dwx.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, cwq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
