import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dww extends duq {
   private static final Logger a = LogUtils.getLogger();
   private final dwz b = new dwz();
   private final dxa c = new dxa();
   private final dwx d = new dwx();
   private dwy e = dwy.b;

   public dww(jh $$0, dxo $$1) {
      super(dus.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zr<acg> ay_() {
      return acn.a(this);
   }

   @Override
   public um a(js.a $$0) {
      return ae.a(new um(), $$1 -> $$1.a("shared_data", a(dxa.b, this.c, $$0)));
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dwy.c, this.e, $$1));
      $$0.a("shared_data", a(dxa.b, this.c, $$1));
      $$0.a("server_data", a(dwz.b, this.b, $$1));
   }

   private static <T> vj a(Codec<T> $$0, T $$1, js.a $$2) {
      return (vj)$$0.encodeStart($$2.a(va.a), $$1).getOrThrow();
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vj> $$2 = $$1.a(va.a);
      if ($$0.e("server_data")) {
         dwz.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dwy.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dxa.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dwz b() {
      return this.o != null && !this.o.C ? this.b : null;
   }

   public dxa c() {
      return this.c;
   }

   public dwx d() {
      return this.d;
   }

   public dwy f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dwy $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dgz $$0, jh $$1, dxo $$2, dwx $$3, dxa $$4) {
         $$3.c();
         if ($$0.ad() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dtd.d) ? ls.M : ls.aL);
         a($$0, $$1, $$4);
      }

      public static void a(dgz $$0, jh $$1, dxo $$2, dxa $$3, lq $$4) {
         a($$0, $$1, $$2, $$3);
         bac $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fbr $$7 = b($$1, $$5);
            $$0.a(ls.ag, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dgz $$0, jh $$1, lq $$2) {
         bac $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fbr $$5 = a($$1, $$3);
            fbr $$6 = new fbr($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dgz $$0, jh $$1, dxa $$2, lq $$3) {
         bac $$4 = $$0.H_();
         if ($$4.i() <= 0.5F) {
            fbr $$5 = b($$1, $$4);
            $$0.a(ls.ag, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dgz $$0, fbr $$1, cpo $$2) {
         bac $$3 = $$0.A;
         fbr $$4 = $$1.a($$2.du().b(0.0, (double)($$2.ds() / 2.0F), 0.0));
         int $$5 = azu.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fbr $$7 = $$4.a($$3, 1.0F);
            $$0.a(ls.bc, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dgz $$0, jh $$1, dxo $$2, dxa $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fbr $$5 = a($$1, $$2.c(dtd.c));

            for (UUID $$6 : $$4) {
               cpo $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jh $$0, dxa $$1, cpo $$2) {
         return $$2.dw().j($$0) <= azu.k($$1.e());
      }

      private static void a(dgz $$0, jh $$1, dxa $$2) {
         if (a($$2)) {
            bac $$3 = $$0.H_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awv.Bq, aww.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dxa $$0) {
         return $$0.b();
      }

      private static fbr a(jh $$0, bac $$1) {
         return fbr.a($$0).b(azu.a($$1, 0.4, 0.6), azu.a($$1, 0.4, 0.6), azu.a($$1, 0.4, 0.6));
      }

      private static fbr b(jh $$0, bac $$1) {
         return fbr.a($$0).b(azu.a($$1, 0.1, 0.9), azu.a($$1, 0.25, 0.75), azu.a($$1, 0.1, 0.9));
      }

      private static fbr a(jh $$0, jm $$1) {
         return fbr.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arx $$0, jh $$1, dxo $$2, dwy $$3, dwz $$4, dxa $$5) {
         dxb $$6 = $$2.c(dtd.b);
         if (a($$0.ad(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dxo $$7 = $$2;
         if ($$0.ad() >= $$4.c()) {
            $$7 = $$2.b(dtd.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dww.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arx $$0, jh $$1, dxo $$2, dwy $$3, dwz $$4, dxa $$5, cpo $$6, cxg $$7) {
         dxb $$8 = $$2.c(dtd.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awv.Bz);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awv.Bv);
            } else {
               List<cxg> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(axf.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bvx)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arx $$0, jh $$1, dxo $$2, dxo $$3, dwy $$4, dxa $$5) {
         dxb $$6 = $$2.c(dtd.b);
         dxb $$7 = $$3.c(dtd.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dtd.d));
      }

      static void a(arx $$0, dxb $$1, dwy $$2, dxa $$3, jh $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cxg.j);
         } else {
            cxg $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cxg a(arx $$0, jh $$1, alo<ewn> $$2) {
         ewn $$3 = $$0.p().bc().b($$2);
         ewl $$4 = new ewl.a($$0).a(ezc.f, fbr.b($$1)).a(ezb.l);
         List<cxg> $$5 = $$3.a($$4, $$0.H_());
         return $$5.isEmpty() ? cxg.j : ae.a($$5, $$0.H_());
      }

      private static void a(arx $$0, dxo $$1, jh $$2, dwy $$3, dwz $$4, dxa $$5, List<cxg> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ad() + 14L);
         a($$0, $$2, $$1, $$1.b(dtd.b, dxb.c), $$3, $$5);
      }

      private static List<cxg> a(arx $$0, dwy $$1, jh $$2, cpo $$3, cxg $$4) {
         ewn $$5 = $$0.p().bc().b($$1.b());
         ewl $$6 = new ewl.a($$0).a(ezc.f, fbr.b($$2)).a($$3.gF()).a(ezc.a, $$3).a(ezc.i, $$4).a(ezb.l);
         return $$5.a($$6);
      }

      private static boolean a(dwy $$0, dxb $$1) {
         return !$$0.e().f() && $$1 != dxb.a;
      }

      private static boolean a(dwy $$0, cxg $$1) {
         return cxg.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dxb $$1) {
         return $$0 % 20L == 0L && $$1 == dxb.b;
      }

      private static void a(arx $$0, dwz $$1, jh $$2, awu $$3) {
         if ($$0.ad() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, aww.e);
            $$1.a($$0.ad());
         }
      }
   }
}
