import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fdc extends fct implements fdd {
   static final ahd c = new ahd("container/slot");
   static final ahd k = new ahd("statistics/header");
   static final ahd l = new ahd("statistics/sort_up");
   static final ahd m = new ahd("statistics/sort_down");
   private static final vd n = vd.c("multiplayer.downloadingStats");
   static final vd o = vd.c("stats.none");
   protected final fct a;
   private fdc.a p;
   fdc.b q;
   private fdc.c r;
   final arx t;
   @Nullable
   private exu<?> u;
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

   public fdc(fct $$0, arx $$1) {
      super(vd.c("gui.stats"));
      this.a = $$0;
      this.t = $$1;
   }

   @Override
   protected void aN_() {
      this.v = true;
      this.f.I().b(new adr(adr.a.b));
   }

   public void n() {
      this.p = new fdc.a(this.f);
      this.q = new fdc.b(this.f);
      this.r = new fdc.c(this.f);
   }

   @Override
   public void C() {
      this.d((ewy)ewy.a(vd.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      ewy $$0 = this.d((ewy)ewy.a(vd.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      ewy $$1 = this.d((ewy)ewy.a(vd.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((ewy)ewy.a(vc.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.l().isEmpty()) {
         $$0.j = false;
      }

      if (this.r.l().isEmpty()) {
         $$1.j = false;
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
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
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void D() {
      if (this.v) {
         this.n();
         this.C();
         this.a(this.p);
         this.v = false;
      }
   }

   @Override
   public boolean k() {
      return !this.v;
   }

   public void a(@Nullable exu<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.d($$0);
         this.u = $$0;
      }
   }

   static String a(art<ahd> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(ewm $$0, int $$1, int $$2, cmm $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.am_(), $$1 + 2, $$2 + 2);
   }

   void a(ewm $$0, int $$1, int $$2, ahd $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends exu<fdc.a.a> {
      public a(eva $$0) {
         super($$0, fdc.this.g, fdc.this.h - 96, 32, 10);
         ObjectArrayList<art<ahd>> $$1 = new ObjectArrayList(arw.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gfl.a(fdc.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            art<ahd> $$2 = (art<ahd>)var4.next();
            this.b(new fdc.a.a($$2));
         }
      }

      class a extends exu.a<fdc.a.a> {
         private final art<ahd> b;
         private final vd c;

         a(art<ahd> $$0) {
            this.b = $$0;
            this.c = vd.c(fdc.a($$0));
         }

         private String b() {
            return this.b.a(fdc.this.t.a(this.b));
         }

         @Override
         public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fdc.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fdc.this.i, $$10, $$3 + 2 + 213 - fdc.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public vd a() {
            return vd.a("narrator.select", vd.i().b(this.c).b(vc.u).f(this.b()));
         }
      }
   }

   class b extends exu<fdc.b.a> {
      protected final List<arv<cwj>> a;
      protected final List<arv<cmm>> m;
      private final ahd[] t = new ahd[]{
         new ahd("statistics/block_mined"),
         new ahd("statistics/item_broken"),
         new ahd("statistics/item_crafted"),
         new ahd("statistics/item_used"),
         new ahd("statistics/item_picked_up"),
         new ahd("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fdc.b.a> o = new fdc.b.b();
      @Nullable
      protected arv<?> p;
      protected int q;

      public b(eva $$0) {
         super($$0, fdc.this.g, fdc.this.h - 96, 32, 20);
         this.a = Lists.newArrayList();
         this.a.add(arw.a);
         this.m = Lists.newArrayList(new arv[]{arw.d, arw.b, arw.c, arw.e, arw.f});
         this.a(true, 20);
         Set<cmm> $$1 = Sets.newIdentityHashSet();

         for (cmm $$2 : kd.h) {
            boolean $$3 = false;

            for (arv<cmm> $$4 : this.m) {
               if ($$4.a($$2) && fdc.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cwj $$5 : kd.e) {
            boolean $$6 = false;

            for (arv<cwj> $$7 : this.a) {
               if ($$7.a($$5) && fdc.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cmu.a);

         for (cmm $$8 : $$1) {
            this.b(new fdc.b.a($$8));
         }
      }

      @Override
      protected void a(ewm $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            ahd $$4 = this.n == $$3 ? fdc.c : fdc.k;
            fdc.this.a($$0, $$1 + fdc.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fdc.this.a(this.b(this.p)) - 36;
            ahd $$6 = this.q == 1 ? fdc.l : fdc.m;
            fdc.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fdc.this.a($$0, $$1 + fdc.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - fdc.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ah().a(ghi.a(arm.zu, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private arv<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(arv<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ewm $$0, int $$1, int $$2) {
         if ($$2 >= this.C() && $$2 <= this.E()) {
            fdc.b.a $$3 = this.t();
            int $$4 = (this.g - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cmm $$5 = $$3.b();
               $$0.a(fdc.this.i, this.a($$5), $$1, $$2);
            } else {
               vd $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fdc.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fdc.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected vd a(cmm $$0) {
         return $$0.p();
      }

      protected void a(arv<?> $$0) {
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

      class a extends exu.a<fdc.b.a> {
         private final cmm b;

         a(cmm $$0) {
            this.b = $$0;
         }

         public cmm b() {
            return this.b;
         }

         @Override
         public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fdc.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fdc.this.q.a.size(); $$10++) {
               art<cwj> $$11;
               if (this.b instanceof ckk) {
                  $$11 = fdc.this.q.a.get($$10).b(((ckk)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fdc.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fdc.this.q.m.size(); $$13++) {
               this.a($$0, fdc.this.q.m.get($$13).b(this.b), $$3 + fdc.this.a($$13 + fdc.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(ewm $$0, @Nullable art<?> $$1, int $$2, int $$3, boolean $$4) {
            vd $$5 = (vd)($$1 == null ? fdc.o : vd.b($$1.a(fdc.this.t.a($$1))));
            $$0.b(fdc.this.i, $$5, $$2 - fdc.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public vd a() {
            return vd.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<fdc.b.a> {
         public int a(fdc.b.a $$0, fdc.b.a $$1) {
            cmm $$2 = $$0.b();
            cmm $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               arv<cwj> $$6 = (arv<cwj>)b.this.p;
               $$4 = $$2 instanceof ckk ? fdc.this.t.a($$6, ((ckk)$$2).e()) : -1;
               $$5 = $$3 instanceof ckk ? fdc.this.t.a($$6, ((ckk)$$3).e()) : -1;
            } else {
               arv<cmm> $$9 = (arv<cmm>)b.this.p;
               $$4 = fdc.this.t.a($$9, $$2);
               $$5 = fdc.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cmm.a($$2), cmm.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends exu<fdc.c.a> {
      public c(eva $$0) {
         super($$0, fdc.this.g, fdc.this.h - 96, 32, 9 * 4);

         for (blt<?> $$1 : kd.g) {
            if (fdc.this.t.a(arw.g.b($$1)) > 0 || fdc.this.t.a(arw.h.b($$1)) > 0) {
               this.b(new fdc.c.a($$1));
            }
         }
      }

      class a extends exu.a<fdc.c.a> {
         private final vd b;
         private final vd c;
         private final boolean d;
         private final vd e;
         private final boolean f;

         public a(blt<?> $$0) {
            this.b = $$0.h();
            int $$1 = fdc.this.t.a(arw.g.b($$0));
            if ($$1 == 0) {
               this.c = vd.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = vd.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fdc.this.t.a(arw.h.b($$0));
            if ($$2 == 0) {
               this.e = vd.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = vd.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fdc.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fdc.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fdc.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public vd a() {
            return vd.a("narrator.select", vc.a(this.c, this.e));
         }
      }
   }
}
