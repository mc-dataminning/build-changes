import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dcb extends cwy implements cws {
   public static final MapCodec<dcb> a = b(dcb::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dka d = djw.R;
   public static final dkg e = djw.S;
   private static final BiFunction<ic, Integer, eml> f = ac.a(
      ($$0, $$1) -> {
         eml[] $$2 = new eml[]{
            cwp.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cwp.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cwp.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cwp.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eml $$3 = emi.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = emi.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   protected dcb(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ic.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public djg a(cpg $$0) {
      djg $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return true;
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cmx(this));
      }
   }
}
