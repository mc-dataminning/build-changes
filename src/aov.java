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

public class aov {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aow f;
   private final bnq g;
   private final int h;
   private final boolean i;
   private final Consumer<xx<?>> j;
   private final ago k = new ago();
   private int l;
   private int m;
   private int n;
   private enz o = enz.b;
   private int p;
   private int q;
   private List<bnq> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<aih.b<?>> u;

   public aov(aow $$0, bnq $$1, int $$2, boolean $$3, Consumer<xx<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dl());
      this.l = awi.d($$1.dC() * 256.0F / 360.0F);
      this.m = awi.d($$1.dE() * 256.0F / 360.0F);
      this.n = awi.d($$1.cp() * 256.0F / 360.0F);
      this.t = $$1.aC();
      this.u = $$1.an().c();
   }

   public void a() {
      List<bnq> $$0 = this.g.cP();
      if (!$$0.equals(this.r)) {
         this.j.accept(new adq(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aox $$1) {
               $$1.d.a($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cdp $$1 && this.p % 10 == 0) {
         cpd $$2 = $$1.G();
         if ($$2.d() instanceof cpk) {
            Integer $$3 = cpk.d($$2);
            eig $$4 = cpk.a($$3, this.f);
            if ($$4 != null) {
               for (aox $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  xx<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.d.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.at || this.g.an().a()) {
         if (this.g.bO()) {
            int $$7 = awi.d(this.g.dC() * 256.0F / 360.0F);
            int $$8 = awi.d(this.g.dE() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new abz.c(this.g.aj(), (byte)$$7, (byte)$$8, this.g.aC()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dl());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = awi.d(this.g.dC() * 256.0F / 360.0F);
            int $$11 = awi.d(this.g.dE() * 256.0F / 360.0F);
            enz $$12 = this.g.dl();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            xx<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof chr) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aC()) {
                  this.t = this.g.aC();
                  this.q = 0;
                  $$14 = new aeg(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof chr)) {
                  if ($$15) {
                     $$14 = new abz.a(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aC());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new abz.c(this.g.aj(), (byte)$$10, (byte)$$11, this.g.aC());
                     $$18 = true;
                  }
               } else {
                  $$14 = new abz.b(this.g.aj(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aC());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.at || this.g instanceof boi && ((boi)this.g).fw()) && this.p > 0) {
               enz $$23 = this.g.dp();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new adl(this.g.aj(), this.o));
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

         int $$25 = awi.d(this.g.cp() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new act(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.at = false;
      }

      this.p++;
      if (this.g.S) {
         this.a(new adl(this.g));
         this.g.S = false;
      }
   }

   private static Stream<bnq> a(List<bnq> $$0, List<bnq> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aox $$0) {
      this.g.d($$0);
      $$0.d.b(new acp(this.g.aj()));
   }

   public void b(aox $$0) {
      List<xx<? super aag>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.d.b(new aas($$1));
      this.g.c($$0);
   }

   public void a(aox $$0, Consumer<xx<aag>> $$1) {
      if (this.g.dH()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      xx<aag> $$2 = this.g.di();
      this.n = awi.d(this.g.cp() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new adj(this.g.aj(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof boi) {
         Collection<bpl> $$4 = ((boi)this.g).eS().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new aek(this.g.aj(), $$4));
         }

         if (((boi)this.g).fw()) {
            $$3 = true;
         }
      }

      this.o = this.g.dp();
      if ($$3 && !(this.g instanceof boi)) {
         $$1.accept(new adl(this.g.aj(), this.o));
      }

      if (this.g instanceof boi) {
         List<Pair<bnx, cpd>> $$5 = Lists.newArrayList();

         for (bnx $$6 : bnx.values()) {
            cpd $$7 = ((boi)this.g).c($$6);
            if (!$$7.b()) {
               $$5.add(Pair.of($$6, $$7.q()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new adm(this.g.aj(), $$5));
         }
      }

      if (!this.g.cP().isEmpty()) {
         $$1.accept(new adq(this.g));
      }

      if (this.g.bO()) {
         $$1.accept(new adq(this.g.cZ()));
      }

      if (this.g instanceof bok $$8 && $$8.fU()) {
         $$1.accept(new adk($$8, $$8.fV()));
      }
   }

   private void b() {
      aih $$0 = this.g.an();
      List<aih.b<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new adj(this.g.aj(), $$1));
      }

      if (this.g instanceof boi) {
         Set<bpl> $$2 = ((boi)this.g).eS().a();
         if (!$$2.isEmpty()) {
            this.a(new aek(this.g.aj(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(xx<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aox) {
         ((aox)this.g).d.b($$0);
      }
   }
}
