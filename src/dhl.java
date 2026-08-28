import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhl extends del {
   public static final MapCodec<dhl> a = b(dhl::new);
   protected static final ewk b = dez.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<iz> c = iz.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iz::i).toList();

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   protected dhl(dsb.d $$0) {
      super($$0);
   }

   public static boolean a(dby $$0, iz $$1, iz $$2) {
      return $$0.a_($$1.a((kd)$$2)).a(awp.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awp.cw);
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
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
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return $$0.B ? a($$2, dpj.m, dqb::a) : null;
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqu.c;
      }
   }

   @Nullable
   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      dph $$3 = $$1.c_($$2);
      if ($$3 instanceof dqb) {
         xp $$4 = ((bqz)$$3).O_();
         return new bre(($$2x, $$3x, $$4x) -> new cqo($$2x, $$3x, cqf.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
