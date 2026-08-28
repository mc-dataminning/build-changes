import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fnl extends fnc {
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
   protected final fnc a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fkq C = new fkq(this, 33, 58);
   @Nullable
   private fnl.a D;
   @Nullable
   fnl.b E;
   @Nullable
   private fnl.c F;
   final awk G;
   @Nullable
   private fhz<?> H;
   private boolean I = true;

   public fnl(fnc $$0, awk $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aM_() {
      this.C.c(new fhs(this.p, u));
      this.m.L().b(new ahg(ahg.a.b));
   }

   public void m() {
      this.D = new fnl.a(this.m);
      this.E = new fnl.b(this.m);
      this.F = new fnl.c(this.m);
   }

   public void E() {
      fkq $$0 = new fkq(this, 33, 58);
      $$0.a(b, this.p);
      fku $$1 = $$0.b(fku.d()).a(5);
      $$1.c().b();
      fku $$2 = $$1.a(fku.e()).a(5);
      $$2.a(fhd.a(w, $$0x -> this.a(this.D)).a(120).a());
      fhd $$3 = $$2.a(fhd.a(x, $$0x -> this.a(this.E)).a(120).a());
      fhd $$4 = $$2.a(fhd.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fhd.a(xn.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aD_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aD_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fhb var10000 = this.c($$1x);
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

   public void F() {
      if (this.I) {
         this.m();
         this.a(this.D);
         this.E();
         this.aB_();
         this.I = false;
      }
   }

   @Override
   public boolean k() {
      return !this.I;
   }

   public void a(@Nullable fhz<?> $$0) {
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

   class a extends fhz<fnl.a.a> {
      public a(final ffe $$0) {
         super($$0, fnl.this.n, fnl.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awg<ale>> $$1 = new ObjectArrayList(awj.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gqe.a(fnl.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awg<ale> $$2 = (awg<ale>)var4.next();
            this.b(new fnl.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fhz.a<fnl.a.a> {
         private final awg<ale> b;
         private final xo c;

         a(final awg<ale> $$0) {
            this.b = $$0;
            this.c = xo.c(fnl.a($$0));
         }

         private String b() {
            return this.b.a(fnl.this.G.a(this.b));
         }

         @Override
         public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fnl.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fnl.this.p, $$12, $$3 + $$4 - fnl.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", xo.i().b(this.c).b(xn.v).f(this.b()));
         }
      }
   }

   class b extends fhz<fnl.b.a> {
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
      protected final List<awi<dey>> a;
      protected final List<awi<cuj>> m;
      protected final Comparator<fnl.b.a> n = new fnl.b.b();
      @Nullable
      protected awi<?> o;
      protected int p = -1;
      protected int q;

      public b(final ffe $$0) {
         super($$0, fnl.this.n, fnl.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awj.a);
         this.m = Lists.newArrayList(new awi[]{awj.d, awj.b, awj.c, awj.e, awj.f});
         this.a(true, 22);
         Set<cuj> $$1 = Sets.newIdentityHashSet();

         for (cuj $$2 : lp.h) {
            boolean $$3 = false;

            for (awi<cuj> $$4 : this.m) {
               if ($$4.a($$2) && fnl.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dey $$5 : lp.e) {
            boolean $$6 = false;

            for (awi<dey> $$7 : this.a) {
               if ($$7.a($$5) && fnl.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cur.a);

         for (cuj $$8 : $$1) {
            this.b(new fnl.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fgq $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ale $$4 = this.p == $$3 ? fnl.c : fnl.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            ale $$6 = this.q == 1 ? fnl.r : fnl.s;
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
            this.c.aj().a(gsh.a(avz.Ao, 1.0F));
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
      protected void b(fgq $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fnl.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cuj $$5 = $$3.b();
               $$0.a(fnl.this.p, $$5.s(), $$1, $$2);
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
                  $$0.a(fnl.this.p, $$6, $$1, $$2);
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

         this.aD_().sort(this.n);
      }

      class a extends fhz.a<fnl.b.a> {
         private final cuj b;

         a(final cuj $$0) {
            this.b = $$0;
         }

         public cuj b() {
            return this.b;
         }

         @Override
         public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fnl.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fnl.this.E != null) {
               for (int $$10 = 0; $$10 < fnl.this.E.a.size(); $$10++) {
                  awg<dey> $$12;
                  if (this.b instanceof csm $$11) {
                     $$12 = fnl.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fnl.this.E.m.size(); $$14++) {
                  this.a($$0, fnl.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fnl.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fgq $$0, @Nullable awg<?> $$1, int $$2, int $$3, boolean $$4) {
            xo $$5 = (xo)($$1 == null ? fnl.v : xo.b($$1.a(fnl.this.G.a($$1))));
            $$0.b(fnl.this.p, $$5, $$2 - fnl.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fnl.b.a> {
         public int a(fnl.b.a $$0, fnl.b.a $$1) {
            cuj $$2 = $$0.b();
            cuj $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awi<dey> $$6 = (awi<dey>)b.this.o;
               $$4 = $$2 instanceof csm ? fnl.this.G.a($$6, ((csm)$$2).d()) : -1;
               $$5 = $$3 instanceof csm ? fnl.this.G.a($$6, ((csm)$$3).d()) : -1;
            } else {
               awi<cuj> $$9 = (awi<cuj>)b.this.o;
               $$4 = fnl.this.G.a($$9, $$2);
               $$5 = fnl.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cuj.a($$2), cuj.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fhz<fnl.c.a> {
      public c(final ffe $$0) {
         super($$0, fnl.this.n, fnl.this.o - 33 - 58, 33, 9 * 4);

         for (bsz<?> $$1 : lp.g) {
            if (fnl.this.G.a(awj.g.b($$1)) > 0 || fnl.this.G.a(awj.h.b($$1)) > 0) {
               this.b(new fnl.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fhz.a<fnl.c.a> {
         private final xo b;
         private final xo c;
         private final xo d;
         private final boolean e;
         private final boolean f;

         public a(final bsz<?> $$0) {
            this.b = $$0.h();
            int $$1 = fnl.this.G.a(awj.g.b($$0));
            if ($$1 == 0) {
               this.c = xo.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xo.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fnl.this.G.a(awj.h.b($$0));
            if ($$2 == 0) {
               this.d = xo.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xo.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fnl.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fnl.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fnl.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", xn.a(this.c, this.d));
         }
      }
   }
}
