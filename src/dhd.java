import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhd extends dex {
   public static final MapCodec<dhd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsp.a.fieldOf("block_set_type").forGetter(dhd::b), u()).apply($$0, dhd::new)
   );
   public static final dsu b = dit.aE;
   public static final dsr c = dsq.u;
   public static final dsy<dsv> d = dsq.be;
   public static final dsr e = dsq.w;
   public static final dsy<dsw> f = dsq.ae;
   protected static final float g = 3.0F;
   protected static final ewi h = dex.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewi i = dex.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewi j = dex.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewi k = dex.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dsp l;

   @Override
   public MapCodec<? extends dhd> a() {
      return a;
   }

   protected dhd(dsp $$0, drz.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, dsv.a).a(e, Boolean.valueOf(false)).a(f, dsw.b));
   }

   public dsp b() {
      return this.l;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      je $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dsv.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      dsw $$6 = $$0.c(f);
      if ($$1.o() != je.a.b || $$6 == dsw.b != ($$1 == je.b)) {
         return $$6 == dsw.b && $$1 == je.a && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dhd && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dez.a.o();
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dbo $$3, BiConsumer<cun, iz> $$4) {
      if ($$3.j() == dbo.a.d && $$0.c(f) == dsw.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dhf.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      iz $$1 = $$0.a();
      dbw $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dsw.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, btn $$3, cun $$4) {
      $$0.a($$1.c(), $$2.a(f, dsw.a), 3);
   }

   private dsv b(cxy $$0) {
      dbc $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.g();
      iz $$4 = $$2.c();
      je $$5 = $$3.i();
      iz $$6 = $$2.a($$5);
      dsa $$7 = $$1.a_($$6);
      iz $$8 = $$4.a($$5);
      dsa $$9 = $$1.a_($$8);
      je $$10 = $$3.h();
      iz $$11 = $$2.a($$10);
      dsa $$12 = $$1.a_($$11);
      iz $$13 = $$4.a($$10);
      dsa $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dsw.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dsw.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            evp $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dsv.a : dsv.b;
         } else {
            return dsv.a;
         }
      } else {
         return dsv.b;
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if (!this.l.c()) {
         return bqs.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dwt.h : dwt.d, $$2);
         return bqs.a($$1.B);
      }
   }

   public boolean m(dsa $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bss $$0, dbw $$1, dsa $$2, iz $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dwt.h : dwt.d, $$3);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dsw.b ? je.b : je.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dwt.h : dwt.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsa $$4 = $$1.a_($$3);
      return $$0.c(f) == dsw.b ? $$4.d($$1, $$3, je.b) : $$4.a(this);
   }

   private void a(@Nullable bss $$0, dbw $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$1 == dju.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dsa $$0, iz $$1) {
      return ayx.b($$1.u(), $$1.c($$0.c(f) == dsw.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dbw $$0, iz $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dsa $$0) {
      if ($$0.b() instanceof dhd $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
