import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dws extends dna {
   public static final MapCodec<dws> a = b(dws::new);
   public static final eco<eav> b = ecg.bB;
   public static final ech c = ecg.bE;

   @Override
   public MapCodec<dws> a() {
      return a;
   }

   public dws(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eav.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eao($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0 instanceof asb $$3
         ? a($$2, dyq.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(ecg.bE).orElse(false)))
         : a($$2, dyq.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(ecg.bE).orElse(false)));
   }
}
