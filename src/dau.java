import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dau extends cyo {
   public static final MapCodec<dau> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlu.a.fieldOf("block_set_type").forGetter(dau::b), u()).apply($$0, dau::new)
   );
   public static final dlz b = dcj.aE;
   public static final dlw c = dlv.u;
   public static final dmd<dma> d = dlv.be;
   public static final dlw e = dlv.w;
   public static final dmd<dmb> f = dlv.ae;
   protected static final float g = 3.0F;
   protected static final eol h = cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eol i = cyo.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eol j = cyo.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eol k = cyo.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   private final dlu l;

   @Override
   public MapCodec<? extends dau> a() {
      return a;
   }

   protected dau(dlu $$0, dle.d $$1) {
      super($$1.a($$0.g()));
      this.l = $$0;
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)).a(d, dma.a).a(e, Boolean.valueOf(false)).a(f, dmb.b));
   }

   public dlu b() {
      return this.l;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      ie $$4 = $$0.c(b);
      boolean $$5 = !$$0.c(c);
      boolean $$6 = $$0.c(d) == dma.b;

      return switch ($$4) {
         case d -> $$5 ? h : ($$6 ? k : j);
         case e -> $$5 ? j : ($$6 ? h : i);
         case c -> $$5 ? i : ($$6 ? j : k);
         default -> $$5 ? k : ($$6 ? i : h);
      };
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      dmb $$6 = $$0.c(f);
      if ($$1.o() != ie.a.b || $$6 == dmb.b != ($$1 == ie.b)) {
         return $$6 == dmb.b && $$1 == ie.a && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$2.b() instanceof dau && $$2.c(f) != $$6 ? $$2.a(f, $$6) : cyq.a.o();
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cvf $$3, BiConsumer<coz, hz> $$4) {
      if ($$3.j() == cvf.a.d && $$0.c(f) == dmb.b && !$$1.y_() && this.l.d() && !$$0.c(e)) {
         this.a(null, $$1, $$0, $$2, !this.m($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      if (!$$0.B && ($$3.f() || !$$3.e($$2))) {
         daw.b($$0, $$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return switch ($$3) {
         case a, c -> $$0.c(c);
         case b -> false;
      };
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      hz $$1 = $$0.a();
      cvn $$2 = $$0.q();
      if ($$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0)) {
         boolean $$3 = $$2.C($$1) || $$2.C($$1.c());
         return this.o().a(b, $$0.g()).a(d, this.b($$0)).a(e, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(f, dmb.b);
      } else {
         return null;
      }
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      $$0.a($$1.c(), $$2.a(f, dmb.a), 3);
   }

   private dma b(crg $$0) {
      cut $$1 = $$0.q();
      hz $$2 = $$0.a();
      ie $$3 = $$0.g();
      hz $$4 = $$2.c();
      ie $$5 = $$3.i();
      hz $$6 = $$2.a($$5);
      dlf $$7 = $$1.a_($$6);
      hz $$8 = $$4.a($$5);
      dlf $$9 = $$1.a_($$8);
      ie $$10 = $$3.h();
      hz $$11 = $$2.a($$10);
      dlf $$12 = $$1.a_($$11);
      hz $$13 = $$4.a($$10);
      dlf $$14 = $$1.a_($$13);
      int $$15 = ($$7.r($$1, $$6) ? -1 : 0) + ($$9.r($$1, $$8) ? -1 : 0) + ($$12.r($$1, $$11) ? 1 : 0) + ($$14.r($$1, $$13) ? 1 : 0);
      boolean $$16 = $$7.a(this) && $$7.c(f) == dmb.b;
      boolean $$17 = $$12.a(this) && $$12.c(f) == dmb.b;
      if ((!$$16 || $$17) && $$15 <= 0) {
         if ((!$$17 || $$16) && $$15 >= 0) {
            int $$18 = $$3.j();
            int $$19 = $$3.l();
            ens $$20 = $$0.l();
            double $$21 = $$20.c - (double)$$2.u();
            double $$22 = $$20.e - (double)$$2.w();
            return ($$18 >= 0 || !($$22 < 0.5)) && ($$18 <= 0 || !($$22 > 0.5)) && ($$19 >= 0 || !($$21 > 0.5)) && ($$19 <= 0 || !($$21 < 0.5)) ? dma.a : dma.b;
         } else {
            return dma.a;
         }
      } else {
         return dma.b;
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if (!this.l.c()) {
         return blu.d;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 10);
         this.a($$3, $$1, $$2, $$0.c(c));
         $$1.a($$3, this.m($$0) ? dpp.h : dpp.d, $$2);
         return blu.a($$1.B);
      }
   }

   public boolean m(dlf $$0) {
      return $$0.c(c);
   }

   public void a(@Nullable bno $$0, cvn $$1, dlf $$2, hz $$3, boolean $$4) {
      if ($$2.a(this) && $$2.c(c) != $$4) {
         $$1.a($$3, $$2.a(c, Boolean.valueOf($$4)), 10);
         this.a($$0, $$1, $$3, $$4);
         $$1.a($$0, $$4 ? dpp.h : dpp.d, $$3);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2) || $$1.C($$2.a($$0.c(f) == dmb.b ? ie.b : ie.a));
      if (!this.o().a($$3) && $$6 != $$0.c(e)) {
         if ($$6 != $$0.c(c)) {
            this.a(null, $$1, $$2, $$6);
            $$1.a(null, $$6 ? dpp.h : dpp.d, $$2);
         }

         $$1.a($$2, $$0.a(e, Boolean.valueOf($$6)).a(c, Boolean.valueOf($$6)), 2);
      }
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      dlf $$4 = $$1.a_($$3);
      return $$0.c(f) == dmb.b ? $$4.d($$1, $$3, ie.b) : $$4.a(this);
   }

   private void a(@Nullable bno $$0, cvn $$1, hz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.l.i() : this.l.h(), atl.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$1 == ddk.a ? $$0 : $$0.a($$1.a($$0.c(b))).a(d);
   }

   @Override
   protected long a(dlf $$0, hz $$1) {
      return awh.b($$1.u(), $$1.c($$0.c(f) == dmb.b ? 0 : 1).v(), $$1.w());
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f, b, c, d, e);
   }

   public static boolean a(cvn $$0, hz $$1) {
      return n($$0.a_($$1));
   }

   public static boolean n(dlf $$0) {
      if ($$0.b() instanceof dau $$1 && $$1.b().c()) {
         return true;
      }

      return false;
   }
}
