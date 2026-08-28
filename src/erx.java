import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class erx extends epg {
   public static final MapCodec<erx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, erx::new)
   );
   public final boolean e;

   public erx(epg.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      eel.a $$1 = this.e ? eel.a.a : eel.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(epy $$0, epg.a $$1) {
      drm $$2 = drm.a($$1.f());
      jj $$3 = new jj($$1.h().d(), 90, $$1.h().e());
      erw.a $$4 = erw.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eoy $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = epg.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = epg.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public epp<?> e() {
      return epp.m;
   }
}
