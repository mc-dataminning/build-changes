import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class deu extends dek {
   public static final MapCodec<deu> a = b(deu::new);
   public static final dsv b = diu.aE;
   public static final dsz<dsp> c = dsr.V;
   public static final dss d = dsr.w;
   private static final ewj f = dey.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ewj g = dey.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ewj h = dey.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ewj i = dey.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ewj j = ewg.a(i, h);
   private static final ewj k = ewg.a(j, dey.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ewj l = ewg.a(j, dey.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ewj m = ewg.a(j, dey.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ewj n = ewg.a(j, dey.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ewj o = ewg.a(j, dey.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ewj F = ewg.a(j, dey.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ewj G = ewg.a(j, dey.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deu(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dsp.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
      bst $$4 = $$3.s();
      cmw $$5 = $$4 instanceof cmw ? (cmw)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bqt.a($$1.B) : bqt.e;
   }

   public boolean a(dbx $$0, dsb $$1, evm $$2, @Nullable cmw $$3, boolean $$4) {
      je $$5 = $$2.b();
      iz $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awj.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dsb $$0, je $$1, double $$2) {
      if ($$1.o() != je.a.b && !($$2 > 0.8124F)) {
         je $$3 = $$0.c(b);
         dsp $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dbx $$0, iz $$1, @Nullable je $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bst $$0, dbx $$1, iz $$2, @Nullable je $$3) {
      dpg $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dpe) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dpe)$$4).a($$3);
         $$1.a(null, $$2, avz.bZ, awa.e, 2.0F, 1.0F);
         $$1.a($$0, dwu.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ewj m(dsb $$0) {
      je $$1 = $$0.c(b);
      dsp $$2 = $$0.c(c);
      if ($$2 == dsp.a) {
         return $$1 != je.c && $$1 != je.d ? g : f;
      } else if ($$2 == dsp.b) {
         return G;
      } else if ($$2 == dsp.d) {
         return $$1 != je.c && $$1 != je.d ? l : k;
      } else if ($$1 == je.c) {
         return o;
      } else if ($$1 == je.d) {
         return F;
      } else {
         return $$1 == je.f ? n : m;
      }
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.m($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.m($$0);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      dbx $$3 = $$0.q();
      je.a $$4 = $$1.o();
      if ($$4 == je.a.b) {
         dsb $$5 = this.o().a(c, $$1 == je.a ? dsp.b : dsp.a).a(b, $$0.g());
         if ($$5.a((dca)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == je.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), je.f) && $$3.a_($$2.h()).d($$3, $$2.h(), je.e)
            || $$4 == je.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), je.d) && $$3.a_($$2.f()).d($$3, $$2.f(), je.c);
         dsb $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dsp.d : dsp.c);
         if ($$7.a((dca)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), je.b);
         $$7 = $$7.a(c, $$8 ? dsp.a : dsp.b);
         if ($$7.a((dca)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dbp $$3, BiConsumer<cuo, iz> $$4) {
      if ($$3.j() == dbp.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      dsp $$6 = $$0.c(c);
      je $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dsp.d) {
         return dfa.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dsp.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dsp.c).a(b, $$1.g());
            }

            if ($$6 == dsp.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dsp.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      je $$3 = n($$0).g();
      return $$3 == je.b ? dey.a($$1, $$2.c(), je.a) : dhs.b($$1, $$2, $$3);
   }

   private static je n(dsb $$0) {
      switch ((dsp)$$0.c(c)) {
         case a:
            return je.b;
         case b:
            return je.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return a($$2, dpi.E, $$0.B ? dpe::a : dpe::b);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   public dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
