import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dkn extends dfj implements dfd {
   public static final MapCodec<dkn> a = b(dkn::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dsx d = dst.R;
   public static final dtd e = dst.S;
   private static final BiFunction<je, Integer, ewl> f = ac.a(
      ($$0, $$1) -> {
         ewl[] $$2 = new ewl[]{
            dfa.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dfa.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dfa.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dfa.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ewl $$3 = ewi.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ewi.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   protected dkn(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, je.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dsd a(dsd $$0, dln $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dsd $$0, cyb $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return true;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cuq(this));
      }
   }
}
