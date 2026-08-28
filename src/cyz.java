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

public class cyz implements cuj, diz {
   public static final Codec<je<cyz>> e = mf.g
      .r()
      .validate($$0 -> $$0.a(czh.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final yw<wj, je<cyz>> f = yu.b(mg.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dmf, cyz> g = Maps.newHashMap();
   public static final alg h = alg.b("base_attack_damage");
   public static final alg i = alg.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final je.c<cyz> b = mf.g.f(this);
   private final kg c;
   @Nullable
   private final cyz d;
   protected final String n;
   private final cum o;

   public static int a(cyz $$0) {
      return $$0 == null ? 0 : mf.g.a($$0);
   }

   public static cyz b(int $$0) {
      return mf.g.a($$0);
   }

   @Deprecated
   public static cyz a(dmf $$0) {
      return g.getOrDefault($$0, czh.a);
   }

   public cyz(cyz.a $$0) {
      this.n = $$0.d();
      this.c = $$0.a(wy.c(this.n), $$0.e());
      this.d = $$0.d;
      this.o = $$0.e;
      if (ab.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public je.c<cyz> e() {
      return this.b;
   }

   public kg f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kj.c, 1);
   }

   public void a(dja $$0, bxe $$1, czd $$2, int $$3) {
   }

   public void a(cnh $$0) {
   }

   public void l(czd $$0) {
   }

   public boolean a(czd $$0, eah $$1, dja $$2, iu $$3, bxe $$4) {
      dcg $$5 = $$0.a(kj.A);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof crc $$6 && $$6.gk().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public cyz h() {
      return this;
   }

   public bud a(dcy $$0) {
      return bud.e;
   }

   public float a(czd $$0, eah $$1) {
      dcg $$2 = $$0.a(kj.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      dbi $$4 = $$3.a(kj.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dhm $$5 = $$3.a(kj.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            dbe $$6 = $$3.a(kj.I);
            if ($$6 != null) {
               $$1.c($$2);
               return bud.c;
            } else {
               return bud.e;
            }
         }
      }
   }

   public czd a(czd $$0, dja $$1, bxe $$2) {
      dbi $$3 = $$0.a(kj.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(czd $$0) {
      return $$0.n();
   }

   public int e(czd $$0) {
      return azm.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(czd $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azm.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(czd $$0, cws $$1, cvf $$2, crc $$3) {
      return false;
   }

   public boolean a(czd $$0, czd $$1, cws $$2, cvf $$3, crc $$4, bxv $$5) {
      return false;
   }

   public float a(bwf $$0, float $$1, buu $$2) {
      return 0.0F;
   }

   @Nullable
   public buu a(bxe $$0) {
      return null;
   }

   public void a(czd $$0, bxe $$1, bxe $$2) {
   }

   public void b(czd $$0, bxe $$1, bxe $$2) {
   }

   public boolean a(czd $$0, dja $$1, eah $$2, iu $$3, bxe $$4) {
      dcg $$5 = $$0.a(kj.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bwp.a);
         }

         return true;
      }
   }

   public boolean b(czd $$0, eah $$1) {
      dcg $$2 = $$0.a(kj.A);
      return $$2 != null && $$2.b($$1);
   }

   public bud a(czd $$0, crc $$1, bxe $$2, buc $$3) {
      return bud.e;
   }

   @Override
   public String toString() {
      return mf.g.e(this).g();
   }

   public final czd i() {
      return this.d == null ? czd.k : new czd(this.d);
   }

   public void a(czd $$0, arq $$1, bwf $$2, @Nullable bwp $$3) {
   }

   public void a(czd $$0, dja $$1, crc $$2) {
      this.a($$0, $$1);
   }

   public void a(czd $$0, dja $$1) {
   }

   public czf b(czd $$0) {
      dbi $$1 = $$0.a(kj.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         dbe $$2 = $$0.a(kj.I);
         return $$2 != null ? czf.d : czf.a;
      }
   }

   public int a(czd $$0, bxe $$1) {
      dbi $$2 = $$0.a(kj.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         dbe $$3 = $$0.a(kj.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(czd $$0, dja $$1, bxe $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(czd $$0, cyz.b $$1, dch $$2, Consumer<wy> $$3, das $$4) {
   }

   public Optional<cxc> k(czd $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final wy l() {
      return this.c.a(kj.h, wx.a);
   }

   public wy a(czd $$0) {
      return $$0.a().a(kj.h, wx.a);
   }

   public boolean d_(czd $$0) {
      return $$0.F();
   }

   protected static fem a(dja $$0, crc $$1, dij.b $$2) {
      feq $$3 = $$1.bE();
      feq $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gL()));
      return $$0.a(new dij($$3, $$4, dij.a.b, $$2, $$1));
   }

   public boolean e_(czd $$0) {
      return false;
   }

   public czd m() {
      return new czd(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cum k() {
      return this.o;
   }

   public boolean a(czd $$0, @Nullable crc $$1) {
      return false;
   }

   public static class a {
      private static final aky<cyz, String> a = $$0 -> af.a("block", $$0.a());
      private static final aky<cyz, String> b = $$0 -> af.a("item", $$0.a());
      private final kg.a c = kg.a().a(kj.aS);
      @Nullable
      cyz d;
      cum e = cuo.g;
      @Nullable
      private alf<cyz> f;
      private aky<cyz, String> g = b;
      private aky<cyz, alg> h = alf::a;

      public cyz.a a(cus $$0) {
         return this.a($$0, dbk.a);
      }

      public cyz.a a(cus $$0, dbi $$1) {
         return this.a(kj.v, $$0).a(kj.w, $$1);
      }

      public cyz.a a(cyz $$0) {
         return this.a(kj.x, new dck(new czd($$0)));
      }

      public cyz.a a(float $$0) {
         return this.a(kj.y, new dcj($$0));
      }

      public cyz.a a(int $$0) {
         return this.a(kj.c, $$0);
      }

      public cyz.a b(int $$0) {
         this.a(kj.d, $$0);
         this.a(kj.c, 1);
         this.a(kj.e, 0);
         return this;
      }

      public cyz.a b(cyz $$0) {
         this.d = $$0;
         return this;
      }

      public cyz.a a(czz $$0) {
         return this.a(kj.k, $$0);
      }

      public cyz.a a() {
         return this.a(kj.z, new dbn(axd.i));
      }

      public cyz.a a(alf<czj> $$0) {
         return this.a(kj.ae, new czi(new cye<>($$0)));
      }

      public cyz.a c(int $$0) {
         return this.a(kj.C, new dfo($$0));
      }

      public cyz.a c(cyz $$0) {
         return this.a(kj.E, new dfy(ji.a($$0.e())));
      }

      public cyz.a a(axr<cyz> $$0) {
         jf<cyz> $$1 = mf.a(mf.g);
         return this.a(kj.E, new dfy($$1.b($$0)));
      }

      public cyz.a a(bwp $$0) {
         return this.a(kj.D, dhm.a($$0).a());
      }

      public cyz.a b(bwp $$0) {
         return this.a(kj.D, dhm.a($$0).b(false).a());
      }

      public cyz.a a(dar $$0, axr<dmf> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public cyz.a a(dar $$0, float $$1, float $$2) {
         return this.a($$0, axc.bF, $$1, $$2, 0.0F);
      }

      public cyz.a b(dar $$0, float $$1, float $$2) {
         return this.a($$0, axc.bD, $$1, $$2, 5.0F);
      }

      public cyz.a c(dar $$0, float $$1, float $$2) {
         return this.a($$0, axc.bE, $$1, $$2, 0.0F);
      }

      public cyz.a d(dar $$0, float $$1, float $$2) {
         return this.a($$0, axc.bG, $$1, $$2, 0.0F);
      }

      public cyz.a e(dar $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public cyz.a a(dhh $$0, dhj $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kj.D, dhm.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public cyz.a a(dhh $$0) {
         return this.b(dhj.e.a($$0.a())).a($$0.a(dhj.e)).a($$0.g()).a(kj.D, dhm.a(bwp.g).a($$0.d()).a($$0.h()).a(ji.a(bwo.bM.r())).a()).a(kj.au, awn.DM).a(1);
      }

      public cyz.a b(dhh $$0) {
         jf<bwo<?>> $$1 = mf.a(mf.f);
         return this.a($$0.a(dhj.e)).a(kj.D, dhm.a(bwp.g).a(awn.nk).a($$0.h()).a($$1.b(axf.K)).c(false).a()).a(1);
      }

      public cyz.a b(alf<dhq> $$0) {
         return this.a(kj.ac, new dcc($$0));
      }

      public cyz.a a(cuk... $$0) {
         this.e = cuo.e.a($$0);
         return this;
      }

      public cyz.a c(alf<cyz> $$0) {
         this.f = $$0;
         return this;
      }

      public cyz.a a(String $$0) {
         this.g = aky.fixed($$0);
         return this;
      }

      public cyz.a b() {
         this.g = a;
         return this;
      }

      public cyz.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public alg e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cyz.a a(ki<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cyz.a a(dbu $$0) {
         return this.a(kj.o, $$0);
      }

      kg a(wy $$0, alg $$1) {
         kg $$2 = this.c.a(kj.h, $$0).a(kj.i, $$1).a();
         if ($$2.c(kj.e) && $$2.a(kj.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cyz.b a = new cyz.b() {
         @Nullable
         @Override
         public jg.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public eyj a(eyh $$0) {
            return null;
         }
      };

      @Nullable
      jg.a a();

      float b();

      @Nullable
      eyj a(eyh var1);

      static cyz.b a(@Nullable final dja $$0) {
         return $$0 == null ? a : new cyz.b() {
            @Override
            public jg.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public eyj a(eyh $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cyz.b a(final jg.a $$0) {
         return new cyz.b() {
            @Override
            public jg.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public eyj a(eyh $$0x) {
               return null;
            }
         };
      }
   }
}
