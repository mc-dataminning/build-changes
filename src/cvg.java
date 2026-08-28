import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cvg implements cqe, ddr {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dgv, cvg> e = Maps.newHashMap();
   public static final alb f = alb.b("base_attack_damage");
   public static final alb g = alb.b("base_attack_speed");
   public static final int h = 64;
   public static final int i = 99;
   public static final int j = 13;
   private final jn.c<cvg> b = lu.g.f(this);
   private final kn c;
   @Nullable
   private final cvg d;
   @Nullable
   private String k;
   private final cqh l;

   public static int a(cvg $$0) {
      return $$0 == null ? 0 : lu.g.a($$0);
   }

   public static cvg b(int $$0) {
      return lu.g.a($$0);
   }

   @Deprecated
   public static cvg a(dgv $$0) {
      return e.getOrDefault($$0, cvo.a);
   }

   public cvg(cvg.a $$0) {
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
   public jn.c<cvg> o() {
      return this.b;
   }

   public kn p() {
      return this.c;
   }

   public int q() {
      return this.c.a(kr.c, 1);
   }

   public void a(dds $$0, buf $$1, cvl $$2, int $$3) {
   }

   public void a(cjz $$0) {
   }

   public void m(cvl $$0) {
   }

   public boolean a(dua $$0, dds $$1, je $$2, cnp $$3) {
      return true;
   }

   @Override
   public cvg r() {
      return this;
   }

   public brk a(cyy $$0) {
      return brk.e;
   }

   public float a(cvl $$0, dua $$1) {
      cyq $$2 = $$0.a(kr.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      cqn $$4 = $$3.a(kr.v);
      if ($$4 != null) {
         if ($$1.u($$4.d())) {
            $$1.c($$2);
            return brk.c;
         } else {
            return brk.d;
         }
      } else {
         return brk.e;
      }
   }

   public cvl a(cvl $$0, dds $$1, buf $$2) {
      cqn $$3 = $$0.a(kr.v);
      return $$3 != null ? $$2.a($$1, $$0, $$3) : $$0;
   }

   public boolean d(cvl $$0) {
      return $$0.n();
   }

   public int e(cvl $$0) {
      return azc.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cvl $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azc.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cvl $$0, csn $$1, cra $$2, cnp $$3) {
      return false;
   }

   public boolean a(cvl $$0, cvl $$1, csn $$2, cra $$3, cnp $$4, buw $$5) {
      return false;
   }

   public float a(btj $$0, float $$1, bsb $$2) {
      return 0.0F;
   }

   public boolean a(cvl $$0, buf $$1, buf $$2) {
      return false;
   }

   public void b(cvl $$0, buf $$1, buf $$2) {
   }

   public boolean a(cvl $$0, dds $$1, dua $$2, je $$3, buf $$4) {
      cyq $$5 = $$0.a(kr.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, btr.a);
         }

         return true;
      }
   }

   public boolean b(cvl $$0, dua $$1) {
      cyq $$2 = $$0.a(kr.x);
      return $$2 != null && $$2.b($$1);
   }

   public brk a(cvl $$0, cnp $$1, buf $$2, brj $$3) {
      return brk.e;
   }

   public xd s() {
      return xd.c(this.a());
   }

   @Override
   public String toString() {
      return lu.g.e(this).g();
   }

   protected String t() {
      if (this.k == null) {
         this.k = ad.a("item", lu.g.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.t();
   }

   public String d_(cvl $$0) {
      return this.a();
   }

   @Nullable
   public final cvg u() {
      return this.d;
   }

   public boolean v() {
      return this.d != null;
   }

   public void a(cvl $$0, dds $$1, btj $$2, int $$3, boolean $$4) {
   }

   public void b(cvl $$0, dds $$1, cnp $$2) {
      this.a($$0, $$1);
   }

   public void a(cvl $$0, dds $$1) {
   }

   public boolean an_() {
      return false;
   }

   public cxh b(cvl $$0) {
      return $$0.b(kr.v) ? cxh.b : cxh.a;
   }

   public int a(cvl $$0, buf $$1) {
      cqn $$2 = $$0.a(kr.v);
      return $$2 != null ? $$2.a() : 0;
   }

   public void a(cvl $$0, dds $$1, buf $$2, int $$3) {
   }

   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
   }

   public Optional<csx> k(cvl $$0) {
      return Optional.empty();
   }

   public xd n(cvl $$0) {
      return xd.c(this.d_($$0));
   }

   public boolean e_(cvl $$0) {
      return $$0.C();
   }

   public boolean a(cvl $$0) {
      return $$0.k() == 1 && $$0.b(kr.d);
   }

   protected static eya a(dds $$0, cnp $$1, dda.b $$2) {
      eye $$3 = $$1.bC();
      eye $$4 = $$3.e($$1.c($$1.dK(), $$1.dI()).c($$1.gC()));
      return $$0.a(new dda($$3, $$4, dda.a.b, $$2, $$1));
   }

   @Deprecated(
      forRemoval = true
   )
   public int g() {
      return 0;
   }

   @Deprecated(
      forRemoval = true
   )
   public boolean a(cvl $$0, cvl $$1) {
      return false;
   }

   @Deprecated
   public cyg j() {
      return cyg.a;
   }

   public boolean l(cvl $$0) {
      return false;
   }

   public cvl w() {
      return new cvl(this);
   }

   public awc ao_() {
      return awd.kd;
   }

   public awc ap_() {
      return awd.ke;
   }

   public awc e() {
      return awd.nC;
   }

   public boolean aq_() {
      return true;
   }

   @Override
   public cqh i() {
      return this.l;
   }

   public static class a {
      private static final Interner<kn> a = Interners.newStrongInterner();
      @Nullable
      private kn.a b;
      @Nullable
      cvg c;
      cqh d = cqj.h;

      public cvg.a a(cqn $$0) {
         return this.a(kr.v, $$0);
      }

      public cvg.a a(int $$0) {
         return this.a(kr.c, $$0);
      }

      public cvg.a b(int $$0) {
         this.a(kr.d, $$0);
         this.a(kr.c, 1);
         this.a(kr.e, 0);
         return this;
      }

      public cvg.a a(cvg $$0) {
         this.c = $$0;
         return this;
      }

      public cvg.a a(cwj $$0) {
         return this.a(kr.j, $$0);
      }

      public cvg.a a() {
         return this.a(kr.w, bah.a);
      }

      public cvg.a a(ala<cvq> $$0) {
         return this.a(kr.T, new cvp(new cuh<>($$0), true));
      }

      public cvg.a c(int $$0) {
         return this.a(kr.y, new dau($$0));
      }

      public cvg.a b(cvg $$0) {
         return this.a(kr.z, new dbe(jr.a($$0.o())));
      }

      public cvg.a a(axi<cvg> $$0) {
         jo<cvg> $$1 = lu.a(lu.g);
         return this.a(kr.z, new dbe($$1.b($$0)));
      }

      public cvg.a a(cqf... $$0) {
         this.d = cqj.f.a($$0);
         return this;
      }

      public <T> cvg.a a(kq<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = kn.a().a(kr.ai);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cvg.a a(cyg $$0) {
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
         return this.b == null ? kr.ai : (kn)a.intern(this.b.a());
      }
   }

   public interface b {
      cvg.b a = new cvg.b() {
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
         public erv a(ert $$0) {
            return null;
         }
      };

      @Nullable
      jp.a a();

      float b();

      @Nullable
      erv a(ert var1);

      static cvg.b a(@Nullable final dds $$0) {
         return $$0 == null ? a : new cvg.b() {
            @Override
            public jp.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public erv a(ert $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cvg.b a(final jp.a $$0) {
         return new cvg.b() {
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
            public erv a(ert $$0x) {
               return null;
            }
         };
      }
   }
}
