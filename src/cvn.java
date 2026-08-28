import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cvn implements cqn, dei {
   private static final Logger a = LogUtils.getLogger();
   public static final Map<dhm, cvn> e = Maps.newHashMap();
   public static final ale f = ale.b("base_attack_damage");
   public static final ale g = ale.b("base_attack_speed");
   public static final int h = 64;
   public static final int i = 99;
   public static final int j = 13;
   private final jo.c<cvn> b = lv.g.f(this);
   private final ko c;
   @Nullable
   private final cvn d;
   @Nullable
   private String k;
   private final cqq l;

   public static int a(cvn $$0) {
      return $$0 == null ? 0 : lv.g.a($$0);
   }

   public static cvn b(int $$0) {
      return lv.g.a($$0);
   }

   @Deprecated
   public static cvn a(dhm $$0) {
      return e.getOrDefault($$0, cvw.a);
   }

   public cvn(cvn.a $$0) {
      this.c = $$0.b();
      this.d = $$0.c;
      this.l = $$0.d;
      if (ab.aW) {
         String $$1 = this.getClass().getSimpleName();
         if (!$$1.endsWith("Item")) {
            a.error("Item classes should end with Item and {} doesn't.", $$1);
         }
      }
   }

   @Deprecated
   public jo.c<cvn> n() {
      return this.b;
   }

   public ko o() {
      return this.c;
   }

   public int p() {
      return this.c.a(ks.c, 1);
   }

   public void a(dej $$0, bun $$1, cvs $$2, int $$3) {
   }

   public void a(ckh $$0) {
   }

   public void l(cvs $$0) {
   }

   public boolean a(dus $$0, dej $$1, jf $$2, cnx $$3) {
      return true;
   }

   @Override
   public cvn q() {
      return this;
   }

   public brs a(czp $$0) {
      return brs.e;
   }

   public float a(cvs $$0, dus $$1) {
      cyy $$2 = $$0.a(ks.A);
      return $$2 != null ? $$2.a($$1) : 1.0F;
   }

   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      cye $$4 = $$3.a(ks.w);
      return (brs)($$4 != null ? $$4.a($$1, $$3, $$2) : brs.e);
   }

   public cvs a(cvs $$0, dej $$1, bun $$2) {
      cye $$3 = $$0.a(ks.w);
      return $$3 != null ? $$3.a($$1, $$2, $$0) : $$0;
   }

   public boolean c(cvs $$0) {
      return $$0.n();
   }

   public int d(cvs $$0) {
      return azf.a(Math.round(13.0F - (float)$$0.o() * 13.0F / (float)$$0.p()), 0, 13);
   }

   public int e(cvs $$0) {
      int $$1 = $$0.p();
      float $$2 = Math.max(0.0F, ((float)$$1 - (float)$$0.o()) / (float)$$1);
      return azf.g($$2 / 3.0F, 1.0F, 1.0F);
   }

   public boolean a(cvs $$0, csw $$1, crj $$2, cnx $$3) {
      return false;
   }

   public boolean a(cvs $$0, cvs $$1, csw $$2, crj $$3, cnx $$4, bve $$5) {
      return false;
   }

   public float a(btr $$0, float $$1, bsj $$2) {
      return 0.0F;
   }

   public boolean a(cvs $$0, bun $$1, bun $$2) {
      return false;
   }

   public void b(cvs $$0, bun $$1, bun $$2) {
   }

   public boolean a(cvs $$0, dej $$1, dus $$2, jf $$3, bun $$4) {
      cyy $$5 = $$0.a(ks.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.B && $$2.e($$1, $$3) != 0.0F && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, btz.a);
         }

         return true;
      }
   }

   public boolean b(cvs $$0, dus $$1) {
      cyy $$2 = $$0.a(ks.A);
      return $$2 != null && $$2.b($$1);
   }

   public brs a(cvs $$0, cnx $$1, bun $$2, brr $$3) {
      return brs.e;
   }

   public xe r() {
      return xe.c(this.a());
   }

   @Override
   public String toString() {
      return lv.g.e(this).g();
   }

   protected String s() {
      if (this.k == null) {
         this.k = ad.a("item", lv.g.b(this));
      }

      return this.k;
   }

   public String a() {
      return this.s();
   }

   public String d_(cvs $$0) {
      return this.a();
   }

   @Nullable
   public final cvn t() {
      return this.d;
   }

   public boolean u() {
      return this.d != null;
   }

   public void a(cvs $$0, dej $$1, btr $$2, int $$3, boolean $$4) {
   }

   public void b(cvs $$0, dej $$1, cnx $$2) {
      this.a($$0, $$1);
   }

   public void a(cvs $$0, dej $$1) {
   }

   public boolean ao_() {
      return false;
   }

   public cvu a(cvs $$0) {
      cye $$1 = $$0.a(ks.w);
      return $$1 != null ? $$1.d() : cvu.a;
   }

   public int a(cvs $$0, bun $$1) {
      cye $$2 = $$0.a(ks.w);
      return $$2 != null ? $$2.a() : 0;
   }

   public boolean a(cvs $$0, dej $$1, bun $$2, int $$3) {
      return false;
   }

   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
   }

   public Optional<ctg> j(cvs $$0) {
      return Optional.empty();
   }

   public xe m(cvs $$0) {
      return xe.c(this.d_($$0));
   }

   public boolean e_(cvs $$0) {
      return $$0.D();
   }

   protected static eys a(dej $$0, cnx $$1, ddr.b $$2) {
      eyw $$3 = $$1.bC();
      eyw $$4 = $$3.e($$1.c($$1.dK(), $$1.dI()).c($$1.gD()));
      return $$0.a(new ddr($$3, $$4, ddr.a.b, $$2, $$1));
   }

   @Deprecated(
      forRemoval = true
   )
   public boolean a(cvs $$0, cvs $$1) {
      return false;
   }

   @Deprecated
   public cyn h() {
      return cyn.a;
   }

   public boolean k(cvs $$0) {
      return false;
   }

   public cvs v() {
      return new cvs(this);
   }

   public awf e() {
      return awg.nC;
   }

   public boolean ap_() {
      return true;
   }

   @Override
   public cqq i() {
      return this.l;
   }

   public static class a {
      private static final Interner<ko> a = Interners.newStrongInterner();
      @Nullable
      private ko.a b;
      @Nullable
      cvn c;
      cqq d = cqs.h;

      public cvn.a a(cqw $$0) {
         return this.a($$0, cyg.a);
      }

      public cvn.a a(cqw $$0, cye $$1) {
         return this.a(ks.v, $$0).a(ks.w, $$1);
      }

      public cvn.a a(cvn $$0) {
         return this.a(ks.x, new czc(new cvs($$0)));
      }

      public cvn.a a(float $$0) {
         return this.a(ks.y, new czb($$0));
      }

      public cvn.a a(int $$0) {
         return this.a(ks.c, $$0);
      }

      public cvn.a b(int $$0) {
         this.a(ks.d, $$0);
         this.a(ks.c, 1);
         this.a(ks.e, 0);
         return this;
      }

      public cvn.a b(cvn $$0) {
         this.c = $$0;
         return this;
      }

      public cvn.a a(cwp $$0) {
         return this.a(ks.j, $$0);
      }

      public cvn.a a() {
         return this.a(ks.z, bak.a);
      }

      public cvn.a a(ald<cvy> $$0) {
         return this.a(ks.W, new cvx(new cup<>($$0), true));
      }

      public cvn.a c(int $$0) {
         return this.a(ks.B, new dbl($$0));
      }

      public cvn.a c(cvn $$0) {
         return this.a(ks.C, new dbv(js.a($$0.n())));
      }

      public cvn.a a(axl<cvn> $$0) {
         jp<cvn> $$1 = lv.a(lv.g);
         return this.a(ks.C, new dbv($$1.b($$0)));
      }

      public cvn.a a(cqo... $$0) {
         this.d = cqs.f.a($$0);
         return this;
      }

      public <T> cvn.a a(kr<T> $$0, T $$1) {
         if (this.b == null) {
            this.b = ko.a().a(ks.al);
         }

         this.b.a($$0, $$1);
         return this;
      }

      public cvn.a a(cyn $$0) {
         return this.a(ks.n, $$0);
      }

      ko b() {
         ko $$0 = this.c();
         if ($$0.b(ks.e) && $$0.a(ks.c, 1) > 1) {
            throw new IllegalStateException("Item cannot have both durability and be stackable");
         } else {
            return $$0;
         }
      }

      private ko c() {
         return this.b == null ? ks.al : (ko)a.intern(this.b.a());
      }
   }

   public interface b {
      cvn.b a = new cvn.b() {
         @Nullable
         @Override
         public jq.a a() {
            return null;
         }

         @Override
         public float b() {
            return 20.0F;
         }

         @Nullable
         @Override
         public esn a(esl $$0) {
            return null;
         }
      };

      @Nullable
      jq.a a();

      float b();

      @Nullable
      esn a(esl var1);

      static cvn.b a(@Nullable final dej $$0) {
         return $$0 == null ? a : new cvn.b() {
            @Override
            public jq.a a() {
               return $$0.G_();
            }

            @Override
            public float b() {
               return $$0.s().f();
            }

            @Override
            public esn a(esl $$0x) {
               return $$0.a($$0);
            }
         };
      }

      static cvn.b a(final jq.a $$0) {
         return new cvn.b() {
            @Override
            public jq.a a() {
               return $$0;
            }

            @Override
            public float b() {
               return 20.0F;
            }

            @Nullable
            @Override
            public esn a(esl $$0x) {
               return null;
            }
         };
      }
   }
}
