import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eus extends esb {
   public static final MapCodec<eus> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eus::new)
   );
   public final boolean e;

   public eus(esb.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      ehd.a $$1 = this.e ? ehd.a.a : ehd.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(est $$0, esb.a $$1) {
      dtw $$2 = dtw.a($$1.f());
      iv $$3 = new iv($$1.h().d(), 90, $$1.h().e());
      eur.a $$4 = eur.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         ert $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = esb.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = esb.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public esk<?> e() {
      return esk.m;
   }
}
