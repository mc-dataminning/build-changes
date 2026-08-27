import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ece extends dzo {
   public static final Codec<ece> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ece::new)
   );
   public final boolean e;

   public ece(dzo.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      doy.a $$1 = this.e ? doy.a.a : doy.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eag $$0, dzo.a $$1) {
      ddk $$2 = ddk.a($$1.f());
      hx $$3 = new hx($$1.h().d(), 90, $$1.h().e());
      ecd.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dzx<?> e() {
      return dzx.m;
   }
}
