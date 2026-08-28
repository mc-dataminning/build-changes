import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmb extends dlr {
   public static final MapCodec<dmb> a = b(dmb::new);
   public static final ebf<ja> b = dqg.e;
   public static final ebf<eav> c = eax.Y;
   public static final eay d = eax.A;
   private static final ffk f = ffh.a(dmf.b(6.0, 6.0, 13.0), dmf.b(8.0, 4.0, 6.0));
   private static final ffk g = ffh.a(f, dmf.b(2.0, 13.0, 16.0));
   private static final Map<ja.a, ffk> h = ffh.a(dmf.a(16.0, 16.0, 8.0));
   private static final Map<ja.a, ffk> i = ffh.a(ffh.a(f, dmf.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<ja, ffk> D = ffh.c(ffh.a(f, dmf.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   public dmb(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, eav.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
      crc $$6 = $$3.q() instanceof crc $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      return (bud)(this.a($$1, $$0, $$4, $$3, true) ? bud.a : bud.e);
   }

   public boolean a(dja $$0, eah $$1, fem $$2, @Nullable crc $$3, boolean $$4) {
      ja $$5 = $$2.c();
      iu $$6 = $$2.b();
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

   private boolean a(eah $$0, ja $$1, double $$2) {
      if ($$1.o() != ja.a.b && !($$2 > 0.8124F)) {
         ja $$3 = $$0.c(b);
         eav $$4 = $$0.c(c);
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

   public boolean a(dja $$0, iu $$1, @Nullable ja $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bwf $$0, dja $$1, iu $$2, @Nullable ja $$3) {
      dxf $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dxd) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dxd)$$4).a($$3);
         $$1.a(null, $$2, awn.bZ, awo.e, 2.0F, 1.0F);
         $$1.a($$0, efh.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ffk o(eah $$0) {
      ja $$1 = $$0.c(b);

      return switch ((eav)$$0.c(c)) {
         case a -> (ffk)h.get($$1.o());
         case c -> (ffk)D.get($$1);
         case d -> (ffk)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.o($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ja $$1 = $$0.k();
      iu $$2 = $$0.a();
      dja $$3 = $$0.q();
      ja.a $$4 = $$1.o();
      if ($$4 == ja.a.b) {
         eah $$5 = this.m().b(c, $$1 == ja.a ? eav.b : eav.a).b(b, $$0.g());
         if ($$5.a((djd)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ja.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), ja.f) && $$3.a_($$2.i()).c($$3, $$2.i(), ja.e)
            || $$4 == ja.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), ja.d) && $$3.a_($$2.g()).c($$3, $$2.g(), ja.c);
         eah $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? eav.d : eav.c);
         if ($$7.a((djd)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), ja.b);
         $$7 = $$7.b(c, $$8 ? eav.a : eav.b);
         if ($$7.a((djd)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      eav $$8 = $$0.c(c);
      ja $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != eav.d) {
         return dmh.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == eav.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, eav.c).b(b, $$4.g());
            }

            if ($$8 == eav.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, eav.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      ja $$3 = q($$0).g();
      return $$3 == ja.b ? dmf.a($$1, $$2.d(), ja.a) : dpb.b($$1, $$2, $$3);
   }

   private static ja q(eah $$0) {
      switch ((eav)$$0.c(c)) {
         case a:
            return ja.b;
         case b:
            return ja.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.F, $$0.C ? dxd::a : dxd::b);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   public eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
