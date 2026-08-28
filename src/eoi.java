import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoi extends elr {
   public static final MapCodec<eoi> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eoi::new)
   );
   public final boolean e;

   public eoi(elr.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      eaz.a $$1 = this.e ? eaz.a.a : eaz.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(emj $$0, elr.a $$1) {
      dol $$2 = dol.a($$1.f());
      jg $$3 = new jg($$1.h().d(), 90, $$1.h().e());
      eoh.a $$4 = eoh.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         elj $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = elr.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = elr.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public ema<?> e() {
      return ema.m;
   }
}
