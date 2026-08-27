import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dbl extends cwy implements ddy {
   public static final MapCodec<dbl> a = b(dbl::new);
   public static final int b = 15;
   public static final dkp c = dkf.aP;
   public static final dkg d = dkf.C;
   public static final ToIntFunction<djp> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   public dbl(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if (!$$1.B && $$3.gp()) {
         $$1.a($$2, $$0.a(c), 2);
         return bkc.a;
      } else {
         return bkc.b;
      }
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return $$3.a(cnj.hB) ? ems.b() : ems.a();
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return true;
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.a;
   }

   @Override
   public float d(djp $$0, ctd $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(d) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cng a(cng $$0, int $$1) {
      if ($$1 != 15) {
         so $$2 = new so();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
