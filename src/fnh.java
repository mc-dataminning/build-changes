import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fnh extends fnd {
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
   protected final fnd a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private fkz C = new fkz(this, 33, 58);
   @Nullable
   private fnh.a D;
   @Nullable
   fnh.b E;
   @Nullable
   private fnh.c F;
   final avq G;
   @Nullable
   private fii<?> H;
   private boolean I = true;

   public fnh(fnd $$0, avq $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aO_() {
      this.C.c(new fib(this.o, u));
      this.l.L().b(new agm(agm.a.b));
   }

   public void m() {
      this.D = new fnh.a(this.l);
      this.E = new fnh.b(this.l);
      this.F = new fnh.c(this.l);
   }

   public void E() {
      fkz $$0 = new fkz(this, 33, 58);
      $$0.a(b, this.o);
      fld $$1 = $$0.b(fld.d()).a(5);
      $$1.c().b();
      fld $$2 = $$1.a(fld.e()).a(5);
      $$2.a(fhm.a(w, $$0x -> this.a(this.D)).a(120).a());
      fhm $$3 = $$2.a(fhm.a(x, $$0x -> this.a(this.E)).a(120).a());
      fhm $$4 = $$2.a(fhm.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fhm.a(wt.d, $$0x -> this.d()).a(200).a());
      if (this.E != null && this.E.aF_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aF_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fhk var10000 = this.c($$1x);
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
         this.aD_();
         this.I = false;
      }
   }

   @Override
   public boolean k() {
      return !this.I;
   }

   public void a(@Nullable fii<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(avm<akk> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fii<fnh.a.a> {
      public a(final ffn $$0) {
         super($$0, fnh.this.m, fnh.this.n - 33 - 58, 33, 14);
         ObjectArrayList<avm<akk>> $$1 = new ObjectArrayList(avp.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gqo.a(fnh.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            avm<akk> $$2 = (avm<akk>)var4.next();
            this.b(new fnh.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fii.a<fnh.a.a> {
         private final avm<akk> b;
         private final wu c;

         a(final avm<akk> $$0) {
            this.b = $$0;
            this.c = wu.c(fnh.a($$0));
         }

         private String b() {
            return this.b.a(fnh.this.G.a(this.b));
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fnh.this.o, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fnh.this.o, $$12, $$3 + $$4 - fnh.this.o.b($$12) - 4, $$10, $$11);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", wu.i().b(this.c).b(wt.v).f(this.b()));
         }
      }
   }

   class b extends fii<fnh.b.a> {
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
      protected final List<avo<dff>> a;
      protected final List<avo<ctv>> m;
      protected final Comparator<fnh.b.a> n = new fnh.b.b();
      @Nullable
      protected avo<?> o;
      protected int p = -1;
      protected int q;

      public b(final ffn $$0) {
         super($$0, fnh.this.m, fnh.this.n - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(avp.a);
         this.m = Lists.newArrayList(new avo[]{avp.d, avp.b, avp.c, avp.e, avp.f});
         this.a(true, 22);
         Set<ctv> $$1 = Sets.newIdentityHashSet();

         for (ctv $$2 : lq.g) {
            boolean $$3 = false;

            for (avo<ctv> $$4 : this.m) {
               if ($$4.a($$2) && fnh.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dff $$5 : lq.e) {
            boolean $$6 = false;

            for (avo<dff> $$7 : this.a) {
               if ($$7.a($$5) && fnh.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.r());
            }
         }

         $$1.remove(cud.a);

         for (ctv $$8 : $$1) {
            this.b(new fnh.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fgz $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            akk $$4 = this.p == $$3 ? fnh.c : fnh.q;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            akk $$6 = this.q == 1 ? fnh.r : fnh.s;
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
            this.c.aj().a(gsr.a(avf.Ar, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private avo<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(avo<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fgz $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fnh.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               ctv $$5 = $$3.b();
               $$0.a(fnh.this.o, $$5.s(), $$1, $$2);
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
                  $$0.a(fnh.this.o, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(avo<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aF_().sort(this.n);
      }

      class a extends fii.a<fnh.b.a> {
         private final ctv b;

         a(final ctv $$0) {
            this.b = $$0;
         }

         public ctv b() {
            return this.b;
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fnh.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.w(), $$3 + 1, $$2 + 1);
            if (fnh.this.E != null) {
               for (int $$10 = 0; $$10 < fnh.this.E.a.size(); $$10++) {
                  avm<dff> $$12;
                  if (this.b instanceof cry $$11) {
                     $$12 = fnh.this.E.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fnh.this.E.m.size(); $$14++) {
                  this.a($$0, fnh.this.E.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fnh.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fgz $$0, @Nullable avm<?> $$1, int $$2, int $$3, boolean $$4) {
            wu $$5 = (wu)($$1 == null ? fnh.v : wu.b($$1.a(fnh.this.G.a($$1))));
            $$0.b(fnh.this.o, $$5, $$2 - fnh.this.o.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", this.b.s());
         }
      }

      class b implements Comparator<fnh.b.a> {
         public int a(fnh.b.a $$0, fnh.b.a $$1) {
            ctv $$2 = $$0.b();
            ctv $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               avo<dff> $$6 = (avo<dff>)b.this.o;
               $$4 = $$2 instanceof cry ? fnh.this.G.a($$6, ((cry)$$2).d()) : -1;
               $$5 = $$3 instanceof cry ? fnh.this.G.a($$6, ((cry)$$3).d()) : -1;
            } else {
               avo<ctv> $$9 = (avo<ctv>)b.this.o;
               $$4 = fnh.this.G.a($$9, $$2);
               $$5 = fnh.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(ctv.a($$2), ctv.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fii<fnh.c.a> {
      public c(final ffn $$0) {
         super($$0, fnh.this.m, fnh.this.n - 33 - 58, 33, 9 * 4);

         for (bsj<?> $$1 : lq.f) {
            if (fnh.this.G.a(avp.g.b($$1)) > 0 || fnh.this.G.a(avp.h.b($$1)) > 0) {
               this.b(new fnh.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fii.a<fnh.c.a> {
         private final wu b;
         private final wu c;
         private final wu d;
         private final boolean e;
         private final boolean f;

         public a(final bsj<?> $$0) {
            this.b = $$0.h();
            int $$1 = fnh.this.G.a(avp.g.b($$0));
            if ($$1 == 0) {
               this.c = wu.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wu.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fnh.this.G.a(avp.h.b($$0));
            if ($$2 == 0) {
               this.d = wu.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wu.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fnh.this.o, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fnh.this.o, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fnh.this.o, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", wt.a(this.c, this.d));
         }
      }
   }
}
