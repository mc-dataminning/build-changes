import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class foy extends fon {
   private static final xe b = xe.c("gui.stats");
   static final akt c = new akt("container/slot");
   static final akt d = new akt("statistics/header");
   static final akt r = new akt("statistics/sort_up");
   static final akt s = new akt("statistics/sort_down");
   private static final xe u = xe.c("multiplayer.downloadingStats");
   static final xe v = xe.c("stats.none");
   private static final xe w = xe.c("stat.generalButton");
   private static final xe x = xe.c("stat.itemsButton");
   private static final xe y = xe.c("stat.mobsButton");
   protected final fon a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fma C = new fma(this, 33, 58);
   @Nullable
   private foy.a D;
   @Nullable
   foy.b E;
   @Nullable
   private foy.c F;
   final awa G;
   @Nullable
   private fjj<?> H;
   private boolean I = true;

   public foy(fon $$0, awa $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aN_() {
      this.C.c(new fjc(this.p, u));
      this.m.L().b(new agv(agv.a.c));
   }

   public void B() {
      this.D = new foy.a(this.m);
      this.E = new foy.b(this.m);
      this.F = new foy.c(this.m);
   }

   public void C() {
      fma $$0 = new fma(this, 33, 58);
      $$0.a(b, this.p);
      fme $$1 = $$0.b(fme.d()).a(5);
      $$1.c().b();
      fme $$2 = $$1.a(fme.e()).a(5);
      $$2.a(fin.a(w, $$0x -> this.a(this.D)).a(120).a());
      fin $$3 = $$2.a(fin.a(x, $$0x -> this.a(this.E)).a(120).a());
      fin $$4 = $$2.a(fin.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fin.a(xd.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aE_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aE_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      if (this.H != null) {
         this.H.a(this.n, this.C);
      }
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   public void D() {
      if (this.I) {
         this.B();
         this.a(this.D);
         this.C();
         this.aC_();
         this.I = false;
      }
   }

   @Override
   public boolean k() {
      return !this.I;
   }

   public void a(@Nullable fjj<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(avw<akt> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fjj<foy.a.a> {
      public a(fgj $$0) {
         super($$0, foy.this.n, foy.this.o - 33 - 58, 33, 14);
         ObjectArrayList<avw<akt>> $$1 = new ObjectArrayList(avz.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gse.a(foy.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avw<akt> $$2 = (avw<akt>)var4.next();
            this.b(new foy.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fjj.a<foy.a.a> {
         private final avw<akt> b;
         private final xe c;

         a(avw<akt> $$0) {
            this.b = $$0;
            this.c = xe.c(foy.a($$0));
         }

         private String b() {
            return this.b.a(foy.this.G.a(this.b));
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(foy.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(foy.this.p, $$12, $$3 + $$4 - foy.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", xe.i().a(this.c).a(xd.v).f(this.b()));
         }
      }
   }

   class b extends fjj<foy.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akt[] z = new akt[]{
         new akt("statistics/block_mined"),
         new akt("statistics/item_broken"),
         new akt("statistics/item_crafted"),
         new akt("statistics/item_used"),
         new akt("statistics/item_picked_up"),
         new akt("statistics/item_dropped")
      };
      protected final List<avy<dfc>> a;
      protected final List<avy<cuc>> m;
      protected final Comparator<foy.b.a> n = new foy.b.b();
      @Nullable
      protected avy<?> o;
      protected int p = -1;
      protected int q;

      public b(fgj $$0) {
         super($$0, foy.this.n, foy.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avz.a);
         this.m = Lists.newArrayList(new avy[]{avz.d, avz.b, avz.c, avz.e, avz.f});
         this.a(true, 22);
         Set<cuc> $$1 = Sets.newIdentityHashSet();

         for (cuc $$2 : lh.h) {
            boolean $$3 = false;

            for (avy<cuc> $$4 : this.m) {
               if ($$4.a($$2) && foy.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dfc $$5 : lh.e) {
            boolean $$6 = false;

            for (avy<dfc> $$7 : this.a) {
               if ($$7.a($$5) && foy.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.q());
            }
         }

         $$1.remove(cuk.a);

         for (cuc $$8 : $$1) {
            this.b(new foy.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fia $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akt $$4 = this.p == $$3 ? foy.c : foy.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akt $$6 = this.q == 1 ? foy.r : foy.s;
            $$0.a($$6, $$1 + $$5, $$2 + 1, 0, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 0, 18, 18);
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
            this.c.ak().a(guh.a(avo.AM, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avy<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avy<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fia $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            foy.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cuc $$5 = $$3.b();
               $$0.a(foy.this.p, $$5.r(), $$1, $$2);
            } else {
               xe $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(foy.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avy<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aE_().sort(this.n);
      }

      class a extends fjj.a<foy.b.a> {
         private final cuc b;

         a(cuc $$0) {
            this.b = $$0;
         }

         public cuc b() {
            return this.b;
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(foy.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.v(), $$3 + 1, $$2 + 1);
            if (foy.this.E != null) {
               for (int $$10 = 0; $$10 < foy.this.E.a.size(); $$10++) {
                  avw<dfc> $$12;
                  if (this.b instanceof csc $$11) {
                     $$12 = foy.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < foy.this.E.m.size(); $$14++) {
                  this.a($$0, foy.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + foy.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fia $$0, @Nullable avw<?> $$1, int $$2, int $$3, boolean $$4) {
            xe $$5 = (xe)($$1 == null ? foy.v : xe.b($$1.a(foy.this.G.a($$1))));
            $$0.b(foy.this.p, $$5, $$2 - foy.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", this.b.r());
         }
      }

      class b implements Comparator<foy.b.a> {
         public int a(foy.b.a $$0, foy.b.a $$1) {
            cuc $$2 = $$0.b();
            cuc $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avy<dfc> $$6 = (avy<dfc>)b.this.o;
               $$4 = $$2 instanceof csc ? foy.this.G.a($$6, ((csc)$$2).d()) : -1;
               $$5 = $$3 instanceof csc ? foy.this.G.a($$6, ((csc)$$3).d()) : -1;
            } else {
               avy<cuc> $$9 = (avy<cuc>)b.this.o;
               $$4 = foy.this.G.a($$9, $$2);
               $$5 = foy.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cuc.a($$2), cuc.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fjj<foy.c.a> {
      public c(fgj $$0) {
         super($$0, foy.this.n, foy.this.o - 33 - 58, 33, 9 * 4);

         for (bsb<?> $$1 : lh.g) {
            if (foy.this.G.a(avz.g.b($$1)) > 0 || foy.this.G.a(avz.h.b($$1)) > 0) {
               this.b(new foy.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fjj.a<foy.c.a> {
         private final xe b;
         private final xe c;
         private final xe d;
         private final boolean e;
         private final boolean f;

         public a(bsb<?> $$0) {
            this.b = $$0.h();
            int $$1 = foy.this.G.a(avz.g.b($$0));
            if ($$1 == 0) {
               this.c = xe.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xe.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = foy.this.G.a(avz.h.b($$0));
            if ($$2 == 0) {
               this.d = xe.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xe.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(foy.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(foy.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(foy.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", xd.a(this.c, this.d));
         }
      }
   }
}
