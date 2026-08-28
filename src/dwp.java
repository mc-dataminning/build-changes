import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dwp {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = bae.h(47);
   private static final float h = 0.02F;
   private final jq<dwq> i;
   private final jq<dwq> j;
   private final dws k;
   private final int l;
   private final int m;
   private final dwp.b n;
   private dwo o;
   private final dwo.a p;
   private boolean q;
   private boolean r;

   public Codec<dwp> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dwq.c.optionalFieldOf("normal_config", jq.a(dwq.a)).forGetter($$0x -> $$0x.i),
                  dwq.c.optionalFieldOf("ominous_config", jq.a(dwq.a)).forGetter($$0x -> $$0x.j),
                  dws.b.forGetter(dwp::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(dwp::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(dwp::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dwp($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public dwp(dwp.b $$0, dwo $$1, dwo.a $$2) {
      this(jq.a(dwq.a), jq.a(dwq.a), new dws(), 36000, 14, $$0, $$1, $$2);
   }

   public dwp(jq<dwq> $$0, jq<dwq> $$1, dws $$2, int $$3, int $$4, dwp.b $$5, dwo $$6, dwo.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dwq b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public dwq c() {
      return this.i.a();
   }

   @VisibleForTesting
   public dwq d() {
      return this.j.a();
   }

   public void a(ash $$0, jh $$1) {
      $$0.a($$1, $$0.a_($$1).b(dsw.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(ash $$0, jh $$1) {
      $$0.a($$1, $$0.a_($$1).b(dsw.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dws f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public dwt i() {
      return this.n.d();
   }

   public void a(dha $$0, dwt $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public dwo k() {
      return this.o;
   }

   public dwo.a l() {
      return this.p;
   }

   public boolean a(ash $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.al() == btb.a ? false : $$0.N().b(dgw.e);
      }
   }

   public Optional<UUID> c(ash $$0, jh $$1) {
      bam $$2 = $$0.H_();
      dhu $$3 = this.k.b(this, $$0.H_());
      ux $$4 = $$3.d();
      vd $$5 = $$4.c("Pos", 6);
      Optional<bvm<?>> $$6 = bvm.a($$4);
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
            fbs $$11 = new fbs($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               jh $$12 = jh.a((ka)$$11);
               if (!bwx.a($$6.get(), $$0, bvl.q, $$12, $$0.H_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dhu.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  bvf $$14 = bvm.a($$4, $$0, bvl.q, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bwd $$15) {
                        if (!$$15.a((dhd)$$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dv()), bvl.q, null);
                        }

                        $$15.ai();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        dwp.a $$17 = this.r ? dwp.a.b : dwp.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, ecj.t, $$12);
                        return Optional.of($$14.cG());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(ash $$0, jh $$1, aly<ewm> $$2) {
      ewm $$3 = $$0.p().bc().b($$2);
      ewk $$4 = new ewk.a($$0).a(ezc.b);
      ObjectArrayList<cxk> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cxk $$6 = (cxk)var7.next();
            la.a($$0, $$6, 2, jm.b, fbs.c($$1).a(jm.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dha $$0, jh $$1, boolean $$2) {
      dwt $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.ac());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         bam $$5 = $$0.H_();
         if ($$5.i() <= 0.02F) {
            axe $$6 = $$2 ? axf.mA : axf.mz;
            $$0.a($$1, $$6, axg.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(ash $$0, jh $$1, boolean $$2) {
      this.r = $$2;
      dwt $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.ac() + (long)this.b().h();
      }

      dwt $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(ash $$0, jh $$1, UUID $$2) {
      bvf $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bL() || !$$3.dV().ah().equals($$0.ah()) || $$3.dv().j($$1) > (double)g;
   }

   private static boolean a(dha $$0, fbs $$1, fbs $$2) {
      fbo $$3 = $$0.a(new dgi($$2, $$1, dgi.a.c, dgi.b.a, fbx.a()));
      return $$3.b().equals(jh.a((ka)$$1)) || $$3.d() == fbq.a.a;
   }

   public static void a(dha $$0, jh $$1, bam $$2, lw $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(ls.af, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dha $$0, jh $$1, bam $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ls.bf, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(ls.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dha $$0, jh $$1, bam $$2, int $$3, lq $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dha $$0, jh $$1, bam $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(ls.aK, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(ls.af, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dwo $$0) {
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

      public static dwp.a a(int $$0) {
         dwp.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dha var1, dwt var2);

      dwt d();

      void f();
   }
}
