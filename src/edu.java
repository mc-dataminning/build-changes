import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edu extends ebe {
   public static final Codec<edu> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, edu::new)
   );
   public final boolean e;

   public edu(ebe.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      dqo.a $$1 = this.e ? dqo.a.a : dqo.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ebw $$0, ebe.a $$1) {
      dfa $$2 = dfa.a($$1.f());
      hz $$3 = new hz($$1.h().d(), 90, $$1.h().e());
      edt.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public ebn<?> e() {
      return ebn.m;
   }
}
