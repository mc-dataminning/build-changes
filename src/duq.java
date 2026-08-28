import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class duq {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azn.h(47);
   private static final float h = 0.02F;
   private final jq<dur> i;
   private final jq<dur> j;
   private final dut k;
   private final int l;
   private final int m;
   private final duq.b n;
   private dup o;
   private final dup.a p;
   private boolean q;
   private boolean r;

   public Codec<duq> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dur.c.optionalFieldOf("normal_config", jq.a(dur.a)).forGetter($$0x -> $$0x.i),
                  dur.c.optionalFieldOf("ominous_config", jq.a(dur.a)).forGetter($$0x -> $$0x.j),
                  dut.b.forGetter(duq::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(duq::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(duq::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new duq($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public duq(duq.b $$0, dup $$1, dup.a $$2) {
      this(jq.a(dur.a), jq.a(dur.a), new dut(), 36000, 14, $$0, $$1, $$2);
   }

   public duq(jq<dur> $$0, jq<dur> $$1, dut $$2, int $$3, int $$4, duq.b $$5, dup $$6, dup.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dur b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public dur c() {
      return this.i.a();
   }

   @VisibleForTesting
   public dur d() {
      return this.j.a();
   }

   public void a(arq $$0, jh $$1) {
      $$0.a($$1, $$0.a_($$1).b(dqy.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(arq $$0, jh $$1) {
      $$0.a($$1, $$0.a_($$1).b(dqy.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dut f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public duu i() {
      return this.n.d();
   }

   public void a(dff $$0, duu $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public dup k() {
      return this.o;
   }

   public dup.a l() {
      return this.p;
   }

   public boolean a(dff $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.ak() == bse.a ? false : $$0.ac().b(dfb.e);
      }
   }

   public Optional<UUID> c(arq $$0, jh $$1) {
      azv $$2 = $$0.E_();
      dfz $$3 = this.k.b(this, $$0.E_());
      un $$4 = $$3.d();
      ut $$5 = $$4.c("Pos", 6);
      Optional<bup<?>> $$6 = bup.a($$4);
      if ($$6.isEmpty()) {
         return Optional.empty();
      } else {
         int $$7 = $$5.size();
         double $$8 = $$7 >= 1 ? $$5.h(0) : (double)$$1.u() + ($$2.j() - $$2.j()) * (double)this.b().c() + 0.5;
         double $$9 = $$7 >= 2 ? $$5.h(1) : (double)($$1.v() + $$2.a(3) - 1);
         double $$10 = $$7 >= 3 ? $$5.h(2) : (double)$$1.w() + ($$2.j() - $$2.j()) * (double)this.b().c() + 0.5;
         if (!$$0.b($$6.get().a($$8, $$9, $$10))) {
            return Optional.empty();
         } else {
            ezr $$11 = new ezr($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               jh $$12 = jh.a((ka)$$11);
               if (!bwa.a($$6.get(), $$0, buo.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dfz.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bui $$14 = bup.a($$4, $$0, buo.q, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bvg $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dy()), buo.q, null);
                        }

                        $$15.gb();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        duq.a $$17 = this.r ? duq.a.b : duq.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, eak.t, $$12);
                        return Optional.of($$14.cI());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(arq $$0, jh $$1, alk<eul> $$2) {
      eul $$3 = $$0.o().bc().b($$2);
      euj $$4 = new euj.a($$0).a(exb.b);
      ObjectArrayList<cwf> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cwf $$6 = (cwf)var7.next();
            la.a($$0, $$6, 2, jm.b, ezr.c($$1).a(jm.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dff $$0, jh $$1, boolean $$2) {
      duu $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.aa());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azv $$5 = $$0.E_();
         if ($$5.i() <= 0.02F) {
            awn $$6 = $$2 ? awo.mi : awo.mh;
            $$0.a($$1, $$6, awp.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(arq $$0, jh $$1, boolean $$2) {
      this.r = $$2;
      duu $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.aa() + (long)this.b().h();
      }

      duu $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(arq $$0, jh $$1, UUID $$2) {
      bui $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bN() || !$$3.dY().ag().equals($$0.ag()) || $$3.dy().j($$1) > (double)g;
   }

   private static boolean a(dff $$0, ezr $$1, ezr $$2) {
      ezn $$3 = $$0.a(new den($$2, $$1, den.a.c, den.b.a, ezw.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == ezp.a.a;
   }

   public static void a(dff $$0, jh $$1, azv $$2, lw $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(ls.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dff $$0, jh $$1, azv $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ls.be, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(ls.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dff $$0, jh $$1, azv $$2, int $$3, lq $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dff $$0, jh $$1, azv $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ls.aJ, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(ls.ae, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dup $$0) {
      this.o = $$0;
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void m() {
      this.q = true;
   }

   public static enum a {
      a(ls.F),
      b(ls.L);

      public final lw c;

      private a(final lw $$0) {
         this.c = $$0;
      }

      public static duq.a a(int $$0) {
         duq.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dff var1, duu var2);

      duu d();

      void f();
   }
}
