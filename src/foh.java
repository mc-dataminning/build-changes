import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class foh extends fod {
   private static final wz b = wz.c("gui.stats");
   static final akr c = akr.b("container/slot");
   static final akr r = akr.b("statistics/header");
   static final akr s = akr.b("statistics/sort_up");
   static final akr u = akr.b("statistics/sort_down");
   private static final wz v = wz.c("multiplayer.downloadingStats");
   static final wz w = wz.c("stats.none");
   private static final wz x = wz.c("stat.generalButton");
   private static final wz y = wz.c("stat.itemsButton");
   private static final wz z = wz.c("stat.mobsButton");
   protected final fod a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private flz D = new flz(this, 33, 58);
   @Nullable
   private foh.a E;
   @Nullable
   foh.b F;
   @Nullable
   private foh.c G;
   final awa H;
   @Nullable
   private fji<?> I;
   private boolean J = true;

   public foh(fod $$0, awa $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aT_() {
      this.D.c(new fjb(this.o, v));
      this.l.L().b(new agt(agt.a.b));
   }

   public void m() {
      this.E = new foh.a(this.l);
      this.F = new foh.b(this.l);
      this.G = new foh.c(this.l);
   }

   public void C() {
      flz $$0 = new flz(this, 33, 58);
      $$0.a(b, this.o);
      fmd $$1 = $$0.b(fmd.d()).a(5);
      $$1.c().b();
      fmd $$2 = $$1.a(fmd.e()).a(5);
      $$2.a(fim.a(x, $$0x -> this.a(this.E)).a(120).a());
      fim $$3 = $$2.a(fim.a(y, $$0x -> this.a(this.F)).a(120).a());
      fim $$4 = $$2.a(fim.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fim.a(wy.d, $$0x -> this.d()).a(200).a());
      if (this.F != null && this.F.aK_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aK_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fik var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      if (this.I != null) {
         this.I.a(this.m, this.D);
      }
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   public void D() {
      if (this.J) {
         this.m();
         this.a(this.E);
         this.C();
         this.aI_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable fji<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(avw<akr> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fji<foh.a.a> {
      public a(final fgo $$0) {
         super($$0, foh.this.m, foh.this.n - 33 - 58, 33, 14);
         ObjectArrayList<avw<akr>> $$1 = new ObjectArrayList(avz.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> grr.a(foh.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avw<akr> $$2 = (avw<akr>)var4.next();
            this.b(new foh.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fji.a<foh.a.a> {
         private final avw<akr> b;
         private final wz c;

         a(final avw<akr> $$0) {
            this.b = $$0;
            this.c = wz.c(foh.a($$0));
         }

         private String b() {
            return this.b.a(foh.this.H.a(this.b));
         }

         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(foh.this.o, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(foh.this.o, $$12, $$3 + $$4 - foh.this.o.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wz a() {
            return wz.a("narrator.select", wz.i().b(this.c).b(wy.v).f(this.b()));
         }
      }
   }

   class b extends fji<foh.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akr[] z = new akr[]{
         akr.b("statistics/block_mined"),
         akr.b("statistics/item_broken"),
         akr.b("statistics/item_crafted"),
         akr.b("statistics/item_used"),
         akr.b("statistics/item_picked_up"),
         akr.b("statistics/item_dropped")
      };
      protected final List<avy<dfy>> a;
      protected final List<avy<cul>> m;
      protected final Comparator<foh.b.a> n = new foh.b.b();
      @Nullable
      protected avy<?> o;
      protected int p = -1;
      protected int q;

      public b(final fgo $$0) {
         super($$0, foh.this.m, foh.this.n - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avz.a);
         this.m = Lists.newArrayList(new avy[]{avz.d, avz.b, avz.c, avz.e, avz.f});
         this.a(true, 22);
         Set<cul> $$1 = Sets.newIdentityHashSet();

         for (cul $$2 : lt.g) {
            boolean $$3 = false;

            for (avy<cul> $$4 : this.m) {
               if ($$4.a($$2) && foh.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dfy $$5 : lt.e) {
            boolean $$6 = false;

            for (avy<dfy> $$7 : this.a) {
               if ($$7.a($$5) && foh.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cut.a);

         for (cul $$8 : $$1) {
            this.b(new foh.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fhz $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akr $$4 = this.p == $$3 ? foh.c : foh.r;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akr $$6 = this.q == 1 ? foh.s : foh.u;
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
            this.c.aj().a(gtv.a(avp.Ar, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avy<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avy<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fhz $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            foh.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cul $$5 = $$3.b();
               $$0.a(foh.this.o, $$5.s(), $$1, $$2);
            } else {
               wz $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(foh.this.o, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avy<?> $$0) {
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

      class a extends fji.a<foh.b.a> {
         private final cul b;

         a(final cul $$0) {
            this.b = $$0;
         }

         public cul b() {
            return this.b;
         }

         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(foh.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (foh.this.F != null) {
               for (int $$10 = 0; $$10 < foh.this.F.a.size(); $$10++) {
                  avw<dfy> $$12;
                  if (this.b instanceof cso $$11) {
                     $$12 = foh.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < foh.this.F.m.size(); $$14++) {
                  this.a($$0, foh.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + foh.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fhz $$0, @Nullable avw<?> $$1, int $$2, int $$3, boolean $$4) {
            wz $$5 = (wz)($$1 == null ? foh.w : wz.b($$1.a(foh.this.H.a($$1))));
            $$0.b(foh.this.o, $$5, $$2 - foh.this.o.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wz a() {
            return wz.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<foh.b.a> {
         public int a(foh.b.a $$0, foh.b.a $$1) {
            cul $$2 = $$0.b();
            cul $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avy<dfy> $$6 = (avy<dfy>)b.this.o;
               $$4 = $$2 instanceof cso ? foh.this.H.a($$6, ((cso)$$2).d()) : -1;
               $$5 = $$3 instanceof cso ? foh.this.H.a($$6, ((cso)$$3).d()) : -1;
            } else {
               avy<cul> $$9 = (avy<cul>)b.this.o;
               $$4 = foh.this.H.a($$9, $$2);
               $$5 = foh.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cul.a($$2), cul.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fji<foh.c.a> {
      public c(final fgo $$0) {
         super($$0, foh.this.m, foh.this.n - 33 - 58, 33, 9 * 4);

         for (bsx<?> $$1 : lt.f) {
            if (foh.this.H.a(avz.g.b($$1)) > 0 || foh.this.H.a(avz.h.b($$1)) > 0) {
               this.b(new foh.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fji.a<foh.c.a> {
         private final wz b;
         private final wz c;
         private final wz d;
         private final boolean e;
         private final boolean f;

         public a(final bsx<?> $$0) {
            this.b = $$0.h();
            int $$1 = foh.this.H.a(avz.g.b($$0));
            if ($$1 == 0) {
               this.c = wz.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wz.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = foh.this.H.a(avz.h.b($$0));
            if ($$2 == 0) {
               this.d = wz.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wz.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(foh.this.o, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(foh.this.o, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(foh.this.o, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wz a() {
            return wz.a("narrator.select", wy.a(this.c, this.d));
         }
      }
   }
}
