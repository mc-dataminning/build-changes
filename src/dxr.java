import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dxr extends dvi {
   public static final Codec<dxr> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dxr::new)
   );
   public final boolean e;

   public dxr(dvi.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      dks.a $$1 = this.e ? dks.a.a : dks.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dwa $$0, dvi.a $$1) {
      czh $$2 = czh.a($$1.f());
      gw $$3 = new gw($$1.h().d(), 90, $$1.h().e());
      dxq.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dvr<?> e() {
      return dvr.m;
   }
}
