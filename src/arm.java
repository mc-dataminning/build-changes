import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
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
   private final aro f;
   private final bwa g;
   private final int h;
   private final boolean i;
   private final Consumer<zd<?>> j;
   private final BiConsumer<zd<?>, List<UUID>> k;
   private final air l = new air();
   private byte m;
   private byte n;
   private byte o;
   private fdw p;
   private int q;
   private int r;
   private List<bwa> s = Collections.emptyList();
   private boolean t;
   private boolean u;
   @Nullable
   private List<akl.c<?>> v;

   public arm(aro $$0, bwa $$1, int $$2, boolean $$3, Consumer<zd<?>> $$4, BiConsumer<zd<?>, List<UUID>> $$5) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k = $$5;
      this.l.e($$1.du());
      this.p = $$1.dy();
      this.m = azk.g($$1.dL());
      this.n = azk.g($$1.dN());
      this.o = azk.g($$1.cA());
      this.u = $$1.aJ();
      this.v = $$1.au().c();
   }

   public void a() {
      List<bwa> $$0 = this.g.cY();
      if (!$$0.equals(this.s)) {
         List<UUID> $$1 = this.a($$0).map(bwa::cG).toList();
         this.k.accept(new afj(this.g), $$1);
         this.s = $$0;
      }

      if (this.g instanceof cmq $$2 && this.q % 10 == 0) {
         cys $$3 = $$2.w();
         if ($$3.h() instanceof czf) {
            exn $$4 = $$3.a(kj.M);
            exp $$5 = czf.a($$4, this.f);
            if ($$5 != null) {
               for (arp $$6 : this.f.z()) {
                  $$5.a($$6, $$3);
                  zd<?> $$7 = $$5.a($$4, $$6);
                  if ($$7 != null) {
                     $$6.f.b($$7);
                  }
               }
            }
         }

         this.g();
      }

      if (this.q % this.h == 0 || this.g.ar || this.g.au().a()) {
         byte $$8 = azk.g(this.g.dL());
         byte $$9 = azk.g(this.g.dN());
         boolean $$10 = Math.abs($$8 - this.m) >= 1 || Math.abs($$9 - this.n) >= 1;
         if (this.g.bZ()) {
            if ($$10) {
               this.j.accept(new adm.c(this.g.ar(), $$8, $$9, this.g.aJ()));
               this.m = $$8;
               this.n = $$9;
            }

            this.l.e(this.g.du());
            this.g();
            this.t = true;
         } else {
            label194: {
               if (this.g instanceof cte $$11 && $$11.f() instanceof ctt $$12) {
                  this.a($$12, $$8, $$9, $$10);
                  break label194;
               }

               this.r++;
               fdw $$13 = this.g.du();
               boolean $$14 = this.l.d($$13).h() >= 7.6293945E-6F;
               zd<?> $$15 = null;
               boolean $$16 = $$14 || this.q % 60 == 0;
               boolean $$17 = false;
               boolean $$18 = false;
               long $$19 = this.l.a($$13);
               long $$20 = this.l.b($$13);
               long $$21 = this.l.c($$13);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.r > 400 || this.t || this.u != this.g.aJ()) {
                  this.u = this.g.aJ();
                  this.r = 0;
                  $$15 = acw.a(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$16 || !$$10) && !(this.g instanceof cqz)) {
                  if ($$16) {
                     $$15 = new adm.a(this.g.ar(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aJ());
                     $$17 = true;
                  } else if ($$10) {
                     $$15 = new adm.c(this.g.ar(), $$8, $$9, this.g.aJ());
                     $$18 = true;
                  }
               } else {
                  $$15 = new adm.b(this.g.ar(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), $$8, $$9, this.g.aJ());
                  $$17 = true;
                  $$18 = true;
               }

               if (this.g.ar || this.i || this.g instanceof bwz && ((bwz)this.g).fI()) {
                  fdw $$23 = this.g.dy();
                  double $$24 = $$23.g(this.p);
                  if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.h() == 0.0) {
                     this.p = $$23;
                     if (this.g instanceof cra $$25) {
                        this.j.accept(new acd(List.of(new afd(this.g.ar(), this.p), new aed($$25.ar(), $$25.c))));
                     } else {
                        this.j.accept(new afd(this.g.ar(), this.p));
                     }
                  }
               }

               if ($$15 != null) {
                  this.j.accept($$15);
               }

               this.g();
               if ($$17) {
                  this.l.e($$13);
               }

               if ($$18) {
                  this.m = $$8;
                  this.n = $$9;
               }

               this.t = false;
            }
         }

         byte $$26 = azk.g(this.g.cA());
         if (Math.abs($$26 - this.o) >= 1) {
            this.j.accept(new ael(this.g, $$26));
            this.o = $$26;
         }

         this.g.ar = false;
      }

      this.q++;
      if (this.g.T) {
         this.g.T = false;
         this.a(new afd(this.g));
      }
   }

   private Stream<bwa> a(List<bwa> $$0) {
      return Streams.concat(new Stream[]{this.s.stream().filter($$1 -> !$$0.contains($$1)), $$0.stream().filter($$0x -> !this.s.contains($$0x))});
   }

   private void a(ctt $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         fdw $$4 = this.g.dy();
         double $$5 = $$4.g(this.p);
         fdw $$6 = this.g.du();
         boolean $$7 = this.l.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.q % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new adn(this.g.ar(), List.of(new ctt.a(this.g.dt(), this.g.dy(), this.g.dL(), this.g.dN(), 1.0F))));
         }
      } else {
         this.j.accept(new adn(this.g.ar(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.m = $$1;
      this.n = $$2;
      this.l.e(this.g.dt());
   }

   public void a(arp $$0) {
      this.g.e($$0);
      $$0.f.b(new aeh(this.g.ar()));
   }

   public void b(arp $$0) {
      List<zd<? super abs>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.f.b(new acd($$1));
      this.g.d($$0);
   }

   public void a(arp $$0, Consumer<zd<abs>> $$1) {
      if (this.g.dQ()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zd<abs> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.v != null) {
         $$1.accept(new afb(this.g.ar(), this.v));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bwz) {
         Collection<byb> $$4 = ((bwz)this.g).eZ().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new agf(this.g.ar(), $$4));
         }

         if (((bwz)this.g).fI()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bwz)) {
         $$1.accept(new afd(this.g.ar(), this.p));
      }

      if (this.g instanceof bwz $$5) {
         List<Pair<bwk, cys>> $$6 = Lists.newArrayList();

         for (bwk $$7 : bwk.j) {
            cys $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new afe(this.g.ar(), $$6));
         }
      }

      if (!this.g.cY().isEmpty()) {
         $$1.accept(new afj(this.g));
      }

      if (this.g.bZ()) {
         $$1.accept(new afj(this.g.dk()));
      }

      if (this.g instanceof bwx $$9 && $$9.O_()) {
         $$1.accept(new afc(this.g, $$9.C()));
      }
   }

   public fdw b() {
      return this.l.a();
   }

   public fdw c() {
      return this.p;
   }

   public float d() {
      return azk.a(this.n);
   }

   public float e() {
      return azk.a(this.m);
   }

   public float f() {
      return azk.a(this.o);
   }

   private void g() {
      akl $$0 = this.g.au();
      List<akl.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.v = $$0.c();
         this.a(new afb(this.g.ar(), $$1));
      }

      if (this.g instanceof bwz) {
         Set<byb> $$2 = ((bwz)this.g).eZ().a();
         if (!$$2.isEmpty()) {
            this.a(new agf(this.g.ar(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zd<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof arp) {
         ((arp)this.g).f.b($$0);
      }
   }
}
