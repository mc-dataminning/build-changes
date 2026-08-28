import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhe extends dey {
   public static final MapCodec<dhe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsq.a.fieldOf("block_set_type").forGetter(dhe::b), u()).apply($$0, dhe::new)
   );
   public static final dsv b = diu.aE;
   public static final dss c = dsr.u;
   public static final dsz<dsw> d = dsr.be;
   public static final dss e = dsr.w;
   public static final dsz<dsx> f = dsr.ae;
   protected static final float g = 3.0F;
   protected static final ewj h = dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewj i = dey.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewj j = dey.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewj k = dey.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dsq l;

   @Override
   public MapCodec<? extends dhe> a() {
      return a;
   }

   protected dhe(dsq $$0, dsa.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, dsw.a).a(e, Boolean.valueOf(false)).a(f, dsx.b));
   }

   public dsq b() {
      return this.l;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      je $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dsw.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      dsx $$6 = $$0.c(f);
      if ($$1.o() != je.a.b || $$6 == dsx.b != ($$1 == je.b)) {
         return $$6 == dsx.b && $$1 == je.a && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dhe && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dfa.a.o();
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dbp $$3, BiConsumer<cuo, iz> $$4) {
      if ($$3.j() == dbp.a.d && $$0.c(f) == dsx.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dhg.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      iz $$1 = $$0.a();
      dbx $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dsx.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bto $$3, cuo $$4) {
      $$0.a($$1.c(), $$2.a(f, dsx.a), 3);
   }

   private dsw b(cxz $$0) {
      dbd $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.g();
      iz $$4 = $$2.c();
      je $$5 = $$3.i();
      iz $$6 = $$2.a($$5);
      dsb $$7 = $$1.a_($$6);
      iz $$8 = $$4.a($$5);
      dsb $$9 = $$1.a_($$8);
      je $$10 = $$3.h();
      iz $$11 = $$2.a($$10);
      dsb $$12 = $$1.a_($$11);
      iz $$13 = $$4.a($$10);
      dsb $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dsx.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dsx.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            evq $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dsw.a : dsw.b;
         } else {
            return dsw.a;
         }
      } else {
         return dsw.b;
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if (!this.l.c()) {
         return bqt.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dwu.h : dwu.d, $$2);
         return bqt.a($$1.B);
      }
   }

   public boolean m(dsb $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bst $$0, dbx $$1, dsb $$2, iz $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dwu.h : dwu.d, $$3);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dsx.b ? je.b : je.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dwu.h : dwu.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsb $$4 = $$1.a_($$3);
      return $$0.c(f) == dsx.b ? $$4.d($$1, $$3, je.b) : $$4.a(this);
   }

   private void a(@Nullable bst $$0, dbx $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$1 == djv.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dsb $$0, iz $$1) {
      return ayy.b($$1.u(), $$1.c($$0.c(f) == dsx.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dbx $$0, iz $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dsb $$0) {
      if ($$0.b() instanceof dhe $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
