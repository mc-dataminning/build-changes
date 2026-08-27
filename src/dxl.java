import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dxl extends dvk {
   public static final Codec<dxl> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dtr.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dxl::new)
   );
   public final dtr e;

   public dxl(dvk.c $$0, dtr $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      dlt $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dlr $$5 = new dlr($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cqj $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gw.a $$8 = new gw.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dfl $$9 = $$7.a($$6);
         dfl $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(csy.dX) || $$10.d(cpm.a, $$8.q($$6), hc.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gw $$11 = new gw($$2, $$6, $$3);
         return Optional.of(new dvk.b($$11, (Consumer<dwc>)($$3x -> dxk.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dvt<?> e() {
      return dvt.i;
   }
}
