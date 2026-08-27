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

public class ape {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final apf f;
   private final box g;
   private final int h;
   private final boolean i;
   private final Consumer<yb<?>> j;
   private final agw k = new agw();
   private int l;
   private int m;
   private int n;
   private ept o = ept.b;
   private int p;
   private int q;
   private List<box> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<aiq.c<?>> u;

   public ape(apf $$0, box $$1, int $$2, boolean $$3, Consumer<yb<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dl());
      this.l = aww.d($$1.dC() * 256.0F / 360.0F);
      this.m = aww.d($$1.dE() * 256.0F / 360.0F);
      this.n = aww.d($$1.cp() * 256.0F / 360.0F);
      this.t = $$1.aC();
      this.u = $$1.an().c();
   }

   public void a() {
      List<box> $$0 = this.g.cP();
      if (!$$0.equals(this.r)) {
         this.j.accept(new adx(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof apg $$1) {
               $$1.d.a($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cex $$1 && this.p % 10 == 0) {
         cqm $$2 = $$1.E();
         if ($$2.d() instanceof cqt) {
            ejy $$3 = cqt.d($$2);
            eka $$4 = cqt.a($$3, this.f);
            if ($$4 != null) {
               for (apg $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  yb<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.d.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.au || this.g.an().a()) {
         if (this.g.bO()) {
            int $$7 = aww.d(this.g.dC() * 256.0F / 360.0F);
            int $$8 = aww.d(this.g.dE() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new acg.c(this.g.aj(), (byte)$$7, (byte)$$8, this.g.aC()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dl());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = aww.d(this.g.dC() * 256.0F / 360.0F);
            int $$11 = aww.d(this.g.dE() * 256.0F / 360.0F);
            ept $$12 = this.g.dl();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            yb<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cja) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aC()) {
                  this.t = this.g.aC();
                  this.q = 0;
                  $$14 = new aen(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cja)) {
                  if ($$15) {
                     $$14 = new acg.a(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aC());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new acg.c(this.g.aj(), (byte)$$10, (byte)$$11, this.g.aC());
                     $$18 = true;
                  }
               } else {
                  $$14 = new acg.b(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aC());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.au || this.g instanceof bpp && ((bpp)this.g).fB()) && this.p > 0) {
               ept $$23 = this.g.dp();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new ads(this.g.aj(), this.o));
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

         int $$25 = aww.d(this.g.cp() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new ada(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.au = false;
      }

      this.p++;
      if (this.g.T) {
         this.a(new ads(this.g));
         this.g.T = false;
      }
   }

   private static Stream<box> a(List<box> $$0, List<box> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(apg $$0) {
      this.g.d($$0);
      $$0.d.b(new acw(this.g.aj()));
   }

   public void b(apg $$0) {
      List<yb<? super aam>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.d.b(new aay($$1));
      this.g.c($$0);
   }

   public void a(apg $$0, Consumer<yb<aam>> $$1) {
      if (this.g.dH()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      yb<aam> $$2 = this.g.di();
      this.n = aww.d(this.g.cp() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new adq(this.g.aj(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bpp) {
         Collection<bqs> $$4 = ((bpp)this.g).eT().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new aer(this.g.aj(), $$4));
         }

         if (((bpp)this.g).fB()) {
            $$3 = true;
         }
      }

      this.o = this.g.dp();
      if ($$3 && !(this.g instanceof bpp)) {
         $$1.accept(new ads(this.g.aj(), this.o));
      }

      if (this.g instanceof bpp) {
         List<Pair<bpe, cqm>> $$5 = Lists.newArrayList();

         for (bpe $$6 : bpe.values()) {
            cqm $$7 = ((bpp)this.g).d($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.q()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new adt(this.g.aj(), $$5));
         }
      }

      if (!this.g.cP().isEmpty()) {
         $$1.accept(new adx(this.g));
      }

      if (this.g.bO()) {
         $$1.accept(new adx(this.g.cZ()));
      }

      if (this.g instanceof bpr $$8 && $$8.gb()) {
         $$1.accept(new adr($$8, $$8.gc()));
      }
   }

   private void b() {
      aiq $$0 = this.g.an();
      List<aiq.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new adq(this.g.aj(), $$1));
      }

      if (this.g instanceof bpp) {
         Set<bqs> $$2 = ((bpp)this.g).eT().a();
         if (!$$2.isEmpty()) {
            this.a(new aer(this.g.aj(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(yb<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof apg) {
         ((apg)this.g).d.b($$0);
      }
   }
}
