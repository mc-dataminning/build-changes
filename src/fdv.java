import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fdv extends fdm implements fdw {
   static final ahh c = new ahh("container/slot");
   static final ahh k = new ahh("statistics/header");
   static final ahh l = new ahh("statistics/sort_up");
   static final ahh m = new ahh("statistics/sort_down");
   private static final vg n = vg.c("multiplayer.downloadingStats");
   static final vg o = vg.c("stats.none");
   protected final fdm a;
   private fdv.a p;
   fdv.b q;
   private fdv.c r;
   final ase t;
   @Nullable
   private eyn<?> u;
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

   public fdv(fdm $$0, ase $$1) {
      super(vg.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aP_() {
      this.v = true;
      this.f.J().b(new adv(adv.a.b));
   }

   public void o() {
      this.p = new fdv.a(this.f);
      this.q = new fdv.b(this.f);
      this.r = new fdv.c(this.f);
   }

   public void E() {
      this.d((exr)exr.a(vg.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      exr $$0 = this.d((exr)exr.a(vg.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      exr $$1 = this.d((exr)exr.a(vg.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((exr)exr.a(vf.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.l().isEmpty()) {
         $$0.j = false;
      }

      if (this.r.l().isEmpty()) {
         $$1.j = false;
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
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
   public void b(exe $$0, int $$1, int $$2, float $$3) {
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

   public void a(@Nullable eyn<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.d($$0);
         this.u = $$0;
      }
   }

   static String a(asa<ahh> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(exe $$0, int $$1, int $$2, cnb $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.ao_(), $$1 + 2, $$2 + 2);
   }

   void a(exe $$0, int $$1, int $$2, ahh $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends eyn<fdv.a.a> {
      public a(evr $$0) {
         super($$0, fdv.this.g, fdv.this.h - 96, 32, 10);
         ObjectArrayList<asa<ahh>> $$1 = new ObjectArrayList(asd.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> ggg.a(fdv.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            asa<ahh> $$2 = (asa<ahh>)var4.next();
            this.b(new fdv.a.a($$2));
         }
      }

      class a extends eyn.a<fdv.a.a> {
         private final asa<ahh> b;
         private final vg c;

         a(asa<ahh> $$0) {
            this.b = $$0;
            this.c = vg.c(fdv.a($$0));
         }

         private String b() {
            return this.b.a(fdv.this.t.a(this.b));
         }

         @Override
         public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fdv.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fdv.this.i, $$10, $$3 + 2 + 213 - fdv.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public vg a() {
            return vg.a("narrator.select", vg.i().b(this.c).b(vf.u).f(this.b()));
         }
      }
   }

   class b extends eyn<fdv.b.a> {
      protected final List<asc<cwy>> a;
      protected final List<asc<cnb>> m;
      private final ahh[] t = new ahh[]{
         new ahh("statistics/block_mined"),
         new ahh("statistics/item_broken"),
         new ahh("statistics/item_crafted"),
         new ahh("statistics/item_used"),
         new ahh("statistics/item_picked_up"),
         new ahh("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fdv.b.a> o = new fdv.b.b();
      @Nullable
      protected asc<?> p;
      protected int q;

      public b(evr $$0) {
         super($$0, fdv.this.g, fdv.this.h - 96, 32, 20);
         this.a = Lists.newArrayList();
         this.a.add(asd.a);
         this.m = Lists.newArrayList(new asc[]{asd.d, asd.b, asd.c, asd.e, asd.f});
         this.a(true, 20);
         Set<cnb> $$1 = Sets.newIdentityHashSet();

         for (cnb $$2 : kd.h) {
            boolean $$3 = false;

            for (asc<cnb> $$4 : this.m) {
               if ($$4.a($$2) && fdv.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cwy $$5 : kd.e) {
            boolean $$6 = false;

            for (asc<cwy> $$7 : this.a) {
               if ($$7.a($$5) && fdv.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cnj.a);

         for (cnb $$8 : $$1) {
            this.b(new fdv.b.a($$8));
         }
      }

      @Override
      protected void a(exe $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            ahh $$4 = this.n == $$3 ? fdv.c : fdv.k;
            fdv.this.a($$0, $$1 + fdv.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fdv.this.a(this.b(this.p)) - 36;
            ahh $$6 = this.q == 1 ? fdv.l : fdv.m;
            fdv.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fdv.this.a($$0, $$1 + fdv.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - fdv.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(gij.a(art.zJ, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private asc<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(asc<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(exe $$0, int $$1, int $$2) {
         if ($$2 >= this.C() && $$2 <= this.E()) {
            fdv.b.a $$3 = this.t();
            int $$4 = (this.g - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cnb $$5 = $$3.b();
               $$0.a(fdv.this.i, this.a($$5), $$1, $$2);
            } else {
               vg $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fdv.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fdv.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected vg a(cnb $$0) {
         return $$0.o();
      }

      protected void a(asc<?> $$0) {
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

      class a extends eyn.a<fdv.b.a> {
         private final cnb b;

         a(cnb $$0) {
            this.b = $$0;
         }

         public cnb b() {
            return this.b;
         }

         @Override
         public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fdv.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fdv.this.q.a.size(); $$10++) {
               asa<cwy> $$11;
               if (this.b instanceof cla) {
                  $$11 = fdv.this.q.a.get($$10).b(((cla)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fdv.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fdv.this.q.m.size(); $$13++) {
               this.a($$0, fdv.this.q.m.get($$13).b(this.b), $$3 + fdv.this.a($$13 + fdv.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(exe $$0, @Nullable asa<?> $$1, int $$2, int $$3, boolean $$4) {
            vg $$5 = (vg)($$1 == null ? fdv.o : vg.b($$1.a(fdv.this.t.a($$1))));
            $$0.b(fdv.this.i, $$5, $$2 - fdv.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public vg a() {
            return vg.a("narrator.select", this.b.o());
         }
      }

      class b implements Comparator<fdv.b.a> {
         public int a(fdv.b.a $$0, fdv.b.a $$1) {
            cnb $$2 = $$0.b();
            cnb $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               asc<cwy> $$6 = (asc<cwy>)b.this.p;
               $$4 = $$2 instanceof cla ? fdv.this.t.a($$6, ((cla)$$2).e()) : -1;
               $$5 = $$3 instanceof cla ? fdv.this.t.a($$6, ((cla)$$3).e()) : -1;
            } else {
               asc<cnb> $$9 = (asc<cnb>)b.this.p;
               $$4 = fdv.this.t.a($$9, $$2);
               $$5 = fdv.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cnb.a($$2), cnb.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends eyn<fdv.c.a> {
      public c(evr $$0) {
         super($$0, fdv.this.g, fdv.this.h - 96, 32, 9 * 4);

         for (bmc<?> $$1 : kd.g) {
            if (fdv.this.t.a(asd.g.b($$1)) > 0 || fdv.this.t.a(asd.h.b($$1)) > 0) {
               this.b(new fdv.c.a($$1));
            }
         }
      }

      class a extends eyn.a<fdv.c.a> {
         private final vg b;
         private final vg c;
         private final boolean d;
         private final vg e;
         private final boolean f;

         public a(bmc<?> $$0) {
            this.b = $$0.h();
            int $$1 = fdv.this.t.a(asd.g.b($$0));
            if ($$1 == 0) {
               this.c = vg.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = vg.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fdv.this.t.a(asd.h.b($$0));
            if ($$2 == 0) {
               this.e = vg.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = vg.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fdv.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fdv.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fdv.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public vg a() {
            return vg.a("narrator.select", vf.a(this.c, this.e));
         }
      }
   }
}
