import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class deq extends deg {
   public static final MapCodec<deq> a = b(deq::new);
   public static final dsr b = diq.aE;
   public static final dsv<dsl> c = dsn.V;
   public static final dso d = dsn.w;
   private static final ewf f = deu.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ewf g = deu.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ewf h = deu.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ewf i = deu.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ewf j = ewc.a(i, h);
   private static final ewf k = ewc.a(j, deu.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ewf l = ewc.a(j, deu.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ewf m = ewc.a(j, deu.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ewf n = ewc.a(j, deu.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ewf o = ewc.a(j, deu.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ewf F = ewc.a(j, deu.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ewf G = ewc.a(j, deu.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   public deq(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dsl.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      bsp $$4 = $$3.s();
      cms $$5 = $$4 instanceof cms ? (cms)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bqp.a($$1.B) : bqp.e;
   }

   public boolean a(dbt $$0, drx $$1, evi $$2, @Nullable cms $$3, boolean $$4) {
      je $$5 = $$2.b();
      iz $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awg.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(drx $$0, je $$1, double $$2) {
      if ($$1.o() != je.a.b && !($$2 > 0.8124F)) {
         je $$3 = $$0.c(b);
         dsl $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dbt $$0, iz $$1, @Nullable je $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bsp $$0, dbt $$1, iz $$2, @Nullable je $$3) {
      dpc $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dpa) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dpa)$$4).a($$3);
         $$1.a(null, $$2, avw.bZ, avx.e, 2.0F, 1.0F);
         $$1.a($$0, dwq.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ewf m(drx $$0) {
      je $$1 = $$0.c(b);
      dsl $$2 = $$0.c(c);
      if ($$2 == dsl.a) {
         return $$1 != je.c && $$1 != je.d ? g : f;
      } else if ($$2 == dsl.b) {
         return G;
      } else if ($$2 == dsl.d) {
         return $$1 != je.c && $$1 != je.d ? l : k;
      } else if ($$1 == je.c) {
         return o;
      } else if ($$1 == je.d) {
         return F;
      } else {
         return $$1 == je.f ? n : m;
      }
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.m($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.m($$0);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      dbt $$3 = $$0.q();
      je.a $$4 = $$1.o();
      if ($$4 == je.a.b) {
         drx $$5 = this.n().a(c, $$1 == je.a ? dsl.b : dsl.a).a(b, $$0.g());
         if ($$5.a((dbw)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == je.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), je.f) && $$3.a_($$2.h()).d($$3, $$2.h(), je.e)
            || $$4 == je.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), je.d) && $$3.a_($$2.f()).d($$3, $$2.f(), je.c);
         drx $$7 = this.n().a(b, $$1.g()).a(c, $$6 ? dsl.d : dsl.c);
         if ($$7.a((dbw)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), je.b);
         $$7 = $$7.a(c, $$8 ? dsl.a : dsl.b);
         if ($$7.a((dbw)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, dbl $$3, BiConsumer<cuk, iz> $$4) {
      if ($$3.j() == dbl.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      dsl $$6 = $$0.c(c);
      je $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dsl.d) {
         return dew.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dsl.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dsl.c).a(b, $$1.g());
            }

            if ($$6 == dsl.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dsl.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      je $$3 = n($$0).g();
      return $$3 == je.b ? deu.a($$1, $$2.c(), je.a) : dho.b($$1, $$2, $$3);
   }

   private static je n(drx $$0) {
      switch ((dsl)$$0.c(c)) {
         case a:
            return je.b;
         case b:
            return je.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.E, $$0.B ? dpa::a : dpa::b);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   public drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
