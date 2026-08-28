import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dkh extends dfd implements dex {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dsr d = dsn.R;
   public static final dsx e = dsn.S;
   private static final BiFunction<je, Integer, ewf> f = ac.a(
      ($$0, $$1) -> {
         ewf[] $$2 = new ewf[]{
            deu.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            deu.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            deu.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            deu.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ewf $$3 = ewc.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewc.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dkh> a() {
      return a;
   }

   protected dkh(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, je.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public drx a(drx $$0, dlh $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(drx $$0, cxv $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public drx a(cxv $$0) {
      drx $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().a(d, $$0.g().g());
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return true;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cuk(this));
      }
   }
}
