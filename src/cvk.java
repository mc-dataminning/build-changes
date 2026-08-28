import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cvk implements cqk, def {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dhj, cvk> e = Maps.newHashMap();
   public static final alc f = alc.b("base_attack_damage");
   public static final alc g = alc.b("base_attack_speed");
   public static final int h = 64;
   public static final int i = 99;
   public static final int j = 13;
   private final jn.c<cvk> b = lu.g.f(this);
   private final kn c;
   @Nullable
   private final cvk d;
   @Nullable
   private String k;
   private final cqn l;

   public static int a(cvk $$0) {
      return $$0 == null ? 0 : lu.g.a($$0);
   }

   public static cvk b(int $$0) {
      return lu.g.a($$0);
   }

   @Deprecated
   public static cvk a(dhj $$0) {
      return e.getOrDefault($$0, cvt.a);
   }

   public cvk(cvk.a $$0) {
      this.c = $$0.b();
      this.d = $$0.c;
      this.l = $$0.d;
      if (ab.aW) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jn.c<cvk> n() {
      return this.b;
   }

   public kn o() {
      return this.c;
   }

   public int p() {
      return this.c.a(kr.c, 1);
   }

   public void a(deg $$0, buk $$1, cvp $$2, int $$3) {
   }

   public void a(cke $$0) {
   }

   public void l(cvp $$0) {
   }

   public boolean a(duo $$0, deg $$1, je $$2, cnu $$3) {
      return true;
   }

   @Override
   public cvk q() {
      return this;
   }

   public brp a(czm $$0) {
      return brp.e;
   }

   public float a(cvp $$0, duo $$1) {
      cyv $$2 = $$0.a(kr.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      cyb $$4 = $$3.a(kr.w);
      return (brp)($$4 != null ? $$4.a($$1, $$3, $$2) : brp.e);
   }

   public cvp a(cvp $$0, deg $$1, buk $$2) {
      cyb $$3 = $$0.a(kr.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean c(cvp $$0) {
      return $$0.n();
   }

   public int d(cvp $$0) {
      return azd.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int e(cvp $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azd.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cvp $$0, cst $$1, crg $$2, cnu $$3) {
      return false;
   }

   public boolean a(cvp $$0, cvp $$1, cst $$2, crg $$3, cnu $$4, bvb $$5) {
      return false;
   }

   public float a(bto $$0, float $$1, bsg $$2) {
      return 0.0F;
   }

   public boolean a(cvp $$0, buk $$1, buk $$2) {
      return false;
   }

   public void b(cvp $$0, buk $$1, buk $$2) {
   }

   public boolean a(cvp $$0, deg $$1, duo $$2, je $$3, buk $$4) {
      cyv $$5 = $$0.a(kr.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, btw.a);
         }

         return true;
      }
   }

   public boolean b(cvp $$0, duo $$1) {
      cyv $$2 = $$0.a(kr.A);
      return $$2 != null && $$2.b($$1);
   }

   public brp a(cvp $$0, cnu $$1, buk $$2, bro $$3) {
      return brp.e;
   }

   public xd r() {
      return xd.c(this.a());
   }

   @Override
   public String toString() {
      return lu.g.e(this).g();
   }

   protected String s() {
      if (this.k == null) {
         this.k = ad.a("item", lu.g.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.s();
   }

   public String d_(cvp $$0) {
      return this.a();
   }

   @Nullable
   public final cvk t() {
      return this.d;
   }

   public boolean u() {
      return this.d != null;
   }

   public void a(cvp $$0, deg $$1, bto $$2, int $$3, boolean $$4) {
   }

   public void b(cvp $$0, deg $$1, cnu $$2) {
      this.a($$0, $$1);
   }

   public void a(cvp $$0, deg $$1) {
   }

   public boolean an_() {
      return false;
   }

   public cvr a(cvp $$0) {
      cyb $$1 = $$0.a(kr.w);
      return $$1 != null ? $$1.d() : cvr.a;
   }

   public int a(cvp $$0, buk $$1) {
      cyb $$2 = $$0.a(kr.w);
      return $$2 != null ? $$2.a() : 0;
   }

   public void a(cvp $$0, deg $$1, buk $$2, int $$3) {
   }

   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
   }

   public Optional<ctd> j(cvp $$0) {
      return Optional.empty();
   }

   public xd m(cvp $$0) {
      return xd.c(this.d_($$0));
   }

   public boolean e_(cvp $$0) {
      return $$0.C();
   }

   protected static eyo a(deg $$0, cnu $$1, ddo.b $$2) {
      eys $$3 = $$1.bC();
      eys $$4 = $$3.e($$1.c($$1.dK(), $$1.dI()).c($$1.gC()));
      return $$0.a(new ddo($$3, $$4, ddo.a.b, $$2, $$1));
   }

   @Deprecated(
      forRemoval = true
   )
   public boolean a(cvp $$0, cvp $$1) {
      return false;
   }

   @Deprecated
   public cyk h() {
      return cyk.a;
   }

   public boolean k(cvp $$0) {
      return false;
   }

   public cvp v() {
      return new cvp(this);
   }

   public awd e() {
      return awe.nC;
   }

   public boolean ao_() {
      return true;
   }

   @Override
   public cqn i() {
      return this.l;
   }

   public static class a {
      private static final Interner<kn> a = Interners.newStrongInterner();
      @Nullable
      private kn.a b;
      @Nullable
      cvk c;
      cqn d = cqp.h;

      public cvk.a a(cqt $$0) {
         return this.a($$0, cyd.a);
      }

      public cvk.a a(cqt $$0, cyb $$1) {
         return this.a(kr.v, $$0).a(kr.w, $$1);
      }

      public cvk.a a(cvk $$0) {
         return this.a(kr.x, new cyz(new cvp($$0)));
      }

      public cvk.a a(float $$0) {
         return this.a(kr.y, new cyy($$0));
      }

      public cvk.a a(int $$0) {
         return this.a(kr.c, $$0);
      }

      public cvk.a b(int $$0) {
         this.a(kr.d, $$0);
         this.a(kr.c, 1);
         this.a(kr.e, 0);
         return this;
      }

      public cvk.a b(cvk $$0) {
         this.c = $$0;
         return this;
      }

      public cvk.a a(cwm $$0) {
         return this.a(kr.j, $$0);
      }

      public cvk.a a() {
         return this.a(kr.z, bai.a);
      }

      public cvk.a a(alb<cvv> $$0) {
         return this.a(kr.W, new cvu(new cum<>($$0), true));
      }

      public cvk.a c(int $$0) {
         return this.a(kr.B, new dbi($$0));
      }

      public cvk.a c(cvk $$0) {
         return this.a(kr.C, new dbs(jr.a($$0.n())));
      }

      public cvk.a a(axj<cvk> $$0) {
         jo<cvk> $$1 = lu.a(lu.g);
         return this.a(kr.C, new dbs($$1.b($$0)));
      }

      public cvk.a a(cql... $$0) {
         this.d = cqp.f.a($$0);
         return this;
      }

      public <T> cvk.a a(kq<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = kn.a().a(kr.al);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cvk.a a(cyk $$0) {
         return this.a(kr.n, $$0);
      }

      kn b() {
         kn $$0 = this.c();
         if ($$0.b(kr.e) && $$0.a(kr.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private kn c() {
         return this.b == null ? kr.al : (kn)a.intern(this.b.a());
      }
   }

   public interface b {
      cvk.b a = new cvk.b() {
         @Nullable
         @Override
         public jp.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public esj a(esh $$0) {
            return null;
         }
      };

      @Nullable
      jp.a a();

      float b();

      @Nullable
      esj a(esh var1);

      static cvk.b a(@Nullable final deg $$0) {
         return $$0 == null ? a : new cvk.b() {
            @Override
            public jp.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public esj a(esh $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cvk.b a(final jp.a $$0) {
         return new cvk.b() {
            @Override
            public jp.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public esj a(esh $$0x) {
               return null;
            }
         };
      }
   }
}
