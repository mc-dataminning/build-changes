import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eeo extends ecg {
   public static final Codec<eeo> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), ean.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eeo::new)
   );
   public final ean e;

   public eeo(ecg.c $$0, ean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      dsp $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dsn $$5 = new dsn($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cwq $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ib.a $$8 = new ib.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dme $$9 = $$7.a($$6);
         dme $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(czh.dW) || $$10.d(cvt.a, $$8.q($$6), ih.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ib $$11 = new ib($$2, $$6, $$3);
         return Optional.of(new ecg.b($$11, (Consumer<ecy>)($$3x -> een.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ecp<?> e() {
      return ecp.i;
   }
}
