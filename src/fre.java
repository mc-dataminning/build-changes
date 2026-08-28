import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fre extends fra {
   private static final xi b = xi.c("gui.stats");
   static final ali c = ali.b("container/slot");
   static final ali d = ali.b("statistics/header");
   static final ali s = ali.b("statistics/sort_up");
   static final ali u = ali.b("statistics/sort_down");
   private static final xi v = xi.c("multiplayer.downloadingStats");
   static final xi w = xi.c("stats.none");
   private static final xi x = xi.c("stat.generalButton");
   private static final xi y = xi.c("stat.itemsButton");
   private static final xi z = xi.c("stat.mobsButton");
   protected final fra a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fow D = new fow(this, 33, 58);
   @Nullable
   private fre.a E;
   @Nullable
   fre.b F;
   @Nullable
   private fre.c G;
   final aww H;
   @Nullable
   private fmd<?> I;
   private boolean J = true;

   public fre(fra $$0, aww $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aR_() {
      this.D.c(new flw(this.p, v));
      this.m.L().b(new ahg(ahg.a.b));
   }

   public void m() {
      this.E = new fre.a(this.m);
      this.F = new fre.b(this.m);
      this.G = new fre.c(this.m);
   }

   public void D() {
      fow $$0 = new fow(this, 33, 58);
      $$0.a(b, this.p);
      fpa $$1 = $$0.b(fpa.d()).a(5);
      $$1.c().b();
      fpa $$2 = $$1.a(fpa.e()).a(5);
      $$2.a(flh.a(x, $$0x -> this.a(this.E)).a(120).a());
      flh $$3 = $$2.a(flh.a(y, $$0x -> this.a(this.F)).a(120).a());
      flh $$4 = $$2.a(flh.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(flh.a(xh.d, $$0x -> this.d()).a(200).a());
      if (this.F != null && this.F.aI_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aI_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         flf var10000 = this.c($$1x);
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
   public void d() {
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

   public void a(@Nullable fmd<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(aws<ali> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fmd<fre.a.a> {
      public a(final fji $$0) {
         super($$0, fre.this.n, fre.this.o - 33 - 58, 33, 14);
         ObjectArrayList<aws<ali>> $$1 = new ObjectArrayList(awv.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gzk.a(fre.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            aws<ali> $$2 = (aws<ali>)var4.next();
            this.b(new fre.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fmd.a<fre.a.a> {
         private final aws<ali> b;
         private final xi c;

         a(final aws<ali> $$0) {
            this.b = $$0;
            this.c = xi.c(fre.a($$0));
         }

         private String b() {
            return this.b.a(fre.this.H.a(this.b));
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fre.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fre.this.p, $$12, $$3 + $$4 - fre.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xi a() {
            return xi.a("narrator.select", xi.i().b(this.c).b(xh.v).f(this.b()));
         }
      }
   }

   class b extends fmd<fre.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ali[] z = new ali[]{
         ali.b("statistics/block_mined"),
         ali.b("statistics/item_broken"),
         ali.b("statistics/item_crafted"),
         ali.b("statistics/item_used"),
         ali.b("statistics/item_picked_up"),
         ali.b("statistics/item_dropped")
      };
      protected final List<awu<die>> a;
      protected final List<awu<cvx>> m;
      protected final Comparator<fre.b.a> n = new fre.b.b();
      @Nullable
      protected awu<?> o;
      protected int p = -1;
      protected int q;

      public b(final fji $$0) {
         super($$0, fre.this.n, fre.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awv.a);
         this.m = Lists.newArrayList(new awu[]{awv.d, awv.b, awv.c, awv.e, awv.f});
         this.a(true, 22);
         Set<cvx> $$1 = Sets.newIdentityHashSet();

         for (cvx $$2 : ly.g) {
            boolean $$3 = false;

            for (awu<cvx> $$4 : this.m) {
               if ($$4.a($$2) && fre.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (die $$5 : ly.e) {
            boolean $$6 = false;

            for (awu<die> $$7 : this.a) {
               if ($$7.a($$5) && fre.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cwf.a);

         for (cvx $$8 : $$1) {
            this.b(new fre.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fku $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ali $$4 = this.p == $$3 ? fre.c : fre.d;
            $$0.a(gir::B, $$4, $$1 + this.a($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            ali $$6 = this.q == 1 ? fre.s : fre.u;
            $$0.a(gir::B, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gir::B, this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hbv.a(awl.Av, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awu<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awu<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fku $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fre.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cvx $$5 = $$3.b();
               $$0.a(fre.this.p, $$5.n(), $$1, $$2, $$5.g().a(ku.G));
            } else {
               xi $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fre.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awu<?> $$0) {
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

      class a extends fmd.a<fre.b.a> {
         private final cvx b;

         a(final cvx $$0) {
            this.b = $$0;
         }

         public cvx b() {
            return this.b;
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gir::B, fre.c, $$3, $$2, 18, 18);
            $$0.b(this.b.o(), $$3 + 1, $$2 + 1);
            if (fre.this.F != null) {
               for (int $$10 = 0; $$10 < fre.this.F.a.size(); $$10++) {
                  aws<die> $$12;
                  if (this.b instanceof cuh $$11) {
                     $$12 = fre.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fre.this.F.m.size(); $$14++) {
                  this.a($$0, fre.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fre.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fku $$0, @Nullable aws<?> $$1, int $$2, int $$3, boolean $$4) {
            xi $$5 = (xi)($$1 == null ? fre.w : xi.b($$1.a(fre.this.H.a($$1))));
            $$0.b(fre.this.p, $$5, $$2 - fre.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xi a() {
            return xi.a("narrator.select", this.b.n());
         }
      }

      class b implements Comparator<fre.b.a> {
         public int a(fre.b.a $$0, fre.b.a $$1) {
            cvx $$2 = $$0.b();
            cvx $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awu<die> $$6 = (awu<die>)b.this.o;
               $$4 = $$2 instanceof cuh ? fre.this.H.a($$6, ((cuh)$$2).d()) : -1;
               $$5 = $$3 instanceof cuh ? fre.this.H.a($$6, ((cuh)$$3).d()) : -1;
            } else {
               awu<cvx> $$9 = (awu<cvx>)b.this.o;
               $$4 = fre.this.H.a($$9, $$2);
               $$5 = fre.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cvx.a($$2), cvx.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fmd<fre.c.a> {
      public c(final fji $$0) {
         super($$0, fre.this.n, fre.this.o - 33 - 58, 33, 9 * 4);

         for (bul<?> $$1 : ly.f) {
            if (fre.this.H.a(awv.g.b($$1)) > 0 || fre.this.H.a(awv.h.b($$1)) > 0) {
               this.b(new fre.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fmd.a<fre.c.a> {
         private final xi b;
         private final xi c;
         private final xi d;
         private final boolean e;
         private final boolean f;

         public a(final bul<?> $$0) {
            this.b = $$0.h();
            int $$1 = fre.this.H.a(awv.g.b($$0));
            if ($$1 == 0) {
               this.c = xi.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xi.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fre.this.H.a(awv.h.b($$0));
            if ($$2 == 0) {
               this.d = xi.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xi.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fre.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fre.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fre.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xi a() {
            return xi.a("narrator.select", xh.a(this.c, this.d));
         }
      }
   }
}
