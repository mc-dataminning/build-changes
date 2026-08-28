import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fqh extends fqd {
   private static final xd b = xd.c("gui.stats");
   static final alc c = alc.b("container/slot");
   static final alc d = alc.b("statistics/header");
   static final alc s = alc.b("statistics/sort_up");
   static final alc u = alc.b("statistics/sort_down");
   private static final xd v = xd.c("multiplayer.downloadingStats");
   static final xd w = xd.c("stats.none");
   private static final xd x = xd.c("stat.generalButton");
   private static final xd y = xd.c("stat.itemsButton");
   private static final xd z = xd.c("stat.mobsButton");
   protected final fqd a;
   private static final int A = 280;
   private static final int B = 5;
   private static final int C = 58;
   private fny D = new fny(this, 33, 58);
   @Nullable
   private fqh.a E;
   @Nullable
   fqh.b F;
   @Nullable
   private fqh.c G;
   final awp H;
   @Nullable
   private flg<?> I;
   private boolean J = true;

   public fqh(fqd $$0, awp $$1) {
      super(b);
      this.a = $$0;
      this.H = $$1;
   }

   @Override
   protected void aR_() {
      this.D.c(new fkz(this.p, v));
      this.m.L().b(new ahb(ahb.a.b));
   }

   public void m() {
      this.E = new fqh.a(this.m);
      this.F = new fqh.b(this.m);
      this.G = new fqh.c(this.m);
   }

   public void D() {
      fny $$0 = new fny(this, 33, 58);
      $$0.a(b, this.p);
      foc $$1 = $$0.b(foc.d()).a(5);
      $$1.c().b();
      foc $$2 = $$1.a(foc.e()).a(5);
      $$2.a(fkk.a(x, $$0x -> this.a(this.E)).a(120).a());
      fkk $$3 = $$2.a(fkk.a(y, $$0x -> this.a(this.F)).a(120).a());
      fkk $$4 = $$2.a(fkk.a(z, $$0x -> this.a(this.G)).a(120).a());
      $$1.a(fkk.a(xc.d, $$0x -> this.d()).a(200).a());
      if (this.F != null && this.F.aI_().isEmpty()) {
         $$3.j = false;
      }

      if (this.G != null && this.G.aI_().isEmpty()) {
         $$4.j = false;
      }

      this.D = $$0;
      this.D.a($$1x -> {
         fki var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      if (this.I != null) {
         this.I.a(this.n, this.D);
      }
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   public void E() {
      if (this.J) {
         this.m();
         this.a(this.E);
         this.D();
         this.aG_();
         this.J = false;
      }
   }

   @Override
   public boolean k() {
      return !this.J;
   }

   public void a(@Nullable flg<?> $$0) {
      if (this.I != null) {
         this.e(this.I);
      }

      if ($$0 != null) {
         this.c($$0);
         this.I = $$0;
         this.c();
      }
   }

   static String a(awl<alc> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends flg<fqh.a.a> {
      public a(final fil $$0) {
         super($$0, fqh.this.n, fqh.this.o - 33 - 58, 33, 14);
         ObjectArrayList<awl<alc>> $$1 = new ObjectArrayList(awo.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gyi.a(fqh.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            awl<alc> $$2 = (awl<alc>)var4.next();
            this.b(new fqh.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends flg.a<fqh.a.a> {
         private final awl<alc> b;
         private final xd c;

         a(final awl<alc> $$0) {
            this.b = $$0;
            this.c = xd.c(fqh.a($$0));
         }

         private String b() {
            return this.b.a(fqh.this.H.a(this.b));
         }

         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(fqh.this.p, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(fqh.this.p, $$12, $$3 + $$4 - fqh.this.p.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", xd.i().b(this.c).b(xc.v).f(this.b()));
         }
      }
   }

   class b extends flg<fqh.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final alc[] z = new alc[]{
         alc.b("statistics/block_mined"),
         alc.b("statistics/item_broken"),
         alc.b("statistics/item_crafted"),
         alc.b("statistics/item_used"),
         alc.b("statistics/item_picked_up"),
         alc.b("statistics/item_dropped")
      };
      protected final List<awn<dhj>> a;
      protected final List<awn<cvk>> m;
      protected final Comparator<fqh.b.a> n = new fqh.b.b();
      @Nullable
      protected awn<?> o;
      protected int p = -1;
      protected int q;

      public b(final fil $$0) {
         super($$0, fqh.this.n, fqh.this.o - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(awo.a);
         this.m = Lists.newArrayList(new awn[]{awo.d, awo.b, awo.c, awo.e, awo.f});
         this.a(true, 22);
         Set<cvk> $$1 = Sets.newIdentityHashSet();

         for (cvk $$2 : lu.g) {
            boolean $$3 = false;

            for (awn<cvk> $$4 : this.m) {
               if ($$4.a($$2) && fqh.this.H.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dhj $$5 : lu.e) {
            boolean $$6 = false;

            for (awn<dhj> $$7 : this.a) {
               if ($$7.a($$5) && fqh.this.H.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.q());
            }
         }

         $$1.remove(cvt.a);

         for (cvk $$8 : $$1) {
            this.b(new fqh.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fjx $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            alc $$4 = this.p == $$3 ? fqh.c : fqh.d;
            $$0.a(ghq::B, $$4, $$1 + this.a($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            alc $$6 = this.q == 1 ? fqh.s : fqh.u;
            $$0.a(ghq::B, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(ghq::B, this.z[$$7], $$1 + this.a($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
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
            this.c.ak().a(haq.a(awe.Ax, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private awn<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(awn<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fjx $$0, int $$1, int $$2) {
         if ($$2 >= this.E() && $$2 <= this.G()) {
            fqh.b.a $$3 = this.v();
            int $$4 = this.s();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cvk $$5 = $$3.b();
               $$0.a(fqh.this.p, $$5.r(), $$1, $$2);
            } else {
               xd $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fqh.this.p, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(awn<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aI_().sort(this.n);
      }

      class a extends flg.a<fqh.b.a> {
         private final cvk b;

         a(final cvk $$0) {
            this.b = $$0;
         }

         public cvk b() {
            return this.b;
         }

         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(ghq::B, fqh.c, $$3, $$2, 18, 18);
            $$0.b(this.b.v(), $$3 + 1, $$2 + 1);
            if (fqh.this.F != null) {
               for (int $$10 = 0; $$10 < fqh.this.F.a.size(); $$10++) {
                  awl<dhj> $$12;
                  if (this.b instanceof ctr $$11) {
                     $$12 = fqh.this.F.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fqh.this.F.m.size(); $$14++) {
                  this.a($$0, fqh.this.F.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fqh.this.F.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fjx $$0, @Nullable awl<?> $$1, int $$2, int $$3, boolean $$4) {
            xd $$5 = (xd)($$1 == null ? fqh.w : xd.b($$1.a(fqh.this.H.a($$1))));
            $$0.b(fqh.this.p, $$5, $$2 - fqh.this.p.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", this.b.r());
         }
      }

      class b implements Comparator<fqh.b.a> {
         public int a(fqh.b.a $$0, fqh.b.a $$1) {
            cvk $$2 = $$0.b();
            cvk $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               awn<dhj> $$6 = (awn<dhj>)b.this.o;
               $$4 = $$2 instanceof ctr ? fqh.this.H.a($$6, ((ctr)$$2).d()) : -1;
               $$5 = $$3 instanceof ctr ? fqh.this.H.a($$6, ((ctr)$$3).d()) : -1;
            } else {
               awn<cvk> $$9 = (awn<cvk>)b.this.o;
               $$4 = fqh.this.H.a($$9, $$2);
               $$5 = fqh.this.H.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cvk.a($$2), cvk.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends flg<fqh.c.a> {
      public c(final fil $$0) {
         super($$0, fqh.this.n, fqh.this.o - 33 - 58, 33, 9 * 4);

         for (btv<?> $$1 : lu.f) {
            if (fqh.this.H.a(awo.g.b($$1)) > 0 || fqh.this.H.a(awo.h.b($$1)) > 0) {
               this.b(new fqh.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends flg.a<fqh.c.a> {
         private final xd b;
         private final xd c;
         private final xd d;
         private final boolean e;
         private final boolean f;

         public a(final btv<?> $$0) {
            this.b = $$0.h();
            int $$1 = fqh.this.H.a(awo.g.b($$0));
            if ($$1 == 0) {
               this.c = xd.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xd.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fqh.this.H.a(awo.h.b($$0));
            if ($$2 == 0) {
               this.d = xd.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xd.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fqh.this.p, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fqh.this.p, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(fqh.this.p, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", xc.a(this.c, this.d));
         }
      }
   }
}
