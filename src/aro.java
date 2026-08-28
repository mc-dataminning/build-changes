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

public class aro {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final arq f;
   private final bwi g;
   private final int h;
   private final boolean i;
   private final Consumer<zf<?>> j;
   private final BiConsumer<zf<?>, List<UUID>> k;
   private final ait l = new ait();
   private byte m;
   private byte n;
   private byte o;
   private ffc p;
   private int q;
   private int r;
   private List<bwi> s = Collections.emptyList();
   private boolean t;
   private boolean u;
   @Nullable
   private List<akn.c<?>> v;

   public aro(arq $$0, bwi $$1, int $$2, boolean $$3, Consumer<zf<?>> $$4, BiConsumer<zf<?>, List<UUID>> $$5) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k = $$5;
      this.l.e($$1.dt());
      this.p = $$1.dx();
      this.m = azm.g($$1.dK());
      this.n = azm.g($$1.dM());
      this.o = azm.g($$1.cz());
      this.u = $$1.aH();
      this.v = $$1.ar().c();
   }

   public void a() {
      List<bwi> $$0 = this.g.cX();
      if (!$$0.equals(this.s)) {
         List<UUID> $$1 = this.a($$0).map(bwi::cF).toList();
         this.k.accept(new afl(this.g), $$1);
         this.s = $$0;
      }

      if (this.g instanceof cnk $$2 && this.q % 10 == 0) {
         czn $$3 = $$2.w();
         if ($$3.h() instanceof daa) {
            eyt $$4 = $$3.a(kk.M);
            eyv $$5 = daa.a($$4, this.f);
            if ($$5 != null) {
               for (arr $$6 : this.f.z()) {
                  $$5.a($$6, $$3);
                  zf<?> $$7 = $$5.a($$4, $$6);
                  if ($$7 != null) {
                     $$6.f.b($$7);
                  }
               }
            }
         }

         this.g();
      }

      if (this.q % this.h == 0 || this.g.ar || this.g.ar().a()) {
         byte $$8 = azm.g(this.g.dK());
         byte $$9 = azm.g(this.g.dM());
         boolean $$10 = Math.abs($$8 - this.m) >= 1 || Math.abs($$9 - this.n) >= 1;
         if (this.g.bX()) {
            if ($$10) {
               this.j.accept(new ado.c(this.g.ao(), $$8, $$9, this.g.aH()));
               this.m = $$8;
               this.n = $$9;
            }

            this.l.e(this.g.dt());
            this.g();
            this.t = true;
         } else {
            label194: {
               if (this.g instanceof ctz $$11 && $$11.f() instanceof cuo $$12) {
                  this.a($$12, $$8, $$9, $$10);
                  break label194;
               }

               this.r++;
               ffc $$13 = this.g.dt();
               boolean $$14 = this.l.d($$13).h() >= 7.6293945E-6F;
               zf<?> $$15 = null;
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
                  $$15 = acy.a(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$16 || !$$10) && !(this.g instanceof cru)) {
                  if ($$16) {
                     $$15 = new ado.a(this.g.ao(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aH());
                     $$17 = true;
                  } else if ($$10) {
                     $$15 = new ado.c(this.g.ao(), $$8, $$9, this.g.aH());
                     $$18 = true;
                  }
               } else {
                  $$15 = new ado.b(this.g.ao(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), $$8, $$9, this.g.aH());
                  $$17 = true;
                  $$18 = true;
               }

               if (this.g.ar || this.i || this.g instanceof bxj && ((bxj)this.g).fI()) {
                  ffc $$23 = this.g.dx();
                  double $$24 = $$23.g(this.p);
                  if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.h() == 0.0) {
                     this.p = $$23;
                     if (this.g instanceof crv $$25) {
                        this.j.accept(new acf(List.of(new aff(this.g.ao(), this.p), new aef($$25.ao(), $$25.c))));
                     } else {
                        this.j.accept(new aff(this.g.ao(), this.p));
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

         byte $$26 = azm.g(this.g.cz());
         if (Math.abs($$26 - this.o) >= 1) {
            this.j.accept(new aen(this.g, $$26));
            this.o = $$26;
         }

         this.g.ar = false;
      }

      this.q++;
      if (this.g.T) {
         this.g.T = false;
         this.a(new aff(this.g));
      }
   }

   private Stream<bwi> a(List<bwi> $$0) {
      return Streams.concat(new Stream[]{this.s.stream().filter($$1 -> !$$0.contains($$1)), $$0.stream().filter($$0x -> !this.s.contains($$0x))});
   }

   private void a(cuo $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         ffc $$4 = this.g.dx();
         double $$5 = $$4.g(this.p);
         ffc $$6 = this.g.dt();
         boolean $$7 = this.l.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.q % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new adp(this.g.ao(), List.of(new cuo.a(this.g.ds(), this.g.dx(), this.g.dK(), this.g.dM(), 1.0F))));
         }
      } else {
         this.j.accept(new adp(this.g.ao(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.m = $$1;
      this.n = $$2;
      this.l.e(this.g.ds());
   }

   public void a(arr $$0) {
      this.g.e($$0);
      $$0.f.b(new aej(this.g.ao()));
   }

   public void b(arr $$0) {
      List<zf<? super abu>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.f.b(new acf($$1));
      this.g.d($$0);
   }

   public void a(arr $$0, Consumer<zf<abu>> $$1) {
      if (this.g.dP()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zf<abu> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.v != null) {
         $$1.accept(new afd(this.g.ao(), this.v));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bxj) {
         Collection<byl> $$4 = ((bxj)this.g).eZ().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new agh(this.g.ao(), $$4));
         }

         if (((bxj)this.g).fI()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bxj)) {
         $$1.accept(new aff(this.g.ao(), this.p));
      }

      if (this.g instanceof bxj $$5) {
         List<Pair<bws, czn>> $$6 = Lists.newArrayList();

         for (bws $$7 : bws.j) {
            czn $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new afg(this.g.ao(), $$6));
         }
      }

      if (!this.g.cX().isEmpty()) {
         $$1.accept(new afl(this.g));
      }

      if (this.g.bX()) {
         $$1.accept(new afl(this.g.dj()));
      }

      if (this.g instanceof bxh $$9 && $$9.O_()) {
         $$1.accept(new afe(this.g, $$9.C()));
      }
   }

   public ffc b() {
      return this.l.a();
   }

   public ffc c() {
      return this.p;
   }

   public float d() {
      return azm.a(this.n);
   }

   public float e() {
      return azm.a(this.m);
   }

   public float f() {
      return azm.a(this.o);
   }

   private void g() {
      akn $$0 = this.g.ar();
      List<akn.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.v = $$0.c();
         this.a(new afd(this.g.ao(), $$1));
      }

      if (this.g instanceof bxj) {
         Set<byl> $$2 = ((bxj)this.g).eZ().a();
         if (!$$2.isEmpty()) {
            this.a(new agh(this.g.ao(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zf<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof arr) {
         ((arr)this.g).f.b($$0);
      }
   }
}
