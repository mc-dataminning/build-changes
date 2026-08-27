import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eix extends egp {
   public static final Codec<eix> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), eew.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eix::new)
   );
   public final eew e;

   public eix(egp.c $$0, eew $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      dwy $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dww $$5 = new dww($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dap $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      in.a $$8 = new in.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dqh $$9 = $$7.a($$6);
         dqh $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(ddg.dW) || $$10.d(czs.a, $$8.q($$6), is.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         in $$11 = new in($$2, $$6, $$3);
         return Optional.of(new egp.b($$11, (Consumer<ehh>)($$3x -> eiw.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public egy<?> e() {
      return egy.i;
   }
}
