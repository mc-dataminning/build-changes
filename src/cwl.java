import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cwl extends cwb {
   public static final MapCodec<cwl> a = b(cwl::new);
   public static final dka b = dak.aE;
   public static final dke<dju> c = djw.V;
   public static final djx d = djw.w;
   private static final eml f = cwp.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eml g = cwp.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eml h = cwp.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eml i = cwp.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eml j = emi.a(i, h);
   private static final eml k = emi.a(j, cwp.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eml l = emi.a(j, cwp.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eml m = emi.a(j, cwp.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eml n = emi.a(j, cwp.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eml o = emi.a(j, cwp.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eml F = emi.a(j, cwp.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eml G = emi.a(j, cwp.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<cwl> a() {
      return a;
   }

   public cwl(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, dju.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      blu $$4 = $$3.w();
      cfh $$5 = $$4 instanceof cfh ? (cfh)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bka.a($$1.B) : bka.d;
   }

   public boolean a(cto $$0, djg $$1, elo $$2, @Nullable cfh $$3, boolean $$4) {
      ic $$5 = $$2.b();
      hx $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(asb.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(djg $$0, ic $$1, double $$2) {
      if ($$1.o() != ic.a.b && !($$2 > 0.8124F)) {
         ic $$3 = $$0.c(b);
         dju $$4 = $$0.c(c);
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

   public boolean a(cto $$0, hx $$1, @Nullable ic $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable blu $$0, cto $$1, hx $$2, @Nullable ic $$3) {
      dgu $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dgs) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dgs)$$4).a($$3);
         $$1.a(null, $$2, arr.bK, ars.e, 2.0F, 1.0F);
         $$1.a($$0, dnq.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eml h(djg $$0) {
      ic $$1 = $$0.c(b);
      dju $$2 = $$0.c(c);
      if ($$2 == dju.a) {
         return $$1 != ic.c && $$1 != ic.d ? g : f;
      } else if ($$2 == dju.b) {
         return G;
      } else if ($$2 == dju.d) {
         return $$1 != ic.c && $$1 != ic.d ? l : k;
      } else if ($$1 == ic.c) {
         return o;
      } else if ($$1 == ic.d) {
         return F;
      } else {
         return $$1 == ic.f ? n : m;
      }
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.h($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.h($$0);
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      ic $$1 = $$0.k();
      hx $$2 = $$0.a();
      cto $$3 = $$0.q();
      ic.a $$4 = $$1.o();
      if ($$4 == ic.a.b) {
         djg $$5 = this.o().a(c, $$1 == ic.a ? dju.b : dju.a).a(b, $$0.g());
         if ($$5.a((ctr)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ic.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ic.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ic.e)
            || $$4 == ic.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ic.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ic.c);
         djg $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dju.d : dju.c);
         if ($$7.a((ctr)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ic.b);
         $$7 = $$7.a(c, $$8 ? dju.a : dju.b);
         if ($$7.a((ctr)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, ctg $$3, BiConsumer<cmx, hx> $$4) {
      if ($$3.j() == ctg.a.d && !$$1.y_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      dju $$6 = $$0.c(c);
      ic $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dju.d) {
         return cwr.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dju.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dju.c).a(b, $$1.g());
            }

            if ($$6 == dju.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dju.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      ic $$3 = n($$0).g();
      return $$3 == ic.b ? cwp.a($$1, $$2.c(), ic.a) : czj.b($$1, $$2, $$3);
   }

   private static ic n(djg $$0) {
      switch ((dju)$$0.c(c)) {
         case a:
            return ic.b;
         case b:
            return ic.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.E, $$0.B ? dgs::a : dgs::b);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
