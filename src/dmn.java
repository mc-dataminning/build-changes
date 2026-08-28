import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmn extends dkg {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final dzd b = dzc.bA;
   public static final dzd c = dzc.G;
   private static final dzk<jq> d = dzc.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dcp g = new dcp(10);
   private static final int h = 17;

   public dmn(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, jq.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dmn> a() {
      return a;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return $$1.c_($$2) instanceof dwa $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dvl $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$0.C ? null : a($$2, dvn.Q, dwa::a);
   }

   private void a(@Nullable dvl $$0, boolean $$1) {
      if ($$0 instanceof dwa $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      dwa $$2 = new dwa($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dym a(dbn $$0) {
      jo $$1 = $$0.d().g();

      jo $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jo.b;
      };
      return this.m().b(d, jq.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dwa $$5) {
         $$3.a($$5);
      }

      return btq.a;
   }

   protected void a(dym $$0, arn $$1, jj $$2) {
      if ($$1.c_($$2) instanceof dwa $$3) {
         dbz var11 = $$3.ax_();
         Optional<dcq<dca>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dcq<dca> $$7 = $$6.get();
            cxy $$8 = $$7.b().a(var11, $$1.F_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cxy $$9 : $$7.b().a(var11)) {
                  if (!$$9.f()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
                  }
               }

               $$3.f().forEach($$0x -> {
                  if (!$$0x.f()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<dcq<dca>> a(arn $$0, dbz $$1) {
      return g.a($$0, $$1);
   }

   private void a(arn $$0, jj $$1, dwa $$2, cxy $$3, dym $$4, dcq<?> $$5) {
      jo $$6 = $$4.c(d).a();
      btj $$7 = dwo.a($$0, $$1.a($$6));
      cxy $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dwa || $$3.M() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cxy $$9 = $$8.c(1);
            cxy $$10 = dwo.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dwo.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fcu $$12 = fcu.b($$1);
         fcu $$13 = $$12.a($$6, 0.7);
         ld.a($$0, $$8, 6, $$6, $$13);

         for (aro $$14 : $$0.a(aro.class, fcp.a($$12, 17.0, 17.0, 17.0))) {
            ap.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(d, c, b);
   }
}
