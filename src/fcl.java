import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fcl extends fcc implements fcm {
   static final agt c = new agt("container/slot");
   static final agt k = new agt("statistics/header");
   static final agt l = new agt("statistics/sort_up");
   static final agt m = new agt("statistics/sort_down");
   private static final vb n = vb.c("multiplayer.downloadingStats");
   static final vb o = vb.c("stats.none");
   protected final fcc a;
   private fcl.a p;
   fcl.b q;
   private fcl.c r;
   final arn t;
   @Nullable
   private exd<?> u;
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

   public fcl(fcc $$0, arn $$1) {
      super(vb.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aP_() {
      this.v = true;
      this.f.I().b(new adh(adh.a.b));
   }

   public void l() {
      this.p = new fcl.a(this.f);
      this.q = new fcl.b(this.f);
      this.r = new fcl.c(this.f);
   }

   @Override
   public void C() {
      this.d((ewh)ewh.a(vb.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      ewh $$0 = this.d((ewh)ewh.a(vb.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      ewh $$1 = this.d((ewh)ewh.a(vb.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((ewh)ewh.a(va.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.r.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
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
   public void b(evw $$0, int $$1, int $$2, float $$3) {
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
   public exd<?> E() {
      return this.u;
   }

   public void a(@Nullable exd<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.e($$0);
         this.u = $$0;
      }
   }

   static String a(arj<agt> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(evw $$0, int $$1, int $$2, cmc $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.am_(), $$1 + 2, $$2 + 2);
   }

   void a(evw $$0, int $$1, int $$2, agt $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends exd<fcl.a.a> {
      public a(euk $$0) {
         super($$0, fcl.this.g, fcl.this.h, 32, fcl.this.h - 64, 10);
         ObjectArrayList<arj<agt>> $$1 = new ObjectArrayList(arm.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> geu.a(fcl.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            arj<agt> $$2 = (arj<agt>)var4.next();
            this.b(new fcl.a.a($$2));
         }
      }

      class a extends exd.a<fcl.a.a> {
         private final arj<agt> b;
         private final vb c;

         a(arj<agt> $$0) {
            this.b = $$0;
            this.c = vb.c(fcl.a($$0));
         }

         private String b() {
            return this.b.a(fcl.this.t.a(this.b));
         }

         @Override
         public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fcl.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fcl.this.i, $$10, $$3 + 2 + 213 - fcl.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public vb a() {
            return vb.a("narrator.select", vb.i().b(this.c).b(va.u).f(this.b()));
         }
      }
   }

   class b extends exd<fcl.b.a> {
      protected final List<arl<cvz>> a;
      protected final List<arl<cmc>> m;
      private final agt[] t = new agt[]{
         new agt("statistics/block_mined"),
         new agt("statistics/item_broken"),
         new agt("statistics/item_crafted"),
         new agt("statistics/item_used"),
         new agt("statistics/item_picked_up"),
         new agt("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fcl.b.a> o = new fcl.b.b();
      @Nullable
      protected arl<?> p;
      protected int q;

      public b(euk $$0) {
         super($$0, fcl.this.g, fcl.this.h, 32, fcl.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(arm.a);
         this.m = Lists.newArrayList(new arl[]{arm.d, arm.b, arm.c, arm.e, arm.f});
         this.a(true, 20);
         Set<cmc> $$1 = Sets.newIdentityHashSet();

         for (cmc $$2 : kb.h) {
            boolean $$3 = false;

            for (arl<cmc> $$4 : this.m) {
               if ($$4.a($$2) && fcl.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cvz $$5 : kb.e) {
            boolean $$6 = false;

            for (arl<cvz> $$7 : this.a) {
               if ($$7.a($$5) && fcl.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cmk.a);

         for (cmc $$8 : $$1) {
            this.b(new fcl.b.a($$8));
         }
      }

      @Override
      protected void a(evw $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            agt $$4 = this.n == $$3 ? fcl.c : fcl.k;
            fcl.this.a($$0, $$1 + fcl.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fcl.this.a(this.b(this.p)) - 36;
            agt $$6 = this.q == 1 ? fcl.l : fcl.m;
            fcl.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fcl.this.a($$0, $$1 + fcl.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - fcl.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ah().a(ggr.a(arc.zu, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private arl<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(arl<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(evw $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            fcl.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cmc $$5 = $$3.b();
               $$0.a(fcl.this.i, this.a($$5), $$1, $$2);
            } else {
               vb $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fcl.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fcl.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected vb a(cmc $$0) {
         return $$0.p();
      }

      protected void a(arl<?> $$0) {
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

      class a extends exd.a<fcl.b.a> {
         private final cmc b;

         a(cmc $$0) {
            this.b = $$0;
         }

         public cmc b() {
            return this.b;
         }

         @Override
         public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fcl.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fcl.this.q.a.size(); $$10++) {
               arj<cvz> $$11;
               if (this.b instanceof cka) {
                  $$11 = fcl.this.q.a.get($$10).b(((cka)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fcl.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fcl.this.q.m.size(); $$13++) {
               this.a($$0, fcl.this.q.m.get($$13).b(this.b), $$3 + fcl.this.a($$13 + fcl.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(evw $$0, @Nullable arj<?> $$1, int $$2, int $$3, boolean $$4) {
            vb $$5 = (vb)($$1 == null ? fcl.o : vb.b($$1.a(fcl.this.t.a($$1))));
            $$0.b(fcl.this.i, $$5, $$2 - fcl.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public vb a() {
            return vb.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<fcl.b.a> {
         public int a(fcl.b.a $$0, fcl.b.a $$1) {
            cmc $$2 = $$0.b();
            cmc $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               arl<cvz> $$6 = (arl<cvz>)b.this.p;
               $$4 = $$2 instanceof cka ? fcl.this.t.a($$6, ((cka)$$2).e()) : -1;
               $$5 = $$3 instanceof cka ? fcl.this.t.a($$6, ((cka)$$3).e()) : -1;
            } else {
               arl<cmc> $$9 = (arl<cmc>)b.this.p;
               $$4 = fcl.this.t.a($$9, $$2);
               $$5 = fcl.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cmc.a($$2), cmc.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends exd<fcl.c.a> {
      public c(euk $$0) {
         super($$0, fcl.this.g, fcl.this.h, 32, fcl.this.h - 64, 9 * 4);

         for (blj<?> $$1 : kb.g) {
            if (fcl.this.t.a(arm.g.b($$1)) > 0 || fcl.this.t.a(arm.h.b($$1)) > 0) {
               this.b(new fcl.c.a($$1));
            }
         }
      }

      class a extends exd.a<fcl.c.a> {
         private final vb b;
         private final vb c;
         private final boolean d;
         private final vb e;
         private final boolean f;

         public a(blj<?> $$0) {
            this.b = $$0.h();
            int $$1 = fcl.this.t.a(arm.g.b($$0));
            if ($$1 == 0) {
               this.c = vb.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = vb.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fcl.this.t.a(arm.h.b($$0));
            if ($$2 == 0) {
               this.e = vb.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = vb.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fcl.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fcl.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fcl.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public vb a() {
            return vb.a("narrator.select", va.a(this.c, this.e));
         }
      }
   }
}
