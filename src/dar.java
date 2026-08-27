import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dar extends cvo implements cvi {
   public static final MapCodec<dar> a = b(dar::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dih d = did.R;
   public static final din e = did.S;
   private static final BiFunction<ib, Integer, eks> f = ac.a(
      ($$0, $$1) -> {
         eks[] $$2 = new eks[]{
            cvf.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cvf.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cvf.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cvf.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eks $$3 = ekp.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ekp.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   protected dar(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ib.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return true;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new clo(this));
      }
   }
}
