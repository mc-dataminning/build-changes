import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxl extends dvc {
   public static final Codec<dxl> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dxl::new)
   );
   public final boolean e;

   public dxl(dvc.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      dkm.a $$1 = this.e ? dkm.a.a : dkm.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dvu $$0, dvc.a $$1) {
      czn $$2 = czn.a($$1.f());
      gw $$3 = new gw($$1.h().d(), 90, $$1.h().e());
      dxk.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dvl<?> e() {
      return dvl.m;
   }
}
