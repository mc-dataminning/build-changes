import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxg extends dux {
   public static final Codec<dxg> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dxg::new)
   );
   public final boolean e;

   public dxg(dux.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      dkh.a $$1 = this.e ? dkh.a.a : dkh.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dvp $$0, dux.a $$1) {
      cyw $$2 = cyw.a($$1.f());
      gv $$3 = new gv($$1.h().d(), 90, $$1.h().e());
      dxf.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dvg<?> e() {
      return dvg.m;
   }
}
