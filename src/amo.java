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

public class amo {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final amp f;
   private final blf g;
   private final int h;
   private final boolean i;
   private final Consumer<wu<?>> j;
   private final aet k = new aet();
   private int l;
   private int m;
   private int n;
   private elb o = elb.b;
   private int p;
   private int q;
   private List<blf> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<agc.b<?>> u;

   public amo(amp $$0, blf $$1, int $$2, boolean $$3, Consumer<wu<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dl());
      this.l = aty.d($$1.dC() * 256.0F / 360.0F);
      this.m = aty.d($$1.dE() * 256.0F / 360.0F);
      this.n = aty.d($$1.cp() * 256.0F / 360.0F);
      this.t = $$1.aC();
      this.u = $$1.an().c();
   }

   public void a() {
      List<blf> $$0 = this.g.cP();
      if (!$$0.equals(this.r)) {
         this.j.accept(new abw(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof amq $$1) {
               $$1.c.a($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cax $$1 && this.p % 10 == 0) {
         cmh $$2 = $$1.G();
         if ($$2.d() instanceof cmo) {
            Integer $$3 = cmo.d($$2);
            efj $$4 = cmo.a($$3, this.f);
            if ($$4 != null) {
               for (amq $$5 : this.f.w()) {
                  $$4.a($$5, $$2);
                  wu<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.au || this.g.an().a()) {
         if (this.g.bO()) {
            int $$7 = aty.d(this.g.dC() * 256.0F / 360.0F);
            int $$8 = aty.d(this.g.dE() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new aag.c(this.g.aj(), (byte)$$7, (byte)$$8, this.g.aC()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dl());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = aty.d(this.g.dC() * 256.0F / 360.0F);
            int $$11 = aty.d(this.g.dE() * 256.0F / 360.0F);
            elb $$12 = this.g.dl();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            wu<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cex) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aC()) {
                  this.t = this.g.aC();
                  this.q = 0;
                  $$14 = new acm(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cex)) {
                  if ($$15) {
                     $$14 = new aag.a(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aC());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new aag.c(this.g.aj(), (byte)$$10, (byte)$$11, this.g.aC());
                     $$18 = true;
                  }
               } else {
                  $$14 = new aag.b(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aC());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.au || this.g instanceof blv && ((blv)this.g).fw()) && this.p > 0) {
               elb $$23 = this.g.dp();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new abr(this.g.aj(), this.o));
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

         int $$25 = aty.d(this.g.cp() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aaz(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.au = false;
      }

      this.p++;
      if (this.g.T) {
         this.a(new abr(this.g));
         this.g.T = false;
      }
   }

   private static Stream<blf> a(List<blf> $$0, List<blf> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(amq $$0) {
      this.g.d($$0);
      $$0.c.b(new aaw(this.g.aj()));
   }

   public void b(amq $$0) {
      List<wu<yo>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new yz($$1));
      this.g.c($$0);
   }

   public void a(amq $$0, Consumer<wu<yo>> $$1) {
      if (this.g.dH()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      wu<yo> $$2 = this.g.dj();
      this.n = aty.d(this.g.cp() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new abp(this.g.aj(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof blv) {
         Collection<bmx> $$4 = ((blv)this.g).eR().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new acq(this.g.aj(), $$4));
         }

         if (((blv)this.g).fw()) {
            $$3 = true;
         }
      }

      this.o = this.g.dp();
      if ($$3 && !(this.g instanceof blv)) {
         $$1.accept(new abr(this.g.aj(), this.o));
      }

      if (this.g instanceof blv) {
         List<Pair<blk, cmh>> $$5 = Lists.newArrayList();

         for (blk $$6 : blk.values()) {
            cmh $$7 = ((blv)this.g).c($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.p()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new abs(this.g.aj(), $$5));
         }
      }

      if (!this.g.cP().isEmpty()) {
         $$1.accept(new abw(this.g));
      }

      if (this.g.bO()) {
         $$1.accept(new abw(this.g.cZ()));
      }

      if (this.g instanceof blx $$8 && $$8.fS()) {
         $$1.accept(new abq($$8, $$8.fT()));
      }
   }

   private void b() {
      agc $$0 = this.g.an();
      List<agc.b<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new abp(this.g.aj(), $$1));
      }

      if (this.g instanceof blv) {
         Set<bmx> $$2 = ((blv)this.g).eR().a();
         if (!$$2.isEmpty()) {
            this.a(new acq(this.g.aj(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(wu<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof amq) {
         ((amq)this.g).c.b($$0);
      }
   }
}
