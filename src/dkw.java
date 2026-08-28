import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkw extends dlt {
   public static final MapCodec<dkw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwq.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dkw::new)
   );
   public static final dvu b = dvt.u;
   public static final dvu c = dvt.w;
   public static final dvu d = dvt.q;
   protected static final fab e = dhy.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fab f = dhy.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final fab g = dhy.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final fab h = dhy.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final fab i = dhy.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fab j = dhy.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fab k = dhy.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final fab l = dhy.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final fab m = ezy.a(dhy.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dhy.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final fab n = ezy.a(dhy.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dhy.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final fab o = ezy.a(dhy.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dhy.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final fab G = ezy.a(dhy.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dhy.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dwq H;

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(dwq $$0, dvc.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jl.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jl.a.a ? f : e;
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      jl.a $$6 = $$1.o();
      if ($$0.c(aF).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.o($$2) || this.o($$3.a_($$4.a($$1.g())));
         return $$0.b(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected fab b_(dvd $$0, dea $$1, jg $$2) {
      if ($$0.c(b)) {
         return ezy.a();
      } else {
         return $$0.c(aF).o() == jl.a.c ? k : l;
      }
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if ($$0.c(b)) {
         return ezy.a();
      } else {
         return $$0.c(aF).o() == jl.a.c ? i : j;
      }
   }

   @Override
   protected fab d_(dvd $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jl.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jl.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public dvd a(czm $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jl $$4 = $$0.g();
      jl.a $$5 = $$4.o();
      boolean $$6 = $$5 == jl.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jl.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.m().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dvd $$0) {
      return $$0.a(awz.M);
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jl $$5 = $$3.cP();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awl.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? eaa.h : eaa.d, $$2);
      return bry.a;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      if ($$3.f() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awl.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? eaa.d : eaa.h, $$2, eaa.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awl.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? eaa.h : eaa.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dvd $$0, jl $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
