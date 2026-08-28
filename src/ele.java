import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ele extends eiw {
   public static final MapCodec<ele> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ehd.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ele::new)
   );
   public final ehd e;

   public ele(eiw.c $$0, ehd $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      dze $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dzc $$5 = new dzc($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dcr $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ja.a $$8 = new ja.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dsk $$9 = $$7.a($$6);
         dsk $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dfj.dW) || $$10.d(dbu.a, $$8.q($$6), jf.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ja $$11 = new ja($$2, $$6, $$3);
         return Optional.of(new eiw.b($$11, (Consumer<ejo>)($$3x -> eld.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ejf<?> e() {
      return ejf.i;
   }
}
