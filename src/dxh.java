import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxh extends duy {
   public static final Codec<dxh> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dxh::new)
   );
   public final boolean e;

   public dxh(duy.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      dki.a $$1 = this.e ? dki.a.a : dki.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dvq $$0, duy.a $$1) {
      cyx $$2 = cyx.a($$1.f());
      gu $$3 = new gu($$1.h().d(), 90, $$1.h().e());
      dxg.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dvh<?> e() {
      return dvh.m;
   }
}
