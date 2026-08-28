import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlt extends djm {
   public static final MapCodec<dlt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxm.a.fieldOf("block_set_type").forGetter(dlt::b), t()).apply($$0, dlt::new)
   );
   public static final dxu<jn> b = dnk.aF;
   public static final dxo c = dxn.z;
   public static final dxu<dxr> d = dxn.bh;
   public static final dxo e = dxn.B;
   public static final dxu<dxs> f = dxn.ah;
   protected static final float g = 3.0F;
   protected static final fbu h = djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbu i = djm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fbu j = djm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbu k = djm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dxm l;

   @Override
   public MapCodec<? extends dlt> a() {
      return a;
   }

   protected dlt(dxm $$0, dww.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, dxr.a).b(e, Boolean.valueOf(false)).b(f, dxs.b));
   }

   public dxm b() {
      return this.l;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      jn $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dxr.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      dxs $$8 = $$0.c(f);
      if ($$4.o() != jn.a.b || $$8 == dxs.b != ($$4 == jn.b)) {
         return $$8 == dxs.b && $$4 == jn.a && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dlt && $$6.c(f) != $$8 ? $$6.b(f, $$8) : djo.a.m();
      }
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      if ($$3.g() && $$0.c(f) == dxs.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dlv.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      ji $$1 = $$0.a();
      dgi $$2 = $$0.q();
      if ($$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dxs.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bvg $$3, cwp $$4) {
      $$0.a($$1.d(), $$2.b(f, dxs.a), 3);
   }

   private dxr b(dag $$0) {
      dfn $$1 = $$0.q();
      ji $$2 = $$0.a();
      jn $$3 = $$0.g();
      ji $$4 = $$2.d();
      jn $$5 = $$3.i();
      ji $$6 = $$2.a($$5);
      dwx $$7 = $$1.a_($$6);
      ji $$8 = $$4.a($$5);
      dwx $$9 = $$1.a_($$8);
      jn $$10 = $$3.h();
      ji $$11 = $$2.a($$10);
      dwx $$12 = $$1.a_($$11);
      ji $$13 = $$4.a($$10);
      dwx $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dlt && $$7.c(f) == dxs.b;
      boolean $$17 = $$12.b() instanceof dlt && $$12.c(f) == dxs.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fba $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dxr.a : dxr.b;
         } else {
            return dxr.a;
         }
      } else {
         return dxr.b;
      }
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!this.l.c()) {
         return bsj.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? ebt.h : ebt.d, $$2);
         return bsj.a;
      }
   }

   public boolean n(dwx $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable buk $$0, dgi $$1, dwx $$2, ji $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ebt.h : ebt.d, $$3);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dxs.b ? jn.b : jn.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ebt.h : ebt.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwx $$4 = $$1.a_($$3);
      return $$0.c(f) == dxs.b ? $$4.c($$1, $$3, jn.b) : $$4.a(this);
   }

   private void a(@Nullable buk $$0, dgi $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$1 == dol.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dwx $$0, ji $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(f) == dxs.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dgi $$0, ji $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dwx $$0) {
      if ($$0.b() instanceof dlt $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
