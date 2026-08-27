import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ejz extends ehj {
   public static final MapCodec<ejz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ejz::new)
   );
   public final boolean e;

   public ejz(ehj.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      dwt.a $$1 = this.e ? dwt.a.a : dwt.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eib $$0, ehj.a $$1) {
      dkl $$2 = dkl.a($$1.f());
      io $$3 = new io($$1.h().d(), 90, $$1.h().e());
      ejy.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public ehs<?> e() {
      return ehs.m;
   }
}
