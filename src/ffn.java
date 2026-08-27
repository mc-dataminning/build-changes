import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class ffn extends ffe implements ffo {
   static final aiy c = new aiy("container/slot");
   static final aiy k = new aiy("statistics/header");
   static final aiy l = new aiy("statistics/sort_up");
   static final aiy m = new aiy("statistics/sort_down");
   private static final vq n = vq.c("multiplayer.downloadingStats");
   static final vq o = vq.c("stats.none");
   protected final ffe a;
   private ffn.a p;
   ffn.b q;
   private ffn.c r;
   final atv t;
   @Nullable
   private fad<?> u;
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

   public ffn(ffe $$0, atv $$1) {
      super(vq.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aQ_() {
      this.v = true;
      this.f.J().b(new afc(afc.a.b));
   }

   public void o() {
      this.p = new ffn.a(this.f);
      this.q = new ffn.b(this.f);
      this.r = new ffn.c(this.f);
   }

   public void E() {
      this.d((ezh)ezh.a(vq.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      ezh $$0 = this.d((ezh)ezh.a(vq.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      ezh $$1 = this.d((ezh)ezh.a(vq.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((ezh)ezh.a(vp.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.l().isEmpty()) {
         $$0.j = false;
      }

      if (this.r.l().isEmpty()) {
         $$1.j = false;
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
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
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
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

   public void a(@Nullable fad<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.d($$0);
         this.u = $$0;
      }
   }

   static String a(atr<aiy> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(eyu $$0, int $$1, int $$2, cou $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.ao_(), $$1 + 2, $$2 + 2);
   }

   void a(eyu $$0, int $$1, int $$2, aiy $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends fad<ffn.a.a> {
      public a(exh $$0) {
         super($$0, ffn.this.g, ffn.this.h - 96, 32, 10);
         ObjectArrayList<atr<aiy>> $$1 = new ObjectArrayList(atu.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> ghz.a(ffn.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            atr<aiy> $$2 = (atr<aiy>)var4.next();
            this.b(new ffn.a.a($$2));
         }
      }

      class a extends fad.a<ffn.a.a> {
         private final atr<aiy> b;
         private final vq c;

         a(atr<aiy> $$0) {
            this.b = $$0;
            this.c = vq.c(ffn.a($$0));
         }

         private String b() {
            return this.b.a(ffn.this.t.a(this.b));
         }

         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ffn.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(ffn.this.i, $$10, $$3 + 2 + 213 - ffn.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public vq a() {
            return vq.a("narrator.select", vq.i().b(this.c).b(vp.v).f(this.b()));
         }
      }
   }

   class b extends fad<ffn.b.a> {
      protected final List<att<cyo>> a;
      protected final List<att<cou>> m;
      private final aiy[] t = new aiy[]{
         new aiy("statistics/block_mined"),
         new aiy("statistics/item_broken"),
         new aiy("statistics/item_crafted"),
         new aiy("statistics/item_used"),
         new aiy("statistics/item_picked_up"),
         new aiy("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<ffn.b.a> o = new ffn.b.b();
      @Nullable
      protected att<?> p;
      protected int q;

      public b(exh $$0) {
         super($$0, ffn.this.g, ffn.this.h - 96, 32, 20);
         this.a = Lists.newArrayList();
         this.a.add(atu.a);
         this.m = Lists.newArrayList(new att[]{atu.d, atu.b, atu.c, atu.e, atu.f});
         this.a(true, 20);
         Set<cou> $$1 = Sets.newIdentityHashSet();

         for (cou $$2 : kf.h) {
            boolean $$3 = false;

            for (att<cou> $$4 : this.m) {
               if ($$4.a($$2) && ffn.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cyo $$5 : kf.e) {
            boolean $$6 = false;

            for (att<cyo> $$7 : this.a) {
               if ($$7.a($$5) && ffn.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.j());
            }
         }

         $$1.remove(cpc.a);

         for (cou $$8 : $$1) {
            this.b(new ffn.b.a($$8));
         }
      }

      @Override
      protected void a(eyu $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            aiy $$4 = this.n == $$3 ? ffn.c : ffn.k;
            ffn.this.a($$0, $$1 + ffn.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = ffn.this.a(this.b(this.p)) - 36;
            aiy $$6 = this.q == 1 ? ffn.l : ffn.m;
            ffn.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            ffn.this.a($$0, $$1 + ffn.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - ffn.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(gkc.a(atk.zJ, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private att<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(att<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(eyu $$0, int $$1, int $$2) {
         if ($$2 >= this.C() && $$2 <= this.E()) {
            ffn.b.a $$3 = this.t();
            int $$4 = (this.g - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cou $$5 = $$3.b();
               $$0.a(ffn.this.i, this.a($$5), $$1, $$2);
            } else {
               vq $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = ffn.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(ffn.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected vq a(cou $$0) {
         return $$0.o();
      }

      protected void a(att<?> $$0) {
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

      class a extends fad.a<ffn.b.a> {
         private final cou b;

         a(cou $$0) {
            this.b = $$0;
         }

         public cou b() {
            return this.b;
         }

         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ffn.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < ffn.this.q.a.size(); $$10++) {
               atr<cyo> $$11;
               if (this.b instanceof cms) {
                  $$11 = ffn.this.q.a.get($$10).b(((cms)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + ffn.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < ffn.this.q.m.size(); $$13++) {
               this.a($$0, ffn.this.q.m.get($$13).b(this.b), $$3 + ffn.this.a($$13 + ffn.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(eyu $$0, @Nullable atr<?> $$1, int $$2, int $$3, boolean $$4) {
            vq $$5 = (vq)($$1 == null ? ffn.o : vq.b($$1.a(ffn.this.t.a($$1))));
            $$0.b(ffn.this.i, $$5, $$2 - ffn.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public vq a() {
            return vq.a("narrator.select", this.b.o());
         }
      }

      class b implements Comparator<ffn.b.a> {
         public int a(ffn.b.a $$0, ffn.b.a $$1) {
            cou $$2 = $$0.b();
            cou $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               att<cyo> $$6 = (att<cyo>)b.this.p;
               $$4 = $$2 instanceof cms ? ffn.this.t.a($$6, ((cms)$$2).e()) : -1;
               $$5 = $$3 instanceof cms ? ffn.this.t.a($$6, ((cms)$$3).e()) : -1;
            } else {
               att<cou> $$9 = (att<cou>)b.this.p;
               $$4 = ffn.this.t.a($$9, $$2);
               $$5 = ffn.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cou.a($$2), cou.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fad<ffn.c.a> {
      public c(exh $$0) {
         super($$0, ffn.this.g, ffn.this.h - 96, 32, 9 * 4);

         for (bnu<?> $$1 : kf.g) {
            if (ffn.this.t.a(atu.g.b($$1)) > 0 || ffn.this.t.a(atu.h.b($$1)) > 0) {
               this.b(new ffn.c.a($$1));
            }
         }
      }

      class a extends fad.a<ffn.c.a> {
         private final vq b;
         private final vq c;
         private final boolean d;
         private final vq e;
         private final boolean f;

         public a(bnu<?> $$0) {
            this.b = $$0.h();
            int $$1 = ffn.this.t.a(atu.g.b($$0));
            if ($$1 == 0) {
               this.c = vq.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = vq.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = ffn.this.t.a(atu.h.b($$0));
            if ($$2 == 0) {
               this.e = vq.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = vq.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ffn.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(ffn.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(ffn.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public vq a() {
            return vq.a("narrator.select", vp.a(this.c, this.e));
         }
      }
   }
}
