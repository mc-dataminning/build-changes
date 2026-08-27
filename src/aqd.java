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

public class aqd {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aqe f;
   private final bql g;
   private final int h;
   private final boolean i;
   private final Consumer<yz<?>> j;
   private final ahu k = new ahu();
   private int l;
   private int m;
   private int n;
   private etf o = etf.b;
   private int p;
   private int q;
   private List<bql> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<ajo.c<?>> u;

   public aqd(aqe $$0, bql $$1, int $$2, boolean $$3, Consumer<yz<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dm());
      this.l = axw.d($$1.dD() * 256.0F / 360.0F);
      this.m = axw.d($$1.dF() * 256.0F / 360.0F);
      this.n = axw.d($$1.cq() * 256.0F / 360.0F);
      this.t = $$1.aC();
      this.u = $$1.an().c();
   }

   public void a() {
      List<bql> $$0 = this.g.cQ();
      if (!$$0.equals(this.r)) {
         this.j.accept(new aev(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aqf $$1) {
               $$1.d.a($$1.ds(), $$1.du(), $$1.dy(), $$1.dD(), $$1.dF());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cgo $$1 && this.p % 10 == 0) {
         csd $$2 = $$1.E();
         if ($$2.f() instanceof csl) {
            enc $$3 = $$2.a(jz.s);
            ene $$4 = csl.a($$3, this.f);
            if ($$4 != null) {
               for (aqf $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  yz<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.d.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.av || this.g.an().a()) {
         if (this.g.bP()) {
            int $$7 = axw.d(this.g.dD() * 256.0F / 360.0F);
            int $$8 = axw.d(this.g.dF() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new ade.c(this.g.aj(), (byte)$$7, (byte)$$8, this.g.aC()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dm());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = axw.d(this.g.dD() * 256.0F / 360.0F);
            int $$11 = axw.d(this.g.dF() * 256.0F / 360.0F);
            etf $$12 = this.g.dm();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            yz<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof ckr) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aC()) {
                  this.t = this.g.aC();
                  this.q = 0;
                  $$14 = new afl(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof ckr)) {
                  if ($$15) {
                     $$14 = new ade.a(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aC());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new ade.c(this.g.aj(), (byte)$$10, (byte)$$11, this.g.aC());
                     $$18 = true;
                  }
               } else {
                  $$14 = new ade.b(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aC());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.av || this.g instanceof bre && ((bre)this.g).fC()) && this.p > 0) {
               etf $$23 = this.g.dq();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new aeq(this.g.aj(), this.o));
               }
            }

            if ($$14 != null) {
               this.j.accept($$14);
            }

            this.b();
            if ($$17) {
               this.k.e($$12);
            }

            if ($$18) {
               this.l = $$10;
               this.m = $$11;
            }

            this.s = false;
         }

         int $$25 = axw.d(this.g.cq() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new ady(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.av = false;
      }

      this.p++;
      if (this.g.U) {
         this.a(new aeq(this.g));
         this.g.U = false;
      }
   }

   private static Stream<bql> a(List<bql> $$0, List<bql> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aqf $$0) {
      this.g.d($$0);
      $$0.d.b(new adu(this.g.aj()));
   }

   public void b(aqf $$0) {
      List<yz<? super abk>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.d.b(new abw($$1));
      this.g.c($$0);
   }

   public void a(aqf $$0, Consumer<yz<abk>> $$1) {
      if (this.g.dI()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      yz<abk> $$2 = this.g.dj();
      this.n = axw.d(this.g.cq() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aeo(this.g.aj(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bre) {
         Collection<bsh> $$4 = ((bre)this.g).eU().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new afp(this.g.aj(), $$4));
         }

         if (((bre)this.g).fC()) {
            $$3 = true;
         }
      }

      this.o = this.g.dq();
      if ($$3 && !(this.g instanceof bre)) {
         $$1.accept(new aeq(this.g.aj(), this.o));
      }

      if (this.g instanceof bre) {
         List<Pair<bqs, csd>> $$5 = Lists.newArrayList();

         for (bqs $$6 : bqs.values()) {
            csd $$7 = ((bre)this.g).d($$6);
            if (!$$7.d()) {
               $$5.add(Pair.of($$6, $$7.r()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new aer(this.g.aj(), $$5));
         }
      }

      if (!this.g.cQ().isEmpty()) {
         $$1.accept(new aev(this.g));
      }

      if (this.g.bP()) {
         $$1.accept(new aev(this.g.da()));
      }

      if (this.g instanceof brg $$8 && $$8.gc()) {
         $$1.accept(new aep($$8, $$8.ge()));
      }
   }

   private void b() {
      ajo $$0 = this.g.an();
      List<ajo.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aeo(this.g.aj(), $$1));
      }

      if (this.g instanceof bre) {
         Set<bsh> $$2 = ((bre)this.g).eU().a();
         if (!$$2.isEmpty()) {
            this.a(new afp(this.g.aj(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(yz<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aqf) {
         ((aqf)this.g).d.b($$0);
      }
   }
}
