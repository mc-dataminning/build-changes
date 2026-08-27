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

public class aoz {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final apa f;
   private final bof g;
   private final int h;
   private final boolean i;
   private final Consumer<xz<?>> j;
   private final ags k = new ags();
   private int l;
   private int m;
   private int n;
   private eov o = eov.b;
   private int p;
   private int q;
   private List<bof> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<ail.b<?>> u;

   public aoz(apa $$0, bof $$1, int $$2, boolean $$3, Consumer<xz<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.di());
      this.l = awm.d($$1.dz() * 256.0F / 360.0F);
      this.m = awm.d($$1.dB() * 256.0F / 360.0F);
      this.n = awm.d($$1.cm() * 256.0F / 360.0F);
      this.t = $$1.aC();
      this.u = $$1.an().c();
   }

   public void a() {
      List<bof> $$0 = this.g.cM();
      if (!$$0.equals(this.r)) {
         this.j.accept(new adt(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof apb $$1) {
               $$1.d.a($$1.do(), $$1.dq(), $$1.du(), $$1.dz(), $$1.dB());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cee $$1 && this.p % 10 == 0) {
         cpq $$2 = $$1.G();
         if ($$2.d() instanceof cpx) {
            eja $$3 = cpx.d($$2);
            ejc $$4 = cpx.a($$3, this.f);
            if ($$4 != null) {
               for (apb $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  xz<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.d.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.at || this.g.an().a()) {
         if (this.g.bL()) {
            int $$7 = awm.d(this.g.dz() * 256.0F / 360.0F);
            int $$8 = awm.d(this.g.dB() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new acc.c(this.g.aj(), (byte)$$7, (byte)$$8, this.g.aC()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.di());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = awm.d(this.g.dz() * 256.0F / 360.0F);
            int $$11 = awm.d(this.g.dB() * 256.0F / 360.0F);
            eov $$12 = this.g.di();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            xz<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cig) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aC()) {
                  this.t = this.g.aC();
                  this.q = 0;
                  $$14 = new aej(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cig)) {
                  if ($$15) {
                     $$14 = new acc.a(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aC());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new acc.c(this.g.aj(), (byte)$$10, (byte)$$11, this.g.aC());
                     $$18 = true;
                  }
               } else {
                  $$14 = new acc.b(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aC());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.at || this.g instanceof box && ((box)this.g).fy()) && this.p > 0) {
               eov $$23 = this.g.dm();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new ado(this.g.aj(), this.o));
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

         int $$25 = awm.d(this.g.cm() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new acw(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.at = false;
      }

      this.p++;
      if (this.g.S) {
         this.a(new ado(this.g));
         this.g.S = false;
      }
   }

   private static Stream<bof> a(List<bof> $$0, List<bof> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(apb $$0) {
      this.g.d($$0);
      $$0.d.b(new acs(this.g.aj()));
   }

   public void b(apb $$0) {
      List<xz<? super aai>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.d.b(new aau($$1));
      this.g.c($$0);
   }

   public void a(apb $$0, Consumer<xz<aai>> $$1) {
      if (this.g.dE()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      xz<aai> $$2 = this.g.df();
      this.n = awm.d(this.g.cm() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new adm(this.g.aj(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof box) {
         Collection<bqa> $$4 = ((box)this.g).eQ().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new aen(this.g.aj(), $$4));
         }

         if (((box)this.g).fy()) {
            $$3 = true;
         }
      }

      this.o = this.g.dm();
      if ($$3 && !(this.g instanceof box)) {
         $$1.accept(new ado(this.g.aj(), this.o));
      }

      if (this.g instanceof box) {
         List<Pair<bom, cpq>> $$5 = Lists.newArrayList();

         for (bom $$6 : bom.values()) {
            cpq $$7 = ((box)this.g).c($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.q()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new adp(this.g.aj(), $$5));
         }
      }

      if (!this.g.cM().isEmpty()) {
         $$1.accept(new adt(this.g));
      }

      if (this.g.bL()) {
         $$1.accept(new adt(this.g.cW()));
      }

      if (this.g instanceof boz $$8 && $$8.fZ()) {
         $$1.accept(new adn($$8, $$8.ga()));
      }
   }

   private void b() {
      ail $$0 = this.g.an();
      List<ail.b<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new adm(this.g.aj(), $$1));
      }

      if (this.g instanceof box) {
         Set<bqa> $$2 = ((box)this.g).eQ().a();
         if (!$$2.isEmpty()) {
            this.a(new aen(this.g.aj(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(xz<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof apb) {
         ((apb)this.g).d.b($$0);
      }
   }
}
