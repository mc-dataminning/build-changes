import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dps extends dmq {
   public static final MapCodec<dps> a = b(dps::new);
   public static final List<iw> b = iw.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iw::j).toList();
   private static final fgm c = dne.b(16.0, 0.0, 12.0);

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   protected dps(ebf.d $$0) {
      super($$0);
   }

   public static boolean a(djz $$0, iw $$1, iw $$2) {
      return $$0.a_($$1.a((kb)$$2)).a(axg.cC) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axg.cD);
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (iw $$4 : b) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lz.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0.C ? a($$2, dyg.n, dzb::a) : null;
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
      }

      return but.a;
   }

   @Nullable
   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      dye $$3 = $$1.c_($$2);
      if ($$3 instanceof dzb) {
         xc $$4 = ((buw)$$3).m_();
         return new bvb(($$2x, $$3x, $$4x) -> new cwo($$2x, $$3x, cwf.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
