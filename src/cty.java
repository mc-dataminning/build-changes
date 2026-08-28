import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cty implements cow, dcf {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dfi, cty> d = Maps.newHashMap();
   public static final UUID e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
   public static final UUID f = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
   public static final int g = 64;
   public static final int h = 99;
   public static final int i = 13;
   private final jj.c<cty> b = lq.g.f(this);
   private final kj c;
   @Nullable
   private final cty j;
   @Nullable
   private String k;
   private final coz l;

   public static int a(cty $$0) {
      return $$0 == null ? 0 : lq.g.a($$0);
   }

   public static cty b(int $$0) {
      return lq.g.a($$0);
   }

   @Deprecated
   public static cty a(dfi $$0) {
      return d.getOrDefault($$0, cug.a);
   }

   public cty(cty.a $$0) {
      this.c = $$0.b();
      this.j = $$0.c;
      this.l = $$0.d;
      if (aa.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jj.c<cty> o() {
      return this.b;
   }

   public kj p() {
      return this.c;
   }

   public int q() {
      return this.c.a(kn.c, 1);
   }

   public void a(dcg $$0, btc $$1, cud $$2, int $$3) {
   }

   public void a(civ $$0) {
   }

   public void m(cud $$0) {
   }

   public boolean a(dsl $$0, dcg $$1, ja $$2, cml $$3) {
      return true;
   }

   @Override
   public cty r() {
      return this;
   }

   public bqh a(cxp $$0) {
      return bqh.e;
   }

   public float a(cud $$0, dsl $$1) {
      cxh $$2 = $$0.a(kn.x);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      cpf $$4 = $$3.a(kn.v);
      if ($$4 != null) {
         if ($$1.u($$4.d())) {
            $$1.c($$2);
            return bqi.b($$3);
         } else {
            return bqi.d($$3);
         }
      } else {
         return bqi.c($$1.b($$2));
      }
   }

   public cud a(cud $$0, dcg $$1, btc $$2) {
      cpf $$3 = $$0.a(kn.v);
      return $$3 != null ? $$2.a($$1, $$0, $$3) : $$0;
   }

   public boolean d(cud $$0) {
      return $$0.m();
   }

   public int e(cud $$0) {
      return ayg.a(Math.round(13.0F - (float)$$0.n() * 13.0F / (float)$$0.o()), 0, 13);
   }

   public int f(cud $$0) {
      int $$1 = $$0.o();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.n()) / (float)$$1);
      return ayg.h($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cud $$0, cre $$1, cpr $$2, cml $$3) {
      return false;
   }

   public boolean a(cud $$0, cud $$1, cre $$2, cpr $$3, cml $$4, btu $$5) {
      return false;
   }

   public float a(bsh $$0, float $$1, bra $$2) {
      return 0.0F;
   }

   public boolean a(cud $$0, btc $$1, btc $$2) {
      return false;
   }

   public void b(cud $$0, btc $$1, btc $$2) {
   }

   public boolean a(cud $$0, dcg $$1, dsl $$2, ja $$3, btc $$4) {
      cxh $$5 = $$0.a(kn.x);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.h($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bso.a);
         }

         return true;
      }
   }

   public boolean b(cud $$0, dsl $$1) {
      cxh $$2 = $$0.a(kn.x);
      return $$2 != null && $$2.b($$1);
   }

   public bqh a(cud $$0, cml $$1, btc $$2, bqg $$3) {
      return bqh.e;
   }

   public wu s() {
      return wu.c(this.a());
   }

   @Override
   public String toString() {
      return lq.g.b(this).a();
   }

   protected String t() {
      if (this.k == null) {
         this.k = ac.a("item", lq.g.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.t();
   }

   public String h(cud $$0) {
      return this.a();
   }

   @Nullable
   public final cty u() {
      return this.j;
   }

   public boolean v() {
      return this.j != null;
   }

   public void a(cud $$0, dcg $$1, bsh $$2, int $$3, boolean $$4) {
   }

   public void b(cud $$0, dcg $$1, cml $$2) {
      this.a($$0, $$1);
   }

   public void a(cud $$0, dcg $$1) {
   }

   public boolean ak_() {
      return false;
   }

   public cvy b(cud $$0) {
      return $$0.b(kn.v) ? cvy.b : cvy.a;
   }

   public int a(cud $$0, btc $$1) {
      cpf $$2 = $$0.a(kn.v);
      return $$2 != null ? $$2.a() : 0;
   }

   public void a(cud $$0, dcg $$1, btc $$2, int $$3) {
   }

   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
   }

   public Optional<cro> g(cud $$0) {
      return Optional.empty();
   }

   public wu n(cud $$0) {
      return wu.c(this.h($$0));
   }

   public boolean d_(cud $$0) {
      return $$0.A();
   }

   public boolean a(cud $$0) {
      return $$0.j() == 1 && $$0.b(kn.d);
   }

   protected static ewd a(dcg $$0, cml $$1, dbp.b $$2) {
      ewh $$3 = $$1.bz();
      ewh $$4 = $$3.e($$1.c($$1.dJ(), $$1.dH()).a($$1.gA()));
      return $$0.a(new dbp($$3, $$4, dbp.a.b, $$2, $$1));
   }

   public int g() {
      return 0;
   }

   public boolean a(cud $$0, cud $$1) {
      return false;
   }

   @Deprecated
   public cwx j() {
      return cwx.a;
   }

   public boolean l(cud $$0) {
      return false;
   }

   public cud w() {
      return new cud(this);
   }

   public avg al_() {
      return avh.kc;
   }

   public avg am_() {
      return avh.kd;
   }

   public avg e() {
      return avh.nB;
   }

   public boolean an_() {
      return true;
   }

   @Override
   public coz i() {
      return this.l;
   }

   public static class a {
      private static final Interner<kj> a = Interners.newStrongInterner();
      @Nullable
      private kj.a b;
      @Nullable
      cty c;
      coz d = cpb.f;

      public cty.a a(cpf $$0) {
         return this.a(kn.v, $$0);
      }

      public cty.a a(int $$0) {
         return this.a(kn.c, $$0);
      }

      public cty.a b(int $$0) {
         this.a(kn.d, $$0);
         this.a(kn.c, 1);
         this.a(kn.e, 0);
         return this;
      }

      public cty.a a(cty $$0) {
         this.c = $$0;
         return this;
      }

      public cty.a a(cux $$0) {
         return this.a(kn.j, $$0);
      }

      public cty.a a() {
         return this.a(kn.w, azk.a);
      }

      public cty.a a(cox... $$0) {
         this.d = cpb.d.a($$0);
         return this;
      }

      public <T> cty.a a(km<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = kj.a().a(kn.af);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cty.a a(cwx $$0) {
         return this.a(kn.n, $$0);
      }

      kj b() {
         kj $$0 = this.c();
         if ($$0.b(kn.e) && $$0.a(kn.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private kj c() {
         return this.b == null ? kn.af : (kj)a.intern(this.b.a());
      }
   }

   public interface b {
      cty.b a = new cty.b() {
         @Nullable
         @Override
         public jl.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public epy a(epw $$0) {
            return null;
         }
      };

      @Nullable
      jl.a a();

      float b();

      @Nullable
      epy a(epw var1);

      static cty.b a(@Nullable final dcg $$0) {
         return $$0 == null ? a : new cty.b() {
            @Override
            public jl.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public epy a(epw $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cty.b a(final jl.a $$0) {
         return new cty.b() {
            @Override
            public jl.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public epy a(epw $$0x) {
               return null;
            }
         };
      }
   }
}
