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

public class aql {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final aqm f;
   private final bsh g;
   private final int h;
   private final boolean i;
   private final Consumer<zb<?>> j;
   private final ahz k = new ahz();
   private int l;
   private int m;
   private int n;
   private ewh o = ewh.b;
   private int p;
   private int q;
   private List<bsh> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<ajt.c<?>> u;

   public aql(aqm $$0, bsh $$1, int $$2, boolean $$3, Consumer<zb<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.dq());
      this.l = ayg.d($$1.dH() * 256.0F / 360.0F);
      this.m = ayg.d($$1.dJ() * 256.0F / 360.0F);
      this.n = ayg.d($$1.cu() * 256.0F / 360.0F);
      this.t = $$1.aG();
      this.u = $$1.ar().c();
   }

   public void a() {
      List<bsh> $$0 = this.g.cU();
      if (!$$0.equals(this.r)) {
         this.j.accept(new aez(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof aqn $$1) {
               $$1.c.a($$1.dw(), $$1.dy(), $$1.dC(), $$1.dH(), $$1.dJ());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof cio $$1 && this.p % 10 == 0) {
         cud $$2 = $$1.D();
         if ($$2.g() instanceof cul) {
            epw $$3 = $$2.a(kn.B);
            epy $$4 = cul.a($$3, this.f);
            if ($$4 != null) {
               for (aqn $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zb<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.av || this.g.ar().a()) {
         if (this.g.bT()) {
            int $$7 = ayg.d(this.g.dH() * 256.0F / 360.0F);
            int $$8 = ayg.d(this.g.dJ() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new adh.c(this.g.an(), (byte)$$7, (byte)$$8, this.g.aG()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.dq());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = ayg.d(this.g.dH() * 256.0F / 360.0F);
            int $$11 = ayg.d(this.g.dJ() * 256.0F / 360.0F);
            ewh $$12 = this.g.dq();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            zb<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cmr) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aG()) {
                  this.t = this.g.aG();
                  this.q = 0;
                  $$14 = new afp(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cmr)) {
                  if ($$15) {
                     $$14 = new adh.a(this.g.an(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aG());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new adh.c(this.g.an(), (byte)$$10, (byte)$$11, this.g.aG());
                     $$18 = true;
                  }
               } else {
                  $$14 = new adh.b(this.g.an(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aG());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.av || this.g instanceof btc && ((btc)this.g).fC()) && this.p > 0) {
               ewh $$23 = this.g.du();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  if (this.g instanceof cms $$25) {
                     this.j.accept(new abz(List.of(new aeu(this.g.an(), this.o), new adw($$25.an(), $$25.d))));
                  } else {
                     this.j.accept(new aeu(this.g.an(), this.o));
                  }
               }
            }

            if ($$14 != null) {
               this.j.accept($$14);
            }

            this.b();
            if ($$17) {
               this.k.e($$12);
            }

            if ($$18) {
               this.l = $$10;
               this.m = $$11;
            }

            this.s = false;
         }

         int $$26 = ayg.d(this.g.cu() * 256.0F / 360.0F);
         if (Math.abs($$26 - this.n) >= 1) {
            this.j.accept(new aec(this.g, (byte)$$26));
            this.n = $$26;
         }

         this.g.av = false;
      }

      this.p++;
      if (this.g.U) {
         this.g.U = false;
         this.a(new aeu(this.g));
      }
   }

   private static Stream<bsh> a(List<bsh> $$0, List<bsh> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(aqn $$0) {
      this.g.e($$0);
      $$0.c.b(new ady(this.g.an()));
   }

   public void b(aqn $$0) {
      List<zb<? super abn>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new abz($$1));
      this.g.d($$0);
   }

   public void a(aqn $$0, Consumer<zb<abn>> $$1) {
      if (this.g.dM()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zb<abn> $$2 = this.g.dn();
      this.n = ayg.d(this.g.cu() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new aes(this.g.an(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof btc) {
         Collection<bug> $$4 = ((btc)this.g).eU().c();
         if (!$$4.isEmpty()) {
            $$1.accept(new aft(this.g.an(), $$4));
         }

         if (((btc)this.g).fC()) {
            $$3 = true;
         }
      }

      this.o = this.g.du();
      if ($$3 && !(this.g instanceof btc)) {
         $$1.accept(new aeu(this.g.an(), this.o));
      }

      if (this.g instanceof btc) {
         List<Pair<bso, cud>> $$5 = Lists.newArrayList();

         for (bso $$6 : bso.values()) {
            cud $$7 = ((btc)this.g).a($$6);
            if (!$$7.e()) {
               $$5.add(Pair.of($$6, $$7.s()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new aev(this.g.an(), $$5));
         }
      }

      if (!this.g.cU().isEmpty()) {
         $$1.accept(new aez(this.g));
      }

      if (this.g.bT()) {
         $$1.accept(new aez(this.g.de()));
      }

      if (this.g instanceof bte $$8 && $$8.fZ()) {
         $$1.accept(new aet($$8, $$8.gb()));
      }
   }

   private void b() {
      ajt $$0 = this.g.ar();
      List<ajt.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new aes(this.g.an(), $$1));
      }

      if (this.g instanceof btc) {
         Set<bug> $$2 = ((btc)this.g).eU().a();
         if (!$$2.isEmpty()) {
            this.a(new aft(this.g.an(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zb<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof aqn) {
         ((aqn)this.g).c.b($$0);
      }
   }
}
