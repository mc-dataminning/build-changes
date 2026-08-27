import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfr extends ddk {
   public static final MapCodec<dfr> a = b(dfr::new);
   public static final drs b = drr.bx;
   public static final drs c = drr.A;
   private static final drz<iv> d = drr.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cxv g = new cxv(10);
   private static final int h = 17;

   public dfr(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, iv.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dfr> a() {
      return a;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return $$1.c_($$2) instanceof dou $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dog $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0.B ? null : a($$2, doi.P, dou::a);
   }

   private void a(@Nullable dog $$0, boolean $$1) {
      if ($$0 instanceof dou $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dog a(io $$0, drb $$1) {
      dou $$2 = new dou($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public drb a(cwz $$0) {
      it $$1 = $$0.d().g();

      it $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> it.b;
      };
      return this.n().a(d, iv.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bso $$3, cto $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      bpq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof dou) {
            $$3.a((dou)$$5);
         }

         return bpu.b;
      }
   }

   protected void a(drb $$0, aqm $$1, io $$2) {
      if ($$1.c_($$2) instanceof dou $$3) {
         Optional<cxw<cxl>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cxw<cxl> $$6 = $$5.get();
            cto $$7 = $$6.b().a($$3, $$1.H_());
            if ($$7.e()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (cto $$8 : $$6.b().a($$3)) {
                  if (!$$8.e()) {
                     this.a($$1, $$2, $$3, $$8, $$0, $$6);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.e()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cxw<cxl>> a(dax $$0, cpj $$1) {
      return g.a($$0, $$1);
   }

   private void a(aqm $$0, io $$1, dou $$2, cto $$3, drb $$4, cxw<cxl> $$5) {
      it $$6 = $$4.c(d).a();
      bpn $$7 = dpf.a($$0, $$1.a($$6));
      cto $$8 = $$3.s();
      if ($$7 != null && ($$7 instanceof dou || $$3.I() > $$7.e_($$3))) {
         while (!$$8.e()) {
            cto $$9 = $$8.c(1);
            cto $$10 = dpf.a($$2, $$7, $$9, $$6.g());
            if (!$$10.e()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.e()) {
            int $$11 = $$8.I();
            $$8 = dpf.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.I()) {
               break;
            }
         }
      }

      if (!$$8.e()) {
         euk $$12 = euk.b($$1);
         euk $$13 = $$12.a($$6, 0.7);
         kh.a($$0, $$8, 6, $$6, $$13);

         for (aqn $$14 : $$0.a(aqn.class, euf.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(d, c, b);
   }
}
