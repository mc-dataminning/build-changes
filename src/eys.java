import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eys extends eyk implements eyt {
   static final aew c = new aew("container/slot");
   static final aew k = new aew("statistics/header");
   static final aew l = new aew("statistics/sort_up");
   static final aew m = new aew("statistics/sort_down");
   private static final tl n = tl.c("multiplayer.downloadingStats");
   static final tl o = tl.c("stats.none");
   protected final eyk a;
   private eys.a p;
   eys.b q;
   private eys.c s;
   final apo t;
   @Nullable
   private etm<?> u;
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

   public eys(eyk $$0, apo $$1) {
      super(tl.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aH_() {
      this.v = true;
      this.f.J().b(new abn(abn.a.b));
   }

   public void l() {
      this.p = new eys.a(this.f);
      this.q = new eys.b(this.f);
      this.s = new eys.c(this.f);
   }

   @Override
   public void D() {
      this.d((esq)esq.a(tl.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      esq $$0 = this.d((esq)esq.a(tl.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      esq $$1 = this.d((esq)esq.a(tl.c("stat.mobsButton"), $$0x -> this.a(this.s)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((esq)esq.a(tk.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.s.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
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
   public void b(esf $$0, int $$1, int $$2, float $$3) {
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
   public etm<?> F() {
      return this.u;
   }

   public void a(@Nullable etm<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.e($$0);
         this.u = $$0;
      }
   }

   static String a(apk<aew> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(esf $$0, int $$1, int $$2, cja $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.ai_(), $$1 + 2, $$2 + 2);
   }

   void a(esf $$0, int $$1, int $$2, aew $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends etm<eys.a.a> {
      public a(eqv $$0) {
         super($$0, eys.this.g, eys.this.h, 32, eys.this.h - 64, 10);
         ObjectArrayList<apk<aew>> $$1 = new ObjectArrayList(apn.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gak.a(eys.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            apk<aew> $$2 = (apk<aew>)var4.next();
            this.b(new eys.a.a($$2));
         }
      }

      class a extends etm.a<eys.a.a> {
         private final apk<aew> b;
         private final tl c;

         a(apk<aew> $$0) {
            this.b = $$0;
            this.c = tl.c(eys.a($$0));
         }

         private String b() {
            return this.b.a(eys.this.t.a(this.b));
         }

         @Override
         public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eys.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(eys.this.i, $$10, $$3 + 2 + 213 - eys.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public tl a() {
            return tl.a("narrator.select", tl.h().b(this.c).b(tk.u).f(this.b()));
         }
      }
   }

   class b extends etm<eys.b.a> {
      protected final List<apm<csv>> a;
      protected final List<apm<cja>> m;
      private final aew[] t = new aew[]{
         new aew("statistics/block_mined"),
         new aew("statistics/item_broken"),
         new aew("statistics/item_crafted"),
         new aew("statistics/item_used"),
         new aew("statistics/item_picked_up"),
         new aew("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<eys.b.a> o = new eys.b.b();
      @Nullable
      protected apm<?> p;
      protected int q;

      public b(eqv $$0) {
         super($$0, eys.this.g, eys.this.h, 32, eys.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(apn.a);
         this.m = Lists.newArrayList(new apm[]{apn.d, apn.b, apn.c, apn.e, apn.f});
         this.a(true, 20);
         Set<cja> $$1 = Sets.newIdentityHashSet();

         for (cja $$2 : jb.i) {
            boolean $$3 = false;

            for (apm<cja> $$4 : this.m) {
               if ($$4.a($$2) && eys.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (csv $$5 : jb.f) {
            boolean $$6 = false;

            for (apm<csv> $$7 : this.a) {
               if ($$7.a($$5) && eys.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cji.a);

         for (cja $$8 : $$1) {
            this.b(new eys.b.a($$8));
         }
      }

      @Override
      protected void a(esf $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            aew $$4 = this.n == $$3 ? eys.c : eys.k;
            eys.this.a($$0, $$1 + eys.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = eys.this.a(this.b(this.p)) - 36;
            aew $$6 = this.q == 1 ? eys.l : eys.m;
            eys.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            eys.this.a($$0, $$1 + eys.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - eys.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(gch.a(apd.yu, 1.0F));
         }
      }

      private apm<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(apm<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(esf $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            eys.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cja $$5 = $$3.b();
               $$0.a(eys.this.i, this.a($$5), $$1, $$2);
            } else {
               tl $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = eys.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(eys.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected tl a(cja $$0) {
         return $$0.p();
      }

      protected void a(apm<?> $$0) {
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

      class a extends etm.a<eys.b.a> {
         private final cja b;

         a(cja $$0) {
            this.b = $$0;
         }

         public cja b() {
            return this.b;
         }

         @Override
         public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eys.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < eys.this.q.a.size(); $$10++) {
               apk<csv> $$11;
               if (this.b instanceof cgy) {
                  $$11 = eys.this.q.a.get($$10).b(((cgy)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + eys.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < eys.this.q.m.size(); $$13++) {
               this.a($$0, eys.this.q.m.get($$13).b(this.b), $$3 + eys.this.a($$13 + eys.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(esf $$0, @Nullable apk<?> $$1, int $$2, int $$3, boolean $$4) {
            tl $$5 = (tl)($$1 == null ? eys.o : tl.b($$1.a(eys.this.t.a($$1))));
            $$0.b(eys.this.i, $$5, $$2 - eys.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public tl a() {
            return tl.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<eys.b.a> {
         public int a(eys.b.a $$0, eys.b.a $$1) {
            cja $$2 = $$0.b();
            cja $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               apm<csv> $$6 = (apm<csv>)b.this.p;
               $$4 = $$2 instanceof cgy ? eys.this.t.a($$6, ((cgy)$$2).e()) : -1;
               $$5 = $$3 instanceof cgy ? eys.this.t.a($$6, ((cgy)$$3).e()) : -1;
            } else {
               apm<cja> $$9 = (apm<cja>)b.this.p;
               $$4 = eys.this.t.a($$9, $$2);
               $$5 = eys.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cja.a($$2), cja.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends etm<eys.c.a> {
      public c(eqv $$0) {
         super($$0, eys.this.g, eys.this.h, 32, eys.this.h - 64, 9 * 4);

         for (biu<?> $$1 : jb.h) {
            if (eys.this.t.a(apn.g.b($$1)) > 0 || eys.this.t.a(apn.h.b($$1)) > 0) {
               this.b(new eys.c.a($$1));
            }
         }
      }

      class a extends etm.a<eys.c.a> {
         private final tl b;
         private final tl c;
         private final boolean d;
         private final tl e;
         private final boolean f;

         public a(biu<?> $$0) {
            this.b = $$0.h();
            int $$1 = eys.this.t.a(apn.g.b($$0));
            if ($$1 == 0) {
               this.c = tl.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = tl.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = eys.this.t.a(apn.h.b($$0));
            if ($$2 == 0) {
               this.e = tl.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = tl.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eys.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(eys.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(eys.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public tl a() {
            return tl.a("narrator.select", tk.a(this.c, this.e));
         }
      }
   }
}
