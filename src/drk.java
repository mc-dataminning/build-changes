import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drk extends dke implements dri {
   public static final MapCodec<drk> a = b(drk::new);
   public static final dyk<dyu> b = dyd.bi;
   public static final dye c = dyd.D;
   protected static final fcm d = dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fcm e = dke.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends drk> a() {
      return a;
   }

   public drk(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(b, dyu.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxn $$0) {
      return $$0.c(b) != dyu.c;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      dyu $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fcj.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      jh $$1 = $$0.a();
      dxn $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dyu.c).b(c, Boolean.valueOf(false));
      } else {
         etp $$3 = $$0.q().b_($$1);
         dxn $$4 = this.m().b(b, dyu.b).b(c, Boolean.valueOf($$3.a() == etq.c));
         jm $$5 = $$0.k();
         return $$5 != jm.a && ($$5 == jm.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dyu.a);
      }
   }

   @Override
   protected boolean a(dxn $$0, dbb $$1) {
      cxk $$2 = $$1.n();
      dyu $$3 = $$0.c(b);
      if ($$3 == dyu.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jm $$5 = $$1.k();
         return $$3 == dyu.b ? $$5 == jm.b || $$4 && $$5.o().d() : $$5 == jm.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(c) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dhb $$0, jh $$1, dxn $$2, etp $$3) {
      return $$2.c(b) != dyu.c ? dri.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cps $$0, dgf $$1, jh $$2, dxn $$3, eto $$4) {
      return $$3.c(b) != dyu.c ? dri.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(aya.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
