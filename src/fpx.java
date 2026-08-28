import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fpx extends fpt {
   private static final xd b = xd.c("gui.stats");
   static final alb c = alb.b("container/slot");
   static final alb d = alb.b("statistics/header");
   static final alb s = alb.b("statistics/sort_up");
   static final alb u = alb.b("statistics/sort_down");
   private static final xd v = xd.c("multiplayer.downloadingStats");
   static final xd w = xd.c("stats.none");
   private static final xd x = xd.c("stat.generalButton");
   private static final xd y = xd.c("stat.itemsButton");
   private static final xd z = xd.c("stat.mobsButton");
   protected final fpt a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fno D = new fno(this, 33, 58);
   @Nullable
   private fpx.a E;
   @Nullable
   fpx.b F;
   @Nullable
   private fpx.c G;
   final awo H;
   @Nullable
   private fkw<?> I;
   private boolean J = true;

   public fpx(fpt $$0, awo $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aT_() {
      this.D.c(new fkp(this.p, v));
      this.m.L().b(new ahb(ahb.a.b));
   }

   public void m() {
      this.E = new fpx.a(this.m);
      this.F = new fpx.b(this.m);
      this.G = new fpx.c(this.m);
   }

   public void D() {
      fno $$0 = new fno(this, 33, 58);
      $$0.a(b, this.p);
      fns $$1 = $$0.b(fns.d()).a(5);
      $$1.c().b();
      fns $$2 = $$1.a(fns.e()).a(5);
      $$2.a(fka.a(x, $$0x -> this.a(this.E)).a(120).a());
      fka $$3 = $$2.a(fka.a(y, $$0x -> this.a(this.F)).a(120).a());
      fka $$4 = $$2.a(fka.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fka.a(xc.d, $$0x -> this.d()).a(200).a());
      if (this.F != null && this.F.aK_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aK_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fjy var10000 = this.c($$1x);
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
         this.aI_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable fkw<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awk<alb> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fkw<fpx.a.a> {
      public a(final fib $$0) {
         super($$0, fpx.this.n, fpx.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awk<alb>> $$1 = new ObjectArrayList(awn.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gxr.a(fpx.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awk<alb> $$2 = (awk<alb>)var4.next();
            this.b(new fpx.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fkw.a<fpx.a.a> {
         private final awk<alb> b;
         private final xd c;

         a(final awk<alb> $$0) {
            this.b = $$0;
            this.c = xd.c(fpx.a($$0));
         }

         private String b() {
            return this.b.a(fpx.this.H.a(this.b));
         }

         @Override
         public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fpx.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fpx.this.p, $$12, $$3 + $$4 - fpx.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", xd.i().b(this.c).b(xc.v).f(this.b()));
         }
      }
   }

   class b extends fkw<fpx.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alb[] z = new alb[]{
         alb.b("statistics/block_mined"),
         alb.b("statistics/item_broken"),
         alb.b("statistics/item_crafted"),
         alb.b("statistics/item_used"),
         alb.b("statistics/item_picked_up"),
         alb.b("statistics/item_dropped")
      };
      protected final List<awm<dgv>> a;
      protected final List<awm<cvg>> m;
      protected final Comparator<fpx.b.a> n = new fpx.b.b();
      @Nullable
      protected awm<?> o;
      protected int p = -1;
      protected int q;

      public b(final fib $$0) {
         super($$0, fpx.this.n, fpx.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awn.a);
         this.m = Lists.newArrayList(new awm[]{awn.d, awn.b, awn.c, awn.e, awn.f});
         this.a(true, 22);
         Set<cvg> $$1 = Sets.newIdentityHashSet();

         for (cvg $$2 : lu.g) {
            boolean $$3 = false;

            for (awm<cvg> $$4 : this.m) {
               if ($$4.a($$2) && fpx.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dgv $$5 : lu.e) {
            boolean $$6 = false;

            for (awm<dgv> $$7 : this.a) {
               if ($$7.a($$5) && fpx.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cvo.a);

         for (cvg $$8 : $$1) {
            this.b(new fpx.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fjn $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alb $$4 = this.p == $$3 ? fpx.c : fpx.d;
            $$0.a(ghe::C, $$4, $$1 + this.a($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            alb $$6 = this.q == 1 ? fpx.s : fpx.u;
            $$0.a(ghe::C, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(ghe::C, this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.aj().a(gzz.a(awd.Ax, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awm<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awm<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fjn $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fpx.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cvg $$5 = $$3.b();
               $$0.a(fpx.this.p, $$5.s(), $$1, $$2);
            } else {
               xd $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fpx.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awm<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aK_().sort(this.n);
      }

      class a extends fkw.a<fpx.b.a> {
         private final cvg b;

         a(final cvg $$0) {
            this.b = $$0;
         }

         public cvg b() {
            return this.b;
         }

         @Override
         public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(ghe::C, fpx.c, $$3, $$2, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fpx.this.F != null) {
               for (int $$10 = 0; $$10 < fpx.this.F.a.size(); $$10++) {
                  awk<dgv> $$12;
                  if (this.b instanceof ctl $$11) {
                     $$12 = fpx.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fpx.this.F.m.size(); $$14++) {
                  this.a($$0, fpx.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fpx.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fjn $$0, @Nullable awk<?> $$1, int $$2, int $$3, boolean $$4) {
            xd $$5 = (xd)($$1 == null ? fpx.w : xd.b($$1.a(fpx.this.H.a($$1))));
            $$0.b(fpx.this.p, $$5, $$2 - fpx.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fpx.b.a> {
         public int a(fpx.b.a $$0, fpx.b.a $$1) {
            cvg $$2 = $$0.b();
            cvg $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awm<dgv> $$6 = (awm<dgv>)b.this.o;
               $$4 = $$2 instanceof ctl ? fpx.this.H.a($$6, ((ctl)$$2).d()) : -1;
               $$5 = $$3 instanceof ctl ? fpx.this.H.a($$6, ((ctl)$$3).d()) : -1;
            } else {
               awm<cvg> $$9 = (awm<cvg>)b.this.o;
               $$4 = fpx.this.H.a($$9, $$2);
               $$5 = fpx.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cvg.a($$2), cvg.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fkw<fpx.c.a> {
      public c(final fib $$0) {
         super($$0, fpx.this.n, fpx.this.o - 33 - 58, 33, 9 * 4);

         for (btq<?> $$1 : lu.f) {
            if (fpx.this.H.a(awn.g.b($$1)) > 0 || fpx.this.H.a(awn.h.b($$1)) > 0) {
               this.b(new fpx.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fkw.a<fpx.c.a> {
         private final xd b;
         private final xd c;
         private final xd d;
         private final boolean e;
         private final boolean f;

         public a(final btq<?> $$0) {
            this.b = $$0.h();
            int $$1 = fpx.this.H.a(awn.g.b($$0));
            if ($$1 == 0) {
               this.c = xd.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xd.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fpx.this.H.a(awn.h.b($$0));
            if ($$2 == 0) {
               this.d = xd.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xd.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fpx.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fpx.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fpx.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", xc.a(this.c, this.d));
         }
      }
   }
}
