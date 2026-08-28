import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fqw extends fqs {
   private static final xh b = xh.c("gui.stats");
   static final alh c = alh.b("container/slot");
   static final alh d = alh.b("statistics/header");
   static final alh s = alh.b("statistics/sort_up");
   static final alh u = alh.b("statistics/sort_down");
   private static final xh v = xh.c("multiplayer.downloadingStats");
   static final xh w = xh.c("stats.none");
   private static final xh x = xh.c("stat.generalButton");
   private static final xh y = xh.c("stat.itemsButton");
   private static final xh z = xh.c("stat.mobsButton");
   protected final fqs a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fon D = new fon(this, 33, 58);
   @Nullable
   private fqw.a E;
   @Nullable
   fqw.b F;
   @Nullable
   private fqw.c G;
   final awv H;
   @Nullable
   private flv<?> I;
   private boolean J = true;

   public fqw(fqs $$0, awv $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aS_() {
      this.D.c(new flo(this.p, v));
      this.m.L().b(new ahf(ahf.a.b));
   }

   public void m() {
      this.E = new fqw.a(this.m);
      this.F = new fqw.b(this.m);
      this.G = new fqw.c(this.m);
   }

   public void D() {
      fon $$0 = new fon(this, 33, 58);
      $$0.a(b, this.p);
      fos $$1 = $$0.b(fos.d()).a(5);
      $$1.c().b();
      fos $$2 = $$1.a(fos.e()).a(5);
      $$2.a(fkz.a(x, $$0x -> this.a(this.E)).a(120).a());
      fkz $$3 = $$2.a(fkz.a(y, $$0x -> this.a(this.F)).a(120).a());
      fkz $$4 = $$2.a(fkz.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fkz.a(xg.d, $$0x -> this.d()).a(200).a());
      if (this.F != null && this.F.aJ_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aJ_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fkx var10000 = this.c($$1x);
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
         this.aH_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable flv<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awr<alh> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends flv<fqw.a.a> {
      public a(final fja $$0) {
         super($$0, fqw.this.n, fqw.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awr<alh>> $$1 = new ObjectArrayList(awu.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gyz.a(fqw.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awr<alh> $$2 = (awr<alh>)var4.next();
            this.b(new fqw.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends flv.a<fqw.a.a> {
         private final awr<alh> b;
         private final xh c;

         a(final awr<alh> $$0) {
            this.b = $$0;
            this.c = xh.c(fqw.a($$0));
         }

         private String b() {
            return this.b.a(fqw.this.H.a(this.b));
         }

         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fqw.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fqw.this.p, $$12, $$3 + $$4 - fqw.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xh a() {
            return xh.a("narrator.select", xh.i().b(this.c).b(xg.v).f(this.b()));
         }
      }
   }

   class b extends flv<fqw.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alh[] z = new alh[]{
         alh.b("statistics/block_mined"),
         alh.b("statistics/item_broken"),
         alh.b("statistics/item_crafted"),
         alh.b("statistics/item_used"),
         alh.b("statistics/item_picked_up"),
         alh.b("statistics/item_dropped")
      };
      protected final List<awt<dhy>> a;
      protected final List<awt<cvt>> m;
      protected final Comparator<fqw.b.a> n = new fqw.b.b();
      @Nullable
      protected awt<?> o;
      protected int p = -1;
      protected int q;

      public b(final fja $$0) {
         super($$0, fqw.this.n, fqw.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awu.a);
         this.m = Lists.newArrayList(new awt[]{awu.d, awu.b, awu.c, awu.e, awu.f});
         this.a(true, 22);
         Set<cvt> $$1 = Sets.newIdentityHashSet();

         for (cvt $$2 : lx.g) {
            boolean $$3 = false;

            for (awt<cvt> $$4 : this.m) {
               if ($$4.a($$2) && fqw.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dhy $$5 : lx.e) {
            boolean $$6 = false;

            for (awt<dhy> $$7 : this.a) {
               if ($$7.a($$5) && fqw.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cwb.a);

         for (cvt $$8 : $$1) {
            this.b(new fqw.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fkm $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alh $$4 = this.p == $$3 ? fqw.c : fqw.d;
            $$0.a(gig::B, $$4, $$1 + this.a($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            alh $$6 = this.q == 1 ? fqw.s : fqw.u;
            $$0.a(gig::B, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gig::B, this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hbk.a(awk.Av, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awt<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awt<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fkm $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fqw.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cvt $$5 = $$3.b();
               $$0.a(fqw.this.p, $$5.n(), $$1, $$2);
            } else {
               xh $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fqw.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awt<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aJ_().sort(this.n);
      }

      class a extends flv.a<fqw.b.a> {
         private final cvt b;

         a(final cvt $$0) {
            this.b = $$0;
         }

         public cvt b() {
            return this.b;
         }

         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gig::B, fqw.c, $$3, $$2, 18, 18);
            $$0.b(this.b.o(), $$3 + 1, $$2 + 1);
            if (fqw.this.F != null) {
               for (int $$10 = 0; $$10 < fqw.this.F.a.size(); $$10++) {
                  awr<dhy> $$12;
                  if (this.b instanceof cuc $$11) {
                     $$12 = fqw.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fqw.this.F.m.size(); $$14++) {
                  this.a($$0, fqw.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fqw.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fkm $$0, @Nullable awr<?> $$1, int $$2, int $$3, boolean $$4) {
            xh $$5 = (xh)($$1 == null ? fqw.w : xh.b($$1.a(fqw.this.H.a($$1))));
            $$0.b(fqw.this.p, $$5, $$2 - fqw.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xh a() {
            return xh.a("narrator.select", this.b.n());
         }
      }

      class b implements Comparator<fqw.b.a> {
         public int a(fqw.b.a $$0, fqw.b.a $$1) {
            cvt $$2 = $$0.b();
            cvt $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awt<dhy> $$6 = (awt<dhy>)b.this.o;
               $$4 = $$2 instanceof cuc ? fqw.this.H.a($$6, ((cuc)$$2).d()) : -1;
               $$5 = $$3 instanceof cuc ? fqw.this.H.a($$6, ((cuc)$$3).d()) : -1;
            } else {
               awt<cvt> $$9 = (awt<cvt>)b.this.o;
               $$4 = fqw.this.H.a($$9, $$2);
               $$5 = fqw.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cvt.a($$2), cvt.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends flv<fqw.c.a> {
      public c(final fja $$0) {
         super($$0, fqw.this.n, fqw.this.o - 33 - 58, 33, 9 * 4);

         for (bug<?> $$1 : lx.f) {
            if (fqw.this.H.a(awu.g.b($$1)) > 0 || fqw.this.H.a(awu.h.b($$1)) > 0) {
               this.b(new fqw.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends flv.a<fqw.c.a> {
         private final xh b;
         private final xh c;
         private final xh d;
         private final boolean e;
         private final boolean f;

         public a(final bug<?> $$0) {
            this.b = $$0.h();
            int $$1 = fqw.this.H.a(awu.g.b($$0));
            if ($$1 == 0) {
               this.c = xh.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xh.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fqw.this.H.a(awu.h.b($$0));
            if ($$2 == 0) {
               this.d = xh.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xh.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fqw.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fqw.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fqw.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xh a() {
            return xh.a("narrator.select", xg.a(this.c, this.d));
         }
      }
   }
}
