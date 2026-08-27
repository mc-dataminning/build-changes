import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cwe extends cua {
   public static final MapCodec<cwe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgq.a.fieldOf("block_set_type").forGetter(cwe::b), t()).apply($$0, cwe::new)
   );
   public static final dgv b = cxu.aE;
   public static final dgs c = dgr.u;
   public static final dgz<dgw> d = dgr.be;
   public static final dgs e = dgr.w;
   public static final dgz<dgx> f = dgr.ae;
   protected static final float g = 3.0F;
   protected static final eiy h = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eiy i = cua.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eiy j = cua.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eiy k = cua.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dgq l;

   @Override
   public MapCodec<cwe> a() {
      return a;
   }

   protected cwe(dgq $$0, dga.d $$1) {
      super($$1.a($$0.f()));
      this.l = $$0;
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)).a(d, dgw.a).a(e, Boolean.valueOf(false)).a(f, dgx.b));
   }

   public dgq b() {
      return this.l;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      hx $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dgw.b;
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
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      dgx $$6 = $$0.c(f);
      if ($$1.o() != hx.a.b || $$6 == dgx.b != ($$1 == hx.b)) {
         return $$6 == dgx.b && $$1 == hx.a && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.a(this) && $$2.c(f) != $$6 ? $$0.a(b, $$2.c(b)).a(c, $$2.c(c)).a(d, $$2.c(d)).a(e, $$2.c(e)) : cuc.a.o();
      }
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      if (!$$0.B && $$3.f()) {
         cwg.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
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
   public dgb a(cmr $$0) {
      ht $$1 = $$0.a();
      cqz $$2 = $$0.q();
      if ($$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dgx.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      $$0.a($$1.c(), $$2.a(f, dgx.a), 3);
   }

   private dgw b(cmr $$0) {
      cqf $$1 = $$0.q();
      ht $$2 = $$0.a();
      hx $$3 = $$0.g();
      ht $$4 = $$2.c();
      hx $$5 = $$3.i();
      ht $$6 = $$2.a($$5);
      dgb $$7 = $$1.a_($$6);
      ht $$8 = $$4.a($$5);
      dgb $$9 = $$1.a_($$8);
      hx $$10 = $$3.h();
      ht $$11 = $$2.a($$10);
      dgb $$12 = $$1.a_($$11);
      ht $$13 = $$4.a($$10);
      dgb $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dgx.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dgx.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eif $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dgw.a : dgw.b;
         } else {
            return dgw.a;
         }
      } else {
         return dgw.b;
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if (!this.l.c()) {
         return bib.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.h($$0) ? dkl.h : dkl.d, $$2);
         return bib.a($$1.B);
      }
   }

   public boolean h(dgb $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bjt $$0, cqz $$1, dgb $$2, ht $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dkl.h : dkl.d, $$3);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(f) == dgx.b ? hx.b : hx.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dkl.h : dkl.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgb $$4 = $$1.a_($$3);
      return $$0.c(f) == dgx.b ? $$4.d($$1, $$3, hx.b) : $$4.a(this);
   }

   private void a(@Nullable bjt $$0, cqz $$1, ht $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), aqe.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$1 == cyv.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   public long a(dgb $$0, ht $$1) {
      return asy.b($$1.u(), $$1.c($$0.c(f) == dgx.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cqz $$0, ht $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dgb $$0) {
      if ($$0.b() instanceof cwe $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
