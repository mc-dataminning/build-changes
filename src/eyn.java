import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eyn extends eye implements eyo {
   static final aez c = new aez("container/slot");
   static final aez k = new aez("statistics/header");
   static final aez l = new aez("statistics/sort_up");
   static final aez m = new aez("statistics/sort_down");
   private static final tl n = tl.c("multiplayer.downloadingStats");
   static final tl o = tl.c("stats.none");
   protected final eye a;
   private eyn.a p;
   eyn.b q;
   private eyn.c s;
   final apr t;
   @Nullable
   private etg<?> u;
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

   public eyn(eye $$0, apr $$1) {
      super(tl.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aH_() {
      this.v = true;
      this.f.J().b(new abo(abo.a.b));
   }

   public void l() {
      this.p = new eyn.a(this.f);
      this.q = new eyn.b(this.f);
      this.s = new eyn.c(this.f);
   }

   @Override
   public void D() {
      this.d((esk)esk.a(tl.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      esk $$0 = this.d((esk)esk.a(tl.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      esk $$1 = this.d((esk)esk.a(tl.c("stat.mobsButton"), $$0x -> this.a(this.s)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((esk)esk.a(tk.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.s.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
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
   public void b(erz $$0, int $$1, int $$2, float $$3) {
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
   public etg<?> F() {
      return this.u;
   }

   public void a(@Nullable etg<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.e($$0);
         this.u = $$0;
      }
   }

   static String a(apn<aez> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(erz $$0, int $$1, int $$2, cjg $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.ai_(), $$1 + 2, $$2 + 2);
   }

   void a(erz $$0, int $$1, int $$2, aez $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends etg<eyn.a.a> {
      public a(eqp $$0) {
         super($$0, eyn.this.g, eyn.this.h, 32, eyn.this.h - 64, 10);
         ObjectArrayList<apn<aez>> $$1 = new ObjectArrayList(apq.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gag.a(eyn.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            apn<aez> $$2 = (apn<aez>)var4.next();
            this.b(new eyn.a.a($$2));
         }
      }

      class a extends etg.a<eyn.a.a> {
         private final apn<aez> b;
         private final tl c;

         a(apn<aez> $$0) {
            this.b = $$0;
            this.c = tl.c(eyn.a($$0));
         }

         private String b() {
            return this.b.a(eyn.this.t.a(this.b));
         }

         @Override
         public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyn.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(eyn.this.i, $$10, $$3 + 2 + 213 - eyn.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public tl a() {
            return tl.a("narrator.select", tl.i().b(this.c).b(tk.u).f(this.b()));
         }
      }
   }

   class b extends etg<eyn.b.a> {
      protected final List<app<ctc>> a;
      protected final List<app<cjg>> m;
      private final aez[] t = new aez[]{
         new aez("statistics/block_mined"),
         new aez("statistics/item_broken"),
         new aez("statistics/item_crafted"),
         new aez("statistics/item_used"),
         new aez("statistics/item_picked_up"),
         new aez("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<eyn.b.a> o = new eyn.b.b();
      @Nullable
      protected app<?> p;
      protected int q;

      public b(eqp $$0) {
         super($$0, eyn.this.g, eyn.this.h, 32, eyn.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(apq.a);
         this.m = Lists.newArrayList(new app[]{apq.d, apq.b, apq.c, apq.e, apq.f});
         this.a(true, 20);
         Set<cjg> $$1 = Sets.newIdentityHashSet();

         for (cjg $$2 : jb.i) {
            boolean $$3 = false;

            for (app<cjg> $$4 : this.m) {
               if ($$4.a($$2) && eyn.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (ctc $$5 : jb.f) {
            boolean $$6 = false;

            for (app<ctc> $$7 : this.a) {
               if ($$7.a($$5) && eyn.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cjo.a);

         for (cjg $$8 : $$1) {
            this.b(new eyn.b.a($$8));
         }
      }

      @Override
      protected void a(erz $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            aez $$4 = this.n == $$3 ? eyn.c : eyn.k;
            eyn.this.a($$0, $$1 + eyn.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = eyn.this.a(this.b(this.p)) - 36;
            aez $$6 = this.q == 1 ? eyn.l : eyn.m;
            eyn.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            eyn.this.a($$0, $$1 + eyn.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - eyn.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(gcd.a(apg.yu, 1.0F));
         }
      }

      private app<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(app<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(erz $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            eyn.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cjg $$5 = $$3.b();
               $$0.a(eyn.this.i, this.a($$5), $$1, $$2);
            } else {
               tl $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = eyn.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(eyn.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected tl a(cjg $$0) {
         return $$0.p();
      }

      protected void a(app<?> $$0) {
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

      class a extends etg.a<eyn.b.a> {
         private final cjg b;

         a(cjg $$0) {
            this.b = $$0;
         }

         public cjg b() {
            return this.b;
         }

         @Override
         public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eyn.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < eyn.this.q.a.size(); $$10++) {
               apn<ctc> $$11;
               if (this.b instanceof che) {
                  $$11 = eyn.this.q.a.get($$10).b(((che)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + eyn.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < eyn.this.q.m.size(); $$13++) {
               this.a($$0, eyn.this.q.m.get($$13).b(this.b), $$3 + eyn.this.a($$13 + eyn.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(erz $$0, @Nullable apn<?> $$1, int $$2, int $$3, boolean $$4) {
            tl $$5 = (tl)($$1 == null ? eyn.o : tl.b($$1.a(eyn.this.t.a($$1))));
            $$0.b(eyn.this.i, $$5, $$2 - eyn.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public tl a() {
            return tl.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<eyn.b.a> {
         public int a(eyn.b.a $$0, eyn.b.a $$1) {
            cjg $$2 = $$0.b();
            cjg $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               app<ctc> $$6 = (app<ctc>)b.this.p;
               $$4 = $$2 instanceof che ? eyn.this.t.a($$6, ((che)$$2).e()) : -1;
               $$5 = $$3 instanceof che ? eyn.this.t.a($$6, ((che)$$3).e()) : -1;
            } else {
               app<cjg> $$9 = (app<cjg>)b.this.p;
               $$4 = eyn.this.t.a($$9, $$2);
               $$5 = eyn.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cjg.a($$2), cjg.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends etg<eyn.c.a> {
      public c(eqp $$0) {
         super($$0, eyn.this.g, eyn.this.h, 32, eyn.this.h - 64, 9 * 4);

         for (bja<?> $$1 : jb.h) {
            if (eyn.this.t.a(apq.g.b($$1)) > 0 || eyn.this.t.a(apq.h.b($$1)) > 0) {
               this.b(new eyn.c.a($$1));
            }
         }
      }

      class a extends etg.a<eyn.c.a> {
         private final tl b;
         private final tl c;
         private final boolean d;
         private final tl e;
         private final boolean f;

         public a(bja<?> $$0) {
            this.b = $$0.h();
            int $$1 = eyn.this.t.a(apq.g.b($$0));
            if ($$1 == 0) {
               this.c = tl.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = tl.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = eyn.this.t.a(apq.h.b($$0));
            if ($$2 == 0) {
               this.e = tl.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = tl.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyn.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(eyn.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(eyn.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public tl a() {
            return tl.a("narrator.select", tk.a(this.c, this.e));
         }
      }
   }
}
