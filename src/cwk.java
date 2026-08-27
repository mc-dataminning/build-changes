import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cwk extends ctm {
   public static final MapCodec<cwk> a = b(cwk::new);
   protected static final eiy b = cua.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<ht> c = ht.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(ht::i).toList();

   @Override
   public MapCodec<cwk> a() {
      return a;
   }

   protected cwk(dga.d $$0) {
      super($$0);
   }

   public static boolean a(cqz $$0, ht $$1, ht $$2) {
      return $$0.a_($$1.a((iw)$$2)).a(aqs.cn) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(aqs.co);
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
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
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new deq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return $$0.B ? a($$2, ddz.m, deq::a) : null;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bib.b;
      }
   }

   @Nullable
   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      ddx $$3 = $$1.c_($$2);
      if ($$3 instanceof deq) {
         ui $$4 = ((bif)$$3).O_();
         return new bij(($$2x, $$3x, $$4x) -> new cgh($$2x, $$3x, cga.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof deq) {
            ((deq)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
