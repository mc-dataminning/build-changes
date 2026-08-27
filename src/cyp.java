import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cyp extends cwj {
   public static final MapCodec<cyp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djp.a.fieldOf("block_set_type").forGetter(cyp::b), u()).apply($$0, cyp::new)
   );
   public static final dju b = dae.aE;
   public static final djr c = djq.u;
   public static final djy<djv> d = djq.be;
   public static final djr e = djq.w;
   public static final djy<djw> f = djq.ae;
   protected static final float g = 3.0F;
   protected static final emf h = cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final emf i = cwj.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final emf j = cwj.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emf k = cwj.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final djp l;

   @Override
   public MapCodec<? extends cyp> a() {
      return a;
   }

   protected cyp(djp $$0, diz.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)).a(d, djv.a).a(e, Boolean.valueOf(false)).a(f, djw.b));
   }

   public djp b() {
      return this.l;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      ic $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == djv.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      djw $$6 = $$0.c(f);
      if ($$1.o() != ic.a.b || $$6 == djw.b != ($$1 == ic.b)) {
         return $$6 == djw.b && $$1 == ic.a && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof cyp && $$2.c(f) != $$6 ? $$2.a(f, $$6) : cwl.a.o();
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cta $$3, BiConsumer<cmr, hx> $$4) {
      if ($$3.j() == cta.a.d && $$0.c(f) == djw.b && !$$1.y_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.h($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      if (!$$0.B && $$3.f()) {
         cyr.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      hx $$1 = $$0.a();
      cti $$2 = $$0.q();
      if ($$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, djw.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      $$0.a($$1.c(), $$2.a(f, djw.a), 3);
   }

   private djv b(cpa $$0) {
      cso $$1 = $$0.q();
      hx $$2 = $$0.a();
      ic $$3 = $$0.g();
      hx $$4 = $$2.c();
      ic $$5 = $$3.i();
      hx $$6 = $$2.a($$5);
      dja $$7 = $$1.a_($$6);
      hx $$8 = $$4.a($$5);
      dja $$9 = $$1.a_($$8);
      ic $$10 = $$3.h();
      hx $$11 = $$2.a($$10);
      dja $$12 = $$1.a_($$11);
      hx $$13 = $$4.a($$10);
      dja $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == djw.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == djw.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            elm $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? djv.a : djv.b;
         } else {
            return djv.a;
         }
      } else {
         return djv.b;
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if (!this.l.c()) {
         return bjv.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.h($$0) ? dnk.h : dnk.d, $$2);
         return bjv.a($$1.B);
      }
   }

   public boolean h(dja $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable blp $$0, cti $$1, dja $$2, hx $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dnk.h : dnk.d, $$3);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == djw.b ? ic.b : ic.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dnk.h : dnk.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      dja $$4 = $$1.a_($$3);
      return $$0.c(f) == djw.b ? $$4.d($$1, $$3, ic.b) : $$4.a(this);
   }

   private void a(@Nullable blp $$0, cti $$1, hx $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), arn.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$1 == dbf.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   public long a(dja $$0, hx $$1) {
      return aui.b($$1.u(), $$1.c($$0.c(f) == djw.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cti $$0, hx $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dja $$0) {
      if ($$0.b() instanceof cyp $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
