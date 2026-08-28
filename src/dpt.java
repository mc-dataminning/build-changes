import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpt extends diq implements dpr {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final dws<dxc> b = dwl.bh;
   public static final dwm c = dwl.C;
   protected static final fas d = diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fas e = diq.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dpt> a() {
      return a;
   }

   public dpt(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(b, dxc.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvv $$0) {
      return $$0.c(b) != dxc.c;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      dxc $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fap.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      jh $$1 = $$0.a();
      dvv $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dxc.c).b(c, Boolean.valueOf(false));
      } else {
         erv $$3 = $$0.q().b_($$1);
         dvv $$4 = this.m().b(b, dxc.b).b(c, Boolean.valueOf($$3.a() == erw.c));
         jm $$5 = $$0.k();
         return $$5 != jm.a && ($$5 == jm.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dxc.a);
      }
   }

   @Override
   protected boolean a(dvv $$0, dad $$1) {
      cwm $$2 = $$1.n();
      dxc $$3 = $$0.c(b);
      if ($$3 == dxc.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jm $$5 = $$1.k();
         return $$3 == dxc.b ? $$5 == jm.b || $$4 && $$5.o().d() : $$5 == jm.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(c) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dfn $$0, jh $$1, dvv $$2, erv $$3) {
      return $$2.c(b) != dxc.c ? dpr.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cou $$0, der $$1, jh $$2, dvv $$3, eru $$4) {
      return $$3.c(b) != dxc.c ? dpr.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axi.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
