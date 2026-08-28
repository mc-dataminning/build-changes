import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dot extends dmm {
   public static final MapCodec<dot> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebd.a.fieldOf("block_set_type").forGetter(dot::b), t()).apply($$0, dot::new)
   );
   public static final ebm<jb> b = dqn.e;
   public static final ebm<ebk> c = ebe.ah;
   public static final ebm<ebj> d = ebe.bh;
   public static final ebf e = ebe.y;
   public static final ebf f = ebe.A;
   private static final Map<jb, ffr> g = ffo.c(dmm.c(16.0, 13.0, 16.0));
   private final ebd h;

   @Override
   public MapCodec<? extends dot> a() {
      return a;
   }

   protected dot(ebd $$0, ean.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(b, jb.c).b(e, Boolean.valueOf(false)).b(d, ebj.a).b(f, Boolean.valueOf(false)).b(c, ebk.b));
   }

   public ebd b() {
      return this.h;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      jb $$4 = $$0.c(b);
      jb $$5 = $$0.c(e) ? ($$0.c(d) == ebj.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      ebk $$8 = $$0.c(c);
      if ($$4.o() != jb.a.b || $$8 == ebk.b != ($$4 == jb.b)) {
         return $$8 == ebk.b && $$4 == jb.a && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dot && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dmo.a.m();
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, dja $$3, BiConsumer<czk, iv> $$4) {
      if ($$3.g() && $$0.c(c) == ebk.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      if (!$$0.C && ($$3.gk() || !$$3.d($$2))) {
         dov.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      iv $$1 = $$0.a();
      djh $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.D($$1) || $$2.D($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, ebk.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bxj $$3, czk $$4) {
      $$0.a($$1.d(), $$2.b(c, ebk.a), 3);
   }

   private ebj b(ddd $$0) {
      din $$1 = $$0.q();
      iv $$2 = $$0.a();
      jb $$3 = $$0.g();
      iv $$4 = $$2.d();
      jb $$5 = $$3.i();
      iv $$6 = $$2.a($$5);
      eao $$7 = $$1.a_($$6);
      iv $$8 = $$4.a($$5);
      eao $$9 = $$1.a_($$8);
      jb $$10 = $$3.h();
      iv $$11 = $$2.a($$10);
      eao $$12 = $$1.a_($$11);
      iv $$13 = $$4.a($$10);
      eao $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dot && $$7.c(c) == ebk.b;
      boolean $$17 = $$12.b() instanceof dot && $$12.c(c) == ebk.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fex $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? ebj.a : ebj.b;
         } else {
            return ebj.a;
         }
      } else {
         return ebj.b;
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!this.h.c()) {
         return bug.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? efo.h : efo.d, $$2);
         return bug.a;
      }
   }

   public boolean n(eao $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bwi $$0, djh $$1, eao $$2, iv $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? efo.h : efo.d, $$3);
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.a($$0.c(c) == ebk.b ? jb.b : jb.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? efo.h : efo.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      eao $$4 = $$1.a_($$3);
      return $$0.c(c) == ebk.b ? $$4.c($$1, $$3, jb.b) : $$4.a(this);
   }

   private void a(@Nullable bwi $$0, djh $$1, iv $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$1 == drp.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(eao $$0, iv $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(c) == ebk.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(djh $$0, iv $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(eao $$0) {
      if ($$0.b() instanceof dot $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
