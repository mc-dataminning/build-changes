import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhl extends dff {
   public static final MapCodec<dhl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.fieldOf("block_set_type").forGetter(dhl::b), u()).apply($$0, dhl::new)
   );
   public static final dtb b = djb.aE;
   public static final dsy c = dsx.u;
   public static final dtf<dtc> d = dsx.be;
   public static final dsy e = dsx.w;
   public static final dtf<dtd> f = dsx.ae;
   protected static final float g = 3.0F;
   protected static final ews h = dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ews i = dff.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ews j = dff.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ews k = dff.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dsw l;

   @Override
   public MapCodec<? extends dhl> a() {
      return a;
   }

   protected dhl(dsw $$0, dsg.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)).a(d, dtc.a).a(e, Boolean.valueOf(false)).a(f, dtd.b));
   }

   public dsw b() {
      return this.l;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      jf $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dtc.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      dtd $$6 = $$0.c(f);
      if ($$1.o() != jf.a.b || $$6 == dtd.b != ($$1 == jf.b)) {
         return $$6 == dtd.b && $$1 == jf.a && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dhl && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dfh.a.o();
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dbv $$3, BiConsumer<cua, ja> $$4) {
      if ($$3.n() && $$0.c(f) == dtd.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$0.B && ($$3.f() || !$$3.d($$2))) {
         dhn.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      ja $$1 = $$0.a();
      dcd $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dtd.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
      $$0.a($$1.c(), $$2.a(f, dtd.a), 3);
   }

   private dtc b(cxk $$0) {
      dbj $$1 = $$0.q();
      ja $$2 = $$0.a();
      jf $$3 = $$0.g();
      ja $$4 = $$2.c();
      jf $$5 = $$3.i();
      ja $$6 = $$2.a($$5);
      dsh $$7 = $$1.a_($$6);
      ja $$8 = $$4.a($$5);
      dsh $$9 = $$1.a_($$8);
      jf $$10 = $$3.h();
      ja $$11 = $$2.a($$10);
      dsh $$12 = $$1.a_($$11);
      ja $$13 = $$4.a($$10);
      dsh $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dtd.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dtd.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            evz $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dtc.a : dtc.b;
         } else {
            return dtc.a;
         }
      } else {
         return dtc.b;
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if (!this.l.c()) {
         return bqd.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dxa.h : dxa.d, $$2);
         return bqd.a($$1.B);
      }
   }

   public boolean m(dsh $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bsd $$0, dcd $$1, dsh $$2, ja $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dxa.h : dxa.d, $$3);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dtd.b ? jf.b : jf.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dxa.h : dxa.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      dsh $$4 = $$1.a_($$3);
      return $$0.c(f) == dtd.b ? $$4.d($$1, $$3, jf.b) : $$4.a(this);
   }

   private void a(@Nullable bsd $$0, dcd $$1, ja $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), avg.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$1 == dkc.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dsh $$0, ja $$1) {
      return aye.b($$1.u(), $$1.c($$0.c(f) == dtd.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dcd $$0, ja $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dsh $$0) {
      if ($$0.b() instanceof dhl $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
