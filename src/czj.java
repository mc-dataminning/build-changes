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

public class czj implements cut, djl {
   public static final Codec<jf<czj>> e = mg.g
      .r()
      .validate($$0 -> $$0.a(czr.a.e()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   public static final yw<wj, jf<czj>> f = yu.b(mh.K);
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dmr, czj> g = Maps.newHashMap();
   public static final alg h = alg.b("base_attack_damage");
   public static final alg i = alg.b("base_attack_speed");
   public static final int j = 64;
   public static final int k = 99;
   public static final int l = 13;
   protected static final int m = 72000;
   private final jf.c<czj> b = mg.g.f(this);
   private final kh c;
   @Nullable
   private final czj d;
   protected final String n;
   private final cuw o;

   public static int a(czj $$0) {
      return $$0 == null ? 0 : mg.g.a($$0);
   }

   public static czj b(int $$0) {
      return mg.g.a($$0);
   }

   @Deprecated
   public static czj a(dmr $$0) {
      return g.getOrDefault($$0, czr.a);
   }

   public czj(czj.a $$0) {
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
   public jf.c<czj> e() {
      return this.b;
   }

   public kh f() {
      return this.c;
   }

   public int g() {
      return this.c.a(kk.c, 1);
   }

   public void a(djm $$0, bxj $$1, czn $$2, int $$3) {
   }

   public void a(cnr $$0) {
   }

   public void l(czn $$0) {
   }

   public boolean a(czn $$0, eat $$1, djm $$2, iv $$3, bxj $$4) {
      dcq $$5 = $$0.a(kk.A);
      if ($$5 != null && !$$5.d()) {
         if ($$4 instanceof crm $$6 && $$6.gj().d) {
            return false;
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public czj h() {
      return this;
   }

   public bug a(ddi $$0) {
      return bug.e;
   }

   public float a(czn $$0, eat $$1) {
      dcq $$2 = $$0.a(kk.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      dbs $$4 = $$3.a(kk.w);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dhw $$5 = $$3.a(kk.D);
         if ($$5 != null && $$5.h()) {
            return $$5.a($$3, $$1);
         } else {
            dbo $$6 = $$3.a(kk.I);
            if ($$6 != null) {
               $$1.c($$2);
               return bug.c;
            } else {
               return bug.e;
            }
         }
      }
   }

   public czn a(czn $$0, djm $$1, bxj $$2) {
      dbs $$3 = $$0.a(kk.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(czn $$0) {
      return $$0.n();
   }

   public int e(czn $$0) {
      return azm.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(czn $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azm.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(czn $$0, cxc $$1, cvp $$2, crm $$3) {
      return false;
   }

   public boolean a(czn $$0, czn $$1, cxc $$2, cvp $$3, crm $$4, bya $$5) {
      return false;
   }

   public float a(bwi $$0, float $$1, bux $$2) {
      return 0.0F;
   }

   @Nullable
   public bux a(bxj $$0) {
      return null;
   }

   public void a(czn $$0, bxj $$1, bxj $$2) {
   }

   public void b(czn $$0, bxj $$1, bxj $$2) {
   }

   public boolean a(czn $$0, djm $$1, eat $$2, iv $$3, bxj $$4) {
      dcq $$5 = $$0.a(kk.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bws.a);
         }

         return true;
      }
   }

   public boolean b(czn $$0, eat $$1) {
      dcq $$2 = $$0.a(kk.A);
      return $$2 != null && $$2.b($$1);
   }

   public bug a(czn $$0, crm $$1, bxj $$2, buf $$3) {
      return bug.e;
   }

   @Override
   public String toString() {
      return mg.g.e(this).g();
   }

   public final czn i() {
      return this.d == null ? czn.k : new czn(this.d);
   }

   public void a(czn $$0, arq $$1, bwi $$2, @Nullable bws $$3) {
   }

   public void a(czn $$0, djm $$1, crm $$2) {
      this.a($$0, $$1);
   }

   public void a(czn $$0, djm $$1) {
   }

   public czp b(czn $$0) {
      dbs $$1 = $$0.a(kk.w);
      if ($$1 != null) {
         return $$1.d();
      } else {
         dbo $$2 = $$0.a(kk.I);
         return $$2 != null ? czp.d : czp.a;
      }
   }

   public int a(czn $$0, bxj $$1) {
      dbs $$2 = $$0.a(kk.w);
      if ($$2 != null) {
         return $$2.a();
      } else {
         dbo $$3 = $$0.a(kk.I);
         return $$3 != null ? 72000 : 0;
      }
   }

   public boolean a(czn $$0, djm $$1, bxj $$2, int $$3) {
      return false;
   }

   @Deprecated
   public void a(czn $$0, czj.b $$1, dcr $$2, Consumer<wy> $$3, dbc $$4) {
   }

   public Optional<cxm> k(czn $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String j() {
      return this.n;
   }

   public final wy l() {
      return this.c.a(kk.h, wx.a);
   }

   public wy a(czn $$0) {
      return $$0.a().a(kk.h, wx.a);
   }

   public boolean d_(czn $$0) {
      return $$0.F();
   }

   protected static fey a(djm $$0, crm $$1, dit.b $$2) {
      ffc $$3 = $$1.bC();
      ffc $$4 = $$3.e($$1.d($$1.dM(), $$1.dK()).c($$1.gK()));
      return $$0.a(new dit($$3, $$4, dit.a.b, $$2, $$1));
   }

   public boolean e_(czn $$0) {
      return false;
   }

   public czn m() {
      return new czn(this);
   }

   public boolean d() {
      return true;
   }

   @Override
   public cuw k() {
      return this.o;
   }

   public boolean a(czn $$0, @Nullable crm $$1) {
      return false;
   }

   public static class a {
      private static final aky<czj, String> a = $$0 -> ag.a("block", $$0.a());
      private static final aky<czj, String> b = $$0 -> ag.a("item", $$0.a());
      private final kh.a c = kh.a().a(kk.aT);
      @Nullable
      czj d;
      cuw e = cuy.g;
      @Nullable
      private alf<czj> f;
      private aky<czj, String> g = b;
      private aky<czj, alg> h = alf::a;

      public czj.a a(cvc $$0) {
         return this.a($$0, dbu.a);
      }

      public czj.a a(cvc $$0, dbs $$1) {
         return this.a(kk.v, $$0).a(kk.w, $$1);
      }

      public czj.a a(czj $$0) {
         return this.a(kk.x, new dcu(new czn($$0)));
      }

      public czj.a a(float $$0) {
         return this.a(kk.y, new dct($$0));
      }

      public czj.a a(int $$0) {
         return this.a(kk.c, $$0);
      }

      public czj.a b(int $$0) {
         this.a(kk.d, $$0);
         this.a(kk.c, 1);
         this.a(kk.e, 0);
         return this;
      }

      public czj.a b(czj $$0) {
         this.d = $$0;
         return this;
      }

      public czj.a a(daj $$0) {
         return this.a(kk.k, $$0);
      }

      public czj.a a() {
         return this.a(kk.z, new dbx(axd.i));
      }

      public czj.a a(alf<czt> $$0) {
         return this.a(kk.ae, new czs(new cyo<>($$0)));
      }

      public czj.a c(int $$0) {
         return this.a(kk.C, new dfy($$0));
      }

      public czj.a c(czj $$0) {
         return this.a(kk.E, new dgi(jj.a($$0.e())));
      }

      public czj.a a(axr<czj> $$0) {
         jg<czj> $$1 = mg.a(mg.g);
         return this.a(kk.E, new dgi($$1.b($$0)));
      }

      public czj.a a(bws $$0) {
         return this.a(kk.D, dhw.a($$0).a());
      }

      public czj.a b(bws $$0) {
         return this.a(kk.D, dhw.a($$0).b(false).a());
      }

      public czj.a a(dbb $$0, axr<dmr> $$1, float $$2, float $$3, float $$4) {
         return $$0.a(this, $$1, $$2, $$3, $$4);
      }

      public czj.a a(dbb $$0, float $$1, float $$2) {
         return this.a($$0, axc.bF, $$1, $$2, 0.0F);
      }

      public czj.a b(dbb $$0, float $$1, float $$2) {
         return this.a($$0, axc.bD, $$1, $$2, 5.0F);
      }

      public czj.a c(dbb $$0, float $$1, float $$2) {
         return this.a($$0, axc.bE, $$1, $$2, 0.0F);
      }

      public czj.a d(dbb $$0, float $$1, float $$2) {
         return this.a($$0, axc.bG, $$1, $$2, 0.0F);
      }

      public czj.a e(dbb $$0, float $$1, float $$2) {
         return $$0.a(this, $$1, $$2);
      }

      public czj.a a(dhr $$0, dht $$1) {
         return this.b($$1.a($$0.a())).a($$0.a($$1)).c($$0.c()).a(kk.D, dhw.a($$1.a()).a($$0.d()).a($$0.h()).a()).a($$0.g());
      }

      public czj.a a(dhr $$0) {
         return this.b(dht.e.a($$0.a())).a($$0.a(dht.e)).a($$0.g()).a(kk.D, dhw.a(bws.g).a($$0.d()).a($$0.h()).a(jj.a(bwr.bM.r())).a()).a(kk.au, awn.DM).a(1);
      }

      public czj.a b(dhr $$0) {
         jg<bwr<?>> $$1 = mg.a(mg.f);
         return this.a($$0.a(dht.e)).a(kk.D, dhw.a(bws.g).a(awn.nk).a($$0.h()).a($$1.b(axf.K)).c(false).a()).a(1);
      }

      public czj.a b(alf<dia> $$0) {
         return this.a(kk.ac, new dcm($$0));
      }

      public czj.a a(cuu... $$0) {
         this.e = cuy.e.a($$0);
         return this;
      }

      public czj.a c(alf<czj> $$0) {
         this.f = $$0;
         return this;
      }

      public czj.a a(String $$0) {
         this.g = aky.fixed($$0);
         return this;
      }

      public czj.a b() {
         this.g = a;
         return this;
      }

      public czj.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public alg e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> czj.a a(kj<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public czj.a a(dce $$0) {
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
      czj.b a = new czj.b() {
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
         public eyv a(eyt $$0) {
            return null;
         }
      };

      @Nullable
      jh.a a();

      float b();

      @Nullable
      eyv a(eyt var1);

      static czj.b a(@Nullable final djm $$0) {
         return $$0 == null ? a : new czj.b() {
            @Override
            public jh.a a() {
               return $$0.F_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public eyv a(eyt $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static czj.b a(final jh.a $$0) {
         return new czj.b() {
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
            public eyv a(eyt $$0x) {
               return null;
            }
         };
      }
   }
}
