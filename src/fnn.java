import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fnn extends fnj {
   private static final wu b = wu.c("gui.stats");
   static final akk c = new akk("container/slot");
   static final akk q = new akk("statistics/header");
   static final akk r = new akk("statistics/sort_up");
   static final akk s = new akk("statistics/sort_down");
   private static final wu u = wu.c("multiplayer.downloadingStats");
   static final wu v = wu.c("stats.none");
   private static final wu w = wu.c("stat.generalButton");
   private static final wu x = wu.c("stat.itemsButton");
   private static final wu y = wu.c("stat.mobsButton");
   protected final fnj a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private flf C = new flf(this, 33, 58);
   @Nullable
   private fnn.a D;
   @Nullable
   fnn.b E;
   @Nullable
   private fnn.c F;
   final avs G;
   @Nullable
   private fio<?> H;
   private boolean I = true;

   public fnn(fnj $$0, avs $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aP_() {
      this.C.c(new fih(this.o, u));
      this.l.L().b(new agm(agm.a.b));
   }

   public void m() {
      this.D = new fnn.a(this.l);
      this.E = new fnn.b(this.l);
      this.F = new fnn.c(this.l);
   }

   public void E() {
      flf $$0 = new flf(this, 33, 58);
      $$0.a(b, this.o);
      flj $$1 = $$0.b(flj.d()).a(5);
      $$1.c().b();
      flj $$2 = $$1.a(flj.e()).a(5);
      $$2.a(fhs.a(w, $$0x -> this.a(this.D)).a(120).a());
      fhs $$3 = $$2.a(fhs.a(x, $$0x -> this.a(this.E)).a(120).a());
      fhs $$4 = $$2.a(fhs.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fhs.a(wt.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aG_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aG_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      if (this.H != null) {
         this.H.a(this.m, this.C);
      }
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   public void F() {
      if (this.I) {
         this.m();
         this.a(this.D);
         this.E();
         this.aE_();
         this.I = false;
      }
   }

   @Override
   public boolean k() {
      return !this.I;
   }

   public void a(@Nullable fio<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(avo<akk> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fio<fnn.a.a> {
      public a(final fft $$0) {
         super($$0, fnn.this.m, fnn.this.n - 33 - 58, 33, 14);
         ObjectArrayList<avo<akk>> $$1 = new ObjectArrayList(avr.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gqu.a(fnn.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avo<akk> $$2 = (avo<akk>)var4.next();
            this.b(new fnn.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fio.a<fnn.a.a> {
         private final avo<akk> b;
         private final wu c;

         a(final avo<akk> $$0) {
            this.b = $$0;
            this.c = wu.c(fnn.a($$0));
         }

         private String b() {
            return this.b.a(fnn.this.G.a(this.b));
         }

         @Override
         public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fnn.this.o, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fnn.this.o, $$12, $$3 + $$4 - fnn.this.o.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", wu.i().b(this.c).b(wt.v).f(this.b()));
         }
      }
   }

   class b extends fio<fnn.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final akk[] z = new akk[]{
         new akk("statistics/block_mined"),
         new akk("statistics/item_broken"),
         new akk("statistics/item_crafted"),
         new akk("statistics/item_used"),
         new akk("statistics/item_picked_up"),
         new akk("statistics/item_dropped")
      };
      protected final List<avq<dfh>> a;
      protected final List<avq<ctx>> m;
      protected final Comparator<fnn.b.a> n = new fnn.b.b();
      @Nullable
      protected avq<?> o;
      protected int p = -1;
      protected int q;

      public b(final fft $$0) {
         super($$0, fnn.this.m, fnn.this.n - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avr.a);
         this.m = Lists.newArrayList(new avq[]{avr.d, avr.b, avr.c, avr.e, avr.f});
         this.a(true, 22);
         Set<ctx> $$1 = Sets.newIdentityHashSet();

         for (ctx $$2 : lq.g) {
            boolean $$3 = false;

            for (avq<ctx> $$4 : this.m) {
               if ($$4.a($$2) && fnn.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dfh $$5 : lq.e) {
            boolean $$6 = false;

            for (avq<dfh> $$7 : this.a) {
               if ($$7.a($$5) && fnn.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cuf.a);

         for (ctx $$8 : $$1) {
            this.b(new fnn.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fhf $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akk $$4 = this.p == $$3 ? fnn.c : fnn.q;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akk $$6 = this.q == 1 ? fnn.r : fnn.s;
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
            this.c.aj().a(gsx.a(avh.Ar, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avq<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avq<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fhf $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fnn.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               ctx $$5 = $$3.b();
               $$0.a(fnn.this.o, $$5.s(), $$1, $$2);
            } else {
               wu $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fnn.this.o, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avq<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aG_().sort(this.n);
      }

      class a extends fio.a<fnn.b.a> {
         private final ctx b;

         a(final ctx $$0) {
            this.b = $$0;
         }

         public ctx b() {
            return this.b;
         }

         @Override
         public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fnn.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fnn.this.E != null) {
               for (int $$10 = 0; $$10 < fnn.this.E.a.size(); $$10++) {
                  avo<dfh> $$12;
                  if (this.b instanceof csb $$11) {
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

         protected void a(fhf $$0, @Nullable avo<?> $$1, int $$2, int $$3, boolean $$4) {
            wu $$5 = (wu)($$1 == null ? fnn.v : wu.b($$1.a(fnn.this.G.a($$1))));
            $$0.b(fnn.this.o, $$5, $$2 - fnn.this.o.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fnn.b.a> {
         public int a(fnn.b.a $$0, fnn.b.a $$1) {
            ctx $$2 = $$0.b();
            ctx $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avq<dfh> $$6 = (avq<dfh>)b.this.o;
               $$4 = $$2 instanceof csb ? fnn.this.G.a($$6, ((csb)$$2).d()) : -1;
               $$5 = $$3 instanceof csb ? fnn.this.G.a($$6, ((csb)$$3).d()) : -1;
            } else {
               avq<ctx> $$9 = (avq<ctx>)b.this.o;
               $$4 = fnn.this.G.a($$9, $$2);
               $$5 = fnn.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(ctx.a($$2), ctx.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fio<fnn.c.a> {
      public c(final fft $$0) {
         super($$0, fnn.this.m, fnn.this.n - 33 - 58, 33, 9 * 4);

         for (bsm<?> $$1 : lq.f) {
            if (fnn.this.G.a(avr.g.b($$1)) > 0 || fnn.this.G.a(avr.h.b($$1)) > 0) {
               this.b(new fnn.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fio.a<fnn.c.a> {
         private final wu b;
         private final wu c;
         private final wu d;
         private final boolean e;
         private final boolean f;

         public a(final bsm<?> $$0) {
            this.b = $$0.h();
            int $$1 = fnn.this.G.a(avr.g.b($$0));
            if ($$1 == 0) {
               this.c = wu.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wu.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fnn.this.G.a(avr.h.b($$0));
            if ($$2 == 0) {
               this.d = wu.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wu.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fnn.this.o, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fnn.this.o, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fnn.this.o, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", wt.a(this.c, this.d));
         }
      }
   }
}
