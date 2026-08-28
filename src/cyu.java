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

public class cyu implements cue, diu {
   public static final Codec<je<cyu>> e = mf.g
      .r()
      .validate($$0 -> $$0.a(czc.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final yw<wj, je<cyu>> f = yu.b(mg.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dma, cyu> g = Maps.newHashMap();
   public static final alg h = alg.b("base_attack_damage");
   public static final alg i = alg.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final je.c<cyu> b = mf.g.f(this);
   private final kg c;
   @Nullable
   private final cyu d;
   protected final String n;
   private final cuh o;

   public static int a(cyu $$0) {
      return $$0 == null ? 0 : mf.g.a($$0);
   }

   public static cyu b(int $$0) {
      return mf.g.a($$0);
   }

   @Deprecated
   public static cyu a(dma $$0) {
      return g.getOrDefault($$0, czc.a);
   }

   public cyu(cyu.a $$0) {
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
   public je.c<cyu> e() {
      return this.b;
   }

   public kg f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kj.c, 1);
   }

   public void a(div $$0, bxc $$1, cyy $$2, int $$3) {
   }

   public void a(cnd $$0) {
   }

   public void l(cyy $$0) {
   }

   public boolean a(cyy $$0, dzz $$1, div $$2, iu $$3, bxc $$4) {
      dcb $$5 = $$0.a(kj.A);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof cqy $$6 && $$6.gj().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public cyu h() {
      return this;
   }

   public bub a(dct $$0) {
      return bub.e;
   }

   public float a(cyy $$0, dzz $$1) {
      dcb $$2 = $$0.a(kj.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      dbd $$4 = $$3.a(kj.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dhh $$5 = $$3.a(kj.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            daz $$6 = $$3.a(kj.I);
            if ($$6 != null) {
               $$1.c($$2);
               return bub.c;
            } else {
               return bub.e;
            }
         }
      }
   }

   public cyy a(cyy $$0, div $$1, bxc $$2) {
      dbd $$3 = $$0.a(kj.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cyy $$0) {
      return $$0.n();
   }

   public int e(cyy $$0) {
      return azm.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cyy $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azm.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cyy $$0, cwn $$1, cva $$2, cqy $$3) {
      return false;
   }

   public boolean a(cyy $$0, cyy $$1, cwn $$2, cva $$3, cqy $$4, bxt $$5) {
      return false;
   }

   public float a(bwd $$0, float $$1, bus $$2) {
      return 0.0F;
   }

   @Nullable
   public bus a(bxc $$0) {
      return null;
   }

   public void a(cyy $$0, bxc $$1, bxc $$2) {
   }

   public void b(cyy $$0, bxc $$1, bxc $$2) {
   }

   public boolean a(cyy $$0, div $$1, dzz $$2, iu $$3, bxc $$4) {
      dcb $$5 = $$0.a(kj.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bwn.a);
         }

         return true;
      }
   }

   public boolean b(cyy $$0, dzz $$1) {
      dcb $$2 = $$0.a(kj.A);
      return $$2 != null && $$2.b($$1);
   }

   public bub a(cyy $$0, cqy $$1, bxc $$2, bua $$3) {
      return bub.e;
   }

   @Override
   public String toString() {
      return mf.g.e(this).g();
   }

   public final cyy i() {
      return this.d == null ? cyy.k : new cyy(this.d);
   }

   public void a(cyy $$0, div $$1, bwd $$2, int $$3, boolean $$4) {
   }

   public void a(cyy $$0, div $$1, cqy $$2) {
      this.a($$0, $$1);
   }

   public void a(cyy $$0, div $$1) {
   }

   public cza b(cyy $$0) {
      dbd $$1 = $$0.a(kj.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         daz $$2 = $$0.a(kj.I);
         return $$2 != null ? cza.d : cza.a;
      }
   }

   public int a(cyy $$0, bxc $$1) {
      dbd $$2 = $$0.a(kj.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         daz $$3 = $$0.a(kj.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(cyy $$0, div $$1, bxc $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(cyy $$0, cyu.b $$1, dcc $$2, Consumer<wy> $$3, dan $$4) {
   }

   public Optional<cwx> k(cyy $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final wy l() {
      return this.c.a(kj.h, wx.a);
   }

   public wy a(cyy $$0) {
      return $$0.a().a(kj.h, wx.a);
   }

   public boolean d_(cyy $$0) {
      return $$0.F();
   }

   protected static fee a(div $$0, cqy $$1, die.b $$2) {
      fei $$3 = $$1.bE();
      fei $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gK()));
      return $$0.a(new die($$3, $$4, die.a.b, $$2, $$1));
   }

   public boolean e_(cyy $$0) {
      return false;
   }

   public cyy m() {
      return new cyy(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cuh k() {
      return this.o;
   }

   public boolean a(cyy $$0, @Nullable cqy $$1) {
      return false;
   }

   public static class a {
      private static final aky<cyu, String> a = $$0 -> af.a("block", $$0.a());
      private static final aky<cyu, String> b = $$0 -> af.a("item", $$0.a());
      private final kg.a c = kg.a().a(kj.aR);
      @Nullable
      cyu d;
      cuh e = cuj.g;
      @Nullable
      private alf<cyu> f;
      private aky<cyu, String> g = b;
      private aky<cyu, alg> h = alf::a;

      public cyu.a a(cun $$0) {
         return this.a($$0, dbf.a);
      }

      public cyu.a a(cun $$0, dbd $$1) {
         return this.a(kj.v, $$0).a(kj.w, $$1);
      }

      public cyu.a a(cyu $$0) {
         return this.a(kj.x, new dcf(new cyy($$0)));
      }

      public cyu.a a(float $$0) {
         return this.a(kj.y, new dce($$0));
      }

      public cyu.a a(int $$0) {
         return this.a(kj.c, $$0);
      }

      public cyu.a b(int $$0) {
         this.a(kj.d, $$0);
         this.a(kj.c, 1);
         this.a(kj.e, 0);
         return this;
      }

      public cyu.a b(cyu $$0) {
         this.d = $$0;
         return this;
      }

      public cyu.a a(czu $$0) {
         return this.a(kj.k, $$0);
      }

      public cyu.a a() {
         return this.a(kj.z, new dbi(axd.i));
      }

      public cyu.a a(alf<cze> $$0) {
         return this.a(kj.ae, new czd(new cxz<>($$0)));
      }

      public cyu.a c(int $$0) {
         return this.a(kj.C, new dfj($$0));
      }

      public cyu.a c(cyu $$0) {
         return this.a(kj.E, new dft(ji.a($$0.e())));
      }

      public cyu.a a(axr<cyu> $$0) {
         jf<cyu> $$1 = mf.a(mf.g);
         return this.a(kj.E, new dft($$1.b($$0)));
      }

      public cyu.a a(bwn $$0) {
         return this.a(kj.D, dhh.a($$0).a());
      }

      public cyu.a b(bwn $$0) {
         return this.a(kj.D, dhh.a($$0).b(false).a());
      }

      public cyu.a a(dam $$0, axr<dma> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public cyu.a a(dam $$0, float $$1, float $$2) {
         return this.a($$0, axc.bE, $$1, $$2, 0.0F);
      }

      public cyu.a b(dam $$0, float $$1, float $$2) {
         return this.a($$0, axc.bC, $$1, $$2, 5.0F);
      }

      public cyu.a c(dam $$0, float $$1, float $$2) {
         return this.a($$0, axc.bD, $$1, $$2, 0.0F);
      }

      public cyu.a d(dam $$0, float $$1, float $$2) {
         return this.a($$0, axc.bF, $$1, $$2, 0.0F);
      }

      public cyu.a e(dam $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public cyu.a a(dhc $$0, dhe $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kj.D, dhh.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public cyu.a a(dhc $$0) {
         return this.b(dhe.e.a($$0.a())).a($$0.a(dhe.e)).a($$0.g()).a(kj.D, dhh.a(bwn.g).a($$0.d()).a($$0.h()).a(ji.a(bwm.bM.r())).a()).a(kj.au, awn.DJ).a(1);
      }

      public cyu.a b(dhc $$0) {
         jf<bwm<?>> $$1 = mf.a(mf.f);
         return this.a($$0.a(dhe.e)).a(kj.D, dhh.a(bwn.g).a(awn.nh).a($$0.h()).a($$1.b(axf.K)).c(false).a()).a(1);
      }

      public cyu.a b(alf<dhl> $$0) {
         return this.a(kj.ac, new dbx($$0));
      }

      public cyu.a a(cuf... $$0) {
         this.e = cuj.e.a($$0);
         return this;
      }

      public cyu.a c(alf<cyu> $$0) {
         this.f = $$0;
         return this;
      }

      public cyu.a a(String $$0) {
         this.g = aky.fixed($$0);
         return this;
      }

      public cyu.a b() {
         this.g = a;
         return this;
      }

      public cyu.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public alg e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cyu.a a(ki<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cyu.a a(dbp $$0) {
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
      cyu.b a = new cyu.b() {
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
         public eyb a(exz $$0) {
            return null;
         }
      };

      @Nullable
      jg.a a();

      float b();

      @Nullable
      eyb a(exz var1);

      static cyu.b a(@Nullable final div $$0) {
         return $$0 == null ? a : new cyu.b() {
            @Override
            public jg.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public eyb a(exz $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cyu.b a(final jg.a $$0) {
         return new cyu.b() {
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
            public eyb a(exz $$0x) {
               return null;
            }
         };
      }
   }
}
