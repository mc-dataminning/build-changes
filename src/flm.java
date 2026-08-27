import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class flm extends fld {
   private static final wu b = wu.c("gui.stats");
   static final akh c = new akh("container/slot");
   static final akh d = new akh("statistics/header");
   static final akh r = new akh("statistics/sort_up");
   static final akh s = new akh("statistics/sort_down");
   private static final wu u = wu.c("multiplayer.downloadingStats");
   static final wu v = wu.c("stats.none");
   private static final wu w = wu.c("stat.generalButton");
   private static final wu x = wu.c("stat.itemsButton");
   private static final wu y = wu.c("stat.mobsButton");
   protected final fld a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fir C = new fir(this, 33, 58);
   @Nullable
   private flm.a D;
   @Nullable
   flm.b E;
   @Nullable
   private flm.c F;
   final avn G;
   @Nullable
   private fga<?> H;
   private boolean I = true;

   public flm(fld $$0, avn $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aM_() {
      this.C.c(new fft(this.p, u));
      this.m.L().b(new agj(agj.a.b));
   }

   public void m() {
      this.D = new flm.a(this.m);
      this.E = new flm.b(this.m);
      this.F = new flm.c(this.m);
   }

   public void C() {
      fir $$0 = new fir(this, 33, 58);
      $$0.a(b, this.p);
      fiv $$1 = $$0.b(fiv.d()).a(5);
      $$1.c().b();
      fiv $$2 = $$1.a(fiv.e()).a(5);
      $$2.a(ffe.a(w, $$0x -> this.a(this.D)).a(120).a());
      ffe $$3 = $$2.a(ffe.a(x, $$0x -> this.a(this.E)).a(120).a());
      ffe $$4 = $$2.a(ffe.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(ffe.a(wt.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aE_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aE_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         ffc var10000 = this.c($$1x);
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
         this.m();
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

   public void a(@Nullable fga<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(avj<akh> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fga<flm.a.a> {
      public a(fde $$0) {
         super($$0, flm.this.n, flm.this.o - 33 - 58, 33, 14);
         ObjectArrayList<avj<akh>> $$1 = new ObjectArrayList(avm.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> goe.a(flm.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avj<akh> $$2 = (avj<akh>)var4.next();
            this.b(new flm.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fga.a<flm.a.a> {
         private final avj<akh> b;
         private final wu c;

         a(avj<akh> $$0) {
            this.b = $$0;
            this.c = wu.c(flm.a($$0));
         }

         private String b() {
            return this.b.a(flm.this.G.a(this.b));
         }

         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(flm.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(flm.this.p, $$12, $$3 + $$4 - flm.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", wu.i().b(this.c).b(wt.v).f(this.b()));
         }
      }
   }

   class b extends fga<flm.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akh[] z = new akh[]{
         new akh("statistics/block_mined"),
         new akh("statistics/item_broken"),
         new akh("statistics/item_crafted"),
         new akh("statistics/item_used"),
         new akh("statistics/item_picked_up"),
         new akh("statistics/item_dropped")
      };
      protected final List<avl<dde>> a;
      protected final List<avl<csu>> m;
      protected final Comparator<flm.b.a> n = new flm.b.b();
      @Nullable
      protected avl<?> o;
      protected int p = -1;
      protected int q;

      public b(fde $$0) {
         super($$0, flm.this.n, flm.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avm.a);
         this.m = Lists.newArrayList(new avl[]{avm.d, avm.b, avm.c, avm.e, avm.f});
         this.a(true, 22);
         Set<csu> $$1 = Sets.newIdentityHashSet();

         for (csu $$2 : ld.h) {
            boolean $$3 = false;

            for (avl<csu> $$4 : this.m) {
               if ($$4.a($$2) && flm.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dde $$5 : ld.e) {
            boolean $$6 = false;

            for (avl<dde> $$7 : this.a) {
               if ($$7.a($$5) && flm.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.q());
            }
         }

         $$1.remove(ctc.a);

         for (csu $$8 : $$1) {
            this.b(new flm.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fer $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akh $$4 = this.p == $$3 ? flm.c : flm.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akh $$6 = this.q == 1 ? flm.r : flm.s;
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
            this.c.ak().a(gqh.a(avc.Ad, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avl<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avl<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fer $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            flm.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               csu $$5 = $$3.b();
               $$0.a(flm.this.p, $$5.r(), $$1, $$2);
            } else {
               wu $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(flm.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avl<?> $$0) {
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

      class a extends fga.a<flm.b.a> {
         private final csu b;

         a(csu $$0) {
            this.b = $$0;
         }

         public csu b() {
            return this.b;
         }

         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(flm.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.v(), $$3 + 1, $$2 + 1);
            if (flm.this.E != null) {
               for (int $$10 = 0; $$10 < flm.this.E.a.size(); $$10++) {
                  avj<dde> $$12;
                  if (this.b instanceof cqx $$11) {
                     $$12 = flm.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < flm.this.E.m.size(); $$14++) {
                  this.a($$0, flm.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + flm.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fer $$0, @Nullable avj<?> $$1, int $$2, int $$3, boolean $$4) {
            wu $$5 = (wu)($$1 == null ? flm.v : wu.b($$1.a(flm.this.G.a($$1))));
            $$0.b(flm.this.p, $$5, $$2 - flm.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", this.b.r());
         }
      }

      class b implements Comparator<flm.b.a> {
         public int a(flm.b.a $$0, flm.b.a $$1) {
            csu $$2 = $$0.b();
            csu $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avl<dde> $$6 = (avl<dde>)b.this.o;
               $$4 = $$2 instanceof cqx ? flm.this.G.a($$6, ((cqx)$$2).d()) : -1;
               $$5 = $$3 instanceof cqx ? flm.this.G.a($$6, ((cqx)$$3).d()) : -1;
            } else {
               avl<csu> $$9 = (avl<csu>)b.this.o;
               $$4 = flm.this.G.a($$9, $$2);
               $$5 = flm.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(csu.a($$2), csu.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fga<flm.c.a> {
      public c(fde $$0) {
         super($$0, flm.this.n, flm.this.o - 33 - 58, 33, 9 * 4);

         for (brn<?> $$1 : ld.g) {
            if (flm.this.G.a(avm.g.b($$1)) > 0 || flm.this.G.a(avm.h.b($$1)) > 0) {
               this.b(new flm.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fga.a<flm.c.a> {
         private final wu b;
         private final wu c;
         private final wu d;
         private final boolean e;
         private final boolean f;

         public a(brn<?> $$0) {
            this.b = $$0.h();
            int $$1 = flm.this.G.a(avm.g.b($$0));
            if ($$1 == 0) {
               this.c = wu.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wu.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = flm.this.G.a(avm.h.b($$0));
            if ($$2 == 0) {
               this.d = wu.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wu.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(flm.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(flm.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(flm.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", wt.a(this.c, this.d));
         }
      }
   }
}
