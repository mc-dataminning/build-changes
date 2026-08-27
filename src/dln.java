import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dln extends dde {
   public static final MapCodec<dln> a = b(dln::new);
   public static final dqy b = dqx.B;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(dqg.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dad $$0, in $$1, czv $$2) {
      if (!$$0.B) {
         chs $$3 = new chs($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.r();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dad $$0, in $$1) {
      a($$0, $$1, null);
   }

   private static void a(dad $$0, in $$1, @Nullable bsa $$2) {
      if (!$$0.B) {
         chs $$3 = new chs($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.ds(), $$3.du(), $$3.dy(), avc.zk, avd.e, 1.0F, 1.0F);
         $$0.a($$2, dva.I, $$1);
      }
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if (!$$0.a(ctc.os) && !$$0.a(ctc.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, ddg.a.n(), 11);
         csu $$7 = $$0.f();
         if (!$$4.f()) {
            if ($$0.a(ctc.os)) {
               $$0.a(1, $$4, bsa.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(avm.c.b($$7));
         return bpo.a($$2.B);
      }
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      if (!$$0.B) {
         in $$4 = $$2.a();
         brh $$5 = $$3.u();
         if ($$3.bO() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bsa ? (bsa)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(czv $$0) {
      return false;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }
}
