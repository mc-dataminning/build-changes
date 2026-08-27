import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eig extends efq {
   public static final Codec<eig> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eig::new)
   );
   public final boolean e;

   public eig(efq.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      dva.a $$1 = this.e ? dva.a.a : dva.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(egi $$0, efq.a $$1) {
      dit $$2 = dit.a($$1.f());
      id $$3 = new id($$1.h().d(), 90, $$1.h().e());
      eif.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public efz<?> e() {
      return efz.m;
   }
}
