import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cxd implements csk, dgy {
   public static final Codec<jr<cxd>> e = mb.g
      .r()
      .validate($$0 -> $$0.a(cxl.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final yn<wa, jr<cxd>> f = yl.b(mc.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dke, cxd> g = Maps.newHashMap();
   public static final aku h = aku.b("base_attack_damage");
   public static final aku i = aku.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   private final jr.c<cxd> b = mb.g.f(this);
   private final kr c;
   @Nullable
   private final cxd d;
   protected final String m;
   private final csn n;

   public static int a(cxd $$0) {
      return $$0 == null ? 0 : mb.g.a($$0);
   }

   public static cxd b(int $$0) {
      return mb.g.a($$0);
   }

   @Deprecated
   public static cxd a(dke $$0) {
      return g.getOrDefault($$0, cxl.a);
   }

   public cxd(cxd.a $$0) {
      this.m = $$0.d();
      this.c = $$0.a(wp.c(this.m), $$0.e());
      this.d = $$0.d;
      this.n = $$0.e;
      if (ab.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jr.c<cxd> f() {
      return this.b;
   }

   public kr g() {
      return this.c;
   }

   public int h() {
      return this.c.a(kv.c, 1);
   }

   public void a(dgz $$0, bvy $$1, cxh $$2, int $$3) {
   }

   public void a(clw $$0) {
   }

   public void l(cxh $$0) {
   }

   public boolean a(cxh $$0, dxq $$1, dgz $$2, ji $$3, bvy $$4) {
      dah $$5 = $$0.a(kv.B);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof cpr $$6 && $$6.gm().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public cxd i() {
      return this;
   }

   public bsy a(daz $$0) {
      return bsy.e;
   }

   public float a(cxh $$0, dxq $$1) {
      dah $$2 = $$0.a(kv.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      czl $$4 = $$3.a(kv.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dfm $$5 = $$3.a(kv.E);
         return (bsy)($$5 != null && $$5.g() ? $$5.a($$3, $$1) : bsy.e);
      }
   }

   public cxh a(cxh $$0, dgz $$1, bvy $$2) {
      czl $$3 = $$0.a(kv.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cxh $$0) {
      return $$0.n();
   }

   public int e(cxh $$0) {
      return ayz.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cxh $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return ayz.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cxh $$0, cut $$1, ctg $$2, cpr $$3) {
      return false;
   }

   public boolean a(cxh $$0, cxh $$1, cut $$2, ctg $$3, cpr $$4, bwq $$5) {
      return false;
   }

   public float a(bva $$0, float $$1, btp $$2) {
      return 0.0F;
   }

   @Nullable
   public btp a(bvy $$0) {
      return null;
   }

   public void a(cxh $$0, bvy $$1, bvy $$2) {
   }

   public void b(cxh $$0, bvy $$1, bvy $$2) {
   }

   public boolean a(cxh $$0, dgz $$1, dxq $$2, ji $$3, bvy $$4) {
      dah $$5 = $$0.a(kv.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bvj.a);
         }

         return true;
      }
   }

   public boolean b(cxh $$0, dxq $$1) {
      dah $$2 = $$0.a(kv.B);
      return $$2 != null && $$2.b($$1);
   }

   public bsy a(cxh $$0, cpr $$1, bvy $$2, bsx $$3) {
      return bsy.e;
   }

   @Override
   public String toString() {
      return mb.g.e(this).g();
   }

   public final cxh j() {
      return this.d == null ? cxh.k : new cxh(this.d);
   }

   public void a(cxh $$0, dgz $$1, bva $$2, int $$3, boolean $$4) {
   }

   public void a(cxh $$0, dgz $$1, cpr $$2) {
      this.a($$0, $$1);
   }

   public void a(cxh $$0, dgz $$1) {
   }

   public cxj b(cxh $$0) {
      czl $$1 = $$0.a(kv.x);
      return $$1 != null ? $$1.d() : cxj.a;
   }

   public int a(cxh $$0, bvy $$1) {
      czl $$2 = $$0.a(kv.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cxh $$0, dgz $$1, bvy $$2, int $$3) {
      return false;
   }

   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
   }

   public Optional<cvd> k(cxh $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.m;
   }

   public final wp m() {
      return this.c.a(kv.h, wo.a);
   }

   public wp a(cxh $$0) {
      return $$0.a().a(kv.h, wo.a);
   }

   public boolean c_(cxh $$0) {
      return $$0.F();
   }

   protected static fbt a(dgz $$0, cpr $$1, dgi.b $$2) {
      fbx $$3 = $$1.bD();
      fbx $$4 = $$3.e($$1.d($$1.dM(), $$1.dK()).c($$1.gN()));
      return $$0.a(new dgi($$3, $$4, dgi.a.b, $$2, $$1));
   }

   public boolean d_(cxh $$0) {
      return false;
   }

   public cxh n() {
      return new cxh(this);
   }

   public avz a() {
      return awa.oe;
   }

   public boolean e() {
      return true;
   }

   @Override
   public csn k() {
      return this.n;
   }

   public boolean a(cxh $$0, @Nullable cpr $$1) {
      return false;
   }

   public static class a {
      private static final akm<cxd, String> a = $$0 -> af.a("block", $$0.a());
      private static final akm<cxd, String> b = $$0 -> af.a("item", $$0.a());
      private final kr.a c = kr.a().a(kv.as);
      @Nullable
      cxd d;
      csn e = csp.g;
      @Nullable
      private akt<cxd> f;
      private akm<cxd, String> g = b;
      private akm<cxd, aku> h = akt::a;

      public cxd.a a(cst $$0) {
         return this.a($$0, czn.a);
      }

      public cxd.a a(cst $$0, czl $$1) {
         return this.a(kv.w, $$0).a(kv.x, $$1);
      }

      public cxd.a a(cxd $$0) {
         return this.a(kv.y, new dal(new cxh($$0)));
      }

      public cxd.a a(float $$0) {
         return this.a(kv.z, new dak($$0));
      }

      public cxd.a a(int $$0) {
         return this.a(kv.c, $$0);
      }

      public cxd.a b(int $$0) {
         this.a(kv.d, $$0);
         this.a(kv.c, 1);
         this.a(kv.e, 0);
         return this;
      }

      public cxd.a b(cxd $$0) {
         this.d = $$0;
         return this;
      }

      public cxd.a a(cyd $$0) {
         return this.a(kv.k, $$0);
      }

      public cxd.a a() {
         return this.a(kv.A, new czq(awr.i));
      }

      public cxd.a a(akt<cxn> $$0) {
         return this.a(kv.ad, new cxm(new cwh<>($$0), true));
      }

      public cxd.a c(int $$0) {
         return this.a(kv.D, new ddp($$0));
      }

      public cxd.a c(cxd $$0) {
         return this.a(kv.F, new ddz(jv.a($$0.f())));
      }

      public cxd.a a(axf<cxd> $$0) {
         js<cxd> $$1 = mb.a(mb.g);
         return this.a(kv.F, new ddz($$1.b($$0)));
      }

      public cxd.a a(bvj $$0) {
         return this.a(kv.E, dfm.a($$0).a());
      }

      public cxd.a b(bvj $$0) {
         return this.a(kv.E, dfm.a($$0).b(false).a());
      }

      public cxd.a a(cyw $$0, axf<dke> $$1, float $$2, float $$3, boolean $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public cxd.a a(cyw $$0, float $$1, float $$2) {
         return this.a($$0, awp.bE, $$1, $$2, false);
      }

      public cxd.a b(cyw $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public cxd.a a(dfh $$0, dfj $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kv.E, dfm.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public cxd.a a(csl... $$0) {
         this.e = csp.e.a($$0);
         return this;
      }

      public cxd.a b(akt<cxd> $$0) {
         this.f = $$0;
         return this;
      }

      public cxd.a a(String $$0) {
         this.g = akm.fixed($$0);
         return this;
      }

      public cxd.a b() {
         this.g = a;
         return this;
      }

      public cxd.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public aku e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cxd.a a(ku<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cxd.a a(czw $$0) {
         return this.a(kv.o, $$0);
      }

      kr a(wp $$0, aku $$1) {
         kr $$2 = this.c.a(kv.h, $$0).a(kv.i, $$1).a();
         if ($$2.b(kv.e) && $$2.a(kv.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cxd.b a = new cxd.b() {
         @Nullable
         @Override
         public jt.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public evq a(evo $$0) {
            return null;
         }
      };

      @Nullable
      jt.a a();

      float b();

      @Nullable
      evq a(evo var1);

      static cxd.b a(@Nullable final dgz $$0) {
         return $$0 == null ? a : new cxd.b() {
            @Override
            public jt.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public evq a(evo $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cxd.b a(final jt.a $$0) {
         return new cxd.b() {
            @Override
            public jt.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public evq a(evo $$0x) {
               return null;
            }
         };
      }
   }
}
