import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ejt extends ehl {
   public static final MapCodec<ejt> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), efs.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ejt::new)
   );
   public final efs e;

   public ejt(ehl.c $$0, efs $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      dxu $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dxs $$5 = new dxs($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dbl $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      io.a $$8 = new io.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         drd $$9 = $$7.a($$6);
         drd $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dec.dW) || $$10.d(dao.a, $$8.q($$6), it.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         io $$11 = new io($$2, $$6, $$3);
         return Optional.of(new ehl.b($$11, (Consumer<eid>)($$3x -> ejs.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ehu<?> e() {
      return ehu.i;
   }
}
