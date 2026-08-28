import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fnh extends fmy {
   private static final xl b = xl.c("gui.stats");
   static final alb c = new alb("container/slot");
   static final alb d = new alb("statistics/header");
   static final alb r = new alb("statistics/sort_up");
   static final alb s = new alb("statistics/sort_down");
   private static final xl u = xl.c("multiplayer.downloadingStats");
   static final xl v = xl.c("stats.none");
   private static final xl w = xl.c("stat.generalButton");
   private static final xl x = xl.c("stat.itemsButton");
   private static final xl y = xl.c("stat.mobsButton");
   protected final fmy a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fkm C = new fkm(this, 33, 58);
   @Nullable
   private fnh.a D;
   @Nullable
   fnh.b E;
   @Nullable
   private fnh.c F;
   final awh G;
   @Nullable
   private fhv<?> H;
   private boolean I = true;

   public fnh(fmy $$0, awh $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aN_() {
      this.C.c(new fho(this.p, u));
      this.m.L().b(new ahd(ahd.a.b));
   }

   public void m() {
      this.D = new fnh.a(this.m);
      this.E = new fnh.b(this.m);
      this.F = new fnh.c(this.m);
   }

   public void C() {
      fkm $$0 = new fkm(this, 33, 58);
      $$0.a(b, this.p);
      fkq $$1 = $$0.b(fkq.d()).a(5);
      $$1.c().b();
      fkq $$2 = $$1.a(fkq.e()).a(5);
      $$2.a(fgz.a(w, $$0x -> this.a(this.D)).a(120).a());
      fgz $$3 = $$2.a(fgz.a(x, $$0x -> this.a(this.E)).a(120).a());
      fgz $$4 = $$2.a(fgz.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fgz.a(xk.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aF_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aF_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fgx var10000 = this.c($$1x);
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

   public void a(@Nullable fhv<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(awd<alb> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fhv<fnh.a.a> {
      public a(final ffa $$0) {
         super($$0, fnh.this.n, fnh.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awd<alb>> $$1 = new ObjectArrayList(awg.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gqa.a(fnh.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awd<alb> $$2 = (awd<alb>)var4.next();
            this.b(new fnh.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fhv.a<fnh.a.a> {
         private final awd<alb> b;
         private final xl c;

         a(final awd<alb> $$0) {
            this.b = $$0;
            this.c = xl.c(fnh.a($$0));
         }

         private String b() {
            return this.b.a(fnh.this.G.a(this.b));
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fnh.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fnh.this.p, $$12, $$3 + $$4 - fnh.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", xl.i().b(this.c).b(xk.v).f(this.b()));
         }
      }
   }

   class b extends fhv<fnh.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alb[] z = new alb[]{
         new alb("statistics/block_mined"),
         new alb("statistics/item_broken"),
         new alb("statistics/item_crafted"),
         new alb("statistics/item_used"),
         new alb("statistics/item_picked_up"),
         new alb("statistics/item_dropped")
      };
      protected final List<awf<deu>> a;
      protected final List<awf<cuf>> m;
      protected final Comparator<fnh.b.a> n = new fnh.b.b();
      @Nullable
      protected awf<?> o;
      protected int p = -1;
      protected int q;

      public b(final ffa $$0) {
         super($$0, fnh.this.n, fnh.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awg.a);
         this.m = Lists.newArrayList(new awf[]{awg.d, awg.b, awg.c, awg.e, awg.f});
         this.a(true, 22);
         Set<cuf> $$1 = Sets.newIdentityHashSet();

         for (cuf $$2 : lp.h) {
            boolean $$3 = false;

            for (awf<cuf> $$4 : this.m) {
               if ($$4.a($$2) && fnh.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (deu $$5 : lp.e) {
            boolean $$6 = false;

            for (awf<deu> $$7 : this.a) {
               if ($$7.a($$5) && fnh.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cun.a);

         for (cuf $$8 : $$1) {
            this.b(new fnh.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fgm $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alb $$4 = this.p == $$3 ? fnh.c : fnh.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            alb $$6 = this.q == 1 ? fnh.r : fnh.s;
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
            this.c.aj().a(gsd.a(avw.Ao, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awf<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awf<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fgm $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fnh.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cuf $$5 = $$3.b();
               $$0.a(fnh.this.p, $$5.s(), $$1, $$2);
            } else {
               xl $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fnh.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awf<?> $$0) {
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

      class a extends fhv.a<fnh.b.a> {
         private final cuf b;

         a(final cuf $$0) {
            this.b = $$0;
         }

         public cuf b() {
            return this.b;
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fnh.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fnh.this.E != null) {
               for (int $$10 = 0; $$10 < fnh.this.E.a.size(); $$10++) {
                  awd<deu> $$12;
                  if (this.b instanceof csi $$11) {
                     $$12 = fnh.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fnh.this.E.m.size(); $$14++) {
                  this.a($$0, fnh.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fnh.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fgm $$0, @Nullable awd<?> $$1, int $$2, int $$3, boolean $$4) {
            xl $$5 = (xl)($$1 == null ? fnh.v : xl.b($$1.a(fnh.this.G.a($$1))));
            $$0.b(fnh.this.p, $$5, $$2 - fnh.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fnh.b.a> {
         public int a(fnh.b.a $$0, fnh.b.a $$1) {
            cuf $$2 = $$0.b();
            cuf $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awf<deu> $$6 = (awf<deu>)b.this.o;
               $$4 = $$2 instanceof csi ? fnh.this.G.a($$6, ((csi)$$2).d()) : -1;
               $$5 = $$3 instanceof csi ? fnh.this.G.a($$6, ((csi)$$3).d()) : -1;
            } else {
               awf<cuf> $$9 = (awf<cuf>)b.this.o;
               $$4 = fnh.this.G.a($$9, $$2);
               $$5 = fnh.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cuf.a($$2), cuf.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fhv<fnh.c.a> {
      public c(final ffa $$0) {
         super($$0, fnh.this.n, fnh.this.o - 33 - 58, 33, 9 * 4);

         for (bsv<?> $$1 : lp.g) {
            if (fnh.this.G.a(awg.g.b($$1)) > 0 || fnh.this.G.a(awg.h.b($$1)) > 0) {
               this.b(new fnh.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fhv.a<fnh.c.a> {
         private final xl b;
         private final xl c;
         private final xl d;
         private final boolean e;
         private final boolean f;

         public a(final bsv<?> $$0) {
            this.b = $$0.h();
            int $$1 = fnh.this.G.a(awg.g.b($$0));
            if ($$1 == 0) {
               this.c = xl.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xl.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fnh.this.G.a(awg.h.b($$0));
            if ($$2 == 0) {
               this.d = xl.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xl.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fnh.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fnh.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fnh.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", xk.a(this.c, this.d));
         }
      }
   }
}
