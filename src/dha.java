import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dha extends deu {
   public static final MapCodec<dha> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsm.a.fieldOf("block_set_type").forGetter(dha::b), u()).apply($$0, dha::new)
   );
   public static final dsr b = diq.aE;
   public static final dso c = dsn.u;
   public static final dsv<dss> d = dsn.be;
   public static final dso e = dsn.w;
   public static final dsv<dst> f = dsn.ae;
   protected static final float g = 3.0F;
   protected static final ewf h = deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewf i = deu.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewf j = deu.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewf k = deu.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dsm l;

   @Override
   public MapCodec<? extends dha> a() {
      return a;
   }

   protected dha(dsm $$0, drw.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, dss.a).a(e, Boolean.valueOf(false)).a(f, dst.b));
   }

   public dsm b() {
      return this.l;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      je $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dss.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      dst $$6 = $$0.c(f);
      if ($$1.o() != je.a.b || $$6 == dst.b != ($$1 == je.b)) {
         return $$6 == dst.b && $$1 == je.a && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dha && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dew.a.n();
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, dbl $$3, BiConsumer<cuk, iz> $$4) {
      if ($$3.j() == dbl.a.d && $$0.c(f) == dst.b && !$$1.x_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         dhc.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      iz $$1 = $$0.a();
      dbt $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.n().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dst.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
      $$0.a($$1.c(), $$2.a(f, dst.a), 3);
   }

   private dss b(cxv $$0) {
      daz $$1 = $$0.q();
      iz $$2 = $$0.a();
      je $$3 = $$0.g();
      iz $$4 = $$2.c();
      je $$5 = $$3.i();
      iz $$6 = $$2.a($$5);
      drx $$7 = $$1.a_($$6);
      iz $$8 = $$4.a($$5);
      drx $$9 = $$1.a_($$8);
      je $$10 = $$3.h();
      iz $$11 = $$2.a($$10);
      drx $$12 = $$1.a_($$11);
      iz $$13 = $$4.a($$10);
      drx $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dst.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dst.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            evm $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dss.a : dss.b;
         } else {
            return dss.a;
         }
      } else {
         return dss.b;
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if (!this.l.c()) {
         return bqp.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dwq.h : dwq.d, $$2);
         return bqp.a($$1.B);
      }
   }

   public boolean m(drx $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bsp $$0, dbt $$1, drx $$2, iz $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dwq.h : dwq.d, $$3);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dst.b ? je.b : je.a));
      if (!this.n().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dwq.h : dwq.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      drx $$4 = $$1.a_($$3);
      return $$0.c(f) == dst.b ? $$4.d($$1, $$3, je.b) : $$4.a(this);
   }

   private void a(@Nullable bsp $$0, dbt $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), avx.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$1 == djr.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(drx $$0, iz $$1) {
      return ayu.b($$1.u(), $$1.c($$0.c(f) == dst.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dbt $$0, iz $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(drx $$0) {
      if ($$0.b() instanceof dha $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
