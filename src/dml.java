import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dml extends dke {
   public static final MapCodec<dml> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyf.a.fieldOf("block_set_type").forGetter(dml::b), t()).apply($$0, dml::new)
   );
   public static final dyo<jn> b = dod.e;
   public static final dyo<dym> c = dyg.ah;
   public static final dyo<dyl> d = dyg.bh;
   public static final dyh e = dyg.y;
   public static final dyh f = dyg.A;
   private static final Map<jn, fcr> g = fco.c(dke.c(16.0, 13.0, 16.0));
   private final dyf h;

   @Override
   public MapCodec<? extends dml> a() {
      return a;
   }

   protected dml(dyf $$0, dxp.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.B.b().b(b, jn.c).b(e, Boolean.valueOf(false)).b(d, dyl.a).b(f, Boolean.valueOf(false)).b(c, dym.b));
   }

   public dyf b() {
      return this.h;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      jn $$4 = $$0.c(b);
      jn $$5 = $$0.c(e) ? ($$0.c(d) == dyl.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      dym $$8 = $$0.c(c);
      if ($$4.o() != jn.a.b || $$8 == dym.b != ($$4 == jn.b)) {
         return $$8 == dym.b && $$4 == jn.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dml && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dkg.a.m();
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      if ($$3.g() && $$0.c(c) == dym.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if (!$$0.C && ($$3.gn() || !$$3.d($$2))) {
         dmn.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      ji $$1 = $$0.a();
      dgz $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, dym.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
      $$0.a($$1.d(), $$2.b(c, dym.a), 3);
   }

   private dyl b(dax $$0) {
      dgf $$1 = $$0.q();
      ji $$2 = $$0.a();
      jn $$3 = $$0.g();
      ji $$4 = $$2.d();
      jn $$5 = $$3.i();
      ji $$6 = $$2.a($$5);
      dxq $$7 = $$1.a_($$6);
      ji $$8 = $$4.a($$5);
      dxq $$9 = $$1.a_($$8);
      jn $$10 = $$3.h();
      ji $$11 = $$2.a($$10);
      dxq $$12 = $$1.a_($$11);
      ji $$13 = $$4.a($$10);
      dxq $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dml && $$7.c(c) == dym.b;
      boolean $$17 = $$12.b() instanceof dml && $$12.c(c) == dym.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fbx $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dyl.a : dyl.b;
         } else {
            return dyl.a;
         }
      } else {
         return dyl.b;
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!this.h.c()) {
         return bsy.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? ecp.h : ecp.d, $$2);
         return bsy.a;
      }
   }

   public boolean n(dxq $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bva $$0, dgz $$1, dxq $$2, ji $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ecp.h : ecp.d, $$3);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(c) == dym.b ? jn.b : jn.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ecp.h : ecp.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      dxq $$4 = $$1.a_($$3);
      return $$0.c(c) == dym.b ? $$4.c($$1, $$3, jn.b) : $$4.a(this);
   }

   private void a(@Nullable bva $$0, dgz $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awb.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$1 == dpf.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dxq $$0, ji $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(c) == dym.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(dgz $$0, ji $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dxq $$0) {
      if ($$0.b() instanceof dml $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
