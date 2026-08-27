import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dxj extends dvi {
   public static final Codec<dxj> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dtp.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dxj::new)
   );
   public final dtp e;

   public dxj(dvi.c $$0, dtp $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      dlr $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dlp $$5 = new dlp($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cqh $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gw.a $$8 = new gw.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dfj $$9 = $$7.a($$6);
         dfj $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(csw.dX) || $$10.d(cpk.a, $$8.q($$6), hc.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gw $$11 = new gw($$2, $$6, $$3);
         return Optional.of(new dvi.b($$11, (Consumer<dwa>)($$3x -> dxi.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dvr<?> e() {
      return dvr.i;
   }
}
