import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox extends dqm {
   public static final MapCodec<dox> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayr.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dox::new)
   );
   protected final ayr b;

   @Override
   public MapCodec<? extends dox> a() {
      return a;
   }

   public dox(ayr $$0, ebp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(ebq $$0, djn $$1, iw $$2) {
      return this.b.a();
   }
}
