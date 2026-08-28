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

public class ard {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 1;
   private static final double d = 7.6293945E-6F;
   public static final int a = 60;
   private static final int e = 400;
   private final are f;
   private final bst g;
   private final int h;
   private final boolean i;
   private final Consumer<zv<?>> j;
   private final ait k = new ait();
   private int l;
   private int m;
   private int n;
   private evq o = evq.b;
   private int p;
   private int q;
   private List<bst> r = Collections.emptyList();
   private boolean s;
   private boolean t;
   @Nullable
   private List<akn.c<?>> u;

   public ard(are $$0, bst $$1, int $$2, boolean $$3, Consumer<zv<?>> $$4) {
      this.f = $$0;
      this.j = $$4;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.k.e($$1.do());
      this.l = ayy.d($$1.dF() * 256.0F / 360.0F);
      this.m = ayy.d($$1.dH() * 256.0F / 360.0F);
      this.n = ayy.d($$1.cs() * 256.0F / 360.0F);
      this.t = $$1.aE();
      this.u = $$1.ap().c();
   }

   public void a() {
      List<bst> $$0 = this.g.cS();
      if (!$$0.equals(this.r)) {
         this.j.accept(new aft(this.g));
         a($$0, this.r).forEach($$0x -> {
            if ($$0x instanceof arf $$1) {
               $$1.c.a($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH());
            }
         });
         this.r = $$0;
      }

      if (this.g instanceof ciz $$1 && this.p % 10 == 0) {
         cuo $$2 = $$1.E();
         if ($$2.g() instanceof cuw) {
            eph $$3 = $$2.a(km.B);
            epj $$4 = cuw.a($$3, this.f);
            if ($$4 != null) {
               for (arf $$5 : this.f.x()) {
                  $$4.a($$5, $$2);
                  zv<?> $$6 = $$4.a($$3, $$5);
                  if ($$6 != null) {
                     $$5.c.b($$6);
                  }
               }
            }
         }

         this.b();
      }

      if (this.p % this.h == 0 || this.g.av || this.g.ap().a()) {
         if (this.g.bR()) {
            int $$7 = ayy.d(this.g.dF() * 256.0F / 360.0F);
            int $$8 = ayy.d(this.g.dH() * 256.0F / 360.0F);
            boolean $$9 = Math.abs($$7 - this.l) >= 1 || Math.abs($$8 - this.m) >= 1;
            if ($$9) {
               this.j.accept(new aeb.c(this.g.al(), (byte)$$7, (byte)$$8, this.g.aE()));
               this.l = $$7;
               this.m = $$8;
            }

            this.k.e(this.g.do());
            this.b();
            this.s = true;
         } else {
            this.q++;
            int $$10 = ayy.d(this.g.dF() * 256.0F / 360.0F);
            int $$11 = ayy.d(this.g.dH() * 256.0F / 360.0F);
            evq $$12 = this.g.do();
            boolean $$13 = this.k.d($$12).g() >= 7.6293945E-6F;
            zv<?> $$14 = null;
            boolean $$15 = $$13 || this.p % 60 == 0;
            boolean $$16 = Math.abs($$10 - this.l) >= 1 || Math.abs($$11 - this.m) >= 1;
            boolean $$17 = false;
            boolean $$18 = false;
            if (this.p > 0 || this.g instanceof cnc) {
               long $$19 = this.k.a($$12);
               long $$20 = this.k.b($$12);
               long $$21 = this.k.c($$12);
               boolean $$22 = $$19 < -32768L || $$19 > 32767L || $$20 < -32768L || $$20 > 32767L || $$21 < -32768L || $$21 > 32767L;
               if ($$22 || this.q > 400 || this.s || this.t != this.g.aE()) {
                  this.t = this.g.aE();
                  this.q = 0;
                  $$14 = new agj(this.g);
                  $$17 = true;
                  $$18 = true;
               } else if ((!$$15 || !$$16) && !(this.g instanceof cnc)) {
                  if ($$15) {
                     $$14 = new aeb.a(this.g.al(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), this.g.aE());
                     $$17 = true;
                  } else if ($$16) {
                     $$14 = new aeb.c(this.g.al(), (byte)$$10, (byte)$$11, this.g.aE());
                     $$18 = true;
                  }
               } else {
                  $$14 = new aeb.b(this.g.al(), (short)((int)$$19), (short)((int)$$20), (short)((int)$$21), (byte)$$10, (byte)$$11, this.g.aE());
                  $$17 = true;
                  $$18 = true;
               }
            }

            if ((this.i || this.g.av || this.g instanceof bto && ((bto)this.g).fE()) && this.p > 0) {
               evq $$23 = this.g.ds();
               double $$24 = $$23.g(this.o);
               if ($$24 > 1.0E-7 || $$24 > 0.0 && $$23.g() == 0.0) {
                  this.o = $$23;
                  this.j.accept(new afo(this.g.al(), this.o));
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

         int $$25 = ayy.d(this.g.cs() * 256.0F / 360.0F);
         if (Math.abs($$25 - this.n) >= 1) {
            this.j.accept(new aew(this.g, (byte)$$25));
            this.n = $$25;
         }

         this.g.av = false;
      }

      this.p++;
      if (this.g.U) {
         this.a(new afo(this.g));
         if (this.g instanceof cnd $$26) {
            this.a(new aeq($$26.al(), $$26.d, $$26.e, $$26.f));
         }

         this.g.U = false;
      }
   }

   private static Stream<bst> a(List<bst> $$0, List<bst> $$1) {
      return $$1.stream().filter($$1x -> !$$0.contains($$1x));
   }

   public void a(arf $$0) {
      this.g.d($$0);
      $$0.c.b(new aes(this.g.al()));
   }

   public void b(arf $$0) {
      List<zv<? super ach>> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      $$0.c.b(new act($$1));
      this.g.c($$0);
   }

   public void a(arf $$0, Consumer<zv<ach>> $$1) {
      if (this.g.dK()) {
         b.warn("Fetching packet for removed entity {}", this.g);
      }

      zv<ach> $$2 = this.g.dl();
      this.n = ayy.d(this.g.cs() * 256.0F / 360.0F);
      $$1.accept($$2);
      if (this.u != null) {
         $$1.accept(new afm(this.g.al(), this.u));
      }

      boolean $$3 = this.i;
      if (this.g instanceof bto) {
         Collection<bus> $$4 = ((bto)this.g).eW().b();
         if (!$$4.isEmpty()) {
            $$1.accept(new agn(this.g.al(), $$4));
         }

         if (((bto)this.g).fE()) {
            $$3 = true;
         }
      }

      this.o = this.g.ds();
      if ($$3 && !(this.g instanceof bto)) {
         $$1.accept(new afo(this.g.al(), this.o));
      }

      if (this.g instanceof bto) {
         List<Pair<bta, cuo>> $$5 = Lists.newArrayList();

         for (bta $$6 : bta.values()) {
            cuo $$7 = ((bto)this.g).a($$6);
            if (!$$7.e()) {
               $$5.add(Pair.of($$6, $$7.s()));
            }
         }

         if (!$$5.isEmpty()) {
            $$1.accept(new afp(this.g.al(), $$5));
         }
      }

      if (!this.g.cS().isEmpty()) {
         $$1.accept(new aft(this.g));
      }

      if (this.g.bR()) {
         $$1.accept(new aft(this.g.dc()));
      }

      if (this.g instanceof btq $$8 && $$8.gd()) {
         $$1.accept(new afn($$8, $$8.gf()));
      }
   }

   private void b() {
      akn $$0 = this.g.ap();
      List<akn.c<?>> $$1 = $$0.b();
      if ($$1 != null) {
         this.u = $$0.c();
         this.a(new afm(this.g.al(), $$1));
      }

      if (this.g instanceof bto) {
         Set<bus> $$2 = ((bto)this.g).eW().a();
         if (!$$2.isEmpty()) {
            this.a(new agn(this.g.al(), $$2));
         }

         $$2.clear();
      }
   }

   private void a(zv<?> $$0) {
      this.j.accept($$0);
      if (this.g instanceof arf) {
         ((arf)this.g).c.b($$0);
      }
   }
}
