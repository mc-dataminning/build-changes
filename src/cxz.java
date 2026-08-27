import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxz extends cyv {
   public static final MapCodec<cxz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(div.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, cxz::new)
   );
   public static final dhz b = dhy.u;
   public static final dhz c = dhy.w;
   public static final dhz d = dhy.q;
   protected static final ekn e = cva.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ekn f = cva.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ekn g = cva.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ekn h = cva.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ekn i = cva.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ekn j = cva.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ekn k = cva.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ekn l = cva.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ekn m = ekk.a(cva.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), cva.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ekn n = ekk.a(cva.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), cva.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ekn o = ekk.a(cva.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), cva.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ekn F = ekk.a(cva.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), cva.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final div G;

   @Override
   public MapCodec<cxz> a() {
      return a;
   }

   public cxz(div $$0, dhh.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == hx.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == hx.a.a ? f : e;
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      hx.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.h($$2) || this.h($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   public ekn b_(dhi $$0, crg $$1, ht $$2) {
      if ($$0.c(b)) {
         return ekk.a();
      } else {
         return $$0.c(aE).o() == hx.a.c ? k : l;
      }
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if ($$0.c(b)) {
         return ekk.a();
      } else {
         return $$0.c(aE).o() == hx.a.c ? i : j;
      }
   }

   @Override
   public ekn f(dhi $$0, crg $$1, ht $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == hx.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == hx.a.a ? n : m;
      }
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
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
   public dhi a(cnr $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      boolean $$3 = $$1.B($$2);
      hx $$4 = $$0.g();
      hx.a $$5 = $$4.o();
      boolean $$6 = $$5 == hx.a.c && (this.h($$1.a_($$2.g())) || this.h($$1.a_($$2.h())))
         || $$5 == hx.a.a && (this.h($$1.a_($$2.e())) || this.h($$1.a_($$2.f())));
      return this.o().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean h(dhi $$0) {
      return $$0.a(arg.L);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         hx $$6 = $$3.cE();
         if ($$0.c(aE) == $$6.g()) {
            $$0 = $$0.a(aE, $$6);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$7 = $$0.c(b);
      $$1.a($$3, $$2, $$7 ? this.G.g() : this.G.f(), aqs.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$7 ? dls.h : dls.d, $$2);
      return bix.a($$1.B);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.B($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), aqs.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dls.h : dls.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dhi $$0, hx $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
