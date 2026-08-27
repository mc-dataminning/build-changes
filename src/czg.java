import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class czg extends cut implements dbt {
   public static final MapCodec<czg> a = b(czg::new);
   public static final int b = 15;
   public static final dhw c = dhm.aP;
   public static final dhn d = dhm.C;
   public static final ToIntFunction<dgw> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   public czg(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, d);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if (!$$1.B && $$3.gp()) {
         $$1.a($$2, $$0.a(c), 2);
         return biq.a;
      } else {
         return biq.b;
      }
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return $$3.a(cle.hg) ? ejy.b() : ejy.a();
   }

   @Override
   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return true;
   }

   @Override
   public day b_(dgw $$0) {
      return day.a;
   }

   @Override
   public float b(dgw $$0, cqy $$1, ht $$2) {
      return 1.0F;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(d) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static clb a(clb $$0, int $$1) {
      if ($$1 != 15) {
         rz $$2 = new rz();
         $$2.a(c.f(), String.valueOf($$1));
         $$0.a("BlockStateTag", $$2);
      }

      return $$0;
   }
}
