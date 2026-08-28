import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkp extends dij {
   public static final MapCodec<dkp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwd.a.fieldOf("block_set_type").forGetter(dkp::b), t()).apply($$0, dkp::new)
   );
   public static final dwl<jm> b = dme.aF;
   public static final dwf c = dwe.u;
   public static final dwl<dwi> d = dwe.be;
   public static final dwf e = dwe.w;
   public static final dwl<dwj> f = dwe.ae;
   protected static final float g = 3.0F;
   protected static final fal h = dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fal i = dij.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fal j = dij.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fal k = dij.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dwd l;

   @Override
   public MapCodec<? extends dkp> a() {
      return a;
   }

   protected dkp(dwd $$0, dvn.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, dwi.a).b(e, Boolean.valueOf(false)).b(f, dwj.b));
   }

   public dwd b() {
      return this.l;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      jm $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dwi.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      dwj $$8 = $$0.c(f);
      if ($$4.o() != jm.a.b || $$8 == dwj.b != ($$4 == jm.b)) {
         return $$8 == dwj.b && $$4 == jm.a && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dkp && $$6.c(f) != $$8 ? $$6.b(f, $$8) : dil.a.m();
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, dex $$3, BiConsumer<cwf, jh> $$4) {
      if ($$3.f() && $$0.c(f) == dwj.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      if (!$$0.C && ($$3.f() || !$$3.d($$2))) {
         dkr.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      jh $$1 = $$0.a();
      dff $$2 = $$0.q();
      if ($$1.v() < $$2.al() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(e, Boolean.valueOf($$3)).b(c, Boolean.valueOf($$3)).b(f, dwj.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bve $$3, cwf $$4) {
      $$0.a($$1.d(), $$2.b(f, dwj.a), 3);
   }

   private dwi b(czw $$0) {
      dek $$1 = $$0.q();
      jh $$2 = $$0.a();
      jm $$3 = $$0.g();
      jh $$4 = $$2.d();
      jm $$5 = $$3.i();
      jh $$6 = $$2.a($$5);
      dvo $$7 = $$1.a_($$6);
      jh $$8 = $$4.a($$5);
      dvo $$9 = $$1.a_($$8);
      jm $$10 = $$3.h();
      jh $$11 = $$2.a($$10);
      dvo $$12 = $$1.a_($$11);
      jh $$13 = $$4.a($$10);
      dvo $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dkp && $$7.c(f) == dwj.b;
      boolean $$17 = $$12.b() instanceof dkp && $$12.c(f) == dwj.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ezr $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dwi.a : dwi.b;
         } else {
            return dwi.a;
         }
      } else {
         return dwi.b;
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!this.l.c()) {
         return bsh.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.n($$0) ? eak.h : eak.d, $$2);
         return bsh.a;
      }
   }

   public boolean n(dvo $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bui $$0, dff $$1, dvo $$2, jh $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.b(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? eak.h : eak.d, $$3);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dwj.b ? jm.b : jm.a));
      if (!this.m().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? eak.h : eak.d, $$2);
         }

         $$1.a($$2, $$0.b(e, Boolean.valueOf($$6)).b(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvo $$4 = $$1.a_($$3);
      return $$0.c(f) == dwj.b ? $$4.c($$1, $$3, jm.b) : $$4.a(this);
   }

   private void a(@Nullable bui $$0, dff $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$1 == dnf.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dvo $$0, jh $$1) {
      return azn.b($$1.u(), $$1.c($$0.c(f) == dwj.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dff $$0, jh $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dvo $$0) {
      if ($$0.b() instanceof dkp $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
