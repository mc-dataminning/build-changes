import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fob extends fnx {
   private static final wy b = wy.c("gui.stats");
   static final akq c = akq.b("container/slot");
   static final akq q = akq.b("statistics/header");
   static final akq r = akq.b("statistics/sort_up");
   static final akq s = akq.b("statistics/sort_down");
   private static final wy u = wy.c("multiplayer.downloadingStats");
   static final wy v = wy.c("stats.none");
   private static final wy w = wy.c("stat.generalButton");
   private static final wy x = wy.c("stat.itemsButton");
   private static final wy y = wy.c("stat.mobsButton");
   protected final fnx a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private flt C = new flt(this, 33, 58);
   @Nullable
   private fob.a D;
   @Nullable
   fob.b E;
   @Nullable
   private fob.c F;
   final avz G;
   @Nullable
   private fjc<?> H;
   private boolean I = true;

   public fob(fnx $$0, avz $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aP_() {
      this.C.c(new fiv(this.o, u));
      this.l.L().b(new ags(ags.a.b));
   }

   public void m() {
      this.D = new fob.a(this.l);
      this.E = new fob.b(this.l);
      this.F = new fob.c(this.l);
   }

   public void D() {
      flt $$0 = new flt(this, 33, 58);
      $$0.a(b, this.o);
      flx $$1 = $$0.b(flx.d()).a(5);
      $$1.c().b();
      flx $$2 = $$1.a(flx.e()).a(5);
      $$2.a(fig.a(w, $$0x -> this.a(this.D)).a(120).a());
      fig $$3 = $$2.a(fig.a(x, $$0x -> this.a(this.E)).a(120).a());
      fig $$4 = $$2.a(fig.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fig.a(wx.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aG_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aG_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      if (this.H != null) {
         this.H.a(this.m, this.C);
      }
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   public void E() {
      if (this.I) {
         this.m();
         this.a(this.D);
         this.D();
         this.aE_();
         this.I = false;
      }
   }

   @Override
   public boolean k() {
      return !this.I;
   }

   public void a(@Nullable fjc<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(avv<akq> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fjc<fob.a.a> {
      public a(final fgi $$0) {
         super($$0, fob.this.m, fob.this.n - 33 - 58, 33, 14);
         ObjectArrayList<avv<akq>> $$1 = new ObjectArrayList(avy.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> grl.a(fob.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avv<akq> $$2 = (avv<akq>)var4.next();
            this.b(new fob.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fjc.a<fob.a.a> {
         private final avv<akq> b;
         private final wy c;

         a(final avv<akq> $$0) {
            this.b = $$0;
            this.c = wy.c(fob.a($$0));
         }

         private String b() {
            return this.b.a(fob.this.G.a(this.b));
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fob.this.o, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fob.this.o, $$12, $$3 + $$4 - fob.this.o.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", wy.i().b(this.c).b(wx.v).f(this.b()));
         }
      }
   }

   class b extends fjc<fob.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akq[] z = new akq[]{
         akq.b("statistics/block_mined"),
         akq.b("statistics/item_broken"),
         akq.b("statistics/item_crafted"),
         akq.b("statistics/item_used"),
         akq.b("statistics/item_picked_up"),
         akq.b("statistics/item_dropped")
      };
      protected final List<avx<dfw>> a;
      protected final List<avx<cuj>> m;
      protected final Comparator<fob.b.a> n = new fob.b.b();
      @Nullable
      protected avx<?> o;
      protected int p = -1;
      protected int q;

      public b(final fgi $$0) {
         super($$0, fob.this.m, fob.this.n - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avy.a);
         this.m = Lists.newArrayList(new avx[]{avy.d, avy.b, avy.c, avy.e, avy.f});
         this.a(true, 22);
         Set<cuj> $$1 = Sets.newIdentityHashSet();

         for (cuj $$2 : lt.g) {
            boolean $$3 = false;

            for (avx<cuj> $$4 : this.m) {
               if ($$4.a($$2) && fob.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dfw $$5 : lt.e) {
            boolean $$6 = false;

            for (avx<dfw> $$7 : this.a) {
               if ($$7.a($$5) && fob.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cur.a);

         for (cuj $$8 : $$1) {
            this.b(new fob.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fht $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akq $$4 = this.p == $$3 ? fob.c : fob.q;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akq $$6 = this.q == 1 ? fob.r : fob.s;
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
            this.c.aj().a(gto.a(avo.Ar, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avx<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avx<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fht $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fob.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cuj $$5 = $$3.b();
               $$0.a(fob.this.o, $$5.s(), $$1, $$2);
            } else {
               wy $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fob.this.o, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avx<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aG_().sort(this.n);
      }

      class a extends fjc.a<fob.b.a> {
         private final cuj b;

         a(final cuj $$0) {
            this.b = $$0;
         }

         public cuj b() {
            return this.b;
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fob.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fob.this.E != null) {
               for (int $$10 = 0; $$10 < fob.this.E.a.size(); $$10++) {
                  avv<dfw> $$12;
                  if (this.b instanceof csm $$11) {
                     $$12 = fob.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fob.this.E.m.size(); $$14++) {
                  this.a($$0, fob.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fob.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fht $$0, @Nullable avv<?> $$1, int $$2, int $$3, boolean $$4) {
            wy $$5 = (wy)($$1 == null ? fob.v : wy.b($$1.a(fob.this.G.a($$1))));
            $$0.b(fob.this.o, $$5, $$2 - fob.this.o.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fob.b.a> {
         public int a(fob.b.a $$0, fob.b.a $$1) {
            cuj $$2 = $$0.b();
            cuj $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avx<dfw> $$6 = (avx<dfw>)b.this.o;
               $$4 = $$2 instanceof csm ? fob.this.G.a($$6, ((csm)$$2).d()) : -1;
               $$5 = $$3 instanceof csm ? fob.this.G.a($$6, ((csm)$$3).d()) : -1;
            } else {
               avx<cuj> $$9 = (avx<cuj>)b.this.o;
               $$4 = fob.this.G.a($$9, $$2);
               $$5 = fob.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cuj.a($$2), cuj.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fjc<fob.c.a> {
      public c(final fgi $$0) {
         super($$0, fob.this.m, fob.this.n - 33 - 58, 33, 9 * 4);

         for (bsw<?> $$1 : lt.f) {
            if (fob.this.G.a(avy.g.b($$1)) > 0 || fob.this.G.a(avy.h.b($$1)) > 0) {
               this.b(new fob.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fjc.a<fob.c.a> {
         private final wy b;
         private final wy c;
         private final wy d;
         private final boolean e;
         private final boolean f;

         public a(final bsw<?> $$0) {
            this.b = $$0.h();
            int $$1 = fob.this.G.a(avy.g.b($$0));
            if ($$1 == 0) {
               this.c = wy.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wy.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fob.this.G.a(avy.h.b($$0));
            if ($$2 == 0) {
               this.d = wy.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wy.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fob.this.o, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fob.this.o, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fob.this.o, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", wx.a(this.c, this.d));
         }
      }
   }
}
