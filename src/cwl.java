import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwl extends cuf {
   public static final MapCodec<cwl> a = b(cwl::new);
   public static final dhn b = dhm.bx;
   public static final dhn c = dhm.A;
   private static final dhu<hz> d = dhm.T;
   private static final int e = 6;
   private static final cog f = new cog(10);

   public cwl(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, hz.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<cwl> a() {
      return a;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return $$1.c_($$2) instanceof dff $$4 ? $$4.j() : 0;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      boolean $$7 = $$0.c(c);
      der $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 1);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return $$0.B ? null : a($$2, det.P, dff::a);
   }

   private void a(@Nullable der $$0, boolean $$1) {
      if ($$0 instanceof dff $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      dff $$2 = new dff($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dgw a(cnj $$0) {
      hx $$1 = $$0.d().g();

      hx $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> hx.b;
      };
      return this.o().a(d, hz.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().B($$0.a())));
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$4.A() && $$0.c_($$1) instanceof dff $$5) {
         $$5.a($$4.y());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      bim.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.B) {
         return biq.a;
      } else {
         der $$6 = $$1.c_($$2);
         if ($$6 instanceof dff) {
            $$3.a((dff)$$6);
         }

         return biq.b;
      }
   }

   protected void a(dgw $$0, ama $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dff $$3) {
         Optional<cnv> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            $$3.d(6);
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            cnv $$6 = $$5.get();
            clb $$7 = $$6.a($$3, $$1.H_());
            $$7.a($$1);
            this.a($$1, $$2, $$3, $$7, $$0);
            $$6.a($$3).forEach($$4x -> this.a($$1, $$2, $$3, $$4x, $$0));
            $$3.f().forEach($$0x -> {
               if (!$$0x.b()) {
                  $$0x.h(1);
               }
            });
         }
      }
   }

   public static Optional<cnv> a(crs $$0, cgu $$1) {
      return f.a($$0, $$1);
   }

   private void a(crs $$0, ht $$1, dff $$2, clb $$3, dgw $$4) {
      hx $$5 = $$4.c(d).a();
      bij $$6 = dfq.a($$0, $$1.a($$5));
      clb $$7 = $$3.p();
      if ($$6 instanceof dff) {
         while (!$$7.b()) {
            clb $$8 = $$7.c(1);
            clb $$9 = dfq.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.L();
            $$7 = dfq.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.L()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         eji $$11 = eji.b($$1).a($$5, 0.7);
         jd.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(d, c, b);
   }
}
