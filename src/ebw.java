import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ebw extends dzg {
   public static final Codec<ebw> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ebw::new)
   );
   public final boolean e;

   public ebw(dzg.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      doq.a $$1 = this.e ? doq.a.a : doq.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dzy $$0, dzg.a $$1) {
      ddc $$2 = ddc.a($$1.f());
      hx $$3 = new hx($$1.h().d(), 90, $$1.h().e());
      ebv.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dzp<?> e() {
      return dzp.m;
   }
}
