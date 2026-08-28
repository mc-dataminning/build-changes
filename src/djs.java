import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djs extends dhm {
   public static final MapCodec<djs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvh.a.fieldOf("block_set_type").forGetter(djs::b), t()).apply($$0, djs::new)
   );
   public static final dvm b = dli.aF;
   public static final dvj c = dvi.u;
   public static final dvq<dvn> d = dvi.be;
   public static final dvj e = dvi.w;
   public static final dvq<dvo> f = dvi.ae;
   protected static final float g = 3.0F;
   protected static final ezq h = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ezq i = dhm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ezq j = dhm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezq k = dhm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dvh l;

   @Override
   public MapCodec<? extends djs> a() {
      return a;
   }

   protected djs(dvh $$0, dur.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jk.c).b(c, Boolean.valueOf(false)).b(d, dvn.a).b(e, Boolean.valueOf(false)).b(f, dvo.b));
   }

   public dvh b() {
      return this.l;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      jk $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dvn.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      dvo $$6 = $$0.c(f);
      if ($$1.o() != jk.a.b || $$6 == dvo.b != ($$1 == jk.b)) {
         return $$6 == dvo.b && $$1 == jk.a && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof djs && $$2.c(f) != $$6 ? $$2.b(f, $$6) : dho.a.n();
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      if ($$3.f() && $$0.c(f) == dvo.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$0.B && ($$3.f() || !$$3.d($$2))) {
         dju.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      jf $$1 = $$0.a();
      dej $$2 = $$0.q();
      if ($$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.n().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dvo.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
      $$0.a($$1.d(), $$2.b(f, dvo.a), 3);
   }

   private dvn b(czn $$0) {
      ddo $$1 = $$0.q();
      jf $$2 = $$0.a();
      jk $$3 = $$0.g();
      jf $$4 = $$2.d();
      jk $$5 = $$3.i();
      jf $$6 = $$2.a($$5);
      dus $$7 = $$1.a_($$6);
      jf $$8 = $$4.a($$5);
      dus $$9 = $$1.a_($$8);
      jk $$10 = $$3.h();
      jf $$11 = $$2.a($$10);
      dus $$12 = $$1.a_($$11);
      jf $$13 = $$4.a($$10);
      dus $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof djs && $$7.c(f) == dvo.b;
      boolean $$17 = $$12.b() instanceof djs && $$12.c(f) == dvo.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eyw $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dvn.a : dvn.b;
         } else {
            return dvn.a;
         }
      } else {
         return dvn.b;
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!this.l.c()) {
         return brs.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? dzp.h : dzp.d, $$2);
         return brs.a;
      }
   }

   public boolean n(dus $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable btr $$0, dej $$1, dus $$2, jf $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dzp.h : dzp.d, $$3);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dvo.b ? jk.b : jk.a));
      if (!this.n().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dzp.h : dzp.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      dus $$4 = $$1.a_($$3);
      return $$0.c(f) == dvo.b ? $$4.c($$1, $$3, jk.b) : $$4.a(this);
   }

   private void a(@Nullable btr $$0, dej $$1, jf $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awh.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$1 == dmj.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dus $$0, jf $$1) {
      return azf.b($$1.u(), $$1.c($$0.c(f) == dvo.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dej $$0, jf $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dus $$0) {
      if ($$0.b() instanceof djs $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
