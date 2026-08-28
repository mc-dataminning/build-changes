import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efc extends efi {
   final ayk<dkm> a;
   public static final MapCodec<efc> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ayk.a(mb.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, efc::new)
   );

   protected efc(kl $$0, ayk<dkm> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dxv $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eey<?> a() {
      return eey.b;
   }
}
