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

public class ars {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aru f;
   private final bwv g;
   private final int h;
   private final boolean i;
   private final Consumer<zj<?>> j;
   private final BiConsumer<zj<?>, List<UUID>> k;
   private final aix l = new aix();
   private byte m;
   private byte n;
   private byte o;
   private ffs p;
   private int q;
   private int r;
   private List<bwv> s = Collections.emptyList();
   private boolean t;
   private boolean u;
   @Nullable
   private List<akr.c<?>> v;

   public ars(aru $$0, bwv $$1, int $$2, boolean $$3, Consumer<zj<?>> $$4, BiConsumer<zj<?>, List<UUID>> $$5) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k = $$5;
      this.l.e($$1.du());
      this.p = $$1.dy();
      this.m = azq.g($$1.dL());
      this.n = azq.g($$1.dN());
      this.o = azq.g($$1.cA());
      this.u = $$1.aH();
      this.v = $$1.ar().c();
   }

   public void a() {
      List<bwv> $$0 = this.g.cY();
      if (!$$0.equals(this.s)) {
         List<UUID> $$1 = this.a($$0).map(bwv::cG).toList();
         this.k.accept(new afp(this.g), $$1);
         this.s = $$0;
      }

      if (this.g instanceof cnx $$2 && this.q % 10 == 0) {
         daa $$3 = $$2.w();
         if ($$3.h() instanceof dan) {
            ezj $$4 = $$3.a(kl.M);
            ezl $$5 = dan.a($$4, this.f);
            if ($$5 != null) {
               for (arv $$6 : this.f.z()) {
                  $$5.a($$6, $$3);
                  zj<?> $$7 = $$5.a($$4, $$6);
                  if ($$7 != null) {
                     $$6.f.b($$7);
                  }
               }
            }
         }

         this.g();
      }

      if (this.q % this.h == 0 || this.g.ar || this.g.ar().a()) {
         byte $$8 = azq.g(this.g.dL());
         byte $$9 = azq.g(this.g.dN());
         boolean $$10 = Math.abs($$8 - this.m) >= 1 || Math.abs($$9 - this.n) >= 1;
         if (this.g.bY()) {
            if ($$10) {
               this.j.accept(new ads.c(this.g.ao(), $$8, $$9, this.g.aH()));
               this.m = $$8;
               this.n = $$9;
            }

            this.l.e(this.g.du());
            this.g();
            this.t = true;
         } else {
            label194: {
               if (this.g instanceof cum $$11 && $$11.f() instanceof cvb $$12) {
                  this.a($$12, $$8, $$9, $$10);
                  break label194;
               }

               this.r++;
               ffs $$13 = this.g.du();
               boolean $$14 = this.l.d($$13).h() >= 7.6293945E-6F;
               zj<?> $$15 = null;
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
                  $$15 = adc.a(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$16 || !$$10) && !(this.g instanceof csh)) {
                  if ($$16) {
                     $$15 = new ads.a(this.g.ao(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aH());
                     $$17 = true;
                  } else if ($$10) {
                     $$15 = new ads.c(this.g.ao(), $$8, $$9, this.g.aH());
                     $$18 = true;
                  }
               } else {
                  $$15 = new ads.b(this.g.ao(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), $$8, $$9, this.g.aH());
                  $$17 = true;
                  $$18 = true;
               }

               if (this.g.ar || this.i || this.g instanceof bxw && ((bxw)this.g).fJ()) {
                  ffs $$23 = this.g.dy();
                  double $$24 = $$23.g(this.p);
                  if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.h() == 0.0) {
                     this.p = $$23;
                     if (this.g instanceof csi $$25) {
                        this.j.accept(new acj(List.of(new afj(this.g.ao(), this.p), new aej($$25.ao(), $$25.c))));
                     } else {
                        this.j.accept(new afj(this.g.ao(), this.p));
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

         byte $$26 = azq.g(this.g.cA());
         if (Math.abs($$26 - this.o) >= 1) {
            this.j.accept(new aer(this.g, $$26));
            this.o = $$26;
         }

         this.g.ar = false;
      }

      this.q++;
      if (this.g.T) {
         this.g.T = false;
         this.a(new afj(this.g));
      }
   }

   private Stream<bwv> a(List<bwv> $$0) {
      return Streams.concat(new Stream[]{this.s.stream().filter($$1 -> !$$0.contains($$1)), $$0.stream().filter($$0x -> !this.s.contains($$0x))});
   }

   private void a(cvb $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         ffs $$4 = this.g.dy();
         double $$5 = $$4.g(this.p);
         ffs $$6 = this.g.du();
         boolean $$7 = this.l.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.q % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new adt(this.g.ao(), List.of(new cvb.a(this.g.dt(), this.g.dy(), this.g.dL(), this.g.dN(), 1.0F))));
         }
      } else {
         this.j.accept(new adt(this.g.ao(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.m = $$1;
      this.n = $$2;
      this.l.e(this.g.dt());
   }

   public void a(arv $$0) {
      this.g.e($$0);
      $$0.f.b(new aen(this.g.ao()));
   }

   public void b(arv $$0) {
      List<zj<? super aby>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.f.b(new acj($$1));
      this.g.d($$0);
   }

   public void a(arv $$0, Consumer<zj<aby>> $$1) {
      if (this.g.dQ()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zj<aby> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.v != null) {
         $$1.accept(new afh(this.g.ao(), this.v));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bxw) {
         Collection<byy> $$4 = ((bxw)this.g).fa().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new agl(this.g.ao(), $$4));
         }

         if (((bxw)this.g).fJ()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bxw)) {
         $$1.accept(new afj(this.g.ao(), this.p));
      }

      if (this.g instanceof bxw $$5) {
         List<Pair<bxf, daa>> $$6 = Lists.newArrayList();

         for (bxf $$7 : bxf.j) {
            daa $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new afk(this.g.ao(), $$6));
         }
      }

      if (!this.g.cY().isEmpty()) {
         $$1.accept(new afp(this.g));
      }

      if (this.g.bY()) {
         $$1.accept(new afp(this.g.dk()));
      }

      if (this.g instanceof bxu $$9 && $$9.S_()) {
         $$1.accept(new afi(this.g, $$9.C()));
      }
   }

   public ffs b() {
      return this.l.a();
   }

   public ffs c() {
      return this.p;
   }

   public float d() {
      return azq.a(this.n);
   }

   public float e() {
      return azq.a(this.m);
   }

   public float f() {
      return azq.a(this.o);
   }

   private void g() {
      akr $$0 = this.g.ar();
      List<akr.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.v = $$0.c();
         this.a(new afh(this.g.ao(), $$1));
      }

      if (this.g instanceof bxw) {
         Set<byy> $$2 = ((bxw)this.g).fa().a();
         if (!$$2.isEmpty()) {
            this.a(new agl(this.g.ao(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zj<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof arv) {
         ((arv)this.g).f.b($$0);
      }
   }
}
