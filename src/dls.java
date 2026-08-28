import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dls extends djl {
   public static final MapCodec<dls> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxl.a.fieldOf("block_set_type").forGetter(dls::b), t()).apply($$0, dls::new)
   );
   public static final dxt<jn> b = dnj.aF;
   public static final dxn c = dxm.z;
   public static final dxt<dxq> d = dxm.bh;
   public static final dxn e = dxm.B;
   public static final dxt<dxr> f = dxm.ah;
   protected static final float g = 3.0F;
   protected static final fbt h = djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbt i = djl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fbt j = djl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbt k = djl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dxl l;

   @Override
   public MapCodec<? extends dls> a() {
      return a;
   }

   protected dls(dxl $$0, dwv.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, dxq.a).b(e, Boolean.valueOf(false)).b(f, dxr.b));
   }

   public dxl b() {
      return this.l;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      jn $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dxq.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      dxr $$8 = $$0.c(f);
      if ($$4.o() != jn.a.b || $$8 == dxr.b != ($$4 == jn.b)) {
         return $$8 == dxr.b && $$4 == jn.a && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dls && $$6.c(f) != $$8 ? $$6.b(f, $$8) : djn.a.m();
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, dfz $$3, BiConsumer<cwo, ji> $$4) {
      if ($$3.g() && $$0.c(f) == dxr.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dlu.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      ji $$1 = $$0.a();
      dgh $$2 = $$0.q();
      if ($$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dxr.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, bvg $$3, cwo $$4) {
      $$0.a($$1.d(), $$2.b(f, dxr.a), 3);
   }

   private dxq b(daf $$0) {
      dfm $$1 = $$0.q();
      ji $$2 = $$0.a();
      jn $$3 = $$0.g();
      ji $$4 = $$2.d();
      jn $$5 = $$3.i();
      ji $$6 = $$2.a($$5);
      dww $$7 = $$1.a_($$6);
      ji $$8 = $$4.a($$5);
      dww $$9 = $$1.a_($$8);
      jn $$10 = $$3.h();
      ji $$11 = $$2.a($$10);
      dww $$12 = $$1.a_($$11);
      ji $$13 = $$4.a($$10);
      dww $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dls && $$7.c(f) == dxr.b;
      boolean $$17 = $$12.b() instanceof dls && $$12.c(f) == dxr.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            faz $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dxq.a : dxq.b;
         } else {
            return dxq.a;
         }
      } else {
         return dxq.b;
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!this.l.c()) {
         return bsj.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? ebs.h : ebs.d, $$2);
         return bsj.a;
      }
   }

   public boolean n(dww $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable buk $$0, dgh $$1, dww $$2, ji $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ebs.h : ebs.d, $$3);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dxr.b ? jn.b : jn.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ebs.h : ebs.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      dww $$4 = $$1.a_($$3);
      return $$0.c(f) == dxr.b ? $$4.c($$1, $$3, jn.b) : $$4.a(this);
   }

   private void a(@Nullable buk $$0, dgh $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$1 == dok.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dww $$0, ji $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(f) == dxr.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dgh $$0, ji $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dww $$0) {
      if ($$0.b() instanceof dls $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
