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

public class czw implements cvg, djy {
   public static final Codec<jg<czw>> e = mh.g
      .r()
      .validate($$0 -> $$0.a(dae.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final za<wn, jg<czw>> f = yy.b(mi.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dne, czw> g = Maps.newHashMap();
   public static final alk h = alk.b("base_attack_damage");
   public static final alk i = alk.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final jg.c<czw> b = mh.g.f(this);
   private final ki c;
   @Nullable
   private final czw d;
   protected final String n;
   private final cvj o;

   public static int a(czw $$0) {
      return $$0 == null ? 0 : mh.g.a($$0);
   }

   public static czw b(int $$0) {
      return mh.g.a($$0);
   }

   @Deprecated
   public static czw a(dne $$0) {
      return g.getOrDefault($$0, dae.a);
   }

   public czw(czw.a $$0) {
      this.n = $$0.d();
      this.c = $$0.a(xc.c(this.n), $$0.e());
      this.d = $$0.d;
      this.o = $$0.e;
      if (ac.aU) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jg.c<czw> e() {
      return this.b;
   }

   public ki f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kl.c, 1);
   }

   public void a(djz $$0, bxw $$1, daa $$2, int $$3) {
   }

   public void a(coe $$0) {
   }

   public void l(daa $$0) {
   }

   public boolean a(daa $$0, ebg $$1, djz $$2, iw $$3, bxw $$4) {
      ddd $$5 = $$0.a(kl.A);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof crz $$6 && $$6.gk().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public czw h() {
      return this;
   }

   public but a(ddv $$0) {
      return but.e;
   }

   public float a(daa $$0, ebg $$1) {
      ddd $$2 = $$0.a(kl.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      dcf $$4 = $$3.a(kl.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dij $$5 = $$3.a(kl.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            dcb $$6 = $$3.a(kl.I);
            if ($$6 != null) {
               $$1.c($$2);
               return but.c;
            } else {
               return but.e;
            }
         }
      }
   }

   public daa a(daa $$0, djz $$1, bxw $$2) {
      dcf $$3 = $$0.a(kl.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(daa $$0) {
      return $$0.n();
   }

   public int e(daa $$0) {
      return azq.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(daa $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azq.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(daa $$0, cxp $$1, cwc $$2, crz $$3) {
      return false;
   }

   public boolean a(daa $$0, daa $$1, cxp $$2, cwc $$3, crz $$4, byn $$5) {
      return false;
   }

   public float a(bwv $$0, float $$1, bvk $$2) {
      return 0.0F;
   }

   @Nullable
   public bvk a(bxw $$0) {
      return null;
   }

   public void a(daa $$0, bxw $$1, bxw $$2) {
   }

   public void b(daa $$0, bxw $$1, bxw $$2) {
   }

   public boolean a(daa $$0, djz $$1, ebg $$2, iw $$3, bxw $$4) {
      ddd $$5 = $$0.a(kl.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bxf.a);
         }

         return true;
      }
   }

   public boolean b(daa $$0, ebg $$1) {
      ddd $$2 = $$0.a(kl.A);
      return $$2 != null && $$2.b($$1);
   }

   public but a(daa $$0, crz $$1, bxw $$2, bus $$3) {
      return but.e;
   }

   @Override
   public String toString() {
      return mh.g.e(this).g();
   }

   public final daa i() {
      return this.d == null ? daa.k : new daa(this.d);
   }

   public void a(daa $$0, aru $$1, bwv $$2, @Nullable bxf $$3) {
   }

   public void a(daa $$0, djz $$1, crz $$2) {
      this.a($$0, $$1);
   }

   public void a(daa $$0, djz $$1) {
   }

   public dac b(daa $$0) {
      dcf $$1 = $$0.a(kl.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         dcb $$2 = $$0.a(kl.I);
         return $$2 != null ? dac.d : dac.a;
      }
   }

   public int a(daa $$0, bxw $$1) {
      dcf $$2 = $$0.a(kl.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         dcb $$3 = $$0.a(kl.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(daa $$0, djz $$1, bxw $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(daa $$0, czw.b $$1, dde $$2, Consumer<xc> $$3, dbp $$4) {
   }

   public Optional<cxz> k(daa $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final xc l() {
      return this.c.a(kl.h, xb.a);
   }

   public xc a(daa $$0) {
      return $$0.a().a(kl.h, xb.a);
   }

   public boolean d_(daa $$0) {
      return $$0.F();
   }

   protected static ffo a(djz $$0, crz $$1, djg.b $$2) {
      ffs $$3 = $$1.bD();
      ffs $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gL()));
      return $$0.a(new djg($$3, $$4, djg.a.b, $$2, $$1));
   }

   public boolean e_(daa $$0) {
      return false;
   }

   public daa m() {
      return new daa(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cvj k() {
      return this.o;
   }

   public boolean a(daa $$0, @Nullable crz $$1) {
      return false;
   }

   public static class a {
      private static final alc<czw, String> a = $$0 -> ag.a("block", $$0.a());
      private static final alc<czw, String> b = $$0 -> ag.a("item", $$0.a());
      private final ki.a c = ki.a().a(kl.aT);
      @Nullable
      czw d;
      cvj e = cvl.g;
      @Nullable
      private alj<czw> f;
      private alc<czw, String> g = b;
      private alc<czw, alk> h = alj::a;

      public czw.a a(cvp $$0) {
         return this.a($$0, dch.a);
      }

      public czw.a a(cvp $$0, dcf $$1) {
         return this.a(kl.v, $$0).a(kl.w, $$1);
      }

      public czw.a a(czw $$0) {
         return this.a(kl.x, new ddh(new daa($$0)));
      }

      public czw.a a(float $$0) {
         return this.a(kl.y, new ddg($$0));
      }

      public czw.a a(int $$0) {
         return this.a(kl.c, $$0);
      }

      public czw.a b(int $$0) {
         this.a(kl.d, $$0);
         this.a(kl.c, 1);
         this.a(kl.e, 0);
         return this;
      }

      public czw.a b(czw $$0) {
         this.d = $$0;
         return this;
      }

      public czw.a a(daw $$0) {
         return this.a(kl.k, $$0);
      }

      public czw.a a() {
         return this.a(kl.z, new dck(axh.i));
      }

      public czw.a a(alj<dag> $$0) {
         return this.a(kl.ae, new daf(new czb<>($$0)));
      }

      public czw.a c(int $$0) {
         return this.a(kl.C, new dgl($$0));
      }

      public czw.a c(czw $$0) {
         return this.a(kl.E, new dgv(jk.a($$0.e())));
      }

      public czw.a a(axv<czw> $$0) {
         jh<czw> $$1 = mh.a(mh.g);
         return this.a(kl.E, new dgv($$1.b($$0)));
      }

      public czw.a a(bxf $$0) {
         return this.a(kl.D, dij.a($$0).a());
      }

      public czw.a b(bxf $$0) {
         return this.a(kl.D, dij.a($$0).b(false).a());
      }

      public czw.a a(dbo $$0, axv<dne> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public czw.a a(dbo $$0, float $$1, float $$2) {
         return this.a($$0, axg.bF, $$1, $$2, 0.0F);
      }

      public czw.a b(dbo $$0, float $$1, float $$2) {
         return this.a($$0, axg.bD, $$1, $$2, 5.0F);
      }

      public czw.a c(dbo $$0, float $$1, float $$2) {
         return this.a($$0, axg.bE, $$1, $$2, 0.0F);
      }

      public czw.a d(dbo $$0, float $$1, float $$2) {
         return this.a($$0, axg.bG, $$1, $$2, 0.0F);
      }

      public czw.a e(dbo $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public czw.a a(die $$0, dig $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kl.D, dij.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public czw.a a(die $$0) {
         return this.b(dig.e.a($$0.a())).a($$0.a(dig.e)).a($$0.g()).a(kl.D, dij.a(bxf.g).a($$0.d()).a($$0.h()).a(jk.a(bxe.bN.r())).a()).a(kl.au, awr.DM).a(1);
      }

      public czw.a b(die $$0) {
         jh<bxe<?>> $$1 = mh.a(mh.f);
         return this.a($$0.a(dig.e)).a(kl.D, dij.a(bxf.g).a(awr.nk).a($$0.h()).a($$1.b(axj.K)).c(false).a()).a(1);
      }

      public czw.a b(alj<din> $$0) {
         return this.a(kl.ac, new dcz($$0));
      }

      public czw.a a(cvh... $$0) {
         this.e = cvl.e.a($$0);
         return this;
      }

      public czw.a c(alj<czw> $$0) {
         this.f = $$0;
         return this;
      }

      public czw.a a(String $$0) {
         this.g = alc.fixed($$0);
         return this;
      }

      public czw.a b() {
         this.g = a;
         return this;
      }

      public czw.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public alk e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> czw.a a(kk<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public czw.a a(dcr $$0) {
         return this.a(kl.o, $$0);
      }

      ki a(xc $$0, alk $$1) {
         ki $$2 = this.c.a(kl.h, $$0).a(kl.i, $$1).a();
         if ($$2.c(kl.e) && $$2.a(kl.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      czw.b a = new czw.b() {
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
         public ezl a(ezj $$0) {
            return null;
         }
      };

      @Nullable
      ji.a a();

      float b();

      @Nullable
      ezl a(ezj var1);

      static czw.b a(@Nullable final djz $$0) {
         return $$0 == null ? a : new czw.b() {
            @Override
            public ji.a a() {
               return $$0.J_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public ezl a(ezj $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static czw.b a(final ji.a $$0) {
         return new czw.b() {
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
            public ezl a(ezj $$0x) {
               return null;
            }
         };
      }
   }
}
