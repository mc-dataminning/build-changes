import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxi extends duz {
   public static final Codec<dxi> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dxi::new)
   );
   public final boolean e;

   public dxi(duz.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      dkj.a $$1 = this.e ? dkj.a.a : dkj.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dvr $$0, duz.a $$1) {
      cyy $$2 = cyy.a($$1.f());
      gu $$3 = new gu($$1.h().d(), 90, $$1.h().e());
      dxh.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dvi<?> e() {
      return dvi.m;
   }
}
