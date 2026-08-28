import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlr extends djk {
   public static final MapCodec<dlr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.fieldOf("block_set_type").forGetter(dlr::b), t()).apply($$0, dlr::new)
   );
   public static final dxs<jn> b = dni.aF;
   public static final dxm c = dxl.z;
   public static final dxs<dxp> d = dxl.bh;
   public static final dxm e = dxl.B;
   public static final dxs<dxq> f = dxl.ah;
   protected static final float g = 3.0F;
   protected static final fbs h = djk.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbs i = djk.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fbs j = djk.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbs k = djk.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dxk l;

   @Override
   public MapCodec<? extends dlr> a() {
      return a;
   }

   protected dlr(dxk $$0, dwu.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, dxp.a).b(e, Boolean.valueOf(false)).b(f, dxq.b));
   }

   public dxk b() {
      return this.l;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      jn $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dxp.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      dxq $$8 = $$0.c(f);
      if ($$4.o() != jn.a.b || $$8 == dxq.b != ($$4 == jn.b)) {
         return $$8 == dxq.b && $$4 == jn.a && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dlr && $$6.c(f) != $$8 ? $$6.b(f, $$8) : djm.a.m();
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      if ($$3.g() && $$0.c(f) == dxq.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dlt.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      ji $$1 = $$0.a();
      dgg $$2 = $$0.q();
      if ($$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dxq.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, bvf $$3, cwn $$4) {
      $$0.a($$1.d(), $$2.b(f, dxq.a), 3);
   }

   private dxp b(dae $$0) {
      dfl $$1 = $$0.q();
      ji $$2 = $$0.a();
      jn $$3 = $$0.g();
      ji $$4 = $$2.d();
      jn $$5 = $$3.i();
      ji $$6 = $$2.a($$5);
      dwv $$7 = $$1.a_($$6);
      ji $$8 = $$4.a($$5);
      dwv $$9 = $$1.a_($$8);
      jn $$10 = $$3.h();
      ji $$11 = $$2.a($$10);
      dwv $$12 = $$1.a_($$11);
      ji $$13 = $$4.a($$10);
      dwv $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dlr && $$7.c(f) == dxq.b;
      boolean $$17 = $$12.b() instanceof dlr && $$12.c(f) == dxq.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fay $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dxp.a : dxp.b;
         } else {
            return dxp.a;
         }
      } else {
         return dxp.b;
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!this.l.c()) {
         return bsi.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? ebr.h : ebr.d, $$2);
         return bsi.a;
      }
   }

   public boolean n(dwv $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable buj $$0, dgg $$1, dwv $$2, ji $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ebr.h : ebr.d, $$3);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dxq.b ? jn.b : jn.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ebr.h : ebr.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwv $$4 = $$1.a_($$3);
      return $$0.c(f) == dxq.b ? $$4.c($$1, $$3, jn.b) : $$4.a(this);
   }

   private void a(@Nullable buj $$0, dgg $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awa.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$1 == doj.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dwv $$0, ji $$1) {
      return ayy.b($$1.u(), $$1.c($$0.c(f) == dxq.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dgg $$0, ji $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dwv $$0) {
      if ($$0.b() instanceof dlr $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
