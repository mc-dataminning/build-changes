import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class djw extends dfi implements dmj {
   public static final MapCodec<djw> a = b(djw::new);
   public static final int b = 15;
   public static final dtl c = dtb.aP;
   public static final dtc d = dtb.C;
   public static final ToIntFunction<dsl> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   public djw(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if (!$$1.B && $$3.gx()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqh.a;
      } else {
         return bqh.c;
      }
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return $$3.a(cug.hC) ? ewx.b() : ewx.a();
   }

   @Override
   protected boolean a_(dsl $$0, dbm $$1, ja $$2) {
      return $$0.u().c();
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.a;
   }

   @Override
   protected float d(dsl $$0, dbm $$1, ja $$2) {
      return 1.0F;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(d) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cud a(cud $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(kn.ab, cwn.a.a(c, $$1));
      }

      return $$0;
   }
}
