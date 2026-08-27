import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ebv extends dzf {
   public static final Codec<ebv> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ebv::new)
   );
   public final boolean e;

   public ebv(dzf.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      dop.a $$1 = this.e ? dop.a.a : dop.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dzx $$0, dzf.a $$1) {
      ddb $$2 = ddb.a($$1.f());
      hx $$3 = new hx($$1.h().d(), 90, $$1.h().e());
      ebu.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dzo<?> e() {
      return dzo.m;
   }
}
