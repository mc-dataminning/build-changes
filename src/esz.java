import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class esz extends eqi {
   public static final MapCodec<esz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, esz::new)
   );
   public final boolean e;

   public esz(eqi.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      efn.a $$1 = this.e ? efn.a.a : efn.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(era $$0, eqi.a $$1) {
      dsm $$2 = dsm.a($$1.f());
      iu $$3 = new iu($$1.h().d(), 90, $$1.h().e());
      esy.a $$4 = esy.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eqa $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eqi.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eqi.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eqr<?> e() {
      return eqr.m;
   }
}
