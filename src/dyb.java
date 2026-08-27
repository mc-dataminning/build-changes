import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dyb extends dwa {
   public static final Codec<dyb> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), duh.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dyb::new)
   );
   public final duh e;

   public dyb(dwa.c $$0, duh $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      dmj $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dmh $$5 = new dmh($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      crl $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      ht.a $$8 = new ht.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dgb $$9 = $$7.a($$6);
         dgb $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(cuc.dW) || $$10.d(cqo.a, $$8.q($$6), hx.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         ht $$11 = new ht($$2, $$6, $$3);
         return Optional.of(new dwa.b($$11, (Consumer<dws>)($$3x -> dya.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dwj<?> e() {
      return dwj.i;
   }
}
