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

public class cwk implements crp, dgg {
   public static final Codec<jr<cwk>> e = mb.g
      .r()
      .validate($$0 -> $$0.a(cws.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   private static final Logger a = LogUtils.getLogger();
   public static final Map<djl, cwk> f = Maps.newHashMap();
   public static final akv g = akv.b("base_attack_damage");
   public static final akv h = akv.b("base_attack_speed");
   public static final int i = 64;
   public static final int j = 99;
   public static final int k = 13;
   private final jr.c<cwk> b = mb.g.f(this);
   private final kr c;
   @Nullable
   private final cwk d;
   protected final String l;
   private final crs m;

   public static int a(cwk $$0) {
      return $$0 == null ? 0 : mb.g.a($$0);
   }

   public static cwk b(int $$0) {
      return mb.g.a($$0);
   }

   @Deprecated
   public static cwk a(djl $$0) {
      return f.getOrDefault($$0, cws.a);
   }

   public cwk(cwk.a $$0) {
      this.l = $$0.d();
      this.c = $$0.a(wp.c(this.l), $$0.e());
      this.d = $$0.d;
      this.m = $$0.e;
      if (ab.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jr.c<cwk> f() {
      return this.b;
   }

   public kr g() {
      return this.c;
   }

   public int h() {
      return this.c.a(kv.c, 1);
   }

   public void a(dgh $$0, bvg $$1, cwo $$2, int $$3) {
   }

   public void a(clb $$0) {
   }

   public void l(cwo $$0) {
   }

   public boolean a(dww $$0, dgh $$1, ji $$2, cow $$3) {
      return true;
   }

   @Override
   public cwk j() {
      return this;
   }

   public bsj a(dah $$0) {
      return bsj.e;
   }

   public float a(cwo $$0, dww $$1) {
      czq $$2 = $$0.a(kv.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      cyu $$4 = $$3.a(kv.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         det $$5 = $$3.a(kv.D);
         return (bsj)($$5 != null && $$5.g() ? $$5.a($$3, $$1) : bsj.e);
      }
   }

   public cwo a(cwo $$0, dgh $$1, bvg $$2) {
      cyu $$3 = $$0.a(kv.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cwo $$0) {
      return $$0.n();
   }

   public int e(cwo $$0) {
      return ayz.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cwo $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return ayz.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cwo $$0, cty $$1, csl $$2, cow $$3) {
      return false;
   }

   public boolean a(cwo $$0, cwo $$1, cty $$2, csl $$3, cow $$4, bvy $$5) {
      return false;
   }

   public float a(buk $$0, float $$1, bta $$2) {
      return 0.0F;
   }

   @Nullable
   public bta a(bvg $$0) {
      return null;
   }

   public boolean a(cwo $$0, bvg $$1, bvg $$2) {
      return false;
   }

   public void b(cwo $$0, bvg $$1, bvg $$2) {
   }

   public boolean a(cwo $$0, dgh $$1, dww $$2, ji $$3, bvg $$4) {
      czq $$5 = $$0.a(kv.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bus.a);
         }

         return true;
      }
   }

   public boolean b(cwo $$0, dww $$1) {
      czq $$2 = $$0.a(kv.B);
      return $$2 != null && $$2.b($$1);
   }

   public bsj a(cwo $$0, cow $$1, bvg $$2, bsi $$3) {
      return bsj.e;
   }

   @Override
   public String toString() {
      return mb.g.e(this).g();
   }

   public final cwo k() {
      return this.d == null ? cwo.j : new cwo(this.d);
   }

   public void a(cwo $$0, dgh $$1, buk $$2, int $$3, boolean $$4) {
   }

   public void a(cwo $$0, dgh $$1, cow $$2) {
      this.a($$0, $$1);
   }

   public void a(cwo $$0, dgh $$1) {
   }

   public cwq b(cwo $$0) {
      cyu $$1 = $$0.a(kv.x);
      return $$1 != null ? $$1.d() : cwq.a;
   }

   public int a(cwo $$0, bvg $$1) {
      cyu $$2 = $$0.a(kv.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cwo $$0, dgh $$1, bvg $$2, int $$3) {
      return false;
   }

   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
   }

   public Optional<cui> k(cwo $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.l;
   }

   public final wp m() {
      return this.c.a(kv.h, wo.a);
   }

   public wp a(cwo $$0) {
      return $$0.a().a(kv.h, wo.a);
   }

   public boolean c_(cwo $$0) {
      return $$0.F();
   }

   protected static fav a(dgh $$0, cow $$1, dfp.b $$2) {
      faz $$3 = $$1.bF();
      faz $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gL()));
      return $$0.a(new dfp($$3, $$4, dfp.a.b, $$2, $$1));
   }

   public boolean d_(cwo $$0) {
      return false;
   }

   public cwo n() {
      return new cwo(this);
   }

   public avz a() {
      return awa.nZ;
   }

   public boolean e() {
      return true;
   }

   @Override
   public crs i() {
      return this.m;
   }

   public boolean a(cwo $$0, @Nullable cow $$1) {
      return false;
   }

   public static class a {
      private static final akn<cwk, String> a = $$0 -> af.a("block", $$0.a());
      private static final akn<cwk, String> b = $$0 -> af.a("item", $$0.a());
      private final kr.a c = kr.a().a(kv.aq);
      @Nullable
      cwk d;
      crs e = cru.g;
      @Nullable
      private aku<cwk> f;
      private akn<cwk, String> g = b;
      private akn<cwk, akv> h = aku::a;

      public cwk.a a(cry $$0) {
         return this.a($$0, cyw.a);
      }

      public cwk.a a(cry $$0, cyu $$1) {
         return this.a(kv.w, $$0).a(kv.x, $$1);
      }

      public cwk.a a(cwk $$0) {
         return this.a(kv.y, new czu(new cwo($$0)));
      }

      public cwk.a a(float $$0) {
         return this.a(kv.z, new czt($$0));
      }

      public cwk.a a(int $$0) {
         return this.a(kv.c, $$0);
      }

      public cwk.a b(int $$0) {
         this.a(kv.d, $$0);
         this.a(kv.c, 1);
         this.a(kv.e, 0);
         return this;
      }

      public cwk.a b(cwk $$0) {
         this.d = $$0;
         return this;
      }

      public cwk.a a(cxl $$0) {
         return this.a(kv.k, $$0);
      }

      public cwk.a a() {
         return this.a(kv.A, new cyz(awr.i));
      }

      public cwk.a a(aku<cwu> $$0) {
         return this.a(kv.ab, new cwt(new cvo<>($$0), true));
      }

      public cwk.a c(int $$0) {
         return this.a(kv.C, new dcw($$0));
      }

      public cwk.a c(cwk $$0) {
         return this.a(kv.E, new ddg(jv.a($$0.f())));
      }

      public cwk.a a(axf<cwk> $$0) {
         js<cwk> $$1 = mb.a(mb.g);
         return this.a(kv.E, new ddg($$1.b($$0)));
      }

      public cwk.a a(bus $$0) {
         return this.a(kv.D, det.a($$0).a());
      }

      public cwk.a b(bus $$0) {
         return this.a(kv.D, det.a($$0).b(false).a());
      }

      public cwk.a a(crq... $$0) {
         this.e = cru.e.a($$0);
         return this;
      }

      public cwk.a b(aku<cwk> $$0) {
         this.f = $$0;
         return this;
      }

      public cwk.a a(String $$0) {
         this.g = akn.fixed($$0);
         return this;
      }

      public cwk.a b() {
         this.g = a;
         return this;
      }

      public cwk.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public akv e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cwk.a a(ku<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cwk.a a(czf $$0) {
         return this.a(kv.o, $$0);
      }

      kr a(wp $$0, akv $$1) {
         kr $$2 = this.c.a(kv.h, $$0).a(kv.i, $$1).a();
         if ($$2.b(kv.e) && $$2.a(kv.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cwk.b a = new cwk.b() {
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
         public eus a(euq $$0) {
            return null;
         }
      };

      @Nullable
      jt.a a();

      float b();

      @Nullable
      eus a(euq var1);

      static cwk.b a(@Nullable final dgh $$0) {
         return $$0 == null ? a : new cwk.b() {
            @Override
            public jt.a a() {
               return $$0.K_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public eus a(euq $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cwk.b a(final jt.a $$0) {
         return new cwk.b() {
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
            public eus a(euq $$0x) {
               return null;
            }
         };
      }
   }
}
