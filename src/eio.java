import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class eio extends egg {
   public static final Codec<eio> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), een.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, eio::new)
   );
   public final een e;

   public eio(egg.c $$0, een $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      dwp $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().e();
      dwn $$5 = new dwn($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dag $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      im.a $$8 = new im.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dpy $$9 = $$7.a($$6);
         dpy $$10 = $$7.a(--$$6);
         if ($$9.i() && ($$10.a(dcx.dW) || $$10.d(czj.a, $$8.q($$6), ir.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         im $$11 = new im($$2, $$6, $$3);
         return Optional.of(new egg.b($$11, (Consumer<egy>)($$3x -> ein.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public egp<?> e() {
      return egp.i;
   }
}
