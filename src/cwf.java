import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cwf extends cvv {
   public static final MapCodec<cwf> a = b(cwf::new);
   public static final dju b = dae.aE;
   public static final djy<djo> c = djq.V;
   public static final djr d = djq.w;
   private static final emf f = cwj.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final emf g = cwj.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final emf h = cwj.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final emf i = cwj.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final emf j = emc.a(i, h);
   private static final emf k = emc.a(j, cwj.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final emf l = emc.a(j, cwj.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final emf m = emc.a(j, cwj.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final emf n = emc.a(j, cwj.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final emf o = emc.a(j, cwj.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final emf F = emc.a(j, cwj.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final emf G = emc.a(j, cwj.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<cwf> a() {
      return a;
   }

   public cwf(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, djo.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      blp $$4 = $$3.w();
      cfb $$5 = $$4 instanceof cfb ? (cfb)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bjv.a($$1.B) : bjv.d;
   }

   public boolean a(cti $$0, dja $$1, eli $$2, @Nullable cfb $$3, boolean $$4) {
      ic $$5 = $$2.b();
      hx $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(arw.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dja $$0, ic $$1, double $$2) {
      if ($$1.o() != ic.a.b && !($$2 > 0.8124F)) {
         ic $$3 = $$0.c(b);
         djo $$4 = $$0.c(c);
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

   public boolean a(cti $$0, hx $$1, @Nullable ic $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable blp $$0, cti $$1, hx $$2, @Nullable ic $$3) {
      dgo $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dgm) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dgm)$$4).a($$3);
         $$1.a(null, $$2, arm.bK, arn.e, 2.0F, 1.0F);
         $$1.a($$0, dnk.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private emf h(dja $$0) {
      ic $$1 = $$0.c(b);
      djo $$2 = $$0.c(c);
      if ($$2 == djo.a) {
         return $$1 != ic.c && $$1 != ic.d ? g : f;
      } else if ($$2 == djo.b) {
         return G;
      } else if ($$2 == djo.d) {
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
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.h($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.h($$0);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      ic $$1 = $$0.k();
      hx $$2 = $$0.a();
      cti $$3 = $$0.q();
      ic.a $$4 = $$1.o();
      if ($$4 == ic.a.b) {
         dja $$5 = this.o().a(c, $$1 == ic.a ? djo.b : djo.a).a(b, $$0.g());
         if ($$5.a((ctl)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ic.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ic.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ic.e)
            || $$4 == ic.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ic.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ic.c);
         dja $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? djo.d : djo.c);
         if ($$7.a((ctl)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ic.b);
         $$7 = $$7.a(c, $$8 ? djo.a : djo.b);
         if ($$7.a((ctl)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cta $$3, BiConsumer<cmr, hx> $$4) {
      if ($$3.j() == cta.a.d && !$$1.y_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      djo $$6 = $$0.c(c);
      ic $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != djo.d) {
         return cwl.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == djo.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, djo.c).a(b, $$1.g());
            }

            if ($$6 == djo.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, djo.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      ic $$3 = n($$0).g();
      return $$3 == ic.b ? cwj.a($$1, $$2.c(), ic.a) : czd.b($$1, $$2, $$3);
   }

   private static ic n(dja $$0) {
      switch ((djo)$$0.c(c)) {
         case a:
            return ic.b;
         case b:
            return ic.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dgm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.E, $$0.B ? dgm::a : dgm::b);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
