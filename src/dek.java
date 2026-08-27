import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dek extends dbk {
   public static final MapCodec<dek> a = b(dek::new);
   protected static final est b = dby.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ib> c = ib.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ib::i).toList();

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   protected dek(doy.d $$0) {
      super($$0);
   }

   public static boolean a(cyx $$0, ib $$1, ib $$2) {
      return $$0.a_($$1.a((jg)$$2)).a(avc.cp) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(avc.cq);
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ib $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               kl.t,
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
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0.B ? a($$2, dmh.m, dmz::a) : null;
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return boa.b;
      }
   }

   @Nullable
   @Override
   protected boe b(doz $$0, cyx $$1, ib $$2) {
      dmf $$3 = $$1.c_($$2);
      if ($$3 instanceof dmz) {
         wg $$4 = ((bof)$$3).O_();
         return new bok(($$2x, $$3x, $$4x) -> new cnj($$2x, $$3x, cna.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
