import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlc extends dic {
   public static final MapCodec<dlc> a = b(dlc::new);
   protected static final fas b = diq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jh> c = jh.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jh::j).toList();

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   protected dlc(dvu.d $$0) {
      super($$0);
   }

   public static boolean a(dfm $$0, jh $$1, jh $$2) {
      return $$0.a_($$1.a((kl)$$2)).a(axc.cx) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(axc.cy);
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jh $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ls.s,
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
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0.C ? a($$2, dta.m, dtt::a) : null;
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
      }

      return bsk.a;
   }

   @Nullable
   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      dsy $$3 = $$1.c_($$2);
      if ($$3 instanceof dtt) {
         xj $$4 = ((bsn)$$3).o_();
         return new bss(($$2x, $$3x, $$4x) -> new csv($$2x, $$3x, csm.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
