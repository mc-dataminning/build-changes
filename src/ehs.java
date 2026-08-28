import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehs extends ehy {
   final axr<dmf> a;
   public static final MapCodec<ehs> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axr.a(mg.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ehs::new)
   );

   protected ehs(jz $$0, axr<dmf> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(eah $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eho<?> a() {
      return eho.b;
   }
}
