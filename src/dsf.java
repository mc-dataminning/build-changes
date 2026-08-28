import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dsf {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = ayo.h(47);
   private static final float h = 0.02F;
   private final dsg i;
   private final dsg j;
   private final dsh k;
   private final int l;
   private final int m;
   private final dsf.b n;
   private dse o;
   private final dse.a p;
   private boolean q;
   private boolean r;

   public Codec<dsf> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dsg.b.optionalFieldOf("normal_config", dsg.a).forGetter(dsf::c),
                  dsg.b.optionalFieldOf("ominous_config", dsg.a).forGetter(dsf::n),
                  dsh.b.forGetter(dsf::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dsf::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dsf::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dsf($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dsf(dsf.b $$0, dse $$1, dse.a $$2) {
      this(dsg.a, dsg.a, new dsh(), 36000, 14, $$0, $$1, $$2);
   }

   public dsf(dsg $$0, dsg $$1, dsh $$2, int $$3, int $$4, dsf.b $$5, dse $$6, dse.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dsg b() {
      return this.r ? this.j : this.i;
   }

   @VisibleForTesting
   public dsg c() {
      return this.i;
   }

   @VisibleForTesting
   public dsg d() {
      return this.j;
   }

   private dsg n() {
      return !this.j.equals(this.i) ? this.j : dsg.a;
   }

   public void a(aqu $$0, jd $$1) {
      $$0.a($$1, $$0.a_($$1).a(doo.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(aqu $$0, jd $$1) {
      $$0.a($$1, $$0.a_($$1).a(doo.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dsh f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public dsi i() {
      return this.n.d();
   }

   public void a(dcw $$0, dsi $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public dse k() {
      return this.o;
   }

   public dse.a l() {
      return this.p;
   }

   public boolean a(dcw $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.al() == bqo.a ? false : $$0.ab().b(dcs.e);
      }
   }

   public Optional<UUID> c(aqu $$0, jd $$1) {
      ayw $$2 = $$0.E_();
      ddo $$3 = this.k.b(this, $$0.E_());
      ub $$4 = $$3.d();
      uh $$5 = $$4.c("Pos", 6);
      Optional<bsx<?>> $$6 = bsx.a($$4);
      if ($$6.isEmpty()) {
         return Optional.empty();
      } else {
         int $$7 = $$5.size();
         double $$8 = $$7 >= 1 ? $$5.h(0) : (double)$$1.u() + ($$2.j() - $$2.j()) * (double)this.b().b() + 0.5;
         double $$9 = $$7 >= 2 ? $$5.h(1) : (double)($$1.v() + $$2.a(3) - 1);
         double $$10 = $$7 >= 3 ? $$5.h(2) : (double)$$1.w() + ($$2.j() - $$2.j()) * (double)this.b().b() + 0.5;
         if (!$$0.b($$6.get().a($$8, $$9, $$10))) {
            return Optional.empty();
         } else {
            exc $$11 = new exc($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               jd $$12 = jd.a((jw)$$11);
               if (!buk.a($$6.get(), $$0, btr.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     ddo.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bsr $$14 = bsx.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof btp $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.do()), btr.q, null);
                        }

                        $$15.fR();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        dsf.a $$17 = this.r ? dsf.a.b : dsf.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, dxz.t, $$12);
                        return Optional.of($$14.cz());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(aqu $$0, jd $$1, akq<erw> $$2) {
      erw $$3 = $$0.o().be().b($$2);
      eru $$4 = new eru.a($$0).a(eum.b);
      ObjectArrayList<cuq> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cuq $$6 = (cuq)var7.next();
            kw.a($$0, $$6, 2, ji.b, exc.c($$1).a(ji.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dcw $$0, jd $$1, boolean $$2) {
      dsi $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.Z());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         ayw $$5 = $$0.E_();
         if ($$5.i() <= 0.02F) {
            avo $$6 = $$2 ? avp.mj : avp.mi;
            $$0.a($$1, $$6, avq.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(aqu $$0, jd $$1, boolean $$2) {
      this.r = $$2;
      dsi $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.Z() + (long)this.b().g();
      }

      dsi $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(aqu $$0, jd $$1, UUID $$2) {
      bsr $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bE() || !$$3.dO().af().equals($$0.af()) || $$3.do().j($$1) > (double)g;
   }

   private static boolean a(dcw $$0, exc $$1, exc $$2) {
      ewy $$3 = $$0.a(new dcf($$2, $$1, dcf.a.c, dcf.b.a, exh.a()));
      return $$3.a().equals(jd.a((jw)$$1)) || $$3.c() == exa.a.a;
   }

   public static void a(dcw $$0, jd $$1, ayw $$2, lq $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lm.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dcw $$0, jd $$1, ayw $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lm.be, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(lm.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dcw $$0, jd $$1, ayw $$2, int $$3, lk $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dcw $$0, jd $$1, ayw $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lm.aJ, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(lm.ae, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dse $$0) {
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
      a(lm.F),
      b(lm.L);

      public final lq c;

      private a(final lq $$0) {
         this.c = $$0;
      }

      public static dsf.a a(int $$0) {
         dsf.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dcw var1, dsi var2);

      dsi d();

      void f();
   }
}
