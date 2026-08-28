import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dnw extends djk implements dqq {
   public static final MapCodec<dnw> a = b(dnw::new);
   public static final int b = 7;
   public static final dxu c = dxl.aF;
   public static final dxm d = dxl.A;
   public static final dxm e = dxl.J;
   private static final int f = 1;

   @Override
   public MapCodec<? extends dnw> a() {
      return a;
   }

   public dnw(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(7)).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      return fbp.a();
   }

   @Override
   protected boolean f(dwv $$0) {
      return $$0.c(c) == 7 && !$$0.c(d);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (this.o($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean o(dwv $$0) {
      return !$$0.c(d) && $$0.c(c) == 7;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int i_(dwv $$0) {
      return 1;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      int $$8 = r($$6) + 1;
      if ($$8 != 1 || $$0.c(c) != $$8) {
         $$2.a($$3, this, 1);
      }

      return $$0;
   }

   private static dwv a(dwv $$0, dgh $$1, ji $$2) {
      int $$3 = 7;
      ji.a $$4 = new ji.a();

      for (jn $$5 : jn.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, r($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.b(c, Integer.valueOf($$3));
   }

   private static int r(dwv $$0) {
      return q($$0).orElse(7);
   }

   public static OptionalInt q(dwv $$0) {
      if ($$0.a(awo.u)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(c) ? OptionalInt.of($$0.c(c)) : OptionalInt.empty();
      }
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(e) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$1.r($$2.d())) {
         if ($$3.a(15) == 1) {
            ji $$4 = $$2.e();
            dwv $$5 = $$1.a_($$4);
            if (!$$5.t() || !$$5.c($$1, $$4, jn.b)) {
               azc.a($$1, $$2, $$3, lt.l);
            }
         }
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      dwv $$2 = this.m().b(d, Boolean.valueOf(true)).b(e, Boolean.valueOf($$1.a() == esy.c));
      return a($$2, $$0.q(), $$0.a());
   }
}
