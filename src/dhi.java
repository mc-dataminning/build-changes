import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhi extends dfj {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final dtb<dsz> b = dst.ae;

   @Override
   public MapCodec<? extends dhi> a() {
      return a;
   }

   public dhi(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsz.b));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      dsz $$6 = $$0.c(b);
      if ($$1.o() != je.a.b || $$6 == dsz.b != ($$1 == je.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dsz.b && $$1 == je.a && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dfc.a.o();
      }
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      iz $$1 = $$0.a();
      dbz $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, btq $$3, cuq $$4) {
      iz $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dsz.a)), 3);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      if ($$0.c(b) != dsz.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dsd $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dsz.b;
      }
   }

   public static void a(dca $$0, dsd $$1, iz $$2, int $$3) {
      iz $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dsz.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dsz.a)), $$3);
   }

   public static dsd c(dcc $$0, iz $$1, dsd $$2) {
      return $$2.b(dst.C) ? $$2.a(dst.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eX());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbz $$0, cmy $$1, iz $$2, dsd $$3, @Nullable dpi $$4, cuq $$5) {
      super.a($$0, $$1, $$2, dfc.a.o(), $$4, $$5);
   }

   protected static void b(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      dsz $$4 = $$2.c(b);
      if ($$4 == dsz.a) {
         iz $$5 = $$1.d();
         dsd $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dsz.b) {
            dsd $$7 = $$6.u().b(enx.c) ? dfc.G.o() : dfc.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dfa.i($$6));
         }
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dsd $$0, iz $$1) {
      return ayz.b($$1.u(), $$1.c($$0.c(b) == dsz.b ? 0 : 1).v(), $$1.w());
   }
}
