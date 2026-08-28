import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhm extends dem {
   public static final MapCodec<dhm> a = b(dhm::new);
   protected static final ewl b = dfa.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<iz> c = iz.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iz::i).toList();

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   protected dhm(dsc.d $$0) {
      super($$0);
   }

   public static boolean a(dbz $$0, iz $$1, iz $$2) {
      return $$0.a_($$1.a((kd)$$2)).a(awp.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awp.cw);
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
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
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return $$0.B ? a($$2, dpk.m, dqc::a) : null;
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqv.c;
      }
   }

   @Nullable
   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      dpi $$3 = $$1.c_($$2);
      if ($$3 instanceof dqc) {
         xp $$4 = ((bra)$$3).O_();
         return new brf(($$2x, $$3x, $$4x) -> new cqp($$2x, $$3x, cqg.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
