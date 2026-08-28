import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eie extends eik {
   final axr<dmr> a;
   public static final MapCodec<eie> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axr.a(mh.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eie::new)
   );

   protected eie(ka $$0, axr<dmr> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(eat $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eia<?> a() {
      return eia.b;
   }
}
