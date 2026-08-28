import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqt extends djl implements dqr {
   public static final MapCodec<dqt> a = b(dqt::new);
   public static final dxt<dyd> b = dxm.bk;
   public static final dxn c = dxm.J;
   protected static final fbt d = djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fbt e = djl.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dqt> a() {
      return a;
   }

   public dqt(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(b, dyd.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dww $$0) {
      return $$0.c(b) != dyd.c;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      dyd $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fbq.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      ji $$1 = $$0.a();
      dww $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dyd.c).b(c, Boolean.valueOf(false));
      } else {
         esy $$3 = $$0.q().b_($$1);
         dww $$4 = this.m().b(b, dyd.b).b(c, Boolean.valueOf($$3.a() == esz.c));
         jn $$5 = $$0.k();
         return $$5 != jn.a && ($$5 == jn.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dyd.a);
      }
   }

   @Override
   protected boolean a(dww $$0, daf $$1) {
      cwo $$2 = $$1.n();
      dyd $$3 = $$0.c(b);
      if ($$3 == dyd.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jn $$5 = $$1.k();
         return $$3 == dyd.b ? $$5 == jn.b || $$4 && $$5.o().d() : $$5 == jn.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(c) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dgi $$0, ji $$1, dww $$2, esy $$3) {
      return $$2.c(b) != dyd.c ? dqr.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cow $$0, dfm $$1, ji $$2, dww $$3, esx $$4) {
      return $$3.c(b) != dyd.c ? dqr.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(awv.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
