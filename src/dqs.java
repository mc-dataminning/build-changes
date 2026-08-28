import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqs extends djk implements dqq {
   public static final MapCodec<dqs> a = b(dqs::new);
   public static final dxs<dyc> b = dxl.bk;
   public static final dxm c = dxl.J;
   protected static final fbs d = djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fbs e = djk.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dqs> a() {
      return a;
   }

   public dqs(dwu.d $$0) {
      super($$0);
      this.l(this.m().b(b, dyc.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dwv $$0) {
      return $$0.c(b) != dyc.c;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      dyc $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fbp.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      ji $$1 = $$0.a();
      dwv $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dyc.c).b(c, Boolean.valueOf(false));
      } else {
         esx $$3 = $$0.q().b_($$1);
         dwv $$4 = this.m().b(b, dyc.b).b(c, Boolean.valueOf($$3.a() == esy.c));
         jn $$5 = $$0.k();
         return $$5 != jn.a && ($$5 == jn.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dyc.a);
      }
   }

   @Override
   protected boolean a(dwv $$0, dae $$1) {
      cwn $$2 = $$1.n();
      dyc $$3 = $$0.c(b);
      if ($$3 == dyc.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jn $$5 = $$1.k();
         return $$3 == dyc.b ? $$5 == jn.b || $$4 && $$5.o().d() : $$5 == jn.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dgh $$0, ji $$1, dwv $$2, esx $$3) {
      return $$2.c(b) != dyc.c ? dqq.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cov $$0, dfl $$1, ji $$2, dwv $$3, esw $$4) {
      return $$3.c(b) != dyc.c ? dqq.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(awu.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
