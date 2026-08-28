import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cwb implements crg, dfe {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dij, cwb> e = Maps.newHashMap();
   public static final all f = all.b("base_attack_damage");
   public static final all g = all.b("base_attack_speed");
   public static final int h = 64;
   public static final int i = 99;
   public static final int j = 13;
   private final jq.c<cwb> b = lz.g.f(this);
   private final kq c;
   @Nullable
   private final cwb d;
   protected final String k;
   private final crj l;

   public static int a(cwb $$0) {
      return $$0 == null ? 0 : lz.g.a($$0);
   }

   public static cwb b(int $$0) {
      return lz.g.a($$0);
   }

   @Deprecated
   public static cwb a(dij $$0) {
      return e.getOrDefault($$0, cwj.a);
   }

   public cwb(cwb.a $$0) {
      this.k = $$0.d();
      this.c = $$0.a(xl.c(this.k), $$0.e());
      this.d = $$0.d;
      this.l = $$0.e;
      if (ab.aV) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jq.c<cwb> f() {
      return this.b;
   }

   public kq g() {
      return this.c;
   }

   public int h() {
      return this.c.a(ku.c, 1);
   }

   public void a(dff $$0, bve $$1, cwf $$2, int $$3) {
   }

   public void a(ckz $$0) {
   }

   public void l(cwf $$0) {
   }

   public boolean a(dvo $$0, dff $$1, jh $$2, cor $$3) {
      return true;
   }

   @Override
   public cwb j() {
      return this;
   }

   public bsh a(czy $$0) {
      return bsh.e;
   }

   public float a(cwf $$0, dvo $$1) {
      czh $$2 = $$0.a(ku.B);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      cyl $$4 = $$3.a(ku.x);
      if ($$4 != null) {
         return $$4.a($$1, $$3, $$2);
      } else {
         ddr $$5 = $$3.a(ku.D);
         return (bsh)($$5 != null && $$5.f() ? $$5.a($$3, $$1) : bsh.e);
      }
   }

   public cwf a(cwf $$0, dff $$1, bve $$2) {
      cyl $$3 = $$0.a(ku.x);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean d(cwf $$0) {
      return $$0.n();
   }

   public int e(cwf $$0) {
      return azn.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int f(cwf $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azn.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cwf $$0, ctp $$1, csc $$2, cor $$3) {
      return false;
   }

   public boolean a(cwf $$0, cwf $$1, ctp $$2, csc $$3, cor $$4, bvw $$5) {
      return false;
   }

   public float a(bui $$0, float $$1, bsy $$2) {
      return 0.0F;
   }

   @Nullable
   public bsy a(bve $$0) {
      return null;
   }

   public boolean a(cwf $$0, bve $$1, bve $$2) {
      return false;
   }

   public void b(cwf $$0, bve $$1, bve $$2) {
   }

   public boolean a(cwf $$0, dff $$1, dvo $$2, jh $$3, bve $$4) {
      czh $$5 = $$0.a(ku.B);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.C && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, buq.a);
         }

         return true;
      }
   }

   public boolean b(cwf $$0, dvo $$1) {
      czh $$2 = $$0.a(ku.B);
      return $$2 != null && $$2.b($$1);
   }

   public bsh a(cwf $$0, cor $$1, bve $$2, bsg $$3) {
      return bsh.e;
   }

   @Override
   public String toString() {
      return lz.g.e(this).g();
   }

   @Nullable
   public final cwb k() {
      return this.d;
   }

   public boolean l() {
      return this.d != null;
   }

   public void a(cwf $$0, dff $$1, bui $$2, int $$3, boolean $$4) {
   }

   public void a(cwf $$0, dff $$1, cor $$2) {
      this.a($$0, $$1);
   }

   public void a(cwf $$0, dff $$1) {
   }

   public cwh b(cwf $$0) {
      cyl $$1 = $$0.a(ku.x);
      return $$1 != null ? $$1.d() : cwh.a;
   }

   public int a(cwf $$0, bve $$1) {
      cyl $$2 = $$0.a(ku.x);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cwf $$0, dff $$1, bve $$2, int $$3) {
      return false;
   }

   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
   }

   public Optional<ctz> k(cwf $$0) {
      return Optional.empty();
   }

   public final String m() {
      return this.k;
   }

   public final xl n() {
      return this.c.a(ku.h, xk.a);
   }

   public xl a(cwf $$0) {
      return $$0.a().a(ku.h, xk.a);
   }

   public boolean c_(cwf $$0) {
      return $$0.E();
   }

   protected static ezn a(dff $$0, cor $$1, den.b $$2) {
      ezr $$3 = $$1.bH();
      ezr $$4 = $$3.e($$1.c($$1.dQ(), $$1.dO()).c($$1.gM()));
      return $$0.a(new den($$3, $$4, den.a.b, $$2, $$1));
   }

   public boolean d_(cwf $$0) {
      return false;
   }

   public cwf o() {
      return new cwf(this);
   }

   public awn a() {
      return awo.nA;
   }

   public boolean e() {
      return true;
   }

   @Override
   public crj i() {
      return this.l;
   }

   public static class a {
      private static final ald<cwb, String> a = $$0 -> ae.a("block", $$0.a());
      private static final ald<cwb, String> b = $$0 -> ae.a("item", $$0.a());
      private final kq.a c = kq.a().a(ku.aq);
      @Nullable
      cwb d;
      crj e = crl.h;
      @Nullable
      private alk<cwb> f;
      private ald<cwb, String> g = b;
      private ald<cwb, all> h = alk::a;

      public cwb.a a(crp $$0) {
         return this.a($$0, cyn.a);
      }

      public cwb.a a(crp $$0, cyl $$1) {
         return this.a(ku.w, $$0).a(ku.x, $$1);
      }

      public cwb.a a(cwb $$0) {
         return this.a(ku.y, new czl(new cwf($$0)));
      }

      public cwb.a a(float $$0) {
         return this.a(ku.z, new czk($$0));
      }

      public cwb.a a(int $$0) {
         return this.a(ku.c, $$0);
      }

      public cwb.a b(int $$0) {
         this.a(ku.d, $$0);
         this.a(ku.c, 1);
         this.a(ku.e, 0);
         return this;
      }

      public cwb.a b(cwb $$0) {
         this.d = $$0;
         return this;
      }

      public cwb.a a(cxc $$0) {
         return this.a(ku.k, $$0);
      }

      public cwb.a a() {
         return this.a(ku.A, new cyq(axf.i));
      }

      public cwb.a a(alk<cwl> $$0) {
         return this.a(ku.ab, new cwk(new cvf<>($$0), true));
      }

      public cwb.a c(int $$0) {
         return this.a(ku.C, new dbu($$0));
      }

      public cwb.a c(cwb $$0) {
         return this.a(ku.E, new dce(ju.a($$0.f())));
      }

      public cwb.a a(axt<cwb> $$0) {
         jr<cwb> $$1 = lz.a(lz.g);
         return this.a(ku.E, new dce($$1.b($$0)));
      }

      public cwb.a a(buq $$0) {
         return this.a(ku.D, ddr.a($$0).a());
      }

      public cwb.a b(buq $$0) {
         return this.a(ku.D, ddr.a($$0).b(false).a());
      }

      public cwb.a a(crh... $$0) {
         this.e = crl.f.a($$0);
         return this;
      }

      public cwb.a b(alk<cwb> $$0) {
         this.f = $$0;
         return this;
      }

      public cwb.a a(String $$0) {
         this.g = ald.fixed($$0);
         return this;
      }

      public cwb.a b() {
         this.g = a;
         return this;
      }

      public cwb.a c() {
         this.g = b;
         return this;
      }

      protected String d() {
         return this.g.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public cwb.a a(all $$0) {
         this.h = ald.fixed($$0);
         return this;
      }

      public all e() {
         return this.h.get(Objects.requireNonNull(this.f, "Item id not set"));
      }

      public <T> cwb.a a(kt<T> $$0, T $$1) {
         this.c.a($$0, $$1);
         return this;
      }

      public cwb.a a(cyw $$0) {
         return this.a(ku.o, $$0);
      }

      kq a(xl $$0, all $$1) {
         kq $$2 = this.c.a(ku.h, $$0).a(ku.i, $$1).a();
         if ($$2.b(ku.e) && $$2.a(ku.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$2;
         }
      }
   }

   public interface b {
      cwb.b a = new cwb.b() {
         @Nullable
         @Override
         public js.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public eti a(etg $$0) {
            return null;
         }
      };

      @Nullable
      js.a a();

      float b();

      @Nullable
      eti a(etg var1);

      static cwb.b a(@Nullable final dff $$0) {
         return $$0 == null ? a : new cwb.b() {
            @Override
            public js.a a() {
               return $$0.H_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public eti a(etg $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cwb.b a(final js.a $$0) {
         return new cwb.b() {
            @Override
            public js.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public eti a(etg $$0x) {
               return null;
            }
         };
      }
   }
}
