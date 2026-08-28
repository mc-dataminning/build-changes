import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dew extends dem {
   public static final MapCodec<dew> a = b(dew::new);
   public static final dsx b = diw.aE;
   public static final dtb<dsr> c = dst.V;
   public static final dsu d = dst.w;
   private static final ewl f = dfa.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ewl g = dfa.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ewl h = dfa.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ewl i = dfa.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ewl j = ewi.a(i, h);
   private static final ewl k = ewi.a(j, dfa.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ewl l = ewi.a(j, dfa.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ewl m = ewi.a(j, dfa.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ewl n = ewi.a(j, dfa.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ewl o = ewi.a(j, dfa.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ewl F = ewi.a(j, dfa.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ewl G = ewi.a(j, dfa.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dsr.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
      bsv $$4 = $$3.s();
      cmy $$5 = $$4 instanceof cmy ? (cmy)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bqv.a($$1.B) : bqv.e;
   }

   public boolean a(dbz $$0, dsd $$1, evo $$2, @Nullable cmy $$3, boolean $$4) {
      je $$5 = $$2.b();
      iz $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awk.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dsd $$0, je $$1, double $$2) {
      if ($$1.o() != je.a.b && !($$2 > 0.8124F)) {
         je $$3 = $$0.c(b);
         dsr $$4 = $$0.c(c);
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

   public boolean a(dbz $$0, iz $$1, @Nullable je $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bsv $$0, dbz $$1, iz $$2, @Nullable je $$3) {
      dpi $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dpg) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dpg)$$4).a($$3);
         $$1.a(null, $$2, awa.bZ, awb.e, 2.0F, 1.0F);
         $$1.a($$0, dww.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ewl m(dsd $$0) {
      je $$1 = $$0.c(b);
      dsr $$2 = $$0.c(c);
      if ($$2 == dsr.a) {
         return $$1 != je.c && $$1 != je.d ? g : f;
      } else if ($$2 == dsr.b) {
         return G;
      } else if ($$2 == dsr.d) {
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
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.m($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.m($$0);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      je $$1 = $$0.k();
      iz $$2 = $$0.a();
      dbz $$3 = $$0.q();
      je.a $$4 = $$1.o();
      if ($$4 == je.a.b) {
         dsd $$5 = this.o().a(c, $$1 == je.a ? dsr.b : dsr.a).a(b, $$0.g());
         if ($$5.a((dcc)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == je.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), je.f) && $$3.a_($$2.h()).d($$3, $$2.h(), je.e)
            || $$4 == je.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), je.d) && $$3.a_($$2.f()).d($$3, $$2.f(), je.c);
         dsd $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dsr.d : dsr.c);
         if ($$7.a((dcc)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), je.b);
         $$7 = $$7.a(c, $$8 ? dsr.a : dsr.b);
         if ($$7.a((dcc)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dbr $$3, BiConsumer<cuq, iz> $$4) {
      if ($$3.j() == dbr.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      dsr $$6 = $$0.c(c);
      je $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dsr.d) {
         return dfc.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dsr.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dsr.c).a(b, $$1.g());
            }

            if ($$6 == dsr.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dsr.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      je $$3 = n($$0).g();
      return $$3 == je.b ? dfa.a($$1, $$2.c(), je.a) : dhu.b($$1, $$2, $$3);
   }

   private static je n(dsd $$0) {
      switch ((dsr)$$0.c(c)) {
         case a:
            return je.b;
         case b:
            return je.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.E, $$0.B ? dpg::a : dpg::b);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   public dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
