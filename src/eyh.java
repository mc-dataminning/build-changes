import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class eyh extends exz implements eyi {
   static final aer c = new aer("container/slot");
   static final aer k = new aer("statistics/header");
   static final aer l = new aer("statistics/sort_up");
   static final aer m = new aer("statistics/sort_down");
   private static final tf n = tf.c("multiplayer.downloadingStats");
   protected final exz a;
   private eyh.a o;
   eyh.b p;
   private eyh.c q;
   final aph s;
   @Nullable
   private etd<?> t;
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

   public eyh(exz $$0, aph $$1) {
      super(tf.c("gui.stats"));
      this.a = $$0;
      this.s = $$1;
   }

   @Override
   protected void aE_() {
      this.u = true;
      this.f.J().b(new abh(abh.a.b));
   }

   public void l() {
      this.o = new eyh.a(this.f);
      this.p = new eyh.b(this.f);
      this.q = new eyh.c(this.f);
   }

   @Override
   public void B() {
      this.d((esh)esh.a(tf.c("stat.generalButton"), $$0x -> this.a(this.o)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      esh $$0 = this.d((esh)esh.a(tf.c("stat.itemsButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      esh $$1 = this.d((esh)esh.a(tf.c("stat.mobsButton"), $$0x -> this.a(this.q)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((esh)esh.a(te.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.p.i().isEmpty()) {
         $$0.i = false;
      }

      if (this.q.i().isEmpty()) {
         $$1.i = false;
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      if (this.u) {
         this.b($$0, $$1, $$2, $$3);
         $$0.a(this.i, n, this.g / 2, this.h / 2, 16777215);
         $$0.a(this.i, b[(int)(ac.b() / 150L % (long)b.length)], this.g / 2, this.h / 2 + 9 * 2, 16777215);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.D().a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      }
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void C() {
      if (this.u) {
         this.l();
         this.B();
         this.a(this.o);
         this.u = false;
      }
   }

   @Override
   public boolean j() {
      return !this.u;
   }

   @Nullable
   public etd<?> D() {
      return this.t;
   }

   public void a(@Nullable etd<?> $$0) {
      if (this.t != null) {
         this.f(this.t);
      }

      if ($$0 != null) {
         this.e($$0);
         this.t = $$0;
      }
   }

   static String a(apd<aer> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(erw $$0, int $$1, int $$2, cit $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.ae_(), $$1 + 2, $$2 + 2);
   }

   void a(erw $$0, int $$1, int $$2, aer $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends etd<eyh.a.a> {
      public a(eqm $$0) {
         super($$0, eyh.this.g, eyh.this.h, 32, eyh.this.h - 64, 10);
         ObjectArrayList<apd<aer>> $$1 = new ObjectArrayList(apg.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> fzr.a(eyh.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            apd<aer> $$2 = (apd<aer>)var4.next();
            this.b(new eyh.a.a($$2));
         }
      }

      class a extends etd.a<eyh.a.a> {
         private final apd<aer> b;
         private final tf c;

         a(apd<aer> $$0) {
            this.b = $$0;
            this.c = tf.c(eyh.a($$0));
         }

         private String b() {
            return this.b.a(eyh.this.s.a(this.b));
         }

         @Override
         public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyh.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(eyh.this.i, $$10, $$3 + 2 + 213 - eyh.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public tf a() {
            return tf.a("narrator.select", tf.h().b(this.c).b(te.u).f(this.b()));
         }
      }
   }

   class b extends etd<eyh.b.a> {
      protected final List<apf<csm>> a;
      protected final List<apf<cit>> m;
      private final aer[] t = new aer[]{
         new aer("statistics/block_mined"),
         new aer("statistics/item_broken"),
         new aer("statistics/item_crafted"),
         new aer("statistics/item_used"),
         new aer("statistics/item_picked_up"),
         new aer("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<eyh.b.a> o = new eyh.b.b();
      @Nullable
      protected apf<?> p;
      protected int q;

      public b(eqm $$0) {
         super($$0, eyh.this.g, eyh.this.h, 32, eyh.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(apg.a);
         this.m = Lists.newArrayList(new apf[]{apg.d, apg.b, apg.c, apg.e, apg.f});
         this.a(true, 20);
         Set<cit> $$1 = Sets.newIdentityHashSet();

         for (cit $$2 : jb.i) {
            boolean $$3 = false;

            for (apf<cit> $$4 : this.m) {
               if ($$4.a($$2) && eyh.this.s.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (csm $$5 : jb.f) {
            boolean $$6 = false;

            for (apf<csm> $$7 : this.a) {
               if ($$7.a($$5) && eyh.this.s.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cjb.a);

         for (cit $$8 : $$1) {
            this.b(new eyh.b.a($$8));
         }
      }

      @Override
      protected void a(erw $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            aer $$4 = this.n == $$3 ? eyh.c : eyh.k;
            eyh.this.a($$0, $$1 + eyh.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = eyh.this.a(this.b(this.p)) - 36;
            aer $$6 = this.q == 1 ? eyh.l : eyh.m;
            eyh.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            eyh.this.a($$0, $$1 + eyh.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - eyh.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(gbo.a(aow.yp, 1.0F));
         }
      }

      private apf<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(apf<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(erw $$0, int $$1, int $$2) {
         if ($$2 >= this.g && $$2 <= this.h) {
            eyh.b.a $$3 = this.r();
            int $$4 = (this.e - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cit $$5 = $$3.b();
               $$0.a(eyh.this.i, this.a($$5), $$1, $$2);
            } else {
               tf $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = eyh.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(eyh.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected tf a(cit $$0) {
         return $$0.p();
      }

      protected void a(apf<?> $$0) {
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

      class a extends etd.a<eyh.b.a> {
         private final cit b;

         a(cit $$0) {
            this.b = $$0;
         }

         public cit b() {
            return this.b;
         }

         @Override
         public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eyh.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < eyh.this.p.a.size(); $$10++) {
               apd<csm> $$11;
               if (this.b instanceof cgr) {
                  $$11 = eyh.this.p.a.get($$10).b(((cgr)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + eyh.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < eyh.this.p.m.size(); $$13++) {
               this.a($$0, eyh.this.p.m.get($$13).b(this.b), $$3 + eyh.this.a($$13 + eyh.this.p.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(erw $$0, @Nullable apd<?> $$1, int $$2, int $$3, boolean $$4) {
            String $$5 = $$1 == null ? "-" : $$1.a(eyh.this.s.a($$1));
            $$0.b(eyh.this.i, $$5, $$2 - eyh.this.i.b($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public tf a() {
            return tf.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<eyh.b.a> {
         public int a(eyh.b.a $$0, eyh.b.a $$1) {
            cit $$2 = $$0.b();
            cit $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               apf<csm> $$6 = (apf<csm>)b.this.p;
               $$4 = $$2 instanceof cgr ? eyh.this.s.a($$6, ((cgr)$$2).e()) : -1;
               $$5 = $$3 instanceof cgr ? eyh.this.s.a($$6, ((cgr)$$3).e()) : -1;
            } else {
               apf<cit> $$9 = (apf<cit>)b.this.p;
               $$4 = eyh.this.s.a($$9, $$2);
               $$5 = eyh.this.s.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cit.a($$2), cit.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends etd<eyh.c.a> {
      public c(eqm $$0) {
         super($$0, eyh.this.g, eyh.this.h, 32, eyh.this.h - 64, 9 * 4);

         for (bim<?> $$1 : jb.h) {
            if (eyh.this.s.a(apg.g.b($$1)) > 0 || eyh.this.s.a(apg.h.b($$1)) > 0) {
               this.b(new eyh.c.a($$1));
            }
         }
      }

      class a extends etd.a<eyh.c.a> {
         private final tf b;
         private final tf c;
         private final boolean d;
         private final tf e;
         private final boolean f;

         public a(bim<?> $$0) {
            this.b = $$0.h();
            int $$1 = eyh.this.s.a(apg.g.b($$0));
            if ($$1 == 0) {
               this.c = tf.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = tf.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = eyh.this.s.a(apg.h.b($$0));
            if ($$2 == 0) {
               this.e = tf.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = tf.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(eyh.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(eyh.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(eyh.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public tf a() {
            return tf.a("narrator.select", te.a(this.c, this.e));
         }
      }
   }
}
