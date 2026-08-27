import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dbv extends cws implements cwm {
   public static final MapCodec<dbv> a = b(dbv::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dju d = djq.R;
   public static final dka e = djq.S;
   private static final BiFunction<ic, Integer, emf> f = ac.a(
      ($$0, $$1) -> {
         emf[] $$2 = new emf[]{
            cwj.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cwj.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cwj.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cwj.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         emf $$3 = emc.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = emc.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   protected dbv(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ic.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dja a(cpa $$0) {
      dja $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return true;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cmr(this));
      }
   }
}
