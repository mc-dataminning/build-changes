import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class duf {
   public static final String a = "normal_config";
   public static final String b = "ominous_config";
   public static final int c = 40;
   private static final int d = 36000;
   private static final int e = 14;
   private static final int f = 47;
   private static final int g = azj.h(47);
   private static final float h = 0.02F;
   private final jp<dug> i;
   private final jp<dug> j;
   private final dui k;
   private final int l;
   private final int m;
   private final duf.b n;
   private due o;
   private final due.a p;
   private boolean q;
   private boolean r;

   public Codec<duf> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dug.c.optionalFieldOf("normal_config", jp.a(dug.a)).forGetter($$0x -> $$0x.i),
                  dug.c.optionalFieldOf("ominous_config", jp.a(dug.a)).forGetter($$0x -> $$0x.j),
                  dui.b.forGetter(duf::f),
                  Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("target_cooldown_length", 36000).forGetter(duf::g),
                  Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(duf::h)
               )
               .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new duf($$0x, $$1, $$2, $$3, $$4, this.n, this.o, this.p))
      );
   }

   public duf(duf.b $$0, due $$1, due.a $$2) {
      this(jp.a(dug.a), jp.a(dug.a), new dui(), 36000, 14, $$0, $$1, $$2);
   }

   public duf(jp<dug> $$0, jp<dug> $$1, dui $$2, int $$3, int $$4, duf.b $$5, due $$6, due.a $$7) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.m = $$3;
      this.l = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
   }

   public dug b() {
      return this.r ? this.d() : this.c();
   }

   @VisibleForTesting
   public dug c() {
      return this.i.a();
   }

   @VisibleForTesting
   public dug d() {
      return this.j.a();
   }

   public void a(arm $$0, jg $$1) {
      $$0.a($$1, $$0.a_($$1).b(dqn.c, Boolean.valueOf(true)), 3);
      $$0.c(3020, $$1, 1);
      this.r = true;
      this.k.a(this, $$0);
   }

   public void b(arm $$0, jg $$1) {
      $$0.a($$1, $$0.a_($$1).b(dqn.c, Boolean.valueOf(false)), 3);
      this.r = false;
   }

   public boolean e() {
      return this.r;
   }

   public dui f() {
      return this.k;
   }

   public int g() {
      return this.m;
   }

   public int h() {
      return this.l;
   }

   public duj i() {
      return this.n.d();
   }

   public void a(dev $$0, duj $$1) {
      this.n.a($$0, $$1);
   }

   public void j() {
      this.n.f();
   }

   public due k() {
      return this.o;
   }

   public due.a l() {
      return this.p;
   }

   public boolean a(dev $$0) {
      if (this.q) {
         return true;
      } else {
         return $$0.am() == brv.a ? false : $$0.ac().b(der.e);
      }
   }

   public Optional<UUID> c(arm $$0, jg $$1) {
      azr $$2 = $$0.E_();
      dfo $$3 = this.k.b(this, $$0.E_());
      uj $$4 = $$3.d();
      up $$5 = $$4.c("Pos", 6);
      Optional<bug<?>> $$6 = bug.a($$4);
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
            ezh $$11 = new ezh($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               jg $$12 = jg.a((jz)$$11);
               if (!bvr.a($$6.get(), $$0, buf.q, $$12, $$0.E_())) {
                  return Optional.empty();
               } else {
                  if ($$3.b().isPresent()) {
                     dfo.a $$13 = $$3.b().get();
                     if (!$$13.a($$12, $$0)) {
                        return Optional.empty();
                     }
                  }

                  btz $$14 = bug.a($$4, $$0, buf.q, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$14 == null) {
                     return Optional.empty();
                  } else {
                     if ($$14 instanceof bux $$15) {
                        if (!$$15.a($$0)) {
                           return Optional.empty();
                        }

                        boolean $$16 = $$3.a().f() == 1 && $$3.a().b("id", 8);
                        if ($$16) {
                           $$15.a($$0, $$0.d_($$15.dx()), buf.q, null);
                        }

                        $$15.gb();
                        $$3.c().ifPresent($$15::a);
                     }

                     if (!$$0.e($$14)) {
                        return Optional.empty();
                     } else {
                        duf.a $$17 = this.r ? duf.a.b : duf.a.a;
                        $$0.c(3011, $$1, $$17.a());
                        $$0.c(3012, $$12, $$17.a());
                        $$0.a($$14, eaa.t, $$12);
                        return Optional.of($$14.cH());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(arm $$0, jg $$1, alg<eub> $$2) {
      eub $$3 = $$0.o().bd().b($$2);
      etz $$4 = new etz.a($$0).a(ewr.b);
      ObjectArrayList<cvx> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cvx $$6 = (cvx)var7.next();
            kz.a($$0, $$6, 2, jl.b, ezh.c($$1).a(jl.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dev $$0, jg $$1, boolean $$2) {
      duj $$3 = this.i();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = (double)Math.max(0L, this.k.f - $$0.aa());
         this.k.l = this.k.k;
         this.k.k = (this.k.k + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         azr $$5 = $$0.E_();
         if ($$5.i() <= 0.02F) {
            awj $$6 = $$2 ? awk.mi : awk.mh;
            $$0.a($$1, $$6, awl.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(arm $$0, jg $$1, boolean $$2) {
      this.r = $$2;
      duj $$3 = this.i();
      if (this.k.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.k.f = $$0.aa() + (long)this.b().h();
      }

      duj $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(arm $$0, jg $$1, UUID $$2) {
      btz $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bM() || !$$3.dX().ag().equals($$0.ag()) || $$3.dx().j($$1) > (double)g;
   }

   private static boolean a(dev $$0, ezh $$1, ezh $$2) {
      ezd $$3 = $$0.a(new ded($$2, $$1, ded.a.c, ded.b.a, ezm.a()));
      return $$3.b().equals(jg.a((jz)$$1)) || $$3.d() == ezf.a.a;
   }

   public static void a(dev $$0, jg $$1, azr $$2, lu $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(lq.ae, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dev $$0, jg $$1, azr $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lq.be, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(lq.L, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dev $$0, jg $$1, azr $$2, int $$3, lo $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = (double)$$1.u() + 0.5 + $$6;
         double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$10 = (double)$$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dev $$0, jg $$1, azr $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(lq.aJ, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(lq.ae, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(due $$0) {
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
      a(lq.F),
      b(lq.L);

      public final lu c;

      private a(final lu $$0) {
         this.c = $$0;
      }

      public static duf.a a(int $$0) {
         duf.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public interface b {
      void a(dev var1, duj var2);

      duj d();

      void f();
   }
}
