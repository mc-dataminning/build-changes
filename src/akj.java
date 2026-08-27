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

public class akj {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final akk f;
   private final bii g;
   private final int h;
   private final boolean i;
   private final Consumer<ux<?>> j;
   private final act k = new act();
   private int l;
   private int m;
   private int n;
   private ehd o = ehd.b;
   private int p;
   private int q;
   private List<bii> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<aec.b<?>> u;

   public akj(akk $$0, bii $$1, int $$2, boolean $$3, Consumer<ux<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dj());
      this.l = arp.d($$1.dA() * 256.0F / 360.0F);
      this.m = arp.d($$1.dC() * 256.0F / 360.0F);
      this.n = arp.d($$1.co() * 256.0F / 360.0F);
      this.t = $$1.aA();
      this.u = $$1.al().c();
   }

   public void a() {
      List<bii> $$0 = this.g.cP();
      if (!$$0.equals(this.r)) {
         this.j.accept(new zy(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof akl $$1) {
               $$1.c.a($$1.dp(), $$1.dr(), $$1.dv(), $$1.dA(), $$1.dC());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof bxy $$1 && this.p % 10 == 0) {
         cix $$2 = $$1.z();
         if ($$2.d() instanceof cje) {
            Integer $$3 = cje.d($$2);
            ebm $$4 = cje.a($$3, this.f);
            if ($$4 != null) {
               for (akl $$5 : this.f.v()) {
                  $$4.a($$5, $$2);
                  ux<?> $$6 = $$4.a($$3, $$5);
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
            int $$7 = arp.d(this.g.dA() * 256.0F / 360.0F);
            int $$8 = arp.d(this.g.dC() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new yi.c(this.g.ah(), (byte)$$7, (byte)$$8, this.g.aA()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dj());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = arp.d(this.g.dA() * 256.0F / 360.0F);
            int $$11 = arp.d(this.g.dC() * 256.0F / 360.0F);
            ehd $$12 = this.g.dj();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            ux<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cbs) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aA()) {
                  this.t = this.g.aA();
                  this.q = 0;
                  $$14 = new aao(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cbs)) {
                  if ($$15) {
                     $$14 = new yi.a(this.g.ah(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aA());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new yi.c(this.g.ah(), (byte)$$10, (byte)$$11, this.g.aA());
                     $$18 = true;
                  }
               } else {
                  $$14 = new yi.b(this.g.ah(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aA());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.au || this.g instanceof biy && ((biy)this.g).fu()) && this.p > 0) {
               ehd $$23 = this.g.dn();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new zt(this.g.ah(), this.o));
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

         int $$25 = arp.d(this.g.co() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new zb(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.au = false;
      }

      this.p++;
      if (this.g.T) {
         this.a(new zt(this.g));
         this.g.T = false;
      }
   }

   private static Stream<bii> a(List<bii> $$0, List<bii> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(akl $$0) {
      this.g.d($$0);
      $$0.c.b(new yy(this.g.ah()));
   }

   public void b(akl $$0) {
      List<ux<wp>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new xb($$1));
      this.g.c($$0);
   }

   public void a(akl $$0, Consumer<ux<wp>> $$1) {
      if (this.g.dF()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      ux<wp> $$2 = this.g.U();
      this.n = arp.d(this.g.co() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new zr(this.g.ah(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof biy) {
         Collection<bka> $$4 = ((biy)this.g).eP().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new aaq(this.g.ah(), $$4));
         }

         if (((biy)this.g).fu()) {
            $$3 = true;
         }
      }

      this.o = this.g.dn();
      if ($$3 && !(this.g instanceof biy)) {
         $$1.accept(new zt(this.g.ah(), this.o));
      }

      if (this.g instanceof biy) {
         List<Pair<bin, cix>> $$5 = Lists.newArrayList();

         for (bin $$6 : bin.values()) {
            cix $$7 = ((biy)this.g).c($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.p()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new zu(this.g.ah(), $$5));
         }
      }

      if (!this.g.cP().isEmpty()) {
         $$1.accept(new zy(this.g));
      }

      if (this.g.bN()) {
         $$1.accept(new zy(this.g.cY()));
      }

      if (this.g instanceof bja $$8 && $$8.fO()) {
         $$1.accept(new zs($$8, $$8.fP()));
      }
   }

   private void b() {
      aec $$0 = this.g.al();
      List<aec.b<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new zr(this.g.ah(), $$1));
      }

      if (this.g instanceof biy) {
         Set<bka> $$2 = ((biy)this.g).eP().a();
         if (!$$2.isEmpty()) {
            this.a(new aaq(this.g.ah(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(ux<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof akl) {
         ((akl)this.g).c.b($$0);
      }
   }
}
