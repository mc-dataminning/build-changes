import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class djl extends deh implements deb {
   public static final MapCodec<djl> a = b(djl::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final drv d = drr.R;
   public static final dsb e = drr.S;
   private static final BiFunction<it, Integer, evd> f = ac.a(
      ($$0, $$1) -> {
         evd[] $$2 = new evd[]{
            ddy.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            ddy.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            ddy.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            ddy.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         evd $$3 = eva.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eva.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, it.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public drb a(drb $$0, dkl $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(drb $$0, cwz $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().a(d, $$0.g().g());
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return true;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cto(this));
      }
   }
}
