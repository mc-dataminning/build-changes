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
   private final bsq g;
   private final int h;
   private final boolean i;
   private final Consumer<zf<?>> j;
   private final aif k = new aif();
   private int l;
   private int m;
   private int n;
   private eww o = eww.b;
   private int p;
   private int q;
   private List<bsq> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<ajz.c<?>> u;

   public aqs(aqt $$0, bsq $$1, int $$2, boolean $$3, Consumer<zf<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dp());
      this.l = ayn.d($$1.dG() * 256.0F / 360.0F);
      this.m = ayn.d($$1.dI() * 256.0F / 360.0F);
      this.n = ayn.d($$1.ct() * 256.0F / 360.0F);
      this.t = $$1.aF();
      this.u = $$1.ar().c();
   }

   public void a() {
      List<bsq> $$0 = this.g.cT();
      if (!$$0.equals(this.r)) {
         this.j.accept(new aff(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aqu $$1) {
               $$1.c.a($$1.dv(), $$1.dx(), $$1.dB(), $$1.dG(), $$1.dI());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof ciy $$1 && this.p % 10 == 0) {
         cuo $$2 = $$1.D();
         if ($$2.g() instanceof cva) {
            eql $$3 = $$2.a(kq.B);
            eqn $$4 = cva.a($$3, this.f);
            if ($$4 != null) {
               for (aqu $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zf<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.av || this.g.ar().a()) {
         if (this.g.bS()) {
            int $$7 = ayn.d(this.g.dG() * 256.0F / 360.0F);
            int $$8 = ayn.d(this.g.dI() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new adn.c(this.g.an(), (byte)$$7, (byte)$$8, this.g.aF()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dp());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = ayn.d(this.g.dG() * 256.0F / 360.0F);
            int $$11 = ayn.d(this.g.dI() * 256.0F / 360.0F);
            eww $$12 = this.g.dp();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            zf<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cnb) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aF()) {
                  this.t = this.g.aF();
                  this.q = 0;
                  $$14 = new afv(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cnb)) {
                  if ($$15) {
                     $$14 = new adn.a(this.g.an(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aF());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new adn.c(this.g.an(), (byte)$$10, (byte)$$11, this.g.aF());
                     $$18 = true;
                  }
               } else {
                  $$14 = new adn.b(this.g.an(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aF());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.av || this.g instanceof btl && ((btl)this.g).fB()) && this.p > 0) {
               eww $$23 = this.g.dt();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  if (this.g instanceof cnc $$25) {
                     this.j.accept(new acf(List.of(new afa(this.g.an(), this.o), new aec($$25.an(), $$25.d))));
                  } else {
                     this.j.accept(new afa(this.g.an(), this.o));
                  }
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

         int $$26 = ayn.d(this.g.ct() * 256.0F / 360.0F);
         if (Math.abs($$26 - this.n) >= 1) {
            this.j.accept(new aei(this.g, (byte)$$26));
            this.n = $$26;
         }

         this.g.av = false;
      }

      this.p++;
      if (this.g.U) {
         this.g.U = false;
         this.a(new afa(this.g));
      }
   }

   private static Stream<bsq> a(List<bsq> $$0, List<bsq> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aqu $$0) {
      this.g.e($$0);
      $$0.c.b(new aee(this.g.an()));
   }

   public void b(aqu $$0) {
      List<zf<? super abt>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new acf($$1));
      this.g.d($$0);
   }

   public void a(aqu $$0, Consumer<zf<abt>> $$1) {
      if (this.g.dL()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zf<abt> $$2 = this.g.dm();
      this.n = ayn.d(this.g.ct() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aey(this.g.an(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof btl) {
         Collection<buq> $$4 = ((btl)this.g).eT().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new afz(this.g.an(), $$4));
         }

         if (((btl)this.g).fB()) {
            $$3 = true;
         }
      }

      this.o = this.g.dt();
      if ($$3 && !(this.g instanceof btl)) {
         $$1.accept(new afa(this.g.an(), this.o));
      }

      if (this.g instanceof btl) {
         List<Pair<bsx, cuo>> $$5 = Lists.newArrayList();

         for (bsx $$6 : bsx.values()) {
            cuo $$7 = ((btl)this.g).a($$6);
            if (!$$7.e()) {
               $$5.add(Pair.of($$6, $$7.s()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new afb(this.g.an(), $$5));
         }
      }

      if (!this.g.cT().isEmpty()) {
         $$1.accept(new aff(this.g));
      }

      if (this.g.bS()) {
         $$1.accept(new aff(this.g.dd()));
      }

      if (this.g instanceof btn $$8 && $$8.fY()) {
         $$1.accept(new aez($$8, $$8.ga()));
      }
   }

   private void b() {
      ajz $$0 = this.g.ar();
      List<ajz.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aey(this.g.an(), $$1));
      }

      if (this.g instanceof btl) {
         Set<buq> $$2 = ((btl)this.g).eT().a();
         if (!$$2.isEmpty()) {
            this.a(new afz(this.g.an(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zf<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aqu) {
         ((aqu)this.g).c.b($$0);
      }
   }
}
