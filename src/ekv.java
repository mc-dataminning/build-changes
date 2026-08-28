import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekv extends eif {
   public static final MapCodec<ekv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ekv::new)
   );
   public final boolean e;

   public ekv(eif.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      dxp.a $$1 = this.e ? dxp.a.a : dxp.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eix $$0, eif.a $$1) {
      dlh $$2 = dlh.a($$1.f());
      iz $$3 = new iz($$1.h().d(), 90, $$1.h().e());
      eku.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public eio<?> e() {
      return eio.m;
   }
}
