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

public class akm {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final akn f;
   private final bil g;
   private final int h;
   private final boolean i;
   private final Consumer<va<?>> j;
   private final acw k = new acw();
   private int l;
   private int m;
   private int n;
   private ehi o = ehi.b;
   private int p;
   private int q;
   private List<bil> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<aef.b<?>> u;

   public akm(akn $$0, bil $$1, int $$2, boolean $$3, Consumer<va<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dj());
      this.l = ars.d($$1.dA() * 256.0F / 360.0F);
      this.m = ars.d($$1.dC() * 256.0F / 360.0F);
      this.n = ars.d($$1.co() * 256.0F / 360.0F);
      this.t = $$1.aA();
      this.u = $$1.al().c();
   }

   public void a() {
      List<bil> $$0 = this.g.cP();
      if (!$$0.equals(this.r)) {
         this.j.accept(new aab(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof ako $$1) {
               $$1.c.a($$1.dp(), $$1.dr(), $$1.dv(), $$1.dA(), $$1.dC());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof byb $$1 && this.p % 10 == 0) {
         cja $$2 = $$1.z();
         if ($$2.d() instanceof cjh) {
            Integer $$3 = cjh.d($$2);
            ebr $$4 = cjh.a($$3, this.f);
            if ($$4 != null) {
               for (ako $$5 : this.f.v()) {
                  $$4.a($$5, $$2);
                  va<?> $$6 = $$4.a($$3, $$5);
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
            int $$7 = ars.d(this.g.dA() * 256.0F / 360.0F);
            int $$8 = ars.d(this.g.dC() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new yl.c(this.g.ah(), (byte)$$7, (byte)$$8, this.g.aA()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dj());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = ars.d(this.g.dA() * 256.0F / 360.0F);
            int $$11 = ars.d(this.g.dC() * 256.0F / 360.0F);
            ehi $$12 = this.g.dj();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            va<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cbv) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aA()) {
                  this.t = this.g.aA();
                  this.q = 0;
                  $$14 = new aar(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cbv)) {
                  if ($$15) {
                     $$14 = new yl.a(this.g.ah(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aA());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new yl.c(this.g.ah(), (byte)$$10, (byte)$$11, this.g.aA());
                     $$18 = true;
                  }
               } else {
                  $$14 = new yl.b(this.g.ah(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aA());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.au || this.g instanceof bjb && ((bjb)this.g).fu()) && this.p > 0) {
               ehi $$23 = this.g.dn();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new zw(this.g.ah(), this.o));
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

         int $$25 = ars.d(this.g.co() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new ze(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.au = false;
      }

      this.p++;
      if (this.g.T) {
         this.a(new zw(this.g));
         this.g.T = false;
      }
   }

   private static Stream<bil> a(List<bil> $$0, List<bil> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(ako $$0) {
      this.g.d($$0);
      $$0.c.b(new zb(this.g.ah()));
   }

   public void b(ako $$0) {
      List<va<ws>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new xe($$1));
      this.g.c($$0);
   }

   public void a(ako $$0, Consumer<va<ws>> $$1) {
      if (this.g.dF()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      va<ws> $$2 = this.g.U();
      this.n = ars.d(this.g.co() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new zu(this.g.ah(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bjb) {
         Collection<bkd> $$4 = ((bjb)this.g).eP().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new aat(this.g.ah(), $$4));
         }

         if (((bjb)this.g).fu()) {
            $$3 = true;
         }
      }

      this.o = this.g.dn();
      if ($$3 && !(this.g instanceof bjb)) {
         $$1.accept(new zw(this.g.ah(), this.o));
      }

      if (this.g instanceof bjb) {
         List<Pair<biq, cja>> $$5 = Lists.newArrayList();

         for (biq $$6 : biq.values()) {
            cja $$7 = ((bjb)this.g).c($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.p()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new zx(this.g.ah(), $$5));
         }
      }

      if (!this.g.cP().isEmpty()) {
         $$1.accept(new aab(this.g));
      }

      if (this.g.bN()) {
         $$1.accept(new aab(this.g.cY()));
      }

      if (this.g instanceof bjd $$8 && $$8.fO()) {
         $$1.accept(new zv($$8, $$8.fP()));
      }
   }

   private void b() {
      aef $$0 = this.g.al();
      List<aef.b<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new zu(this.g.ah(), $$1));
      }

      if (this.g instanceof bjb) {
         Set<bkd> $$2 = ((bjb)this.g).eP().a();
         if (!$$2.isEmpty()) {
            this.a(new aat(this.g.ah(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(va<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof ako) {
         ((ako)this.g).c.b($$0);
      }
   }
}
