import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;

public final class dhz {
   public static final int a = 40;
   private static final int b = 47;
   private static final int c = aty.h(47);
   private static final float d = 0.02F;
   private final dia e;
   private final dib f;
   private final dhz.a g;
   private dhy h;
   private boolean i;

   public Codec<dhz> a() {
      return RecordCodecBuilder.create(
         $$0 -> $$0.group(dia.b.forGetter(dhz::b), dib.b.forGetter(dhz::c)).apply($$0, ($$0x, $$1) -> new dhz($$0x, $$1, this.g, this.h))
      );
   }

   public dhz(dhz.a $$0, dhy $$1) {
      this(dia.a, new dib(), $$0, $$1);
   }

   public dhz(dia $$0, dib $$1, dhz.a $$2, dhy $$3) {
      this.e = $$0;
      this.f = $$1;
      this.f.a($$0);
      this.g = $$2;
      this.h = $$3;
   }

   public dia b() {
      return this.e;
   }

   public dib c() {
      return this.f;
   }

   public dic d() {
      return this.g.f();
   }

   public void a(csy $$0, dic $$1) {
      this.g.a($$0, $$1);
   }

   public void e() {
      this.g.g();
   }

   public dhy f() {
      return this.h;
   }

   public boolean a(csy $$0) {
      if (this.i) {
         return true;
      } else {
         return $$0.aj() == bji.a ? false : $$0.Y().b(csu.e);
      }
   }

   public Optional<UUID> a(amp $$0, hv $$1) {
      auf $$2 = $$0.F_();
      ctp $$3 = this.f.a(this, $$0.F_());
      sj $$4 = $$3.c();
      sp $$5 = $$4.c("Pos", 6);
      Optional<blj<?>> $$6 = blj.a($$4);
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
            elb $$11 = new elb($$8, $$9, $$10);
            if (!a($$0, $$1.b(), $$11)) {
               return Optional.empty();
            } else {
               hv $$12 = hv.a($$11);
               if (!bmp.a($$6.get(), $$0, blz.q, $$12, $$0.F_())) {
                  return Optional.empty();
               } else {
                  blf $$13 = blj.a($$4, $$0, $$4x -> {
                     $$4x.b($$8, $$9, $$10, $$2.i() * 360.0F, 0.0F);
                     return $$4x;
                  });
                  if ($$13 == null) {
                     return Optional.empty();
                  } else {
                     if ($$13 instanceof blx $$14) {
                        if (!$$14.a($$0)) {
                           return Optional.empty();
                        }

                        if ($$3.a().f() == 1 && $$3.a().b("id", 8)) {
                           $$14.a($$0, $$0.d_($$14.dm()), blz.q, null, null);
                           $$14.fJ();
                        }
                     }

                     if (!$$0.e($$13)) {
                        return Optional.empty();
                     } else {
                        $$0.c(3011, $$1, 0);
                        $$0.c(3012, $$12, 0);
                        $$0.a($$13, dmz.t, $$12);
                        return Optional.of($$13.cw());
                     }
                  }
               }
            }
         }
      }
   }

   public void a(amp $$0, hv $$1, agt $$2) {
      egm $$3 = $$0.n().aJ().getLootTable($$2);
      egk $$4 = new egk.a($$0).a(eio.b);
      ObjectArrayList<cmh> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            cmh $$6 = (cmh)var7.next();
            jg.a($$0, $$6, 2, ia.b, elb.c($$1).a(ia.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(csy $$0, hv $$1) {
      if (!this.a($$0)) {
         this.f.m = this.f.l;
      } else {
         dic $$2 = this.d();
         $$2.a($$0, $$1);
         if ($$2.d()) {
            double $$3 = (double)Math.max(0L, this.f.f - $$0.W());
            this.f.m = this.f.l;
            this.f.l = (this.f.l + $$2.b() / ($$3 + 200.0)) % 360.0;
         }

         if ($$2.e()) {
            auf $$4 = $$0.F_();
            if ($$4.i() <= 0.02F) {
               $$0.a($$1, arc.lv, ard.e, $$4.i() * 0.25F + 0.75F, $$4.i() + 0.5F, false);
            }
         }
      }
   }

   public void b(amp $$0, hv $$1) {
      dic $$2 = this.d();
      if (!this.a($$0)) {
         if ($$2.e()) {
            this.f.a();
            this.a($$0, dic.a);
         }
      } else {
         if (this.f.d.removeIf($$2x -> a($$0, $$1, $$2x))) {
            this.f.f = $$0.W() + (long)this.e.g();
         }

         dic $$3 = $$2.a($$1, this, $$0);
         if ($$3 != $$2) {
            this.a($$0, $$3);
         }
      }
   }

   private static boolean a(amp $$0, hv $$1, UUID $$2) {
      blf $$3 = $$0.a($$2);
      return $$3 == null || !$$3.bx() || !$$3.dM().ad().equals($$0.ad()) || $$3.dm().j($$1) > (double)c;
   }

   private static boolean a(csy $$0, elb $$1, elb $$2) {
      ekx $$3 = $$0.a(new csh($$2, $$1, csh.a.c, csh.b.a, elg.a()));
      return $$3.a().equals(hv.a($$1)) || $$3.c() == ekz.a.a;
   }

   public static void a(csy $$0, hv $$1, auf $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(jv.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
         $$0.a(jv.E, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   public static void a(csy $$0, hv $$1, auf $$2, int $$3) {
      for (int $$4 = 0; $$4 < 30 + Math.min($$3, 10) * 5; $$4++) {
         double $$5 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$6 = (double)(2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (double)$$1.u() + 0.5 + $$5;
         double $$8 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
         double $$9 = (double)$$1.w() + 0.5 + $$6;
         $$0.a(jv.aW, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      }
   }

   public static void b(csy $$0, hv $$1, auf $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(jv.aG, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(jv.ab, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(dhy $$0) {
      this.h = $$0;
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void g() {
      this.i = true;
   }

   public interface a {
      void a(csy var1, dic var2);

      dic f();

      void g();
   }
}
