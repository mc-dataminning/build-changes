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

public class cwm implements crr, dgi {
   public static final Codec<jr<cwm>> e = mb.g
      .r()
      .validate($$0 -> $$0.a(cwu.a.f()) ? DataResult.error(() -> "Item must not be minecraft:air") : DataResult.success($$0));
   private static final Logger a = LogUtils.getLogger();
   public static final Map<djn, cwm> f = Maps.newHashMap();
   public static final akv g = akv.b("base_attack_damage");
   public static final akv h = akv.b("base_attack_speed");
   public static final int i = 64;
   public static final int j = 99;
   public static final int k = 13;
   private final jr.c<cwm> b = mb.g.f(this);
   private final kr c;
   @Nullable
   private final cwm d;
   protected final String l;
   private final cru m;

   public static int a(cwm $$0) {
      return $$0 == null ? 0 : mb.g.a($$0);
   }

   public static cwm b(int $$0) {
      return mb.g.a($$0);
   }

   @Deprecated
   public static cwm a(djn $$0) {
      return f.getOrDefault($$0, cwu.a);
   }

   public cwm(cwm.a $$0) {
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
   public jr.c<cwm> f() {
      return this.b;
   }

   public kr g() {
      return this.c;
   }

   public int h() {
      return this.c.a(kv.c, 1);
   }

   public void a(dgj $$0, bvi $$1, cwq $$2, int $$3) {
   }

   public void a(cld $$0) {
   }

   public void l(cwq $$0) {
   }

   public boolean a(dwy $$0, dgj $$1, ji $$2, coy $$3) {
      return true;
   }

   @Override
   public cwm j() {
      return this;
   }

   public bsl a(daj $$0) {
      return bsl.e;
   }

   public float a(cwq $$0, dwy $$1) {
      czs $$2 = $$0.a(kv.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      cyw $$4 = $$3.a(kv.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         dev $$5 = $$3.a(kv.D);
         return (bsl)($$5 != null && $$5.g() ? $$5.a($$3, $$1) : bsl.e);
      }
   }

   public cwq a(cwq $$0, dgj $$1, bvi $$2) {
      cyw $$3 = $$0.a(kv.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cwq $$0) {
      return $$0.n();
   }

   public int e(cwq $$0) {
      return ayz.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cwq $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return ayz.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cwq $$0, cua $$1, csn $$2, coy $$3) {
      return false;
   }

   public boolean a(cwq $$0, cwq $$1, cua $$2, csn $$3, coy $$4, bwa $$5) {
      return false;
   }

   public float a(bum $$0, float $$1, btc $$2) {
      return 0.0F;
   }

   @Nullable
   public btc a(bvi $$0) {
      return null;
   }

   public boolean a(cwq $$0, bvi $$1, bvi $$2) {
      return false;
   }

   public void b(cwq $$0, bvi $$1, bvi $$2) {
   }

   public boolean a(cwq $$0, dgj $$1, dwy $$2, ji $$3, bvi $$4) {
      czs $$5 = $$0.a(kv.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, buu.a);
         }

         return true;
      }
   }

   public boolean b(cwq $$0, dwy $$1) {
      czs $$2 = $$0.a(kv.B);
      return $$2 != null && $$2.b($$1);
   }

   public bsl a(cwq $$0, coy $$1, bvi $$2, bsk $$3) {
      return bsl.e;
   }

   @Override
   public String toString() {
      return mb.g.e(this).g();
   }

   public final cwq k() {
      return this.d == null ? cwq.j : new cwq(this.d);
   }

   public void a(cwq $$0, dgj $$1, bum $$2, int $$3, boolean $$4) {
   }

   public void a(cwq $$0, dgj $$1, coy $$2) {
      this.a($$0, $$1);
   }

   public void a(cwq $$0, dgj $$1) {
   }

   public cws b(cwq $$0) {
      cyw $$1 = $$0.a(kv.x);
      return $$1 != null ? $$1.d() : cws.a;
   }

   public int a(cwq $$0, bvi $$1) {
      cyw $$2 = $$0.a(kv.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cwq $$0, dgj $$1, bvi $$2, int $$3) {
      return false;
   }

   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
   }

   public Optional<cuk> k(cwq $$0) {
      return Optional.empty();
   }

   @VisibleForTesting
   public final String l() {
      return this.l;
   }

   public final wp m() {
      return this.c.a(kv.h, wo.a);
   }

   public wp a(cwq $$0) {
      return $$0.a().a(kv.h, wo.a);
   }

   public boolean c_(cwq $$0) {
      return $$0.F();
   }

   protected static fax a(dgj $$0, coy $$1, dfr.b $$2) {
      fbb $$3 = $$1.bF();
      fbb $$4 = $$3.e($$1.d($$1.dN(), $$1.dL()).c($$1.gL()));
      return $$0.a(new dfr($$3, $$4, dfr.a.b, $$2, $$1));
   }

   public boolean d_(cwq $$0) {
      return false;
   }

   public cwq n() {
      return new cwq(this);
   }

   public avz a() {
      return awa.nZ;
   }

   public boolean e() {
      return true;
   }

   @Override
   public cru i() {
      return this.m;
   }

   public boolean a(cwq $$0, @Nullable coy $$1) {
      return false;
   }

   public static class a {
      private static final akn<cwm, String> a = $$0 -> af.a("block", $$0.a());
      private static final akn<cwm, String> b = $$0 -> af.a("item", $$0.a());
      private final kr.a c = kr.a().a(kv.aq);
      @Nullable
      cwm d;
      cru e = crw.g;
      @Nullable
      private aku<cwm> f;
      private akn<cwm, String> g = b;
      private akn<cwm, akv> h = aku::a;

      public cwm.a a(csa $$0) {
         return this.a($$0, cyy.a);
      }

      public cwm.a a(csa $$0, cyw $$1) {
         return this.a(kv.w, $$0).a(kv.x, $$1);
      }

      public cwm.a a(cwm $$0) {
         return this.a(kv.y, new czw(new cwq($$0)));
      }

      public cwm.a a(float $$0) {
         return this.a(kv.z, new czv($$0));
      }

      public cwm.a a(int $$0) {
         return this.a(kv.c, $$0);
      }

      public cwm.a b(int $$0) {
         this.a(kv.d, $$0);
         this.a(kv.c, 1);
         this.a(kv.e, 0);
         return this;
      }

      public cwm.a b(cwm $$0) {
         this.d = $$0;
         return this;
      }

      public cwm.a a(cxn $$0) {
         return this.a(kv.k, $$0);
      }

      public cwm.a a() {
         return this.a(kv.A, new czb(awr.i));
      }

      public cwm.a a(aku<cww> $$0) {
         return this.a(kv.ab, new cwv(new cvq<>($$0), true));
      }

      public cwm.a c(int $$0) {
         return this.a(kv.C, new dcy($$0));
      }

      public cwm.a c(cwm $$0) {
         return this.a(kv.E, new ddi(jv.a($$0.f())));
      }

      public cwm.a a(axf<cwm> $$0) {
         js<cwm> $$1 = mb.a(mb.g);
         return this.a(kv.E, new ddi($$1.b($$0)));
      }

      public cwm.a a(buu $$0) {
         return this.a(kv.D, dev.a($$0).a());
      }

      public cwm.a b(buu $$0) {
         return this.a(kv.D, dev.a($$0).b(false).a());
      }

      public cwm.a a(crs... $$0) {
         this.e = crw.e.a($$0);
         return this;
      }

      public cwm.a b(aku<cwm> $$0) {
         this.f = $$0;
         return this;
      }

      public cwm.a a(String $$0) {
         this.g = akn.fixed($$0);
         return this;
      }

      public cwm.a b() {
         this.g = a;
         return this;
      }

      public cwm.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public akv e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cwm.a a(ku<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cwm.a a(czh $$0) {
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
      cwm.b a = new cwm.b() {
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
         public euu a(eus $$0) {
            return null;
         }
      };

      @Nullable
      jt.a a();

      float b();

      @Nullable
      euu a(eus var1);

      static cwm.b a(@Nullable final dgj $$0) {
         return $$0 == null ? a : new cwm.b() {
            @Override
            public jt.a a() {
               return $$0.K_();
            }

            @Override
            public float b() {
               return $$0.u().f();
            }

            @Override
            public euu a(eus $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cwm.b a(final jt.a $$0) {
         return new cwm.b() {
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
            public euu a(eus $$0x) {
               return null;
            }
         };
      }
   }
}
