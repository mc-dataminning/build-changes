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

public class cwl implements crq, dgh {
   public static final Codec<jr<cwl>> e = mb.g
      .r()
      .validate($$0 -> $$0.a(cwt.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   private static final Logger a = LogUtils.getLogger();
   public static final Map<djm, cwl> f = Maps.newHashMap();
   public static final akv g = akv.b("base_attack_damage");
   public static final akv h = akv.b("base_attack_speed");
   public static final int i = 64;
   public static final int j = 99;
   public static final int k = 13;
   private final jr.c<cwl> b = mb.g.f(this);
   private final kr c;
   @Nullable
   private final cwl d;
   protected final String l;
   private final crt m;

   public static int a(cwl $$0) {
      return $$0 == null ? 0 : mb.g.a($$0);
   }

   public static cwl b(int $$0) {
      return mb.g.a($$0);
   }

   @Deprecated
   public static cwl a(djm $$0) {
      return f.getOrDefault($$0, cwt.a);
   }

   public cwl(cwl.a $$0) {
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
   public jr.c<cwl> f() {
      return this.b;
   }

   public kr g() {
      return this.c;
   }

   public int h() {
      return this.c.a(kv.c, 1);
   }

   public void a(dgi $$0, bvh $$1, cwp $$2, int $$3) {
   }

   public void a(clc $$0) {
   }

   public void l(cwp $$0) {
   }

   public boolean a(dwx $$0, dgi $$1, ji $$2, cox $$3) {
      return true;
   }

   @Override
   public cwl j() {
      return this;
   }

   public bsk a(dai $$0) {
      return bsk.e;
   }

   public float a(cwp $$0, dwx $$1) {
      czr $$2 = $$0.a(kv.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      cyv $$4 = $$3.a(kv.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         deu $$5 = $$3.a(kv.D);
         return (bsk)($$5 != null && $$5.g() ? $$5.a($$3, $$1) : bsk.e);
      }
   }

   public cwp a(cwp $$0, dgi $$1, bvh $$2) {
      cyv $$3 = $$0.a(kv.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cwp $$0) {
      return $$0.n();
   }

   public int e(cwp $$0) {
      return ayz.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cwp $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return ayz.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cwp $$0, ctz $$1, csm $$2, cox $$3) {
      return false;
   }

   public boolean a(cwp $$0, cwp $$1, ctz $$2, csm $$3, cox $$4, bvz $$5) {
      return false;
   }

   public float a(bul $$0, float $$1, btb $$2) {
      return 0.0F;
   }

   @Nullable
   public btb a(bvh $$0) {
      return null;
   }

   public boolean a(cwp $$0, bvh $$1, bvh $$2) {
      return false;
   }

   public void b(cwp $$0, bvh $$1, bvh $$2) {
   }

   public boolean a(cwp $$0, dgi $$1, dwx $$2, ji $$3, bvh $$4) {
      czr $$5 = $$0.a(kv.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, but.a);
         }

         return true;
      }
   }

   public boolean b(cwp $$0, dwx $$1) {
      czr $$2 = $$0.a(kv.B);
      return $$2 != null && $$2.b($$1);
   }

   public bsk a(cwp $$0, cox $$1, bvh $$2, bsj $$3) {
      return bsk.e;
   }

   @Override
   public String toString() {
      return mb.g.e(this).g();
   }

   public final cwp k() {
      return this.d == null ? cwp.j : new cwp(this.d);
   }

   public void a(cwp $$0, dgi $$1, bul $$2, int $$3, boolean $$4) {
   }

   public void a(cwp $$0, dgi $$1, cox $$2) {
      this.a($$0, $$1);
   }

   public void a(cwp $$0, dgi $$1) {
   }

   public cwr b(cwp $$0) {
      cyv $$1 = $$0.a(kv.x);
      return $$1 != null ? $$1.d() : cwr.a;
   }

   public int a(cwp $$0, bvh $$1) {
      cyv $$2 = $$0.a(kv.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cwp $$0, dgi $$1, bvh $$2, int $$3) {
      return false;
   }

   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
   }

   public Optional<cuj> k(cwp $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.l;
   }

   public final wp m() {
      return this.c.a(kv.h, wo.a);
   }

   public wp a(cwp $$0) {
      return $$0.a().a(kv.h, wo.a);
   }

   public boolean c_(cwp $$0) {
      return $$0.F();
   }

   protected static faw a(dgi $$0, cox $$1, dfq.b $$2) {
      fba $$3 = $$1.bF();
      fba $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gL()));
      return $$0.a(new dfq($$3, $$4, dfq.a.b, $$2, $$1));
   }

   public boolean d_(cwp $$0) {
      return false;
   }

   public cwp n() {
      return new cwp(this);
   }

   public avz a() {
      return awa.nZ;
   }

   public boolean e() {
      return true;
   }

   @Override
   public crt i() {
      return this.m;
   }

   public boolean a(cwp $$0, @Nullable cox $$1) {
      return false;
   }

   public static class a {
      private static final akn<cwl, String> a = $$0 -> af.a("block", $$0.a());
      private static final akn<cwl, String> b = $$0 -> af.a("item", $$0.a());
      private final kr.a c = kr.a().a(kv.aq);
      @Nullable
      cwl d;
      crt e = crv.g;
      @Nullable
      private aku<cwl> f;
      private akn<cwl, String> g = b;
      private akn<cwl, akv> h = aku::a;

      public cwl.a a(crz $$0) {
         return this.a($$0, cyx.a);
      }

      public cwl.a a(crz $$0, cyv $$1) {
         return this.a(kv.w, $$0).a(kv.x, $$1);
      }

      public cwl.a a(cwl $$0) {
         return this.a(kv.y, new czv(new cwp($$0)));
      }

      public cwl.a a(float $$0) {
         return this.a(kv.z, new czu($$0));
      }

      public cwl.a a(int $$0) {
         return this.a(kv.c, $$0);
      }

      public cwl.a b(int $$0) {
         this.a(kv.d, $$0);
         this.a(kv.c, 1);
         this.a(kv.e, 0);
         return this;
      }

      public cwl.a b(cwl $$0) {
         this.d = $$0;
         return this;
      }

      public cwl.a a(cxm $$0) {
         return this.a(kv.k, $$0);
      }

      public cwl.a a() {
         return this.a(kv.A, new cza(awr.i));
      }

      public cwl.a a(aku<cwv> $$0) {
         return this.a(kv.ab, new cwu(new cvp<>($$0), true));
      }

      public cwl.a c(int $$0) {
         return this.a(kv.C, new dcx($$0));
      }

      public cwl.a c(cwl $$0) {
         return this.a(kv.E, new ddh(jv.a($$0.f())));
      }

      public cwl.a a(axf<cwl> $$0) {
         js<cwl> $$1 = mb.a(mb.g);
         return this.a(kv.E, new ddh($$1.b($$0)));
      }

      public cwl.a a(but $$0) {
         return this.a(kv.D, deu.a($$0).a());
      }

      public cwl.a b(but $$0) {
         return this.a(kv.D, deu.a($$0).b(false).a());
      }

      public cwl.a a(crr... $$0) {
         this.e = crv.e.a($$0);
         return this;
      }

      public cwl.a b(aku<cwl> $$0) {
         this.f = $$0;
         return this;
      }

      public cwl.a a(String $$0) {
         this.g = akn.fixed($$0);
         return this;
      }

      public cwl.a b() {
         this.g = a;
         return this;
      }

      public cwl.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public akv e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cwl.a a(ku<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cwl.a a(czg $$0) {
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
      cwl.b a = new cwl.b() {
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
         public eut a(eur $$0) {
            return null;
         }
      };

      @Nullable
      jt.a a();

      float b();

      @Nullable
      eut a(eur var1);

      static cwl.b a(@Nullable final dgi $$0) {
         return $$0 == null ? a : new cwl.b() {
            @Override
            public jt.a a() {
               return $$0.K_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public eut a(eur $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cwl.b a(final jt.a $$0) {
         return new cwl.b() {
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
            public eut a(eur $$0x) {
               return null;
            }
         };
      }
   }
}
