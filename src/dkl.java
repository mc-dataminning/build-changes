import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkl extends dli {
   public static final MapCodec<dkl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwf.a.fieldOf("wood_type").forGetter($$0x -> $$0x.H), t()).apply($$0, dkl::new)
   );
   public static final dvj b = dvi.u;
   public static final dvj c = dvi.w;
   public static final dvj d = dvi.q;
   protected static final ezq e = dhm.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ezq f = dhm.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ezq g = dhm.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ezq h = dhm.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ezq i = dhm.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ezq j = dhm.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ezq k = dhm.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ezq l = dhm.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ezq m = ezn.a(dhm.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dhm.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ezq n = ezn.a(dhm.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dhm.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ezq o = ezn.a(dhm.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dhm.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ezq G = ezn.a(dhm.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dhm.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final dwf H;

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public dkl(dwf $$0, dur.d $$1) {
      super($$1.a($$0.d()));
      this.H = $$0;
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jk.a.a ? h : g;
      } else {
         return $$0.c(aF).o() == jk.a.a ? f : e;
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      jk.a $$6 = $$1.o();
      if ($$0.c(aF).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.o($$2) || this.o($$3.a_($$4.a($$1.g())));
         return $$0.b(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      if ($$0.c(b)) {
         return ezn.a();
      } else {
         return $$0.c(aF).o() == jk.a.c ? k : l;
      }
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if ($$0.c(b)) {
         return ezn.a();
      } else {
         return $$0.c(aF).o() == jk.a.c ? i : j;
      }
   }

   @Override
   protected ezq d_(dus $$0) {
      if ($$0.c(d)) {
         return $$0.c(aF).o() == jk.a.a ? G : o;
      } else {
         return $$0.c(aF).o() == jk.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
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
   public dus a(czn $$0) {
      dej $$1 = $$0.q();
      jf $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      jk $$4 = $$0.g();
      jk.a $$5 = $$4.o();
      boolean $$6 = $$5 == jk.a.c && (this.o($$1.a_($$2.h())) || this.o($$1.a_($$2.i())))
         || $$5 == jk.a.a && (this.o($$1.a_($$2.f())) || this.o($$1.a_($$2.g())));
      return this.n().b(aF, $$4).b(b, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(d, Boolean.valueOf($$6));
   }

   private boolean o(dus $$0) {
      return $$0.a(awv.M);
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.b(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         jk $$5 = $$3.cL();
         if ($$0.c(aF) == $$5.g()) {
            $$0 = $$0.b(aF, $$5);
         }

         $$0 = $$0.b(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.H.g() : this.H.f(), awh.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dzp.h : dzp.d, $$2);
      return brs.a;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      if ($$3.f() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.b(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.H.f() : this.H.g(), awh.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dzp.d : dzp.h, $$2, dzp.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)).b(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.H.g() : this.H.f(), awh.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dzp.h : dzp.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF, b, c, d);
   }

   public static boolean a(dus $$0, jk $$1) {
      return $$0.c(aF).o() == $$1.h().o();
   }
}
