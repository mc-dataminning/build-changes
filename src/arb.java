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

public class arb {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final ard f;
   private final bva g;
   private final int h;
   private final boolean i;
   private final Consumer<yw<?>> j;
   private final BiConsumer<yw<?>, List<UUID>> k;
   private final aih l = new aih();
   private byte m;
   private byte n;
   private byte o;
   private fbx p;
   private int q;
   private int r;
   private List<bva> s = Collections.emptyList();
   private boolean t;
   private boolean u;
   @Nullable
   private List<akb.c<?>> v;

   public arb(ard $$0, bva $$1, int $$2, boolean $$3, Consumer<yw<?>> $$4, BiConsumer<yw<?>, List<UUID>> $$5) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k = $$5;
      this.l.e($$1.dt());
      this.p = $$1.dx();
      this.m = ayz.g($$1.dK());
      this.n = ayz.g($$1.dM());
      this.o = ayz.g($$1.cz());
      this.u = $$1.aJ();
      this.v = $$1.au().c();
   }

   public void a() {
      List<bva> $$0 = this.g.cX();
      if (!$$0.equals(this.s)) {
         List<UUID> $$1 = this.a($$0).map(bva::cF).toList();
         this.k.accept(new afc(this.g), $$1);
         this.s = $$0;
      }

      if (this.g instanceof clp $$2 && this.q % 10 == 0) {
         cxh $$3 = $$2.w();
         if ($$3.h() instanceof cxu) {
            evo $$4 = $$3.a(kv.M);
            evq $$5 = cxu.a($$4, this.f);
            if ($$5 != null) {
               for (are $$6 : this.f.z()) {
                  $$5.a($$6, $$3);
                  yw<?> $$7 = $$5.a($$4, $$6);
                  if ($$7 != null) {
                     $$6.f.b($$7);
                  }
               }
            }
         }

         this.g();
      }

      if (this.q % this.h == 0 || this.g.ar || this.g.au().a()) {
         byte $$8 = ayz.g(this.g.dK());
         byte $$9 = ayz.g(this.g.dM());
         boolean $$10 = Math.abs($$8 - this.m) >= 1 || Math.abs($$9 - this.n) >= 1;
         if (this.g.bY()) {
            if ($$10) {
               this.j.accept(new adf.c(this.g.ar(), $$8, $$9, this.g.aJ()));
               this.m = $$8;
               this.n = $$9;
            }

            this.l.e(this.g.dt());
            this.g();
            this.t = true;
         } else {
            label194: {
               if (this.g instanceof crq $$11 && $$11.f() instanceof csf $$12) {
                  this.a($$12, $$8, $$9, $$10);
                  break label194;
               }

               this.r++;
               fbx $$13 = this.g.dt();
               boolean $$14 = this.l.d($$13).h() >= 7.6293945E-6F;
               yw<?> $$15 = null;
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
                  $$15 = acp.a(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$16 || !$$10) && !(this.g instanceof cpy)) {
                  if ($$16) {
                     $$15 = new adf.a(this.g.ar(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aJ());
                     $$17 = true;
                  } else if ($$10) {
                     $$15 = new adf.c(this.g.ar(), $$8, $$9, this.g.aJ());
                     $$18 = true;
                  }
               } else {
                  $$15 = new adf.b(this.g.ar(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), $$8, $$9, this.g.aJ());
                  $$17 = true;
                  $$18 = true;
               }

               if (this.g.ar || this.i || this.g instanceof bvy && ((bvy)this.g).fL()) {
                  fbx $$23 = this.g.dx();
                  double $$24 = $$23.g(this.p);
                  if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.h() == 0.0) {
                     this.p = $$23;
                     if (this.g instanceof cpz $$25) {
                        this.j.accept(new abw(List.of(new aew(this.g.ar(), this.p), new adw($$25.ar(), $$25.c))));
                     } else {
                        this.j.accept(new aew(this.g.ar(), this.p));
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

         byte $$26 = ayz.g(this.g.cz());
         if (Math.abs($$26 - this.o) >= 1) {
            this.j.accept(new aee(this.g, $$26));
            this.o = $$26;
         }

         this.g.ar = false;
      }

      this.q++;
      if (this.g.T) {
         this.g.T = false;
         this.a(new aew(this.g));
      }
   }

   private Stream<bva> a(List<bva> $$0) {
      return Streams.concat(new Stream[]{this.s.stream().filter($$1 -> !$$0.contains($$1)), $$0.stream().filter($$0x -> !this.s.contains($$0x))});
   }

   private void a(csf $$0, byte $$1, byte $$2, boolean $$3) {
      this.g();
      if ($$0.e.isEmpty()) {
         fbx $$4 = this.g.dx();
         double $$5 = $$4.g(this.p);
         fbx $$6 = this.g.dt();
         boolean $$7 = this.l.d($$6).h() >= 7.6293945E-6F;
         boolean $$8 = $$7 || this.q % 60 == 0;
         if ($$8 || $$3 || $$5 > 1.0E-7) {
            this.j.accept(new adg(this.g.ar(), List.of(new csf.a(this.g.ds(), this.g.dx(), this.g.dK(), this.g.dM(), 1.0F))));
         }
      } else {
         this.j.accept(new adg(this.g.ar(), List.copyOf($$0.e)));
         $$0.e.clear();
      }

      this.m = $$1;
      this.n = $$2;
      this.l.e(this.g.ds());
   }

   public void a(are $$0) {
      this.g.e($$0);
      $$0.f.b(new aea(this.g.ar()));
   }

   public void b(are $$0) {
      List<yw<? super abl>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.f.b(new abw($$1));
      this.g.d($$0);
   }

   public void a(are $$0, Consumer<yw<abl>> $$1) {
      if (this.g.dP()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      yw<abl> $$2 = this.g.a(this);
      $$1.accept($$2);
      if (this.v != null) {
         $$1.accept(new aeu(this.g.ar(), this.v));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bvy) {
         Collection<bxc> $$4 = ((bvy)this.g).eY().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new afx(this.g.ar(), $$4));
         }

         if (((bvy)this.g).fL()) {
            $$3 = true;
         }
      }

      if ($$3 && !(this.g instanceof bvy)) {
         $$1.accept(new aew(this.g.ar(), this.p));
      }

      if (this.g instanceof bvy $$5) {
         List<Pair<bvj, cxh>> $$6 = Lists.newArrayList();

         for (bvj $$7 : bvj.i) {
            cxh $$8 = $$5.a($$7);
            if (!$$8.f()) {
               $$6.add(Pair.of($$7, $$8.v()));
            }
         }

         if (!$$6.isEmpty()) {
            $$1.accept(new aex(this.g.ar(), $$6));
         }
      }

      if (!this.g.cX().isEmpty()) {
         $$1.accept(new afc(this.g));
      }

      if (this.g.bY()) {
         $$1.accept(new afc(this.g.dj()));
      }

      if (this.g instanceof bvw $$9 && $$9.O_()) {
         $$1.accept(new aev(this.g, $$9.C()));
      }
   }

   public fbx b() {
      return this.l.a();
   }

   public fbx c() {
      return this.p;
   }

   public float d() {
      return ayz.a(this.n);
   }

   public float e() {
      return ayz.a(this.m);
   }

   public float f() {
      return ayz.a(this.o);
   }

   private void g() {
      akb $$0 = this.g.au();
      List<akb.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.v = $$0.c();
         this.a(new aeu(this.g.ar(), $$1));
      }

      if (this.g instanceof bvy) {
         Set<bxc> $$2 = ((bvy)this.g).eY().a();
         if (!$$2.isEmpty()) {
            this.a(new afx(this.g.ar(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(yw<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof are) {
         ((are)this.g).f.b($$0);
      }
   }
}
