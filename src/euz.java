import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class euz extends euq implements eva {
   private static final sw c = sw.c("multiplayer.downloadingStats");
   private static final acq k = new acq("textures/gui/container/stats_icons.png");
   protected final euq a;
   private euz.a l;
   euz.b m;
   private euz.c n;
   final ams o;
   @Nullable
   private eqc<?> p;
   private boolean q = true;
   private static final int r = 128;
   private static final int s = 18;
   private static final int t = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private static final int y = 40;
   private static final int z = 5;
   private static final int A = 0;
   private static final int C = -1;
   private static final int D = 1;

   public euz(euq $$0, ams $$1) {
      super(sw.c("gui.stats"));
      this.a = $$0;
      this.o = $$1;
   }

   @Override
   protected void b() {
      this.q = true;
      this.f.I().a(new zk(zk.a.b));
   }

   public void l() {
      this.l = new euz.a(this.f);
      this.m = new euz.b(this.f);
      this.n = new euz.c(this.f);
   }

   @Override
   public void B() {
      this.d((epi)epi.a(sw.c("stat.generalButton"), $$0x -> this.a(this.l)).a(this.g / 2 - 120, this.h - 52, 80, 20).a());
      epi $$0 = this.d((epi)epi.a(sw.c("stat.itemsButton"), $$0x -> this.a(this.m)).a(this.g / 2 - 40, this.h - 52, 80, 20).a());
      epi $$1 = this.d((epi)epi.a(sw.c("stat.mobsButton"), $$0x -> this.a(this.n)).a(this.g / 2 + 40, this.h - 52, 80, 20).a());
      this.d((epi)epi.a(sv.d, $$0x -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 28, 200, 20).a());
      if (this.m.i().isEmpty()) {
         $$0.r = false;
      }

      if (this.n.i().isEmpty()) {
         $$1.r = false;
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (this.q) {
         this.a($$0);
         $$0.a(this.i, c, this.g / 2, this.h / 2, 16777215);
         $$0.a(this.i, b[(int)(ac.b() / 150L % (long)b.length)], this.g / 2, this.h / 2 + 9 * 2, 16777215);
      } else {
         this.D().a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void C() {
      if (this.q) {
         this.l();
         this.B();
         this.a(this.l);
         this.q = false;
      }
   }

   @Override
   public boolean az_() {
      return !this.q;
   }

   @Nullable
   public eqc<?> D() {
      return this.p;
   }

   public void a(@Nullable eqc<?> $$0) {
      if (this.p != null) {
         this.f(this.p);
      }

      if ($$0 != null) {
         this.e($$0);
         this.p = $$0;
      }
   }

   static String a(amo<acq> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   int a(int $$0) {
      return 115 + 40 * $$0;
   }

   void a(eox $$0, int $$1, int $$2, cfu $$3) {
      this.a($$0, $$1 + 1, $$2 + 1, 0, 0);
      $$0.b($$3.ae_(), $$1 + 2, $$2 + 2);
   }

   void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      $$0.a(k, $$1, $$2, 0, (float)$$3, (float)$$4, 18, 18, 128, 128);
   }

   class a extends eqc<euz.a.a> {
      public a(enn $$0) {
         super($$0, euz.this.g, euz.this.h, 32, euz.this.h - 64, 10);
         ObjectArrayList<amo<acq>> $$1 = new ObjectArrayList(amr.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> fvz.a(euz.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            amo<acq> $$2 = (amo<acq>)var4.next();
            this.b(new euz.a.a($$2));
         }
      }

      @Override
      protected void a(eox $$0) {
         euz.this.a($$0);
      }

      class a extends eqc.a<euz.a.a> {
         private final amo<acq> b;
         private final sw c;

         a(amo<acq> $$0) {
            this.b = $$0;
            this.c = sw.c(euz.a($$0));
         }

         private String b() {
            return this.b.a(euz.this.o.a(this.b));
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(euz.this.i, this.c, $$3 + 2, $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
            String $$10 = this.b();
            $$0.b(euz.this.i, $$10, $$3 + 2 + 213 - euz.this.i.b($$10), $$2 + 1, $$1 % 2 == 0 ? 16777215 : 9474192);
         }

         @Override
         public sw a() {
            return sw.a("narrator.select", sw.h().b(this.c).b(sv.t).f(this.b()));
         }
      }
   }

   class b extends eqc<euz.b.a> {
      protected final List<amq<cpn>> a;
      protected final List<amq<cfu>> l;
      private final int[] r = new int[]{3, 4, 1, 2, 5, 6};
      protected int m = -1;
      protected final Comparator<euz.b.a> n = new euz.b.b();
      @Nullable
      protected amq<?> o;
      protected int p;

      public b(enn $$0) {
         super($$0, euz.this.g, euz.this.h, 32, euz.this.h - 64, 20);
         this.a = Lists.newArrayList();
         this.a.add(amr.a);
         this.l = Lists.newArrayList(new amq[]{amr.d, amr.b, amr.c, amr.e, amr.f});
         this.a(true, 20);
         Set<cfu> $$1 = Sets.newIdentityHashSet();

         for (cfu $$2 : jb.i) {
            boolean $$3 = false;

            for (amq<cfu> $$4 : this.l) {
               if ($$4.a($$2) && euz.this.o.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (cpn $$5 : jb.f) {
            boolean $$6 = false;

            for (amq<cpn> $$7 : this.a) {
               if ($$7.a($$5) && euz.this.o.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.k());
            }
         }

         $$1.remove(cgc.a);

         for (cfu $$8 : $$1) {
            this.b(new euz.b.a($$8));
         }
      }

      @Override
      protected void a(eox $$0, int $$1, int $$2) {
         if (!this.b.n.b()) {
            this.m = -1;
         }

         for (int $$3 = 0; $$3 < this.r.length; $$3++) {
            euz.this.a($$0, $$1 + euz.this.a($$3) - 18, $$2 + 1, 0, this.m == $$3 ? 0 : 18);
         }

         if (this.o != null) {
            int $$4 = euz.this.a(this.b(this.o)) - 36;
            int $$5 = this.p == 1 ? 2 : 1;
            euz.this.a($$0, $$1 + $$4, $$2 + 1, 18 * $$5, 0);
         }

         for (int $$6 = 0; $$6 < this.r.length; $$6++) {
            int $$7 = this.m == $$6 ? 1 : 0;
            euz.this.a($$0, $$1 + euz.this.a($$6) - 18 + $$7, $$2 + 1 + $$7, 18 * this.r[$$6], 18);
         }
      }

      @Override
      public int b() {
         return 375;
      }

      @Override
      protected int c() {
         return this.d / 2 + 140;
      }

      @Override
      protected void a(eox $$0) {
         euz.this.a($$0);
      }

      @Override
      protected void a(int $$0, int $$1) {
         this.m = -1;

         for (int $$2 = 0; $$2 < this.r.length; $$2++) {
            int $$3 = $$0 - euz.this.a($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.m = $$2;
               break;
            }
         }

         if (this.m >= 0) {
            this.a(this.a(this.m));
            this.b.ah().a(fxt.a(amh.yo, 1.0F));
         }
      }

      private amq<?> a(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.l.get($$0 - this.a.size());
      }

      private int b(amq<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.l.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(eox $$0, int $$1, int $$2) {
         if ($$2 >= this.f && $$2 <= this.g) {
            euz.b.a $$3 = this.r();
            int $$4 = (this.d - this.b()) / 2;
            if ($$3 != null) {
               if ($$1 < $$4 + 40 || $$1 > $$4 + 40 + 20) {
                  return;
               }

               cfu $$5 = $$3.b();
               this.a($$0, this.a($$5), $$1, $$2);
            } else {
               sw $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.r.length; $$8++) {
                  int $$9 = euz.this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.a($$8).c();
                     break;
                  }
               }

               this.a($$0, $$6, $$1, $$2);
            }
         }
      }

      protected void a(eox $$0, @Nullable sw $$1, int $$2, int $$3) {
         if ($$1 != null) {
            int $$4 = $$2 + 12;
            int $$5 = $$3 - 12;
            int $$6 = euz.this.i.a($$1);
            $$0.b($$4 - 3, $$5 - 3, $$4 + $$6 + 3, $$5 + 8 + 3, -1073741824, -1073741824);
            $$0.c().a();
            $$0.c().a(0.0F, 0.0F, 400.0F);
            $$0.b(euz.this.i, $$1, $$4, $$5, -1);
            $$0.c().b();
         }
      }

      protected sw a(cfu $$0) {
         return $$0.p();
      }

      protected void a(amq<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.p = -1;
         } else if (this.p == -1) {
            this.p = 1;
         } else {
            this.o = null;
            this.p = 0;
         }

         this.i().sort(this.n);
      }

      class a extends eqc.a<euz.b.a> {
         private final cfu b;

         a(cfu $$0) {
            this.b = $$0;
         }

         public cfu b() {
            return this.b;
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            euz.this.a($$0, $$3 + 40, $$2, this.b);

            for (int $$10 = 0; $$10 < euz.this.m.a.size(); $$10++) {
               amo<cpn> $$11;
               if (this.b instanceof cds) {
                  $$11 = euz.this.m.a.get($$10).b(((cds)this.b).e());
               } else {
                  $$11 = null;
               }

               this.a($$0, $$11, $$3 + euz.this.a($$10), $$2, $$1 % 2 == 0);
            }

            for (int $$13 = 0; $$13 < euz.this.m.l.size(); $$13++) {
               this.a($$0, euz.this.m.l.get($$13).b(this.b), $$3 + euz.this.a($$13 + euz.this.m.a.size()), $$2, $$1 % 2 == 0);
            }
         }

         protected void a(eox $$0, @Nullable amo<?> $$1, int $$2, int $$3, boolean $$4) {
            String $$5 = $$1 == null ? "-" : $$1.a(euz.this.o.a($$1));
            $$0.b(euz.this.i, $$5, $$2 - euz.this.i.b($$5), $$3 + 5, $$4 ? 16777215 : 9474192);
         }

         @Override
         public sw a() {
            return sw.a("narrator.select", this.b.p());
         }
      }

      class b implements Comparator<euz.b.a> {
         public int a(euz.b.a $$0, euz.b.a $$1) {
            cfu $$2 = $$0.b();
            cfu $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               amq<cpn> $$6 = (amq<cpn>)b.this.o;
               $$4 = $$2 instanceof cds ? euz.this.o.a($$6, ((cds)$$2).e()) : -1;
               $$5 = $$3 instanceof cds ? euz.this.o.a($$6, ((cds)$$3).e()) : -1;
            } else {
               amq<cfu> $$9 = (amq<cfu>)b.this.o;
               $$4 = euz.this.o.a($$9, $$2);
               $$5 = euz.this.o.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.p * Integer.compare(cfu.a($$2), cfu.a($$3)) : b.this.p * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends eqc<euz.c.a> {
      public c(enn $$0) {
         super($$0, euz.this.g, euz.this.h, 32, euz.this.h - 64, 9 * 4);

         for (bfn<?> $$1 : jb.h) {
            if (euz.this.o.a(amr.g.b($$1)) > 0 || euz.this.o.a(amr.h.b($$1)) > 0) {
               this.b(new euz.c.a($$1));
            }
         }
      }

      @Override
      protected void a(eox $$0) {
         euz.this.a($$0);
      }

      class a extends eqc.a<euz.c.a> {
         private final sw b;
         private final sw c;
         private final boolean d;
         private final sw e;
         private final boolean f;

         public a(bfn<?> $$0) {
            this.b = $$0.h();
            int $$1 = euz.this.o.a(amr.g.b($$0));
            if ($$1 == 0) {
               this.c = sw.a("stat_type.minecraft.killed.none", this.b);
               this.d = false;
            } else {
               this.c = sw.a("stat_type.minecraft.killed", $$1, this.b);
               this.d = true;
            }

            int $$2 = euz.this.o.a(amr.h.b($$0));
            if ($$2 == 0) {
               this.e = sw.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.e = sw.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(euz.this.i, this.b, $$3 + 2, $$2 + 1, 16777215);
            $$0.b(euz.this.i, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.d ? 9474192 : 6316128);
            $$0.b(euz.this.i, this.e, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? 9474192 : 6316128);
         }

         @Override
         public sw a() {
            return sw.a("narrator.select", sv.a(this.c, this.e));
         }
      }
   }
}
