import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dom extends dmf {
   public static final MapCodec<dom> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eaw.a.fieldOf("block_set_type").forGetter(dom::b), t()).apply($$0, dom::new)
   );
   public static final ebf<ja> b = dqg.e;
   public static final ebf<ebd> c = eax.ah;
   public static final ebf<ebc> d = eax.bh;
   public static final eay e = eax.y;
   public static final eay f = eax.A;
   private static final Map<ja, ffk> g = ffh.c(dmf.c(16.0, 13.0, 16.0));
   private final eaw h;

   @Override
   public MapCodec<? extends dom> a() {
      return a;
   }

   protected dom(eaw $$0, eag.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(b, ja.c).b(e, Boolean.valueOf(false)).b(d, ebc.a).b(f, Boolean.valueOf(false)).b(c, ebd.b));
   }

   public eaw b() {
      return this.h;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      ja $$4 = $$0.c(b);
      ja $$5 = $$0.c(e) ? ($$0.c(d) == ebc.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      ebd $$8 = $$0.c(c);
      if ($$4.o() != ja.a.b || $$8 == ebd.b != ($$4 == ja.b)) {
         return $$8 == ebd.b && $$4 == ja.a && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dom && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dmh.a.m();
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      if ($$3.g() && $$0.c(c) == ebd.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      if (!$$0.C && ($$3.gl() || !$$3.d($$2))) {
         doo.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      iu $$1 = $$0.a();
      dja $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.D($$1) || $$2.D($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, ebd.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bxe $$3, czd $$4) {
      $$0.a($$1.d(), $$2.b(c, ebd.a), 3);
   }

   private ebc b(dcw $$0) {
      dig $$1 = $$0.q();
      iu $$2 = $$0.a();
      ja $$3 = $$0.g();
      iu $$4 = $$2.d();
      ja $$5 = $$3.i();
      iu $$6 = $$2.a($$5);
      eah $$7 = $$1.a_($$6);
      iu $$8 = $$4.a($$5);
      eah $$9 = $$1.a_($$8);
      ja $$10 = $$3.h();
      iu $$11 = $$2.a($$10);
      eah $$12 = $$1.a_($$11);
      iu $$13 = $$4.a($$10);
      eah $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dom && $$7.c(c) == ebd.b;
      boolean $$17 = $$12.b() instanceof dom && $$12.c(c) == ebd.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            feq $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? ebc.a : ebc.b;
         } else {
            return ebc.a;
         }
      } else {
         return ebc.b;
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!this.h.c()) {
         return bud.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? efh.h : efh.d, $$2);
         return bud.a;
      }
   }

   public boolean n(eah $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bwf $$0, dja $$1, eah $$2, iu $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? efh.h : efh.d, $$3);
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2) || $$1.D($$2.a($$0.c(c) == ebd.b ? ja.b : ja.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? efh.h : efh.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      eah $$4 = $$1.a_($$3);
      return $$0.c(c) == ebd.b ? $$4.c($$1, $$3, ja.b) : $$4.a(this);
   }

   private void a(@Nullable bwf $$0, dja $$1, iu $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awo.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$1 == dri.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(eah $$0, iu $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(c) == ebd.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(dja $$0, iu $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(eah $$0) {
      if ($$0.b() instanceof dom $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
