import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class czs extends cvf implements dcf {
   public static final MapCodec<czs> a = b(czs::new);
   public static final int b = 15;
   public static final din c = did.aP;
   public static final die d = did.C;
   public static final ToIntFunction<dhn> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, d);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if (!$$1.B && $$3.gq()) {
         $$1.a($$2, $$0.a(c), 2);
         return bjb.a;
      } else {
         return bjb.b;
      }
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return $$3.a(clr.hB) ? ekp.b() : ekp.a();
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return true;
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.a;
   }

   @Override
   public float d(dhn $$0, crl $$1, hx $$2) {
      return 1.0F;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(d) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static clo a(clo $$0, int $$1) {
      if ($$1 != 15) {
         sd $$2 = new sd();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
