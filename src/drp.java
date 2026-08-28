import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drp extends dpn {
   private static final Logger a = LogUtils.getLogger();
   private final drs b = new drs();
   private final drt c = new drt();
   private final drq d = new drq();
   private drr e = drr.b;

   public drp(ja $$0, dsh $$1) {
      super(dpp.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zb<abn> av_() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return ac.a(new tx(), $$1 -> $$1.a("shared_data", a(drt.b, this.c, $$0)));
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(drr.c, this.e, $$1));
      $$0.a("shared_data", a(drt.b, this.c, $$1));
      $$0.a("server_data", a(drs.b, this.b, $$1));
   }

   private static <T> uu a(Codec<T> $$0, T $$1, jl.a $$2) {
      return (uu)$$0.encodeStart($$2.a(ul.a), $$1).getOrThrow();
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uu> $$2 = $$1.a(ul.a);
      if ($$0.e("server_data")) {
         drs.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         drr.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         drt.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public drs b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public drt c() {
      return this.c;
   }

   public drq d() {
      return this.d;
   }

   public drr f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(drr $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dcd $$0, ja $$1, dsh $$2, drq $$3, drt $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(doa.d) ? lj.L : lj.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dcd $$0, ja $$1, dsh $$2, drt $$3, lh $$4) {
         a($$0, $$1, $$2, $$3);
         aym $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            evz $$7 = b($$1, $$5);
            $$0.a(lj.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dcd $$0, ja $$1, lh $$2) {
         aym $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            evz $$5 = a($$1, $$3);
            evz $$6 = new evz($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dcd $$0, ja $$1, drt $$2, lh $$3) {
         aym $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            evz $$5 = b($$1, $$4);
            $$0.a(lj.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dcd $$0, evz $$1, cmh $$2) {
         aym $$3 = $$0.z;
         evz $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dk() / 2.0F), 0.0));
         int $$5 = aye.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            evz $$7 = $$4.a($$3, 1.0F);
            $$0.a(lj.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dcd $$0, ja $$1, dsh $$2, drt $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            evz $$5 = a($$1, $$2.c(doa.c));

            for (UUID $$6 : $$4) {
               cmh $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ja $$0, drt $$1, cmh $$2) {
         return $$2.dp().j($$0) <= aye.k($$1.e());
      }

      private static void a(dcd $$0, ja $$1, drt $$2) {
         if (a($$2)) {
            aym $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avf.AB, avg.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(drt $$0) {
         return $$0.b();
      }

      private static evz a(ja $$0, aym $$1) {
         return evz.a($$0).b(aye.a($$1, 0.4, 0.6), aye.a($$1, 0.4, 0.6), aye.a($$1, 0.4, 0.6));
      }

      private static evz b(ja $$0, aym $$1) {
         return evz.a($$0).b(aye.a($$1, 0.1, 0.9), aye.a($$1, 0.25, 0.75), aye.a($$1, 0.1, 0.9));
      }

      private static evz a(ja $$0, jf $$1) {
         return evz.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqk $$0, ja $$1, dsh $$2, drr $$3, drs $$4, drt $$5) {
         dru $$6 = $$2.c(doa.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dsh $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(doa.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            drp.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqk $$0, ja $$1, dsh $$2, drr $$3, drs $$4, drt $$5, cmh $$6, cua $$7) {
         dru $$8 = $$2.c(doa.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cua> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avp.c.b($$7.g()));
                  if (!$$6.f()) {
                     $$7.h($$3.e().H());
                  }

                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aqk $$0, ja $$1, dsh $$2, dsh $$3, drr $$4, drt $$5) {
         dru $$6 = $$2.c(doa.b);
         dru $$7 = $$3.c(doa.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(doa.d));
      }

      static void a(aqk $$0, dru $$1, drr $$2, drt $$3, ja $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cua.l);
         } else {
            cua $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cua a(aqk $$0, ja $$1, akj<eqt> $$2) {
         eqt $$3 = $$0.o().be().b($$2);
         eqr $$4 = new eqr.a($$0).a(etk.f, evz.b($$1)).a(etj.l);
         List<cua> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cua.l : ac.a($$5, $$0.E_());
      }

      private static void a(aqk $$0, dsh $$1, ja $$2, drr $$3, drs $$4, drt $$5, List<cua> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(doa.b, dru.c), $$3, $$5);
      }

      private static List<cua> a(aqk $$0, drr $$1, ja $$2, cmh $$3) {
         eqt $$4 = $$0.o().be().b($$1.b());
         eqr $$5 = new eqr.a($$0).a(etk.f, evz.b($$2)).a($$3.gu()).a(etk.a, $$3).a(etj.l);
         return $$4.a($$5);
      }

      private static boolean a(drr $$0, dru $$1) {
         return $$0.b() != eqk.a && !$$0.e().e() && $$1 != dru.a;
      }

      private static boolean a(drr $$0, cua $$1) {
         return cua.c($$1, $$0.e()) && $$1.H() >= $$0.e().H();
      }

      private static boolean a(long $$0, dru $$1) {
         return $$0 % 20L == 0L && $$1 == dru.b;
      }

      private static void a(aqk $$0, drs $$1, ja $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avf.AJ, avg.e);
            $$1.a($$0.Z());
         }
      }
   }
}
