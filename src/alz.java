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

public class alz {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final ama f;
   private final bki g;
   private final int h;
   private final boolean i;
   private final Consumer<wk<?>> j;
   private final aeg k = new aeg();
   private int l;
   private int m;
   private int n;
   private eji o = eji.b;
   private int p;
   private int q;
   private List<bki> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<afp.b<?>> u;

   public alz(ama $$0, bki $$1, int $$2, boolean $$3, Consumer<wk<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dk());
      this.l = ati.d($$1.dB() * 256.0F / 360.0F);
      this.m = ati.d($$1.dD() * 256.0F / 360.0F);
      this.n = ati.d($$1.co() * 256.0F / 360.0F);
      this.t = $$1.aA();
      this.u = $$1.al().c();
   }

   public void a() {
      List<bki> $$0 = this.g.cP();
      if (!$$0.equals(this.r)) {
         this.j.accept(new abl(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof amb $$1) {
               $$1.c.a($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof bzy $$1 && this.p % 10 == 0) {
         clb $$2 = $$1.F();
         if ($$2.d() instanceof cli) {
            Integer $$3 = cli.d($$2);
            edq $$4 = cli.a($$3, this.f);
            if ($$4 != null) {
               for (amb $$5 : this.f.v()) {
                  $$4.a($$5, $$2);
                  wk<?> $$6 = $$4.a($$3, $$5);
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
            int $$7 = ati.d(this.g.dB() * 256.0F / 360.0F);
            int $$8 = ati.d(this.g.dD() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new zv.c(this.g.ah(), (byte)$$7, (byte)$$8, this.g.aA()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dk());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = ati.d(this.g.dB() * 256.0F / 360.0F);
            int $$11 = ati.d(this.g.dD() * 256.0F / 360.0F);
            eji $$12 = this.g.dk();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            wk<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cds) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aA()) {
                  this.t = this.g.aA();
                  this.q = 0;
                  $$14 = new acb(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cds)) {
                  if ($$15) {
                     $$14 = new zv.a(this.g.ah(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aA());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new zv.c(this.g.ah(), (byte)$$10, (byte)$$11, this.g.aA());
                     $$18 = true;
                  }
               } else {
                  $$14 = new zv.b(this.g.ah(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aA());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.au || this.g instanceof bky && ((bky)this.g).fw()) && this.p > 0) {
               eji $$23 = this.g.do();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new abg(this.g.ah(), this.o));
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

         int $$25 = ati.d(this.g.co() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aao(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.au = false;
      }

      this.p++;
      if (this.g.T) {
         this.a(new abg(this.g));
         this.g.T = false;
      }
   }

   private static Stream<bki> a(List<bki> $$0, List<bki> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(amb $$0) {
      this.g.d($$0);
      $$0.c.b(new aal(this.g.ah()));
   }

   public void b(amb $$0) {
      List<wk<yd>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new yo($$1));
      this.g.c($$0);
   }

   public void a(amb $$0, Consumer<wk<yd>> $$1) {
      if (this.g.dG()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      wk<yd> $$2 = this.g.di();
      this.n = ati.d(this.g.co() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new abe(this.g.ah(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bky) {
         Collection<bma> $$4 = ((bky)this.g).eQ().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new acd(this.g.ah(), $$4));
         }

         if (((bky)this.g).fw()) {
            $$3 = true;
         }
      }

      this.o = this.g.do();
      if ($$3 && !(this.g instanceof bky)) {
         $$1.accept(new abg(this.g.ah(), this.o));
      }

      if (this.g instanceof bky) {
         List<Pair<bkn, clb>> $$5 = Lists.newArrayList();

         for (bkn $$6 : bkn.values()) {
            clb $$7 = ((bky)this.g).c($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.p()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new abh(this.g.ah(), $$5));
         }
      }

      if (!this.g.cP().isEmpty()) {
         $$1.accept(new abl(this.g));
      }

      if (this.g.bN()) {
         $$1.accept(new abl(this.g.cY()));
      }

      if (this.g instanceof bla $$8 && $$8.fS()) {
         $$1.accept(new abf($$8, $$8.fT()));
      }
   }

   private void b() {
      afp $$0 = this.g.al();
      List<afp.b<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new abe(this.g.ah(), $$1));
      }

      if (this.g instanceof bky) {
         Set<bma> $$2 = ((bky)this.g).eQ().a();
         if (!$$2.isEmpty()) {
            this.a(new acd(this.g.ah(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(wk<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof amb) {
         ((amb)this.g).c.b($$0);
      }
   }
}
