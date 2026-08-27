import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cyv extends cwp {
   public static final MapCodec<cyv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djv.a.fieldOf("block_set_type").forGetter(cyv::b), u()).apply($$0, cyv::new)
   );
   public static final dka b = dak.aE;
   public static final djx c = djw.u;
   public static final dke<dkb> d = djw.be;
   public static final djx e = djw.w;
   public static final dke<dkc> f = djw.ae;
   protected static final float g = 3.0F;
   protected static final eml h = cwp.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eml i = cwp.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eml j = cwp.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eml k = cwp.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final djv l;

   @Override
   public MapCodec<? extends cyv> a() {
      return a;
   }

   protected cyv(djv $$0, djf.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)).a(d, dkb.a).a(e, Boolean.valueOf(false)).a(f, dkc.b));
   }

   public djv b() {
      return this.l;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      ic $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dkb.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      dkc $$6 = $$0.c(f);
      if ($$1.o() != ic.a.b || $$6 == dkc.b != ($$1 == ic.b)) {
         return $$6 == dkc.b && $$1 == ic.a && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof cyv && $$2.c(f) != $$6 ? $$2.a(f, $$6) : cwr.a.o();
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, ctg $$3, BiConsumer<cmx, hx> $$4) {
      if ($$3.j() == ctg.a.d && $$0.c(f) == dkc.b && !$$1.y_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.h($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
      if (!$$0.B && $$3.f()) {
         cyx.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      hx $$1 = $$0.a();
      cto $$2 = $$0.q();
      if ($$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dkc.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      $$0.a($$1.c(), $$2.a(f, dkc.a), 3);
   }

   private dkb b(cpg $$0) {
      csu $$1 = $$0.q();
      hx $$2 = $$0.a();
      ic $$3 = $$0.g();
      hx $$4 = $$2.c();
      ic $$5 = $$3.i();
      hx $$6 = $$2.a($$5);
      djg $$7 = $$1.a_($$6);
      hx $$8 = $$4.a($$5);
      djg $$9 = $$1.a_($$8);
      ic $$10 = $$3.h();
      hx $$11 = $$2.a($$10);
      djg $$12 = $$1.a_($$11);
      hx $$13 = $$4.a($$10);
      djg $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dkc.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dkc.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            els $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dkb.a : dkb.b;
         } else {
            return dkb.a;
         }
      } else {
         return dkb.b;
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if (!this.l.c()) {
         return bka.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.h($$0) ? dnq.h : dnq.d, $$2);
         return bka.a($$1.B);
      }
   }

   public boolean h(djg $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable blu $$0, cto $$1, djg $$2, hx $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dnq.h : dnq.d, $$3);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dkc.b ? ic.b : ic.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dnq.h : dnq.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.d();
      djg $$4 = $$1.a_($$3);
      return $$0.c(f) == dkc.b ? $$4.d($$1, $$3, ic.b) : $$4.a(this);
   }

   private void a(@Nullable blu $$0, cto $$1, hx $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), ars.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$1 == dbl.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   public long a(djg $$0, hx $$1) {
      return aun.b($$1.u(), $$1.c($$0.c(f) == dkc.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cto $$0, hx $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(djg $$0) {
      if ($$0.b() instanceof cyv $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
