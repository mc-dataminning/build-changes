import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fdk extends fdb implements fdl {
   static final ahg c = new ahg("container/slot");
   static final ahg k = new ahg("statistics/header");
   static final ahg l = new ahg("statistics/sort_up");
   static final ahg m = new ahg("statistics/sort_down");
   private static final vf n = vf.c("multiplayer.downloadingStats");
   static final vf o = vf.c("stats.none");
   protected final fdb a;
   private fdk.a p;
   fdk.b q;
   private fdk.c r;
   final asd t;
   @Nullable
   private eyc<?> u;
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

   public fdk(fdb $$0, asd $$1) {
      super(vf.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aN_() {
      this.v = true;
      this.f.J().b(new adu(adu.a.b));
   }

   public void n() {
      this.p = new fdk.a(this.f);
      this.q = new fdk.b(this.f);
      this.r = new fdk.c(this.f);
   }

   public void D() {
      this.d((exg)exg.a(vf.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      exg $$0 = this.d((exg)exg.a(vf.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      exg $$1 = this.d((exg)exg.a(vf.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((exg)exg.a(ve.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.l().isEmpty()) {
         $$0.j = false;
      }

      if (this.r.l().isEmpty()) {
         $$1.j = false;
      }
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
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
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void E() {
      if (this.v) {
         this.n();
         this.D();
         this.a(this.p);
         this.v = false;
      }
   }

   @Override
   public boolean k() {
      return !this.v;
   }

   public void a(@Nullable eyc<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.d($$0);
         this.u = $$0;
      }
   }

   static String a(arz<ahg> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(ewu $$0, int $$1, int $$2, cmt $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.am_(), $$1 + 2, $$2 + 2);
   }

   void a(ewu $$0, int $$1, int $$2, ahg $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends eyc<fdk.a.a> {
      public a(evi $$0) {
         super($$0, fdk.this.g, fdk.this.h - 96, 32, 10);
         ObjectArrayList<arz<ahg>> $$1 = new ObjectArrayList(asc.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gfs.a(fdk.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            arz<ahg> $$2 = (arz<ahg>)var4.next();
            this.b(new fdk.a.a($$2));
         }
      }

      class a extends eyc.a<fdk.a.a> {
         private final arz<ahg> b;
         private final vf c;

         a(arz<ahg> $$0) {
            this.b = $$0;
            this.c = vf.c(fdk.a($$0));
         }

         private String b() {
            return this.b.a(fdk.this.t.a(this.b));
         }

         @Override
         public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fdk.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fdk.this.i, $$10, $$3 + 2 + 213 - fdk.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", vf.i().b(this.c).b(ve.u).f(this.b()));
         }
      }
   }

   class b extends eyc<fdk.b.a> {
      protected final List<asb<cwq>> a;
      protected final List<asb<cmt>> m;
      private final ahg[] t = new ahg[]{
         new ahg("statistics/block_mined"),
         new ahg("statistics/item_broken"),
         new ahg("statistics/item_crafted"),
         new ahg("statistics/item_used"),
         new ahg("statistics/item_picked_up"),
         new ahg("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fdk.b.a> o = new fdk.b.b();
      @Nullable
      protected asb<?> p;
      protected int q;

      public b(evi $$0) {
         super($$0, fdk.this.g, fdk.this.h - 96, 32, 20);
         this.a = Lists.newArrayList();
         this.a.add(asc.a);
         this.m = Lists.newArrayList(new asb[]{asc.d, asc.b, asc.c, asc.e, asc.f});
         this.a(true, 20);
         Set<cmt> $$1 = Sets.newIdentityHashSet();

         for (cmt $$2 : kd.h) {
            boolean $$3 = false;

            for (asb<cmt> $$4 : this.m) {
               if ($$4.a($$2) && fdk.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cwq $$5 : kd.e) {
            boolean $$6 = false;

            for (asb<cwq> $$7 : this.a) {
               if ($$7.a($$5) && fdk.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cnb.a);

         for (cmt $$8 : $$1) {
            this.b(new fdk.b.a($$8));
         }
      }

      @Override
      protected void a(ewu $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            ahg $$4 = this.n == $$3 ? fdk.c : fdk.k;
            fdk.this.a($$0, $$1 + fdk.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fdk.this.a(this.b(this.p)) - 36;
            ahg $$6 = this.q == 1 ? fdk.l : fdk.m;
            fdk.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fdk.this.a($$0, $$1 + fdk.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - fdk.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(ghv.a(ars.zu, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private asb<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(asb<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ewu $$0, int $$1, int $$2) {
         if ($$2 >= this.C() && $$2 <= this.E()) {
            fdk.b.a $$3 = this.t();
            int $$4 = (this.g - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cmt $$5 = $$3.b();
               $$0.a(fdk.this.i, this.a($$5), $$1, $$2);
            } else {
               vf $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fdk.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fdk.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected vf a(cmt $$0) {
         return $$0.p();
      }

      protected void a(asb<?> $$0) {
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

      class a extends eyc.a<fdk.b.a> {
         private final cmt b;

         a(cmt $$0) {
            this.b = $$0;
         }

         public cmt b() {
            return this.b;
         }

         @Override
         public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fdk.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fdk.this.q.a.size(); $$10++) {
               arz<cwq> $$11;
               if (this.b instanceof ckr) {
                  $$11 = fdk.this.q.a.get($$10).b(((ckr)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fdk.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fdk.this.q.m.size(); $$13++) {
               this.a($$0, fdk.this.q.m.get($$13).b(this.b), $$3 + fdk.this.a($$13 + fdk.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(ewu $$0, @Nullable arz<?> $$1, int $$2, int $$3, boolean $$4) {
            vf $$5 = (vf)($$1 == null ? fdk.o : vf.b($$1.a(fdk.this.t.a($$1))));
            $$0.b(fdk.this.i, $$5, $$2 - fdk.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<fdk.b.a> {
         public int a(fdk.b.a $$0, fdk.b.a $$1) {
            cmt $$2 = $$0.b();
            cmt $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               asb<cwq> $$6 = (asb<cwq>)b.this.p;
               $$4 = $$2 instanceof ckr ? fdk.this.t.a($$6, ((ckr)$$2).e()) : -1;
               $$5 = $$3 instanceof ckr ? fdk.this.t.a($$6, ((ckr)$$3).e()) : -1;
            } else {
               asb<cmt> $$9 = (asb<cmt>)b.this.p;
               $$4 = fdk.this.t.a($$9, $$2);
               $$5 = fdk.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cmt.a($$2), cmt.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends eyc<fdk.c.a> {
      public c(evi $$0) {
         super($$0, fdk.this.g, fdk.this.h - 96, 32, 9 * 4);

         for (blz<?> $$1 : kd.g) {
            if (fdk.this.t.a(asc.g.b($$1)) > 0 || fdk.this.t.a(asc.h.b($$1)) > 0) {
               this.b(new fdk.c.a($$1));
            }
         }
      }

      class a extends eyc.a<fdk.c.a> {
         private final vf b;
         private final vf c;
         private final boolean d;
         private final vf e;
         private final boolean f;

         public a(blz<?> $$0) {
            this.b = $$0.h();
            int $$1 = fdk.this.t.a(asc.g.b($$0));
            if ($$1 == 0) {
               this.c = vf.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = vf.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fdk.this.t.a(asc.h.b($$0));
            if ($$2 == 0) {
               this.e = vf.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = vf.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fdk.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fdk.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fdk.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", ve.a(this.c, this.e));
         }
      }
   }
}
