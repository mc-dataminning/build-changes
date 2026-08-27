import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class fjx extends fjo {
   private static final wg b = wg.c("gui.stats");
   static final ajt c = new ajt("container/slot");
   static final ajt d = new ajt("statistics/header");
   static final ajt o = new ajt("statistics/sort_up");
   static final ajt p = new ajt("statistics/sort_down");
   private static final wg q = wg.c("multiplayer.downloadingStats");
   static final wg r = wg.c("stats.none");
   private static final wg s = wg.c("stat.generalButton");
   private static final wg u = wg.c("stat.itemsButton");
   private static final wg v = wg.c("stat.mobsButton");
   protected final fjo a;
   private static final int w = 280;
   private static final int x = 5;
   private static final int y = 58;
   private fhc z = new fhc(this, 33, 58);
   @Nullable
   private fjx.a A;
   @Nullable
   fjx.b B;
   @Nullable
   private fjx.c C;
   final auy D;
   @Nullable
   private fel<?> E;
   private boolean F = true;

   public fjx(fjo $$0, auy $$1) {
      super(b);
      this.a = $$0;
      this.D = $$1;
   }

   @Override
   protected void aN_() {
      this.z.c(new fee(this.m, q));
      this.j.L().b(new afv(afv.a.b));
   }

   public void m() {
      this.A = new fjx.a(this.j);
      this.B = new fjx.b(this.j);
      this.C = new fjx.c(this.j);
   }

   public void C() {
      fhc $$0 = new fhc(this, 33, 58);
      $$0.a(b, this.m);
      fhg $$1 = $$0.b(fhg.d()).a(5);
      $$1.c().b();
      fhg $$2 = $$1.a(fhg.e()).a(5);
      $$2.a(fdp.a(s, $$0x -> this.a(this.A)).a(120).a());
      fdp $$3 = $$2.a(fdp.a(u, $$0x -> this.a(this.B)).a(120).a());
      fdp $$4 = $$2.a(fdp.a(v, $$0x -> this.a(this.C)).a(120).a());
      $$1.a(fdp.a(wf.d, $$0x -> this.d()).a(200).a());
      if (this.B != null && this.B.aF_().isEmpty()) {
         $$3.j = false;
      }

      if (this.C != null && this.C.aF_().isEmpty()) {
         $$4.j = false;
      }

      this.z = $$0;
      this.z.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      if (this.E != null) {
         this.E.a(this.k, this.z);
      }
   }

   @Override
   public void d() {
      this.j.a(this.a);
   }

   public void D() {
      if (this.F) {
         this.m();
         this.C();
         this.a(this.A);
         this.F = false;
      }
   }

   @Override
   public boolean k() {
      return !this.F;
   }

   public void a(@Nullable fel<?> $$0) {
      if (this.E != null) {
         this.e(this.E);
      }

      if ($$0 != null) {
         this.c($$0);
         this.E = $$0;
         this.c();
      }
   }

   static String a(aut<ajt> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fel<fjx.a.a> {
      public a(fbp $$0) {
         super($$0, fjx.this.k, fjx.this.l - 33 - 58, 33, 11);
         ObjectArrayList<aut<ajt>> $$1 = new ObjectArrayList(auw.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> gmo.a(fjx.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            aut<ajt> $$2 = (aut<ajt>)var4.next();
            this.b(new fjx.a.a($$2));
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fel.a<fjx.a.a> {
         private final aut<ajt> b;
         private final wg c;

         a(aut<ajt> $$0) {
            this.b = $$0;
            this.c = wg.c(fjx.a($$0));
         }

         private String b() {
            return this.b.a(fjx.this.D.a(this.b));
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fjx.this.m, this.c, $$3 + 2, $$2, $$1 % 2 == 0 ? -1 : -8355712);
            String $$10 = this.b();
            $$0.b(fjx.this.m, $$10, $$3 + $$4 - fjx.this.m.b($$10) - 3, $$2, $$1 % 2 == 0 ? -1 : -8355712);
         }

         @Override
         public wg a() {
            return wg.a("narrator.select", wg.i().b(this.c).b(wf.v).f(this.b()));
         }
      }
   }

   class b extends fel<fjx.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ajt[] z = new ajt[]{
         new ajt("statistics/block_mined"),
         new ajt("statistics/item_broken"),
         new ajt("statistics/item_crafted"),
         new ajt("statistics/item_used"),
         new ajt("statistics/item_picked_up"),
         new ajt("statistics/item_dropped")
      };
      protected final List<auv<dby>> a;
      protected final List<auv<cre>> m;
      protected final Comparator<fjx.b.a> n = new fjx.b.b();
      @Nullable
      protected auv<?> o;
      protected int p = -1;
      protected int q;

      public b(fbp $$0) {
         super($$0, fjx.this.k, fjx.this.l - 33 - 58, 33, 22);
         this.a = Lists.newArrayList();
         this.a.add(auw.a);
         this.m = Lists.newArrayList(new auv[]{auw.d, auw.b, auw.c, auw.e, auw.f});
         this.a(true, 22);
         Set<cre> $$1 = Sets.newIdentityHashSet();

         for (cre $$2 : kr.h) {
            boolean $$3 = false;

            for (auv<cre> $$4 : this.m) {
               if ($$4.a($$2) && fjx.this.D.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dby $$5 : kr.e) {
            boolean $$6 = false;

            for (auv<dby> $$7 : this.a) {
               if ($$7.a($$5) && fjx.this.D.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.p());
            }
         }

         $$1.remove(crm.a);

         for (cre $$8 : $$1) {
            this.b(new fjx.b.a($$8));
         }
      }

      int a(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fdc $$0, int $$1, int $$2) {
         if (!this.c.n.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ajt $$4 = this.p == $$3 ? fjx.c : fjx.d;
            $$0.a($$4, $$1 + this.a($$3) - 18, $$2 + 1, 0, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.a(this.b(this.o)) - 36;
            ajt $$6 = this.q == 1 ? fjx.o : fjx.p;
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
            this.c.ak().a(gor.a(aum.zV, 1.0F));
            return true;
         } else {
            return super.a($$0, $$1);
         }
      }

      private auv<?> b(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(auv<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fdc $$0, int $$1, int $$2) {
         if ($$2 >= this.D() && $$2 <= this.F()) {
            fjx.b.a $$3 = this.u();
            int $$4 = this.r();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               cre $$5 = $$3.b();
               $$0.a(fjx.this.m, $$5.t(), $$1, $$2);
            } else {
               wg $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.a($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.b($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(fjx.this.m, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(auv<?> $$0) {
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

      class a extends fel.a<fjx.b.a> {
         private final cre b;

         a(cre $$0) {
            this.b = $$0;
         }

         public cre b() {
            return this.b;
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fjx.c, $$3, $$2, 0, 18, 18);
            $$0.b(this.b.x(), $$3 + 1, $$2 + 1);
            if (fjx.this.B != null) {
               for (int $$10 = 0; $$10 < fjx.this.B.a.size(); $$10++) {
                  aut<dby> $$12;
                  if (this.b instanceof cph $$11) {
                     $$12 = fjx.this.B.a.get($$10).b($$11.d());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.a($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < fjx.this.B.m.size(); $$14++) {
                  this.a($$0, fjx.this.B.m.get($$14).b(this.b), $$3 + b.this.a($$14 + fjx.this.B.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fdc $$0, @Nullable aut<?> $$1, int $$2, int $$3, boolean $$4) {
            wg $$5 = (wg)($$1 == null ? fjx.r : wg.b($$1.a(fjx.this.D.a($$1))));
            $$0.b(fjx.this.m, $$5, $$2 - fjx.this.m.a($$5), $$3, $$4 ? -1 : -8355712);
         }

         @Override
         public wg a() {
            return wg.a("narrator.select", this.b.t());
         }
      }

      class b implements Comparator<fjx.b.a> {
         public int a(fjx.b.a $$0, fjx.b.a $$1) {
            cre $$2 = $$0.b();
            cre $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               auv<dby> $$6 = (auv<dby>)b.this.o;
               $$4 = $$2 instanceof cph ? fjx.this.D.a($$6, ((cph)$$2).d()) : -1;
               $$5 = $$3 instanceof cph ? fjx.this.D.a($$6, ((cph)$$3).d()) : -1;
            } else {
               auv<cre> $$9 = (auv<cre>)b.this.o;
               $$4 = fjx.this.D.a($$9, $$2);
               $$5 = fjx.this.D.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(cre.a($$2), cre.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fel<fjx.c.a> {
      public c(fbp $$0) {
         super($$0, fjx.this.k, fjx.this.l - 33 - 58, 33, 9 * 4);

         for (bqb<?> $$1 : kr.g) {
            if (fjx.this.D.a(auw.g.b($$1)) > 0 || fjx.this.D.a(auw.h.b($$1)) > 0) {
               this.b(new fjx.c.a($$1));
            }
         }
      }

      @Override
      public int b() {
         return 280;
      }

      class a extends fel.a<fjx.c.a> {
         private final wg b;
         private final wg c;
         private final wg d;
         private final boolean e;
         private final boolean f;

         public a(bqb<?> $$0) {
            this.b = $$0.h();
            int $$1 = fjx.this.D.a(auw.g.b($$0));
            if ($$1 == 0) {
               this.c = wg.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = wg.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = fjx.this.D.a(auw.h.b($$0));
            if ($$2 == 0) {
               this.d = wg.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = wg.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fjx.this.m, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(fjx.this.m, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -6250336 : -8355712);
            $$0.b(fjx.this.m, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -6250336 : -8355712);
         }

         @Override
         public wg a() {
            return wg.a("narrator.select", wf.a(this.c, this.d));
         }
      }
   }
}
