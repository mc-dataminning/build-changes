import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvb extends dlm {
   public static final MapCodec<dvb> a = b(dvb::new);
   public static final eax<dze> b = eap.bB;
   public static final eaq c = eap.bE;

   @Override
   public MapCodec<dvb> a() {
      return a;
   }

   public dvb(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dze.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dwz.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(eap.bE).orElse(false)))
         : a($$2, dwz.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(eap.bE).orElse(false)));
   }
}
