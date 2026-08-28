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

public class arf {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final arg f;
   private final btj g;
   private final int h;
   private final boolean i;
   private final Consumer<zk<?>> j;
   private final aiq k = new aiq();
   private int l;
   private int m;
   private int n;
   private eye o;
   private int p;
   private int q;
   private List<btj> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<akk.c<?>> u;

   public arf(arg $$0, btj $$1, int $$2, boolean $$3, Consumer<zk<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dr());
      this.o = $$1.dv();
      this.l = azc.d($$1.dI() * 256.0F / 360.0F);
      this.m = azc.d($$1.dK() * 256.0F / 360.0F);
      this.n = azc.d($$1.cx() * 256.0F / 360.0F);
      this.t = $$1.aH();
      this.u = $$1.at().c();
   }

   public void a() {
      List<btj> $$0 = this.g.cW();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afn(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof arh $$1) {
               $$1.c.a($$1.dx(), $$1.dz(), $$1.dD(), $$1.dI(), $$1.dK());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cjs $$1 && this.p % 10 == 0) {
         cvl $$2 = $$1.C();
         if ($$2.h() instanceof cvx) {
            ert $$3 = $$2.a(kr.D);
            erv $$4 = cvx.a($$3, this.f);
            if ($$4 != null) {
               for (arh $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zk<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.g();
      }

      if (this.p % this.h == 0 || this.g.as || this.g.at().a()) {
         if (this.g.bW()) {
            int $$7 = azc.d(this.g.dI() * 256.0F / 360.0F);
            int $$8 = azc.d(this.g.dK() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new adt.c(this.g.ap(), (byte)$$7, (byte)$$8, this.g.aH()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dr());
            this.g();
            this.s = true;
         } else {
            label205: {
               if (this.g instanceof cpm $$10 && $$10.m() instanceof cqa $$11) {
                  this.a($$11);
                  break label205;
               }

               this.q++;
               int $$12 = azc.d(this.g.dI() * 256.0F / 360.0F);
               int $$13 = azc.d(this.g.dK() * 256.0F / 360.0F);
               eye $$14 = this.g.dr();
               boolean $$15 = this.k.d($$14).h() >= 7.6293945E-6F;
               zk<?> $$16 = null;
               boolean $$17 = $$15 || this.p % 60 == 0;
               boolean $$18 = Math.abs($$12 - this.l) >= 1 || Math.abs($$13 - this.m) >= 1;
               boolean $$19 = false;
               boolean $$20 = false;
               long $$21 = this.k.a($$14);
               long $$22 = this.k.b($$14);
               long $$23 = this.k.c($$14);
               boolean $$24 = $$21 < -32768L || $$21 > 32767L || $$22 < -32768L || $$22 > 32767L || $$23 < -32768L || $$23 > 32767L;
               if ($$24 || this.q > 400 || this.s || this.t != this.g.aH()) {
                  this.t = this.g.aH();
                  this.q = 0;
                  $$16 = new age(this.g);
                  $$19 = true;
                  $$20 = true;
               } else if ((!$$17 || !$$18) && !(this.g instanceof cnw)) {
                  if ($$17) {
                     $$16 = new adt.a(this.g.ap(), (short)((int)$$21), (short)((int)$$22), (short)((int)$$23), this.g.aH());
                     $$19 = true;
                  } else if ($$18) {
                     $$16 = new adt.c(this.g.ap(), (byte)$$12, (byte)$$13, this.g.aH());
                     $$20 = true;
                  }
               } else {
                  $$16 = new adt.b(this.g.ap(), (short)((int)$$21), (short)((int)$$22), (short)((int)$$23), (byte)$$12, (byte)$$13, this.g.aH());
                  $$19 = true;
                  $$20 = true;
               }

               if ((this.i || this.g.as || this.g instanceof buf && ((buf)this.g).fE()) && this.p > 0) {
                  eye $$25 = this.g.dv();
                  double $$26 = $$25.g(this.o);
                  if ($$26 > 1.0E-7 || $$26 > 0.0 && $$25.h() == 0.0) {
                     this.o = $$25;
                     if (this.g instanceof cnx $$27) {
                        this.j.accept(new acl(List.of(new afh(this.g.ap(), this.o), new aej($$27.ap(), $$27.d))));
                     } else {
                        this.j.accept(new afh(this.g.ap(), this.o));
                     }
                  }
               }

               if ($$16 != null) {
                  this.j.accept($$16);
               }

               this.g();
               if ($$19) {
                  this.k.e($$14);
               }

               if ($$20) {
                  this.l = $$12;
                  this.m = $$13;
               }

               this.s = false;
            }
         }

         int $$28 = azc.d(this.g.cx() * 256.0F / 360.0F);
         if (Math.abs($$28 - this.n) >= 1) {
            this.j.accept(new aep(this.g, (byte)$$28));
            this.n = $$28;
         }

         this.g.as = false;
      }

      this.p++;
      if (this.g.U) {
         this.g.U = false;
         this.a(new afh(this.g));
      }
   }

   private void a(cqa $$0) {
      this.g();
      int $$1 = azc.d(this.g.dI() * 256.0F / 360.0F);
      int $$2 = azc.d(this.g.dK() * 256.0F / 360.0F);
      if ($$0.d.isEmpty()) {
         eye $$3 = this.g.dv();
         double $$4 = $$3.g(this.o);
         eye $$5 = this.g.dr();
         boolean $$6 = this.k.d($$5).h() >= 7.6293945E-6F;
         boolean $$7 = $$6 || this.p % 60 == 0;
         boolean $$8 = Math.abs($$1 - this.l) >= 1 || Math.abs($$2 - this.m) >= 1;
         if ($$7 || $$8 || $$4 > 1.0E-7) {
            this.j.accept(new adu(this.g.ap(), List.of(new cqa.a(this.g.dq(), this.g.dv(), this.g.dI(), this.g.dK(), 1.0F))));
         }
      } else {
         this.j.accept(new adu(this.g.ap(), List.copyOf($$0.d)));
         $$0.d.clear();
      }

      this.l = $$1;
      this.m = $$2;
      this.k.e(this.g.dq());
   }

   private static Stream<btj> a(List<btj> $$0, List<btj> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(arh $$0) {
      this.g.e($$0);
      $$0.c.b(new ael(this.g.ap()));
   }

   public void b(arh $$0) {
      List<zk<? super abz>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new acl($$1));
      this.g.d($$0);
   }

   public void a(arh $$0, Consumer<zk<abz>> $$1) {
      if (this.g.dN()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zk<abz> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aff(this.g.ap(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof buf) {
         Collection<bvi> $$4 = ((buf)this.g).eV().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new agi(this.g.ap(), $$4));
         }

         if (((buf)this.g).fE()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof buf)) {
         $$1.accept(new afh(this.g.ap(), this.o));
      }

      if (this.g instanceof buf) {
         List<Pair<btr, cvl>> $$5 = Lists.newArrayList();

         for (btr $$6 : btr.values()) {
            cvl $$7 = ((buf)this.g).a($$6);
            if (!$$7.f()) {
               $$5.add(Pair.of($$6, $$7.u()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new afi(this.g.ap(), $$5));
         }
      }

      if (!this.g.cW().isEmpty()) {
         $$1.accept(new afn(this.g));
      }

      if (this.g.bW()) {
         $$1.accept(new afn(this.g.dg()));
      }

      if (this.g instanceof bud $$8 && $$8.K_()) {
         $$1.accept(new afg(this.g, $$8.C()));
      }
   }

   public eye b() {
      return this.k.a();
   }

   public eye c() {
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
      akk $$0 = this.g.at();
      List<akk.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aff(this.g.ap(), $$1));
      }

      if (this.g instanceof buf) {
         Set<bvi> $$2 = ((buf)this.g).eV().a();
         if (!$$2.isEmpty()) {
            this.a(new agi(this.g.ap(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zk<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof arh) {
         ((arh)this.g).c.b($$0);
      }
   }
}
