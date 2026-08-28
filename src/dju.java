import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dju extends dkr {
   public static final MapCodec<dju> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvn.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dju::new)
   );
   public static final dur b = duq.u;
   public static final dur c = duq.w;
   public static final dur d = duq.q;
   protected static final eyx e = dgv.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eyx f = dgv.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final eyx g = dgv.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final eyx h = dgv.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final eyx i = dgv.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eyx j = dgv.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eyx k = dgv.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final eyx l = dgv.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final eyx m = eyu.a(dgv.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dgv.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final eyx n = eyu.a(dgv.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dgv.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final eyx o = eyu.a(dgv.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dgv.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final eyx F = eyu.a(dgv.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dgv.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dvn G;

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(dvn $$0, dtz.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.l(this.E.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == jj.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == jj.a.a ? f : e;
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      jj.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.o($$2) || this.o($$3.a_($$4.a($$1.g())));
         return $$0.b(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected eyx b_(dua $$0, dcx $$1, je $$2) {
      if ($$0.c(b)) {
         return eyu.a();
      } else {
         return $$0.c(aE).o() == jj.a.c ? k : l;
      }
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if ($$0.c(b)) {
         return eyu.a();
      } else {
         return $$0.c(aE).o() == jj.a.c ? i : j;
      }
   }

   @Override
   protected eyx d_(dua $$0) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == jj.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == jj.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
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
   public dua a(cyw $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jj $$4 = $$0.g();
      jj.a $$5 = $$4.o();
      boolean $$6 = $$5 == jj.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jj.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.o().b(aE, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dua $$0) {
      return $$0.a(aws.M);
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jj $$5 = $$3.cL();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.b(aE, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), awe.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dyx.h : dyx.d, $$2);
      return brk.a;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      if ($$3.f() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), awe.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dyx.d : dyx.h, $$2, dyx.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), awe.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dyx.h : dyx.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dua $$0, jj $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
