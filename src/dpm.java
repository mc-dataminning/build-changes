import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpm extends dij implements dpk {
   public static final MapCodec<dpm> a = b(dpm::new);
   public static final dwl<dwv> b = dwe.bh;
   public static final dwf c = dwe.C;
   protected static final fal d = dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fal e = dij.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dpm> a() {
      return a;
   }

   public dpm(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(b, dwv.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvo $$0) {
      return $$0.c(b) != dwv.c;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      dwv $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return fai.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      jh $$1 = $$0.a();
      dvo $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dwv.c).b(c, Boolean.valueOf(false));
      } else {
         ero $$3 = $$0.q().b_($$1);
         dvo $$4 = this.m().b(b, dwv.b).b(c, Boolean.valueOf($$3.a() == erp.c));
         jm $$5 = $$0.k();
         return $$5 != jm.a && ($$5 == jm.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dwv.a);
      }
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      cwf $$2 = $$1.n();
      dwv $$3 = $$0.c(b);
      if ($$3 == dwv.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jm $$5 = $$1.k();
         return $$3 == dwv.b ? $$5 == jm.b || $$4 && $$5.o().d() : $$5 == jm.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dfg $$0, jh $$1, dvo $$2, ero $$3) {
      return $$2.c(b) != dwv.c ? dpk.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cor $$0, dek $$1, jh $$2, dvo $$3, ern $$4) {
      return $$3.c(b) != dwv.c ? dpk.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axj.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
