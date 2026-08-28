import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhg extends dfa {
   public static final MapCodec<dhg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dss.a.fieldOf("block_set_type").forGetter(dhg::b), u()).apply($$0, dhg::new)
   );
   public static final dsx b = diw.aE;
   public static final dsu c = dst.u;
   public static final dtb<dsy> d = dst.be;
   public static final dsu e = dst.w;
   public static final dtb<dsz> f = dst.ae;
   protected static final float g = 3.0F;
   protected static final ewl h = dfa.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewl i = dfa.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewl j = dfa.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewl k = dfa.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dss l;

   @Override
   public MapCodec<? extends dhg> a() {
      return a;
   }

   protected dhg(dss $$0, dsc.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, dsy.a).a(e, Boolean.valueOf(false)).a(f, dsz.b));
   }

   public dss b() {
      return this.l;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      je $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dsy.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      dsz $$6 = $$0.c(f);
      if ($$1.o() != je.a.b || $$6 == dsz.b != ($$1 == je.b)) {
         return $$6 == dsz.b && $$1 == je.a && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dhg && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dfc.a.o();
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dbr $$3, BiConsumer<cuq, iz> $$4) {
      if ($$3.j() == dbr.a.d && $$0.c(f) == dsz.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dhi.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      iz $$1 = $$0.a();
      dbz $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dsz.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, btq $$3, cuq $$4) {
      $$0.a($$1.c(), $$2.a(f, dsz.a), 3);
   }

   private dsy b(cyb $$0) {
      dbf $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.g();
      iz $$4 = $$2.c();
      je $$5 = $$3.i();
      iz $$6 = $$2.a($$5);
      dsd $$7 = $$1.a_($$6);
      iz $$8 = $$4.a($$5);
      dsd $$9 = $$1.a_($$8);
      je $$10 = $$3.h();
      iz $$11 = $$2.a($$10);
      dsd $$12 = $$1.a_($$11);
      iz $$13 = $$4.a($$10);
      dsd $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dsz.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dsz.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            evs $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dsy.a : dsy.b;
         } else {
            return dsy.a;
         }
      } else {
         return dsy.b;
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if (!this.l.c()) {
         return bqv.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dww.h : dww.d, $$2);
         return bqv.a($$1.B);
      }
   }

   public boolean m(dsd $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bsv $$0, dbz $$1, dsd $$2, iz $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dww.h : dww.d, $$3);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dsz.b ? je.b : je.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dww.h : dww.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsd $$4 = $$1.a_($$3);
      return $$0.c(f) == dsz.b ? $$4.d($$1, $$3, je.b) : $$4.a(this);
   }

   private void a(@Nullable bsv $$0, dbz $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$1 == djx.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dsd $$0, iz $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(f) == dsz.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dbz $$0, iz $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dsd $$0) {
      if ($$0.b() instanceof dhg $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
