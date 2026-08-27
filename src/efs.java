import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class efs extends edc {
   public static final Codec<efs> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, efs::new)
   );
   public final boolean e;

   public efs(edc.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      dsm.a $$1 = this.e ? dsm.a.a : dsm.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(edu $$0, edc.a $$1) {
      dgm $$2 = dgm.a($$1.f());
      ib $$3 = new ib($$1.h().d(), 90, $$1.h().e());
      efr.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public edl<?> e() {
      return edl.m;
   }
}
