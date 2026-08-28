import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeu extends efa {
   final ayk<dke> a;
   public static final MapCodec<eeu> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ayk.a(mb.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eeu::new)
   );

   protected eeu(kl $$0, ayk<dke> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dxn $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eeq<?> a() {
      return eeq.b;
   }
}
