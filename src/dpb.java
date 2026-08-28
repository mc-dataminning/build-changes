import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpb extends dhy implements doz {
   public static final MapCodec<dpb> a = b(dpb::new);
   public static final dwb<dwl> b = dvt.bh;
   public static final dvu c = dvt.C;
   protected static final fab d = dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final fab e = dhy.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dpb> a() {
      return a;
   }

   public dpb(dvc.d $$0) {
      super($$0);
      this.l(this.m().b(b, dwl.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvd $$0) {
      return $$0.c(b) != dwl.c;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      dwl $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ezy.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      jg $$1 = $$0.a();
      dvd $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, dwl.c).b(c, Boolean.valueOf(false));
      } else {
         ere $$3 = $$0.q().b_($$1);
         dvd $$4 = this.m().b(b, dwl.b).b(c, Boolean.valueOf($$3.a() == erf.c));
         jl $$5 = $$0.k();
         return $$5 != jl.a && ($$5 == jl.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, dwl.a);
      }
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      cvx $$2 = $$1.n();
      dwl $$3 = $$0.c(b);
      if ($$3 == dwl.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jl $$5 = $$1.k();
         return $$3 == dwl.b ? $$5 == jl.b || $$4 && $$5.o().d() : $$5 == jl.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dew $$0, jg $$1, dvd $$2, ere $$3) {
      return $$2.c(b) != dwl.c ? doz.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable coh $$0, dea $$1, jg $$2, dvd $$3, erd $$4) {
      return $$3.c(b) != dwl.c ? doz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axf.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
