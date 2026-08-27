import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ebe extends dyo {
   public static final Codec<ebe> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ebe::new)
   );
   public final boolean e;

   public ebe(dyo.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      dny.a $$1 = this.e ? dny.a.a : dny.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dzg $$0, dyo.a $$1) {
      dcl $$2 = dcl.a($$1.f());
      hv $$3 = new hv($$1.h().d(), 90, $$1.h().e());
      ebd.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dyx<?> e() {
      return dyx.m;
   }
}
