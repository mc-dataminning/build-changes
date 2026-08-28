import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhj extends dej {
   public static final MapCodec<dhj> a = b(dhj::new);
   protected static final ewi b = dex.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<iz> c = iz.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iz::i).toList();

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   protected dhj(drz.d $$0) {
      super($$0);
   }

   public static boolean a(dbw $$0, iz $$1, iz $$2) {
      return $$0.a_($$1.a((kd)$$2)).a(awo.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awo.cw);
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (iz $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               li.s,
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
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0.B ? a($$2, dph.m, dpz::a) : null;
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqs.c;
      }
   }

   @Nullable
   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      dpf $$3 = $$1.c_($$2);
      if ($$3 instanceof dpz) {
         xo $$4 = ((bqx)$$3).O_();
         return new brc(($$2x, $$3x, $$4x) -> new cqm($$2x, $$3x, cqd.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
