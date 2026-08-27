import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class czn extends cva implements dca {
   public static final MapCodec<czn> a = b(czn::new);
   public static final int b = 15;
   public static final dii c = dhy.aP;
   public static final dhz d = dhy.C;
   public static final ToIntFunction<dhi> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<czn> a() {
      return a;
   }

   public czn(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if (!$$1.B && $$3.gq()) {
         $$1.a($$2, $$0.a(c), 2);
         return bix.a;
      } else {
         return bix.b;
      }
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return $$3.a(clm.hB) ? ekk.b() : ekk.a();
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return true;
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.a;
   }

   @Override
   public float d(dhi $$0, crg $$1, ht $$2) {
      return 1.0F;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(d) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static clj a(clj $$0, int $$1) {
      if ($$1 != 15) {
         rz $$2 = new rz();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
