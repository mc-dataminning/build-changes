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

public class aqm {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aqn f;
   private final brw g;
   private final int h;
   private final boolean i;
   private final Consumer<ze<?>> j;
   private final aic k = new aic();
   private int l;
   private int m;
   private int n;
   private eum o = eum.b;
   private int p;
   private int q;
   private List<brw> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<ajw.c<?>> u;

   public aqm(aqn $$0, brw $$1, int $$2, boolean $$3, Consumer<ze<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.do());
      this.l = ayf.d($$1.dF() * 256.0F / 360.0F);
      this.m = ayf.d($$1.dH() * 256.0F / 360.0F);
      this.n = ayf.d($$1.cs() * 256.0F / 360.0F);
      this.t = $$1.aE();
      this.u = $$1.ap().c();
   }

   public void a() {
      List<brw> $$0 = this.g.cS();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afc(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aqo $$1) {
               $$1.c.a($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cib $$1 && this.p % 10 == 0) {
         ctq $$2 = $$1.E();
         if ($$2.g() instanceof cty) {
            eoj $$3 = $$2.a(kb.A);
            eol $$4 = cty.a($$3, this.f);
            if ($$4 != null) {
               for (aqo $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  ze<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.av || this.g.ap().a()) {
         if (this.g.bR()) {
            int $$7 = ayf.d(this.g.dF() * 256.0F / 360.0F);
            int $$8 = ayf.d(this.g.dH() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new adk.c(this.g.al(), (byte)$$7, (byte)$$8, this.g.aE()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.do());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = ayf.d(this.g.dF() * 256.0F / 360.0F);
            int $$11 = ayf.d(this.g.dH() * 256.0F / 360.0F);
            eum $$12 = this.g.do();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            ze<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cme) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aE()) {
                  this.t = this.g.aE();
                  this.q = 0;
                  $$14 = new afs(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cme)) {
                  if ($$15) {
                     $$14 = new adk.a(this.g.al(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aE());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new adk.c(this.g.al(), (byte)$$10, (byte)$$11, this.g.aE());
                     $$18 = true;
                  }
               } else {
                  $$14 = new adk.b(this.g.al(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aE());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.av || this.g instanceof bsq && ((bsq)this.g).fE()) && this.p > 0) {
               eum $$23 = this.g.ds();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new aex(this.g.al(), this.o));
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

         int $$25 = ayf.d(this.g.cs() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aef(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.av = false;
      }

      this.p++;
      if (this.g.U) {
         this.a(new aex(this.g));
         if (this.g instanceof cmf $$26) {
            this.a(new adz($$26.al(), $$26.c, $$26.d, $$26.e));
         }

         this.g.U = false;
      }
   }

   private static Stream<brw> a(List<brw> $$0, List<brw> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aqo $$0) {
      this.g.d($$0);
      $$0.c.b(new aeb(this.g.al()));
   }

   public void b(aqo $$0) {
      List<ze<? super abq>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new acc($$1));
      this.g.c($$0);
   }

   public void a(aqo $$0, Consumer<ze<abq>> $$1) {
      if (this.g.dK()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      ze<abq> $$2 = this.g.dl();
      this.n = ayf.d(this.g.cs() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aev(this.g.al(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bsq) {
         Collection<btu> $$4 = ((bsq)this.g).eW().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new afw(this.g.al(), $$4));
         }

         if (((bsq)this.g).fE()) {
            $$3 = true;
         }
      }

      this.o = this.g.ds();
      if ($$3 && !(this.g instanceof bsq)) {
         $$1.accept(new aex(this.g.al(), this.o));
      }

      if (this.g instanceof bsq) {
         List<Pair<bsd, ctq>> $$5 = Lists.newArrayList();

         for (bsd $$6 : bsd.values()) {
            ctq $$7 = ((bsq)this.g).a($$6);
            if (!$$7.e()) {
               $$5.add(Pair.of($$6, $$7.s()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new aey(this.g.al(), $$5));
         }
      }

      if (!this.g.cS().isEmpty()) {
         $$1.accept(new afc(this.g));
      }

      if (this.g.bR()) {
         $$1.accept(new afc(this.g.dc()));
      }

      if (this.g instanceof bss $$8 && $$8.gc()) {
         $$1.accept(new aew($$8, $$8.ge()));
      }
   }

   private void b() {
      ajw $$0 = this.g.ap();
      List<ajw.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aev(this.g.al(), $$1));
      }

      if (this.g instanceof bsq) {
         Set<btu> $$2 = ((bsq)this.g).eW().a();
         if (!$$2.isEmpty()) {
            this.a(new afw(this.g.al(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(ze<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aqo) {
         ((aqo)this.g).c.b($$0);
      }
   }
}
