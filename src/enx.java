import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class enx extends elg {
   public static final MapCodec<enx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, enx::new)
   );
   public final boolean e;

   public enx(elg.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      eao.a $$1 = this.e ? eao.a.a : eao.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ely $$0, elg.a $$1) {
      doa $$2 = doa.a($$1.f());
      jf $$3 = new jf($$1.h().d(), 90, $$1.h().e());
      enw.a $$4 = enw.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eky $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = elg.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = elg.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public elp<?> e() {
      return elp.m;
   }
}
