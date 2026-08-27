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

public class aqg {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aqh f;
   private final brh g;
   private final int h;
   private final boolean i;
   private final Consumer<zb<?>> j;
   private final ahw k = new ahw();
   private int l;
   private int m;
   private int n;
   private etp o = etp.b;
   private int p;
   private int q;
   private List<brh> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<ajq.c<?>> u;

   public aqg(aqh $$0, brh $$1, int $$2, boolean $$3, Consumer<zb<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dm());
      this.l = axz.d($$1.dD() * 256.0F / 360.0F);
      this.m = axz.d($$1.dF() * 256.0F / 360.0F);
      this.n = axz.d($$1.cq() * 256.0F / 360.0F);
      this.t = $$1.aC();
      this.u = $$1.an().c();
   }

   public void a() {
      List<brh> $$0 = this.g.cQ();
      if (!$$0.equals(this.r)) {
         this.j.accept(new aex(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aqi $$1) {
               $$1.d.a($$1.ds(), $$1.du(), $$1.dy(), $$1.dD(), $$1.dF());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof chk $$1 && this.p % 10 == 0) {
         csz $$2 = $$1.E();
         if ($$2.f() instanceof cth) {
            enn $$3 = $$2.a(ka.z);
            enp $$4 = cth.a($$3, this.f);
            if ($$4 != null) {
               for (aqi $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zb<?> $$6 = $$4.a($$3, $$5);
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
            int $$7 = axz.d(this.g.dD() * 256.0F / 360.0F);
            int $$8 = axz.d(this.g.dF() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new adg.c(this.g.aj(), (byte)$$7, (byte)$$8, this.g.aC()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dm());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = axz.d(this.g.dD() * 256.0F / 360.0F);
            int $$11 = axz.d(this.g.dF() * 256.0F / 360.0F);
            etp $$12 = this.g.dm();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            zb<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cln) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aC()) {
                  this.t = this.g.aC();
                  this.q = 0;
                  $$14 = new afn(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cln)) {
                  if ($$15) {
                     $$14 = new adg.a(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aC());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new adg.c(this.g.aj(), (byte)$$10, (byte)$$11, this.g.aC());
                     $$18 = true;
                  }
               } else {
                  $$14 = new adg.b(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aC());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.av || this.g instanceof bsa && ((bsa)this.g).fC()) && this.p > 0) {
               etp $$23 = this.g.dq();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new aes(this.g.aj(), this.o));
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

         int $$25 = axz.d(this.g.cq() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aea(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.av = false;
      }

      this.p++;
      if (this.g.U) {
         this.a(new aes(this.g));
         this.g.U = false;
      }
   }

   private static Stream<brh> a(List<brh> $$0, List<brh> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aqi $$0) {
      this.g.d($$0);
      $$0.d.b(new adw(this.g.aj()));
   }

   public void b(aqi $$0) {
      List<zb<? super abm>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.d.b(new aby($$1));
      this.g.c($$0);
   }

   public void a(aqi $$0, Consumer<zb<abm>> $$1) {
      if (this.g.dI()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zb<abm> $$2 = this.g.dj();
      this.n = axz.d(this.g.cq() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aeq(this.g.aj(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bsa) {
         Collection<btd> $$4 = ((bsa)this.g).eU().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new afr(this.g.aj(), $$4));
         }

         if (((bsa)this.g).fC()) {
            $$3 = true;
         }
      }

      this.o = this.g.dq();
      if ($$3 && !(this.g instanceof bsa)) {
         $$1.accept(new aes(this.g.aj(), this.o));
      }

      if (this.g instanceof bsa) {
         List<Pair<bro, csz>> $$5 = Lists.newArrayList();

         for (bro $$6 : bro.values()) {
            csz $$7 = ((bsa)this.g).d($$6);
            if (!$$7.d()) {
               $$5.add(Pair.of($$6, $$7.r()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new aet(this.g.aj(), $$5));
         }
      }

      if (!this.g.cQ().isEmpty()) {
         $$1.accept(new aex(this.g));
      }

      if (this.g.bP()) {
         $$1.accept(new aex(this.g.da()));
      }

      if (this.g instanceof bsc $$8 && $$8.gc()) {
         $$1.accept(new aer($$8, $$8.ge()));
      }
   }

   private void b() {
      ajq $$0 = this.g.an();
      List<ajq.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aeq(this.g.aj(), $$1));
      }

      if (this.g instanceof bsa) {
         Set<btd> $$2 = ((bsa)this.g).eU().a();
         if (!$$2.isEmpty()) {
            this.a(new afr(this.g.aj(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zb<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aqi) {
         ((aqi)this.g).d.b($$0);
      }
   }
}
