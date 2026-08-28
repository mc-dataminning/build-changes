import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnk extends dna {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final eco<jc> b = drp.e;
   public static final eco<ece> c = ecg.Y;
   public static final ech d = ecg.A;
   private static final fgw f = fgt.a(dno.b(6.0, 6.0, 13.0), dno.b(8.0, 4.0, 6.0));
   private static final fgw g = fgt.a(f, dno.b(2.0, 13.0, 16.0));
   private static final Map<jc.a, fgw> h = fgt.a(dno.a(16.0, 16.0, 8.0));
   private static final Map<jc.a, fgw> i = fgt.a(fgt.a(f, dno.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<jc, fgw> D = fgt.c(fgt.a(f, dno.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, ece.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      csi $$6 = $$3.p() instanceof csi $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      return (bvc)(this.a($$1, $$0, $$4, $$3, true) ? bvc.a : bvc.e);
   }

   public boolean a(dkj $$0, ebq $$1, ffy $$2, @Nullable csi $$3, boolean $$4) {
      jc $$5 = $$2.c();
      iw $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(axi.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(ebq $$0, jc $$1, double $$2) {
      if ($$1.o() != jc.a.b && !($$2 > 0.8124F)) {
         jc $$3 = $$0.c(b);
         ece $$4 = $$0.c(c);
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

   public boolean a(dkj $$0, iw $$1, @Nullable jc $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bxe $$0, dkj $$1, iw $$2, @Nullable jc $$3) {
      dyo $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dym) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dym)$$4).a($$3);
         $$1.a(null, $$2, awy.bZ, awz.e, 2.0F, 1.0F);
         $$1.a($$0, egq.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fgw o(ebq $$0) {
      jc $$1 = $$0.c(b);

      return switch ((ece)$$0.c(c)) {
         case a -> (fgw)h.get($$1.o());
         case c -> (fgw)D.get($$1);
         case d -> (fgw)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.o($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      jc $$1 = $$0.k();
      iw $$2 = $$0.a();
      dkj $$3 = $$0.q();
      jc.a $$4 = $$1.o();
      if ($$4 == jc.a.b) {
         ebq $$5 = this.m().b(c, $$1 == jc.a ? ece.b : ece.a).b(b, $$0.g());
         if ($$5.a((dkm)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jc.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jc.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jc.e)
            || $$4 == jc.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jc.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jc.c);
         ebq $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? ece.d : ece.c);
         if ($$7.a((dkm)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jc.b);
         $$7 = $$7.b(c, $$8 ? ece.a : ece.b);
         if ($$7.a((dkm)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      ece $$8 = $$0.c(c);
      jc $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != ece.d) {
         return dnq.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == ece.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, ece.c).b(b, $$4.g());
            }

            if ($$8 == ece.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, ece.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      jc $$3 = q($$0).g();
      return $$3 == jc.b ? dno.a($$1, $$2.d(), jc.a) : dqk.b($$1, $$2, $$3);
   }

   private static jc q(ebq $$0) {
      switch ((ece)$$0.c(c)) {
         case a:
            return jc.b;
         case b:
            return jc.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dym($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.F, $$0.C ? dym::a : dym::b);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   public ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
