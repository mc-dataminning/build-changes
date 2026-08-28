import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dki extends dlf {
   public static final MapCodec<dki> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwb.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), u()).apply($$0, dki::new)
   );
   public static final dvf b = dve.u;
   public static final dvf c = dve.w;
   public static final dvf d = dve.q;
   protected static final ezm e = dhj.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ezm f = dhj.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ezm g = dhj.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ezm h = dhj.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ezm i = dhj.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ezm j = dhj.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ezm k = dhj.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ezm l = dhj.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ezm m = ezj.a(dhj.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dhj.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ezm n = ezj.a(dhj.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dhj.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ezm o = ezj.a(dhj.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dhj.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ezm G = ezj.a(dhj.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dhj.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dwb H;

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(dwb $$0, dun.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jj.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jj.a.a ? f : e;
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      jj.a $$6 = $$1.o();
      if ($$0.c(aF).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.o($$2) || this.o($$3.a_($$4.a($$1.g())));
         return $$0.b(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ezm b_(duo $$0, ddl $$1, je $$2) {
      if ($$0.c(b)) {
         return ezj.a();
      } else {
         return $$0.c(aF).o() == jj.a.c ? k : l;
      }
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if ($$0.c(b)) {
         return ezj.a();
      } else {
         return $$0.c(aF).o() == jj.a.c ? i : j;
      }
   }

   @Override
   protected ezm d_(duo $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jj.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jj.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
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
   public duo a(czk $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jj $$4 = $$0.g();
      jj.a $$5 = $$4.o();
      boolean $$6 = $$5 == jj.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jj.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.o().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(duo $$0) {
      return $$0.a(awt.M);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jj $$5 = $$3.cL();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awf.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dzl.h : dzl.d, $$2);
      return brp.a;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      if ($$3.f() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awf.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dzl.d : dzl.h, $$2, dzl.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awf.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dzl.h : dzl.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(duo $$0, jj $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
