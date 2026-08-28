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

public class arz {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final asb f;
   private final bxe g;
   private final int h;
   private final boolean i;
   private final Consumer<zo<?>> j;
   private final BiConsumer<zo<?>, List<UUID>> k;
   private final aje l = new aje();
   private byte m;
   private byte n;
   private byte o;
   private fgc p;
   private int q;
   private int r;
   private List<bxe> s = Collections.emptyList();
   private boolean t;
   private boolean u;
   @Nullable
   private List<aky.c<?>> v;

   public arz(asb $$0, bxe $$1, int $$2, boolean $$3, Consumer<zo<?>> $$4, BiConsumer<zo<?>, List<UUID>> $$5) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k = $$5;
      this.l.e($$1.du());
      this.p = $$1.dy();
      this.m = azz.g($$1.dL());
      this.n = azz.g($$1.dN());
      this.o = azz.g($$1.cA());
      this.u = $$1.aH();
      this.v = $$1.ar().c();
   }

   public void a() {
      List<bxe> $$0 = this.g.cY();
      if (!$$0.equals(this.s)) {
         List<UUID> $$1 = this.a($$0).map(bxe::cG).toList();
         this.k.accept(new afw(this.g), $$1);
         this.s = $$0;
      }

      if (this.g instanceof cog $$2 && this.q % 10 == 0) {
         dak $$3 = $$2.w();
         if ($$3.h() instanceof dax) {
            ezt $$4 = $$3.a(kl.M);
            ezv $$5 = dax.a($$4, this.f);
            if ($$5 != null) {
               for (asc $$6 : this.f.z()) {
                  $$5.a($$6, $$3);
                  zo<?> $$7 = $$5.a($$4, $$6);
                  if ($$7 != null) {
                     $$6.f.b($$7);
                  }
               }
            }
         }

         this.g();
      }

      if (this.q % this.h == 0 || this.g.ar || this.g.ar().a()) {
         byte $$8 = azz.g(this.g.dL());
         byte $$9 = azz.g(this.g.dN());
         boolean $$10 = Math.abs($$8 - this.m) >= 1 || Math.abs($$9 - this.n) >= 1;
         if (this.g.bY()) {
            if ($$10) {
               this.j.accept(new adz.c(this.g.ao(), $$8, $$9, this.g.aH()));
               this.m = $$8;
               this.n = $$9;
            }

            this.l.e(this.g.du());
            this.g();
            this.t = true;
         } else {
            label194: {
               if (this.g instanceof cuv $$11 && $$11.f() instanceof cvk $$12) {
                  this.a($$12, $$8, $$9, $$10);
                  break label194;
               }

               this.r++;
               fgc $$13 = this.g.du();
               boolean $$14 = this.l.d($$13).h() >= 7.6293945E-6F;
               zo<?> $$15 = null;
               boolean $$16 = $$14 || this.q % 60 == 0;
               boolean $$17 = false;
               boolean $$18 = false;
               long $$19 = this.l.a($$13);
               long $$20 = this.l.b($$13);
               long $$21 = this.l.c($$13);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.r > 400 || this.t || this.u != this.g.aH()) {
                  this.u = this.g.aH();
                  this.r = 0;
                  $$15 = adj.a(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$16 || !$$10) && !(this.g instanceof csq)) {
                  if ($$16) {
                     $$15 = new adz.a(this.g.ao(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aH());
                     $$17 = true;
                  } else if ($$10) {
                     $$15 = new adz.c(this.g.ao(), $$8, $$9, this.g.aH());
                     $$18 = true;
                  }
               } else {
                  $$15 = new adz.b(this.g.ao(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), $$8, $$9, this.g.aH());
                  $$17 = true;
                  $$18 = true;
               }

               if (this.g.ar || this.i || this.g instanceof byf && ((byf)this.g).fJ()) {
                  fgc $$23 = this.g.dy();
                  double $$24 = $$23.g(this.p);
                  if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.h() == 0.0) {
                     this.p = $$23;
                     if (this.g instanceof csr $$25) {
                        this.j.accept(new acq(List.of(new afq(this.g.ao(), this.p), new aeq($$25.ao(), $$25.c))));
                     } else {
                        this.j.accept(new afq(this.g.ao(), this.p));
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

         byte $$26 = azz.g(this.g.cA());
         if (Math.abs($$26 - this.o) >= 1) {
            this.j.accept(new aey(this.g, $$26));
            this.o = $$26;
         }

         this.g.ar = false;
      }

      this.q++;
      if (this.g.T) {
         this.g.T = false;
         this.a(new afq(this.g));
      }
   }

   private Stream<bxe> a(List<bxe> $$0) {
      return Streams.concat(new Stream[]{this.s.stream().filter($$1 -> !$$0.contains($$1)), $$0.stream().filter($$0x -> !this.s.contains($$0x))});
   }

   private void a(cvk $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         fgc $$4 = this.g.dy();
         double $$5 = $$4.g(this.p);
         fgc $$6 = this.g.du();
         boolean $$7 = this.l.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.q % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new aea(this.g.ao(), List.of(new cvk.a(this.g.dt(), this.g.dy(), this.g.dL(), this.g.dN(), 1.0F))));
         }
      } else {
         this.j.accept(new aea(this.g.ao(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.m = $$1;
      this.n = $$2;
      this.l.e(this.g.dt());
   }

   public void a(asc $$0) {
      this.g.e($$0);
      $$0.f.b(new aeu(this.g.ao()));
   }

   public void b(asc $$0) {
      List<zo<? super acf>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.f.b(new acq($$1));
      this.g.d($$0);
   }

   public void a(asc $$0, Consumer<zo<acf>> $$1) {
      if (this.g.dQ()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zo<acf> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.v != null) {
         $$1.accept(new afo(this.g.ao(), this.v));
      }

      boolean $$3 = this.i;
      if (this.g instanceof byf) {
         Collection<bzh> $$4 = ((byf)this.g).fa().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new ags(this.g.ao(), $$4));
         }

         if (((byf)this.g).fJ()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof byf)) {
         $$1.accept(new afq(this.g.ao(), this.p));
      }

      if (this.g instanceof byf $$5) {
         List<Pair<bxo, dak>> $$6 = Lists.newArrayList();

         for (bxo $$7 : bxo.j) {
            dak $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new afr(this.g.ao(), $$6));
         }
      }

      if (!this.g.cY().isEmpty()) {
         $$1.accept(new afw(this.g));
      }

      if (this.g.bY()) {
         $$1.accept(new afw(this.g.dk()));
      }

      if (this.g instanceof byd $$9 && $$9.T_()) {
         $$1.accept(new afp(this.g, $$9.C()));
      }
   }

   public fgc b() {
      return this.l.a();
   }

   public fgc c() {
      return this.p;
   }

   public float d() {
      return azz.a(this.n);
   }

   public float e() {
      return azz.a(this.m);
   }

   public float f() {
      return azz.a(this.o);
   }

   private void g() {
      aky $$0 = this.g.ar();
      List<aky.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.v = $$0.c();
         this.a(new afo(this.g.ao(), $$1));
      }

      if (this.g instanceof byf) {
         Set<bzh> $$2 = ((byf)this.g).fa().a();
         if (!$$2.isEmpty()) {
            this.a(new ags(this.g.ao(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zo<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof asc) {
         ((asc)this.g).f.b($$0);
      }
   }
}
