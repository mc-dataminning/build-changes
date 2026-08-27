import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fmi extends flz {
   private static final wx b = wx.c("gui.stats");
   static final akn c = new akn("container/slot");
   static final akn d = new akn("statistics/header");
   static final akn r = new akn("statistics/sort_up");
   static final akn s = new akn("statistics/sort_down");
   private static final wx u = wx.c("multiplayer.downloadingStats");
   static final wx v = wx.c("stats.none");
   private static final wx w = wx.c("stat.generalButton");
   private static final wx x = wx.c("stat.itemsButton");
   private static final wx y = wx.c("stat.mobsButton");
   protected final flz a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fjn C = new fjn(this, 33, 58);
   @Nullable
   private fmi.a D;
   @Nullable
   fmi.b E;
   @Nullable
   private fmi.c F;
   final avt G;
   @Nullable
   private fgw<?> H;
   private boolean I = true;

   public fmi(flz $$0, avt $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aN_() {
      this.C.c(new fgp(this.p, u));
      this.m.L().b(new agp(agp.a.b));
   }

   public void m() {
      this.D = new fmi.a(this.m);
      this.E = new fmi.b(this.m);
      this.F = new fmi.c(this.m);
   }

   public void C() {
      fjn $$0 = new fjn(this, 33, 58);
      $$0.a(b, this.p);
      fjr $$1 = $$0.b(fjr.d()).a(5);
      $$1.c().b();
      fjr $$2 = $$1.a(fjr.e()).a(5);
      $$2.a(fga.a(w, $$0x -> this.a(this.D)).a(120).a());
      fga $$3 = $$2.a(fga.a(x, $$0x -> this.a(this.E)).a(120).a());
      fga $$4 = $$2.a(fga.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fga.a(ww.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aF_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aF_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         ffy var10000 = this.c($$1x);
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
         this.aD_();
         this.I = false;
      }
   }

   @Override
   public boolean k() {
      return !this.I;
   }

   public void a(@Nullable fgw<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(avp<akn> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fgw<fmi.a.a> {
      public a(feb $$0) {
         super($$0, fmi.this.n, fmi.this.o - 33 - 58, 33, 14);
         ObjectArrayList<avp<akn>> $$1 = new ObjectArrayList(avs.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gpb.a(fmi.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avp<akn> $$2 = (avp<akn>)var4.next();
            this.b(new fmi.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fgw.a<fmi.a.a> {
         private final avp<akn> b;
         private final wx c;

         a(avp<akn> $$0) {
            this.b = $$0;
            this.c = wx.c(fmi.a($$0));
         }

         private String b() {
            return this.b.a(fmi.this.G.a(this.b));
         }

         @Override
         public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fmi.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fmi.this.p, $$12, $$3 + $$4 - fmi.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", wx.i().b(this.c).b(ww.v).f(this.b()));
         }
      }
   }

   class b extends fgw<fmi.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akn[] z = new akn[]{
         new akn("statistics/block_mined"),
         new akn("statistics/item_broken"),
         new akn("statistics/item_crafted"),
         new akn("statistics/item_used"),
         new akn("statistics/item_picked_up"),
         new akn("statistics/item_dropped")
      };
      protected final List<avr<dea>> a;
      protected final List<avr<ctl>> m;
      protected final Comparator<fmi.b.a> n = new fmi.b.b();
      @Nullable
      protected avr<?> o;
      protected int p = -1;
      protected int q;

      public b(feb $$0) {
         super($$0, fmi.this.n, fmi.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avs.a);
         this.m = Lists.newArrayList(new avr[]{avs.d, avs.b, avs.c, avs.e, avs.f});
         this.a(true, 22);
         Set<ctl> $$1 = Sets.newIdentityHashSet();

         for (ctl $$2 : le.h) {
            boolean $$3 = false;

            for (avr<ctl> $$4 : this.m) {
               if ($$4.a($$2) && fmi.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dea $$5 : le.e) {
            boolean $$6 = false;

            for (avr<dea> $$7 : this.a) {
               if ($$7.a($$5) && fmi.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(ctt.a);

         for (ctl $$8 : $$1) {
            this.b(new fmi.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(ffn $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akn $$4 = this.p == $$3 ? fmi.c : fmi.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akn $$6 = this.q == 1 ? fmi.r : fmi.s;
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
            this.c.aj().a(gre.a(avi.Ao, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avr<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avr<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ffn $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fmi.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               ctl $$5 = $$3.b();
               $$0.a(fmi.this.p, $$5.s(), $$1, $$2);
            } else {
               wx $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fmi.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avr<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aF_().sort(this.n);
      }

      class a extends fgw.a<fmi.b.a> {
         private final ctl b;

         a(ctl $$0) {
            this.b = $$0;
         }

         public ctl b() {
            return this.b;
         }

         @Override
         public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fmi.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fmi.this.E != null) {
               for (int $$10 = 0; $$10 < fmi.this.E.a.size(); $$10++) {
                  avp<dea> $$12;
                  if (this.b instanceof cro $$11) {
                     $$12 = fmi.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fmi.this.E.m.size(); $$14++) {
                  this.a($$0, fmi.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fmi.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(ffn $$0, @Nullable avp<?> $$1, int $$2, int $$3, boolean $$4) {
            wx $$5 = (wx)($$1 == null ? fmi.v : wx.b($$1.a(fmi.this.G.a($$1))));
            $$0.b(fmi.this.p, $$5, $$2 - fmi.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fmi.b.a> {
         public int a(fmi.b.a $$0, fmi.b.a $$1) {
            ctl $$2 = $$0.b();
            ctl $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avr<dea> $$6 = (avr<dea>)b.this.o;
               $$4 = $$2 instanceof cro ? fmi.this.G.a($$6, ((cro)$$2).d()) : -1;
               $$5 = $$3 instanceof cro ? fmi.this.G.a($$6, ((cro)$$3).d()) : -1;
            } else {
               avr<ctl> $$9 = (avr<ctl>)b.this.o;
               $$4 = fmi.this.G.a($$9, $$2);
               $$5 = fmi.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(ctl.a($$2), ctl.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fgw<fmi.c.a> {
      public c(feb $$0) {
         super($$0, fmi.this.n, fmi.this.o - 33 - 58, 33, 9 * 4);

         for (bsc<?> $$1 : le.g) {
            if (fmi.this.G.a(avs.g.b($$1)) > 0 || fmi.this.G.a(avs.h.b($$1)) > 0) {
               this.b(new fmi.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fgw.a<fmi.c.a> {
         private final wx b;
         private final wx c;
         private final wx d;
         private final boolean e;
         private final boolean f;

         public a(bsc<?> $$0) {
            this.b = $$0.h();
            int $$1 = fmi.this.G.a(avs.g.b($$0));
            if ($$1 == 0) {
               this.c = wx.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wx.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fmi.this.G.a(avs.h.b($$0));
            if ($$2 == 0) {
               this.d = wx.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wx.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fmi.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fmi.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fmi.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", ww.a(this.c, this.d));
         }
      }
   }
}
