import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eyd extends exv implements eye {
   static final aep c = new aep("container/slot");
   static final aep k = new aep("statistics/header");
   static final aep l = new aep("statistics/sort_up");
   static final aep m = new aep("statistics/sort_down");
   private static final te n = te.c("multiplayer.downloadingStats");
   protected final exv a;
   private eyd.a o;
   eyd.b p;
   private eyd.c q;
   final apf s;
   @Nullable
   private ete<?> t;
   private boolean u = true;
   private static final int v = 18;
   private static final int w = 20;
   private static final int x = 1;
   private static final int y = 1;
   private static final int z = 2;
   private static final int A = 2;
   private static final int B = 40;
   private static final int C = 5;
   private static final int D = 0;
   private static final int E = -1;
   private static final int F = 1;

   public eyd(exv $$0, apf $$1) {
      super(te.c("gui.stats"));
      this.a = $$0;
      this.s = $$1;
   }

   @Override
   protected void aE_() {
      this.u = true;
      this.f.I().b(new abf(abf.a.b));
   }

   public void l() {
      this.o = new eyd.a(this.f);
      this.p = new eyd.b(this.f);
      this.q = new eyd.c(this.f);
   }

   @Override
   public void B() {
      this.d((esi)esi.a(te.c("stat.generalButton"), $$0x -> this.a(this.o)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      esi $$0 = this.d((esi)esi.a(te.c("stat.itemsButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      esi $$1 = this.d((esi)esi.a(te.c("stat.mobsButton"), $$0x -> this.a(this.q)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((esi)esi.a(td.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.p.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.q.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      if (this.u) {
         this.b($$0, $$1, $$2, $$3);
         $$0.a(this.i, n, this.g / 2, this.h / 2, 16777215);
         $$0.a(this.i, b[(int)(ac.b() / 150L % (long)b.length)], this.g / 2, this.h / 2 + 9 * 2, 16777215);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.D().a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      }
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void C() {
      if (this.u) {
         this.l();
         this.B();
         this.a(this.o);
         this.u = false;
      }
   }

   @Override
   public boolean j() {
      return !this.u;
   }

   @Nullable
   public ete<?> D() {
      return this.t;
   }

   public void a(@Nullable ete<?> $$0) {
      if (this.t != null) {
         this.f(this.t);
      }

      if ($$0 != null) {
         this.e($$0);
         this.t = $$0;
      }
   }

   static String a(apb<aep> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(erx $$0, int $$1, int $$2, cir $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.ae_(), $$1 + 2, $$2 + 2);
   }

   void a(erx $$0, int $$1, int $$2, aep $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends ete<eyd.a.a> {
      public a(eqn $$0) {
         super($$0, eyd.this.g, eyd.this.h, 32, eyd.this.h - 64, 10);
         ObjectArrayList<apb<aep>> $$1 = new ObjectArrayList(ape.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> fzm.a(eyd.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            apb<aep> $$2 = (apb<aep>)var4.next();
            this.b(new eyd.a.a($$2));
         }
      }

      class a extends ete.a<eyd.a.a> {
         private final apb<aep> b;
         private final te c;

         a(apb<aep> $$0) {
            this.b = $$0;
            this.c = te.c(eyd.a($$0));
         }

         private String b() {
            return this.b.a(eyd.this.s.a(this.b));
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyd.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(eyd.this.i, $$10, $$3 + 2 + 213 - eyd.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public te a() {
            return te.a("narrator.select", te.h().b(this.c).b(td.u).f(this.b()));
         }
      }
   }

   class b extends ete<eyd.b.a> {
      protected final List<apd<csk>> a;
      protected final List<apd<cir>> l;
      private final aep[] s = new aep[]{
         new aep("statistics/block_mined"),
         new aep("statistics/item_broken"),
         new aep("statistics/item_crafted"),
         new aep("statistics/item_used"),
         new aep("statistics/item_picked_up"),
         new aep("statistics/item_dropped")
      };
      protected int m = -1;
      protected final Comparator<eyd.b.a> n = new eyd.b.b();
      @Nullable
      protected apd<?> o;
      protected int p;

      public b(eqn $$0) {
         super($$0, eyd.this.g, eyd.this.h, 32, eyd.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(ape.a);
         this.l = Lists.newArrayList(new apd[]{ape.d, ape.b, ape.c, ape.e, ape.f});
         this.a(true, 20);
         Set<cir> $$1 = Sets.newIdentityHashSet();

         for (cir $$2 : jc.i) {
            boolean $$3 = false;

            for (apd<cir> $$4 : this.l) {
               if ($$4.a($$2) && eyd.this.s.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (csk $$5 : jc.f) {
            boolean $$6 = false;

            for (apd<csk> $$7 : this.a) {
               if ($$7.a($$5) && eyd.this.s.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(ciz.a);

         for (cir $$8 : $$1) {
            this.b(new eyd.b.a($$8));
         }
      }

      @Override
      protected void a(erx $$0, int $$1, int $$2) {
         if (!this.b.n.b()) {
            this.m = -1;
         }

         for (int $$3 = 0; $$3 < this.s.length; $$3++) {
            aep $$4 = this.m == $$3 ? eyd.c : eyd.k;
            eyd.this.a($$0, $$1 + eyd.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.o != null) {
            int $$5 = eyd.this.a(this.b(this.o)) - 36;
            aep $$6 = this.p == 1 ? eyd.l : eyd.m;
            eyd.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.s.length; $$7++) {
            int $$8 = this.m == $$7 ? 1 : 0;
            eyd.this.a($$0, $$1 + eyd.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.s[$$7]);
         }
      }

      @Override
      public int b() {
         return 375;
      }

      @Override
      protected int c() {
         return this.d / 2 + 140;
      }

      @Override
      protected void a(int $$0, int $$1) {
         this.m = -1;

         for (int $$2 = 0; $$2 < this.s.length; $$2++) {
            int $$3 = $$0 - eyd.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.m = $$2;
               break;
            }
         }

         if (this.m >= 0) {
            this.a(this.a(this.m));
            this.b.ah().a(gbj.a(aou.yp, 1.0F));
         }
      }

      private apd<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.l.get($$0 - this.a.size());
      }

      private int b(apd<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.l.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(erx $$0, int $$1, int $$2) {
         if ($$2 >= this.f && $$2 <= this.g) {
            eyd.b.a $$3 = this.r();
            int $$4 = (this.d - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cir $$5 = $$3.b();
               $$0.a(eyd.this.i, this.a($$5), $$1, $$2);
            } else {
               te $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.s.length; $$8++) {
                  int $$9 = eyd.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(eyd.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected te a(cir $$0) {
         return $$0.p();
      }

      protected void a(apd<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.p = -1;
         } else if (this.p == -1) {
            this.p = 1;
         } else {
            this.o = null;
            this.p = 0;
         }

         this.i().sort(this.n);
      }

      class a extends ete.a<eyd.b.a> {
         private final cir b;

         a(cir $$0) {
            this.b = $$0;
         }

         public cir b() {
            return this.b;
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eyd.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < eyd.this.p.a.size(); $$10++) {
               apb<csk> $$11;
               if (this.b instanceof cgp) {
                  $$11 = eyd.this.p.a.get($$10).b(((cgp)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + eyd.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < eyd.this.p.l.size(); $$13++) {
               this.a($$0, eyd.this.p.l.get($$13).b(this.b), $$3 + eyd.this.a($$13 + eyd.this.p.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(erx $$0, @Nullable apb<?> $$1, int $$2, int $$3, boolean $$4) {
            String $$5 = $$1 == null ? "-" : $$1.a(eyd.this.s.a($$1));
            $$0.b(eyd.this.i, $$5, $$2 - eyd.this.i.b($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public te a() {
            return te.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<eyd.b.a> {
         public int a(eyd.b.a $$0, eyd.b.a $$1) {
            cir $$2 = $$0.b();
            cir $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               apd<csk> $$6 = (apd<csk>)b.this.o;
               $$4 = $$2 instanceof cgp ? eyd.this.s.a($$6, ((cgp)$$2).e()) : -1;
               $$5 = $$3 instanceof cgp ? eyd.this.s.a($$6, ((cgp)$$3).e()) : -1;
            } else {
               apd<cir> $$9 = (apd<cir>)b.this.o;
               $$4 = eyd.this.s.a($$9, $$2);
               $$5 = eyd.this.s.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.p * Integer.compare(cir.a($$2), cir.a($$3)) : b.this.p * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends ete<eyd.c.a> {
      public c(eqn $$0) {
         super($$0, eyd.this.g, eyd.this.h, 32, eyd.this.h - 64, 9 * 4);

         for (bik<?> $$1 : jc.h) {
            if (eyd.this.s.a(ape.g.b($$1)) > 0 || eyd.this.s.a(ape.h.b($$1)) > 0) {
               this.b(new eyd.c.a($$1));
            }
         }
      }

      class a extends ete.a<eyd.c.a> {
         private final te b;
         private final te c;
         private final boolean d;
         private final te e;
         private final boolean f;

         public a(bik<?> $$0) {
            this.b = $$0.h();
            int $$1 = eyd.this.s.a(ape.g.b($$0));
            if ($$1 == 0) {
               this.c = te.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = te.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = eyd.this.s.a(ape.h.b($$0));
            if ($$2 == 0) {
               this.e = te.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = te.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyd.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(eyd.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(eyd.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public te a() {
            return te.a("narrator.select", td.a(this.c, this.e));
         }
      }
   }
}
