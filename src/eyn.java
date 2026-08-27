import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eyn extends eyf implements eyo {
   static final aeu c = new aeu("container/slot");
   static final aeu k = new aeu("statistics/header");
   static final aeu l = new aeu("statistics/sort_up");
   static final aeu m = new aeu("statistics/sort_down");
   private static final ti n = ti.c("multiplayer.downloadingStats");
   protected final eyf a;
   private eyn.a o;
   eyn.b p;
   private eyn.c q;
   final apk s;
   @Nullable
   private eth<?> t;
   private boolean u = true;
   private static final int v = 18;
   private static final int w = 20;
   private static final int x = 1;
   private static final int y = 1;
   private static final int z = 2;
   private static final int A = 2;
   private static final int B = 40;
   private static final int C = 5;
   private static final int D = 0;
   private static final int E = -1;
   private static final int F = 1;

   public eyn(eyf $$0, apk $$1) {
      super(ti.c("gui.stats"));
      this.a = $$0;
      this.s = $$1;
   }

   @Override
   protected void aD_() {
      this.u = true;
      this.f.J().b(new abk(abk.a.b));
   }

   public void l() {
      this.o = new eyn.a(this.f);
      this.p = new eyn.b(this.f);
      this.q = new eyn.c(this.f);
   }

   @Override
   public void C() {
      this.d((esl)esl.a(ti.c("stat.generalButton"), $$0x -> this.a(this.o)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      esl $$0 = this.d((esl)esl.a(ti.c("stat.itemsButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      esl $$1 = this.d((esl)esl.a(ti.c("stat.mobsButton"), $$0x -> this.a(this.q)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((esl)esl.a(th.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.p.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.q.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      if (this.u) {
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
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void D() {
      if (this.u) {
         this.l();
         this.C();
         this.a(this.o);
         this.u = false;
      }
   }

   @Override
   public boolean j() {
      return !this.u;
   }

   @Nullable
   public eth<?> E() {
      return this.t;
   }

   public void a(@Nullable eth<?> $$0) {
      if (this.t != null) {
         this.f(this.t);
      }

      if ($$0 != null) {
         this.e($$0);
         this.t = $$0;
      }
   }

   static String a(apg<aeu> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(esa $$0, int $$1, int $$2, civ $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.ad_(), $$1 + 2, $$2 + 2);
   }

   void a(esa $$0, int $$1, int $$2, aeu $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends eth<eyn.a.a> {
      public a(eqq $$0) {
         super($$0, eyn.this.g, eyn.this.h, 32, eyn.this.h - 64, 10);
         ObjectArrayList<apg<aeu>> $$1 = new ObjectArrayList(apj.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gaf.a(eyn.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            apg<aeu> $$2 = (apg<aeu>)var4.next();
            this.b(new eyn.a.a($$2));
         }
      }

      class a extends eth.a<eyn.a.a> {
         private final apg<aeu> b;
         private final ti c;

         a(apg<aeu> $$0) {
            this.b = $$0;
            this.c = ti.c(eyn.a($$0));
         }

         private String b() {
            return this.b.a(eyn.this.s.a(this.b));
         }

         @Override
         public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyn.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(eyn.this.i, $$10, $$3 + 2 + 213 - eyn.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public ti a() {
            return ti.a("narrator.select", ti.h().b(this.c).b(th.u).f(this.b()));
         }
      }
   }

   class b extends eth<eyn.b.a> {
      protected final List<api<csq>> a;
      protected final List<api<civ>> m;
      private final aeu[] t = new aeu[]{
         new aeu("statistics/block_mined"),
         new aeu("statistics/item_broken"),
         new aeu("statistics/item_crafted"),
         new aeu("statistics/item_used"),
         new aeu("statistics/item_picked_up"),
         new aeu("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<eyn.b.a> o = new eyn.b.b();
      @Nullable
      protected api<?> p;
      protected int q;

      public b(eqq $$0) {
         super($$0, eyn.this.g, eyn.this.h, 32, eyn.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(apj.a);
         this.m = Lists.newArrayList(new api[]{apj.d, apj.b, apj.c, apj.e, apj.f});
         this.a(true, 20);
         Set<civ> $$1 = Sets.newIdentityHashSet();

         for (civ $$2 : jd.i) {
            boolean $$3 = false;

            for (api<civ> $$4 : this.m) {
               if ($$4.a($$2) && eyn.this.s.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (csq $$5 : jd.f) {
            boolean $$6 = false;

            for (api<csq> $$7 : this.a) {
               if ($$7.a($$5) && eyn.this.s.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cjd.a);

         for (civ $$8 : $$1) {
            this.b(new eyn.b.a($$8));
         }
      }

      @Override
      protected void a(esa $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            aeu $$4 = this.n == $$3 ? eyn.c : eyn.k;
            eyn.this.a($$0, $$1 + eyn.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = eyn.this.a(this.b(this.p)) - 36;
            aeu $$6 = this.q == 1 ? eyn.l : eyn.m;
            eyn.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            eyn.this.a($$0, $$1 + eyn.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - eyn.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(gcc.a(aoz.yu, 1.0F));
         }
      }

      private api<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(api<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(esa $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            eyn.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               civ $$5 = $$3.b();
               $$0.a(eyn.this.i, this.a($$5), $$1, $$2);
            } else {
               ti $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = eyn.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(eyn.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected ti a(civ $$0) {
         return $$0.p();
      }

      protected void a(api<?> $$0) {
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

      class a extends eth.a<eyn.b.a> {
         private final civ b;

         a(civ $$0) {
            this.b = $$0;
         }

         public civ b() {
            return this.b;
         }

         @Override
         public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eyn.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < eyn.this.p.a.size(); $$10++) {
               apg<csq> $$11;
               if (this.b instanceof cgt) {
                  $$11 = eyn.this.p.a.get($$10).b(((cgt)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + eyn.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < eyn.this.p.m.size(); $$13++) {
               this.a($$0, eyn.this.p.m.get($$13).b(this.b), $$3 + eyn.this.a($$13 + eyn.this.p.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(esa $$0, @Nullable apg<?> $$1, int $$2, int $$3, boolean $$4) {
            String $$5 = $$1 == null ? "-" : $$1.a(eyn.this.s.a($$1));
            $$0.b(eyn.this.i, $$5, $$2 - eyn.this.i.b($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public ti a() {
            return ti.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<eyn.b.a> {
         public int a(eyn.b.a $$0, eyn.b.a $$1) {
            civ $$2 = $$0.b();
            civ $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               api<csq> $$6 = (api<csq>)b.this.p;
               $$4 = $$2 instanceof cgt ? eyn.this.s.a($$6, ((cgt)$$2).e()) : -1;
               $$5 = $$3 instanceof cgt ? eyn.this.s.a($$6, ((cgt)$$3).e()) : -1;
            } else {
               api<civ> $$9 = (api<civ>)b.this.p;
               $$4 = eyn.this.s.a($$9, $$2);
               $$5 = eyn.this.s.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(civ.a($$2), civ.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends eth<eyn.c.a> {
      public c(eqq $$0) {
         super($$0, eyn.this.g, eyn.this.h, 32, eyn.this.h - 64, 9 * 4);

         for (bip<?> $$1 : jd.h) {
            if (eyn.this.s.a(apj.g.b($$1)) > 0 || eyn.this.s.a(apj.h.b($$1)) > 0) {
               this.b(new eyn.c.a($$1));
            }
         }
      }

      class a extends eth.a<eyn.c.a> {
         private final ti b;
         private final ti c;
         private final boolean d;
         private final ti e;
         private final boolean f;

         public a(bip<?> $$0) {
            this.b = $$0.h();
            int $$1 = eyn.this.s.a(apj.g.b($$0));
            if ($$1 == 0) {
               this.c = ti.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = ti.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = eyn.this.s.a(apj.h.b($$0));
            if ($$2 == 0) {
               this.e = ti.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = ti.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyn.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(eyn.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(eyn.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public ti a() {
            return ti.a("narrator.select", th.a(this.c, this.e));
         }
      }
   }
}
