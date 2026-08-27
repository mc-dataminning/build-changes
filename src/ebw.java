import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class ebw extends dzo {
   public static final Codec<ebw> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dxv.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, ebw::new)
   );
   public final dxv e;

   public ebw(dzo.c $$0, dxv $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      dpx $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dpv $$5 = new dpv($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      cuj $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      hx.a $$8 = new hx.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         djp $$9 = $$7.a($$6);
         djp $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cxa.dW) || $$10.d(ctm.a, $$8.q($$6), ic.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         hx $$11 = new hx($$2, $$6, $$3);
         return Optional.of(new dzo.b($$11, (Consumer<eag>)($$3x -> ebv.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dzx<?> e() {
      return dzx.i;
   }
}
