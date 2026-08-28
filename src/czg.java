import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class czg implements cuq, djg {
   public static final Codec<jf<czg>> e = mg.g
      .r()
      .validate($$0 -> $$0.a(czo.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final yw<wj, jf<czg>> f = yu.b(mh.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dmm, czg> g = Maps.newHashMap();
   public static final alg h = alg.b("base_attack_damage");
   public static final alg i = alg.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final jf.c<czg> b = mg.g.f(this);
   private final kh c;
   @Nullable
   private final czg d;
   protected final String n;
   private final cut o;

   public static int a(czg $$0) {
      return $$0 == null ? 0 : mg.g.a($$0);
   }

   public static czg b(int $$0) {
      return mg.g.a($$0);
   }

   @Deprecated
   public static czg a(dmm $$0) {
      return g.getOrDefault($$0, czo.a);
   }

   public czg(czg.a $$0) {
      this.n = $$0.d();
      this.c = $$0.a(wy.c(this.n), $$0.e());
      this.d = $$0.d;
      this.o = $$0.e;
      if (ac.aV) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jf.c<czg> e() {
      return this.b;
   }

   public kh f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kk.c, 1);
   }

   public void a(djh $$0, bxj $$1, czk $$2, int $$3) {
   }

   public void a(cno $$0) {
   }

   public void l(czk $$0) {
   }

   public boolean a(czk $$0, eao $$1, djh $$2, iv $$3, bxj $$4) {
      dcn $$5 = $$0.a(kk.A);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof crj $$6 && $$6.gj().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public czg h() {
      return this;
   }

   public bug a(ddf $$0) {
      return bug.e;
   }

   public float a(czk $$0, eao $$1) {
      dcn $$2 = $$0.a(kk.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      dbp $$4 = $$3.a(kk.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dht $$5 = $$3.a(kk.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            dbl $$6 = $$3.a(kk.I);
            if ($$6 != null) {
               $$1.c($$2);
               return bug.c;
            } else {
               return bug.e;
            }
         }
      }
   }

   public czk a(czk $$0, djh $$1, bxj $$2) {
      dbp $$3 = $$0.a(kk.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(czk $$0) {
      return $$0.n();
   }

   public int e(czk $$0) {
      return azm.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(czk $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azm.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(czk $$0, cwz $$1, cvm $$2, crj $$3) {
      return false;
   }

   public boolean a(czk $$0, czk $$1, cwz $$2, cvm $$3, crj $$4, bya $$5) {
      return false;
   }

   public float a(bwi $$0, float $$1, bux $$2) {
      return 0.0F;
   }

   @Nullable
   public bux a(bxj $$0) {
      return null;
   }

   public void a(czk $$0, bxj $$1, bxj $$2) {
   }

   public void b(czk $$0, bxj $$1, bxj $$2) {
   }

   public boolean a(czk $$0, djh $$1, eao $$2, iv $$3, bxj $$4) {
      dcn $$5 = $$0.a(kk.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bws.a);
         }

         return true;
      }
   }

   public boolean b(czk $$0, eao $$1) {
      dcn $$2 = $$0.a(kk.A);
      return $$2 != null && $$2.b($$1);
   }

   public bug a(czk $$0, crj $$1, bxj $$2, buf $$3) {
      return bug.e;
   }

   @Override
   public String toString() {
      return mg.g.e(this).g();
   }

   public final czk i() {
      return this.d == null ? czk.k : new czk(this.d);
   }

   public void a(czk $$0, arq $$1, bwi $$2, @Nullable bws $$3) {
   }

   public void a(czk $$0, djh $$1, crj $$2) {
      this.a($$0, $$1);
   }

   public void a(czk $$0, djh $$1) {
   }

   public czm b(czk $$0) {
      dbp $$1 = $$0.a(kk.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         dbl $$2 = $$0.a(kk.I);
         return $$2 != null ? czm.d : czm.a;
      }
   }

   public int a(czk $$0, bxj $$1) {
      dbp $$2 = $$0.a(kk.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         dbl $$3 = $$0.a(kk.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(czk $$0, djh $$1, bxj $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(czk $$0, czg.b $$1, dco $$2, Consumer<wy> $$3, daz $$4) {
   }

   public Optional<cxj> k(czk $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final wy l() {
      return this.c.a(kk.h, wx.a);
   }

   public wy a(czk $$0) {
      return $$0.a().a(kk.h, wx.a);
   }

   public boolean d_(czk $$0) {
      return $$0.F();
   }

   protected static fet a(djh $$0, crj $$1, diq.b $$2) {
      fex $$3 = $$1.bC();
      fex $$4 = $$3.e($$1.d($$1.dM(), $$1.dK()).c($$1.gK()));
      return $$0.a(new diq($$3, $$4, diq.a.b, $$2, $$1));
   }

   public boolean e_(czk $$0) {
      return false;
   }

   public czk m() {
      return new czk(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cut k() {
      return this.o;
   }

   public boolean a(czk $$0, @Nullable crj $$1) {
      return false;
   }

   public static class a {
      private static final aky<czg, String> a = $$0 -> ag.a("block", $$0.a());
      private static final aky<czg, String> b = $$0 -> ag.a("item", $$0.a());
      private final kh.a c = kh.a().a(kk.aS);
      @Nullable
      czg d;
      cut e = cuv.g;
      @Nullable
      private alf<czg> f;
      private aky<czg, String> g = b;
      private aky<czg, alg> h = alf::a;

      public czg.a a(cuz $$0) {
         return this.a($$0, dbr.a);
      }

      public czg.a a(cuz $$0, dbp $$1) {
         return this.a(kk.v, $$0).a(kk.w, $$1);
      }

      public czg.a a(czg $$0) {
         return this.a(kk.x, new dcr(new czk($$0)));
      }

      public czg.a a(float $$0) {
         return this.a(kk.y, new dcq($$0));
      }

      public czg.a a(int $$0) {
         return this.a(kk.c, $$0);
      }

      public czg.a b(int $$0) {
         this.a(kk.d, $$0);
         this.a(kk.c, 1);
         this.a(kk.e, 0);
         return this;
      }

      public czg.a b(czg $$0) {
         this.d = $$0;
         return this;
      }

      public czg.a a(dag $$0) {
         return this.a(kk.k, $$0);
      }

      public czg.a a() {
         return this.a(kk.z, new dbu(axd.i));
      }

      public czg.a a(alf<czq> $$0) {
         return this.a(kk.ae, new czp(new cyl<>($$0)));
      }

      public czg.a c(int $$0) {
         return this.a(kk.C, new dfv($$0));
      }

      public czg.a c(czg $$0) {
         return this.a(kk.E, new dgf(jj.a($$0.e())));
      }

      public czg.a a(axr<czg> $$0) {
         jg<czg> $$1 = mg.a(mg.g);
         return this.a(kk.E, new dgf($$1.b($$0)));
      }

      public czg.a a(bws $$0) {
         return this.a(kk.D, dht.a($$0).a());
      }

      public czg.a b(bws $$0) {
         return this.a(kk.D, dht.a($$0).b(false).a());
      }

      public czg.a a(day $$0, axr<dmm> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public czg.a a(day $$0, float $$1, float $$2) {
         return this.a($$0, axc.bF, $$1, $$2, 0.0F);
      }

      public czg.a b(day $$0, float $$1, float $$2) {
         return this.a($$0, axc.bD, $$1, $$2, 5.0F);
      }

      public czg.a c(day $$0, float $$1, float $$2) {
         return this.a($$0, axc.bE, $$1, $$2, 0.0F);
      }

      public czg.a d(day $$0, float $$1, float $$2) {
         return this.a($$0, axc.bG, $$1, $$2, 0.0F);
      }

      public czg.a e(day $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public czg.a a(dho $$0, dhq $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kk.D, dht.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public czg.a a(dho $$0) {
         return this.b(dhq.e.a($$0.a())).a($$0.a(dhq.e)).a($$0.g()).a(kk.D, dht.a(bws.g).a($$0.d()).a($$0.h()).a(jj.a(bwr.bM.r())).a()).a(kk.au, awn.DM).a(1);
      }

      public czg.a b(dho $$0) {
         jg<bwr<?>> $$1 = mg.a(mg.f);
         return this.a($$0.a(dhq.e)).a(kk.D, dht.a(bws.g).a(awn.nk).a($$0.h()).a($$1.b(axf.K)).c(false).a()).a(1);
      }

      public czg.a b(alf<dhx> $$0) {
         return this.a(kk.ac, new dcj($$0));
      }

      public czg.a a(cur... $$0) {
         this.e = cuv.e.a($$0);
         return this;
      }

      public czg.a c(alf<czg> $$0) {
         this.f = $$0;
         return this;
      }

      public czg.a a(String $$0) {
         this.g = aky.fixed($$0);
         return this;
      }

      public czg.a b() {
         this.g = a;
         return this;
      }

      public czg.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public alg e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> czg.a a(kj<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public czg.a a(dcb $$0) {
         return this.a(kk.o, $$0);
      }

      kh a(wy $$0, alg $$1) {
         kh $$2 = this.c.a(kk.h, $$0).a(kk.i, $$1).a();
         if ($$2.c(kk.e) && $$2.a(kk.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      czg.b a = new czg.b() {
         @Nullable
         @Override
         public jh.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public eyq a(eyo $$0) {
            return null;
         }
      };

      @Nullable
      jh.a a();

      float b();

      @Nullable
      eyq a(eyo var1);

      static czg.b a(@Nullable final djh $$0) {
         return $$0 == null ? a : new czg.b() {
            @Override
            public jh.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public eyq a(eyo $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static czg.b a(final jh.a $$0) {
         return new czg.b() {
            @Override
            public jh.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public eyq a(eyo $$0x) {
               return null;
            }
         };
      }
   }
}
