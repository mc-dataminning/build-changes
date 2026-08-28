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

public class arl {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final arm f;
   private final btz g;
   private final int h;
   private final boolean i;
   private final Consumer<zo<?>> j;
   private final aiu k = new aiu();
   private byte l;
   private byte m;
   private byte n;
   private ezh o;
   private int p;
   private int q;
   private List<btz> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<ako.c<?>> u;

   public arl(arm $$0, btz $$1, int $$2, boolean $$3, Consumer<zo<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dw());
      this.o = $$1.dA();
      this.l = azj.g($$1.dN());
      this.m = azj.g($$1.dP());
      this.n = azj.g($$1.cB());
      this.t = $$1.aJ();
      this.u = $$1.av().c();
   }

   public void a() {
      List<btz> $$0 = this.g.da();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afr(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof arn $$1) {
               $$1.d.a($$1.dC(), $$1.dE(), $$1.dI(), $$1.dN(), $$1.dP());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof ckj $$1 && this.p % 10 == 0) {
         cvx $$2 = $$1.C();
         if ($$2.h() instanceof cwk) {
            esw $$3 = $$2.a(kt.K);
            esy $$4 = cwk.a($$3, this.f);
            if ($$4 != null) {
               for (arn $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zo<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.d.b($$6);
                  }
               }
            }
         }

         this.g();
      }

      if (this.p % this.h == 0 || this.g.as || this.g.av().a()) {
         byte $$7 = azj.g(this.g.dN());
         byte $$8 = azj.g(this.g.dP());
         boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
         if (this.g.ca()) {
            if ($$9) {
               this.j.accept(new adx.c(this.g.ar(), $$7, $$8, this.g.aJ()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dw());
            this.g();
            this.s = true;
         } else {
            label194: {
               if (this.g instanceof cqf $$10 && $$10.m() instanceof cqt $$11) {
                  this.a($$11, $$7, $$8, $$9);
                  break label194;
               }

               this.q++;
               ezh $$12 = this.g.dw();
               boolean $$13 = this.k.d($$12).h() >= 7.6293945E-6F;
               zo<?> $$14 = null;
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
                  $$14 = new agi(this.g);
                  $$16 = true;
                  $$17 = true;
               } else if ((!$$15 || !$$9) && !(this.g instanceof cop)) {
                  if ($$15) {
                     $$14 = new adx.a(this.g.ar(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), this.g.aJ());
                     $$16 = true;
                  } else if ($$9) {
                     $$14 = new adx.c(this.g.ar(), $$7, $$8, this.g.aJ());
                     $$17 = true;
                  }
               } else {
                  $$14 = new adx.b(this.g.ar(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), $$7, $$8, this.g.aJ());
                  $$16 = true;
                  $$17 = true;
               }

               if ((this.i || this.g.as || this.g instanceof buv && ((buv)this.g).fL()) && this.p > 0) {
                  ezh $$22 = this.g.dA();
                  double $$23 = $$22.g(this.o);
                  if ($$23 > 1.0E-7 || $$23 > 0.0 && $$22.h() == 0.0) {
                     this.o = $$22;
                     if (this.g instanceof coq $$24) {
                        this.j.accept(new acp(List.of(new afl(this.g.ar(), this.o), new aen($$24.ar(), $$24.d))));
                     } else {
                        this.j.accept(new afl(this.g.ar(), this.o));
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

         byte $$25 = azj.g(this.g.cB());
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aet(this.g, $$25));
            this.n = $$25;
         }

         this.g.as = false;
      }

      this.p++;
      if (this.g.U) {
         this.g.U = false;
         this.a(new afl(this.g));
      }
   }

   private void a(cqt $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         ezh $$4 = this.g.dA();
         double $$5 = $$4.g(this.o);
         ezh $$6 = this.g.dw();
         boolean $$7 = this.k.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.p % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new ady(this.g.ar(), List.of(new cqt.a(this.g.dv(), this.g.dA(), this.g.dN(), this.g.dP(), 1.0F))));
         }
      } else {
         this.j.accept(new ady(this.g.ar(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.l = $$1;
      this.m = $$2;
      this.k.e(this.g.dv());
   }

   private static Stream<btz> a(List<btz> $$0, List<btz> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(arn $$0) {
      this.g.e($$0);
      $$0.d.b(new aep(this.g.ar()));
   }

   public void b(arn $$0) {
      List<zo<? super acd>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.d.b(new acp($$1));
      this.g.d($$0);
   }

   public void a(arn $$0, Consumer<zo<acd>> $$1) {
      if (this.g.dS()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zo<acd> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new afj(this.g.ar(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof buv) {
         Collection<bvz> $$4 = ((buv)this.g).fa().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new agm(this.g.ar(), $$4));
         }

         if (((buv)this.g).fL()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof buv)) {
         $$1.accept(new afl(this.g.ar(), this.o));
      }

      if (this.g instanceof buv $$5) {
         List<Pair<buh, cvx>> $$6 = Lists.newArrayList();

         for (buh $$7 : buh.i) {
            cvx $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new afm(this.g.ar(), $$6));
         }
      }

      if (!this.g.da().isEmpty()) {
         $$1.accept(new afr(this.g));
      }

      if (this.g.ca()) {
         $$1.accept(new afr(this.g.dl()));
      }

      if (this.g instanceof but $$9 && $$9.M_()) {
         $$1.accept(new afk(this.g, $$9.C()));
      }
   }

   public ezh b() {
      return this.k.a();
   }

   public ezh c() {
      return this.o;
   }

   public float d() {
      return azj.a(this.m);
   }

   public float e() {
      return azj.a(this.l);
   }

   public float f() {
      return azj.a(this.n);
   }

   private void g() {
      ako $$0 = this.g.av();
      List<ako.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new afj(this.g.ar(), $$1));
      }

      if (this.g instanceof buv) {
         Set<bvz> $$2 = ((buv)this.g).fa().a();
         if (!$$2.isEmpty()) {
            this.a(new agm(this.g.ar(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zo<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof arn) {
         ((arn)this.g).d.b($$0);
      }
   }
}
