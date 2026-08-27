import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class edt extends ebl {
   public static final Codec<edt> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dzs.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, edt::new)
   );
   public final dzs e;

   public edt(ebl.c $$0, dzs $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      dru $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      drs $$5 = new drs($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cwd $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      hz.a $$8 = new hz.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dlj $$9 = $$7.a($$6);
         dlj $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cyu.dW) || $$10.d(cvg.a, $$8.q($$6), ie.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         hz $$11 = new hz($$2, $$6, $$3);
         return Optional.of(new ebl.b($$11, (Consumer<ecd>)($$3x -> eds.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public ebu<?> e() {
      return ebu.i;
   }
}
