import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhk extends dek {
   public static final MapCodec<dhk> a = b(dhk::new);
   protected static final ewj b = dey.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<iz> c = iz.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iz::i).toList();

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   protected dhk(dsa.d $$0) {
      super($$0);
   }

   public static boolean a(dbx $$0, iz $$1, iz $$2) {
      return $$0.a_($$1.a((kd)$$2)).a(awo.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awo.cw);
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
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
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0.B ? a($$2, dpi.m, dqa::a) : null;
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqt.c;
      }
   }

   @Nullable
   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      dpg $$3 = $$1.c_($$2);
      if ($$3 instanceof dqa) {
         xo $$4 = ((bqy)$$3).O_();
         return new brd(($$2x, $$3x, $$4x) -> new cqn($$2x, $$3x, cqe.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
