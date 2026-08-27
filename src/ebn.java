import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ebn extends dzf {
   public static final Codec<ebn> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dxm.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ebn::new)
   );
   public final dxm e;

   public ebn(dzf.c $$0, dxm $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      dpo $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dpm $$5 = new dpm($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cua $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      hx.a $$8 = new hx.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         djg $$9 = $$7.a($$6);
         djg $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cwr.dW) || $$10.d(ctd.a, $$8.q($$6), ic.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         hx $$11 = new hx($$2, $$6, $$3);
         return Optional.of(new dzf.b($$11, (Consumer<dzx>)($$3x -> ebm.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dzo<?> e() {
      return dzo.i;
   }
}
