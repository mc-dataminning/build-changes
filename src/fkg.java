import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fkg extends fjx {
   private static final wi b = wi.c("gui.stats");
   static final ajv c = new ajv("container/slot");
   static final ajv d = new ajv("statistics/header");
   static final ajv o = new ajv("statistics/sort_up");
   static final ajv p = new ajv("statistics/sort_down");
   private static final wi q = wi.c("multiplayer.downloadingStats");
   static final wi r = wi.c("stats.none");
   private static final wi s = wi.c("stat.generalButton");
   private static final wi u = wi.c("stat.itemsButton");
   private static final wi v = wi.c("stat.mobsButton");
   protected final fjx a;
   private static final int w = 280;
   private static final int x = 5;
   private static final int y = 58;
   private fhl z = new fhl(this, 33, 58);
   @Nullable
   private fkg.a A;
   @Nullable
   fkg.b B;
   @Nullable
   private fkg.c C;
   final ava D;
   @Nullable
   private feu<?> E;
   private boolean F = true;

   public fkg(fjx $$0, ava $$1) {
      super(b);
      this.a = $$0;
      this.D = $$1;
   }

   @Override
   protected void aM_() {
      this.z.c(new fen(this.m, q));
      this.j.L().b(new afx(afx.a.b));
   }

   public void m() {
      this.A = new fkg.a(this.j);
      this.B = new fkg.b(this.j);
      this.C = new fkg.c(this.j);
   }

   public void C() {
      fhl $$0 = new fhl(this, 33, 58);
      $$0.a(b, this.m);
      fhp $$1 = $$0.b(fhp.d()).a(5);
      $$1.c().b();
      fhp $$2 = $$1.a(fhp.e()).a(5);
      $$2.a(fdy.a(s, $$0x -> this.a(this.A)).a(120).a());
      fdy $$3 = $$2.a(fdy.a(u, $$0x -> this.a(this.B)).a(120).a());
      fdy $$4 = $$2.a(fdy.a(v, $$0x -> this.a(this.C)).a(120).a());
      $$1.a(fdy.a(wh.d, $$0x -> this.d()).a(200).a());
      if (this.B != null && this.B.aE_().isEmpty()) {
         $$3.j = false;
      }

      if (this.C != null && this.C.aE_().isEmpty()) {
         $$4.j = false;
      }

      this.z = $$0;
      this.z.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      if (this.E != null) {
         this.E.a(this.k, this.z);
      }
   }

   @Override
   public void d() {
      this.j.a(this.a);
   }

   public void D() {
      if (this.F) {
         this.m();
         this.C();
         this.a(this.A);
         this.F = false;
      }
   }

   @Override
   public boolean k() {
      return !this.F;
   }

   public void a(@Nullable feu<?> $$0) {
      if (this.E != null) {
         this.e(this.E);
      }

      if ($$0 != null) {
         this.c($$0);
         this.E = $$0;
         this.c();
      }
   }

   static String a(auv<ajv> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends feu<fkg.a.a> {
      public a(fby $$0) {
         super($$0, fkg.this.k, fkg.this.l - 33 - 58, 33, 11);
         ObjectArrayList<auv<ajv>> $$1 = new ObjectArrayList(auz.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gmx.a(fkg.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            auv<ajv> $$2 = (auv<ajv>)var4.next();
            this.b(new fkg.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends feu.a<fkg.a.a> {
         private final auv<ajv> b;
         private final wi c;

         a(auv<ajv> $$0) {
            this.b = $$0;
            this.c = wi.c(fkg.a($$0));
         }

         private String b() {
            return this.b.a(fkg.this.D.a(this.b));
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fkg.this.m, this.c, $$3 + 2, $$2, $$1 % 2 == 0 ? -1 : -8355712);
            String $$10 = this.b();
            $$0.b(fkg.this.m, $$10, $$3 + $$4 - fkg.this.m.b($$10) - 3, $$2, $$1 % 2 == 0 ? -1 : -8355712);
         }

         @Override
         public wi a() {
            return wi.a("narrator.select", wi.i().b(this.c).b(wh.v).f(this.b()));
         }
      }
   }

   class b extends feu<fkg.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ajv[] z = new ajv[]{
         new ajv("statistics/block_mined"),
         new ajv("statistics/item_broken"),
         new ajv("statistics/item_crafted"),
         new ajv("statistics/item_used"),
         new ajv("statistics/item_picked_up"),
         new ajv("statistics/item_dropped")
      };
      protected final List<auy<dch>> a;
      protected final List<auy<crn>> m;
      protected final Comparator<fkg.b.a> n = new fkg.b.b();
      @Nullable
      protected auy<?> o;
      protected int p = -1;
      protected int q;

      public b(fby $$0) {
         super($$0, fkg.this.k, fkg.this.l - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(auz.a);
         this.m = Lists.newArrayList(new auy[]{auz.d, auz.b, auz.c, auz.e, auz.f});
         this.a(true, 22);
         Set<crn> $$1 = Sets.newIdentityHashSet();

         for (crn $$2 : kt.h) {
            boolean $$3 = false;

            for (auy<crn> $$4 : this.m) {
               if ($$4.a($$2) && fkg.this.D.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dch $$5 : kt.e) {
            boolean $$6 = false;

            for (auy<dch> $$7 : this.a) {
               if ($$7.a($$5) && fkg.this.D.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.p());
            }
         }

         $$1.remove(crv.a);

         for (crn $$8 : $$1) {
            this.b(new fkg.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fdl $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ajv $$4 = this.p == $$3 ? fkg.c : fkg.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            ajv $$6 = this.q == 1 ? fkg.o : fkg.p;
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
            this.c.ak().a(gpa.a(auo.zV, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private auy<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(auy<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fdl $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fkg.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               crn $$5 = $$3.b();
               $$0.a(fkg.this.m, $$5.t(), $$1, $$2);
            } else {
               wi $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fkg.this.m, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(auy<?> $$0) {
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

      class a extends feu.a<fkg.b.a> {
         private final crn b;

         a(crn $$0) {
            this.b = $$0;
         }

         public crn b() {
            return this.b;
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fkg.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.x(), $$3 + 1, $$2 + 1);
            if (fkg.this.B != null) {
               for (int $$10 = 0; $$10 < fkg.this.B.a.size(); $$10++) {
                  auv<dch> $$12;
                  if (this.b instanceof cpq $$11) {
                     $$12 = fkg.this.B.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fkg.this.B.m.size(); $$14++) {
                  this.a($$0, fkg.this.B.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fkg.this.B.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fdl $$0, @Nullable auv<?> $$1, int $$2, int $$3, boolean $$4) {
            wi $$5 = (wi)($$1 == null ? fkg.r : wi.b($$1.a(fkg.this.D.a($$1))));
            $$0.b(fkg.this.m, $$5, $$2 - fkg.this.m.a($$5), $$3, $$4 ? -1 : -8355712);
         }

         @Override
         public wi a() {
            return wi.a("narrator.select", this.b.t());
         }
      }

      class b implements Comparator<fkg.b.a> {
         public int a(fkg.b.a $$0, fkg.b.a $$1) {
            crn $$2 = $$0.b();
            crn $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               auy<dch> $$6 = (auy<dch>)b.this.o;
               $$4 = $$2 instanceof cpq ? fkg.this.D.a($$6, ((cpq)$$2).d()) : -1;
               $$5 = $$3 instanceof cpq ? fkg.this.D.a($$6, ((cpq)$$3).d()) : -1;
            } else {
               auy<crn> $$9 = (auy<crn>)b.this.o;
               $$4 = fkg.this.D.a($$9, $$2);
               $$5 = fkg.this.D.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(crn.a($$2), crn.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends feu<fkg.c.a> {
      public c(fby $$0) {
         super($$0, fkg.this.k, fkg.this.l - 33 - 58, 33, 9 * 4);

         for (bqg<?> $$1 : kt.g) {
            if (fkg.this.D.a(auz.g.b($$1)) > 0 || fkg.this.D.a(auz.h.b($$1)) > 0) {
               this.b(new fkg.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends feu.a<fkg.c.a> {
         private final wi b;
         private final wi c;
         private final wi d;
         private final boolean e;
         private final boolean f;

         public a(bqg<?> $$0) {
            this.b = $$0.h();
            int $$1 = fkg.this.D.a(auz.g.b($$0));
            if ($$1 == 0) {
               this.c = wi.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wi.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fkg.this.D.a(auz.h.b($$0));
            if ($$2 == 0) {
               this.d = wi.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wi.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fkg.this.m, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fkg.this.m, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -6250336 : -8355712);
            $$0.b(fkg.this.m, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -6250336 : -8355712);
         }

         @Override
         public wi a() {
            return wi.a("narrator.select", wh.a(this.c, this.d));
         }
      }
   }
}
