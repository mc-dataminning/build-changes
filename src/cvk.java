import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvk extends ctc {
   public static final MapCodec<cvk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bgj.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, cvk::new)
   );
   private final bgj b;

   @Override
   public MapCodec<? extends cvk> a() {
      return a;
   }

   public cvk(bgj $$0, dfc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, cjl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
