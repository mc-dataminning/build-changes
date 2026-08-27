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

public class akq {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final akr f;
   private final biq g;
   private final int h;
   private final boolean i;
   private final Consumer<ve<?>> j;
   private final acz k = new acz();
   private int l;
   private int m;
   private int n;
   private ehn o = ehn.b;
   private int p;
   private int q;
   private List<biq> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<aei.b<?>> u;

   public akq(akr $$0, biq $$1, int $$2, boolean $$3, Consumer<ve<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dk());
      this.l = arx.d($$1.dB() * 256.0F / 360.0F);
      this.m = arx.d($$1.dD() * 256.0F / 360.0F);
      this.n = arx.d($$1.co() * 256.0F / 360.0F);
      this.t = $$1.aA();
      this.u = $$1.al().c();
   }

   public void a() {
      List<biq> $$0 = this.g.cP();
      if (!$$0.equals(this.r)) {
         this.j.accept(new aaf(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aks $$1) {
               $$1.c.a($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof byg $$1 && this.p % 10 == 0) {
         cjf $$2 = $$1.F();
         if ($$2.d() instanceof cjm) {
            Integer $$3 = cjm.d($$2);
            ebw $$4 = cjm.a($$3, this.f);
            if ($$4 != null) {
               for (aks $$5 : this.f.v()) {
                  $$4.a($$5, $$2);
                  ve<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.au || this.g.al().a()) {
         if (this.g.bN()) {
            int $$7 = arx.d(this.g.dB() * 256.0F / 360.0F);
            int $$8 = arx.d(this.g.dD() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new yp.c(this.g.ah(), (byte)$$7, (byte)$$8, this.g.aA()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dk());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = arx.d(this.g.dB() * 256.0F / 360.0F);
            int $$11 = arx.d(this.g.dD() * 256.0F / 360.0F);
            ehn $$12 = this.g.dk();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            ve<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cca) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aA()) {
                  this.t = this.g.aA();
                  this.q = 0;
                  $$14 = new aav(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cca)) {
                  if ($$15) {
                     $$14 = new yp.a(this.g.ah(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aA());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new yp.c(this.g.ah(), (byte)$$10, (byte)$$11, this.g.aA());
                     $$18 = true;
                  }
               } else {
                  $$14 = new yp.b(this.g.ah(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aA());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.au || this.g instanceof bjg && ((bjg)this.g).fv()) && this.p > 0) {
               ehn $$23 = this.g.do();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new aaa(this.g.ah(), this.o));
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

         int $$25 = arx.d(this.g.co() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new zi(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.au = false;
      }

      this.p++;
      if (this.g.T) {
         this.a(new aaa(this.g));
         this.g.T = false;
      }
   }

   private static Stream<biq> a(List<biq> $$0, List<biq> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aks $$0) {
      this.g.d($$0);
      $$0.c.b(new zf(this.g.ah()));
   }

   public void b(aks $$0) {
      List<ve<wx>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new xi($$1));
      this.g.c($$0);
   }

   public void a(aks $$0, Consumer<ve<wx>> $$1) {
      if (this.g.dG()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      ve<wx> $$2 = this.g.di();
      this.n = arx.d(this.g.co() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new zy(this.g.ah(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bjg) {
         Collection<bki> $$4 = ((bjg)this.g).eQ().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new aax(this.g.ah(), $$4));
         }

         if (((bjg)this.g).fv()) {
            $$3 = true;
         }
      }

      this.o = this.g.do();
      if ($$3 && !(this.g instanceof bjg)) {
         $$1.accept(new aaa(this.g.ah(), this.o));
      }

      if (this.g instanceof bjg) {
         List<Pair<biv, cjf>> $$5 = Lists.newArrayList();

         for (biv $$6 : biv.values()) {
            cjf $$7 = ((bjg)this.g).c($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.p()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new aab(this.g.ah(), $$5));
         }
      }

      if (!this.g.cP().isEmpty()) {
         $$1.accept(new aaf(this.g));
      }

      if (this.g.bN()) {
         $$1.accept(new aaf(this.g.cY()));
      }

      if (this.g instanceof bji $$8 && $$8.fR()) {
         $$1.accept(new zz($$8, $$8.fS()));
      }
   }

   private void b() {
      aei $$0 = this.g.al();
      List<aei.b<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new zy(this.g.ah(), $$1));
      }

      if (this.g instanceof bjg) {
         Set<bki> $$2 = ((bjg)this.g).eQ().a();
         if (!$$2.isEmpty()) {
            this.a(new aax(this.g.ah(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(ve<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aks) {
         ((aks)this.g).c.b($$0);
      }
   }
}
