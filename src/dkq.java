import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkq extends dkg {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final dzk<jo> b = dot.e;
   public static final dzk<dza> c = dzc.Y;
   public static final dzd d = dzc.A;
   private static final fdo f = fdl.a(dku.b(6.0, 6.0, 13.0), dku.b(8.0, 4.0, 6.0));
   private static final fdo g = fdl.a(f, dku.b(2.0, 13.0, 16.0));
   private static final Map<jo.a, fdo> h = fdl.a(dku.a(16.0, 16.0, 8.0));
   private static final Map<jo.a, fdo> i = fdl.a(fdl.a(f, dku.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<jo, fdo> C = fdl.c(fdl.a(f, dku.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c).b(c, dza.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      cqi $$6 = $$3.q() instanceof cqi $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      return (btq)(this.a($$1, $$0, $$4, $$3, true) ? btq.a : btq.e);
   }

   public boolean a(dhp $$0, dym $$1, fcq $$2, @Nullable cqi $$3, boolean $$4) {
      jo $$5 = $$2.c();
      jj $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(awu.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dym $$0, jo $$1, double $$2) {
      if ($$1.o() != jo.a.b && !($$2 > 0.8124F)) {
         jo $$3 = $$0.c(b);
         dza $$4 = $$0.c(c);
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

   public boolean a(dhp $$0, jj $$1, @Nullable jo $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bvs $$0, dhp $$1, jj $$2, @Nullable jo $$3) {
      dvl $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof dvj) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dvj)$$4).a($$3);
         $$1.a(null, $$2, awk.bZ, awl.e, 2.0F, 1.0F);
         $$1.a($$0, edm.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fdo o(dym $$0) {
      jo $$1 = $$0.c(b);

      return switch ((dza)$$0.c(c)) {
         case a -> (fdo)h.get($$1.o());
         case c -> (fdo)C.get($$1);
         case d -> (fdo)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.o($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      jo $$1 = $$0.k();
      jj $$2 = $$0.a();
      dhp $$3 = $$0.q();
      jo.a $$4 = $$1.o();
      if ($$4 == jo.a.b) {
         dym $$5 = this.m().b(c, $$1 == jo.a ? dza.b : dza.a).b(b, $$0.g());
         if ($$5.a((dhs)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jo.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jo.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jo.e)
            || $$4 == jo.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jo.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jo.c);
         dym $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? dza.d : dza.c);
         if ($$7.a((dhs)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jo.b);
         $$7 = $$7.b(c, $$8 ? dza.a : dza.b);
         if ($$7.a((dhs)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      dza $$8 = $$0.c(c);
      jo $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != dza.d) {
         return dkw.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == dza.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, dza.c).b(b, $$4.g());
            }

            if ($$8 == dza.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, dza.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jo $$3 = q($$0).g();
      return $$3 == jo.b ? dku.a($$1, $$2.d(), jo.a) : dnp.b($$1, $$2, $$3);
   }

   private static jo q(dym $$0) {
      switch ((dza)$$0.c(c)) {
         case a:
            return jo.b;
         case b:
            return jo.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.F, $$0.C ? dvj::a : dvj::b);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   public dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
