import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class czc extends cwc {
   public static final MapCodec<czc> a = b(czc::new);
   protected static final emm b = cwq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<hx> c = hx.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(hx::i).toList();

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   protected czc(djg.d $$0) {
      super($$0);
   }

   public static boolean a(ctp $$0, hx $$1, hx $$2) {
      return $$0.a_($$1.a((jb)$$2)).a(ash.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(ash.co);
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
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
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0.B ? a($$2, dgx.m, dhp::a) : null;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bkb.b;
      }
   }

   @Nullable
   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      dgv $$3 = $$1.c_($$2);
      if ($$3 instanceof dhp) {
         vf $$4 = ((bkf)$$3).Q_();
         return new bkk(($$2x, $$3x, $$4x) -> new civ($$2x, $$3x, cim.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A()) {
         dgv $$5 = $$0.c_($$1);
         if ($$5 instanceof dhp) {
            ((dhp)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
