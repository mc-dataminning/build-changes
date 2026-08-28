import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ftv extends ftr {
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
   protected final ftr a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private frn D = new frn(this, 33, 58);
   @Nullable
   private ftv.a E;
   @Nullable
   ftv.b F;
   @Nullable
   private ftv.c G;
   final axq H;
   @Nullable
   private fov<?> I;
   private boolean J = true;

   public ftv(ftr $$0, axq $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aT_() {
      this.D.c(new fon(this.p, v));
      this.m.L().b(new ahx(ahx.a.b));
   }

   public void l() {
      this.E = new ftv.a(this.m);
      this.F = new ftv.b(this.m);
      this.G = new ftv.c(this.m);
   }

   public void E() {
      frn $$0 = new frn(this, 33, 58);
      $$0.a(b, this.p);
      frr $$1 = $$0.b(frr.d()).a(5);
      $$1.c().b();
      frr $$2 = $$1.a(frr.e()).a(5);
      $$2.a(fny.a(x, $$0x -> this.a(this.E)).a(120).a());
      fny $$3 = $$2.a(fny.a(y, $$0x -> this.a(this.F)).a(120).a());
      fny $$4 = $$2.a(fny.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fny.a(xu.d, $$0x -> this.aP_()).a(200).a());
      if (this.F != null && this.F.aI_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aI_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fnw var10000 = this.c($$1x);
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

   public void a(@Nullable fov<?> $$0) {
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

   class a extends fov<ftv.a.a> {
      public a(final flz $$0) {
         super($$0, ftv.this.n, ftv.this.o - 33 - 58, 33, 14);
         ObjectArrayList<axm<alz>> $$1 = new ObjectArrayList(axp.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> hcl.a(ftv.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            axm<alz> $$2 = (axm<alz>)var4.next();
            this.b(new ftv.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fov.a<ftv.a.a> {
         private final axm<alz> b;
         private final xv c;

         a(final axm<alz> $$0) {
            this.b = $$0;
            this.c = xv.c(ftv.a($$0));
         }

         private String b() {
            return this.b.a(ftv.this.H.a(this.b));
         }

         @Override
         public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(ftv.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(ftv.this.p, $$12, $$3 + $$4 - ftv.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", xv.i().b(this.c).b(xu.v).f(this.b()));
         }
      }
   }

   class b extends fov<ftv.b.a> {
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
      protected final List<axo<dke>> a;
      protected final List<axo<cxg>> m;
      protected final Comparator<ftv.b.a> n = new ftv.b.b();
      @Nullable
      protected axo<?> o;
      protected int p = -1;
      protected int q;

      public b(final flz $$0) {
         super($$0, ftv.this.n, ftv.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(axp.a);
         this.m = Lists.newArrayList(new axo[]{axp.d, axp.b, axp.c, axp.e, axp.f});
         this.a(true, 22);
         Set<cxg> $$1 = Sets.newIdentityHashSet();

         for (cxg $$2 : ma.g) {
            boolean $$3 = false;

            for (axo<cxg> $$4 : this.m) {
               if ($$4.a($$2) && ftv.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dke $$5 : ma.e) {
            boolean $$6 = false;

            for (axo<dke> $$7 : this.a) {
               if ($$7.a($$5) && ftv.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cxo.a);

         for (cxg $$8 : $$1) {
            this.b(new ftv.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fnl $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alz $$4 = this.p == $$3 ? ftv.c : ftv.d;
            $$0.a(glo::B, $$4, $$1 + this.a($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            alz $$6 = this.q == 1 ? ftv.s : ftv.u;
            $$0.a(glo::B, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(glo::B, this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            int $$3 = $$0 - this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.p = $$2;
               break;
            }
         }

         if (this.p >= 0) {
            this.a(this.c(this.p));
            this.c.ak().a(hew.a(axf.AP, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private axo<?> c(int $$0) {
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
      protected void b(fnl $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            ftv.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cxg $$5 = $$3.b();
               $$0.a(ftv.this.p, $$5.m(), $$1, $$2, $$5.g().a(ku.G));
            } else {
               xv $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.c($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(ftv.this.p, $$6, $$1, $$2);
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

      class a extends fov.a<ftv.b.a> {
         private final cxg b;

         a(final cxg $$0) {
            this.b = $$0;
         }

         public cxg b() {
            return this.b;
         }

         @Override
         public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(glo::B, ftv.c, $$3, $$2, 18, 18);
            $$0.b(this.b.n(), $$3 + 1, $$2 + 1);
            if (ftv.this.F != null) {
               for (int $$10 = 0; $$10 < ftv.this.F.a.size(); $$10++) {
                  axm<dke> $$12;
                  if (this.b instanceof cvq $$11) {
                     $$12 = ftv.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < ftv.this.F.m.size(); $$14++) {
                  this.a($$0, ftv.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + ftv.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fnl $$0, @Nullable axm<?> $$1, int $$2, int $$3, boolean $$4) {
            xv $$5 = (xv)($$1 == null ? ftv.w : xv.b($$1.a(ftv.this.H.a($$1))));
            $$0.b(ftv.this.p, $$5, $$2 - ftv.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", this.b.m());
         }
      }

      class b implements Comparator<ftv.b.a> {
         public int a(ftv.b.a $$0, ftv.b.a $$1) {
            cxg $$2 = $$0.b();
            cxg $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               axo<dke> $$6 = (axo<dke>)b.this.o;
               $$4 = $$2 instanceof cvq ? ftv.this.H.a($$6, ((cvq)$$2).d()) : -1;
               $$5 = $$3 instanceof cvq ? ftv.this.H.a($$6, ((cvq)$$3).d()) : -1;
            } else {
               axo<cxg> $$9 = (axo<cxg>)b.this.o;
               $$4 = ftv.this.H.a($$9, $$2);
               $$5 = ftv.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cxg.a($$2), cxg.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fov<ftv.c.a> {
      public c(final flz $$0) {
         super($$0, ftv.this.n, ftv.this.o - 33 - 58, 33, 9 * 4);

         for (bvm<?> $$1 : ma.f) {
            if (ftv.this.H.a(axp.g.b($$1)) > 0 || ftv.this.H.a(axp.h.b($$1)) > 0) {
               this.b(new ftv.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fov.a<ftv.c.a> {
         private final xv b;
         private final xv c;
         private final xv d;
         private final boolean e;
         private final boolean f;

         public a(final bvm<?> $$0) {
            this.b = $$0.h();
            int $$1 = ftv.this.H.a(axp.g.b($$0));
            if ($$1 == 0) {
               this.c = xv.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xv.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = ftv.this.H.a(axp.h.b($$0));
            if ($$2 == 0) {
               this.d = xv.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xv.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ftv.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(ftv.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(ftv.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", xu.a(this.c, this.d));
         }
      }
   }
}
