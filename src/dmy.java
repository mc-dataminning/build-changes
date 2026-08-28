import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmy extends dmo {
   public static final MapCodec<dmy> a = b(dmy::new);
   public static final ecc<jb> b = drd.e;
   public static final ecc<ebs> c = ebu.Y;
   public static final ebv d = ebu.A;
   private static final fgk f = fgh.a(dnc.b(6.0, 6.0, 13.0), dnc.b(8.0, 4.0, 6.0));
   private static final fgk g = fgh.a(f, dnc.b(2.0, 13.0, 16.0));
   private static final Map<jb.a, fgk> h = fgh.a(dnc.a(16.0, 16.0, 8.0));
   private static final Map<jb.a, fgk> i = fgh.a(fgh.a(f, dnc.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<jb, fgk> D = fgh.c(fgh.a(f, dnc.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, ebs.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
      crx $$6 = $$3.q() instanceof crx $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      return (bur)(this.a($$1, $$0, $$4, $$3, true) ? bur.a : bur.e);
   }

   public boolean a(djx $$0, ebe $$1, ffm $$2, @Nullable crx $$3, boolean $$4) {
      jb $$5 = $$2.c();
      iv $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awz.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(ebe $$0, jb $$1, double $$2) {
      if ($$1.o() != jb.a.b && !($$2 > 0.8124F)) {
         jb $$3 = $$0.c(b);
         ebs $$4 = $$0.c(c);
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

   public boolean a(djx $$0, iv $$1, @Nullable jb $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bwt $$0, djx $$1, iv $$2, @Nullable jb $$3) {
      dyc $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dya) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dya)$$4).a($$3);
         $$1.a(null, $$2, awp.bZ, awq.e, 2.0F, 1.0F);
         $$1.a($$0, ege.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fgk o(ebe $$0) {
      jb $$1 = $$0.c(b);

      return switch ((ebs)$$0.c(c)) {
         case a -> (fgk)h.get($$1.o());
         case c -> (fgk)D.get($$1);
         case d -> (fgk)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.o($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      jb $$1 = $$0.k();
      iv $$2 = $$0.a();
      djx $$3 = $$0.q();
      jb.a $$4 = $$1.o();
      if ($$4 == jb.a.b) {
         ebe $$5 = this.m().b(c, $$1 == jb.a ? ebs.b : ebs.a).b(b, $$0.g());
         if ($$5.a((dka)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jb.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jb.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jb.e)
            || $$4 == jb.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jb.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jb.c);
         ebe $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? ebs.d : ebs.c);
         if ($$7.a((dka)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jb.b);
         $$7 = $$7.b(c, $$8 ? ebs.a : ebs.b);
         if ($$7.a((dka)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      ebs $$8 = $$0.c(c);
      jb $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != ebs.d) {
         return dne.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == ebs.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, ebs.c).b(b, $$4.g());
            }

            if ($$8 == ebs.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, ebs.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      jb $$3 = q($$0).g();
      return $$3 == jb.b ? dnc.a($$1, $$2.d(), jb.a) : dpy.b($$1, $$2, $$3);
   }

   private static jb q(ebe $$0) {
      switch ((ebs)$$0.c(c)) {
         case a:
            return jb.b;
         case b:
            return jb.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dya($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.F, $$0.C ? dya::a : dya::b);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   @Override
   public ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
