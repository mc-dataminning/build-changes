import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cxg extends cva {
   public static final MapCodec<cxg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhx.a.fieldOf("block_set_type").forGetter(cxg::b), u()).apply($$0, cxg::new)
   );
   public static final dic b = cyv.aE;
   public static final dhz c = dhy.u;
   public static final dig<did> d = dhy.be;
   public static final dhz e = dhy.w;
   public static final dig<die> f = dhy.ae;
   protected static final float g = 3.0F;
   protected static final ekn h = cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ekn i = cva.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ekn j = cva.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekn k = cva.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dhx l;

   @Override
   public MapCodec<? extends cxg> a() {
      return a;
   }

   protected cxg(dhx $$0, dhh.d $$1) {
      super($$1.a($$0.f()));
      this.l = $$0;
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)).a(d, did.a).a(e, Boolean.valueOf(false)).a(f, die.b));
   }

   public dhx b() {
      return this.l;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      hx $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == did.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      die $$6 = $$0.c(f);
      if ($$1.o() != hx.a.b || $$6 == die.b != ($$1 == hx.b)) {
         return $$6 == die.b && $$1 == hx.a && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof cxg && $$2.c(f) != $$6 ? $$2.a(f, $$6) : cvc.a.o();
      }
   }

   @Override
   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      if (!$$0.B && $$3.f()) {
         cxi.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ht $$1 = $$0.a();
      csa $$2 = $$0.q();
      if ($$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.B($$1) || $$2.B($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, die.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      $$0.a($$1.c(), $$2.a(f, die.a), 3);
   }

   private did b(cnr $$0) {
      crg $$1 = $$0.q();
      ht $$2 = $$0.a();
      hx $$3 = $$0.g();
      ht $$4 = $$2.c();
      hx $$5 = $$3.i();
      ht $$6 = $$2.a($$5);
      dhi $$7 = $$1.a_($$6);
      ht $$8 = $$4.a($$5);
      dhi $$9 = $$1.a_($$8);
      hx $$10 = $$3.h();
      ht $$11 = $$2.a($$10);
      dhi $$12 = $$1.a_($$11);
      ht $$13 = $$4.a($$10);
      dhi $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == die.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == die.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            eju $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? did.a : did.b;
         } else {
            return did.a;
         }
      } else {
         return did.b;
      }
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if (!this.l.c()) {
         return bix.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.h($$0) ? dls.h : dls.d, $$2);
         return bix.a($$1.B);
      }
   }

   public boolean h(dhi $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bkq $$0, csa $$1, dhi $$2, ht $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dls.h : dls.d, $$3);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.a($$0.c(f) == die.b ? hx.b : hx.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dls.h : dls.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      dhi $$4 = $$1.a_($$3);
      return $$0.c(f) == die.b ? $$4.d($$1, $$3, hx.b) : $$4.a(this);
   }

   private void a(@Nullable bkq $$0, csa $$1, ht $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.h() : this.l.g(), aqs.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$1 == czw.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   public long a(dhi $$0, ht $$1) {
      return atm.b($$1.u(), $$1.c($$0.c(f) == die.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(csa $$0, ht $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dhi $$0) {
      if ($$0.b() instanceof cxg $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
