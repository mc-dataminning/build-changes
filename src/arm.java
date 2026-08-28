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

public class arm {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final arn f;
   private final bue g;
   private final int h;
   private final boolean i;
   private final Consumer<zp<?>> j;
   private final aiv k = new aiv();
   private byte l;
   private byte m;
   private byte n;
   private ezn o;
   private int p;
   private int q;
   private List<bue> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<akp.c<?>> u;

   public arm(arn $$0, bue $$1, int $$2, boolean $$3, Consumer<zp<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dw());
      this.o = $$1.dA();
      this.l = azk.g($$1.dN());
      this.m = azk.g($$1.dP());
      this.n = azk.g($$1.cB());
      this.t = $$1.aK();
      this.u = $$1.aw().c();
   }

   public void a() {
      List<bue> $$0 = this.g.da();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afs(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aro $$1) {
               $$1.g.a($$1.dC(), $$1.dE(), $$1.dI(), $$1.dN(), $$1.dP());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cko $$1 && this.p % 10 == 0) {
         cwb $$2 = $$1.C();
         if ($$2.h() instanceof cwo) {
            etc $$3 = $$2.a(ku.L);
            ete $$4 = cwo.a($$3, this.f);
            if ($$4 != null) {
               for (aro $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zp<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.g.b($$6);
                  }
               }
            }
         }

         this.g();
      }

      if (this.p % this.h == 0 || this.g.as || this.g.aw().a()) {
         byte $$7 = azk.g(this.g.dN());
         byte $$8 = azk.g(this.g.dP());
         boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
         if (this.g.ca()) {
            if ($$9) {
               this.j.accept(new ady.c(this.g.as(), $$7, $$8, this.g.aK()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dw());
            this.g();
            this.s = true;
         } else {
            label194: {
               if (this.g instanceof cqk $$10 && $$10.m() instanceof cqy $$11) {
                  this.a($$11, $$7, $$8, $$9);
                  break label194;
               }

               this.q++;
               ezn $$12 = this.g.dw();
               boolean $$13 = this.k.d($$12).h() >= 7.6293945E-6F;
               zp<?> $$14 = null;
               boolean $$15 = $$13 || this.p % 60 == 0;
               boolean $$16 = false;
               boolean $$17 = false;
               long $$18 = this.k.a($$12);
               long $$19 = this.k.b($$12);
               long $$20 = this.k.c($$12);
               boolean $$21 = $$18 < -32768L || $$18 > 32767L || $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L;
               if ($$21 || this.q > 400 || this.s || this.t != this.g.aK()) {
                  this.t = this.g.aK();
                  this.q = 0;
                  $$14 = new agj(this.g);
                  $$16 = true;
                  $$17 = true;
               } else if ((!$$15 || !$$9) && !(this.g instanceof cou)) {
                  if ($$15) {
                     $$14 = new ady.a(this.g.as(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), this.g.aK());
                     $$16 = true;
                  } else if ($$9) {
                     $$14 = new ady.c(this.g.as(), $$7, $$8, this.g.aK());
                     $$17 = true;
                  }
               } else {
                  $$14 = new ady.b(this.g.as(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), $$7, $$8, this.g.aK());
                  $$16 = true;
                  $$17 = true;
               }

               if ((this.i || this.g.as || this.g instanceof bva && ((bva)this.g).fL()) && this.p > 0) {
                  ezn $$22 = this.g.dA();
                  double $$23 = $$22.g(this.o);
                  if ($$23 > 1.0E-7 || $$23 > 0.0 && $$22.h() == 0.0) {
                     this.o = $$22;
                     if (this.g instanceof cov $$24) {
                        this.j.accept(new acq(List.of(new afm(this.g.as(), this.o), new aeo($$24.as(), $$24.d))));
                     } else {
                        this.j.accept(new afm(this.g.as(), this.o));
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

         byte $$25 = azk.g(this.g.cB());
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aeu(this.g, $$25));
            this.n = $$25;
         }

         this.g.as = false;
      }

      this.p++;
      if (this.g.U) {
         this.g.U = false;
         this.a(new afm(this.g));
      }
   }

   private void a(cqy $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         ezn $$4 = this.g.dA();
         double $$5 = $$4.g(this.o);
         ezn $$6 = this.g.dw();
         boolean $$7 = this.k.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.p % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new adz(this.g.as(), List.of(new cqy.a(this.g.dv(), this.g.dA(), this.g.dN(), this.g.dP(), 1.0F))));
         }
      } else {
         this.j.accept(new adz(this.g.as(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.l = $$1;
      this.m = $$2;
      this.k.e(this.g.dv());
   }

   private static Stream<bue> a(List<bue> $$0, List<bue> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aro $$0) {
      this.g.e($$0);
      $$0.g.b(new aeq(this.g.as()));
   }

   public void b(aro $$0) {
      List<zp<? super ace>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.g.b(new acq($$1));
      this.g.d($$0);
   }

   public void a(aro $$0, Consumer<zp<ace>> $$1) {
      if (this.g.dS()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zp<ace> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new afk(this.g.as(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bva) {
         Collection<bwe> $$4 = ((bva)this.g).fa().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new agn(this.g.as(), $$4));
         }

         if (((bva)this.g).fL()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bva)) {
         $$1.accept(new afm(this.g.as(), this.o));
      }

      if (this.g instanceof bva $$5) {
         List<Pair<bum, cwb>> $$6 = Lists.newArrayList();

         for (bum $$7 : bum.i) {
            cwb $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new afn(this.g.as(), $$6));
         }
      }

      if (!this.g.da().isEmpty()) {
         $$1.accept(new afs(this.g));
      }

      if (this.g.ca()) {
         $$1.accept(new afs(this.g.dl()));
      }

      if (this.g instanceof buy $$9 && $$9.M_()) {
         $$1.accept(new afl(this.g, $$9.C()));
      }
   }

   public ezn b() {
      return this.k.a();
   }

   public ezn c() {
      return this.o;
   }

   public float d() {
      return azk.a(this.m);
   }

   public float e() {
      return azk.a(this.l);
   }

   public float f() {
      return azk.a(this.n);
   }

   private void g() {
      akp $$0 = this.g.aw();
      List<akp.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new afk(this.g.as(), $$1));
      }

      if (this.g instanceof bva) {
         Set<bwe> $$2 = ((bva)this.g).fa().a();
         if (!$$2.isEmpty()) {
            this.a(new agn(this.g.as(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zp<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aro) {
         ((aro)this.g).g.b($$0);
      }
   }
}
