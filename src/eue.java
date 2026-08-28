import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eue extends ern {
   public static final MapCodec<eue> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eue::new)
   );
   public final boolean e;

   public eue(ern.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      egs.a $$1 = this.e ? egs.a.a : egs.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(esf $$0, ern.a $$1) {
      dtl $$2 = dtl.a($$1.f());
      iv $$3 = new iv($$1.h().d(), 90, $$1.h().e());
      eud.a $$4 = eud.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         erf $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = ern.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = ern.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public erw<?> e() {
      return erw.m;
   }
}
