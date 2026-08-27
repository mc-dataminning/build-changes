import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ejr extends ehj {
   public static final MapCodec<ejr> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), efq.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ejr::new)
   );
   public final efq e;

   public ejr(ehj.c $$0, efq $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      dxs $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dxq $$5 = new dxq($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dbj $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      io.a $$8 = new io.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         drb $$9 = $$7.a($$6);
         drb $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dea.dW) || $$10.d(dam.a, $$8.q($$6), it.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         io $$11 = new io($$2, $$6, $$3);
         return Optional.of(new ehj.b($$11, (Consumer<eib>)($$3x -> ejq.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ehs<?> e() {
      return ehs.i;
   }
}
