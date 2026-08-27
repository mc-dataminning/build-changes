import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class czb extends cwb {
   public static final MapCodec<czb> a = b(czb::new);
   protected static final eml b = cwp.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<hx> c = hx.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(hx::i).toList();

   @Override
   public MapCodec<czb> a() {
      return a;
   }

   protected czb(djf.d $$0) {
      super($$0);
   }

   public static boolean a(cto $$0, hx $$1, hx $$2) {
      return $$0.a_($$1.a((jb)$$2)).a(asg.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(asg.co);
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (hx $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               jx.t,
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
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dho($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0.B ? a($$2, dgw.m, dho::a) : null;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bka.b;
      }
   }

   @Nullable
   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      dgu $$3 = $$1.c_($$2);
      if ($$3 instanceof dho) {
         vf $$4 = ((bke)$$3).Q_();
         return new bkj(($$2x, $$3x, $$4x) -> new ciu($$2x, $$3x, cil.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dho) {
            ((dho)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
