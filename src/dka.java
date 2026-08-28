import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dka extends djq {
   public static final MapCodec<dka> a = b(dka::new);
   public static final dyo<jn> b = dod.e;
   public static final dyo<dye> c = dyg.Y;
   public static final dyh d = dyg.A;
   private static final fcr f = fco.a(dke.b(6.0, 6.0, 13.0), dke.b(8.0, 4.0, 6.0));
   private static final fcr g = fco.a(f, dke.b(2.0, 13.0, 16.0));
   private static final Map<jn.a, fcr> h = fco.a(dke.a(16.0, 16.0, 8.0));
   private static final Map<jn.a, fcr> i = fco.a(fco.a(f, dke.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<jn, fcr> C = fco.c(fco.a(f, dke.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, dye.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
      cpr $$6 = $$3.q() instanceof cpr $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      return (bsy)(this.a($$1, $$0, $$4, $$3, true) ? bsy.a : bsy.e);
   }

   public boolean a(dgz $$0, dxq $$1, fbt $$2, @Nullable cpr $$3, boolean $$4) {
      jn $$5 = $$2.c();
      ji $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
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

   private boolean a(dxq $$0, jn $$1, double $$2) {
      if ($$1.o() != jn.a.b && !($$2 > 0.8124F)) {
         jn $$3 = $$0.c(b);
         dye $$4 = $$0.c(c);
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

   public boolean a(dgz $$0, ji $$1, @Nullable jn $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bva $$0, dgz $$1, ji $$2, @Nullable jn $$3) {
      dus $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof duq) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((duq)$$4).a($$3);
         $$1.a(null, $$2, awa.bZ, awb.e, 2.0F, 1.0F);
         $$1.a($$0, ecp.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fcr o(dxq $$0) {
      jn $$1 = $$0.c(b);

      return switch ((dye)$$0.c(c)) {
         case a -> (fcr)h.get($$1.o());
         case c -> (fcr)C.get($$1);
         case d -> (fcr)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.o($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      jn $$1 = $$0.k();
      ji $$2 = $$0.a();
      dgz $$3 = $$0.q();
      jn.a $$4 = $$1.o();
      if ($$4 == jn.a.b) {
         dxq $$5 = this.m().b(c, $$1 == jn.a ? dye.b : dye.a).b(b, $$0.g());
         if ($$5.a((dhc)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jn.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jn.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jn.e)
            || $$4 == jn.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jn.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jn.c);
         dxq $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dye.d : dye.c);
         if ($$7.a((dhc)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jn.b);
         $$7 = $$7.b(c, $$8 ? dye.a : dye.b);
         if ($$7.a((dhc)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      dye $$8 = $$0.c(c);
      jn $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dye.d) {
         return dkg.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dye.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dye.c).b(b, $$4.g());
            }

            if ($$8 == dye.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dye.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      jn $$3 = q($$0).g();
      return $$3 == jn.b ? dke.a($$1, $$2.d(), jn.a) : dmz.b($$1, $$2, $$3);
   }

   private static jn q(dxq $$0) {
      switch ((dye)$$0.c(c)) {
         case a:
            return jn.b;
         case b:
            return jn.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new duq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.F, $$0.C ? duq::a : duq::b);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   public dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
