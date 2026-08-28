import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmu extends dkm {
   public static final MapCodec<dmu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyk.a.fieldOf("block_set_type").forGetter(dmu::b), t()).apply($$0, dmu::new)
   );
   public static final dys<jm> b = dok.aF;
   public static final dym c = dyl.v;
   public static final dys<dyp> d = dyl.bf;
   public static final dym e = dyl.x;
   public static final dys<dyq> f = dyl.af;
   protected static final float g = 3.0F;
   protected static final fcs h = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fcs i = dkm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fcs j = dkm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fcs k = dkm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dyk l;

   @Override
   public MapCodec<? extends dmu> a() {
      return a;
   }

   protected dmu(dyk $$0, dxu.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, dyp.a).b(e, Boolean.valueOf(false)).b(f, dyq.b));
   }

   public dyk b() {
      return this.l;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      jm $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dyp.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      dyq $$8 = $$0.c(f);
      if ($$4.o() != jm.a.b || $$8 == dyq.b != ($$4 == jm.b)) {
         return $$8 == dyq.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dmu && $$6.c(f) != $$8 ? $$6.b(f, $$8) : dko.a.m();
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, dha $$3, BiConsumer<cxp, jh> $$4) {
      if ($$3.g() && $$0.c(f) == dyq.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dmw.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      jh $$1 = $$0.a();
      dhi $$2 = $$0.q();
      if ($$1.v() < $$2.am() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dyq.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bwg $$3, cxp $$4) {
      $$0.a($$1.d(), $$2.b(f, dyq.a), 3);
   }

   private dyp b(dbg $$0) {
      dgn $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.g();
      jh $$4 = $$2.d();
      jm $$5 = $$3.i();
      jh $$6 = $$2.a($$5);
      dxv $$7 = $$1.a_($$6);
      jh $$8 = $$4.a($$5);
      dxv $$9 = $$1.a_($$8);
      jm $$10 = $$3.h();
      jh $$11 = $$2.a($$10);
      dxv $$12 = $$1.a_($$11);
      jh $$13 = $$4.a($$10);
      dxv $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dmu && $$7.c(f) == dyq.b;
      boolean $$17 = $$12.b() instanceof dmu && $$12.c(f) == dyq.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fby $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dyp.a : dyp.b;
         } else {
            return dyp.a;
         }
      } else {
         return dyp.b;
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!this.l.c()) {
         return btj.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? ecr.h : ecr.d, $$2);
         return btj.a;
      }
   }

   public boolean n(dxv $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bvk $$0, dhi $$1, dxv $$2, jh $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ecr.h : ecr.d, $$3);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dyq.b ? jm.b : jm.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ecr.h : ecr.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxv $$4 = $$1.a_($$3);
      return $$0.c(f) == dyq.b ? $$4.c($$1, $$3, jm.b) : $$4.a(this);
   }

   private void a(@Nullable bvk $$0, dhi $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), axg.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$1 == dpl.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dxv $$0, jh $$1) {
      return bae.b($$1.u(), $$1.c($$0.c(f) == dyq.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dhi $$0, jh $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dxv $$0) {
      if ($$0.b() instanceof dmu $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
