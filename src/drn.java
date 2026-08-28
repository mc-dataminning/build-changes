import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drn extends dke implements drl {
   public static final MapCodec<drn> a = b(drn::new);
   public static final dyo<dyy> b = dyg.bk;
   public static final dyh c = dyg.I;
   private static final fcr d = dke.b(16.0, 0.0, 8.0);
   private static final fcr e = dke.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends drn> a() {
      return a;
   }

   public drn(dxp.d $$0) {
      super($$0);
      this.l(this.m().b(b, dyy.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxq $$0) {
      return $$0.c(b) != dyy.c;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return switch ((dyy)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fco.b();
      };
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      ji $$1 = $$0.a();
      dxq $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dyy.c).b(c, Boolean.valueOf(false));
      } else {
         etw $$3 = $$0.q().b_($$1);
         dxq $$4 = this.m().b(b, dyy.b).b(c, Boolean.valueOf($$3.a() == etx.c));
         jn $$5 = $$0.k();
         return $$5 != jn.a && ($$5 == jn.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dyy.a);
      }
   }

   @Override
   protected boolean a(dxq $$0, dax $$1) {
      cxh $$2 = $$1.n();
      dyy $$3 = $$0.c(b);
      if ($$3 == dyy.c || !$$2.a(this.i())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jn $$5 = $$1.k();
         return $$3 == dyy.b ? $$5 == jn.b || $$4 && $$5.o().d() : $$5 == jn.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dha $$0, ji $$1, dxq $$2, etw $$3) {
      return $$2.c(b) != dyy.c ? drl.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable bvy $$0, dgf $$1, ji $$2, dxq $$3, etv $$4) {
      return $$3.c(b) != dyy.c ? drl.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
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
