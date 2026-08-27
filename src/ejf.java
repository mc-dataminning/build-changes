import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ejf extends egp {
   public static final Codec<ejf> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ejf::new)
   );
   public final boolean e;

   public ejf(egp.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      dvz.a $$1 = this.e ? dvz.a.a : dvz.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ehh $$0, egp.a $$1) {
      djr $$2 = djr.a($$1.f());
      in $$3 = new in($$1.h().d(), 90, $$1.h().e());
      eje.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public egy<?> e() {
      return egy.m;
   }
}
