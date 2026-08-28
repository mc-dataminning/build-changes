import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhu extends dhk {
   public static final MapCodec<dhu> a = b(dhu::new);
   public static final dvx b = dlt.aF;
   public static final dwb<dvr> c = dvt.V;
   public static final dvu d = dvt.w;
   private static final fab f = dhy.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final fab g = dhy.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final fab h = dhy.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final fab i = dhy.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final fab j = ezy.a(i, h);
   private static final fab k = ezy.a(j, dhy.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final fab l = ezy.a(j, dhy.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fab m = ezy.a(j, dhy.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final fab n = ezy.a(j, dhy.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final fab o = ezy.a(j, dhy.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final fab G = ezy.a(j, dhy.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final fab H = ezy.a(j, dhy.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public dhu(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.c).b(c, dvr.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      btz $$4 = $$3.s();
      coh $$5 = $$4 instanceof coh ? (coh)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      return (bry)(this.a($$1, $$0, $$4, $$3, true) ? bry.a : bry.e);
   }

   public boolean a(dev $$0, dvd $$1, ezd $$2, @Nullable coh $$3, boolean $$4) {
      jl $$5 = $$2.c();
      jg $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awu.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dvd $$0, jl $$1, double $$2) {
      if ($$1.o() != jl.a.b && !($$2 > 0.8124F)) {
         jl $$3 = $$0.c(b);
         dvr $$4 = $$0.c(c);
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

   public boolean a(dev $$0, jg $$1, @Nullable jl $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable btz $$0, dev $$1, jg $$2, @Nullable jl $$3) {
      dsg $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dse) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dse)$$4).a($$3);
         $$1.a(null, $$2, awk.bZ, awl.e, 2.0F, 1.0F);
         $$1.a($$0, eaa.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fab o(dvd $$0) {
      jl $$1 = $$0.c(b);
      dvr $$2 = $$0.c(c);
      if ($$2 == dvr.a) {
         return $$1 != jl.c && $$1 != jl.d ? g : f;
      } else if ($$2 == dvr.b) {
         return H;
      } else if ($$2 == dvr.d) {
         return $$1 != jl.c && $$1 != jl.d ? l : k;
      } else if ($$1 == jl.c) {
         return o;
      } else if ($$1 == jl.d) {
         return G;
      } else {
         return $$1 == jl.f ? n : m;
      }
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.o($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.o($$0);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      jl $$1 = $$0.k();
      jg $$2 = $$0.a();
      dev $$3 = $$0.q();
      jl.a $$4 = $$1.o();
      if ($$4 == jl.a.b) {
         dvd $$5 = this.m().b(c, $$1 == jl.a ? dvr.b : dvr.a).b(b, $$0.g());
         if ($$5.a((dey)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jl.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jl.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jl.e)
            || $$4 == jl.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jl.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jl.c);
         dvd $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dvr.d : dvr.c);
         if ($$7.a((dey)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jl.b);
         $$7 = $$7.b(c, $$8 ? dvr.a : dvr.b);
         if ($$7.a((dey)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      if ($$3.f()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      dvr $$6 = $$0.c(c);
      jl $$7 = q($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dvr.d) {
         return dia.a.m();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dvr.d && !$$2.c($$3, $$5, $$1)) {
               return $$0.b(c, dvr.c).b(b, $$1.g());
            }

            if ($$6 == dvr.c && $$7.g() == $$1 && $$2.c($$3, $$5, $$0.c(b))) {
               return $$0.b(c, dvr.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jl $$3 = q($$0).g();
      return $$3 == jl.b ? dhy.a($$1, $$2.d(), jl.a) : dkr.b($$1, $$2, $$3);
   }

   private static jl q(dvd $$0) {
      switch ((dvr)$$0.c(c)) {
         case a:
            return jl.b;
         case b:
            return jl.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dse($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.E, $$0.C ? dse::a : dse::b);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   public dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
