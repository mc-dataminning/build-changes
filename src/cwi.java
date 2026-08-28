import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cwi implements crn, dfl {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<diq, cwi> e = Maps.newHashMap();
   public static final alj f = alj.b("base_attack_damage");
   public static final alj g = alj.b("base_attack_speed");
   public static final int h = 64;
   public static final int i = 99;
   public static final int j = 13;
   private final jq.c<cwi> b = lz.g.f(this);
   private final kq c;
   @Nullable
   private final cwi d;
   protected final String k;
   private final crq l;

   public static int a(cwi $$0) {
      return $$0 == null ? 0 : lz.g.a($$0);
   }

   public static cwi b(int $$0) {
      return lz.g.a($$0);
   }

   @Deprecated
   public static cwi a(diq $$0) {
      return e.getOrDefault($$0, cwq.a);
   }

   public cwi(cwi.a $$0) {
      this.k = $$0.d();
      this.c = $$0.a(xj.c(this.k), $$0.e());
      this.d = $$0.d;
      this.l = $$0.e;
      if (ab.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jq.c<cwi> f() {
      return this.b;
   }

   public kq g() {
      return this.c;
   }

   public int h() {
      return this.c.a(ku.c, 1);
   }

   public void a(dfm $$0, bvh $$1, cwm $$2, int $$3) {
   }

   public void a(clc $$0) {
   }

   public void l(cwm $$0) {
   }

   public boolean a(dvv $$0, dfm $$1, jh $$2, cou $$3) {
      return true;
   }

   @Override
   public cwi j() {
      return this;
   }

   public bsk a(daf $$0) {
      return bsk.e;
   }

   public float a(cwm $$0, dvv $$1) {
      czo $$2 = $$0.a(ku.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      cys $$4 = $$3.a(ku.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         ddy $$5 = $$3.a(ku.D);
         return (bsk)($$5 != null && $$5.f() ? $$5.a($$3, $$1) : bsk.e);
      }
   }

   public cwm a(cwm $$0, dfm $$1, bvh $$2) {
      cys $$3 = $$0.a(ku.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cwm $$0) {
      return $$0.n();
   }

   public int e(cwm $$0) {
      return azm.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cwm $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azm.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cwm $$0, ctw $$1, csj $$2, cou $$3) {
      return false;
   }

   public boolean a(cwm $$0, cwm $$1, ctw $$2, csj $$3, cou $$4, bvz $$5) {
      return false;
   }

   public float a(bul $$0, float $$1, btb $$2) {
      return 0.0F;
   }

   @Nullable
   public btb a(bvh $$0) {
      return null;
   }

   public boolean a(cwm $$0, bvh $$1, bvh $$2) {
      return false;
   }

   public void b(cwm $$0, bvh $$1, bvh $$2) {
   }

   public boolean a(cwm $$0, dfm $$1, dvv $$2, jh $$3, bvh $$4) {
      czo $$5 = $$0.a(ku.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, but.a);
         }

         return true;
      }
   }

   public boolean b(cwm $$0, dvv $$1) {
      czo $$2 = $$0.a(ku.B);
      return $$2 != null && $$2.b($$1);
   }

   public bsk a(cwm $$0, cou $$1, bvh $$2, bsj $$3) {
      return bsk.e;
   }

   @Override
   public String toString() {
      return lz.g.e(this).g();
   }

   @Nullable
   public final cwi k() {
      return this.d;
   }

   public boolean l() {
      return this.d != null;
   }

   public void a(cwm $$0, dfm $$1, bul $$2, int $$3, boolean $$4) {
   }

   public void a(cwm $$0, dfm $$1, cou $$2) {
      this.a($$0, $$1);
   }

   public void a(cwm $$0, dfm $$1) {
   }

   public cwo b(cwm $$0) {
      cys $$1 = $$0.a(ku.x);
      return $$1 != null ? $$1.d() : cwo.a;
   }

   public int a(cwm $$0, bvh $$1) {
      cys $$2 = $$0.a(ku.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cwm $$0, dfm $$1, bvh $$2, int $$3) {
      return false;
   }

   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
   }

   public Optional<cug> k(cwm $$0) {
      return Optional.empty();
   }

   public final String m() {
      return this.k;
   }

   public final xj n() {
      return this.c.a(ku.h, xi.a);
   }

   public xj a(cwm $$0) {
      return $$0.a().a(ku.h, xi.a);
   }

   public boolean c_(cwm $$0) {
      return $$0.E();
   }

   protected static ezu a(dfm $$0, cou $$1, deu.b $$2) {
      ezy $$3 = $$1.bF();
      ezy $$4 = $$3.e($$1.c($$1.dN(), $$1.dL()).c($$1.gH()));
      return $$0.a(new deu($$3, $$4, deu.a.b, $$2, $$1));
   }

   public boolean d_(cwm $$0) {
      return false;
   }

   public cwm o() {
      return new cwm(this);
   }

   public awm a() {
      return awn.nA;
   }

   public boolean e() {
      return true;
   }

   @Override
   public crq i() {
      return this.l;
   }

   public static class a {
      private static final alb<cwi, String> a = $$0 -> ae.a("block", $$0.a());
      private static final alb<cwi, String> b = $$0 -> ae.a("item", $$0.a());
      private final kq.a c = kq.a().a(ku.aq);
      @Nullable
      cwi d;
      crq e = crs.g;
      @Nullable
      private ali<cwi> f;
      private alb<cwi, String> g = b;
      private alb<cwi, alj> h = ali::a;

      public cwi.a a(crw $$0) {
         return this.a($$0, cyu.a);
      }

      public cwi.a a(crw $$0, cys $$1) {
         return this.a(ku.w, $$0).a(ku.x, $$1);
      }

      public cwi.a a(cwi $$0) {
         return this.a(ku.y, new czs(new cwm($$0)));
      }

      public cwi.a a(float $$0) {
         return this.a(ku.z, new czr($$0));
      }

      public cwi.a a(int $$0) {
         return this.a(ku.c, $$0);
      }

      public cwi.a b(int $$0) {
         this.a(ku.d, $$0);
         this.a(ku.c, 1);
         this.a(ku.e, 0);
         return this;
      }

      public cwi.a b(cwi $$0) {
         this.d = $$0;
         return this;
      }

      public cwi.a a(cxj $$0) {
         return this.a(ku.k, $$0);
      }

      public cwi.a a() {
         return this.a(ku.A, new cyx(axe.i));
      }

      public cwi.a a(ali<cws> $$0) {
         return this.a(ku.ab, new cwr(new cvm<>($$0), true));
      }

      public cwi.a c(int $$0) {
         return this.a(ku.C, new dcb($$0));
      }

      public cwi.a c(cwi $$0) {
         return this.a(ku.E, new dcl(ju.a($$0.f())));
      }

      public cwi.a a(axs<cwi> $$0) {
         jr<cwi> $$1 = lz.a(lz.g);
         return this.a(ku.E, new dcl($$1.b($$0)));
      }

      public cwi.a a(but $$0) {
         return this.a(ku.D, ddy.a($$0).a());
      }

      public cwi.a b(but $$0) {
         return this.a(ku.D, ddy.a($$0).b(false).a());
      }

      public cwi.a a(cro... $$0) {
         this.e = crs.e.a($$0);
         return this;
      }

      public cwi.a b(ali<cwi> $$0) {
         this.f = $$0;
         return this;
      }

      public cwi.a a(String $$0) {
         this.g = alb.fixed($$0);
         return this;
      }

      public cwi.a b() {
         this.g = a;
         return this;
      }

      public cwi.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public cwi.a a(alj $$0) {
         this.h = alb.fixed($$0);
         return this;
      }

      public alj e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cwi.a a(kt<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cwi.a a(czd $$0) {
         return this.a(ku.o, $$0);
      }

      kq a(xj $$0, alj $$1) {
         kq $$2 = this.c.a(ku.h, $$0).a(ku.i, $$1).a();
         if ($$2.b(ku.e) && $$2.a(ku.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cwi.b a = new cwi.b() {
         @Nullable
         @Override
         public js.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public etp a(etn $$0) {
            return null;
         }
      };

      @Nullable
      js.a a();

      float b();

      @Nullable
      etp a(etn var1);

      static cwi.b a(@Nullable final dfm $$0) {
         return $$0 == null ? a : new cwi.b() {
            @Override
            public js.a a() {
               return $$0.J_();
            }

            @Override
            public float b() {
               return $$0.t().f();
            }

            @Override
            public etp a(etn $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cwi.b a(final js.a $$0) {
         return new cwi.b() {
            @Override
            public js.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public etp a(etn $$0x) {
               return null;
            }
         };
      }
   }
}
