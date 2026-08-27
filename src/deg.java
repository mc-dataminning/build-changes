import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deg extends dch {
   public static final MapCodec<deg> a = b(deg::new);
   public static final dpx<dpv> b = dpp.ae;

   @Override
   public MapCodec<? extends deg> a() {
      return a;
   }

   public deg(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dpv.b));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      dpv $$6 = $$0.c(b);
      if ($$1.o() != ih.a.b || $$6 == dpv.b != ($$1 == ih.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dpv.b && $$1 == ih.a && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dca.a.n();
      }
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      ib $$1 = $$0.a();
      cyx $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
      ib $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.n().a(b, dpv.a)), 3);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      if ($$0.c(b) != dpv.a) {
         return super.a($$0, $$1, $$2);
      } else {
         doz $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dpv.b;
      }
   }

   public static void a(cyy $$0, doz $$1, ib $$2, int $$3) {
      ib $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dpv.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dpv.a)), $$3);
   }

   public static doz c(cza $$0, ib $$1, doz $$2) {
      return $$2.b(dpp.C) ? $$2.a(dpp.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eU());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cyx $$0, cjt $$1, ib $$2, doz $$3, @Nullable dmf $$4, crj $$5) {
      super.a($$0, $$1, $$2, dca.a.n(), $$4, $$5);
   }

   protected static void b(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      dpv $$4 = $$2.c(b);
      if ($$4 == dpv.a) {
         ib $$5 = $$1.d();
         doz $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dpv.b) {
            doz $$7 = $$6.u().b(ekt.c) ? dca.G.n() : dca.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dby.i($$6));
         }
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(doz $$0, ib $$1) {
      return axk.b($$1.u(), $$1.c($$0.c(b) == dpv.b ? 0 : 1).v(), $$1.w());
   }
}
