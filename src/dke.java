import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dke extends dhy {
   public static final MapCodec<dke> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvs.a.fieldOf("block_set_type").forGetter(dke::b), t()).apply($$0, dke::new)
   );
   public static final dvx b = dlt.aF;
   public static final dvu c = dvt.u;
   public static final dwb<dvy> d = dvt.be;
   public static final dvu e = dvt.w;
   public static final dwb<dvz> f = dvt.ae;
   protected static final float g = 3.0F;
   protected static final fab h = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fab i = dhy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fab j = dhy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fab k = dhy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dvs l;

   @Override
   public MapCodec<? extends dke> a() {
      return a;
   }

   protected dke(dvs $$0, dvc.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jl.c).b(c, Boolean.valueOf(false)).b(d, dvy.a).b(e, Boolean.valueOf(false)).b(f, dvz.b));
   }

   public dvs b() {
      return this.l;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      jl $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dvy.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      dvz $$6 = $$0.c(f);
      if ($$1.o() != jl.a.b || $$6 == dvz.b != ($$1 == jl.b)) {
         return $$6 == dvz.b && $$1 == jl.a && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dke && $$2.c(f) != $$6 ? $$2.b(f, $$6) : dia.a.m();
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      if ($$3.f() && $$0.c(f) == dvz.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$0.C && ($$3.f() || !$$3.d($$2))) {
         dkg.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      jg $$1 = $$0.a();
      dev $$2 = $$0.q();
      if ($$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dvz.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
      $$0.a($$1.d(), $$2.b(f, dvz.a), 3);
   }

   private dvy b(czm $$0) {
      dea $$1 = $$0.q();
      jg $$2 = $$0.a();
      jl $$3 = $$0.g();
      jg $$4 = $$2.d();
      jl $$5 = $$3.i();
      jg $$6 = $$2.a($$5);
      dvd $$7 = $$1.a_($$6);
      jg $$8 = $$4.a($$5);
      dvd $$9 = $$1.a_($$8);
      jl $$10 = $$3.h();
      jg $$11 = $$2.a($$10);
      dvd $$12 = $$1.a_($$11);
      jg $$13 = $$4.a($$10);
      dvd $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dke && $$7.c(f) == dvz.b;
      boolean $$17 = $$12.b() instanceof dke && $$12.c(f) == dvz.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ezh $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dvy.a : dvy.b;
         } else {
            return dvy.a;
         }
      } else {
         return dvy.b;
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!this.l.c()) {
         return bry.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? eaa.h : eaa.d, $$2);
         return bry.a;
      }
   }

   public boolean n(dvd $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable btz $$0, dev $$1, dvd $$2, jg $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? eaa.h : eaa.d, $$3);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dvz.b ? jl.b : jl.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? eaa.h : eaa.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      dvd $$4 = $$1.a_($$3);
      return $$0.c(f) == dvz.b ? $$4.c($$1, $$3, jl.b) : $$4.a(this);
   }

   private void a(@Nullable btz $$0, dev $$1, jg $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awl.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$1 == dmu.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dvd $$0, jg $$1) {
      return azj.b($$1.u(), $$1.c($$0.c(f) == dvz.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dev $$0, jg $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dvd $$0) {
      if ($$0.b() instanceof dke $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
