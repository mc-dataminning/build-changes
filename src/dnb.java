import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnb extends dku {
   public static final MapCodec<dnb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzb.a.fieldOf("block_set_type").forGetter(dnb::b), t()).apply($$0, dnb::new)
   );
   public static final dzk<jo> b = dot.e;
   public static final dzk<dzi> c = dzc.ah;
   public static final dzk<dzh> d = dzc.bh;
   public static final dzd e = dzc.y;
   public static final dzd f = dzc.A;
   private static final Map<jo, fdo> g = fdl.c(dku.c(16.0, 13.0, 16.0));
   private final dzb h;

   @Override
   public MapCodec<? extends dnb> a() {
      return a;
   }

   protected dnb(dzb $$0, dyl.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.B.b().b(b, jo.c).b(e, Boolean.valueOf(false)).b(d, dzh.a).b(f, Boolean.valueOf(false)).b(c, dzi.b));
   }

   public dzb b() {
      return this.h;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      jo $$4 = $$0.c(b);
      jo $$5 = $$0.c(e) ? ($$0.c(d) == dzh.b ? $$4.i() : $$4.h()) : $$4;
      return g.get($$5);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      dzi $$8 = $$0.c(c);
      if ($$4.o() != jo.a.b || $$8 == dzi.b != ($$4 == jo.b)) {
         return $$8 == dzi.b && $$4 == jo.a && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$6.b() instanceof dnb && $$6.c(c) != $$8 ? $$6.b(c, $$8) : dkw.a.m();
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if ($$3.g() && $$0.c(c) == dzi.b && this.h.d() && !$$0.c(f)) {
         this.a(null, $$1, $$0, $$2, !this.n($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      if (!$$0.C && ($$3.gk() || !$$3.d($$2))) {
         dnd.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(e);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      jj $$1 = $$0.a();
      dhp $$2 = $$0.q();
      if ($$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.m().b(b, $$0.g()).b(d, this.b($$0)).b(f, Boolean.valueOf($$3)).b(e, Boolean.valueOf($$3)).b(c, dzi.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
      $$0.a($$1.d(), $$2.b(c, dzi.a), 3);
   }

   private dzh b(dbn $$0) {
      dgv $$1 = $$0.q();
      jj $$2 = $$0.a();
      jo $$3 = $$0.g();
      jj $$4 = $$2.d();
      jo $$5 = $$3.i();
      jj $$6 = $$2.a($$5);
      dym $$7 = $$1.a_($$6);
      jj $$8 = $$4.a($$5);
      dym $$9 = $$1.a_($$8);
      jo $$10 = $$3.h();
      jj $$11 = $$2.a($$10);
      dym $$12 = $$1.a_($$11);
      jj $$13 = $$4.a($$10);
      dym $$14 = $$1.a_($$13);
      int $$15 = ($$7.m($$1, $$6) ? -1 : 0) + ($$9.m($$1, $$8) ? -1 : 0) + ($$12.m($$1, $$11) ? 1 : 0) + ($$14.m($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof dnb && $$7.c(c) == dzi.b;
      boolean $$17 = $$12.b() instanceof dnb && $$12.c(c) == dzi.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            fcu $$20 = $$0.l();
            double $$21 = $$20.d - (double)$$2.u();
            double $$22 = $$20.f - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dzh.a : dzh.b;
         } else {
            return dzh.a;
         }
      } else {
         return dzh.b;
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!this.h.c()) {
         return btq.e;
      } else {
         $$0 = $$0.a(e);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(e));
         $$1.a($$3, this.n($$0) ? edm.h : edm.d, $$2);
         return btq.a;
      }
   }

   public boolean n(dym $$0) {
      return $$0.c(e);
   }

   public void a(@Nullable bvs $$0, dhp $$1, dym $$2, jj $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(e) != $$4) {
         $$1.a($$3, $$2.b(e, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? edm.h : edm.d, $$3);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(c) == dzi.b ? jo.b : jo.a));
      if (!this.m().a($$3) && $$6 != $$0.c(f)) {
         if ($$6 != $$0.c(e)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? edm.h : edm.d, $$2);
         }

         $$1.a($$2, $$0.b(f, Boolean.valueOf($$6)).b(e, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      dym $$4 = $$1.a_($$3);
      return $$0.c(c) == dzi.b ? $$4.c($$1, $$3, jo.b) : $$4.a(this);
   }

   private void a(@Nullable bvs $$0, dhp $$1, jj $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.i() : this.h.h(), awl.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$1 == dpv.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dym $$0, jj $$1) {
      return azk.b($$1.u(), $$1.c($$0.c(c) == dzi.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, b, e, d, f);
   }

   public static boolean a(dhp $$0, jj $$1) {
      return o($$0.a_($$1));
   }

   public static boolean o(dym $$0) {
      if ($$0.b() instanceof dnb $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
