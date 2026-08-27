import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dda extends dcq {
   public static final MapCodec<dda> a = b(dda::new);
   public static final drb b = dha.aE;
   public static final drf<dqv> c = dqx.V;
   public static final dqy d = dqx.w;
   private static final eui f = dde.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eui g = dde.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eui h = dde.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eui i = dde.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eui j = euf.a(i, h);
   private static final eui k = euf.a(j, dde.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eui l = euf.a(j, dde.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eui m = euf.a(j, dde.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eui n = euf.a(j, dde.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eui o = euf.a(j, dde.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eui F = euf.a(j, dde.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eui G = euf.a(j, dde.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   public dda(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c).a(c, dqv.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      brh $$4 = $$3.u();
      clh $$5 = $$4 instanceof clh ? (clh)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bpm.a($$1.B) : bpm.d;
   }

   public boolean a(dad $$0, dqh $$1, etl $$2, @Nullable clh $$3, boolean $$4) {
      is $$5 = $$2.b();
      in $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avm.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dqh $$0, is $$1, double $$2) {
      if ($$1.o() != is.a.b && !($$2 > 0.8124F)) {
         is $$3 = $$0.c(b);
         dqv $$4 = $$0.c(c);
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

   public boolean a(dad $$0, in $$1, @Nullable is $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable brh $$0, dad $$1, in $$2, @Nullable is $$3) {
      dnm $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dnk) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dnk)$$4).a($$3);
         $$1.a(null, $$2, avc.bZ, avd.e, 2.0F, 1.0F);
         $$1.a($$0, dva.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eui m(dqh $$0) {
      is $$1 = $$0.c(b);
      dqv $$2 = $$0.c(c);
      if ($$2 == dqv.a) {
         return $$1 != is.c && $$1 != is.d ? g : f;
      } else if ($$2 == dqv.b) {
         return G;
      } else if ($$2 == dqv.d) {
         return $$1 != is.c && $$1 != is.d ? l : k;
      } else if ($$1 == is.c) {
         return o;
      } else if ($$1 == is.d) {
         return F;
      } else {
         return $$1 == is.f ? n : m;
      }
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.m($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.m($$0);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      is $$1 = $$0.k();
      in $$2 = $$0.a();
      dad $$3 = $$0.q();
      is.a $$4 = $$1.o();
      if ($$4 == is.a.b) {
         dqh $$5 = this.n().a(c, $$1 == is.a ? dqv.b : dqv.a).a(b, $$0.g());
         if ($$5.a((dag)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == is.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), is.f) && $$3.a_($$2.h()).d($$3, $$2.h(), is.e)
            || $$4 == is.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), is.d) && $$3.a_($$2.f()).d($$3, $$2.f(), is.c);
         dqh $$7 = this.n().a(b, $$1.g()).a(c, $$6 ? dqv.d : dqv.c);
         if ($$7.a((dag)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), is.b);
         $$7 = $$7.a(c, $$8 ? dqv.a : dqv.b);
         if ($$7.a((dag)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, czv $$3, BiConsumer<csz, in> $$4) {
      if ($$3.j() == czv.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      dqv $$6 = $$0.c(c);
      is $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dqv.d) {
         return ddg.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dqv.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dqv.c).a(b, $$1.g());
            }

            if ($$6 == dqv.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dqv.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      is $$3 = n($$0).g();
      return $$3 == is.b ? dde.a($$1, $$2.c(), is.a) : dfy.b($$1, $$2, $$3);
   }

   private static is n(dqh $$0) {
      switch ((dqv)$$0.c(c)) {
         case a:
            return is.b;
         case b:
            return is.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.E, $$0.B ? dnk::a : dnk::b);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   public dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
