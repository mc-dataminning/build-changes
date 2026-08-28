import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dit extends djl implements dkb {
   public static final MapCodec<dit> a = b(dit::new);
   public static final dvm<dvh> b = dve.bd;

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   public dit(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jj.c).b(d, Boolean.valueOf(false)).b(b, dvh.a));
   }

   @Override
   protected int h(duo $$0) {
      return 2;
   }

   @Override
   public duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.a && !this.b($$3, $$5, $$2) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(ddl $$0, je $$1, duo $$2) {
      drs $$3 = $$0.c_($$1);
      return $$3 instanceof dsd ? ((dsd)$$3).b() : 0;
   }

   private int e(deg $$0, je $$1, duo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dex)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dvh.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(deg $$0, je $$1, duo $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dex)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dvh.a;
      }
   }

   @Override
   protected int b(deg $$0, je $$1, duo $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jj $$4 = $$2.c(aF);
      je $$5 = $$1.a($$4);
      duo $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cjx $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.F(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cjx a(deg $$0, jj $$1, je $$2) {
      List<cjx> $$3 = $$0.a(
         cjx.class,
         new eyn((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cL() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$3.gd().e) {
         return brp.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dvh.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awe.fs, awf.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return brp.a;
      }
   }

   @Override
   protected void c(deg $$0, je $$1, duo $$2) {
      if (!$$0.R().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         drs $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dsd ? ((dsd)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fao $$6 = this.b($$0, $$1, $$2) ? fao.c : fao.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(deg $$0, je $$1, duo $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      drs $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dsd $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dvh.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(duo $$0, deg $$1, je $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      drs $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsd($$0, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF, b, d);
   }
}
