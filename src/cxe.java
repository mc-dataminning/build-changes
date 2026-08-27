import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cxe extends cuf {
   public static final MapCodec<cxe> a = b(cxe::new);
   protected static final ekb b = cut.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ht> c = ht.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ht::i).toList();

   @Override
   public MapCodec<cxe> a() {
      return a;
   }

   protected cxe(dgv.d $$0) {
      super($$0);
   }

   public static boolean a(crs $$0, ht $$1, ht $$2) {
      return $$0.a_($$1.a((iw)$$2)).a(arc.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(arc.co);
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (ht $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               js.t,
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
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$0.B ? a($$2, det.m, dfl::a) : null;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return biq.b;
      }
   }

   @Nullable
   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      der $$3 = $$1.c_($$2);
      if ($$3 instanceof dfl) {
         ur $$4 = ((biu)$$3).O_();
         return new biy(($$2x, $$3x, $$4x) -> new cgy($$2x, $$3x, cgp.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A()) {
         der $$5 = $$0.c_($$1);
         if ($$5 instanceof dfl) {
            ((dfl)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
