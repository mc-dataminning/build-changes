import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ezm extends ezd implements ezn {
   static final afw c = new afw("container/slot");
   static final afw k = new afw("statistics/header");
   static final afw l = new afw("statistics/sort_up");
   static final afw m = new afw("statistics/sort_down");
   private static final ui n = ui.c("multiplayer.downloadingStats");
   static final ui o = ui.c("stats.none");
   protected final ezd a;
   private ezm.a p;
   ezm.b q;
   private ezm.c s;
   final aqo t;
   @Nullable
   private euf<?> u;
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

   public ezm(ezd $$0, aqo $$1) {
      super(ui.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aM_() {
      this.v = true;
      this.f.J().b(new acl(acl.a.b));
   }

   public void l() {
      this.p = new ezm.a(this.f);
      this.q = new ezm.b(this.f);
      this.s = new ezm.c(this.f);
   }

   @Override
   public void C() {
      this.d((etj)etj.a(ui.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      etj $$0 = this.d((etj)etj.a(ui.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      etj $$1 = this.d((etj)etj.a(ui.c("stat.mobsButton"), $$0x -> this.a(this.s)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((etj)etj.a(uh.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.s.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      if (this.v) {
         this.b($$0, $$1, $$2, $$3);
         $$0.a(this.i, n, this.g / 2, this.h / 2, 16777215);
         $$0.a(this.i, b[(int)(ac.b() / 150L % (long)b.length)], this.g / 2, this.h / 2 + 9 * 2, 16777215);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.E().a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void D() {
      if (this.v) {
         this.l();
         this.C();
         this.a(this.p);
         this.v = false;
      }
   }

   @Override
   public boolean j() {
      return !this.v;
   }

   @Nullable
   public euf<?> E() {
      return this.u;
   }

   public void a(@Nullable euf<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.e($$0);
         this.u = $$0;
      }
   }

   static String a(aqk<afw> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(esy $$0, int $$1, int $$2, cke $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.al_(), $$1 + 2, $$2 + 2);
   }

   void a(esy $$0, int $$1, int $$2, afw $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends euf<ezm.a.a> {
      public a(ero $$0) {
         super($$0, ezm.this.g, ezm.this.h, 32, ezm.this.h - 64, 10);
         ObjectArrayList<aqk<afw>> $$1 = new ObjectArrayList(aqn.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gbg.a(ezm.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            aqk<afw> $$2 = (aqk<afw>)var4.next();
            this.b(new ezm.a.a($$2));
         }
      }

      class a extends euf.a<ezm.a.a> {
         private final aqk<afw> b;
         private final ui c;

         a(aqk<afw> $$0) {
            this.b = $$0;
            this.c = ui.c(ezm.a($$0));
         }

         private String b() {
            return this.b.a(ezm.this.t.a(this.b));
         }

         @Override
         public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ezm.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(ezm.this.i, $$10, $$3 + 2 + 213 - ezm.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public ui a() {
            return ui.a("narrator.select", ui.i().b(this.c).b(uh.u).f(this.b()));
         }
      }
   }

   class b extends euf<ezm.b.a> {
      protected final List<aqm<cua>> a;
      protected final List<aqm<cke>> m;
      private final afw[] t = new afw[]{
         new afw("statistics/block_mined"),
         new afw("statistics/item_broken"),
         new afw("statistics/item_crafted"),
         new afw("statistics/item_used"),
         new afw("statistics/item_picked_up"),
         new afw("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<ezm.b.a> o = new ezm.b.b();
      @Nullable
      protected aqm<?> p;
      protected int q;

      public b(ero $$0) {
         super($$0, ezm.this.g, ezm.this.h, 32, ezm.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(aqn.a);
         this.m = Lists.newArrayList(new aqm[]{aqn.d, aqn.b, aqn.c, aqn.e, aqn.f});
         this.a(true, 20);
         Set<cke> $$1 = Sets.newIdentityHashSet();

         for (cke $$2 : jy.i) {
            boolean $$3 = false;

            for (aqm<cke> $$4 : this.m) {
               if ($$4.a($$2) && ezm.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cua $$5 : jy.f) {
            boolean $$6 = false;

            for (aqm<cua> $$7 : this.a) {
               if ($$7.a($$5) && ezm.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(ckm.a);

         for (cke $$8 : $$1) {
            this.b(new ezm.b.a($$8));
         }
      }

      @Override
      protected void a(esy $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            afw $$4 = this.n == $$3 ? ezm.c : ezm.k;
            ezm.this.a($$0, $$1 + ezm.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = ezm.this.a(this.b(this.p)) - 36;
            afw $$6 = this.q == 1 ? ezm.l : ezm.m;
            ezm.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            ezm.this.a($$0, $$1 + ezm.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - ezm.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(gdd.a(aqd.yw, 1.0F));
         }
      }

      private aqm<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(aqm<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(esy $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            ezm.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cke $$5 = $$3.b();
               $$0.a(ezm.this.i, this.a($$5), $$1, $$2);
            } else {
               ui $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = ezm.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(ezm.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected ui a(cke $$0) {
         return $$0.p();
      }

      protected void a(aqm<?> $$0) {
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

      class a extends euf.a<ezm.b.a> {
         private final cke b;

         a(cke $$0) {
            this.b = $$0;
         }

         public cke b() {
            return this.b;
         }

         @Override
         public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ezm.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < ezm.this.q.a.size(); $$10++) {
               aqk<cua> $$11;
               if (this.b instanceof cic) {
                  $$11 = ezm.this.q.a.get($$10).b(((cic)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + ezm.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < ezm.this.q.m.size(); $$13++) {
               this.a($$0, ezm.this.q.m.get($$13).b(this.b), $$3 + ezm.this.a($$13 + ezm.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(esy $$0, @Nullable aqk<?> $$1, int $$2, int $$3, boolean $$4) {
            ui $$5 = (ui)($$1 == null ? ezm.o : ui.b($$1.a(ezm.this.t.a($$1))));
            $$0.b(ezm.this.i, $$5, $$2 - ezm.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public ui a() {
            return ui.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<ezm.b.a> {
         public int a(ezm.b.a $$0, ezm.b.a $$1) {
            cke $$2 = $$0.b();
            cke $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               aqm<cua> $$6 = (aqm<cua>)b.this.p;
               $$4 = $$2 instanceof cic ? ezm.this.t.a($$6, ((cic)$$2).e()) : -1;
               $$5 = $$3 instanceof cic ? ezm.this.t.a($$6, ((cic)$$3).e()) : -1;
            } else {
               aqm<cke> $$9 = (aqm<cke>)b.this.p;
               $$4 = ezm.this.t.a($$9, $$2);
               $$5 = ezm.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cke.a($$2), cke.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends euf<ezm.c.a> {
      public c(ero $$0) {
         super($$0, ezm.this.g, ezm.this.h, 32, ezm.this.h - 64, 9 * 4);

         for (bjx<?> $$1 : jy.h) {
            if (ezm.this.t.a(aqn.g.b($$1)) > 0 || ezm.this.t.a(aqn.h.b($$1)) > 0) {
               this.b(new ezm.c.a($$1));
            }
         }
      }

      class a extends euf.a<ezm.c.a> {
         private final ui b;
         private final ui c;
         private final boolean d;
         private final ui e;
         private final boolean f;

         public a(bjx<?> $$0) {
            this.b = $$0.h();
            int $$1 = ezm.this.t.a(aqn.g.b($$0));
            if ($$1 == 0) {
               this.c = ui.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = ui.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = ezm.this.t.a(aqn.h.b($$0));
            if ($$2 == 0) {
               this.e = ui.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = ui.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ezm.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(ezm.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(ezm.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public ui a() {
            return ui.a("narrator.select", uh.a(this.c, this.e));
         }
      }
   }
}
