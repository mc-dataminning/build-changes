import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dla extends diq {
   public static final MapCodec<dla> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brp.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dla::new)
   );
   private final brp b;

   @Override
   public MapCodec<? extends dla> a() {
      return a;
   }

   public dla(brp $$0, dvu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, cwm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
