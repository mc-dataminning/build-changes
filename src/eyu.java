import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eyu extends eym implements eyv {
   static final aey c = new aey("container/slot");
   static final aey k = new aey("statistics/header");
   static final aey l = new aey("statistics/sort_up");
   static final aey m = new aey("statistics/sort_down");
   private static final tn n = tn.c("multiplayer.downloadingStats");
   static final tn o = tn.c("stats.none");
   protected final eym a;
   private eyu.a p;
   eyu.b q;
   private eyu.c s;
   final apq t;
   @Nullable
   private eto<?> u;
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

   public eyu(eym $$0, apq $$1) {
      super(tn.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aH_() {
      this.v = true;
      this.f.J().b(new abp(abp.a.b));
   }

   public void l() {
      this.p = new eyu.a(this.f);
      this.q = new eyu.b(this.f);
      this.s = new eyu.c(this.f);
   }

   @Override
   public void D() {
      this.d((ess)ess.a(tn.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      ess $$0 = this.d((ess)ess.a(tn.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      ess $$1 = this.d((ess)ess.a(tn.c("stat.mobsButton"), $$0x -> this.a(this.s)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((ess)ess.a(tm.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.s.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      if (this.v) {
         this.b($$0, $$1, $$2, $$3);
         $$0.a(this.i, n, this.g / 2, this.h / 2, 16777215);
         $$0.a(this.i, b[(int)(ac.b() / 150L % (long)b.length)], this.g / 2, this.h / 2 + 9 * 2, 16777215);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.F().a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      }
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void E() {
      if (this.v) {
         this.l();
         this.D();
         this.a(this.p);
         this.v = false;
      }
   }

   @Override
   public boolean j() {
      return !this.v;
   }

   @Nullable
   public eto<?> F() {
      return this.u;
   }

   public void a(@Nullable eto<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.e($$0);
         this.u = $$0;
      }
   }

   static String a(apm<aey> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(esh $$0, int $$1, int $$2, cjc $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.ai_(), $$1 + 2, $$2 + 2);
   }

   void a(esh $$0, int $$1, int $$2, aey $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends eto<eyu.a.a> {
      public a(eqx $$0) {
         super($$0, eyu.this.g, eyu.this.h, 32, eyu.this.h - 64, 10);
         ObjectArrayList<apm<aey>> $$1 = new ObjectArrayList(app.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gam.a(eyu.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            apm<aey> $$2 = (apm<aey>)var4.next();
            this.b(new eyu.a.a($$2));
         }
      }

      class a extends eto.a<eyu.a.a> {
         private final apm<aey> b;
         private final tn c;

         a(apm<aey> $$0) {
            this.b = $$0;
            this.c = tn.c(eyu.a($$0));
         }

         private String b() {
            return this.b.a(eyu.this.t.a(this.b));
         }

         @Override
         public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyu.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(eyu.this.i, $$10, $$3 + 2 + 213 - eyu.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public tn a() {
            return tn.a("narrator.select", tn.h().b(this.c).b(tm.u).f(this.b()));
         }
      }
   }

   class b extends eto<eyu.b.a> {
      protected final List<apo<csx>> a;
      protected final List<apo<cjc>> m;
      private final aey[] t = new aey[]{
         new aey("statistics/block_mined"),
         new aey("statistics/item_broken"),
         new aey("statistics/item_crafted"),
         new aey("statistics/item_used"),
         new aey("statistics/item_picked_up"),
         new aey("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<eyu.b.a> o = new eyu.b.b();
      @Nullable
      protected apo<?> p;
      protected int q;

      public b(eqx $$0) {
         super($$0, eyu.this.g, eyu.this.h, 32, eyu.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(app.a);
         this.m = Lists.newArrayList(new apo[]{app.d, app.b, app.c, app.e, app.f});
         this.a(true, 20);
         Set<cjc> $$1 = Sets.newIdentityHashSet();

         for (cjc $$2 : jd.i) {
            boolean $$3 = false;

            for (apo<cjc> $$4 : this.m) {
               if ($$4.a($$2) && eyu.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (csx $$5 : jd.f) {
            boolean $$6 = false;

            for (apo<csx> $$7 : this.a) {
               if ($$7.a($$5) && eyu.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cjk.a);

         for (cjc $$8 : $$1) {
            this.b(new eyu.b.a($$8));
         }
      }

      @Override
      protected void a(esh $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            aey $$4 = this.n == $$3 ? eyu.c : eyu.k;
            eyu.this.a($$0, $$1 + eyu.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = eyu.this.a(this.b(this.p)) - 36;
            aey $$6 = this.q == 1 ? eyu.l : eyu.m;
            eyu.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            eyu.this.a($$0, $$1 + eyu.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
         }
      }

      @Override
      public int b() {
         return 375;
      }

      @Override
      protected int c() {
         return this.e / 2 + 140;
      }

      @Override
      protected void a(int $$0, int $$1) {
         this.n = -1;

         for (int $$2 = 0; $$2 < this.t.length; $$2++) {
            int $$3 = $$0 - eyu.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(gcj.a(apf.yu, 1.0F));
         }
      }

      private apo<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(apo<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(esh $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            eyu.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cjc $$5 = $$3.b();
               $$0.a(eyu.this.i, this.a($$5), $$1, $$2);
            } else {
               tn $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = eyu.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(eyu.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected tn a(cjc $$0) {
         return $$0.p();
      }

      protected void a(apo<?> $$0) {
         if ($$0 != this.p) {
            this.p = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.p = null;
            this.q = 0;
         }

         this.i().sort(this.o);
      }

      class a extends eto.a<eyu.b.a> {
         private final cjc b;

         a(cjc $$0) {
            this.b = $$0;
         }

         public cjc b() {
            return this.b;
         }

         @Override
         public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eyu.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < eyu.this.q.a.size(); $$10++) {
               apm<csx> $$11;
               if (this.b instanceof cha) {
                  $$11 = eyu.this.q.a.get($$10).b(((cha)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + eyu.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < eyu.this.q.m.size(); $$13++) {
               this.a($$0, eyu.this.q.m.get($$13).b(this.b), $$3 + eyu.this.a($$13 + eyu.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(esh $$0, @Nullable apm<?> $$1, int $$2, int $$3, boolean $$4) {
            tn $$5 = (tn)($$1 == null ? eyu.o : tn.b($$1.a(eyu.this.t.a($$1))));
            $$0.b(eyu.this.i, $$5, $$2 - eyu.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public tn a() {
            return tn.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<eyu.b.a> {
         public int a(eyu.b.a $$0, eyu.b.a $$1) {
            cjc $$2 = $$0.b();
            cjc $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               apo<csx> $$6 = (apo<csx>)b.this.p;
               $$4 = $$2 instanceof cha ? eyu.this.t.a($$6, ((cha)$$2).e()) : -1;
               $$5 = $$3 instanceof cha ? eyu.this.t.a($$6, ((cha)$$3).e()) : -1;
            } else {
               apo<cjc> $$9 = (apo<cjc>)b.this.p;
               $$4 = eyu.this.t.a($$9, $$2);
               $$5 = eyu.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cjc.a($$2), cjc.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends eto<eyu.c.a> {
      public c(eqx $$0) {
         super($$0, eyu.this.g, eyu.this.h, 32, eyu.this.h - 64, 9 * 4);

         for (biw<?> $$1 : jd.h) {
            if (eyu.this.t.a(app.g.b($$1)) > 0 || eyu.this.t.a(app.h.b($$1)) > 0) {
               this.b(new eyu.c.a($$1));
            }
         }
      }

      class a extends eto.a<eyu.c.a> {
         private final tn b;
         private final tn c;
         private final boolean d;
         private final tn e;
         private final boolean f;

         public a(biw<?> $$0) {
            this.b = $$0.h();
            int $$1 = eyu.this.t.a(app.g.b($$0));
            if ($$1 == 0) {
               this.c = tn.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = tn.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = eyu.this.t.a(app.h.b($$0));
            if ($$2 == 0) {
               this.e = tn.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = tn.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyu.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(eyu.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(eyu.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public tn a() {
            return tn.a("narrator.select", tm.a(this.c, this.e));
         }
      }
   }
}
