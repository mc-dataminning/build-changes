import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dno extends dkw implements dmr {
   public static final bok<iw> a = bok.<iw>a().a(iw.a, 10).a(iw.c).a(iw.d).a(iw.f).a(iw.e).a();
   public static final MapCodec<dno> j = b(dno::new);
   public static final dtt k = dts.C;
   private static final Supplier<cuh> n = Suppliers.memoize(() -> {
      cuh $$0 = new cuh(cuk.qF);
      dai.a $$1 = new dai.a(dai.a);
      $$1.a(dag.v, 1);
      $$0.b(ke.i, $$1.b());
      return $$0;
   });
   private static final Supplier<cuh> o = Suppliers.memoize(() -> {
      cuh $$0 = new cuh(cuk.qF);
      dai.a $$1 = new dai.a(dai.a);
      $$1.a(dag.x, 3);
      $$0.b(ke.i, $$1.b());
      return $$0;
   });
   private static final Supplier<cuh> F = Suppliers.memoize(() -> new cuh(cuk.qF));
   public static final bok<Supplier<cuh>> l = bok.<Supplier<cuh>>a().a(F, 3).a(n).a(o).a();
   public static final dno.b m = new dno.b(iw.b, f);
   private static final List<dno.b> G = List.of(new dno.b(iw.c, b), new dno.b(iw.d, d), new dno.b(iw.f, c), new dno.b(iw.e, e));

   @Override
   public MapCodec<dno> a() {
      return j;
   }

   protected dno(dtb.d $$0) {
      super(0.3125F, $$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(k, Boolean.valueOf(false))
      );
   }

   @Override
   public dtc a(cyd $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static dtc a(dbg $$0, ir $$1, dtc $$2) {
      dtc $$3 = $$0.a_($$1.d());
      dtc $$4 = $$0.a_($$1.c());
      dtc $$5 = $$0.a_($$1.e());
      dtc $$6 = $$0.a_($$1.h());
      dtc $$7 = $$0.a_($$1.f());
      dtc $$8 = $$0.a_($$1.g());
      dfc $$9 = $$2.b();
      return $$2.a(k, Boolean.valueOf($$0.b_($$1).a() == epf.c))
         .b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dfe.lr)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dfe.lr)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dfe.lr)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dfe.lr)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dfe.lr)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dfe.lr)));
   }

   private static Optional<ir> a(aqt $$0, ir $$1, dtc $$2, ayt $$3) {
      int $$4 = 0;
      ir.a $$5 = $$1.j();
      ir.a $$6 = new ir.a();
      List<dno.b> $$7 = new ArrayList<>(5);
      $$7.add(m);
      $$7.addAll(G);
      List<dno.b> $$8 = $$7.subList(1, 5);
      ad.c($$8, $$3);

      while ($$4 < 512) {
         for (dno.b $$9 : $$7) {
            boolean $$10 = $$2.c($$9.b);
            if ($$10) {
               $$6.a($$5, $$9.a);
               if ($$0.p($$6)) {
                  dtc $$11 = $$0.a_($$6);
                  if ($$11.a(dfe.lr)) {
                     return Optional.of($$6);
                  }

                  if ($$11.a(dfe.lq)) {
                     $$5.g($$6);
                     $$2 = $$11;
                     $$4++;
                     ad.c($$8, $$3);
                     break;
                  }
               }
            }
         }
         break;
      }

      return Optional.empty();
   }

   @Nullable
   private static dno.a a(aqt $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      if (!n($$2)) {
         return null;
      } else {
         dtc $$3 = dfe.lq.n();
         boolean $$4 = false;

         for (iw $$5 : iw.values()) {
            dtc $$6 = $$0.a_($$1.a($$5));
            boolean $$7 = $$6.a(dfe.lq) || $$6.a(dfe.lr);
            if ($$7) {
               if ($$4) {
                  return null;
               }

               $$4 = true;
               $$3 = $$3.b(h.get($$5), Boolean.valueOf(true));
            }
         }

         return $$4 ? new dno.a($$3, $$2) : null;
      }
   }

   @Nullable
   public static List<cuh> a(aqt $$0, ir $$1, ayt $$2) {
      dno.a $$3 = a($$0, $$1);
      return $$3 != null ? $$3.a($$0, $$1, $$2) : null;
   }

   public static boolean n(dtc $$0) {
      if ($$0.a(dfe.lr)) {
         return false;
      } else {
         return $$0.a(awe.bR) ? false : !$$0.a(dfe.lq);
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      boolean $$6 = $$2.a(this) || $$2.a(dfe.lr);
      return $$0.a(h.get($$1), Boolean.valueOf($$6));
   }

   @Override
   protected boolean d_(dtc $$0) {
      int $$1 = 0;

      for (duf<Boolean> $$2 : h.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }

         if ($$1 > 3) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      a.a($$3).ifPresent($$4 -> {
         ir $$5 = $$2.a($$4);
         dno.a $$6 = a($$1, $$5);
         if ($$6 != null) {
            a($$1, $$2, $$0, $$3).ifPresent($$4x -> $$6.a($$1, $$5, $$3).forEach($$2xxx -> a((dca)$$1, $$4x, $$2xxx)));
         }
      });
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d, e, f, g, k);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(k) ? epf.c.a(false) : super.b_($$0);
   }

   public static record a(dtc a, dtc b) {
      public List<cuh> a(aqt $$0, ir $$1, ayt $$2) {
         boolean $$3 = this.b.u().a() == epf.c;
         List<cuh> $$4 = dfc.a(this.b, $$0, $$1, null, null, dno.l.a($$2).map(Supplier::get).orElse(cuh.i));
         $$0.a($$1, this.a.a(dno.k, Boolean.valueOf($$3)), 2);
         return $$4;
      }
   }

   static record b(iw a, duf<Boolean> b) {
   }
}
