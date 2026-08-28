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

public class dag implements cvp, dki {
   public static final Codec<jg<dag>> e = mh.g
      .r()
      .validate($$0 -> $$0.a(dao.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final ze<wp, jg<dag>> f = zc.b(mi.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dno, dag> g = Maps.newHashMap();
   public static final alr h = alr.b("base_attack_damage");
   public static final alr i = alr.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final jg.c<dag> b = mh.g.f(this);
   private final ki c;
   @Nullable
   private final dag d;
   protected final String n;
   private final cvs o;

   public static int a(dag $$0) {
      return $$0 == null ? 0 : mh.g.a($$0);
   }

   public static dag b(int $$0) {
      return mh.g.a($$0);
   }

   @Deprecated
   public static dag a(dno $$0) {
      return g.getOrDefault($$0, dao.a);
   }

   public dag(dag.a $$0) {
      this.n = $$0.d();
      this.c = $$0.a(xg.c(this.n), $$0.e());
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
   public jg.c<dag> e() {
      return this.b;
   }

   public ki f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kl.c, 1);
   }

   public void a(dkj $$0, byf $$1, dak $$2, int $$3) {
   }

   public void a(coo $$0) {
   }

   public void l(dak $$0) {
   }

   public boolean a(dak $$0, ebq $$1, dkj $$2, iw $$3, byf $$4) {
      ddn $$5 = $$0.a(kl.A);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof csi $$6 && $$6.gk().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public dag h() {
      return this;
   }

   public bvc a(def $$0) {
      return bvc.e;
   }

   public float a(dak $$0, ebq $$1) {
      ddn $$2 = $$0.a(kl.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      dcp $$4 = $$3.a(kl.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dit $$5 = $$3.a(kl.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            dcl $$6 = $$3.a(kl.I);
            if ($$6 != null) {
               $$1.c($$2);
               return bvc.c;
            } else {
               return bvc.e;
            }
         }
      }
   }

   public dak a(dak $$0, dkj $$1, byf $$2) {
      dcp $$3 = $$0.a(kl.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(dak $$0) {
      return $$0.n();
   }

   public int e(dak $$0) {
      return azz.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(dak $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azz.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(dak $$0, cxz $$1, cwl $$2, csi $$3) {
      return false;
   }

   public boolean a(dak $$0, dak $$1, cxz $$2, cwl $$3, csi $$4, byw $$5) {
      return false;
   }

   public float a(bxe $$0, float $$1, bvt $$2) {
      return 0.0F;
   }

   @Nullable
   public bvt a(byf $$0) {
      return null;
   }

   public void a(dak $$0, byf $$1, byf $$2) {
   }

   public void b(dak $$0, byf $$1, byf $$2) {
   }

   public boolean a(dak $$0, dkj $$1, ebq $$2, iw $$3, byf $$4) {
      ddn $$5 = $$0.a(kl.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bxo.a);
         }

         return true;
      }
   }

   public boolean b(dak $$0, ebq $$1) {
      ddn $$2 = $$0.a(kl.A);
      return $$2 != null && $$2.b($$1);
   }

   public bvc a(dak $$0, csi $$1, byf $$2, bvb $$3) {
      return bvc.e;
   }

   @Override
   public String toString() {
      return mh.g.e(this).g();
   }

   public final dak i() {
      return this.d == null ? dak.l : new dak(this.d);
   }

   public void a(dak $$0, asb $$1, bxe $$2, @Nullable bxo $$3) {
   }

   public void c(dak $$0, csi $$1) {
      this.a($$0, $$1.dV());
   }

   public void a(dak $$0, dkj $$1) {
   }

   public dam b(dak $$0) {
      dcp $$1 = $$0.a(kl.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         dcl $$2 = $$0.a(kl.I);
         return $$2 != null ? dam.d : dam.a;
      }
   }

   public int a(dak $$0, byf $$1) {
      dcp $$2 = $$0.a(kl.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         dcl $$3 = $$0.a(kl.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(dak $$0, dkj $$1, byf $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(dak $$0, dag.b $$1, ddo $$2, Consumer<xg> $$3, dbz $$4) {
   }

   public Optional<cyj> k(dak $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final xg l() {
      return this.c.a(kl.h, xf.a);
   }

   public xg a(dak $$0) {
      return $$0.a().a(kl.h, xf.a);
   }

   public boolean d_(dak $$0) {
      return $$0.F();
   }

   protected static ffy a(dkj $$0, csi $$1, djq.b $$2) {
      fgc $$3 = $$1.bD();
      fgc $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gM()));
      return $$0.a(new djq($$3, $$4, djq.a.b, $$2, $$1));
   }

   public boolean e_(dak $$0) {
      return false;
   }

   public dak m() {
      return new dak(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cvs k() {
      return this.o;
   }

   public boolean a(dak $$0, @Nullable csi $$1) {
      return false;
   }

   public static class a {
      private static final alj<dag, String> a = $$0 -> ag.a("block", $$0.a());
      private static final alj<dag, String> b = $$0 -> ag.a("item", $$0.a());
      private final ki.a c = ki.a().a(kl.aT);
      @Nullable
      dag d;
      cvs e = cvu.g;
      @Nullable
      private alq<dag> f;
      private alj<dag, String> g = b;
      private alj<dag, alr> h = alq::a;

      public dag.a a(cvy $$0) {
         return this.a($$0, dcr.a);
      }

      public dag.a a(cvy $$0, dcp $$1) {
         return this.a(kl.v, $$0).a(kl.w, $$1);
      }

      public dag.a a(dag $$0) {
         return this.a(kl.x, new ddr(new dak($$0)));
      }

      public dag.a a(float $$0) {
         return this.a(kl.y, new ddq($$0));
      }

      public dag.a a(int $$0) {
         return this.a(kl.c, $$0);
      }

      public dag.a b(int $$0) {
         this.a(kl.d, $$0);
         this.a(kl.c, 1);
         this.a(kl.e, 0);
         return this;
      }

      public dag.a b(dag $$0) {
         this.d = $$0;
         return this;
      }

      public dag.a a(dbg $$0) {
         return this.a(kl.k, $$0);
      }

      public dag.a a() {
         return this.a(kl.z, new dcu(axo.i));
      }

      public dag.a a(alq<daq> $$0) {
         return this.a(kl.ae, new dap(new czl<>($$0)));
      }

      public dag.a c(int $$0) {
         return this.a(kl.C, new dgv($$0));
      }

      public dag.a c(dag $$0) {
         return this.a(kl.E, new dhf(jk.a($$0.e())));
      }

      public dag.a a(ayc<dag> $$0) {
         jh<dag> $$1 = mh.a(mh.g);
         return this.a(kl.E, new dhf($$1.b($$0)));
      }

      public dag.a a(bxo $$0) {
         return this.a(kl.D, dit.a($$0).a());
      }

      public dag.a b(bxo $$0) {
         return this.a(kl.D, dit.a($$0).b(false).a());
      }

      public dag.a a(dby $$0, ayc<dno> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public dag.a a(dby $$0, float $$1, float $$2) {
         return this.a($$0, axn.bF, $$1, $$2, 0.0F);
      }

      public dag.a b(dby $$0, float $$1, float $$2) {
         return this.a($$0, axn.bD, $$1, $$2, 5.0F);
      }

      public dag.a c(dby $$0, float $$1, float $$2) {
         return this.a($$0, axn.bE, $$1, $$2, 0.0F);
      }

      public dag.a d(dby $$0, float $$1, float $$2) {
         return this.a($$0, axn.bG, $$1, $$2, 0.0F);
      }

      public dag.a e(dby $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public dag.a a(dio $$0, diq $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kl.D, dit.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public dag.a a(dio $$0) {
         return this.b(diq.e.a($$0.a())).a($$0.a(diq.e)).a($$0.g()).a(kl.D, dit.a(bxo.g).a($$0.d()).a($$0.h()).a(jk.a(bxn.bN.r())).a()).a(kl.au, awy.DM).a(1);
      }

      public dag.a b(dio $$0) {
         jh<bxn<?>> $$1 = mh.a(mh.f);
         return this.a($$0.a(diq.e)).a(kl.D, dit.a(bxo.g).a(awy.nk).a($$0.h()).a($$1.b(axq.K)).c(false).a()).a(1);
      }

      public dag.a b(alq<dix> $$0) {
         return this.a(kl.ac, new ddj($$0));
      }

      public dag.a a(cvq... $$0) {
         this.e = cvu.e.a($$0);
         return this;
      }

      public dag.a c(alq<dag> $$0) {
         this.f = $$0;
         return this;
      }

      public dag.a a(String $$0) {
         this.g = alj.fixed($$0);
         return this;
      }

      public dag.a b() {
         this.g = a;
         return this;
      }

      public dag.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public alr e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> dag.a a(kk<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public dag.a a(ddb $$0) {
         return this.a(kl.o, $$0);
      }

      ki a(xg $$0, alr $$1) {
         ki $$2 = this.c.a(kl.h, $$0).a(kl.i, $$1).a();
         if ($$2.c(kl.e) && $$2.a(kl.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      dag.b a = new dag.b() {
         @Nullable
         @Override
         public ji.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public ezv a(ezt $$0) {
            return null;
         }
      };

      @Nullable
      ji.a a();

      float b();

      @Nullable
      ezv a(ezt var1);

      static dag.b a(@Nullable final dkj $$0) {
         return $$0 == null ? a : new dag.b() {
            @Override
            public ji.a a() {
               return $$0.J_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public ezv a(ezt $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static dag.b a(final ji.a $$0) {
         return new dag.b() {
            @Override
            public ji.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public ezv a(ezt $$0x) {
               return null;
            }
         };
      }
   }
}
