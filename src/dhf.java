import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhf extends dez {
   public static final MapCodec<dhf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsr.a.fieldOf("block_set_type").forGetter(dhf::b), u()).apply($$0, dhf::new)
   );
   public static final dsw b = div.aE;
   public static final dst c = dss.u;
   public static final dta<dsx> d = dss.be;
   public static final dst e = dss.w;
   public static final dta<dsy> f = dss.ae;
   protected static final float g = 3.0F;
   protected static final ewk h = dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewk i = dez.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewk j = dez.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewk k = dez.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dsr l;

   @Override
   public MapCodec<? extends dhf> a() {
      return a;
   }

   protected dhf(dsr $$0, dsb.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, dsx.a).a(e, Boolean.valueOf(false)).a(f, dsy.b));
   }

   public dsr b() {
      return this.l;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      je $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dsx.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      dsy $$6 = $$0.c(f);
      if ($$1.o() != je.a.b || $$6 == dsy.b != ($$1 == je.b)) {
         return $$6 == dsy.b && $$1 == je.a && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dhf && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dfb.a.o();
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dbq $$3, BiConsumer<cup, iz> $$4) {
      if ($$3.j() == dbq.a.d && $$0.c(f) == dsy.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dhh.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      iz $$1 = $$0.a();
      dby $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dsy.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, btp $$3, cup $$4) {
      $$0.a($$1.c(), $$2.a(f, dsy.a), 3);
   }

   private dsx b(cya $$0) {
      dbe $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.g();
      iz $$4 = $$2.c();
      je $$5 = $$3.i();
      iz $$6 = $$2.a($$5);
      dsc $$7 = $$1.a_($$6);
      iz $$8 = $$4.a($$5);
      dsc $$9 = $$1.a_($$8);
      je $$10 = $$3.h();
      iz $$11 = $$2.a($$10);
      dsc $$12 = $$1.a_($$11);
      iz $$13 = $$4.a($$10);
      dsc $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dsy.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dsy.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            evr $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dsx.a : dsx.b;
         } else {
            return dsx.a;
         }
      } else {
         return dsx.b;
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if (!this.l.c()) {
         return bqu.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dwv.h : dwv.d, $$2);
         return bqu.a($$1.B);
      }
   }

   public boolean m(dsc $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bsu $$0, dby $$1, dsc $$2, iz $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dwv.h : dwv.d, $$3);
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dsy.b ? je.b : je.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dwv.h : dwv.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsc $$4 = $$1.a_($$3);
      return $$0.c(f) == dsy.b ? $$4.d($$1, $$3, je.b) : $$4.a(this);
   }

   private void a(@Nullable bsu $$0, dby $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$1 == djw.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dsc $$0, iz $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(f) == dsy.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dby $$0, iz $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dsc $$0) {
      if ($$0.b() instanceof dhf $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
