import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class efu extends ede {
   public static final Codec<efu> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, efu::new)
   );
   public final boolean e;

   public efu(ede.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      dso.a $$1 = this.e ? dso.a.a : dso.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(edw $$0, ede.a $$1) {
      dgo $$2 = dgo.a($$1.f());
      ib $$3 = new ib($$1.h().d(), 90, $$1.h().e());
      eft.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public edn<?> e() {
      return edn.m;
   }
}
