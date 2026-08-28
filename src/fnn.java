import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fnn extends fne {
   private static final xp b = xp.c("gui.stats");
   static final alf c = new alf("container/slot");
   static final alf d = new alf("statistics/header");
   static final alf r = new alf("statistics/sort_up");
   static final alf s = new alf("statistics/sort_down");
   private static final xp u = xp.c("multiplayer.downloadingStats");
   static final xp v = xp.c("stats.none");
   private static final xp w = xp.c("stat.generalButton");
   private static final xp x = xp.c("stat.itemsButton");
   private static final xp y = xp.c("stat.mobsButton");
   protected final fne a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fks C = new fks(this, 33, 58);
   @Nullable
   private fnn.a D;
   @Nullable
   fnn.b E;
   @Nullable
   private fnn.c F;
   final awl G;
   @Nullable
   private fib<?> H;
   private boolean I = true;

   public fnn(fne $$0, awl $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aM_() {
      this.C.c(new fhu(this.p, u));
      this.m.L().b(new ahh(ahh.a.b));
   }

   public void m() {
      this.D = new fnn.a(this.m);
      this.E = new fnn.b(this.m);
      this.F = new fnn.c(this.m);
   }

   public void E() {
      fks $$0 = new fks(this, 33, 58);
      $$0.a(b, this.p);
      fkw $$1 = $$0.b(fkw.d()).a(5);
      $$1.c().b();
      fkw $$2 = $$1.a(fkw.e()).a(5);
      $$2.a(fhf.a(w, $$0x -> this.a(this.D)).a(120).a());
      fhf $$3 = $$2.a(fhf.a(x, $$0x -> this.a(this.E)).a(120).a());
      fhf $$4 = $$2.a(fhf.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fhf.a(xo.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aD_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aD_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fhd var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      if (this.H != null) {
         this.H.a(this.n, this.C);
      }
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   public void F() {
      if (this.I) {
         this.m();
         this.a(this.D);
         this.E();
         this.aB_();
         this.I = false;
      }
   }

   @Override
   public boolean k() {
      return !this.I;
   }

   public void a(@Nullable fib<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(awh<alf> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fib<fnn.a.a> {
      public a(final ffg $$0) {
         super($$0, fnn.this.n, fnn.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awh<alf>> $$1 = new ObjectArrayList(awk.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gqg.a(fnn.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awh<alf> $$2 = (awh<alf>)var4.next();
            this.b(new fnn.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fib.a<fnn.a.a> {
         private final awh<alf> b;
         private final xp c;

         a(final awh<alf> $$0) {
            this.b = $$0;
            this.c = xp.c(fnn.a($$0));
         }

         private String b() {
            return this.b.a(fnn.this.G.a(this.b));
         }

         @Override
         public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fnn.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fnn.this.p, $$12, $$3 + $$4 - fnn.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", xp.i().b(this.c).b(xo.v).f(this.b()));
         }
      }
   }

   class b extends fib<fnn.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alf[] z = new alf[]{
         new alf("statistics/block_mined"),
         new alf("statistics/item_broken"),
         new alf("statistics/item_crafted"),
         new alf("statistics/item_used"),
         new alf("statistics/item_picked_up"),
         new alf("statistics/item_dropped")
      };
      protected final List<awj<dfa>> a;
      protected final List<awj<cul>> m;
      protected final Comparator<fnn.b.a> n = new fnn.b.b();
      @Nullable
      protected awj<?> o;
      protected int p = -1;
      protected int q;

      public b(final ffg $$0) {
         super($$0, fnn.this.n, fnn.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awk.a);
         this.m = Lists.newArrayList(new awj[]{awk.d, awk.b, awk.c, awk.e, awk.f});
         this.a(true, 22);
         Set<cul> $$1 = Sets.newIdentityHashSet();

         for (cul $$2 : lp.h) {
            boolean $$3 = false;

            for (awj<cul> $$4 : this.m) {
               if ($$4.a($$2) && fnn.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dfa $$5 : lp.e) {
            boolean $$6 = false;

            for (awj<dfa> $$7 : this.a) {
               if ($$7.a($$5) && fnn.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cut.a);

         for (cul $$8 : $$1) {
            this.b(new fnn.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fgs $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alf $$4 = this.p == $$3 ? fnn.c : fnn.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            alf $$6 = this.q == 1 ? fnn.r : fnn.s;
            $$0.a($$6, $$1 + $$5, $$2 + 1, 0, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 0, 18, 18);
         }
      }

      @Override
      public int b() {
         return 280;
      }

      @Override
      protected boolean a(int $$0, int $$1) {
         this.p = -1;

         for (int $$2 = 0; $$2 < this.z.length; $$2++) {
            int $$3 = $$0 - this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.p = $$2;
               break;
            }
         }

         if (this.p >= 0) {
            this.a(this.b(this.p));
            this.c.aj().a(gsj.a(awa.Ao, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awj<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awj<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fgs $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fnn.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cul $$5 = $$3.b();
               $$0.a(fnn.this.p, $$5.s(), $$1, $$2);
            } else {
               xp $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fnn.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awj<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aD_().sort(this.n);
      }

      class a extends fib.a<fnn.b.a> {
         private final cul b;

         a(final cul $$0) {
            this.b = $$0;
         }

         public cul b() {
            return this.b;
         }

         @Override
         public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fnn.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fnn.this.E != null) {
               for (int $$10 = 0; $$10 < fnn.this.E.a.size(); $$10++) {
                  awh<dfa> $$12;
                  if (this.b instanceof cso $$11) {
                     $$12 = fnn.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fnn.this.E.m.size(); $$14++) {
                  this.a($$0, fnn.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fnn.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fgs $$0, @Nullable awh<?> $$1, int $$2, int $$3, boolean $$4) {
            xp $$5 = (xp)($$1 == null ? fnn.v : xp.b($$1.a(fnn.this.G.a($$1))));
            $$0.b(fnn.this.p, $$5, $$2 - fnn.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fnn.b.a> {
         public int a(fnn.b.a $$0, fnn.b.a $$1) {
            cul $$2 = $$0.b();
            cul $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awj<dfa> $$6 = (awj<dfa>)b.this.o;
               $$4 = $$2 instanceof cso ? fnn.this.G.a($$6, ((cso)$$2).d()) : -1;
               $$5 = $$3 instanceof cso ? fnn.this.G.a($$6, ((cso)$$3).d()) : -1;
            } else {
               awj<cul> $$9 = (awj<cul>)b.this.o;
               $$4 = fnn.this.G.a($$9, $$2);
               $$5 = fnn.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cul.a($$2), cul.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fib<fnn.c.a> {
      public c(final ffg $$0) {
         super($$0, fnn.this.n, fnn.this.o - 33 - 58, 33, 9 * 4);

         for (btb<?> $$1 : lp.g) {
            if (fnn.this.G.a(awk.g.b($$1)) > 0 || fnn.this.G.a(awk.h.b($$1)) > 0) {
               this.b(new fnn.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fib.a<fnn.c.a> {
         private final xp b;
         private final xp c;
         private final xp d;
         private final boolean e;
         private final boolean f;

         public a(final btb<?> $$0) {
            this.b = $$0.h();
            int $$1 = fnn.this.G.a(awk.g.b($$0));
            if ($$1 == 0) {
               this.c = xp.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xp.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fnn.this.G.a(awk.h.b($$0));
            if ($$2 == 0) {
               this.d = xp.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xp.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fnn.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fnn.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fnn.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", xo.a(this.c, this.d));
         }
      }
   }
}
