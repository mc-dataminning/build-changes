import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class etz extends eri {
   public static final MapCodec<etz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, etz::new)
   );
   public final boolean e;

   public etz(eri.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      egn.a $$1 = this.e ? egn.a.a : egn.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(esa $$0, eri.a $$1) {
      dtg $$2 = dtg.a($$1.f());
      iv $$3 = new iv($$1.h().d(), 90, $$1.h().e());
      ety.a $$4 = ety.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         era $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eri.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eri.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public err<?> e() {
      return err.m;
   }
}
