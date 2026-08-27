import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fmh extends fly {
   private static final wx b = wx.c("gui.stats");
   static final akm c = new akm("container/slot");
   static final akm d = new akm("statistics/header");
   static final akm r = new akm("statistics/sort_up");
   static final akm s = new akm("statistics/sort_down");
   private static final wx u = wx.c("multiplayer.downloadingStats");
   static final wx v = wx.c("stats.none");
   private static final wx w = wx.c("stat.generalButton");
   private static final wx x = wx.c("stat.itemsButton");
   private static final wx y = wx.c("stat.mobsButton");
   protected final fly a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fjm C = new fjm(this, 33, 58);
   @Nullable
   private fmh.a D;
   @Nullable
   fmh.b E;
   @Nullable
   private fmh.c F;
   final avs G;
   @Nullable
   private fgv<?> H;
   private boolean I = true;

   public fmh(fly $$0, avs $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aM_() {
      this.C.c(new fgo(this.p, u));
      this.m.L().b(new ago(ago.a.b));
   }

   public void m() {
      this.D = new fmh.a(this.m);
      this.E = new fmh.b(this.m);
      this.F = new fmh.c(this.m);
   }

   public void C() {
      fjm $$0 = new fjm(this, 33, 58);
      $$0.a(b, this.p);
      fjq $$1 = $$0.b(fjq.d()).a(5);
      $$1.c().b();
      fjq $$2 = $$1.a(fjq.e()).a(5);
      $$2.a(ffz.a(w, $$0x -> this.a(this.D)).a(120).a());
      ffz $$3 = $$2.a(ffz.a(x, $$0x -> this.a(this.E)).a(120).a());
      ffz $$4 = $$2.a(ffz.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(ffz.a(ww.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aE_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aE_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         ffx var10000 = this.c($$1x);
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

   public void a(@Nullable fgv<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(avo<akm> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fgv<fmh.a.a> {
      public a(fdz $$0) {
         super($$0, fmh.this.n, fmh.this.o - 33 - 58, 33, 14);
         ObjectArrayList<avo<akm>> $$1 = new ObjectArrayList(avr.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gpb.a(fmh.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avo<akm> $$2 = (avo<akm>)var4.next();
            this.b(new fmh.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fgv.a<fmh.a.a> {
         private final avo<akm> b;
         private final wx c;

         a(avo<akm> $$0) {
            this.b = $$0;
            this.c = wx.c(fmh.a($$0));
         }

         private String b() {
            return this.b.a(fmh.this.G.a(this.b));
         }

         @Override
         public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fmh.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fmh.this.p, $$12, $$3 + $$4 - fmh.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", wx.i().b(this.c).b(ww.v).f(this.b()));
         }
      }
   }

   class b extends fgv<fmh.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akm[] z = new akm[]{
         new akm("statistics/block_mined"),
         new akm("statistics/item_broken"),
         new akm("statistics/item_crafted"),
         new akm("statistics/item_used"),
         new akm("statistics/item_picked_up"),
         new akm("statistics/item_dropped")
      };
      protected final List<avq<ddy>> a;
      protected final List<avq<ctj>> m;
      protected final Comparator<fmh.b.a> n = new fmh.b.b();
      @Nullable
      protected avq<?> o;
      protected int p = -1;
      protected int q;

      public b(fdz $$0) {
         super($$0, fmh.this.n, fmh.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avr.a);
         this.m = Lists.newArrayList(new avq[]{avr.d, avr.b, avr.c, avr.e, avr.f});
         this.a(true, 22);
         Set<ctj> $$1 = Sets.newIdentityHashSet();

         for (ctj $$2 : le.h) {
            boolean $$3 = false;

            for (avq<ctj> $$4 : this.m) {
               if ($$4.a($$2) && fmh.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (ddy $$5 : le.e) {
            boolean $$6 = false;

            for (avq<ddy> $$7 : this.a) {
               if ($$7.a($$5) && fmh.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.q());
            }
         }

         $$1.remove(ctr.a);

         for (ctj $$8 : $$1) {
            this.b(new fmh.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(ffm $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akm $$4 = this.p == $$3 ? fmh.c : fmh.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akm $$6 = this.q == 1 ? fmh.r : fmh.s;
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
            this.c.ak().a(gre.a(avh.Ao, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avq<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avq<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ffm $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fmh.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               ctj $$5 = $$3.b();
               $$0.a(fmh.this.p, $$5.r(), $$1, $$2);
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
                  $$0.a(fmh.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avq<?> $$0) {
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

      class a extends fgv.a<fmh.b.a> {
         private final ctj b;

         a(ctj $$0) {
            this.b = $$0;
         }

         public ctj b() {
            return this.b;
         }

         @Override
         public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fmh.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.v(), $$3 + 1, $$2 + 1);
            if (fmh.this.E != null) {
               for (int $$10 = 0; $$10 < fmh.this.E.a.size(); $$10++) {
                  avo<ddy> $$12;
                  if (this.b instanceof crm $$11) {
                     $$12 = fmh.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fmh.this.E.m.size(); $$14++) {
                  this.a($$0, fmh.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fmh.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(ffm $$0, @Nullable avo<?> $$1, int $$2, int $$3, boolean $$4) {
            wx $$5 = (wx)($$1 == null ? fmh.v : wx.b($$1.a(fmh.this.G.a($$1))));
            $$0.b(fmh.this.p, $$5, $$2 - fmh.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", this.b.r());
         }
      }

      class b implements Comparator<fmh.b.a> {
         public int a(fmh.b.a $$0, fmh.b.a $$1) {
            ctj $$2 = $$0.b();
            ctj $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avq<ddy> $$6 = (avq<ddy>)b.this.o;
               $$4 = $$2 instanceof crm ? fmh.this.G.a($$6, ((crm)$$2).d()) : -1;
               $$5 = $$3 instanceof crm ? fmh.this.G.a($$6, ((crm)$$3).d()) : -1;
            } else {
               avq<ctj> $$9 = (avq<ctj>)b.this.o;
               $$4 = fmh.this.G.a($$9, $$2);
               $$5 = fmh.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(ctj.a($$2), ctj.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fgv<fmh.c.a> {
      public c(fdz $$0) {
         super($$0, fmh.this.n, fmh.this.o - 33 - 58, 33, 9 * 4);

         for (bsa<?> $$1 : le.g) {
            if (fmh.this.G.a(avr.g.b($$1)) > 0 || fmh.this.G.a(avr.h.b($$1)) > 0) {
               this.b(new fmh.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fgv.a<fmh.c.a> {
         private final wx b;
         private final wx c;
         private final wx d;
         private final boolean e;
         private final boolean f;

         public a(bsa<?> $$0) {
            this.b = $$0.h();
            int $$1 = fmh.this.G.a(avr.g.b($$0));
            if ($$1 == 0) {
               this.c = wx.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wx.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fmh.this.G.a(avr.h.b($$0));
            if ($$2 == 0) {
               this.d = wx.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wx.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fmh.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fmh.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fmh.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", ww.a(this.c, this.d));
         }
      }
   }
}
