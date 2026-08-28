import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fub extends ftx {
   private static final xv b = xv.c("gui.stats");
   static final alz c = alz.b("container/slot");
   static final alz d = alz.b("statistics/header");
   static final alz s = alz.b("statistics/sort_up");
   static final alz u = alz.b("statistics/sort_down");
   private static final xv v = xv.c("multiplayer.downloadingStats");
   static final xv w = xv.c("stats.none");
   private static final xv x = xv.c("stat.generalButton");
   private static final xv y = xv.c("stat.itemsButton");
   private static final xv z = xv.c("stat.mobsButton");
   protected final ftx a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private frt D = new frt(this, 33, 58);
   @Nullable
   private fub.a E;
   @Nullable
   fub.b F;
   @Nullable
   private fub.c G;
   final axq H;
   @Nullable
   private fpb<?> I;
   private boolean J = true;

   public fub(ftx $$0, axq $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aT_() {
      this.D.c(new fou(this.p, v));
      this.m.L().b(new ahx(ahx.a.b));
   }

   public void l() {
      this.E = new fub.a(this.m);
      this.F = new fub.b(this.m);
      this.G = new fub.c(this.m);
   }

   public void E() {
      frt $$0 = new frt(this, 33, 58);
      $$0.a(b, this.p);
      frx $$1 = $$0.b(frx.d()).a(5);
      $$1.c().b();
      frx $$2 = $$1.a(frx.e()).a(5);
      $$2.a(foe.a(x, $$0x -> this.a(this.E)).a(120).a());
      foe $$3 = $$2.a(foe.a(y, $$0x -> this.a(this.F)).a(120).a());
      foe $$4 = $$2.a(foe.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(foe.a(xu.d, $$0x -> this.aP_()).a(200).a());
      if (this.F != null && this.F.aI_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aI_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         foc var10000 = this.c($$1x);
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

   public void F() {
      if (this.J) {
         this.l();
         this.a(this.E);
         this.E();
         this.aG_();
         this.J = false;
      }
   }

   @Override
   public boolean j() {
      return !this.J;
   }

   public void a(@Nullable fpb<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(axm<alz> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fpb<fub.a.a> {
      public a(final fmf $$0) {
         super($$0, fub.this.n, fub.this.o - 33 - 58, 33, 14);
         ObjectArrayList<axm<alz>> $$1 = new ObjectArrayList(axp.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hcr.a(fub.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            axm<alz> $$2 = (axm<alz>)var4.next();
            this.b(new fub.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fpb.a<fub.a.a> {
         private final axm<alz> b;
         private final xv c;

         a(final axm<alz> $$0) {
            this.b = $$0;
            this.c = xv.c(fub.a($$0));
         }

         private String b() {
            return this.b.a(fub.this.H.a(this.b));
         }

         @Override
         public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fub.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fub.this.p, $$12, $$3 + $$4 - fub.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", xv.i().b(this.c).b(xu.v).f(this.b()));
         }
      }
   }

   class b extends fpb<fub.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alz[] z = new alz[]{
         alz.b("statistics/block_mined"),
         alz.b("statistics/item_broken"),
         alz.b("statistics/item_crafted"),
         alz.b("statistics/item_used"),
         alz.b("statistics/item_picked_up"),
         alz.b("statistics/item_dropped")
      };
      protected final List<axo<dkl>> a;
      protected final List<axo<cxk>> m;
      protected final Comparator<fub.b.a> n = new fub.b.b();
      @Nullable
      protected axo<?> o;
      protected int p = -1;
      protected int q;

      public b(final fmf $$0) {
         super($$0, fub.this.n, fub.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(axp.a);
         this.m = Lists.newArrayList(new axo[]{axp.d, axp.b, axp.c, axp.e, axp.f});
         this.a(true, 22);
         Set<cxk> $$1 = Sets.newIdentityHashSet();

         for (cxk $$2 : ma.g) {
            boolean $$3 = false;

            for (axo<cxk> $$4 : this.m) {
               if ($$4.a($$2) && fub.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dkl $$5 : ma.e) {
            boolean $$6 = false;

            for (axo<dkl> $$7 : this.a) {
               if ($$7.a($$5) && fub.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cxs.a);

         for (cxk $$8 : $$1) {
            this.b(new fub.b.a($$8));
         }
      }

      int n(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fnr $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alz $$4 = this.p == $$3 ? fub.c : fub.d;
            $$0.a(glu::C, $$4, $$1 + this.n($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.n(this.b(this.o)) - 36;
            alz $$6 = this.q == 1 ? fub.s : fub.u;
            $$0.a(glu::C, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(glu::C, this.z[$$7], $$1 + this.n($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
         }
      }

      @Override
      public int a() {
         return 280;
      }

      @Override
      protected boolean a(int $$0, int $$1) {
         this.p = -1;

         for (int $$2 = 0; $$2 < this.z.length; $$2++) {
            int $$3 = $$0 - this.n($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.p = $$2;
               break;
            }
         }

         if (this.p >= 0) {
            this.a(this.o(this.p));
            this.c.ak().a(hfc.a(axf.AQ, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private axo<?> o(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(axo<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fnr $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fub.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cxk $$5 = $$3.b();
               $$0.a(fub.this.p, $$5.m(), $$1, $$2, $$5.g().a(ku.G));
            } else {
               xv $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.n($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.o($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fub.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(axo<?> $$0) {
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

      class a extends fpb.a<fub.b.a> {
         private final cxk b;

         a(final cxk $$0) {
            this.b = $$0;
         }

         public cxk b() {
            return this.b;
         }

         @Override
         public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(glu::C, fub.c, $$3, $$2, 18, 18);
            $$0.b(this.b.n(), $$3 + 1, $$2 + 1);
            if (fub.this.F != null) {
               for (int $$10 = 0; $$10 < fub.this.F.a.size(); $$10++) {
                  axm<dkl> $$12;
                  if (this.b instanceof cvu $$11) {
                     $$12 = fub.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.n($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fub.this.F.m.size(); $$14++) {
                  this.a($$0, fub.this.F.m.get($$14).b(this.b), $$3 + b.this.n($$14 + fub.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fnr $$0, @Nullable axm<?> $$1, int $$2, int $$3, boolean $$4) {
            xv $$5 = (xv)($$1 == null ? fub.w : xv.b($$1.a(fub.this.H.a($$1))));
            $$0.b(fub.this.p, $$5, $$2 - fub.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", this.b.m());
         }
      }

      class b implements Comparator<fub.b.a> {
         public int a(fub.b.a $$0, fub.b.a $$1) {
            cxk $$2 = $$0.b();
            cxk $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               axo<dkl> $$6 = (axo<dkl>)b.this.o;
               $$4 = $$2 instanceof cvu ? fub.this.H.a($$6, ((cvu)$$2).d()) : -1;
               $$5 = $$3 instanceof cvu ? fub.this.H.a($$6, ((cvu)$$3).d()) : -1;
            } else {
               axo<cxk> $$9 = (axo<cxk>)b.this.o;
               $$4 = fub.this.H.a($$9, $$2);
               $$5 = fub.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cxk.a($$2), cxk.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fpb<fub.c.a> {
      public c(final fmf $$0) {
         super($$0, fub.this.n, fub.this.o - 33 - 58, 33, 9 * 4);

         for (bvq<?> $$1 : ma.f) {
            if (fub.this.H.a(axp.g.b($$1)) > 0 || fub.this.H.a(axp.h.b($$1)) > 0) {
               this.b(new fub.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fpb.a<fub.c.a> {
         private final xv b;
         private final xv c;
         private final xv d;
         private final boolean e;
         private final boolean f;

         public a(final bvq<?> $$0) {
            this.b = $$0.h();
            int $$1 = fub.this.H.a(axp.g.b($$0));
            if ($$1 == 0) {
               this.c = xv.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xv.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fub.this.H.a(axp.h.b($$0));
            if ($$2 == 0) {
               this.d = xv.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xv.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fub.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fub.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fub.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", xu.a(this.c, this.d));
         }
      }
   }
}
