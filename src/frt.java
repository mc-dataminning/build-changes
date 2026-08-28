import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class frt extends frp {
   private static final xl b = xl.c("gui.stats");
   static final all c = all.b("container/slot");
   static final all d = all.b("statistics/header");
   static final all s = all.b("statistics/sort_up");
   static final all u = all.b("statistics/sort_down");
   private static final xl v = xl.c("multiplayer.downloadingStats");
   static final xl w = xl.c("stats.none");
   private static final xl x = xl.c("stat.generalButton");
   private static final xl y = xl.c("stat.itemsButton");
   private static final xl z = xl.c("stat.mobsButton");
   protected final frp a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fpl D = new fpl(this, 33, 58);
   @Nullable
   private frt.a E;
   @Nullable
   frt.b F;
   @Nullable
   private frt.c G;
   final awz H;
   @Nullable
   private fms<?> I;
   private boolean J = true;

   public frt(frp $$0, awz $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aS_() {
      this.D.c(new fml(this.p, v));
      this.m.L().b(new ahj(ahj.a.b));
   }

   public void m() {
      this.E = new frt.a(this.m);
      this.F = new frt.b(this.m);
      this.G = new frt.c(this.m);
   }

   public void D() {
      fpl $$0 = new fpl(this, 33, 58);
      $$0.a(b, this.p);
      fpp $$1 = $$0.b(fpp.d()).a(5);
      $$1.c().b();
      fpp $$2 = $$1.a(fpp.e()).a(5);
      $$2.a(flw.a(x, $$0x -> this.a(this.E)).a(120).a());
      flw $$3 = $$2.a(flw.a(y, $$0x -> this.a(this.F)).a(120).a());
      flw $$4 = $$2.a(flw.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(flw.a(xk.d, $$0x -> this.aP_()).a(200).a());
      if (this.F != null && this.F.aI_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aI_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         flu var10000 = this.c($$1x);
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
   public void aP_() {
      this.m.a(this.a);
   }

   public void E() {
      if (this.J) {
         this.m();
         this.a(this.E);
         this.D();
         this.aG_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable fms<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awv<all> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fms<frt.a.a> {
      public a(final fjx $$0) {
         super($$0, frt.this.n, frt.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awv<all>> $$1 = new ObjectArrayList(awy.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> haa.a(frt.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awv<all> $$2 = (awv<all>)var4.next();
            this.b(new frt.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fms.a<frt.a.a> {
         private final awv<all> b;
         private final xl c;

         a(final awv<all> $$0) {
            this.b = $$0;
            this.c = xl.c(frt.a($$0));
         }

         private String b() {
            return this.b.a(frt.this.H.a(this.b));
         }

         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(frt.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(frt.this.p, $$12, $$3 + $$4 - frt.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", xl.i().b(this.c).b(xk.v).f(this.b()));
         }
      }
   }

   class b extends fms<frt.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final all[] z = new all[]{
         all.b("statistics/block_mined"),
         all.b("statistics/item_broken"),
         all.b("statistics/item_crafted"),
         all.b("statistics/item_used"),
         all.b("statistics/item_picked_up"),
         all.b("statistics/item_dropped")
      };
      protected final List<awx<dij>> a;
      protected final List<awx<cwb>> m;
      protected final Comparator<frt.b.a> n = new frt.b.b();
      @Nullable
      protected awx<?> o;
      protected int p = -1;
      protected int q;

      public b(final fjx $$0) {
         super($$0, frt.this.n, frt.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awy.a);
         this.m = Lists.newArrayList(new awx[]{awy.d, awy.b, awy.c, awy.e, awy.f});
         this.a(true, 22);
         Set<cwb> $$1 = Sets.newIdentityHashSet();

         for (cwb $$2 : lz.g) {
            boolean $$3 = false;

            for (awx<cwb> $$4 : this.m) {
               if ($$4.a($$2) && frt.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dij $$5 : lz.e) {
            boolean $$6 = false;

            for (awx<dij> $$7 : this.a) {
               if ($$7.a($$5) && frt.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cwj.a);

         for (cwb $$8 : $$1) {
            this.b(new frt.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(flj $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            all $$4 = this.p == $$3 ? frt.c : frt.d;
            $$0.a(gjh::B, $$4, $$1 + this.a($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            all $$6 = this.q == 1 ? frt.s : frt.u;
            $$0.a(gjh::B, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gjh::B, this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hcl.a(awo.Av, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awx<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awx<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(flj $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            frt.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cwb $$5 = $$3.b();
               $$0.a(frt.this.p, $$5.n(), $$1, $$2, $$5.g().a(ku.G));
            } else {
               xl $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(frt.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awx<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aI_().sort(this.n);
      }

      class a extends fms.a<frt.b.a> {
         private final cwb b;

         a(final cwb $$0) {
            this.b = $$0;
         }

         public cwb b() {
            return this.b;
         }

         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gjh::B, frt.c, $$3, $$2, 18, 18);
            $$0.b(this.b.o(), $$3 + 1, $$2 + 1);
            if (frt.this.F != null) {
               for (int $$10 = 0; $$10 < frt.this.F.a.size(); $$10++) {
                  awv<dij> $$12;
                  if (this.b instanceof cul $$11) {
                     $$12 = frt.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < frt.this.F.m.size(); $$14++) {
                  this.a($$0, frt.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + frt.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(flj $$0, @Nullable awv<?> $$1, int $$2, int $$3, boolean $$4) {
            xl $$5 = (xl)($$1 == null ? frt.w : xl.b($$1.a(frt.this.H.a($$1))));
            $$0.b(frt.this.p, $$5, $$2 - frt.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", this.b.n());
         }
      }

      class b implements Comparator<frt.b.a> {
         public int a(frt.b.a $$0, frt.b.a $$1) {
            cwb $$2 = $$0.b();
            cwb $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awx<dij> $$6 = (awx<dij>)b.this.o;
               $$4 = $$2 instanceof cul ? frt.this.H.a($$6, ((cul)$$2).d()) : -1;
               $$5 = $$3 instanceof cul ? frt.this.H.a($$6, ((cul)$$3).d()) : -1;
            } else {
               awx<cwb> $$9 = (awx<cwb>)b.this.o;
               $$4 = frt.this.H.a($$9, $$2);
               $$5 = frt.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cwb.a($$2), cwb.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fms<frt.c.a> {
      public c(final fjx $$0) {
         super($$0, frt.this.n, frt.this.o - 33 - 58, 33, 9 * 4);

         for (bup<?> $$1 : lz.f) {
            if (frt.this.H.a(awy.g.b($$1)) > 0 || frt.this.H.a(awy.h.b($$1)) > 0) {
               this.b(new frt.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fms.a<frt.c.a> {
         private final xl b;
         private final xl c;
         private final xl d;
         private final boolean e;
         private final boolean f;

         public a(final bup<?> $$0) {
            this.b = $$0.h();
            int $$1 = frt.this.H.a(awy.g.b($$0));
            if ($$1 == 0) {
               this.c = xl.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xl.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = frt.this.H.a(awy.h.b($$0));
            if ($$2 == 0) {
               this.d = xl.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xl.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(frt.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(frt.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(frt.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", xk.a(this.c, this.d));
         }
      }
   }
}
