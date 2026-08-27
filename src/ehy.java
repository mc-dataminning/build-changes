import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ehy extends efq {
   public static final Codec<ehy> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), edx.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ehy::new)
   );
   public final edx e;

   public ehy(efq.c $$0, edx $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      dvz $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dvx $$5 = new dvx($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      czs $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      id.a $$8 = new id.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dpi $$9 = $$7.a($$6);
         dpi $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dcj.dW) || $$10.d(cyv.a, $$8.q($$6), ij.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         id $$11 = new id($$2, $$6, $$3);
         return Optional.of(new efq.b($$11, (Consumer<egi>)($$3x -> ehx.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public efz<?> e() {
      return efz.i;
   }
}
