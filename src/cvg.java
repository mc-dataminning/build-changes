import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvg extends ctc {
   public static final MapCodec<cvg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfs.a.fieldOf("block_set_type").forGetter(cvg::b), t()).apply($$0, cvg::new)
   );
   public static final dfx b = cww.aE;
   public static final dfu c = dft.u;
   public static final dgb<dfy> d = dft.be;
   public static final dfu e = dft.w;
   public static final dgb<dfz> f = dft.ae;
   protected static final float g = 3.0F;
   protected static final eia h = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eia i = ctc.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eia j = ctc.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eia k = ctc.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dfs l;

   @Override
   public MapCodec<cvg> a() {
      return a;
   }

   protected cvg(dfs $$0, dfc.d $$1) {
      super($$1.a($$0.f()));
      this.l = $$0;
      this.k(this.E.b().a(b, ha.c).a(c, Boolean.valueOf(false)).a(d, dfy.a).a(e, Boolean.valueOf(false)).a(f, dfz.b));
   }

   public dfs b() {
      return this.l;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      ha $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dfy.b;
      switch ($$4) {
         case f:
         default:
            return $$5 ? k : ($$6 ? i : h);
         case d:
            return $$5 ? h : ($$6 ? k : j);
         case e:
            return $$5 ? j : ($$6 ? h : i);
         case c:
            return $$5 ? i : ($$6 ? j : k);
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      dfz $$6 = $$0.c(f);
      if ($$1.o() != ha.a.b || $$6 == dfz.b != ($$1 == ha.b)) {
         return $$6 == dfz.b && $$1 == ha.a && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(f) != $$6 ? $$0.a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)).a(e, $$2.c(e)) : cte.a.o();
      }
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      if (!$$0.B && $$3.f()) {
         cvi.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      switch ($$3) {
         case a:
            return $$0.c(c);
         case b:
            return false;
         case c:
            return $$0.c(c);
         default:
            return false;
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      gw $$1 = $$0.a();
      cqb $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dfz.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      $$0.a($$1.c(), $$2.a(f, dfz.a), 3);
   }

   private dfy b(clt $$0) {
      cph $$1 = $$0.q();
      gw $$2 = $$0.a();
      ha $$3 = $$0.g();
      gw $$4 = $$2.c();
      ha $$5 = $$3.i();
      gw $$6 = $$2.a($$5);
      dfd $$7 = $$1.a_($$6);
      gw $$8 = $$4.a($$5);
      dfd $$9 = $$1.a_($$8);
      ha $$10 = $$3.h();
      gw $$11 = $$2.a($$10);
      dfd $$12 = $$1.a_($$11);
      gw $$13 = $$4.a($$10);
      dfd $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dfz.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dfz.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ehh $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dfy.a : dfy.b;
         } else {
            return dfy.a;
         }
      } else {
         return dfy.b;
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if (!this.l.c()) {
         return bhe.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.h($$0) ? djn.h : djn.d, $$2);
         return bhe.a($$1.B);
      }
   }

   public boolean h(dfd $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable biw $$0, cqb $$1, dfd $$2, gw $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? djn.h : djn.d, $$3);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(f) == dfz.b ? ha.b : ha.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? djn.h : djn.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfd $$4 = $$1.a_($$3);
      return $$0.c(f) == dfz.b ? $$4.d($$1, $$3, ha.b) : $$4.a(this);
   }

   private void a(@Nullable biw $$0, cqb $$1, gw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), aph.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$1 == cxx.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   public long a(dfd $$0, gw $$1) {
      return asb.b($$1.u(), $$1.c($$0.c(f) == dfz.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cqb $$0, gw $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dfd $$0) {
      if ($$0.b() instanceof cvg $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
