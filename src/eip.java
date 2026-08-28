import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eip extends eiv {
   final axt<dnc> a;
   public static final MapCodec<eip> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axt.a(mh.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eip::new)
   );

   protected eip(ka $$0, axt<dnc> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(ebe $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eil<?> a() {
      return eil.b;
   }
}
