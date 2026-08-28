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

public class cyo implements cty, dio {
   public static final Codec<je<cyo>> e = mf.g
      .r()
      .validate($$0 -> $$0.a(cyw.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final yu<wh, je<cyo>> f = ys.b(mg.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dlu, cyo> g = Maps.newHashMap();
   public static final ale h = ale.b("base_attack_damage");
   public static final ale i = ale.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final je.c<cyo> b = mf.g.f(this);
   private final kg c;
   @Nullable
   private final cyo d;
   protected final String n;
   private final cub o;

   public static int a(cyo $$0) {
      return $$0 == null ? 0 : mf.g.a($$0);
   }

   public static cyo b(int $$0) {
      return mf.g.a($$0);
   }

   @Deprecated
   public static cyo a(dlu $$0) {
      return g.getOrDefault($$0, cyw.a);
   }

   public cyo(cyo.a $$0) {
      this.n = $$0.d();
      this.c = $$0.a(ww.c(this.n), $$0.e());
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
   public je.c<cyo> e() {
      return this.b;
   }

   public kg f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kj.c, 1);
   }

   public void a(dip $$0, bwz $$1, cys $$2, int $$3) {
   }

   public void a(cmx $$0) {
   }

   public void l(cys $$0) {
   }

   public boolean a(cys $$0, dzo $$1, dip $$2, iu $$3, bwz $$4) {
      dbv $$5 = $$0.a(kj.A);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof cqs $$6 && $$6.gj().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public cyo h() {
      return this;
   }

   public bty a(dcn $$0) {
      return bty.e;
   }

   public float a(cys $$0, dzo $$1) {
      dbv $$2 = $$0.a(kj.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      dax $$4 = $$3.a(kj.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dhb $$5 = $$3.a(kj.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            dat $$6 = $$3.a(kj.I);
            if ($$6 != null) {
               $$1.c($$2);
               return bty.c;
            } else {
               return bty.e;
            }
         }
      }
   }

   public cys a(cys $$0, dip $$1, bwz $$2) {
      dax $$3 = $$0.a(kj.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cys $$0) {
      return $$0.n();
   }

   public int e(cys $$0) {
      return azk.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cys $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azk.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cys $$0, cwh $$1, cuu $$2, cqs $$3) {
      return false;
   }

   public boolean a(cys $$0, cys $$1, cwh $$2, cuu $$3, cqs $$4, bxq $$5) {
      return false;
   }

   public float a(bwa $$0, float $$1, bup $$2) {
      return 0.0F;
   }

   @Nullable
   public bup a(bwz $$0) {
      return null;
   }

   public void a(cys $$0, bwz $$1, bwz $$2) {
   }

   public void b(cys $$0, bwz $$1, bwz $$2) {
   }

   public boolean a(cys $$0, dip $$1, dzo $$2, iu $$3, bwz $$4) {
      dbv $$5 = $$0.a(kj.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bwk.a);
         }

         return true;
      }
   }

   public boolean b(cys $$0, dzo $$1) {
      dbv $$2 = $$0.a(kj.A);
      return $$2 != null && $$2.b($$1);
   }

   public bty a(cys $$0, cqs $$1, bwz $$2, btx $$3) {
      return bty.e;
   }

   @Override
   public String toString() {
      return mf.g.e(this).g();
   }

   public final cys i() {
      return this.d == null ? cys.k : new cys(this.d);
   }

   public void a(cys $$0, dip $$1, bwa $$2, int $$3, boolean $$4) {
   }

   public void a(cys $$0, dip $$1, cqs $$2) {
      this.a($$0, $$1);
   }

   public void a(cys $$0, dip $$1) {
   }

   public cyu b(cys $$0) {
      dax $$1 = $$0.a(kj.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         dat $$2 = $$0.a(kj.I);
         return $$2 != null ? cyu.d : cyu.a;
      }
   }

   public int a(cys $$0, bwz $$1) {
      dax $$2 = $$0.a(kj.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         dat $$3 = $$0.a(kj.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(cys $$0, dip $$1, bwz $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(cys $$0, cyo.b $$1, dbw $$2, Consumer<ww> $$3, dah $$4) {
   }

   public Optional<cwr> k(cys $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final ww l() {
      return this.c.a(kj.h, wv.a);
   }

   public ww a(cys $$0) {
      return $$0.a().a(kj.h, wv.a);
   }

   public boolean c_(cys $$0) {
      return $$0.F();
   }

   protected static fds a(dip $$0, cqs $$1, dhy.b $$2) {
      fdw $$3 = $$1.bE();
      fdw $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gK()));
      return $$0.a(new dhy($$3, $$4, dhy.a.b, $$2, $$1));
   }

   public boolean d_(cys $$0) {
      return false;
   }

   public cys m() {
      return new cys(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cub k() {
      return this.o;
   }

   public boolean a(cys $$0, @Nullable cqs $$1) {
      return false;
   }

   public static class a {
      private static final akw<cyo, String> a = $$0 -> af.a("block", $$0.a());
      private static final akw<cyo, String> b = $$0 -> af.a("item", $$0.a());
      private final kg.a c = kg.a().a(kj.aQ);
      @Nullable
      cyo d;
      cub e = cud.g;
      @Nullable
      private ald<cyo> f;
      private akw<cyo, String> g = b;
      private akw<cyo, ale> h = ald::a;

      public cyo.a a(cuh $$0) {
         return this.a($$0, daz.a);
      }

      public cyo.a a(cuh $$0, dax $$1) {
         return this.a(kj.v, $$0).a(kj.w, $$1);
      }

      public cyo.a a(cyo $$0) {
         return this.a(kj.x, new dbz(new cys($$0)));
      }

      public cyo.a a(float $$0) {
         return this.a(kj.y, new dby($$0));
      }

      public cyo.a a(int $$0) {
         return this.a(kj.c, $$0);
      }

      public cyo.a b(int $$0) {
         this.a(kj.d, $$0);
         this.a(kj.c, 1);
         this.a(kj.e, 0);
         return this;
      }

      public cyo.a b(cyo $$0) {
         this.d = $$0;
         return this;
      }

      public cyo.a a(czo $$0) {
         return this.a(kj.k, $$0);
      }

      public cyo.a a() {
         return this.a(kj.z, new dbc(axb.i));
      }

      public cyo.a a(ald<cyy> $$0) {
         return this.a(kj.ae, new cyx(new cxt<>($$0)));
      }

      public cyo.a c(int $$0) {
         return this.a(kj.C, new dfd($$0));
      }

      public cyo.a c(cyo $$0) {
         return this.a(kj.E, new dfn(ji.a($$0.e())));
      }

      public cyo.a a(axp<cyo> $$0) {
         jf<cyo> $$1 = mf.a(mf.g);
         return this.a(kj.E, new dfn($$1.b($$0)));
      }

      public cyo.a a(bwk $$0) {
         return this.a(kj.D, dhb.a($$0).a());
      }

      public cyo.a b(bwk $$0) {
         return this.a(kj.D, dhb.a($$0).b(false).a());
      }

      public cyo.a a(dag $$0, axp<dlu> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public cyo.a a(dag $$0, float $$1, float $$2) {
         return this.a($$0, axa.bE, $$1, $$2, 0.0F);
      }

      public cyo.a b(dag $$0, float $$1, float $$2) {
         return this.a($$0, axa.bC, $$1, $$2, 5.0F);
      }

      public cyo.a c(dag $$0, float $$1, float $$2) {
         return this.a($$0, axa.bD, $$1, $$2, 0.0F);
      }

      public cyo.a d(dag $$0, float $$1, float $$2) {
         return this.a($$0, axa.bF, $$1, $$2, 0.0F);
      }

      public cyo.a e(dag $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public cyo.a a(dgw $$0, dgy $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kj.D, dhb.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public cyo.a a(dgw $$0) {
         return this.b(dgy.e.a($$0.a())).a($$0.a(dgy.e)).a($$0.g()).a(kj.D, dhb.a(bwk.g).a($$0.d()).a($$0.h()).a(ji.a(bwj.bM.r())).a()).a(kj.au, awl.DG).a(1);
      }

      public cyo.a b(dgw $$0) {
         jf<bwj<?>> $$1 = mf.a(mf.f);
         return this.a($$0.a(dgy.e)).a(kj.D, dhb.a(bwk.g).a(awl.ng).a($$0.h()).a($$1.b(axd.K)).c(false).a()).a(1);
      }

      public cyo.a b(ald<dhf> $$0) {
         return this.a(kj.ac, new dbr($$0));
      }

      public cyo.a a(ctz... $$0) {
         this.e = cud.e.a($$0);
         return this;
      }

      public cyo.a c(ald<cyo> $$0) {
         this.f = $$0;
         return this;
      }

      public cyo.a a(String $$0) {
         this.g = akw.fixed($$0);
         return this;
      }

      public cyo.a b() {
         this.g = a;
         return this;
      }

      public cyo.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public ale e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cyo.a a(ki<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cyo.a a(dbj $$0) {
         return this.a(kj.o, $$0);
      }

      kg a(ww $$0, ale $$1) {
         kg $$2 = this.c.a(kj.h, $$0).a(kj.i, $$1).a();
         if ($$2.c(kj.e) && $$2.a(kj.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cyo.b a = new cyo.b() {
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
         public exp a(exn $$0) {
            return null;
         }
      };

      @Nullable
      jg.a a();

      float b();

      @Nullable
      exp a(exn var1);

      static cyo.b a(@Nullable final dip $$0) {
         return $$0 == null ? a : new cyo.b() {
            @Override
            public jg.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public exp a(exn $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cyo.b a(final jg.a $$0) {
         return new cyo.b() {
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
            public exp a(exn $$0x) {
               return null;
            }
         };
      }
   }
}
