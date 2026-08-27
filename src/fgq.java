import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fgq extends fgh implements fgr {
   static final ajc c = new ajc("container/slot");
   static final ajc k = new ajc("statistics/header");
   static final ajc l = new ajc("statistics/sort_up");
   static final ajc m = new ajc("statistics/sort_down");
   private static final vs n = vs.c("multiplayer.downloadingStats");
   static final vs o = vs.c("stats.none");
   protected final fgh a;
   private fgq.a p;
   fgq.b q;
   private fgq.c r;
   final aua t;
   @Nullable
   private fbg<?> u;
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

   public fgq(fgh $$0, aua $$1) {
      super(vs.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aP_() {
      this.v = true;
      this.f.K().b(new aff(aff.a.b));
   }

   public void o() {
      this.p = new fgq.a(this.f);
      this.q = new fgq.b(this.f);
      this.r = new fgq.c(this.f);
   }

   public void E() {
      this.c((fak)fak.a(vs.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      fak $$0 = this.c((fak)fak.a(vs.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      fak $$1 = this.c((fak)fak.a(vs.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.c((fak)fak.a(vr.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.l().isEmpty()) {
         $$0.j = false;
      }

      if (this.r.l().isEmpty()) {
         $$1.j = false;
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
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
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
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

   public void a(@Nullable fbg<?> $$0) {
      if (this.u != null) {
         this.e(this.u);
      }

      if ($$0 != null) {
         this.c($$0);
         this.u = $$0;
      }
   }

   static String a(atw<ajc> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(ezx $$0, int $$1, int $$2, cpl $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.an_(), $$1 + 2, $$2 + 2);
   }

   void a(ezx $$0, int $$1, int $$2, ajc $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends fbg<fgq.a.a> {
      public a(eyk $$0) {
         super($$0, fgq.this.g, fgq.this.h - 96, 32, 10);
         ObjectArrayList<atw<ajc>> $$1 = new ObjectArrayList(atz.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gje.a(fgq.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            atw<ajc> $$2 = (atw<ajc>)var4.next();
            this.b(new fgq.a.a($$2));
         }
      }

      class a extends fbg.a<fgq.a.a> {
         private final atw<ajc> b;
         private final vs c;

         a(atw<ajc> $$0) {
            this.b = $$0;
            this.c = vs.c(fgq.a($$0));
         }

         private String b() {
            return this.b.a(fgq.this.t.a(this.b));
         }

         @Override
         public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fgq.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fgq.this.i, $$10, $$3 + 2 + 213 - fgq.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public vs a() {
            return vs.a("narrator.select", vs.i().b(this.c).b(vr.v).f(this.b()));
         }
      }
   }

   class b extends fbg<fgq.b.a> {
      protected final List<aty<czf>> a;
      protected final List<aty<cpl>> m;
      private final ajc[] t = new ajc[]{
         new ajc("statistics/block_mined"),
         new ajc("statistics/item_broken"),
         new ajc("statistics/item_crafted"),
         new ajc("statistics/item_used"),
         new ajc("statistics/item_picked_up"),
         new ajc("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fgq.b.a> o = new fgq.b.b();
      @Nullable
      protected aty<?> p;
      protected int q;

      public b(eyk $$0) {
         super($$0, fgq.this.g, fgq.this.h - 96, 32, 20);
         this.a = Lists.newArrayList();
         this.a.add(atz.a);
         this.m = Lists.newArrayList(new aty[]{atz.d, atz.b, atz.c, atz.e, atz.f});
         this.a(true, 20);
         Set<cpl> $$1 = Sets.newIdentityHashSet();

         for (cpl $$2 : kh.h) {
            boolean $$3 = false;

            for (aty<cpl> $$4 : this.m) {
               if ($$4.a($$2) && fgq.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (czf $$5 : kh.e) {
            boolean $$6 = false;

            for (aty<czf> $$7 : this.a) {
               if ($$7.a($$5) && fgq.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.l());
            }
         }

         $$1.remove(cpt.a);

         for (cpl $$8 : $$1) {
            this.b(new fgq.b.a($$8));
         }
      }

      @Override
      protected void a(ezx $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            ajc $$4 = this.n == $$3 ? fgq.c : fgq.k;
            fgq.this.a($$0, $$1 + fgq.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fgq.this.a(this.b(this.p)) - 36;
            ajc $$6 = this.q == 1 ? fgq.l : fgq.m;
            fgq.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fgq.this.a($$0, $$1 + fgq.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - fgq.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.aj().a(glh.a(atp.zK, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private aty<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(aty<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ezx $$0, int $$1, int $$2) {
         if ($$2 >= this.C() && $$2 <= this.E()) {
            fgq.b.a $$3 = this.t();
            int $$4 = (this.g - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cpl $$5 = $$3.b();
               $$0.a(fgq.this.i, this.a($$5), $$1, $$2);
            } else {
               vs $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fgq.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fgq.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected vs a(cpl $$0) {
         return $$0.q();
      }

      protected void a(aty<?> $$0) {
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

      class a extends fbg.a<fgq.b.a> {
         private final cpl b;

         a(cpl $$0) {
            this.b = $$0;
         }

         public cpl b() {
            return this.b;
         }

         @Override
         public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fgq.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fgq.this.q.a.size(); $$10++) {
               atw<czf> $$11;
               if (this.b instanceof cnl) {
                  $$11 = fgq.this.q.a.get($$10).b(((cnl)this.b).d());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fgq.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fgq.this.q.m.size(); $$13++) {
               this.a($$0, fgq.this.q.m.get($$13).b(this.b), $$3 + fgq.this.a($$13 + fgq.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(ezx $$0, @Nullable atw<?> $$1, int $$2, int $$3, boolean $$4) {
            vs $$5 = (vs)($$1 == null ? fgq.o : vs.b($$1.a(fgq.this.t.a($$1))));
            $$0.b(fgq.this.i, $$5, $$2 - fgq.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public vs a() {
            return vs.a("narrator.select", this.b.q());
         }
      }

      class b implements Comparator<fgq.b.a> {
         public int a(fgq.b.a $$0, fgq.b.a $$1) {
            cpl $$2 = $$0.b();
            cpl $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               aty<czf> $$6 = (aty<czf>)b.this.p;
               $$4 = $$2 instanceof cnl ? fgq.this.t.a($$6, ((cnl)$$2).d()) : -1;
               $$5 = $$3 instanceof cnl ? fgq.this.t.a($$6, ((cnl)$$3).d()) : -1;
            } else {
               aty<cpl> $$9 = (aty<cpl>)b.this.p;
               $$4 = fgq.this.t.a($$9, $$2);
               $$5 = fgq.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cpl.a($$2), cpl.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fbg<fgq.c.a> {
      public c(eyk $$0) {
         super($$0, fgq.this.g, fgq.this.h - 96, 32, 9 * 4);

         for (bol<?> $$1 : kh.g) {
            if (fgq.this.t.a(atz.g.b($$1)) > 0 || fgq.this.t.a(atz.h.b($$1)) > 0) {
               this.b(new fgq.c.a($$1));
            }
         }
      }

      class a extends fbg.a<fgq.c.a> {
         private final vs b;
         private final vs c;
         private final boolean d;
         private final vs e;
         private final boolean f;

         public a(bol<?> $$0) {
            this.b = $$0.h();
            int $$1 = fgq.this.t.a(atz.g.b($$0));
            if ($$1 == 0) {
               this.c = vs.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = vs.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fgq.this.t.a(atz.h.b($$0));
            if ($$2 == 0) {
               this.e = vs.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = vs.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fgq.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fgq.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fgq.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public vs a() {
            return vs.a("narrator.select", vr.a(this.c, this.e));
         }
      }
   }
}
