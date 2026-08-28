import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eky extends eii {
   public static final MapCodec<eky> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eky::new)
   );
   public final boolean e;

   public eky(eii.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      dxs.a $$1 = this.e ? dxs.a.a : dxs.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eja $$0, eii.a $$1) {
      dlk $$2 = dlk.a($$1.f());
      iz $$3 = new iz($$1.h().d(), 90, $$1.h().e());
      ekx.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public eir<?> e() {
      return eir.m;
   }
}
