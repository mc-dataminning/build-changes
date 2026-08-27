import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fbd extends fau implements fbe {
   static final agi c = new agi("container/slot");
   static final agi k = new agi("statistics/header");
   static final agi l = new agi("statistics/sort_up");
   static final agi m = new agi("statistics/sort_down");
   private static final ur n = ur.c("multiplayer.downloadingStats");
   static final ur o = ur.c("stats.none");
   protected final fau a;
   private fbd.a p;
   fbd.b q;
   private fbd.c r;
   final arc t;
   @Nullable
   private evv<?> u;
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

   public fbd(fau $$0, arc $$1) {
      super(ur.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aP_() {
      this.v = true;
      this.f.I().b(new acw(acw.a.b));
   }

   public void l() {
      this.p = new fbd.a(this.f);
      this.q = new fbd.b(this.f);
      this.r = new fbd.c(this.f);
   }

   @Override
   public void C() {
      this.d((euz)euz.a(ur.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      euz $$0 = this.d((euz)euz.a(ur.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      euz $$1 = this.d((euz)euz.a(ur.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((euz)euz.a(uq.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.r.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
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
   public void b(euo $$0, int $$1, int $$2, float $$3) {
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
   public evv<?> E() {
      return this.u;
   }

   public void a(@Nullable evv<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.e($$0);
         this.u = $$0;
      }
   }

   static String a(aqy<agi> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(euo $$0, int $$1, int $$2, cle $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.al_(), $$1 + 2, $$2 + 2);
   }

   void a(euo $$0, int $$1, int $$2, agi $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends evv<fbd.a.a> {
      public a(etd $$0) {
         super($$0, fbd.this.g, fbd.this.h, 32, fbd.this.h - 64, 10);
         ObjectArrayList<aqy<agi>> $$1 = new ObjectArrayList(arb.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gda.a(fbd.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            aqy<agi> $$2 = (aqy<agi>)var4.next();
            this.b(new fbd.a.a($$2));
         }
      }

      class a extends evv.a<fbd.a.a> {
         private final aqy<agi> b;
         private final ur c;

         a(aqy<agi> $$0) {
            this.b = $$0;
            this.c = ur.c(fbd.a($$0));
         }

         private String b() {
            return this.b.a(fbd.this.t.a(this.b));
         }

         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fbd.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fbd.this.i, $$10, $$3 + 2 + 213 - fbd.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public ur a() {
            return ur.a("narrator.select", ur.i().b(this.c).b(uq.u).f(this.b()));
         }
      }
   }

   class b extends evv<fbd.b.a> {
      protected final List<ara<cva>> a;
      protected final List<ara<cle>> m;
      private final agi[] t = new agi[]{
         new agi("statistics/block_mined"),
         new agi("statistics/item_broken"),
         new agi("statistics/item_crafted"),
         new agi("statistics/item_used"),
         new agi("statistics/item_picked_up"),
         new agi("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fbd.b.a> o = new fbd.b.b();
      @Nullable
      protected ara<?> p;
      protected int q;

      public b(etd $$0) {
         super($$0, fbd.this.g, fbd.this.h, 32, fbd.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(arb.a);
         this.m = Lists.newArrayList(new ara[]{arb.d, arb.b, arb.c, arb.e, arb.f});
         this.a(true, 20);
         Set<cle> $$1 = Sets.newIdentityHashSet();

         for (cle $$2 : jy.i) {
            boolean $$3 = false;

            for (ara<cle> $$4 : this.m) {
               if ($$4.a($$2) && fbd.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cva $$5 : jy.f) {
            boolean $$6 = false;

            for (ara<cva> $$7 : this.a) {
               if ($$7.a($$5) && fbd.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(clm.a);

         for (cle $$8 : $$1) {
            this.b(new fbd.b.a($$8));
         }
      }

      @Override
      protected void a(euo $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            agi $$4 = this.n == $$3 ? fbd.c : fbd.k;
            fbd.this.a($$0, $$1 + fbd.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fbd.this.a(this.b(this.p)) - 36;
            agi $$6 = this.q == 1 ? fbd.l : fbd.m;
            fbd.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fbd.this.a($$0, $$1 + fbd.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - fbd.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ah().a(gex.a(aqr.yZ, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private ara<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(ara<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(euo $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            fbd.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cle $$5 = $$3.b();
               $$0.a(fbd.this.i, this.a($$5), $$1, $$2);
            } else {
               ur $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fbd.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fbd.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected ur a(cle $$0) {
         return $$0.p();
      }

      protected void a(ara<?> $$0) {
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

      class a extends evv.a<fbd.b.a> {
         private final cle b;

         a(cle $$0) {
            this.b = $$0;
         }

         public cle b() {
            return this.b;
         }

         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fbd.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fbd.this.q.a.size(); $$10++) {
               aqy<cva> $$11;
               if (this.b instanceof cjc) {
                  $$11 = fbd.this.q.a.get($$10).b(((cjc)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fbd.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fbd.this.q.m.size(); $$13++) {
               this.a($$0, fbd.this.q.m.get($$13).b(this.b), $$3 + fbd.this.a($$13 + fbd.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(euo $$0, @Nullable aqy<?> $$1, int $$2, int $$3, boolean $$4) {
            ur $$5 = (ur)($$1 == null ? fbd.o : ur.b($$1.a(fbd.this.t.a($$1))));
            $$0.b(fbd.this.i, $$5, $$2 - fbd.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public ur a() {
            return ur.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<fbd.b.a> {
         public int a(fbd.b.a $$0, fbd.b.a $$1) {
            cle $$2 = $$0.b();
            cle $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               ara<cva> $$6 = (ara<cva>)b.this.p;
               $$4 = $$2 instanceof cjc ? fbd.this.t.a($$6, ((cjc)$$2).e()) : -1;
               $$5 = $$3 instanceof cjc ? fbd.this.t.a($$6, ((cjc)$$3).e()) : -1;
            } else {
               ara<cle> $$9 = (ara<cle>)b.this.p;
               $$4 = fbd.this.t.a($$9, $$2);
               $$5 = fbd.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cle.a($$2), cle.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends evv<fbd.c.a> {
      public c(etd $$0) {
         super($$0, fbd.this.g, fbd.this.h, 32, fbd.this.h - 64, 9 * 4);

         for (bku<?> $$1 : jy.h) {
            if (fbd.this.t.a(arb.g.b($$1)) > 0 || fbd.this.t.a(arb.h.b($$1)) > 0) {
               this.b(new fbd.c.a($$1));
            }
         }
      }

      class a extends evv.a<fbd.c.a> {
         private final ur b;
         private final ur c;
         private final boolean d;
         private final ur e;
         private final boolean f;

         public a(bku<?> $$0) {
            this.b = $$0.h();
            int $$1 = fbd.this.t.a(arb.g.b($$0));
            if ($$1 == 0) {
               this.c = ur.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = ur.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fbd.this.t.a(arb.h.b($$0));
            if ($$2 == 0) {
               this.e = ur.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = ur.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fbd.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fbd.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fbd.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public ur a() {
            return ur.a("narrator.select", uq.a(this.c, this.e));
         }
      }
   }
}
