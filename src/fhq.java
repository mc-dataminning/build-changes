import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fhq extends fhh implements fhr {
   static final ajh c = new ajh("container/slot");
   static final ajh k = new ajh("statistics/header");
   static final ajh l = new ajh("statistics/sort_up");
   static final ajh m = new ajh("statistics/sort_down");
   private static final vu n = vu.c("multiplayer.downloadingStats");
   static final vu o = vu.c("stats.none");
   protected final fhh a;
   private fhq.a p;
   fhq.b q;
   private fhq.c r;
   final auj t;
   @Nullable
   private fce<?> u;
   private boolean v = true;
   private static final int w = 18;
   private static final int x = 20;
   private static final int y = 1;
   private static final int z = 1;
   private static final int A = 2;
   private static final int B = 2;
   private static final int C = 40;
   private static final int D = 5;
   private static final int E = 0;
   private static final int F = -1;
   private static final int G = 1;

   public fhq(fhh $$0, auj $$1) {
      super(vu.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aO_() {
      this.v = true;
      this.f.L().b(new afj(afj.a.b));
   }

   public void o() {
      this.p = new fhq.a(this.f);
      this.q = new fhq.b(this.f);
      this.r = new fhq.c(this.f);
   }

   public void E() {
      this.c((fbi)fbi.a(vu.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      fbi $$0 = this.c((fbi)fbi.a(vu.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      fbi $$1 = this.c((fbi)fbi.a(vu.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.c((fbi)fbi.a(vt.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.l().isEmpty()) {
         $$0.j = false;
      }

      if (this.r.l().isEmpty()) {
         $$1.j = false;
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      if (this.v) {
         this.b($$0, $$1, $$2, $$3);
         $$0.a(this.i, n, this.g / 2, this.h / 2, 16777215);
         $$0.a(this.i, b[(int)(ac.b() / 150L % (long)b.length)], this.g / 2, this.h / 2 + 9 * 2, 16777215);
      } else {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      }
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void H() {
      if (this.v) {
         this.o();
         this.E();
         this.a(this.p);
         this.v = false;
      }
   }

   @Override
   public boolean m() {
      return !this.v;
   }

   public void a(@Nullable fce<?> $$0) {
      if (this.u != null) {
         this.e(this.u);
      }

      if ($$0 != null) {
         this.c($$0);
         this.u = $$0;
      }
   }

   static String a(auf<ajh> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(fav $$0, int $$1, int $$2, cqh $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.am_(), $$1 + 2, $$2 + 2);
   }

   void a(fav $$0, int $$1, int $$2, ajh $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends fce<fhq.a.a> {
      public a(ezi $$0) {
         super($$0, fhq.this.g, fhq.this.h - 96, 32, 10);
         ObjectArrayList<auf<ajh>> $$1 = new ObjectArrayList(aui.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gkh.a(fhq.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            auf<ajh> $$2 = (auf<ajh>)var4.next();
            this.b(new fhq.a.a($$2));
         }
      }

      class a extends fce.a<fhq.a.a> {
         private final auf<ajh> b;
         private final vu c;

         a(auf<ajh> $$0) {
            this.b = $$0;
            this.c = vu.c(fhq.a($$0));
         }

         private String b() {
            return this.b.a(fhq.this.t.a(this.b));
         }

         @Override
         public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fhq.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fhq.this.i, $$10, $$3 + 2 + 213 - fhq.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public vu a() {
            return vu.a("narrator.select", vu.i().b(this.c).b(vt.v).f(this.b()));
         }
      }
   }

   class b extends fce<fhq.b.a> {
      protected final List<auh<dac>> a;
      protected final List<auh<cqh>> m;
      private final ajh[] t = new ajh[]{
         new ajh("statistics/block_mined"),
         new ajh("statistics/item_broken"),
         new ajh("statistics/item_crafted"),
         new ajh("statistics/item_used"),
         new ajh("statistics/item_picked_up"),
         new ajh("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fhq.b.a> o = new fhq.b.b();
      @Nullable
      protected auh<?> p;
      protected int q;

      public b(ezi $$0) {
         super($$0, fhq.this.g, fhq.this.h - 96, 32, 20);
         this.a = Lists.newArrayList();
         this.a.add(aui.a);
         this.m = Lists.newArrayList(new auh[]{aui.d, aui.b, aui.c, aui.e, aui.f});
         this.a(true, 20);
         Set<cqh> $$1 = Sets.newIdentityHashSet();

         for (cqh $$2 : ki.h) {
            boolean $$3 = false;

            for (auh<cqh> $$4 : this.m) {
               if ($$4.a($$2) && fhq.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dac $$5 : ki.e) {
            boolean $$6 = false;

            for (auh<dac> $$7 : this.a) {
               if ($$7.a($$5) && fhq.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.l());
            }
         }

         $$1.remove(cqp.a);

         for (cqh $$8 : $$1) {
            this.b(new fhq.b.a($$8));
         }
      }

      @Override
      protected void a(fav $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            ajh $$4 = this.n == $$3 ? fhq.c : fhq.k;
            fhq.this.a($$0, $$1 + fhq.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fhq.this.a(this.b(this.p)) - 36;
            ajh $$6 = this.q == 1 ? fhq.l : fhq.m;
            fhq.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fhq.this.a($$0, $$1 + fhq.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
         }
      }

      @Override
      public int b() {
         return 375;
      }

      @Override
      protected int c() {
         return this.g / 2 + 140;
      }

      @Override
      protected boolean a(int $$0, int $$1) {
         this.n = -1;

         for (int $$2 = 0; $$2 < this.t.length; $$2++) {
            int $$3 = $$0 - fhq.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ak().a(gmk.a(aty.zS, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private auh<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(auh<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fav $$0, int $$1, int $$2) {
         if ($$2 >= this.C() && $$2 <= this.E()) {
            fhq.b.a $$3 = this.t();
            int $$4 = (this.g - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cqh $$5 = $$3.b();
               $$0.a(fhq.this.i, this.a($$5), $$1, $$2);
            } else {
               vu $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fhq.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fhq.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected vu a(cqh $$0) {
         return $$0.q();
      }

      protected void a(auh<?> $$0) {
         if ($$0 != this.p) {
            this.p = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.p = null;
            this.q = 0;
         }

         this.l().sort(this.o);
      }

      class a extends fce.a<fhq.b.a> {
         private final cqh b;

         a(cqh $$0) {
            this.b = $$0;
         }

         public cqh b() {
            return this.b;
         }

         @Override
         public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fhq.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fhq.this.q.a.size(); $$10++) {
               auf<dac> $$11;
               if (this.b instanceof coh) {
                  $$11 = fhq.this.q.a.get($$10).b(((coh)this.b).d());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fhq.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fhq.this.q.m.size(); $$13++) {
               this.a($$0, fhq.this.q.m.get($$13).b(this.b), $$3 + fhq.this.a($$13 + fhq.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(fav $$0, @Nullable auf<?> $$1, int $$2, int $$3, boolean $$4) {
            vu $$5 = (vu)($$1 == null ? fhq.o : vu.b($$1.a(fhq.this.t.a($$1))));
            $$0.b(fhq.this.i, $$5, $$2 - fhq.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public vu a() {
            return vu.a("narrator.select", this.b.q());
         }
      }

      class b implements Comparator<fhq.b.a> {
         public int a(fhq.b.a $$0, fhq.b.a $$1) {
            cqh $$2 = $$0.b();
            cqh $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               auh<dac> $$6 = (auh<dac>)b.this.p;
               $$4 = $$2 instanceof coh ? fhq.this.t.a($$6, ((coh)$$2).d()) : -1;
               $$5 = $$3 instanceof coh ? fhq.this.t.a($$6, ((coh)$$3).d()) : -1;
            } else {
               auh<cqh> $$9 = (auh<cqh>)b.this.p;
               $$4 = fhq.this.t.a($$9, $$2);
               $$5 = fhq.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cqh.a($$2), cqh.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fce<fhq.c.a> {
      public c(ezi $$0) {
         super($$0, fhq.this.g, fhq.this.h - 96, 32, 9 * 4);

         for (bpd<?> $$1 : ki.g) {
            if (fhq.this.t.a(aui.g.b($$1)) > 0 || fhq.this.t.a(aui.h.b($$1)) > 0) {
               this.b(new fhq.c.a($$1));
            }
         }
      }

      class a extends fce.a<fhq.c.a> {
         private final vu b;
         private final vu c;
         private final boolean d;
         private final vu e;
         private final boolean f;

         public a(bpd<?> $$0) {
            this.b = $$0.h();
            int $$1 = fhq.this.t.a(aui.g.b($$0));
            if ($$1 == 0) {
               this.c = vu.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = vu.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fhq.this.t.a(aui.h.b($$0));
            if ($$2 == 0) {
               this.e = vu.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = vu.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fhq.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fhq.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fhq.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public vu a() {
            return vu.a("narrator.select", vt.a(this.c, this.e));
         }
      }
   }
}
