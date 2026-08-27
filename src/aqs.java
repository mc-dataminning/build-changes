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

public class aqs {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aqt f;
   private final brv g;
   private final int h;
   private final boolean i;
   private final Consumer<zl<?>> j;
   private final aii k = new aii();
   private int l;
   private int m;
   private int n;
   private ewu o = ewu.b;
   private int p;
   private int q;
   private List<brv> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<akc.c<?>> u;

   public aqs(aqt $$0, brv $$1, int $$2, boolean $$3, Consumer<zl<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dt());
      this.l = aym.d($$1.dK() * 256.0F / 360.0F);
      this.m = aym.d($$1.dM() * 256.0F / 360.0F);
      this.n = aym.d($$1.cx() * 256.0F / 360.0F);
      this.t = $$1.aE();
      this.u = $$1.ap().c();
   }

   public void a() {
      List<brv> $$0 = this.g.cX();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afi(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aqu $$1) {
               $$1.d.a($$1.dz(), $$1.dB(), $$1.dF(), $$1.dK(), $$1.dM());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof chz $$1 && this.p % 10 == 0) {
         cuh $$2 = $$1.E();
         if ($$2.f() instanceof cuq) {
            eqr $$3 = $$2.a(ke.z);
            eqt $$4 = cuq.a($$3, this.f);
            if ($$4 != null) {
               for (aqu $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zl<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.d.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.az || this.g.ap().a()) {
         if (this.g.bW()) {
            int $$7 = aym.d(this.g.dK() * 256.0F / 360.0F);
            int $$8 = aym.d(this.g.dM() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new adr.c(this.g.al(), (byte)$$7, (byte)$$8, this.g.aE()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dt());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = aym.d(this.g.dK() * 256.0F / 360.0F);
            int $$11 = aym.d(this.g.dM() * 256.0F / 360.0F);
            ewu $$12 = this.g.dt();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            zl<?> $$14 = null;
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
                  $$14 = new afz(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cme)) {
                  if ($$15) {
                     $$14 = new adr.a(this.g.al(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aE());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new adr.c(this.g.al(), (byte)$$10, (byte)$$11, this.g.aE());
                     $$18 = true;
                  }
               } else {
                  $$14 = new adr.b(this.g.al(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aE());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.az || this.g instanceof bso && ((bso)this.g).fN()) && this.p > 0) {
               ewu $$23 = this.g.dx();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new afd(this.g.al(), this.o));
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

         int $$25 = aym.d(this.g.cx() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new ael(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.az = false;
      }

      this.p++;
      if (this.g.V) {
         this.a(new afd(this.g));
         this.g.V = false;
      }
   }

   private static Stream<brv> a(List<brv> $$0, List<brv> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aqu $$0) {
      this.g.d($$0);
      $$0.d.b(new aeh(this.g.al()));
   }

   public void b(aqu $$0) {
      List<zl<? super abw>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.d.b(new acj($$1));
      this.g.c($$0);
   }

   public void a(aqu $$0, Consumer<zl<abw>> $$1) {
      if (this.g.dP()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zl<abw> $$2 = this.g.dq();
      this.n = aym.d(this.g.cx() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new afb(this.g.al(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bso) {
         Collection<btr> $$4 = ((bso)this.g).ff().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new agd(this.g.al(), $$4));
         }

         if (((bso)this.g).fN()) {
            $$3 = true;
         }
      }

      this.o = this.g.dx();
      if ($$3 && !(this.g instanceof bso)) {
         $$1.accept(new afd(this.g.al(), this.o));
      }

      if (this.g instanceof bso) {
         List<Pair<bsc, cuh>> $$5 = Lists.newArrayList();

         for (bsc $$6 : bsc.values()) {
            cuh $$7 = ((bso)this.g).d($$6);
            if (!$$7.d()) {
               $$5.add(Pair.of($$6, $$7.r()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new afe(this.g.al(), $$5));
         }
      }

      if (!this.g.cX().isEmpty()) {
         $$1.accept(new afi(this.g));
      }

      if (this.g.bW()) {
         $$1.accept(new afi(this.g.dh()));
      }

      if (this.g instanceof bsq $$8 && $$8.gl()) {
         $$1.accept(new afc($$8, $$8.gn()));
      }
   }

   private void b() {
      akc $$0 = this.g.ap();
      List<akc.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new afb(this.g.al(), $$1));
      }

      if (this.g instanceof bso) {
         Set<btr> $$2 = ((bso)this.g).ff().a();
         if (!$$2.isEmpty()) {
            this.a(new agd(this.g.al(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zl<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aqu) {
         ((aqu)this.g).d.b($$0);
      }
   }
}
