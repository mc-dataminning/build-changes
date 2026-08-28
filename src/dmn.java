import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmn extends dmd {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final ebr<jb> b = dqs.e;
   public static final ebr<ebh> c = ebj.Y;
   public static final ebk d = ebj.A;
   private static final ffw f = fft.a(dmr.b(6.0, 6.0, 13.0), dmr.b(8.0, 4.0, 6.0));
   private static final ffw g = fft.a(f, dmr.b(2.0, 13.0, 16.0));
   private static final Map<jb.a, ffw> h = fft.a(dmr.a(16.0, 16.0, 8.0));
   private static final Map<jb.a, ffw> i = fft.a(fft.a(f, dmr.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<jb, ffw> D = fft.c(fft.a(f, dmr.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   public dmn(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, ebh.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
      crm $$6 = $$3.q() instanceof crm $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      return (bug)(this.a($$1, $$0, $$4, $$3, true) ? bug.a : bug.e);
   }

   public boolean a(djm $$0, eat $$1, fey $$2, @Nullable crm $$3, boolean $$4) {
      jb $$5 = $$2.c();
      iv $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awx.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(eat $$0, jb $$1, double $$2) {
      if ($$1.o() != jb.a.b && !($$2 > 0.8124F)) {
         jb $$3 = $$0.c(b);
         ebh $$4 = $$0.c(c);
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

   public boolean a(djm $$0, iv $$1, @Nullable jb $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bwi $$0, djm $$1, iv $$2, @Nullable jb $$3) {
      dxr $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dxp) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dxp)$$4).a($$3);
         $$1.a(null, $$2, awn.bZ, awo.e, 2.0F, 1.0F);
         $$1.a($$0, eft.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ffw o(eat $$0) {
      jb $$1 = $$0.c(b);

      return switch ((ebh)$$0.c(c)) {
         case a -> (ffw)h.get($$1.o());
         case c -> (ffw)D.get($$1);
         case d -> (ffw)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.o($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      jb $$1 = $$0.k();
      iv $$2 = $$0.a();
      djm $$3 = $$0.q();
      jb.a $$4 = $$1.o();
      if ($$4 == jb.a.b) {
         eat $$5 = this.m().b(c, $$1 == jb.a ? ebh.b : ebh.a).b(b, $$0.g());
         if ($$5.a((djp)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jb.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jb.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jb.e)
            || $$4 == jb.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jb.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jb.c);
         eat $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? ebh.d : ebh.c);
         if ($$7.a((djp)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jb.b);
         $$7 = $$7.b(c, $$8 ? ebh.a : ebh.b);
         if ($$7.a((djp)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      ebh $$8 = $$0.c(c);
      jb $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != ebh.d) {
         return dmt.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == ebh.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, ebh.c).b(b, $$4.g());
            }

            if ($$8 == ebh.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, ebh.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      jb $$3 = q($$0).g();
      return $$3 == jb.b ? dmr.a($$1, $$2.d(), jb.a) : dpn.b($$1, $$2, $$3);
   }

   private static jb q(eat $$0) {
      switch ((ebh)$$0.c(c)) {
         case a:
            return jb.b;
         case b:
            return jb.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.F, $$0.C ? dxp::a : dxp::b);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   public eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
