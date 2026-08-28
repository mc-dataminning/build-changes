import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlu extends djn {
   public static final MapCodec<dlu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxn.a.fieldOf("block_set_type").forGetter(dlu::b), t()).apply($$0, dlu::new)
   );
   public static final dxv<jn> b = dnl.aF;
   public static final dxp c = dxo.z;
   public static final dxv<dxs> d = dxo.bh;
   public static final dxp e = dxo.B;
   public static final dxv<dxt> f = dxo.ah;
   protected static final float g = 3.0F;
   protected static final fbv h = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbv i = djn.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fbv j = djn.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbv k = djn.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dxn l;

   @Override
   public MapCodec<? extends dlu> a() {
      return a;
   }

   protected dlu(dxn $$0, dwx.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)).b(d, dxs.a).b(e, Boolean.valueOf(false)).b(f, dxt.b));
   }

   public dxn b() {
      return this.l;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      jn $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dxs.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      dxt $$8 = $$0.c(f);
      if ($$4.o() != jn.a.b || $$8 == dxt.b != ($$4 == jn.b)) {
         return $$8 == dxt.b && $$4 == jn.a && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dlu && $$6.c(f) != $$8 ? $$6.b(f, $$8) : djp.a.m();
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, dgb $$3, BiConsumer<cwq, ji> $$4) {
      if ($$3.g() && $$0.c(f) == dxt.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      if (!$$0.C && ($$3.b() || !$$3.d($$2))) {
         dlw.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      ji $$1 = $$0.a();
      dgj $$2 = $$0.q();
      if ($$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dxt.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
      $$0.a($$1.d(), $$2.b(f, dxt.a), 3);
   }

   private dxs b(dah $$0) {
      dfo $$1 = $$0.q();
      ji $$2 = $$0.a();
      jn $$3 = $$0.g();
      ji $$4 = $$2.d();
      jn $$5 = $$3.i();
      ji $$6 = $$2.a($$5);
      dwy $$7 = $$1.a_($$6);
      ji $$8 = $$4.a($$5);
      dwy $$9 = $$1.a_($$8);
      jn $$10 = $$3.h();
      ji $$11 = $$2.a($$10);
      dwy $$12 = $$1.a_($$11);
      ji $$13 = $$4.a($$10);
      dwy $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dlu && $$7.c(f) == dxt.b;
      boolean $$17 = $$12.b() instanceof dlu && $$12.c(f) == dxt.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fbb $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dxs.a : dxs.b;
         } else {
            return dxs.a;
         }
      } else {
         return dxs.b;
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!this.l.c()) {
         return bsl.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? ebu.h : ebu.d, $$2);
         return bsl.a;
      }
   }

   public boolean n(dwy $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bum $$0, dgj $$1, dwy $$2, ji $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? ebu.h : ebu.d, $$3);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dxt.b ? jn.b : jn.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? ebu.h : ebu.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwy $$4 = $$1.a_($$3);
      return $$0.c(f) == dxt.b ? $$4.c($$1, $$3, jn.b) : $$4.a(this);
   }

   private void a(@Nullable bum $$0, dgj $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$1 == dom.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dwy $$0, ji $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(f) == dxt.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dgj $$0, ji $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dwy $$0) {
      if ($$0.b() instanceof dlu $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
