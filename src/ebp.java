import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ebp extends dyz {
   public static final Codec<ebp> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ebp::new)
   );
   public final boolean e;

   public ebp(dyz.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      doj.a $$1 = this.e ? doj.a.a : doj.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dzr $$0, dyz.a $$1) {
      dcv $$2 = dcv.a($$1.f());
      hx $$3 = new hx($$1.h().d(), 90, $$1.h().e());
      ebo.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dzi<?> e() {
      return dzi.m;
   }
}
