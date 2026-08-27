import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwy extends cut {
   public static final MapCodec<cwy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhl.a.fieldOf("block_set_type").forGetter(cwy::b), t()).apply($$0, cwy::new)
   );
   public static final dhq b = cyo.aE;
   public static final dhn c = dhm.u;
   public static final dhu<dhr> d = dhm.be;
   public static final dhn e = dhm.w;
   public static final dhu<dhs> f = dhm.ae;
   protected static final float g = 3.0F;
   protected static final ekb h = cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ekb i = cut.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ekb j = cut.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekb k = cut.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dhl l;

   @Override
   public MapCodec<cwy> a() {
      return a;
   }

   protected cwy(dhl $$0, dgv.d $$1) {
      super($$1.a($$0.f()));
      this.l = $$0;
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)).a(d, dhr.a).a(e, Boolean.valueOf(false)).a(f, dhs.b));
   }

   public dhl b() {
      return this.l;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      hx $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dhr.b;
      switch ($$4) {
         case f:
         default:
            return $$5 ? k : ($$6 ? i : h);
         case d:
            return $$5 ? h : ($$6 ? k : j);
         case e:
            return $$5 ? j : ($$6 ? h : i);
         case c:
            return $$5 ? i : ($$6 ? j : k);
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      dhs $$6 = $$0.c(f);
      if ($$1.o() != hx.a.b || $$6 == dhs.b != ($$1 == hx.b)) {
         return $$6 == dhs.b && $$1 == hx.a && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(f) != $$6 ? $$0.a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)).a(e, $$2.c(e)) : cuv.a.o();
      }
   }

   @Override
   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      if (!$$0.B && $$3.f()) {
         cxa.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      switch ($$3) {
         case a:
            return $$0.c(c);
         case b:
            return false;
         case c:
            return $$0.c(c);
         default:
            return false;
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ht $$1 = $$0.a();
      crs $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dhs.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      $$0.a($$1.c(), $$2.a(f, dhs.a), 3);
   }

   private dhr b(cnj $$0) {
      cqy $$1 = $$0.q();
      ht $$2 = $$0.a();
      hx $$3 = $$0.g();
      ht $$4 = $$2.c();
      hx $$5 = $$3.i();
      ht $$6 = $$2.a($$5);
      dgw $$7 = $$1.a_($$6);
      ht $$8 = $$4.a($$5);
      dgw $$9 = $$1.a_($$8);
      hx $$10 = $$3.h();
      ht $$11 = $$2.a($$10);
      dgw $$12 = $$1.a_($$11);
      ht $$13 = $$4.a($$10);
      dgw $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dhs.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dhs.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eji $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dhr.a : dhr.b;
         } else {
            return dhr.a;
         }
      } else {
         return dhr.b;
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if (!this.l.c()) {
         return biq.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.h($$0) ? dlg.h : dlg.d, $$2);
         return biq.a($$1.B);
      }
   }

   public boolean h(dgw $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bki $$0, crs $$1, dgw $$2, ht $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dlg.h : dlg.d, $$3);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(f) == dhs.b ? hx.b : hx.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dlg.h : dlg.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgw $$4 = $$1.a_($$3);
      return $$0.c(f) == dhs.b ? $$4.d($$1, $$3, hx.b) : $$4.a(this);
   }

   private void a(@Nullable bki $$0, crs $$1, ht $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), aqo.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$1 == czp.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   public long a(dgw $$0, ht $$1) {
      return ati.b($$1.u(), $$1.c($$0.c(f) == dhs.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(crs $$0, ht $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dgw $$0) {
      if ($$0.b() instanceof cwy $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
