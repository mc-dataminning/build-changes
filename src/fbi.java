import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fbi extends faz implements fbj {
   static final agm c = new agm("container/slot");
   static final agm k = new agm("statistics/header");
   static final agm l = new agm("statistics/sort_up");
   static final agm m = new agm("statistics/sort_down");
   private static final uv n = uv.c("multiplayer.downloadingStats");
   static final uv o = uv.c("stats.none");
   protected final faz a;
   private fbi.a p;
   fbi.b q;
   private fbi.c r;
   final arg t;
   @Nullable
   private ewa<?> u;
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

   public fbi(faz $$0, arg $$1) {
      super(uv.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aQ_() {
      this.v = true;
      this.f.I().b(new ada(ada.a.b));
   }

   public void l() {
      this.p = new fbi.a(this.f);
      this.q = new fbi.b(this.f);
      this.r = new fbi.c(this.f);
   }

   @Override
   public void C() {
      this.d((eve)eve.a(uv.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      eve $$0 = this.d((eve)eve.a(uv.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      eve $$1 = this.d((eve)eve.a(uv.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((eve)eve.a(uu.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.r.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
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
   public void b(eut $$0, int $$1, int $$2, float $$3) {
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
   public ewa<?> E() {
      return this.u;
   }

   public void a(@Nullable ewa<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.e($$0);
         this.u = $$0;
      }
   }

   static String a(arc<agm> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(eut $$0, int $$1, int $$2, clj $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.an_(), $$1 + 2, $$2 + 2);
   }

   void a(eut $$0, int $$1, int $$2, agm $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends ewa<fbi.a.a> {
      public a(eti $$0) {
         super($$0, fbi.this.g, fbi.this.h, 32, fbi.this.h - 64, 10);
         ObjectArrayList<arc<agm>> $$1 = new ObjectArrayList(arf.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gdf.a(fbi.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            arc<agm> $$2 = (arc<agm>)var4.next();
            this.b(new fbi.a.a($$2));
         }
      }

      class a extends ewa.a<fbi.a.a> {
         private final arc<agm> b;
         private final uv c;

         a(arc<agm> $$0) {
            this.b = $$0;
            this.c = uv.c(fbi.a($$0));
         }

         private String b() {
            return this.b.a(fbi.this.t.a(this.b));
         }

         @Override
         public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fbi.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fbi.this.i, $$10, $$3 + 2 + 213 - fbi.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public uv a() {
            return uv.a("narrator.select", uv.i().b(this.c).b(uu.u).f(this.b()));
         }
      }
   }

   class b extends ewa<fbi.b.a> {
      protected final List<are<cvf>> a;
      protected final List<are<clj>> m;
      private final agm[] t = new agm[]{
         new agm("statistics/block_mined"),
         new agm("statistics/item_broken"),
         new agm("statistics/item_crafted"),
         new agm("statistics/item_used"),
         new agm("statistics/item_picked_up"),
         new agm("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fbi.b.a> o = new fbi.b.b();
      @Nullable
      protected are<?> p;
      protected int q;

      public b(eti $$0) {
         super($$0, fbi.this.g, fbi.this.h, 32, fbi.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(arf.a);
         this.m = Lists.newArrayList(new are[]{arf.d, arf.b, arf.c, arf.e, arf.f});
         this.a(true, 20);
         Set<clj> $$1 = Sets.newIdentityHashSet();

         for (clj $$2 : kc.i) {
            boolean $$3 = false;

            for (are<clj> $$4 : this.m) {
               if ($$4.a($$2) && fbi.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cvf $$5 : kc.f) {
            boolean $$6 = false;

            for (are<cvf> $$7 : this.a) {
               if ($$7.a($$5) && fbi.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(clr.a);

         for (clj $$8 : $$1) {
            this.b(new fbi.b.a($$8));
         }
      }

      @Override
      protected void a(eut $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            agm $$4 = this.n == $$3 ? fbi.c : fbi.k;
            fbi.this.a($$0, $$1 + fbi.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fbi.this.a(this.b(this.p)) - 36;
            agm $$6 = this.q == 1 ? fbi.l : fbi.m;
            fbi.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fbi.this.a($$0, $$1 + fbi.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
      protected boolean a(int $$0, int $$1) {
         this.n = -1;

         for (int $$2 = 0; $$2 < this.t.length; $$2++) {
            int $$3 = $$0 - fbi.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ah().a(gfc.a(aqv.yZ, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private are<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(are<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(eut $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            fbi.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               clj $$5 = $$3.b();
               $$0.a(fbi.this.i, this.a($$5), $$1, $$2);
            } else {
               uv $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fbi.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fbi.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected uv a(clj $$0) {
         return $$0.p();
      }

      protected void a(are<?> $$0) {
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

      class a extends ewa.a<fbi.b.a> {
         private final clj b;

         a(clj $$0) {
            this.b = $$0;
         }

         public clj b() {
            return this.b;
         }

         @Override
         public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fbi.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fbi.this.q.a.size(); $$10++) {
               arc<cvf> $$11;
               if (this.b instanceof cjh) {
                  $$11 = fbi.this.q.a.get($$10).b(((cjh)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fbi.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fbi.this.q.m.size(); $$13++) {
               this.a($$0, fbi.this.q.m.get($$13).b(this.b), $$3 + fbi.this.a($$13 + fbi.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(eut $$0, @Nullable arc<?> $$1, int $$2, int $$3, boolean $$4) {
            uv $$5 = (uv)($$1 == null ? fbi.o : uv.b($$1.a(fbi.this.t.a($$1))));
            $$0.b(fbi.this.i, $$5, $$2 - fbi.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public uv a() {
            return uv.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<fbi.b.a> {
         public int a(fbi.b.a $$0, fbi.b.a $$1) {
            clj $$2 = $$0.b();
            clj $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               are<cvf> $$6 = (are<cvf>)b.this.p;
               $$4 = $$2 instanceof cjh ? fbi.this.t.a($$6, ((cjh)$$2).e()) : -1;
               $$5 = $$3 instanceof cjh ? fbi.this.t.a($$6, ((cjh)$$3).e()) : -1;
            } else {
               are<clj> $$9 = (are<clj>)b.this.p;
               $$4 = fbi.this.t.a($$9, $$2);
               $$5 = fbi.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(clj.a($$2), clj.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends ewa<fbi.c.a> {
      public c(eti $$0) {
         super($$0, fbi.this.g, fbi.this.h, 32, fbi.this.h - 64, 9 * 4);

         for (bkz<?> $$1 : kc.h) {
            if (fbi.this.t.a(arf.g.b($$1)) > 0 || fbi.this.t.a(arf.h.b($$1)) > 0) {
               this.b(new fbi.c.a($$1));
            }
         }
      }

      class a extends ewa.a<fbi.c.a> {
         private final uv b;
         private final uv c;
         private final boolean d;
         private final uv e;
         private final boolean f;

         public a(bkz<?> $$0) {
            this.b = $$0.h();
            int $$1 = fbi.this.t.a(arf.g.b($$0));
            if ($$1 == 0) {
               this.c = uv.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = uv.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fbi.this.t.a(arf.h.b($$0));
            if ($$2 == 0) {
               this.e = uv.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = uv.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fbi.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fbi.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fbi.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public uv a() {
            return uv.a("narrator.select", uu.a(this.c, this.e));
         }
      }
   }
}
