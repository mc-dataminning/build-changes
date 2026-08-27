import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eeb extends ebl {
   public static final Codec<eeb> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eeb::new)
   );
   public final boolean e;

   public eeb(ebl.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      dqv.a $$1 = this.e ? dqv.a.a : dqv.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ecd $$0, ebl.a $$1) {
      dfe $$2 = dfe.a($$1.f());
      hz $$3 = new hz($$1.h().d(), 90, $$1.h().e());
      eea.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public ebu<?> e() {
      return ebu.m;
   }
}
