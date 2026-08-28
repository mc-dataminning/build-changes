import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class erp extends epg {
   public static final MapCodec<erp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), enn.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, erp::new)
   );
   public final enn e;

   public erp(epg.c $$0, enn $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      efk $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      efi $$5 = new efi($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      dib $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      jj.a $$8 = new jj.a($$2, $$6, $$3);

      while ($$6 > $$4) {
         dym $$9 = $$7.a($$6);
         dym $$10 = $$7.a(--$$6);
         if ($$9.l() && ($$10.a(dkw.ej) || $$10.c(dhf.a, $$8.q($$6), jo.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         jj $$11 = new jj($$2, $$6, $$3);
         return Optional.of(new epg.b($$11, (Consumer<epy>)($$3x -> ero.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public epp<?> e() {
      return epp.i;
   }
}
