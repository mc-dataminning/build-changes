import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class elg extends eix {
   public static final MapCodec<elg> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ehe.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, elg::new)
   );
   public final ehe e;

   public elg(eix.c $$0, ehe $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      dzf $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dzd $$5 = new dzd($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dcs $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ja.a $$8 = new ja.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dsl $$9 = $$7.a($$6);
         dsl $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfk.dW) || $$10.d(dbv.a, $$8.q($$6), jf.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ja $$11 = new ja($$2, $$6, $$3);
         return Optional.of(new eix.b($$11, (Consumer<ejp>)($$3x -> elf.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ejg<?> e() {
      return ejg.i;
   }
}
