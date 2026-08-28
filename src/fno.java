import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fno extends fnf {
   private static final xp b = xp.c("gui.stats");
   static final alf c = new alf("container/slot");
   static final alf d = new alf("statistics/header");
   static final alf r = new alf("statistics/sort_up");
   static final alf s = new alf("statistics/sort_down");
   private static final xp u = xp.c("multiplayer.downloadingStats");
   static final xp v = xp.c("stats.none");
   private static final xp w = xp.c("stat.generalButton");
   private static final xp x = xp.c("stat.itemsButton");
   private static final xp y = xp.c("stat.mobsButton");
   protected final fnf a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fkt C = new fkt(this, 33, 58);
   @Nullable
   private fno.a D;
   @Nullable
   fno.b E;
   @Nullable
   private fno.c F;
   final awl G;
   @Nullable
   private fic<?> H;
   private boolean I = true;

   public fno(fnf $$0, awl $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aM_() {
      this.C.c(new fhv(this.p, u));
      this.m.L().b(new ahh(ahh.a.b));
   }

   public void m() {
      this.D = new fno.a(this.m);
      this.E = new fno.b(this.m);
      this.F = new fno.c(this.m);
   }

   public void E() {
      fkt $$0 = new fkt(this, 33, 58);
      $$0.a(b, this.p);
      fkx $$1 = $$0.b(fkx.d()).a(5);
      $$1.c().b();
      fkx $$2 = $$1.a(fkx.e()).a(5);
      $$2.a(fhg.a(w, $$0x -> this.a(this.D)).a(120).a());
      fhg $$3 = $$2.a(fhg.a(x, $$0x -> this.a(this.E)).a(120).a());
      fhg $$4 = $$2.a(fhg.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fhg.a(xo.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aD_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aD_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fhe var10000 = this.c($$1x);
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

   public void a(@Nullable fic<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(awh<alf> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fic<fno.a.a> {
      public a(final ffh $$0) {
         super($$0, fno.this.n, fno.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awh<alf>> $$1 = new ObjectArrayList(awk.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gqh.a(fno.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awh<alf> $$2 = (awh<alf>)var4.next();
            this.b(new fno.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fic.a<fno.a.a> {
         private final awh<alf> b;
         private final xp c;

         a(final awh<alf> $$0) {
            this.b = $$0;
            this.c = xp.c(fno.a($$0));
         }

         private String b() {
            return this.b.a(fno.this.G.a(this.b));
         }

         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fno.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fno.this.p, $$12, $$3 + $$4 - fno.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", xp.i().b(this.c).b(xo.v).f(this.b()));
         }
      }
   }

   class b extends fic<fno.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alf[] z = new alf[]{
         new alf("statistics/block_mined"),
         new alf("statistics/item_broken"),
         new alf("statistics/item_crafted"),
         new alf("statistics/item_used"),
         new alf("statistics/item_picked_up"),
         new alf("statistics/item_dropped")
      };
      protected final List<awj<dfb>> a;
      protected final List<awj<cum>> m;
      protected final Comparator<fno.b.a> n = new fno.b.b();
      @Nullable
      protected awj<?> o;
      protected int p = -1;
      protected int q;

      public b(final ffh $$0) {
         super($$0, fno.this.n, fno.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awk.a);
         this.m = Lists.newArrayList(new awj[]{awk.d, awk.b, awk.c, awk.e, awk.f});
         this.a(true, 22);
         Set<cum> $$1 = Sets.newIdentityHashSet();

         for (cum $$2 : lp.h) {
            boolean $$3 = false;

            for (awj<cum> $$4 : this.m) {
               if ($$4.a($$2) && fno.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dfb $$5 : lp.e) {
            boolean $$6 = false;

            for (awj<dfb> $$7 : this.a) {
               if ($$7.a($$5) && fno.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cuu.a);

         for (cum $$8 : $$1) {
            this.b(new fno.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fgt $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alf $$4 = this.p == $$3 ? fno.c : fno.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            alf $$6 = this.q == 1 ? fno.r : fno.s;
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
            this.c.aj().a(gsk.a(awa.Ao, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awj<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awj<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fgt $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fno.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cum $$5 = $$3.b();
               $$0.a(fno.this.p, $$5.s(), $$1, $$2);
            } else {
               xp $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fno.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awj<?> $$0) {
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

      class a extends fic.a<fno.b.a> {
         private final cum b;

         a(final cum $$0) {
            this.b = $$0;
         }

         public cum b() {
            return this.b;
         }

         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fno.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fno.this.E != null) {
               for (int $$10 = 0; $$10 < fno.this.E.a.size(); $$10++) {
                  awh<dfb> $$12;
                  if (this.b instanceof csp $$11) {
                     $$12 = fno.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fno.this.E.m.size(); $$14++) {
                  this.a($$0, fno.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fno.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fgt $$0, @Nullable awh<?> $$1, int $$2, int $$3, boolean $$4) {
            xp $$5 = (xp)($$1 == null ? fno.v : xp.b($$1.a(fno.this.G.a($$1))));
            $$0.b(fno.this.p, $$5, $$2 - fno.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fno.b.a> {
         public int a(fno.b.a $$0, fno.b.a $$1) {
            cum $$2 = $$0.b();
            cum $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awj<dfb> $$6 = (awj<dfb>)b.this.o;
               $$4 = $$2 instanceof csp ? fno.this.G.a($$6, ((csp)$$2).d()) : -1;
               $$5 = $$3 instanceof csp ? fno.this.G.a($$6, ((csp)$$3).d()) : -1;
            } else {
               awj<cum> $$9 = (awj<cum>)b.this.o;
               $$4 = fno.this.G.a($$9, $$2);
               $$5 = fno.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cum.a($$2), cum.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fic<fno.c.a> {
      public c(final ffh $$0) {
         super($$0, fno.this.n, fno.this.o - 33 - 58, 33, 9 * 4);

         for (btc<?> $$1 : lp.g) {
            if (fno.this.G.a(awk.g.b($$1)) > 0 || fno.this.G.a(awk.h.b($$1)) > 0) {
               this.b(new fno.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fic.a<fno.c.a> {
         private final xp b;
         private final xp c;
         private final xp d;
         private final boolean e;
         private final boolean f;

         public a(final btc<?> $$0) {
            this.b = $$0.h();
            int $$1 = fno.this.G.a(awk.g.b($$0));
            if ($$1 == 0) {
               this.c = xp.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xp.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fno.this.G.a(awk.h.b($$0));
            if ($$2 == 0) {
               this.d = xp.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xp.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fno.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fno.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fno.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", xo.a(this.c, this.d));
         }
      }
   }
}
