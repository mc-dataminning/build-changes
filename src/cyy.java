import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class cyy extends czu {
   public static final MapCodec<cyy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dkc.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, cyy::new)
   );
   public static final djg b = djf.u;
   public static final djg c = djf.w;
   public static final djg d = djf.q;
   protected static final elu e = cvz.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final elu f = cvz.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final elu g = cvz.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final elu h = cvz.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final elu i = cvz.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final elu j = cvz.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final elu k = cvz.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final elu l = cvz.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final elu m = elr.a(cvz.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cvz.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final elu n = elr.a(cvz.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cvz.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final elu o = elr.a(cvz.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cvz.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final elu F = elr.a(cvz.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cvz.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dkc G;

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   public cyy(dkc $$0, dio.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ia.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ia.a.a ? f : e;
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      ia.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   public elu b_(dip $$0, cse $$1, hv $$2) {
      if ($$0.c(b)) {
         return elr.a();
      } else {
         return $$0.c(aE).o() == ia.a.c ? k : l;
      }
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      if ($$0.c(b)) {
         return elr.a();
      } else {
         return $$0.c(aE).o() == ia.a.c ? i : j;
      }
   }

   @Override
   public elu f(dip $$0, cse $$1, hv $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ia.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ia.a.a ? n : m;
      }
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      switch ($$3) {
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
   public dip a(coq $$0) {
      csy $$1 = $$0.q();
      hv $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      ia $$4 = $$0.g();
      ia.a $$5 = $$4.o();
      boolean $$6 = $$5 == ia.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == ia.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean h(dip $$0) {
      return $$0.a(arr.L);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ia $$6 = $$3.cE();
         if ($$0.c(aE) == $$6.g()) {
            $$0 = $$0.a(aE, $$6);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(b);
      $$1.a($$3, $$2, $$7 ? this.G.g() : this.G.f(), ard.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? dmz.h : dmz.d, $$2);
      return bjl.a($$1.B);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, csq $$3, BiConsumer<cmh, hv> $$4) {
      if ($$3.j() == csq.a.d && !$$1.y_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), ard.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dmz.d : dmz.h, $$2, dmz.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), ard.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dmz.h : dmz.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dip $$0, ia $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
