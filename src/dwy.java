import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwy extends dus {
   private static final Logger a = LogUtils.getLogger();
   private final dxb b = new dxb();
   private final dxc c = new dxc();
   private final dwz d = new dwz();
   private dxa e = dxa.b;

   public dwy(ji $$0, dxq $$1) {
      super(duu.S, $$0, $$1);
   }

   @Nullable
   @Override
   public yw<abl> ax_() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return af.a(new tq(), $$1 -> $$1.a("shared_data", a(dxc.b, this.c, $$0)));
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dxa.c, this.e, $$1));
      $$0.a("shared_data", a(dxc.b, this.c, $$1));
      $$0.a("server_data", a(dxb.b, this.b, $$1));
   }

   private static <T> un a(Codec<T> $$0, T $$1, jt.a $$2) {
      return (un)$$0.encodeStart($$2.a(ue.a), $$1).getOrThrow();
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      DynamicOps<un> $$2 = $$1.a(ue.a);
      if ($$0.e("server_data")) {
         dxb.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dxa.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dxc.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dxb b() {
      return this.n != null && !this.n.C ? this.b : null;
   }

   public dxc c() {
      return this.c;
   }

   public dwz d() {
      return this.d;
   }

   public dxa f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dxa $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dgz $$0, ji $$1, dxq $$2, dwz $$3, dxc $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dtf.d) ? lt.N : lt.aM);
         a($$0, $$1, $$4);
      }

      public static void a(dgz $$0, ji $$1, dxq $$2, dxc $$3, lr $$4) {
         a($$0, $$1, $$2, $$3);
         azh $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fbx $$7 = b($$1, $$5);
            $$0.a(lt.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dgz $$0, ji $$1, lr $$2) {
         azh $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fbx $$5 = a($$1, $$3);
            fbx $$6 = new fbx($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dgz $$0, ji $$1, dxc $$2, lr $$3) {
         azh $$4 = $$0.C_();
         if ($$4.i() <= 0.5F) {
            fbx $$5 = b($$1, $$4);
            $$0.a(lt.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dgz $$0, fbx $$1, cpr $$2) {
         azh $$3 = $$0.A;
         fbx $$4 = $$1.a($$2.ds().b(0.0, (double)($$2.dq() / 2.0F), 0.0));
         int $$5 = ayz.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fbx $$7 = $$4.a($$3, 1.0F);
            $$0.a(lt.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dgz $$0, ji $$1, dxq $$2, dxc $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fbx $$5 = a($$1, $$2.c(dtf.c));

            for (UUID $$6 : $$4) {
               cpr $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ji $$0, dxc $$1, cpr $$2) {
         return $$2.du().j($$0) <= ayz.k($$1.e());
      }

      private static void a(dgz $$0, ji $$1, dxc $$2) {
         if (a($$2)) {
            azh $$3 = $$0.C_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awa.Bz, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dxc $$0) {
         return $$0.b();
      }

      private static fbx a(ji $$0, azh $$1) {
         return fbx.a($$0).b(ayz.a($$1, 0.4, 0.6), ayz.a($$1, 0.4, 0.6), ayz.a($$1, 0.4, 0.6));
      }

      private static fbx b(ji $$0, azh $$1) {
         return fbx.a($$0).b(ayz.a($$1, 0.1, 0.9), ayz.a($$1, 0.25, 0.75), ayz.a($$1, 0.1, 0.9));
      }

      private static fbx a(ji $$0, jn $$1) {
         return fbx.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(ard $$0, ji $$1, dxq $$2, dxa $$3, dxb $$4, dxc $$5) {
         dxd $$6 = $$2.c(dtf.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dxq $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dtf.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dwy.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(ard $$0, ji $$1, dxq $$2, dxa $$3, dxb $$4, dxc $$5, cpr $$6, cxh $$7) {
         dxd $$8 = $$2.c(dtf.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awa.BI);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awa.BE);
            } else {
               List<cxh> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awk.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bvy)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(ard $$0, ji $$1, dxq $$2, dxq $$3, dxa $$4, dxc $$5) {
         dxd $$6 = $$2.c(dtf.b);
         dxd $$7 = $$3.c(dtf.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dtf.d));
      }

      static void a(ard $$0, dxd $$1, dxa $$2, dxc $$3, ji $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cxh.k);
         } else {
            cxh $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cxh a(ard $$0, ji $$1, akt<ewt> $$2) {
         ewt $$3 = $$0.p().bc().b($$2);
         ewr $$4 = new ewr.a($$0).a(ezi.f, fbx.b($$1)).a(ezh.l);
         List<cxh> $$5 = $$3.a($$4, $$0.C_());
         return $$5.isEmpty() ? cxh.k : af.a($$5, $$0.C_());
      }

      private static void a(ard $$0, dxq $$1, ji $$2, dxa $$3, dxb $$4, dxc $$5, List<cxh> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dtf.b, dxd.c), $$3, $$5);
      }

      private static List<cxh> a(ard $$0, dxa $$1, ji $$2, cpr $$3, cxh $$4) {
         ewt $$5 = $$0.p().bc().b($$1.b());
         ewr $$6 = new ewr.a($$0).a(ezi.f, fbx.b($$2)).a($$3.ef()).a(ezi.a, $$3).a(ezi.i, $$4).a(ezh.l);
         return $$5.a($$6);
      }

      private static boolean a(dxa $$0, dxd $$1) {
         return !$$0.e().f() && $$1 != dxd.a;
      }

      private static boolean a(dxa $$0, cxh $$1) {
         return cxh.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dxd $$1) {
         return $$0 % 20L == 0L && $$1 == dxd.b;
      }

      private static void a(ard $$0, dxb $$1, ji $$2, avz $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awb.e);
            $$1.a($$0.ae());
         }
      }
   }
}
