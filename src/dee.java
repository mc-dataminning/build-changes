import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dee extends dby {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpo.a.fieldOf("block_set_type").forGetter(dee::b), u()).apply($$0, dee::new)
   );
   public static final dpt b = dft.aE;
   public static final dpq c = dpp.u;
   public static final dpx<dpu> d = dpp.be;
   public static final dpq e = dpp.w;
   public static final dpx<dpv> f = dpp.ae;
   protected static final float g = 3.0F;
   protected static final est h = dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final est i = dby.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final est j = dby.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final est k = dby.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dpo l;

   @Override
   public MapCodec<? extends dee> a() {
      return a;
   }

   protected dee(dpo $$0, doy.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)).a(d, dpu.a).a(e, Boolean.valueOf(false)).a(f, dpv.b));
   }

   public dpo b() {
      return this.l;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      ih $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dpu.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      dpv $$6 = $$0.c(f);
      if ($$1.o() != ih.a.b || $$6 == dpv.b != ($$1 == ih.b)) {
         return $$6 == dpv.b && $$1 == ih.a && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dee && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dca.a.n();
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cyp $$3, BiConsumer<crj, ib> $$4) {
      if ($$3.j() == cyp.a.d && $$0.c(f) == dpv.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         deg.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      ib $$1 = $$0.a();
      cyx $$2 = $$0.q();
      if ($$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.n().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dpv.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
      $$0.a($$1.c(), $$2.a(f, dpv.a), 3);
   }

   private dpu b(cuo $$0) {
      cyd $$1 = $$0.q();
      ib $$2 = $$0.a();
      ih $$3 = $$0.g();
      ib $$4 = $$2.c();
      ih $$5 = $$3.i();
      ib $$6 = $$2.a($$5);
      doz $$7 = $$1.a_($$6);
      ib $$8 = $$4.a($$5);
      doz $$9 = $$1.a_($$8);
      ih $$10 = $$3.h();
      ib $$11 = $$2.a($$10);
      doz $$12 = $$1.a_($$11);
      ib $$13 = $$4.a($$10);
      doz $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dpv.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dpv.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            esa $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dpu.a : dpu.b;
         } else {
            return dpu.a;
         }
      } else {
         return dpu.b;
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if (!this.l.c()) {
         return boa.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dts.h : dts.d, $$2);
         return boa.a($$1.B);
      }
   }

   public boolean m(doz $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bpv $$0, cyx $$1, doz $$2, ib $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dts.h : dts.d, $$3);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dpv.b ? ih.b : ih.a));
      if (!this.n().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dts.h : dts.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      doz $$4 = $$1.a_($$3);
      return $$0.c(f) == dpv.b ? $$4.d($$1, $$3, ih.b) : $$4.a(this);
   }

   private void a(@Nullable bpv $$0, cyx $$1, ib $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), aun.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$1 == dgu.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(doz $$0, ib $$1) {
      return axk.b($$1.u(), $$1.c($$0.c(f) == dpv.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cyx $$0, ib $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(doz $$0) {
      if ($$0.b() instanceof dee $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
