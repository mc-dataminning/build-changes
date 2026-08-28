import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fsa extends frw {
   private static final xj b = xj.c("gui.stats");
   static final alj c = alj.b("container/slot");
   static final alj d = alj.b("statistics/header");
   static final alj s = alj.b("statistics/sort_up");
   static final alj u = alj.b("statistics/sort_down");
   private static final xj v = xj.c("multiplayer.downloadingStats");
   static final xj w = xj.c("stats.none");
   private static final xj x = xj.c("stat.generalButton");
   private static final xj y = xj.c("stat.itemsButton");
   private static final xj z = xj.c("stat.mobsButton");
   protected final frw a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fps D = new fps(this, 33, 58);
   @Nullable
   private fsa.a E;
   @Nullable
   fsa.b F;
   @Nullable
   private fsa.c G;
   final awy H;
   @Nullable
   private fmz<?> I;
   private boolean J = true;

   public fsa(frw $$0, awy $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aR_() {
      this.D.c(new fms(this.p, v));
      this.m.L().b(new ahh(ahh.a.b));
   }

   public void m() {
      this.E = new fsa.a(this.m);
      this.F = new fsa.b(this.m);
      this.G = new fsa.c(this.m);
   }

   public void F() {
      fps $$0 = new fps(this, 33, 58);
      $$0.a(b, this.p);
      fpw $$1 = $$0.b(fpw.d()).a(5);
      $$1.c().b();
      fpw $$2 = $$1.a(fpw.e()).a(5);
      $$2.a(fmd.a(x, $$0x -> this.a(this.E)).a(120).a());
      fmd $$3 = $$2.a(fmd.a(y, $$0x -> this.a(this.F)).a(120).a());
      fmd $$4 = $$2.a(fmd.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fmd.a(xi.d, $$0x -> this.aO_()).a(200).a());
      if (this.F != null && this.F.aH_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aH_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      if (this.I != null) {
         this.I.a(this.n, this.D);
      }
   }

   @Override
   public void aO_() {
      this.m.a(this.a);
   }

   public void G() {
      if (this.J) {
         this.m();
         this.a(this.E);
         this.F();
         this.aF_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable fmz<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awu<alj> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fmz<fsa.a.a> {
      public a(final fke $$0) {
         super($$0, fsa.this.n, fsa.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awu<alj>> $$1 = new ObjectArrayList(awx.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hal.a(fsa.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awu<alj> $$2 = (awu<alj>)var4.next();
            this.b(new fsa.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fmz.a<fsa.a.a> {
         private final awu<alj> b;
         private final xj c;

         a(final awu<alj> $$0) {
            this.b = $$0;
            this.c = xj.c(fsa.a($$0));
         }

         private String b() {
            return this.b.a(fsa.this.H.a(this.b));
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fsa.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fsa.this.p, $$12, $$3 + $$4 - fsa.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xj a() {
            return xj.a("narrator.select", xj.i().b(this.c).b(xi.v).f(this.b()));
         }
      }
   }

   class b extends fmz<fsa.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alj[] z = new alj[]{
         alj.b("statistics/block_mined"),
         alj.b("statistics/item_broken"),
         alj.b("statistics/item_crafted"),
         alj.b("statistics/item_used"),
         alj.b("statistics/item_picked_up"),
         alj.b("statistics/item_dropped")
      };
      protected final List<aww<diq>> a;
      protected final List<aww<cwi>> m;
      protected final Comparator<fsa.b.a> n = new fsa.b.b();
      @Nullable
      protected aww<?> o;
      protected int p = -1;
      protected int q;

      public b(final fke $$0) {
         super($$0, fsa.this.n, fsa.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awx.a);
         this.m = Lists.newArrayList(new aww[]{awx.d, awx.b, awx.c, awx.e, awx.f});
         this.a(true, 22);
         Set<cwi> $$1 = Sets.newIdentityHashSet();

         for (cwi $$2 : lz.g) {
            boolean $$3 = false;

            for (aww<cwi> $$4 : this.m) {
               if ($$4.a($$2) && fsa.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (diq $$5 : lz.e) {
            boolean $$6 = false;

            for (aww<diq> $$7 : this.a) {
               if ($$7.a($$5) && fsa.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cwq.a);

         for (cwi $$8 : $$1) {
            this.b(new fsa.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(flq $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alj $$4 = this.p == $$3 ? fsa.c : fsa.d;
            $$0.a(gjq::B, $$4, $$1 + this.a($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            alj $$6 = this.q == 1 ? fsa.s : fsa.u;
            $$0.a(gjq::B, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gjq::B, this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
         }
      }

      @Override
      public int b() {
         return 280;
      }

      @Override
      protected boolean a(int $$0, int $$1) {
         this.p = -1;

         for (int $$2 = 0; $$2 < this.z.length; $$2++) {
            int $$3 = $$0 - this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.p = $$2;
               break;
            }
         }

         if (this.p >= 0) {
            this.a(this.b(this.p));
            this.c.ak().a(hcw.a(awn.Av, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private aww<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(aww<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(flq $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fsa.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cwi $$5 = $$3.b();
               $$0.a(fsa.this.p, $$5.n(), $$1, $$2, $$5.g().a(ku.G));
            } else {
               xj $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fsa.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(aww<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aH_().sort(this.n);
      }

      class a extends fmz.a<fsa.b.a> {
         private final cwi b;

         a(final cwi $$0) {
            this.b = $$0;
         }

         public cwi b() {
            return this.b;
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gjq::B, fsa.c, $$3, $$2, 18, 18);
            $$0.b(this.b.o(), $$3 + 1, $$2 + 1);
            if (fsa.this.F != null) {
               for (int $$10 = 0; $$10 < fsa.this.F.a.size(); $$10++) {
                  awu<diq> $$12;
                  if (this.b instanceof cus $$11) {
                     $$12 = fsa.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fsa.this.F.m.size(); $$14++) {
                  this.a($$0, fsa.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fsa.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(flq $$0, @Nullable awu<?> $$1, int $$2, int $$3, boolean $$4) {
            xj $$5 = (xj)($$1 == null ? fsa.w : xj.b($$1.a(fsa.this.H.a($$1))));
            $$0.b(fsa.this.p, $$5, $$2 - fsa.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xj a() {
            return xj.a("narrator.select", this.b.n());
         }
      }

      class b implements Comparator<fsa.b.a> {
         public int a(fsa.b.a $$0, fsa.b.a $$1) {
            cwi $$2 = $$0.b();
            cwi $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               aww<diq> $$6 = (aww<diq>)b.this.o;
               $$4 = $$2 instanceof cus ? fsa.this.H.a($$6, ((cus)$$2).d()) : -1;
               $$5 = $$3 instanceof cus ? fsa.this.H.a($$6, ((cus)$$3).d()) : -1;
            } else {
               aww<cwi> $$9 = (aww<cwi>)b.this.o;
               $$4 = fsa.this.H.a($$9, $$2);
               $$5 = fsa.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cwi.a($$2), cwi.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fmz<fsa.c.a> {
      public c(final fke $$0) {
         super($$0, fsa.this.n, fsa.this.o - 33 - 58, 33, 9 * 4);

         for (bus<?> $$1 : lz.f) {
            if (fsa.this.H.a(awx.g.b($$1)) > 0 || fsa.this.H.a(awx.h.b($$1)) > 0) {
               this.b(new fsa.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fmz.a<fsa.c.a> {
         private final xj b;
         private final xj c;
         private final xj d;
         private final boolean e;
         private final boolean f;

         public a(final bus<?> $$0) {
            this.b = $$0.h();
            int $$1 = fsa.this.H.a(awx.g.b($$0));
            if ($$1 == 0) {
               this.c = xj.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xj.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fsa.this.H.a(awx.h.b($$0));
            if ($$2 == 0) {
               this.d = xj.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xj.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fsa.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fsa.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fsa.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xj a() {
            return xj.a("narrator.select", xi.a(this.c, this.d));
         }
      }
   }
}
