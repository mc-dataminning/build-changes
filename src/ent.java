import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ent extends elc {
   public static final MapCodec<ent> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ent::new)
   );
   public final boolean e;

   public ent(elc.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      eak.a $$1 = this.e ? eak.a.a : eak.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(elu $$0, elc.a $$1) {
      dnx $$2 = dnx.a($$1.f());
      je $$3 = new je($$1.h().d(), 90, $$1.h().e());
      ens.a $$4 = ens.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eku $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = elc.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = elc.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public ell<?> e() {
      return ell.m;
   }
}
