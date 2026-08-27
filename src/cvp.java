import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvp extends cxz {
   public static final MapCodec<cvp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dic.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, cvp::new)
   );
   public static final die b = did.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eks e = cvf.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eks f = cvf.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eks g = cvf.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eks h = cvf.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eks i = cvf.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eks j = cvf.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eks k = cvf.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eks l = cvf.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eks m = cvf.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eks n = cvf.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eks o = cvf.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eks F = cvf.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eks G = cvf.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eks H = cvf.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eks I = cvf.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eks J = cvf.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dic N;
   private final int O;

   @Override
   public MapCodec<cvp> a() {
      return a;
   }

   protected cvp(dic $$0, int $$1, dhm.d $$2) {
      super($$2.a($$0.f()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ib.c).a(b, Boolean.valueOf(false)).a(K, dhy.b));
      this.O = $$1;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      ib $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dhy)$$0.c(K)) {
         case a:
            if ($$4.o() == ib.a.a) {
               return $$5 ? o : g;
            }

            return $$5 ? F : h;
         case b:
            return switch ($$4) {
               case f -> $$5 ? J : l;
               case e -> $$5 ? I : k;
               case d -> $$5 ? H : j;
               case c, b, a -> $$5 ? G : i;
            };
         case c:
         default:
            if ($$4.o() == ib.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$0.c(b)) {
         return bjb.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dlx.a, $$2);
         return bjb.a($$1.B);
      }
   }

   public void d(dhn $$0, csf $$1, hx $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cdz $$0, csg $$1, hx $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aqw.e);
   }

   protected aqu a(boolean $$0) {
      return $$0 ? this.N.n() : this.N.m();
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!$$1.B && this.N.d() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dhn $$0, csf $$1, hx $$2) {
      cef $$3 = this.N.d() ? $$1.a(cef.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dlx.a : dlx.e, $$2);
      }

      if ($$4) {
         $$1.a(new hx($$2), this, this.O);
      }
   }

   private void f(dhn $$0, csf $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(aE, b, K);
   }
}
