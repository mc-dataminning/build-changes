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

public class arp {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final arq f;
   private final bui g;
   private final int h;
   private final boolean i;
   private final Consumer<zs<?>> j;
   private final aiy k = new aiy();
   private byte l;
   private byte m;
   private byte n;
   private ezr o;
   private int p;
   private int q;
   private List<bui> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<aks.c<?>> u;

   public arp(arq $$0, bui $$1, int $$2, boolean $$3, Consumer<zs<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dx());
      this.o = $$1.dB();
      this.l = azn.g($$1.dO());
      this.m = azn.g($$1.dQ());
      this.n = azn.g($$1.cC());
      this.t = $$1.aL();
      this.u = $$1.aw().c();
   }

   public void a() {
      List<bui> $$0 = this.g.db();
      if (!$$0.equals(this.r)) {
         this.j.accept(new afv(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof arr $$1) {
               $$1.g.a($$1.dD(), $$1.dF(), $$1.dJ(), $$1.dO(), $$1.dQ());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cks $$1 && this.p % 10 == 0) {
         cwf $$2 = $$1.C();
         if ($$2.h() instanceof cws) {
            etg $$3 = $$2.a(ku.L);
            eti $$4 = cws.a($$3, this.f);
            if ($$4 != null) {
               for (arr $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zs<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.g.b($$6);
                  }
               }
            }
         }

         this.g();
      }

      if (this.p % this.h == 0 || this.g.as || this.g.aw().a()) {
         byte $$7 = azn.g(this.g.dO());
         byte $$8 = azn.g(this.g.dQ());
         boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
         if (this.g.cb()) {
            if ($$9) {
               this.j.accept(new aeb.c(this.g.as(), $$7, $$8, this.g.aL()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dx());
            this.g();
            this.s = true;
         } else {
            label194: {
               if (this.g instanceof cqo $$10 && $$10.m() instanceof crc $$11) {
                  this.a($$11, $$7, $$8, $$9);
                  break label194;
               }

               this.q++;
               ezr $$12 = this.g.dx();
               boolean $$13 = this.k.d($$12).h() >= 7.6293945E-6F;
               zs<?> $$14 = null;
               boolean $$15 = $$13 || this.p % 60 == 0;
               boolean $$16 = false;
               boolean $$17 = false;
               long $$18 = this.k.a($$12);
               long $$19 = this.k.b($$12);
               long $$20 = this.k.c($$12);
               boolean $$21 = $$18 < -32768L || $$18 > 32767L || $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L;
               if ($$21 || this.q > 400 || this.s || this.t != this.g.aL()) {
                  this.t = this.g.aL();
                  this.q = 0;
                  $$14 = new agm(this.g);
                  $$16 = true;
                  $$17 = true;
               } else if ((!$$15 || !$$9) && !(this.g instanceof coy)) {
                  if ($$15) {
                     $$14 = new aeb.a(this.g.as(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), this.g.aL());
                     $$16 = true;
                  } else if ($$9) {
                     $$14 = new aeb.c(this.g.as(), $$7, $$8, this.g.aL());
                     $$17 = true;
                  }
               } else {
                  $$14 = new aeb.b(this.g.as(), (short)((int)$$18), (short)((int)$$19), (short)((int)$$20), $$7, $$8, this.g.aL());
                  $$16 = true;
                  $$17 = true;
               }

               if ((this.i || this.g.as || this.g instanceof bve && ((bve)this.g).fM()) && this.p > 0) {
                  ezr $$22 = this.g.dB();
                  double $$23 = $$22.g(this.o);
                  if ($$23 > 1.0E-7 || $$23 > 0.0 && $$22.h() == 0.0) {
                     this.o = $$22;
                     if (this.g instanceof coz $$24) {
                        this.j.accept(new act(List.of(new afp(this.g.as(), this.o), new aer($$24.as(), $$24.d))));
                     } else {
                        this.j.accept(new afp(this.g.as(), this.o));
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

         byte $$25 = azn.g(this.g.cC());
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aex(this.g, $$25));
            this.n = $$25;
         }

         this.g.as = false;
      }

      this.p++;
      if (this.g.U) {
         this.g.U = false;
         this.a(new afp(this.g));
      }
   }

   private void a(crc $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         ezr $$4 = this.g.dB();
         double $$5 = $$4.g(this.o);
         ezr $$6 = this.g.dx();
         boolean $$7 = this.k.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.p % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new aec(this.g.as(), List.of(new crc.a(this.g.dw(), this.g.dB(), this.g.dO(), this.g.dQ(), 1.0F))));
         }
      } else {
         this.j.accept(new aec(this.g.as(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.l = $$1;
      this.m = $$2;
      this.k.e(this.g.dw());
   }

   private static Stream<bui> a(List<bui> $$0, List<bui> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(arr $$0) {
      this.g.e($$0);
      $$0.g.b(new aet(this.g.as()));
   }

   public void b(arr $$0) {
      List<zs<? super ach>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.g.b(new act($$1));
      this.g.d($$0);
   }

   public void a(arr $$0, Consumer<zs<ach>> $$1) {
      if (this.g.dT()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zs<ach> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new afn(this.g.as(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bve) {
         Collection<bwi> $$4 = ((bve)this.g).fb().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new agq(this.g.as(), $$4));
         }

         if (((bve)this.g).fM()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bve)) {
         $$1.accept(new afp(this.g.as(), this.o));
      }

      if (this.g instanceof bve $$5) {
         List<Pair<buq, cwf>> $$6 = Lists.newArrayList();

         for (buq $$7 : buq.i) {
            cwf $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new afq(this.g.as(), $$6));
         }
      }

      if (!this.g.db().isEmpty()) {
         $$1.accept(new afv(this.g));
      }

      if (this.g.cb()) {
         $$1.accept(new afv(this.g.dm()));
      }

      if (this.g instanceof bvc $$9 && $$9.M_()) {
         $$1.accept(new afo(this.g, $$9.C()));
      }
   }

   public ezr b() {
      return this.k.a();
   }

   public ezr c() {
      return this.o;
   }

   public float d() {
      return azn.a(this.m);
   }

   public float e() {
      return azn.a(this.l);
   }

   public float f() {
      return azn.a(this.n);
   }

   private void g() {
      aks $$0 = this.g.aw();
      List<aks.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new afn(this.g.as(), $$1));
      }

      if (this.g instanceof bve) {
         Set<bwi> $$2 = ((bve)this.g).fb().a();
         if (!$$2.isEmpty()) {
            this.a(new agq(this.g.as(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zs<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof arr) {
         ((arr)this.g).g.b($$0);
      }
   }
}
