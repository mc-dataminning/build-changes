import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class cxo extends ctc implements dab {
   public static final MapCodec<cxo> a = b(cxo::new);
   public static final int b = 15;
   public static final dgd c = dft.aP;
   public static final dfu d = dft.C;
   public static final ToIntFunction<dfd> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<cxo> a() {
      return a;
   }

   public cxo(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if (!$$1.B && $$3.gp()) {
         $$1.a($$2, $$0.a(c), 2);
         return bhe.a;
      } else {
         return bhe.b;
      }
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return $$3.a(cjo.hg) ? ehx.b() : ehx.a();
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return true;
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.a;
   }

   @Override
   public float b(dfd $$0, cph $$1, gw $$2) {
      return 1.0F;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(d) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cjl a(cjl $$0, int $$1) {
      if ($$1 != 15) {
         qw $$2 = new qw();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
