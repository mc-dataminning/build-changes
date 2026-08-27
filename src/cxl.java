import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cxl extends cvf {
   public static final MapCodec<cxl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dic.a.fieldOf("block_set_type").forGetter(cxl::b), u()).apply($$0, cxl::new)
   );
   public static final dih b = cza.aE;
   public static final die c = did.u;
   public static final dil<dii> d = did.be;
   public static final die e = did.w;
   public static final dil<dij> f = did.ae;
   protected static final float g = 3.0F;
   protected static final eks h = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eks i = cvf.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eks j = cvf.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eks k = cvf.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dic l;

   @Override
   public MapCodec<? extends cxl> a() {
      return a;
   }

   protected cxl(dic $$0, dhm.d $$1) {
      super($$1.a($$0.f()));
      this.l = $$0;
      this.k(this.E.b().a(b, ib.c).a(c, Boolean.valueOf(false)).a(d, dii.a).a(e, Boolean.valueOf(false)).a(f, dij.b));
   }

   public dic b() {
      return this.l;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ib $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dii.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      dij $$6 = $$0.c(f);
      if ($$1.o() != ib.a.b || $$6 == dij.b != ($$1 == ib.b)) {
         return $$6 == dij.b && $$1 == ib.a && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof cxl && $$2.c(f) != $$6 ? $$2.a(f, $$6) : cvh.a.o();
      }
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      if (!$$0.B && $$3.f()) {
         cxn.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      hx $$1 = $$0.a();
      csf $$2 = $$0.q();
      if ($$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dij.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      $$0.a($$1.c(), $$2.a(f, dij.a), 3);
   }

   private dii b(cnw $$0) {
      crl $$1 = $$0.q();
      hx $$2 = $$0.a();
      ib $$3 = $$0.g();
      hx $$4 = $$2.c();
      ib $$5 = $$3.i();
      hx $$6 = $$2.a($$5);
      dhn $$7 = $$1.a_($$6);
      hx $$8 = $$4.a($$5);
      dhn $$9 = $$1.a_($$8);
      ib $$10 = $$3.h();
      hx $$11 = $$2.a($$10);
      dhn $$12 = $$1.a_($$11);
      hx $$13 = $$4.a($$10);
      dhn $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dij.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dij.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ejz $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dii.a : dii.b;
         } else {
            return dii.a;
         }
      } else {
         return dii.b;
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if (!this.l.c()) {
         return bjb.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.h($$0) ? dlx.h : dlx.d, $$2);
         return bjb.a($$1.B);
      }
   }

   public boolean h(dhn $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bkv $$0, csf $$1, dhn $$2, hx $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dlx.h : dlx.d, $$3);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(f) == dij.b ? ib.b : ib.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dlx.h : dlx.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      dhn $$4 = $$1.a_($$3);
      return $$0.c(f) == dij.b ? $$4.d($$1, $$3, ib.b) : $$4.a(this);
   }

   private void a(@Nullable bkv $$0, csf $$1, hx $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), aqw.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$1 == dab.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   public long a(dhn $$0, hx $$1) {
      return atq.b($$1.u(), $$1.c($$0.c(f) == dij.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(csf $$0, hx $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dhn $$0) {
      if ($$0.b() instanceof cxl $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
