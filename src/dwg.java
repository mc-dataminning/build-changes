import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwg extends dmo {
   public static final MapCodec<dwg> a = b(dwg::new);
   public static final ecc<eaj> b = ebu.bB;
   public static final ebv c = ebu.bE;

   @Override
   public MapCodec<dwg> a() {
      return a;
   }

   public dwg(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eaj.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new eac($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0 instanceof ars $$3
         ? a($$2, dye.R, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(ebu.bE).orElse(false)))
         : a($$2, dye.R, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(ebu.bE).orElse(false)));
   }
}
