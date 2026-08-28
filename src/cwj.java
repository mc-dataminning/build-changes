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

public class cwj implements cro, dgf {
   public static final Codec<jr<cwj>> e = mb.g
      .r()
      .validate($$0 -> $$0.a(cwr.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   private static final Logger a = LogUtils.getLogger();
   public static final Map<djk, cwj> f = Maps.newHashMap();
   public static final aku g = aku.b("base_attack_damage");
   public static final aku h = aku.b("base_attack_speed");
   public static final int i = 64;
   public static final int j = 99;
   public static final int k = 13;
   private final jr.c<cwj> b = mb.g.f(this);
   private final kr c;
   @Nullable
   private final cwj d;
   protected final String l;
   private final crr m;

   public static int a(cwj $$0) {
      return $$0 == null ? 0 : mb.g.a($$0);
   }

   public static cwj b(int $$0) {
      return mb.g.a($$0);
   }

   @Deprecated
   public static cwj a(djk $$0) {
      return f.getOrDefault($$0, cwr.a);
   }

   public cwj(cwj.a $$0) {
      this.l = $$0.d();
      this.c = $$0.a(wo.c(this.l), $$0.e());
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
   public jr.c<cwj> f() {
      return this.b;
   }

   public kr g() {
      return this.c;
   }

   public int h() {
      return this.c.a(kv.c, 1);
   }

   public void a(dgg $$0, bvf $$1, cwn $$2, int $$3) {
   }

   public void a(cla $$0) {
   }

   public void l(cwn $$0) {
   }

   public boolean a(dwv $$0, dgg $$1, ji $$2, cov $$3) {
      return true;
   }

   @Override
   public cwj j() {
      return this;
   }

   public bsi a(dag $$0) {
      return bsi.e;
   }

   public float a(cwn $$0, dwv $$1) {
      czp $$2 = $$0.a(kv.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      cyt $$4 = $$3.a(kv.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         des $$5 = $$3.a(kv.D);
         return (bsi)($$5 != null && $$5.g() ? $$5.a($$3, $$1) : bsi.e);
      }
   }

   public cwn a(cwn $$0, dgg $$1, bvf $$2) {
      cyt $$3 = $$0.a(kv.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cwn $$0) {
      return $$0.n();
   }

   public int e(cwn $$0) {
      return ayy.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cwn $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return ayy.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cwn $$0, ctx $$1, csk $$2, cov $$3) {
      return false;
   }

   public boolean a(cwn $$0, cwn $$1, ctx $$2, csk $$3, cov $$4, bvx $$5) {
      return false;
   }

   public float a(buj $$0, float $$1, bsz $$2) {
      return 0.0F;
   }

   @Nullable
   public bsz a(bvf $$0) {
      return null;
   }

   public boolean a(cwn $$0, bvf $$1, bvf $$2) {
      return false;
   }

   public void b(cwn $$0, bvf $$1, bvf $$2) {
   }

   public boolean a(cwn $$0, dgg $$1, dwv $$2, ji $$3, bvf $$4) {
      czp $$5 = $$0.a(kv.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bur.a);
         }

         return true;
      }
   }

   public boolean b(cwn $$0, dwv $$1) {
      czp $$2 = $$0.a(kv.B);
      return $$2 != null && $$2.b($$1);
   }

   public bsi a(cwn $$0, cov $$1, bvf $$2, bsh $$3) {
      return bsi.e;
   }

   @Override
   public String toString() {
      return mb.g.e(this).g();
   }

   public final cwn k() {
      return this.d == null ? cwn.j : new cwn(this.d);
   }

   public void a(cwn $$0, dgg $$1, buj $$2, int $$3, boolean $$4) {
   }

   public void a(cwn $$0, dgg $$1, cov $$2) {
      this.a($$0, $$1);
   }

   public void a(cwn $$0, dgg $$1) {
   }

   public cwp b(cwn $$0) {
      cyt $$1 = $$0.a(kv.x);
      return $$1 != null ? $$1.d() : cwp.a;
   }

   public int a(cwn $$0, bvf $$1) {
      cyt $$2 = $$0.a(kv.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cwn $$0, dgg $$1, bvf $$2, int $$3) {
      return false;
   }

   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
   }

   public Optional<cuh> k(cwn $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.l;
   }

   public final wo m() {
      return this.c.a(kv.h, wn.a);
   }

   public wo a(cwn $$0) {
      return $$0.a().a(kv.h, wn.a);
   }

   public boolean c_(cwn $$0) {
      return $$0.F();
   }

   protected static fau a(dgg $$0, cov $$1, dfo.b $$2) {
      fay $$3 = $$1.bF();
      fay $$4 = $$3.e($$1.d($$1.dO(), $$1.dM()).c($$1.gL()));
      return $$0.a(new dfo($$3, $$4, dfo.a.b, $$2, $$1));
   }

   public boolean d_(cwn $$0) {
      return false;
   }

   public cwn n() {
      return new cwn(this);
   }

   public avy a() {
      return avz.nZ;
   }

   public boolean e() {
      return true;
   }

   @Override
   public crr i() {
      return this.m;
   }

   public static class a {
      private static final akm<cwj, String> a = $$0 -> af.a("block", $$0.a());
      private static final akm<cwj, String> b = $$0 -> af.a("item", $$0.a());
      private final kr.a c = kr.a().a(kv.aq);
      @Nullable
      cwj d;
      crr e = crt.g;
      @Nullable
      private akt<cwj> f;
      private akm<cwj, String> g = b;
      private akm<cwj, aku> h = akt::a;

      public cwj.a a(crx $$0) {
         return this.a($$0, cyv.a);
      }

      public cwj.a a(crx $$0, cyt $$1) {
         return this.a(kv.w, $$0).a(kv.x, $$1);
      }

      public cwj.a a(cwj $$0) {
         return this.a(kv.y, new czt(new cwn($$0)));
      }

      public cwj.a a(float $$0) {
         return this.a(kv.z, new czs($$0));
      }

      public cwj.a a(int $$0) {
         return this.a(kv.c, $$0);
      }

      public cwj.a b(int $$0) {
         this.a(kv.d, $$0);
         this.a(kv.c, 1);
         this.a(kv.e, 0);
         return this;
      }

      public cwj.a b(cwj $$0) {
         this.d = $$0;
         return this;
      }

      public cwj.a a(cxk $$0) {
         return this.a(kv.k, $$0);
      }

      public cwj.a a() {
         return this.a(kv.A, new cyy(awq.i));
      }

      public cwj.a a(akt<cwt> $$0) {
         return this.a(kv.ab, new cws(new cvn<>($$0), true));
      }

      public cwj.a c(int $$0) {
         return this.a(kv.C, new dcv($$0));
      }

      public cwj.a c(cwj $$0) {
         return this.a(kv.E, new ddf(jv.a($$0.f())));
      }

      public cwj.a a(axe<cwj> $$0) {
         js<cwj> $$1 = mb.a(mb.g);
         return this.a(kv.E, new ddf($$1.b($$0)));
      }

      public cwj.a a(bur $$0) {
         return this.a(kv.D, des.a($$0).a());
      }

      public cwj.a b(bur $$0) {
         return this.a(kv.D, des.a($$0).b(false).a());
      }

      public cwj.a a(crp... $$0) {
         this.e = crt.e.a($$0);
         return this;
      }

      public cwj.a b(akt<cwj> $$0) {
         this.f = $$0;
         return this;
      }

      public cwj.a a(String $$0) {
         this.g = akm.fixed($$0);
         return this;
      }

      public cwj.a b() {
         this.g = a;
         return this;
      }

      public cwj.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public aku e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cwj.a a(ku<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cwj.a a(cze $$0) {
         return this.a(kv.o, $$0);
      }

      kr a(wo $$0, aku $$1) {
         kr $$2 = this.c.a(kv.h, $$0).a(kv.i, $$1).a();
         if ($$2.b(kv.e) && $$2.a(kv.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cwj.b a = new cwj.b() {
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
         public eur a(eup $$0) {
            return null;
         }
      };

      @Nullable
      jt.a a();

      float b();

      @Nullable
      eur a(eup var1);

      static cwj.b a(@Nullable final dgg $$0) {
         return $$0 == null ? a : new cwj.b() {
            @Override
            public jt.a a() {
               return $$0.K_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public eur a(eup $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cwj.b a(final jt.a $$0) {
         return new cwj.b() {
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
            public eur a(eup $$0x) {
               return null;
            }
         };
      }
   }
}
