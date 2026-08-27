import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fdi extends fcz implements fdj {
   static final ahg c = new ahg("container/slot");
   static final ahg k = new ahg("statistics/header");
   static final ahg l = new ahg("statistics/sort_up");
   static final ahg m = new ahg("statistics/sort_down");
   private static final vf n = vf.c("multiplayer.downloadingStats");
   static final vf o = vf.c("stats.none");
   protected final fcz a;
   private fdi.a p;
   fdi.b q;
   private fdi.c r;
   final asc t;
   @Nullable
   private eya<?> u;
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

   public fdi(fcz $$0, asc $$1) {
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
      this.p = new fdi.a(this.f);
      this.q = new fdi.b(this.f);
      this.r = new fdi.c(this.f);
   }

   @Override
   public void C() {
      this.d((exe)exe.a(vf.c("stat.generalButton"), $$0x -> this.a(this.p)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      exe $$0 = this.d((exe)exe.a(vf.c("stat.itemsButton"), $$0x -> this.a(this.q)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      exe $$1 = this.d((exe)exe.a(vf.c("stat.mobsButton"), $$0x -> this.a(this.r)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((exe)exe.a(ve.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.q.l().isEmpty()) {
         $$0.j = false;
      }

      if (this.r.l().isEmpty()) {
         $$1.j = false;
      }
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
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
   public void b(ews $$0, int $$1, int $$2, float $$3) {
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

   public void a(@Nullable eya<?> $$0) {
      if (this.u != null) {
         this.f(this.u);
      }

      if ($$0 != null) {
         this.d($$0);
         this.u = $$0;
      }
   }

   static String a(ary<ahg> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(ews $$0, int $$1, int $$2, cms $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, c);
      $$0.b($$3.am_(), $$1 + 2, $$2 + 2);
   }

   void a(ews $$0, int $$1, int $$2, ahg $$3) {
      $$0.a($$3, $$1, $$2, 0, 18, 18);
   }

   class a extends eya<fdi.a.a> {
      public a(evg $$0) {
         super($$0, fdi.this.g, fdi.this.h - 96, 32, 10);
         ObjectArrayList<ary<ahg>> $$1 = new ObjectArrayList(asb.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gfq.a(fdi.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            ary<ahg> $$2 = (ary<ahg>)var4.next();
            this.b(new fdi.a.a($$2));
         }
      }

      class a extends eya.a<fdi.a.a> {
         private final ary<ahg> b;
         private final vf c;

         a(ary<ahg> $$0) {
            this.b = $$0;
            this.c = vf.c(fdi.a($$0));
         }

         private String b() {
            return this.b.a(fdi.this.t.a(this.b));
         }

         @Override
         public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fdi.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(fdi.this.i, $$10, $$3 + 2 + 213 - fdi.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", vf.i().b(this.c).b(ve.u).f(this.b()));
         }
      }
   }

   class b extends eya<fdi.b.a> {
      protected final List<asa<cwp>> a;
      protected final List<asa<cms>> m;
      private final ahg[] t = new ahg[]{
         new ahg("statistics/block_mined"),
         new ahg("statistics/item_broken"),
         new ahg("statistics/item_crafted"),
         new ahg("statistics/item_used"),
         new ahg("statistics/item_picked_up"),
         new ahg("statistics/item_dropped")
      };
      protected int n = -1;
      protected final Comparator<fdi.b.a> o = new fdi.b.b();
      @Nullable
      protected asa<?> p;
      protected int q;

      public b(evg $$0) {
         super($$0, fdi.this.g, fdi.this.h - 96, 32, 20);
         this.a = Lists.newArrayList();
         this.a.add(asb.a);
         this.m = Lists.newArrayList(new asa[]{asb.d, asb.b, asb.c, asb.e, asb.f});
         this.a(true, 20);
         Set<cms> $$1 = Sets.newIdentityHashSet();

         for (cms $$2 : kd.h) {
            boolean $$3 = false;

            for (asa<cms> $$4 : this.m) {
               if ($$4.a($$2) && fdi.this.t.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cwp $$5 : kd.e) {
            boolean $$6 = false;

            for (asa<cwp> $$7 : this.a) {
               if ($$7.a($$5) && fdi.this.t.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cna.a);

         for (cms $$8 : $$1) {
            this.b(new fdi.b.a($$8));
         }
      }

      @Override
      protected void a(ews $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.n = -1;
         }

         for (int $$3 = 0; $$3 < this.t.length; $$3++) {
            ahg $$4 = this.n == $$3 ? fdi.c : fdi.k;
            fdi.this.a($$0, $$1 + fdi.this.a($$3) - 18, $$2 + 1, $$4);
         }

         if (this.p != null) {
            int $$5 = fdi.this.a(this.b(this.p)) - 36;
            ahg $$6 = this.q == 1 ? fdi.l : fdi.m;
            fdi.this.a($$0, $$1 + $$5, $$2 + 1, $$6);
         }

         for (int $$7 = 0; $$7 < this.t.length; $$7++) {
            int $$8 = this.n == $$7 ? 1 : 0;
            fdi.this.a($$0, $$1 + fdi.this.a($$7) - 18 + $$8, $$2 + 1 + $$8, this.t[$$7]);
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
            int $$3 = $$0 - fdi.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.n = $$2;
               break;
            }
         }

         if (this.n >= 0) {
            this.a(this.a(this.n));
            this.c.ai().a(ght.a(arr.zu, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private asa<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(asa<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(ews $$0, int $$1, int $$2) {
         if ($$2 >= this.C() && $$2 <= this.E()) {
            fdi.b.a $$3 = this.t();
            int $$4 = (this.g - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cms $$5 = $$3.b();
               $$0.a(fdi.this.i, this.a($$5), $$1, $$2);
            } else {
               vf $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.t.length; $$8++) {
                  int $$9 = fdi.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).b();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fdi.this.i, $$6, $$1, $$2);
               }
            }
         }
      }

      protected vf a(cms $$0) {
         return $$0.p();
      }

      protected void a(asa<?> $$0) {
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

      class a extends eya.a<fdi.b.a> {
         private final cms b;

         a(cms $$0) {
            this.b = $$0;
         }

         public cms b() {
            return this.b;
         }

         @Override
         public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            fdi.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < fdi.this.q.a.size(); $$10++) {
               ary<cwp> $$11;
               if (this.b instanceof ckq) {
                  $$11 = fdi.this.q.a.get($$10).b(((ckq)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + fdi.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < fdi.this.q.m.size(); $$13++) {
               this.a($$0, fdi.this.q.m.get($$13).b(this.b), $$3 + fdi.this.a($$13 + fdi.this.q.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(ews $$0, @Nullable ary<?> $$1, int $$2, int $$3, boolean $$4) {
            vf $$5 = (vf)($$1 == null ? fdi.o : vf.b($$1.a(fdi.this.t.a($$1))));
            $$0.b(fdi.this.i, $$5, $$2 - fdi.this.i.a($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<fdi.b.a> {
         public int a(fdi.b.a $$0, fdi.b.a $$1) {
            cms $$2 = $$0.b();
            cms $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.p == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.p)) {
               asa<cwp> $$6 = (asa<cwp>)b.this.p;
               $$4 = $$2 instanceof ckq ? fdi.this.t.a($$6, ((ckq)$$2).e()) : -1;
               $$5 = $$3 instanceof ckq ? fdi.this.t.a($$6, ((ckq)$$3).e()) : -1;
            } else {
               asa<cms> $$9 = (asa<cms>)b.this.p;
               $$4 = fdi.this.t.a($$9, $$2);
               $$5 = fdi.this.t.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cms.a($$2), cms.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends eya<fdi.c.a> {
      public c(evg $$0) {
         super($$0, fdi.this.g, fdi.this.h - 96, 32, 9 * 4);

         for (bly<?> $$1 : kd.g) {
            if (fdi.this.t.a(asb.g.b($$1)) > 0 || fdi.this.t.a(asb.h.b($$1)) > 0) {
               this.b(new fdi.c.a($$1));
            }
         }
      }

      class a extends eya.a<fdi.c.a> {
         private final vf b;
         private final vf c;
         private final boolean d;
         private final vf e;
         private final boolean f;

         public a(bly<?> $$0) {
            this.b = $$0.h();
            int $$1 = fdi.this.t.a(asb.g.b($$0));
            if ($$1 == 0) {
               this.c = vf.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = vf.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = fdi.this.t.a(asb.h.b($$0));
            if ($$2 == 0) {
               this.e = vf.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = vf.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fdi.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(fdi.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(fdi.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", ve.a(this.c, this.e));
         }
      }
   }
}
