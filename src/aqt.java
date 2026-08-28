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

public class aqt {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aqu f;
   private final bsr g;
   private final int h;
   private final boolean i;
   private final Consumer<zg<?>> j;
   private final aig k = new aig();
   private int l;
   private int m;
   private int n;
   private exc o;
   private int p;
   private int q;
   private List<bsr> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<aka.c<?>> u;

   public aqt(aqu $$0, bsr $$1, int $$2, boolean $$3, Consumer<zg<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dn());
      this.o = $$1.dr();
      this.l = ayo.d($$1.dE() * 256.0F / 360.0F);
      this.m = ayo.d($$1.dG() * 256.0F / 360.0F);
      this.n = ayo.d($$1.ct() * 256.0F / 360.0F);
      this.t = $$1.aF();
      this.u = $$1.ar().c();
   }

   public void a() {
      List<bsr> $$0 = this.g.cS();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afg(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aqv $$1) {
               $$1.c.a($$1.dt(), $$1.dv(), $$1.dz(), $$1.dE(), $$1.dG());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cja $$1 && this.p % 10 == 0) {
         cuq $$2 = $$1.D();
         if ($$2.g() instanceof cvc) {
            eqr $$3 = $$2.a(kq.B);
            eqt $$4 = cvc.a($$3, this.f);
            if ($$4 != null) {
               for (aqv $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zg<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.g();
      }

      if (this.p % this.h == 0 || this.g.av || this.g.ar().a()) {
         if (this.g.bS()) {
            int $$7 = ayo.d(this.g.dE() * 256.0F / 360.0F);
            int $$8 = ayo.d(this.g.dG() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new ado.c(this.g.an(), (byte)$$7, (byte)$$8, this.g.aF()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dn());
            this.g();
            this.s = true;
         } else {
            this.q++;
            int $$10 = ayo.d(this.g.dE() * 256.0F / 360.0F);
            int $$11 = ayo.d(this.g.dG() * 256.0F / 360.0F);
            exc $$12 = this.g.dn();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            zg<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            long $$19 = this.k.a($$12);
            long $$20 = this.k.b($$12);
            long $$21 = this.k.c($$12);
            boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
            if ($$22 || this.q > 400 || this.s || this.t != this.g.aF()) {
               this.t = this.g.aF();
               this.q = 0;
               $$14 = new afw(this.g);
               $$17 = true;
               $$18 = true;
            } else if ((!$$15 || !$$16) && !(this.g instanceof cnd)) {
               if ($$15) {
                  $$14 = new ado.a(this.g.an(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aF());
                  $$17 = true;
               } else if ($$16) {
                  $$14 = new ado.c(this.g.an(), (byte)$$10, (byte)$$11, this.g.aF());
                  $$18 = true;
               }
            } else {
               $$14 = new ado.b(this.g.an(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aF());
               $$17 = true;
               $$18 = true;
            }

            if ((this.i || this.g.av || this.g instanceof btn && ((btn)this.g).fA()) && this.p > 0) {
               exc $$23 = this.g.dr();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  if (this.g instanceof cne $$25) {
                     this.j.accept(new acg(List.of(new afb(this.g.an(), this.o), new aed($$25.an(), $$25.d))));
                  } else {
                     this.j.accept(new afb(this.g.an(), this.o));
                  }
               }
            }

            if ($$14 != null) {
               this.j.accept($$14);
            }

            this.g();
            if ($$17) {
               this.k.e($$12);
            }

            if ($$18) {
               this.l = $$10;
               this.m = $$11;
            }

            this.s = false;
         }

         int $$26 = ayo.d(this.g.ct() * 256.0F / 360.0F);
         if (Math.abs($$26 - this.n) >= 1) {
            this.j.accept(new aej(this.g, (byte)$$26));
            this.n = $$26;
         }

         this.g.av = false;
      }

      this.p++;
      if (this.g.U) {
         this.g.U = false;
         this.a(new afb(this.g));
      }
   }

   private static Stream<bsr> a(List<bsr> $$0, List<bsr> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aqv $$0) {
      this.g.e($$0);
      $$0.c.b(new aef(this.g.an()));
   }

   public void b(aqv $$0) {
      List<zg<? super abu>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new acg($$1));
      this.g.d($$0);
   }

   public void a(aqv $$0, Consumer<zg<abu>> $$1) {
      if (this.g.dJ()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zg<abu> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aez(this.g.an(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof btn) {
         Collection<bus> $$4 = ((btn)this.g).eS().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new aga(this.g.an(), $$4));
         }

         if (((btn)this.g).fA()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof btn)) {
         $$1.accept(new afb(this.g.an(), this.o));
      }

      if (this.g instanceof btn) {
         List<Pair<bsy, cuq>> $$5 = Lists.newArrayList();

         for (bsy $$6 : bsy.values()) {
            cuq $$7 = ((btn)this.g).a($$6);
            if (!$$7.e()) {
               $$5.add(Pair.of($$6, $$7.s()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new afc(this.g.an(), $$5));
         }
      }

      if (!this.g.cS().isEmpty()) {
         $$1.accept(new afg(this.g));
      }

      if (this.g.bS()) {
         $$1.accept(new afg(this.g.dc()));
      }

      if (this.g instanceof btk $$8 && $$8.N_()) {
         $$1.accept(new afa(this.g, $$8.A()));
      }
   }

   public exc b() {
      return this.k.a();
   }

   public exc c() {
      return this.o;
   }

   public float d() {
      return (float)(this.m * 360) / 256.0F;
   }

   public float e() {
      return (float)(this.l * 360) / 256.0F;
   }

   public float f() {
      return (float)(this.n * 360) / 256.0F;
   }

   private void g() {
      aka $$0 = this.g.ar();
      List<aka.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aez(this.g.an(), $$1));
      }

      if (this.g instanceof btn) {
         Set<bus> $$2 = ((btn)this.g).eS().a();
         if (!$$2.isEmpty()) {
            this.a(new aga(this.g.an(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zg<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aqv) {
         ((aqv)this.g).c.b($$0);
      }
   }
}
