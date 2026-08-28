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

public class ari {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final arj f;
   private final btr g;
   private final int h;
   private final boolean i;
   private final Consumer<zl<?>> j;
   private final air k = new air();
   private byte l;
   private byte m;
   private byte n;
   private eyw o;
   private int p;
   private int q;
   private List<btr> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<akl.c<?>> u;

   public ari(arj $$0, btr $$1, int $$2, boolean $$3, Consumer<zl<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dr());
      this.o = $$1.dv();
      this.l = azf.g($$1.dI());
      this.m = azf.g($$1.dK());
      this.n = azf.g($$1.cx());
      this.t = $$1.aH();
      this.u = $$1.at().c();
   }

   public void a() {
      List<btr> $$0 = this.g.cW();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afo(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof ark $$1) {
               $$1.c.a($$1.dx(), $$1.dz(), $$1.dD(), $$1.dI(), $$1.dK());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cka $$1 && this.p % 10 == 0) {
         cvs $$2 = $$1.C();
         if ($$2.h() instanceof cwf) {
            esl $$3 = $$2.a(ks.G);
            esn $$4 = cwf.a($$3, this.f);
            if ($$4 != null) {
               for (ark $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zl<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.g();
      }

      if (this.p % this.h == 0 || this.g.as || this.g.at().a()) {
         byte $$7 = azf.g(this.g.dI());
         byte $$8 = azf.g(this.g.dK());
         boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
         if (this.g.bW()) {
            if ($$9) {
               this.j.accept(new adu.c(this.g.ap(), $$7, $$8, this.g.aH()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dr());
            this.g();
            this.s = true;
         } else {
            label194: {
               if (this.g instanceof cpv $$10 && $$10.m() instanceof cqj $$11) {
                  this.a($$11, $$7, $$8, $$9);
                  break label194;
               }

               this.q++;
               eyw $$12 = this.g.dr();
               boolean $$13 = this.k.d($$12).h() >= 7.6293945E-6F;
               zl<?> $$14 = null;
               boolean $$15 = $$13 || this.p % 60 == 0;
               boolean $$16 = false;
               boolean $$17 = false;
               long $$18 = this.k.a($$12);
               long $$19 = this.k.b($$12);
               long $$20 = this.k.c($$12);
               boolean $$21 = $$18 < -32768L || $$18 > 32767L || $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L;
               if ($$21 || this.q > 400 || this.s || this.t != this.g.aH()) {
                  this.t = this.g.aH();
                  this.q = 0;
                  $$14 = new agf(this.g);
                  $$16 = true;
                  $$17 = true;
               } else if ((!$$15 || !$$9) && !(this.g instanceof coe)) {
                  if ($$15) {
                     $$14 = new adu.a(this.g.ap(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), this.g.aH());
                     $$16 = true;
                  } else if ($$9) {
                     $$14 = new adu.c(this.g.ap(), $$7, $$8, this.g.aH());
                     $$17 = true;
                  }
               } else {
                  $$14 = new adu.b(this.g.ap(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), $$7, $$8, this.g.aH());
                  $$16 = true;
                  $$17 = true;
               }

               if ((this.i || this.g.as || this.g instanceof bun && ((bun)this.g).fF()) && this.p > 0) {
                  eyw $$22 = this.g.dv();
                  double $$23 = $$22.g(this.o);
                  if ($$23 > 1.0E-7 || $$23 > 0.0 && $$22.h() == 0.0) {
                     this.o = $$22;
                     if (this.g instanceof cof $$24) {
                        this.j.accept(new acm(List.of(new afi(this.g.ap(), this.o), new aek($$24.ap(), $$24.d))));
                     } else {
                        this.j.accept(new afi(this.g.ap(), this.o));
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

         byte $$25 = azf.g(this.g.cx());
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aeq(this.g, $$25));
            this.n = $$25;
         }

         this.g.as = false;
      }

      this.p++;
      if (this.g.U) {
         this.g.U = false;
         this.a(new afi(this.g));
      }
   }

   private void a(cqj $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         eyw $$4 = this.g.dv();
         double $$5 = $$4.g(this.o);
         eyw $$6 = this.g.dr();
         boolean $$7 = this.k.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.p % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new adv(this.g.ap(), List.of(new cqj.a(this.g.dq(), this.g.dv(), this.g.dI(), this.g.dK(), 1.0F))));
         }
      } else {
         this.j.accept(new adv(this.g.ap(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.l = $$1;
      this.m = $$2;
      this.k.e(this.g.dq());
   }

   private static Stream<btr> a(List<btr> $$0, List<btr> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(ark $$0) {
      this.g.e($$0);
      $$0.c.b(new aem(this.g.ap()));
   }

   public void b(ark $$0) {
      List<zl<? super aca>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new acm($$1));
      this.g.d($$0);
   }

   public void a(ark $$0, Consumer<zl<aca>> $$1) {
      if (this.g.dN()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zl<aca> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new afg(this.g.ap(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bun) {
         Collection<bvq> $$4 = ((bun)this.g).eV().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new agj(this.g.ap(), $$4));
         }

         if (((bun)this.g).fF()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bun)) {
         $$1.accept(new afi(this.g.ap(), this.o));
      }

      if (this.g instanceof bun) {
         List<Pair<btz, cvs>> $$5 = Lists.newArrayList();

         for (btz $$6 : btz.values()) {
            cvs $$7 = ((bun)this.g).a($$6);
            if (!$$7.f()) {
               $$5.add(Pair.of($$6, $$7.u()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new afj(this.g.ap(), $$5));
         }
      }

      if (!this.g.cW().isEmpty()) {
         $$1.accept(new afo(this.g));
      }

      if (this.g.bW()) {
         $$1.accept(new afo(this.g.dg()));
      }

      if (this.g instanceof bul $$8 && $$8.L_()) {
         $$1.accept(new afh(this.g, $$8.C()));
      }
   }

   public eyw b() {
      return this.k.a();
   }

   public eyw c() {
      return this.o;
   }

   public float d() {
      return azf.a(this.m);
   }

   public float e() {
      return azf.a(this.l);
   }

   public float f() {
      return azf.a(this.n);
   }

   private void g() {
      akl $$0 = this.g.at();
      List<akl.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new afg(this.g.ap(), $$1));
      }

      if (this.g instanceof bun) {
         Set<bvq> $$2 = ((bun)this.g).eV().a();
         if (!$$2.isEmpty()) {
            this.a(new agj(this.g.ap(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zl<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof ark) {
         ((ark)this.g).c.b($$0);
      }
   }
}
