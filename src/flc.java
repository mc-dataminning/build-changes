import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class flc extends fkt {
   private static final ws b = ws.c("gui.stats");
   static final akf c = new akf("container/slot");
   static final akf d = new akf("statistics/header");
   static final akf r = new akf("statistics/sort_up");
   static final akf s = new akf("statistics/sort_down");
   private static final ws u = ws.c("multiplayer.downloadingStats");
   static final ws v = ws.c("stats.none");
   private static final ws w = ws.c("stat.generalButton");
   private static final ws x = ws.c("stat.itemsButton");
   private static final ws y = ws.c("stat.mobsButton");
   protected final fkt a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fih C = new fih(this, 33, 58);
   @Nullable
   private flc.a D;
   @Nullable
   flc.b E;
   @Nullable
   private flc.c F;
   final avk G;
   @Nullable
   private ffq<?> H;
   private boolean I = true;

   public flc(fkt $$0, avk $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aM_() {
      this.C.c(new ffj(this.p, u));
      this.m.L().b(new agh(agh.a.b));
   }

   public void m() {
      this.D = new flc.a(this.m);
      this.E = new flc.b(this.m);
      this.F = new flc.c(this.m);
   }

   public void C() {
      fih $$0 = new fih(this, 33, 58);
      $$0.a(b, this.p);
      fil $$1 = $$0.b(fil.d()).a(5);
      $$1.c().b();
      fil $$2 = $$1.a(fil.e()).a(5);
      $$2.a(feu.a(w, $$0x -> this.a(this.D)).a(120).a());
      feu $$3 = $$2.a(feu.a(x, $$0x -> this.a(this.E)).a(120).a());
      feu $$4 = $$2.a(feu.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(feu.a(wr.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aE_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aE_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fes var10000 = this.c($$1x);
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

   public void a(@Nullable ffq<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(avg<akf> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends ffq<flc.a.a> {
      public a(fcu $$0) {
         super($$0, flc.this.n, flc.this.o - 33 - 58, 33, 14);
         ObjectArrayList<avg<akf>> $$1 = new ObjectArrayList(avj.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gnt.a(flc.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avg<akf> $$2 = (avg<akf>)var4.next();
            this.b(new flc.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends ffq.a<flc.a.a> {
         private final avg<akf> b;
         private final ws c;

         a(avg<akf> $$0) {
            this.b = $$0;
            this.c = ws.c(flc.a($$0));
         }

         private String b() {
            return this.b.a(flc.this.G.a(this.b));
         }

         @Override
         public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(flc.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(flc.this.p, $$12, $$3 + $$4 - flc.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public ws a() {
            return ws.a("narrator.select", ws.i().b(this.c).b(wr.v).f(this.b()));
         }
      }
   }

   class b extends ffq<flc.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akf[] z = new akf[]{
         new akf("statistics/block_mined"),
         new akf("statistics/item_broken"),
         new akf("statistics/item_crafted"),
         new akf("statistics/item_used"),
         new akf("statistics/item_picked_up"),
         new akf("statistics/item_dropped")
      };
      protected final List<avi<dcv>> a;
      protected final List<avi<cry>> m;
      protected final Comparator<flc.b.a> n = new flc.b.b();
      @Nullable
      protected avi<?> o;
      protected int p = -1;
      protected int q;

      public b(fcu $$0) {
         super($$0, flc.this.n, flc.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avj.a);
         this.m = Lists.newArrayList(new avi[]{avj.d, avj.b, avj.c, avj.e, avj.f});
         this.a(true, 22);
         Set<cry> $$1 = Sets.newIdentityHashSet();

         for (cry $$2 : lc.h) {
            boolean $$3 = false;

            for (avi<cry> $$4 : this.m) {
               if ($$4.a($$2) && flc.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dcv $$5 : lc.e) {
            boolean $$6 = false;

            for (avi<dcv> $$7 : this.a) {
               if ($$7.a($$5) && flc.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.p());
            }
         }

         $$1.remove(csg.a);

         for (cry $$8 : $$1) {
            this.b(new flc.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(feh $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akf $$4 = this.p == $$3 ? flc.c : flc.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akf $$6 = this.q == 1 ? flc.r : flc.s;
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
            this.c.ak().a(gpw.a(auz.Ac, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avi<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avi<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(feh $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            flc.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cry $$5 = $$3.b();
               $$0.a(flc.this.p, $$5.t(), $$1, $$2);
            } else {
               ws $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(flc.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avi<?> $$0) {
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

      class a extends ffq.a<flc.b.a> {
         private final cry b;

         a(cry $$0) {
            this.b = $$0;
         }

         public cry b() {
            return this.b;
         }

         @Override
         public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(flc.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.x(), $$3 + 1, $$2 + 1);
            if (flc.this.E != null) {
               for (int $$10 = 0; $$10 < flc.this.E.a.size(); $$10++) {
                  avg<dcv> $$12;
                  if (this.b instanceof cqb $$11) {
                     $$12 = flc.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < flc.this.E.m.size(); $$14++) {
                  this.a($$0, flc.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + flc.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(feh $$0, @Nullable avg<?> $$1, int $$2, int $$3, boolean $$4) {
            ws $$5 = (ws)($$1 == null ? flc.v : ws.b($$1.a(flc.this.G.a($$1))));
            $$0.b(flc.this.p, $$5, $$2 - flc.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public ws a() {
            return ws.a("narrator.select", this.b.t());
         }
      }

      class b implements Comparator<flc.b.a> {
         public int a(flc.b.a $$0, flc.b.a $$1) {
            cry $$2 = $$0.b();
            cry $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avi<dcv> $$6 = (avi<dcv>)b.this.o;
               $$4 = $$2 instanceof cqb ? flc.this.G.a($$6, ((cqb)$$2).d()) : -1;
               $$5 = $$3 instanceof cqb ? flc.this.G.a($$6, ((cqb)$$3).d()) : -1;
            } else {
               avi<cry> $$9 = (avi<cry>)b.this.o;
               $$4 = flc.this.G.a($$9, $$2);
               $$5 = flc.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cry.a($$2), cry.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends ffq<flc.c.a> {
      public c(fcu $$0) {
         super($$0, flc.this.n, flc.this.o - 33 - 58, 33, 9 * 4);

         for (bqr<?> $$1 : lc.g) {
            if (flc.this.G.a(avj.g.b($$1)) > 0 || flc.this.G.a(avj.h.b($$1)) > 0) {
               this.b(new flc.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends ffq.a<flc.c.a> {
         private final ws b;
         private final ws c;
         private final ws d;
         private final boolean e;
         private final boolean f;

         public a(bqr<?> $$0) {
            this.b = $$0.h();
            int $$1 = flc.this.G.a(avj.g.b($$0));
            if ($$1 == 0) {
               this.c = ws.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = ws.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = flc.this.G.a(avj.h.b($$0));
            if ($$2 == 0) {
               this.d = ws.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = ws.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(flc.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(flc.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(flc.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public ws a() {
            return ws.a("narrator.select", wr.a(this.c, this.d));
         }
      }
   }
}
