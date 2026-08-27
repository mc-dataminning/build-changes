import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxm extends dvd {
   public static final Codec<dxm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dxm::new)
   );
   public final boolean e;

   public dxm(dvd.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      dkn.a $$1 = this.e ? dkn.a.a : dkn.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dvv $$0, dvd.a $$1) {
      czc $$2 = czc.a($$1.f());
      gw $$3 = new gw($$1.h().d(), 90, $$1.h().e());
      dxl.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dvm<?> e() {
      return dvm.m;
   }
}
