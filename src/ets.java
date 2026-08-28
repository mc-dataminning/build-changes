import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ets extends erb {
   public static final MapCodec<ets> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ets::new)
   );
   public final boolean e;

   public ets(erb.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      egg.a $$1 = this.e ? egg.a.a : egg.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ert $$0, erb.a $$1) {
      dsz $$2 = dsz.a($$1.f());
      iu $$3 = new iu($$1.h().d(), 90, $$1.h().e());
      etr.a $$4 = etr.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eqt $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = erb.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = erb.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public erk<?> e() {
      return erk.m;
   }
}
