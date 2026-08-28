import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fql extends fqh {
   private static final xe b = xe.c("gui.stats");
   static final ale c = ale.b("container/slot");
   static final ale d = ale.b("statistics/header");
   static final ale s = ale.b("statistics/sort_up");
   static final ale u = ale.b("statistics/sort_down");
   private static final xe v = xe.c("multiplayer.downloadingStats");
   static final xe w = xe.c("stats.none");
   private static final xe x = xe.c("stat.generalButton");
   private static final xe y = xe.c("stat.itemsButton");
   private static final xe z = xe.c("stat.mobsButton");
   protected final fqh a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private foc D = new foc(this, 33, 58);
   @Nullable
   private fql.a E;
   @Nullable
   fql.b F;
   @Nullable
   private fql.c G;
   final awr H;
   @Nullable
   private flk<?> I;
   private boolean J = true;

   public fql(fqh $$0, awr $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aS_() {
      this.D.c(new fld(this.p, v));
      this.m.L().b(new ahc(ahc.a.b));
   }

   public void m() {
      this.E = new fql.a(this.m);
      this.F = new fql.b(this.m);
      this.G = new fql.c(this.m);
   }

   public void D() {
      foc $$0 = new foc(this, 33, 58);
      $$0.a(b, this.p);
      fog $$1 = $$0.b(fog.d()).a(5);
      $$1.c().b();
      fog $$2 = $$1.a(fog.e()).a(5);
      $$2.a(fko.a(x, $$0x -> this.a(this.E)).a(120).a());
      fko $$3 = $$2.a(fko.a(y, $$0x -> this.a(this.F)).a(120).a());
      fko $$4 = $$2.a(fko.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fko.a(xd.d, $$0x -> this.d()).a(200).a());
      if (this.F != null && this.F.aJ_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aJ_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fkm var10000 = this.c($$1x);
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

   public void a(@Nullable flk<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awn<ale> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends flk<fql.a.a> {
      public a(final fip $$0) {
         super($$0, fql.this.n, fql.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awn<ale>> $$1 = new ObjectArrayList(awq.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gyn.a(fql.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awn<ale> $$2 = (awn<ale>)var4.next();
            this.b(new fql.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends flk.a<fql.a.a> {
         private final awn<ale> b;
         private final xe c;

         a(final awn<ale> $$0) {
            this.b = $$0;
            this.c = xe.c(fql.a($$0));
         }

         private String b() {
            return this.b.a(fql.this.H.a(this.b));
         }

         @Override
         public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fql.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fql.this.p, $$12, $$3 + $$4 - fql.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", xe.i().b(this.c).b(xd.v).f(this.b()));
         }
      }
   }

   class b extends flk<fql.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ale[] z = new ale[]{
         ale.b("statistics/block_mined"),
         ale.b("statistics/item_broken"),
         ale.b("statistics/item_crafted"),
         ale.b("statistics/item_used"),
         ale.b("statistics/item_picked_up"),
         ale.b("statistics/item_dropped")
      };
      protected final List<awp<dhm>> a;
      protected final List<awp<cvn>> m;
      protected final Comparator<fql.b.a> n = new fql.b.b();
      @Nullable
      protected awp<?> o;
      protected int p = -1;
      protected int q;

      public b(final fip $$0) {
         super($$0, fql.this.n, fql.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awq.a);
         this.m = Lists.newArrayList(new awp[]{awq.d, awq.b, awq.c, awq.e, awq.f});
         this.a(true, 22);
         Set<cvn> $$1 = Sets.newIdentityHashSet();

         for (cvn $$2 : lv.g) {
            boolean $$3 = false;

            for (awp<cvn> $$4 : this.m) {
               if ($$4.a($$2) && fql.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dhm $$5 : lv.e) {
            boolean $$6 = false;

            for (awp<dhm> $$7 : this.a) {
               if ($$7.a($$5) && fql.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.q());
            }
         }

         $$1.remove(cvw.a);

         for (cvn $$8 : $$1) {
            this.b(new fql.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fkb $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ale $$4 = this.p == $$3 ? fql.c : fql.d;
            $$0.a(ghv::B, $$4, $$1 + this.a($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            ale $$6 = this.q == 1 ? fql.s : fql.u;
            $$0.a(ghv::B, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(ghv::B, this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(hav.a(awg.Ax, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awp<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awp<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fkb $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fql.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cvn $$5 = $$3.b();
               $$0.a(fql.this.p, $$5.r(), $$1, $$2);
            } else {
               xe $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fql.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awp<?> $$0) {
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

      class a extends flk.a<fql.b.a> {
         private final cvn b;

         a(final cvn $$0) {
            this.b = $$0;
         }

         public cvn b() {
            return this.b;
         }

         @Override
         public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(ghv::B, fql.c, $$3, $$2, 18, 18);
            $$0.b(this.b.v(), $$3 + 1, $$2 + 1);
            if (fql.this.F != null) {
               for (int $$10 = 0; $$10 < fql.this.F.a.size(); $$10++) {
                  awn<dhm> $$12;
                  if (this.b instanceof ctu $$11) {
                     $$12 = fql.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fql.this.F.m.size(); $$14++) {
                  this.a($$0, fql.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fql.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fkb $$0, @Nullable awn<?> $$1, int $$2, int $$3, boolean $$4) {
            xe $$5 = (xe)($$1 == null ? fql.w : xe.b($$1.a(fql.this.H.a($$1))));
            $$0.b(fql.this.p, $$5, $$2 - fql.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", this.b.r());
         }
      }

      class b implements Comparator<fql.b.a> {
         public int a(fql.b.a $$0, fql.b.a $$1) {
            cvn $$2 = $$0.b();
            cvn $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awp<dhm> $$6 = (awp<dhm>)b.this.o;
               $$4 = $$2 instanceof ctu ? fql.this.H.a($$6, ((ctu)$$2).d()) : -1;
               $$5 = $$3 instanceof ctu ? fql.this.H.a($$6, ((ctu)$$3).d()) : -1;
            } else {
               awp<cvn> $$9 = (awp<cvn>)b.this.o;
               $$4 = fql.this.H.a($$9, $$2);
               $$5 = fql.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cvn.a($$2), cvn.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends flk<fql.c.a> {
      public c(final fip $$0) {
         super($$0, fql.this.n, fql.this.o - 33 - 58, 33, 9 * 4);

         for (bty<?> $$1 : lv.f) {
            if (fql.this.H.a(awq.g.b($$1)) > 0 || fql.this.H.a(awq.h.b($$1)) > 0) {
               this.b(new fql.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends flk.a<fql.c.a> {
         private final xe b;
         private final xe c;
         private final xe d;
         private final boolean e;
         private final boolean f;

         public a(final bty<?> $$0) {
            this.b = $$0.h();
            int $$1 = fql.this.H.a(awq.g.b($$0));
            if ($$1 == 0) {
               this.c = xe.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xe.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fql.this.H.a(awq.h.b($$0));
            if ($$2 == 0) {
               this.d = xe.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xe.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fql.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fql.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fql.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", xd.a(this.c, this.d));
         }
      }
   }
}
