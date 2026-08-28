import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dna extends dmq {
   public static final MapCodec<dna> a = b(dna::new);
   public static final ece<jc> b = drf.e;
   public static final ece<ebu> c = ebw.Y;
   public static final ebx d = ebw.A;
   private static final fgm f = fgj.a(dne.b(6.0, 6.0, 13.0), dne.b(8.0, 4.0, 6.0));
   private static final fgm g = fgj.a(f, dne.b(2.0, 13.0, 16.0));
   private static final Map<jc.a, fgm> h = fgj.a(dne.a(16.0, 16.0, 8.0));
   private static final Map<jc.a, fgm> i = fgj.a(fgj.a(f, dne.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<jc, fgm> D = fgj.c(fgj.a(f, dne.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   public dna(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, ebu.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
      crz $$6 = $$3.q() instanceof crz $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      return (but)(this.a($$1, $$0, $$4, $$3, true) ? but.a : but.e);
   }

   public boolean a(djz $$0, ebg $$1, ffo $$2, @Nullable crz $$3, boolean $$4) {
      jc $$5 = $$2.c();
      iw $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(axb.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(ebg $$0, jc $$1, double $$2) {
      if ($$1.o() != jc.a.b && !($$2 > 0.8124F)) {
         jc $$3 = $$0.c(b);
         ebu $$4 = $$0.c(c);
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

   public boolean a(djz $$0, iw $$1, @Nullable jc $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bwv $$0, djz $$1, iw $$2, @Nullable jc $$3) {
      dye $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dyc) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dyc)$$4).a($$3);
         $$1.a(null, $$2, awr.bZ, aws.e, 2.0F, 1.0F);
         $$1.a($$0, egg.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fgm o(ebg $$0) {
      jc $$1 = $$0.c(b);

      return switch ((ebu)$$0.c(c)) {
         case a -> (fgm)h.get($$1.o());
         case c -> (fgm)D.get($$1);
         case d -> (fgm)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.o($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      jc $$1 = $$0.k();
      iw $$2 = $$0.a();
      djz $$3 = $$0.q();
      jc.a $$4 = $$1.o();
      if ($$4 == jc.a.b) {
         ebg $$5 = this.m().b(c, $$1 == jc.a ? ebu.b : ebu.a).b(b, $$0.g());
         if ($$5.a((dkc)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jc.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jc.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jc.e)
            || $$4 == jc.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jc.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jc.c);
         ebg $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? ebu.d : ebu.c);
         if ($$7.a((dkc)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jc.b);
         $$7 = $$7.b(c, $$8 ? ebu.a : ebu.b);
         if ($$7.a((dkc)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      ebu $$8 = $$0.c(c);
      jc $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != ebu.d) {
         return dng.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == ebu.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, ebu.c).b(b, $$4.g());
            }

            if ($$8 == ebu.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, ebu.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      jc $$3 = q($$0).g();
      return $$3 == jc.b ? dne.a($$1, $$2.d(), jc.a) : dqa.b($$1, $$2, $$3);
   }

   private static jc q(ebg $$0) {
      switch ((ebu)$$0.c(c)) {
         case a:
            return jc.b;
         case b:
            return jc.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.F, $$0.C ? dyc::a : dyc::b);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   public ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
