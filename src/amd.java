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

public class amd {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final ame f;
   private final bkq g;
   private final int h;
   private final boolean i;
   private final Consumer<wk<?>> j;
   private final aei k = new aei();
   private int l;
   private int m;
   private int n;
   private eju o = eju.b;
   private int p;
   private int q;
   private List<bkq> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<afr.b<?>> u;

   public amd(ame $$0, bkq $$1, int $$2, boolean $$3, Consumer<wk<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dm());
      this.l = atm.d($$1.dD() * 256.0F / 360.0F);
      this.m = atm.d($$1.dF() * 256.0F / 360.0F);
      this.n = atm.d($$1.cp() * 256.0F / 360.0F);
      this.t = $$1.aC();
      this.u = $$1.an().c();
   }

   public void a() {
      List<bkq> $$0 = this.g.cQ();
      if (!$$0.equals(this.r)) {
         this.j.accept(new abl(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof amf $$1) {
               $$1.c.a($$1.ds(), $$1.du(), $$1.dy(), $$1.dD(), $$1.dF());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cag $$1 && this.p % 10 == 0) {
         clj $$2 = $$1.G();
         if ($$2.d() instanceof clq) {
            Integer $$3 = clq.d($$2);
            eec $$4 = clq.a($$3, this.f);
            if ($$4 != null) {
               for (amf $$5 : this.f.w()) {
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

      if (this.p % this.h == 0 || this.g.au || this.g.an().a()) {
         if (this.g.bO()) {
            int $$7 = atm.d(this.g.dD() * 256.0F / 360.0F);
            int $$8 = atm.d(this.g.dF() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new zv.c(this.g.aj(), (byte)$$7, (byte)$$8, this.g.aC()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dm());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = atm.d(this.g.dD() * 256.0F / 360.0F);
            int $$11 = atm.d(this.g.dF() * 256.0F / 360.0F);
            eju $$12 = this.g.dm();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            wk<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cea) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aC()) {
                  this.t = this.g.aC();
                  this.q = 0;
                  $$14 = new acb(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cea)) {
                  if ($$15) {
                     $$14 = new zv.a(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aC());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new zv.c(this.g.aj(), (byte)$$10, (byte)$$11, this.g.aC());
                     $$18 = true;
                  }
               } else {
                  $$14 = new zv.b(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aC());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.au || this.g instanceof blg && ((blg)this.g).fx()) && this.p > 0) {
               eju $$23 = this.g.dq();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new abg(this.g.aj(), this.o));
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

         int $$25 = atm.d(this.g.cp() * 256.0F / 360.0F);
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

   private static Stream<bkq> a(List<bkq> $$0, List<bkq> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(amf $$0) {
      this.g.d($$0);
      $$0.c.b(new aal(this.g.aj()));
   }

   public void b(amf $$0) {
      List<wk<yd>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new yo($$1));
      this.g.c($$0);
   }

   public void a(amf $$0, Consumer<wk<yd>> $$1) {
      if (this.g.dI()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      wk<yd> $$2 = this.g.dk();
      this.n = atm.d(this.g.cp() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new abe(this.g.aj(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof blg) {
         Collection<bmi> $$4 = ((blg)this.g).eS().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new acf(this.g.aj(), $$4));
         }

         if (((blg)this.g).fx()) {
            $$3 = true;
         }
      }

      this.o = this.g.dq();
      if ($$3 && !(this.g instanceof blg)) {
         $$1.accept(new abg(this.g.aj(), this.o));
      }

      if (this.g instanceof blg) {
         List<Pair<bkv, clj>> $$5 = Lists.newArrayList();

         for (bkv $$6 : bkv.values()) {
            clj $$7 = ((blg)this.g).c($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.p()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new abh(this.g.aj(), $$5));
         }
      }

      if (!this.g.cQ().isEmpty()) {
         $$1.accept(new abl(this.g));
      }

      if (this.g.bO()) {
         $$1.accept(new abl(this.g.da()));
      }

      if (this.g instanceof bli $$8 && $$8.fT()) {
         $$1.accept(new abf($$8, $$8.fU()));
      }
   }

   private void b() {
      afr $$0 = this.g.an();
      List<afr.b<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new abe(this.g.aj(), $$1));
      }

      if (this.g instanceof blg) {
         Set<bmi> $$2 = ((blg)this.g).eS().a();
         if (!$$2.isEmpty()) {
            this.a(new acf(this.g.aj(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(wk<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof amf) {
         ((amf)this.g).c.b($$0);
      }
   }
}
