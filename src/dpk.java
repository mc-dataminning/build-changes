import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dpk {
   public static final int a = 40;
   private static final int b = 47;
   private static final int c = axz.h(47);
   private static final float d = 0.02F;
   private final dpl e;
   private final dpm f;
   private final dpk.a g;
   private dpj h;
   private final dpj.a i;
   private boolean j;

   public Codec<dpk> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(dpl.b.forGetter(dpk::b), dpm.b.forGetter(dpk::c)).apply($$0, ($$0x, $$1) -> new dpk($$0x, $$1, this.g, this.h, this.i))
      );
   }

   public dpk(dpk.a $$0, dpj $$1, dpj.a $$2) {
      this(dpl.a, new dpm(), $$0, $$1, $$2);
   }

   public dpk(dpl $$0, dpm $$1, dpk.a $$2, dpj $$3, dpj.a $$4) {
      this.e = $$0;
      this.f = $$1;
      this.f.a($$0);
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
   }

   public dpl b() {
      return this.e;
   }

   public dpm c() {
      return this.f;
   }

   public dpn d() {
      return this.g.d();
   }

   public void a(dad $$0, dpn $$1) {
      this.g.a($$0, $$1);
   }

   public void e() {
      this.g.f();
   }

   public dpj f() {
      return this.h;
   }

   public dpj.a g() {
      return this.i;
   }

   public boolean a(dad $$0) {
      if (this.j) {
         return true;
      } else {
         return $$0.ak() == bpj.a ? false : $$0.aa().b(czz.e);
      }
   }

   public Optional<UUID> a(aqh $$0, in $$1) {
      ayg $$2 = $$0.E_();
      dau $$3 = this.f.b(this, $$0.E_());
      ua $$4 = $$3.c();
      ug $$5 = $$4.c("Pos", 6);
      Optional<brn<?>> $$6 = brn.a($$4);
      if ($$6.isEmpty()) {
         return Optional.empty();
      } else {
         int $$7 = $$5.size();
         double $$8 = $$7 >= 1 ? $$5.h(0) : (double)$$1.u() + ($$2.j() - $$2.j()) * (double)this.e.b() + 0.5;
         double $$9 = $$7 >= 2 ? $$5.h(1) : (double)($$1.v() + $$2.a(3) - 1);
         double $$10 = $$7 >= 3 ? $$5.h(2) : (double)$$1.w() + ($$2.j() - $$2.j()) * (double)this.e.b() + 0.5;
         if (!$$0.b($$6.get().a($$8, $$9, $$10))) {
            return Optional.empty();
         } else {
            etp $$11 = new etp($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               in $$12 = in.a($$11);
               if (!bsv.a($$6.get(), $$0, bse.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dau.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  brh $$14 = brn.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bsc $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dn()), bse.q, null);
                        }

                        $$15.fT();
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        $$0.c(3011, $$1, 0);
                        $$0.c(3012, $$12, 0);
                        $$0.a($$14, dva.t, $$12);
                        return Optional.of($$14.cx());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(aqh $$0, in $$1, akg<eoq> $$2) {
      eoq $$3 = $$0.o().be().b($$2);
      eoo $$4 = new eoo.a($$0).a(erb.b);
      ObjectArrayList<csz> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            csz $$6 = (csz)var7.next();
            kh.a($$0, $$6, 2, is.b, etp.c($$1).a(is.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dad $$0, in $$1) {
      if (!this.a($$0)) {
         this.f.m = this.f.l;
      } else {
         dpn $$2 = this.d();
         $$2.a($$0, $$1);
         if ($$2.d()) {
            double $$3 = (double)Math.max(0L, this.f.f - $$0.Y());
            this.f.m = this.f.l;
            this.f.l = (this.f.l + $$2.b() / ($$3 + 200.0)) % 360.0;
         }

         if ($$2.e()) {
            ayg $$4 = $$0.E_();
            if ($$4.i() <= 0.02F) {
               $$0.a($$1, avc.lZ, avd.e, $$4.i() * 0.25F + 0.75F, $$4.i() + 0.5F, false);
            }
         }
      }
   }

   public void b(aqh $$0, in $$1) {
      dpn $$2 = this.d();
      if (!this.a($$0)) {
         if ($$2.e()) {
            this.f.a();
            this.a($$0, dpn.a);
         }
      } else {
         if (this.f.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.f.f = $$0.Y() + (long)this.e.g();
         }

         dpn $$3 = $$2.a($$1, this, $$0);
         if ($$3 != $$2) {
            this.a($$0, $$3);
         }
      }
   }

   private static boolean a(aqh $$0, in $$1, UUID $$2) {
      brh $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bB() || !$$3.dN().ae().equals($$0.ae()) || $$3.dn().j($$1) > (double)c;
   }

   private static boolean a(dad $$0, etp $$1, etp $$2) {
      etl $$3 = $$0.a(new czm($$2, $$1, czm.a.c, czm.b.a, etu.a()));
      return $$3.a().equals(in.a($$1)) || $$3.c() == etn.a.a;
   }

   public static void a(dad $$0, in $$1, ayg $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(kx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
         $$0.a(kx.E, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dad $$0, in $$1, ayg $$2, int $$3) {
      for (int $$4 = 0; $$4 < 30 + Math.min($$3, 10) * 5; $$4++) {
         double $$5 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)$$1.u() + 0.5 + $$5;
         double $$8 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$9 = (double)$$1.w() + 0.5 + $$6;
         $$0.a(kx.aV, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dad $$0, in $$1, ayg $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(kx.aG, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(kx.ab, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dpj $$0) {
      this.h = $$0;
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void h() {
      this.j = true;
   }

   public interface a {
      void a(dad var1, dpn var2);

      dpn d();

      void f();
   }
}
