import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class die extends dfy {
   public static final MapCodec<die> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter(die::b), u()).apply($$0, die::new)
   );
   public static final dtw b = dju.aE;
   public static final dtt c = dts.u;
   public static final dua<dtx> d = dts.be;
   public static final dtt e = dts.w;
   public static final dua<dty> f = dts.ae;
   protected static final float g = 3.0F;
   protected static final exv h = dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final exv i = dfy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final exv j = dfy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exv k = dfy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dtr l;

   @Override
   public MapCodec<? extends die> a() {
      return a;
   }

   protected die(dtr $$0, dtb.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)).a(d, dtx.a).a(e, Boolean.valueOf(false)).a(f, dty.b));
   }

   public dtr b() {
      return this.l;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      ji $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dtx.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      dty $$6 = $$0.c(f);
      if ($$1.o() != ji.a.b || $$6 == dty.b != ($$1 == ji.b)) {
         return $$6 == dty.b && $$1 == ji.a && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof die && $$2.c(f) != $$6 ? $$2.a(f, $$6) : dga.a.o();
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dco $$3, BiConsumer<cuq, jd> $$4) {
      if ($$3.n() && $$0.c(f) == dty.b && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$0.B && ($$3.f() || !$$3.d($$2))) {
         dig.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return switch ($$1) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      jd $$1 = $$0.a();
      dcw $$2 = $$0.q();
      if ($$1.v() < $$2.am() - 1 && $$2.a_($$1.d()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.d());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dty.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, btn $$3, cuq $$4) {
      $$0.a($$1.d(), $$2.a(f, dty.a), 3);
   }

   private dtx b(cyd $$0) {
      dcc $$1 = $$0.q();
      jd $$2 = $$0.a();
      ji $$3 = $$0.g();
      jd $$4 = $$2.d();
      ji $$5 = $$3.i();
      jd $$6 = $$2.a($$5);
      dtc $$7 = $$1.a_($$6);
      jd $$8 = $$4.a($$5);
      dtc $$9 = $$1.a_($$8);
      ji $$10 = $$3.h();
      jd $$11 = $$2.a($$10);
      dtc $$12 = $$1.a_($$11);
      jd $$13 = $$4.a($$10);
      dtc $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.b() instanceof die && $$7.c(f) == dty.b;
      boolean $$17 = $$12.b() instanceof die && $$12.c(f) == dty.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            exc $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dtx.a : dtx.b;
         } else {
            return dtx.a;
         }
      } else {
         return dtx.b;
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if (!this.l.c()) {
         return bqr.e;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dxz.h : dxz.d, $$2);
         return bqr.a($$1.B);
      }
   }

   public boolean m(dtc $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bsr $$0, dcw $$1, dtc $$2, jd $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dxz.h : dxz.d, $$3);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dty.b ? ji.b : ji.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dxz.h : dxz.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.e();
      dtc $$4 = $$1.a_($$3);
      return $$0.c(f) == dty.b ? $$4.d($$1, $$3, ji.b) : $$4.a(this);
   }

   private void a(@Nullable bsr $$0, dcw $$1, jd $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), avq.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$1 == dkv.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dtc $$0, jd $$1) {
      return ayo.b($$1.u(), $$1.c($$0.c(f) == dty.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(dcw $$0, jd $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dtc $$0) {
      if ($$0.b() instanceof die $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
