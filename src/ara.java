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

public class ara {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final arc f;
   private final buj g;
   private final int h;
   private final boolean i;
   private final Consumer<yv<?>> j;
   private final aih k = new aih();
   private byte l;
   private byte m;
   private byte n;
   private fay o;
   private int p;
   private int q;
   private List<buj> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<akb.c<?>> u;

   public ara(arc $$0, buj $$1, int $$2, boolean $$3, Consumer<yv<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dv());
      this.o = $$1.dz();
      this.l = ayy.g($$1.dM());
      this.m = ayy.g($$1.dO());
      this.n = ayy.g($$1.cA());
      this.t = $$1.aJ();
      this.u = $$1.au().c();
   }

   public void a() {
      List<buj> $$0 = this.g.cZ();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afc(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof ard $$1) {
               $$1.f.a($$1.dB(), $$1.dD(), $$1.dH(), $$1.dM(), $$1.dO());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof ckt $$1 && this.p % 10 == 0) {
         cwn $$2 = $$1.A();
         if ($$2.h() instanceof cxa) {
            eup $$3 = $$2.a(kv.L);
            eur $$4 = cxa.a($$3, this.f);
            if ($$4 != null) {
               for (ard $$5 : this.f.z()) {
                  $$4.a($$5, $$2);
                  yv<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.f.b($$6);
                  }
               }
            }
         }

         this.g();
      }

      if (this.p % this.h == 0 || this.g.ar || this.g.au().a()) {
         byte $$7 = ayy.g(this.g.dM());
         byte $$8 = ayy.g(this.g.dO());
         boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
         if (this.g.bZ()) {
            if ($$9) {
               this.j.accept(new adf.c(this.g.ar(), $$7, $$8, this.g.aJ()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dv());
            this.g();
            this.s = true;
         } else {
            label194: {
               if (this.g instanceof cqu $$10 && $$10.l() instanceof crj $$11) {
                  this.a($$11, $$7, $$8, $$9);
                  break label194;
               }

               this.q++;
               fay $$12 = this.g.dv();
               boolean $$13 = this.k.d($$12).h() >= 7.6293945E-6F;
               yv<?> $$14 = null;
               boolean $$15 = $$13 || this.p % 60 == 0;
               boolean $$16 = false;
               boolean $$17 = false;
               long $$18 = this.k.a($$12);
               long $$19 = this.k.b($$12);
               long $$20 = this.k.c($$12);
               boolean $$21 = $$18 < -32768L || $$18 > 32767L || $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L;
               if ($$21 || this.q > 400 || this.s || this.t != this.g.aJ()) {
                  this.t = this.g.aJ();
                  this.q = 0;
                  $$14 = acp.a(this.g);
                  $$16 = true;
                  $$17 = true;
               } else if ((!$$15 || !$$9) && !(this.g instanceof cpc)) {
                  if ($$15) {
                     $$14 = new adf.a(this.g.ar(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), this.g.aJ());
                     $$16 = true;
                  } else if ($$9) {
                     $$14 = new adf.c(this.g.ar(), $$7, $$8, this.g.aJ());
                     $$17 = true;
                  }
               } else {
                  $$14 = new adf.b(this.g.ar(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), $$7, $$8, this.g.aJ());
                  $$16 = true;
                  $$17 = true;
               }

               if (this.g.ar || this.i || this.g instanceof bvf && ((bvf)this.g).fJ()) {
                  fay $$22 = this.g.dz();
                  double $$23 = $$22.g(this.o);
                  if ($$23 > 1.0E-7 || $$23 > 0.0 && $$22.h() == 0.0) {
                     this.o = $$22;
                     if (this.g instanceof cpd $$24) {
                        this.j.accept(new abw(List.of(new aew(this.g.ar(), this.o), new adw($$24.ar(), $$24.c))));
                     } else {
                        this.j.accept(new aew(this.g.ar(), this.o));
                     }
                  }
               }

               if ($$14 != null) {
                  this.j.accept($$14);
               }

               this.g();
               if ($$16) {
                  this.k.e($$12);
               }

               if ($$17) {
                  this.l = $$7;
                  this.m = $$8;
               }

               this.s = false;
            }
         }

         byte $$25 = ayy.g(this.g.cA());
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aee(this.g, $$25));
            this.n = $$25;
         }

         this.g.ar = false;
      }

      this.p++;
      if (this.g.T) {
         this.g.T = false;
         this.a(new aew(this.g));
      }
   }

   private void a(crj $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         fay $$4 = this.g.dz();
         double $$5 = $$4.g(this.o);
         fay $$6 = this.g.dv();
         boolean $$7 = this.k.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.p % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new adg(this.g.ar(), List.of(new crj.a(this.g.du(), this.g.dz(), this.g.dM(), this.g.dO(), 1.0F))));
         }
      } else {
         this.j.accept(new adg(this.g.ar(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.l = $$1;
      this.m = $$2;
      this.k.e(this.g.du());
   }

   private static Stream<buj> a(List<buj> $$0, List<buj> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(ard $$0) {
      this.g.e($$0);
      $$0.f.b(new aea(this.g.ar()));
   }

   public void b(ard $$0) {
      List<yv<? super abk>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.f.b(new abw($$1));
      this.g.d($$0);
   }

   public void a(ard $$0, Consumer<yv<abk>> $$1) {
      if (this.g.dR()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      yv<abk> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aeu(this.g.ar(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bvf) {
         Collection<bwj> $$4 = ((bvf)this.g).eY().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new afx(this.g.ar(), $$4));
         }

         if (((bvf)this.g).fJ()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bvf)) {
         $$1.accept(new aew(this.g.ar(), this.o));
      }

      if (this.g instanceof bvf $$5) {
         List<Pair<bur, cwn>> $$6 = Lists.newArrayList();

         for (bur $$7 : bur.i) {
            cwn $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new aex(this.g.ar(), $$6));
         }
      }

      if (!this.g.cZ().isEmpty()) {
         $$1.accept(new afc(this.g));
      }

      if (this.g.bZ()) {
         $$1.accept(new afc(this.g.dl()));
      }

      if (this.g instanceof bvd $$9 && $$9.P_()) {
         $$1.accept(new aev(this.g, $$9.A()));
      }
   }

   public fay b() {
      return this.k.a();
   }

   public fay c() {
      return this.o;
   }

   public float d() {
      return ayy.a(this.m);
   }

   public float e() {
      return ayy.a(this.l);
   }

   public float f() {
      return ayy.a(this.n);
   }

   private void g() {
      akb $$0 = this.g.au();
      List<akb.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aeu(this.g.ar(), $$1));
      }

      if (this.g instanceof bvf) {
         Set<bwj> $$2 = ((bvf)this.g).eY().a();
         if (!$$2.isEmpty()) {
            this.a(new afx(this.g.ar(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(yv<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof ard) {
         ((ard)this.g).f.b($$0);
      }
   }
}
