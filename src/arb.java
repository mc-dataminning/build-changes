import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arb {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final ard f;
   private final bul g;
   private final int h;
   private final boolean i;
   private final Consumer<yw<?>> j;
   private final aii k = new aii();
   private byte l;
   private byte m;
   private byte n;
   private fba o;
   private int p;
   private int q;
   private List<bul> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<akc.c<?>> u;

   public arb(ard $$0, bul $$1, int $$2, boolean $$3, Consumer<yw<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.du());
      this.o = $$1.dy();
      this.l = ayz.g($$1.dL());
      this.m = ayz.g($$1.dN());
      this.n = ayz.g($$1.cA());
      this.t = $$1.aJ();
      this.u = $$1.au().c();
   }

   public void a() {
      List<bul> $$0 = this.g.cY();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afd(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof are $$1) {
               $$1.f.a($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof ckv $$1 && this.p % 10 == 0) {
         cwp $$2 = $$1.A();
         if ($$2.h() instanceof cxc) {
            eur $$3 = $$2.a(kv.L);
            eut $$4 = cxc.a($$3, this.f);
            if ($$4 != null) {
               for (are $$5 : this.f.z()) {
                  $$4.a($$5, $$2);
                  yw<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.f.b($$6);
                  }
               }
            }
         }

         this.g();
      }

      if (this.p % this.h == 0 || this.g.ar || this.g.au().a()) {
         byte $$7 = ayz.g(this.g.dL());
         byte $$8 = ayz.g(this.g.dN());
         boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
         if (this.g.bZ()) {
            if ($$9) {
               this.j.accept(new adg.c(this.g.ar(), $$7, $$8, this.g.aJ()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.du());
            this.g();
            this.s = true;
         } else {
            label194: {
               if (this.g instanceof cqw $$10 && $$10.l() instanceof crl $$11) {
                  this.a($$11, $$7, $$8, $$9);
                  break label194;
               }

               this.q++;
               fba $$12 = this.g.du();
               boolean $$13 = this.k.d($$12).h() >= 7.6293945E-6F;
               yw<?> $$14 = null;
               boolean $$15 = $$13 || this.p % 60 == 0;
               boolean $$16 = false;
               boolean $$17 = false;
               long $$18 = this.k.a($$12);
               long $$19 = this.k.b($$12);
               long $$20 = this.k.c($$12);
               boolean $$21 = $$18 < -32768L || $$18 > 32767L || $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L;
               if ($$21 || this.q > 400 || this.s || this.t != this.g.aJ()) {
                  this.t = this.g.aJ();
                  this.q = 0;
                  $$14 = acq.a(this.g);
                  $$16 = true;
                  $$17 = true;
               } else if ((!$$15 || !$$9) && !(this.g instanceof cpe)) {
                  if ($$15) {
                     $$14 = new adg.a(this.g.ar(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), this.g.aJ());
                     $$16 = true;
                  } else if ($$9) {
                     $$14 = new adg.c(this.g.ar(), $$7, $$8, this.g.aJ());
                     $$17 = true;
                  }
               } else {
                  $$14 = new adg.b(this.g.ar(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), $$7, $$8, this.g.aJ());
                  $$16 = true;
                  $$17 = true;
               }

               if (this.g.ar || this.i || this.g instanceof bvh && ((bvh)this.g).fJ()) {
                  fba $$22 = this.g.dy();
                  double $$23 = $$22.g(this.o);
                  if ($$23 > 1.0E-7 || $$23 > 0.0 && $$22.h() == 0.0) {
                     this.o = $$22;
                     if (this.g instanceof cpf $$24) {
                        this.j.accept(new abx(List.of(new aex(this.g.ar(), this.o), new adx($$24.ar(), $$24.c))));
                     } else {
                        this.j.accept(new aex(this.g.ar(), this.o));
                     }
                  }
               }

               if ($$14 != null) {
                  this.j.accept($$14);
               }

               this.g();
               if ($$16) {
                  this.k.e($$12);
               }

               if ($$17) {
                  this.l = $$7;
                  this.m = $$8;
               }

               this.s = false;
            }
         }

         byte $$25 = ayz.g(this.g.cA());
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aef(this.g, $$25));
            this.n = $$25;
         }

         this.g.ar = false;
      }

      this.p++;
      if (this.g.T) {
         this.g.T = false;
         this.a(new aex(this.g));
      }
   }

   private void a(crl $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         fba $$4 = this.g.dy();
         double $$5 = $$4.g(this.o);
         fba $$6 = this.g.du();
         boolean $$7 = this.k.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.p % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new adh(this.g.ar(), List.of(new crl.a(this.g.dt(), this.g.dy(), this.g.dL(), this.g.dN(), 1.0F))));
         }
      } else {
         this.j.accept(new adh(this.g.ar(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.l = $$1;
      this.m = $$2;
      this.k.e(this.g.dt());
   }

   private static Stream<bul> a(List<bul> $$0, List<bul> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(are $$0) {
      this.g.e($$0);
      $$0.f.b(new aeb(this.g.ar()));
   }

   public void b(are $$0) {
      List<yw<? super abl>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.f.b(new abx($$1));
      this.g.d($$0);
   }

   public void a(are $$0, Consumer<yw<abl>> $$1) {
      if (this.g.dQ()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      yw<abl> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aev(this.g.ar(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bvh) {
         Collection<bwl> $$4 = ((bvh)this.g).eY().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new afy(this.g.ar(), $$4));
         }

         if (((bvh)this.g).fJ()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bvh)) {
         $$1.accept(new aex(this.g.ar(), this.o));
      }

      if (this.g instanceof bvh $$5) {
         List<Pair<but, cwp>> $$6 = Lists.newArrayList();

         for (but $$7 : but.i) {
            cwp $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new aey(this.g.ar(), $$6));
         }
      }

      if (!this.g.cY().isEmpty()) {
         $$1.accept(new afd(this.g));
      }

      if (this.g.bZ()) {
         $$1.accept(new afd(this.g.dk()));
      }

      if (this.g instanceof bvf $$9 && $$9.P_()) {
         $$1.accept(new aew(this.g, $$9.D()));
      }
   }

   public fba b() {
      return this.k.a();
   }

   public fba c() {
      return this.o;
   }

   public float d() {
      return ayz.a(this.m);
   }

   public float e() {
      return ayz.a(this.l);
   }

   public float f() {
      return ayz.a(this.n);
   }

   private void g() {
      akc $$0 = this.g.au();
      List<akc.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aev(this.g.ar(), $$1));
      }

      if (this.g instanceof bvh) {
         Set<bwl> $$2 = ((bvh)this.g).eY().a();
         if (!$$2.isEmpty()) {
            this.a(new afy(this.g.ar(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(yw<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof are) {
         ((are)this.g).f.b($$0);
      }
   }
}
