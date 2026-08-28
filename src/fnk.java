import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fnk extends fnb {
   private static final xo b = xo.c("gui.stats");
   static final ale c = new ale("container/slot");
   static final ale d = new ale("statistics/header");
   static final ale r = new ale("statistics/sort_up");
   static final ale s = new ale("statistics/sort_down");
   private static final xo u = xo.c("multiplayer.downloadingStats");
   static final xo v = xo.c("stats.none");
   private static final xo w = xo.c("stat.generalButton");
   private static final xo x = xo.c("stat.itemsButton");
   private static final xo y = xo.c("stat.mobsButton");
   protected final fnb a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fkp C = new fkp(this, 33, 58);
   @Nullable
   private fnk.a D;
   @Nullable
   fnk.b E;
   @Nullable
   private fnk.c F;
   final awk G;
   @Nullable
   private fhy<?> H;
   private boolean I = true;

   public fnk(fnb $$0, awk $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aM_() {
      this.C.c(new fhr(this.p, u));
      this.m.L().b(new ahg(ahg.a.b));
   }

   public void m() {
      this.D = new fnk.a(this.m);
      this.E = new fnk.b(this.m);
      this.F = new fnk.c(this.m);
   }

   public void D() {
      fkp $$0 = new fkp(this, 33, 58);
      $$0.a(b, this.p);
      fkt $$1 = $$0.b(fkt.d()).a(5);
      $$1.c().b();
      fkt $$2 = $$1.a(fkt.e()).a(5);
      $$2.a(fhc.a(w, $$0x -> this.a(this.D)).a(120).a());
      fhc $$3 = $$2.a(fhc.a(x, $$0x -> this.a(this.E)).a(120).a());
      fhc $$4 = $$2.a(fhc.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fhc.a(xn.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aE_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aE_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fha var10000 = this.c($$1x);
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

   public void E() {
      if (this.I) {
         this.m();
         this.a(this.D);
         this.D();
         this.aC_();
         this.I = false;
      }
   }

   @Override
   public boolean k() {
      return !this.I;
   }

   public void a(@Nullable fhy<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(awg<ale> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fhy<fnk.a.a> {
      public a(final ffd $$0) {
         super($$0, fnk.this.n, fnk.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awg<ale>> $$1 = new ObjectArrayList(awj.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gqd.a(fnk.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awg<ale> $$2 = (awg<ale>)var4.next();
            this.b(new fnk.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fhy.a<fnk.a.a> {
         private final awg<ale> b;
         private final xo c;

         a(final awg<ale> $$0) {
            this.b = $$0;
            this.c = xo.c(fnk.a($$0));
         }

         private String b() {
            return this.b.a(fnk.this.G.a(this.b));
         }

         @Override
         public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fnk.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fnk.this.p, $$12, $$3 + $$4 - fnk.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", xo.i().b(this.c).b(xn.v).f(this.b()));
         }
      }
   }

   class b extends fhy<fnk.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ale[] z = new ale[]{
         new ale("statistics/block_mined"),
         new ale("statistics/item_broken"),
         new ale("statistics/item_crafted"),
         new ale("statistics/item_used"),
         new ale("statistics/item_picked_up"),
         new ale("statistics/item_dropped")
      };
      protected final List<awi<dex>> a;
      protected final List<awi<cui>> m;
      protected final Comparator<fnk.b.a> n = new fnk.b.b();
      @Nullable
      protected awi<?> o;
      protected int p = -1;
      protected int q;

      public b(final ffd $$0) {
         super($$0, fnk.this.n, fnk.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awj.a);
         this.m = Lists.newArrayList(new awi[]{awj.d, awj.b, awj.c, awj.e, awj.f});
         this.a(true, 22);
         Set<cui> $$1 = Sets.newIdentityHashSet();

         for (cui $$2 : lp.h) {
            boolean $$3 = false;

            for (awi<cui> $$4 : this.m) {
               if ($$4.a($$2) && fnk.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dex $$5 : lp.e) {
            boolean $$6 = false;

            for (awi<dex> $$7 : this.a) {
               if ($$7.a($$5) && fnk.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cuq.a);

         for (cui $$8 : $$1) {
            this.b(new fnk.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fgp $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ale $$4 = this.p == $$3 ? fnk.c : fnk.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            ale $$6 = this.q == 1 ? fnk.r : fnk.s;
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
            this.c.aj().a(gsg.a(avz.Ao, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awi<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awi<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fgp $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fnk.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cui $$5 = $$3.b();
               $$0.a(fnk.this.p, $$5.s(), $$1, $$2);
            } else {
               xo $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fnk.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awi<?> $$0) {
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

      class a extends fhy.a<fnk.b.a> {
         private final cui b;

         a(final cui $$0) {
            this.b = $$0;
         }

         public cui b() {
            return this.b;
         }

         @Override
         public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fnk.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fnk.this.E != null) {
               for (int $$10 = 0; $$10 < fnk.this.E.a.size(); $$10++) {
                  awg<dex> $$12;
                  if (this.b instanceof csl $$11) {
                     $$12 = fnk.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fnk.this.E.m.size(); $$14++) {
                  this.a($$0, fnk.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fnk.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fgp $$0, @Nullable awg<?> $$1, int $$2, int $$3, boolean $$4) {
            xo $$5 = (xo)($$1 == null ? fnk.v : xo.b($$1.a(fnk.this.G.a($$1))));
            $$0.b(fnk.this.p, $$5, $$2 - fnk.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fnk.b.a> {
         public int a(fnk.b.a $$0, fnk.b.a $$1) {
            cui $$2 = $$0.b();
            cui $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awi<dex> $$6 = (awi<dex>)b.this.o;
               $$4 = $$2 instanceof csl ? fnk.this.G.a($$6, ((csl)$$2).d()) : -1;
               $$5 = $$3 instanceof csl ? fnk.this.G.a($$6, ((csl)$$3).d()) : -1;
            } else {
               awi<cui> $$9 = (awi<cui>)b.this.o;
               $$4 = fnk.this.G.a($$9, $$2);
               $$5 = fnk.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cui.a($$2), cui.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fhy<fnk.c.a> {
      public c(final ffd $$0) {
         super($$0, fnk.this.n, fnk.this.o - 33 - 58, 33, 9 * 4);

         for (bsy<?> $$1 : lp.g) {
            if (fnk.this.G.a(awj.g.b($$1)) > 0 || fnk.this.G.a(awj.h.b($$1)) > 0) {
               this.b(new fnk.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fhy.a<fnk.c.a> {
         private final xo b;
         private final xo c;
         private final xo d;
         private final boolean e;
         private final boolean f;

         public a(final bsy<?> $$0) {
            this.b = $$0.h();
            int $$1 = fnk.this.G.a(awj.g.b($$0));
            if ($$1 == 0) {
               this.c = xo.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xo.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fnk.this.G.a(awj.h.b($$0));
            if ($$2 == 0) {
               this.d = xo.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xo.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fnk.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fnk.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fnk.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", xn.a(this.c, this.d));
         }
      }
   }
}
