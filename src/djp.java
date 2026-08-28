import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djp extends dhj {
   public static final MapCodec<djp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvd.a.fieldOf("block_set_type").forGetter(djp::b), u()).apply($$0, djp::new)
   );
   public static final dvi b = dlf.aF;
   public static final dvf c = dve.u;
   public static final dvm<dvj> d = dve.be;
   public static final dvf e = dve.w;
   public static final dvm<dvk> f = dve.ae;
   protected static final float g = 3.0F;
   protected static final ezm h = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ezm i = dhj.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ezm j = dhj.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezm k = dhj.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dvd l;

   @Override
   public MapCodec<? extends djp> a() {
      return a;
   }

   protected djp(dvd $$0, dun.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jj.c).b(c, Boolean.valueOf(false)).b(d, dvj.a).b(e, Boolean.valueOf(false)).b(f, dvk.b));
   }

   public dvd b() {
      return this.l;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      jj $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dvj.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      dvk $$6 = $$0.c(f);
      if ($$1.o() != jj.a.b || $$6 == dvk.b != ($$1 == jj.b)) {
         return $$6 == dvk.b && $$1 == jj.a && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof djp && $$2.c(f) != $$6 ? $$2.b(f, $$6) : dhl.a.o();
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      if ($$3.f() && $$0.c(f) == dvk.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$0.B && ($$3.f() || !$$3.d($$2))) {
         djr.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      je $$1 = $$0.a();
      deg $$2 = $$0.q();
      if ($$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.o().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dvk.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
      $$0.a($$1.d(), $$2.b(f, dvk.a), 3);
   }

   private dvj b(czk $$0) {
      ddl $$1 = $$0.q();
      je $$2 = $$0.a();
      jj $$3 = $$0.g();
      je $$4 = $$2.d();
      jj $$5 = $$3.i();
      je $$6 = $$2.a($$5);
      duo $$7 = $$1.a_($$6);
      je $$8 = $$4.a($$5);
      duo $$9 = $$1.a_($$8);
      jj $$10 = $$3.h();
      je $$11 = $$2.a($$10);
      duo $$12 = $$1.a_($$11);
      je $$13 = $$4.a($$10);
      duo $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof djp && $$7.c(f) == dvk.b;
      boolean $$17 = $$12.b() instanceof djp && $$12.c(f) == dvk.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eys $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dvj.a : dvj.b;
         } else {
            return dvj.a;
         }
      } else {
         return dvj.b;
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!this.l.c()) {
         return brp.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? dzl.h : dzl.d, $$2);
         return brp.a;
      }
   }

   public boolean n(duo $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bto $$0, deg $$1, duo $$2, je $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dzl.h : dzl.d, $$3);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dvk.b ? jj.b : jj.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dzl.h : dzl.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      duo $$4 = $$1.a_($$3);
      return $$0.c(f) == dvk.b ? $$4.c($$1, $$3, jj.b) : $$4.a(this);
   }

   private void a(@Nullable bto $$0, deg $$1, je $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awf.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$1 == dmg.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(duo $$0, je $$1) {
      return azd.b($$1.u(), $$1.c($$0.c(f) == dvk.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(deg $$0, je $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(duo $$0) {
      if ($$0.b() instanceof djp $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
