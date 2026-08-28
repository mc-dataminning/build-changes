import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class drj extends drp implements bsc, csq, ctb {
   protected static final int b = 0;
   protected static final int c = 1;
   protected static final int d = 2;
   public static final int e = 0;
   private static final int[] r = new int[]{0};
   private static final int[] s = new int[]{2, 1};
   private static final int[] t = new int[]{1};
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = 3;
   public static final int i = 4;
   public static final int j = 200;
   public static final int k = 2;
   public static final int l = 0;
   protected jx<cvs> m = jx.a(3, cvs.k);
   int u;
   int v = 0;
   int w;
   int x;
   protected final crl n = new crl() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return drj.this.u;
            case 1:
               return drj.this.v;
            case 2:
               return drj.this.w;
            case 3:
               return drj.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               drj.this.u = $$1;
               break;
            case 1:
               drj.this.v = $$1;
               break;
            case 2:
               drj.this.w = $$1;
               break;
            case 3:
               drj.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Object2IntOpenHashMap<ale> y = new Object2IntOpenHashMap();
   private final dao.a<dba, ? extends czr> z;

   protected drj(drx<?> $$0, jf $$1, dus $$2, daq<? extends czr> $$3) {
      super($$0, $$1, $$2);
      this.z = dao.b($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.m = jx.a(this.b(), cvs.k);
      brm.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = 0;
      ug $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(ale.a($$3), $$2.h($$3));
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      brm.a($$0, this.m, $$1);
      ug $$2 = new ug();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(dej $$0, jf $$1, dus $$2, drj $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cvs $$6 = $$3.m.get(1);
      cvs $$7 = $$3.m.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.v == 0) {
         $$3.v = $$3.a($$0.L(), $$6);
      }

      if ($$3.k() || $$9 && $$8) {
         dam<?> $$10;
         if ($$8) {
            $$10 = $$3.z.a(new dba($$7), $$0).orElse(null);
         } else {
            $$10 = null;
         }

         int $$12 = $$3.al_();
         if (!$$3.k() && a($$0.G_(), $$10, $$3.m, $$12)) {
            $$3.u = $$3.a($$0.L(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cvn $$13 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     cvn $$14 = $$13.t();
                     $$3.m.set(1, $$14 == null ? cvs.k : new cvs($$14));
                  }
               }
            }
         }

         if ($$3.k() && a($$0.G_(), $$10, $$3.m, $$12)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.G_(), $$10, $$3.m, $$12)) {
                  $$3.a($$10);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.k() && $$3.w > 0) {
         $$3.w = azf.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dgh.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(kc $$0, @Nullable dam<?> $$1, jx<cvs> $$2, int $$3) {
      if (!$$2.get(0).f() && $$1 != null) {
         cvs $$4 = $$1.b().a($$0);
         if ($$4.f()) {
            return false;
         } else {
            cvs $$5 = $$2.get(2);
            if ($$5.f()) {
               return true;
            } else if (!cvs.c($$5, $$4)) {
               return false;
            } else {
               return $$5.K() < $$3 && $$5.K() < $$5.k() ? true : $$5.K() < $$4.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(kc $$0, @Nullable dam<?> $$1, jx<cvs> $$2, int $$3) {
      if ($$1 != null && a($$0, $$1, $$2, $$3)) {
         cvs $$4 = $$2.get(0);
         cvs $$5 = $$1.b().a($$0);
         cvs $$6 = $$2.get(2);
         if ($$6.f()) {
            $$2.set(2, $$5.u());
         } else if (cvs.c($$6, $$5)) {
            $$6.g(1);
         }

         if ($$4.a(dho.aP.q()) && !$$2.get(1).f() && $$2.get(1).a(cvw.qz)) {
            $$2.set(1, new cvs(cvw.qA));
         }

         $$4.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dss $$0, cvs $$1) {
      return $$0.b($$1);
   }

   private static int a(dej $$0, drj $$1) {
      dba $$2 = new dba($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((czr)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jk $$0) {
      if ($$0 == jk.a) {
         return s;
      } else {
         return $$0 == jk.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cvs $$1, @Nullable jk $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cvs $$1, jk $$2) {
      return $$2 == jk.a && $$0 == 1 ? $$1.a(cvw.qA) || $$1.a(cvw.qz) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected jx<cvs> f() {
      return this.m;
   }

   @Override
   protected void a(jx<cvs> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cvs $$1) {
      cvs $$2 = this.m.get($$0);
      boolean $$3 = !$$1.f() && cvs.c($$2, $$1);
      this.m.set($$0, $$1);
      $$1.f(this.f_($$1));
      if ($$0 == 0 && !$$3) {
         this.x = a(this.o, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cvs $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cvs $$2 = this.m.get(1);
         return this.o.L().a($$1) || $$1.a(cvw.qz) && !$$2.a(cvw.qz);
      }
   }

   @Override
   public void a(@Nullable dam<?> $$0) {
      if ($$0 != null) {
         ale $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dam<?> d() {
      return null;
   }

   @Override
   public void a(cnx $$0, List<cvs> $$1) {
   }

   public void a(ark $$0) {
      List<dam<?>> $$1 = this.a($$0.B(), $$0.dq());
      $$0.a($$1);

      for (dam<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<dam<?>> a(arj $$0, eyw $$1) {
      List<dam<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<ale> $$3 = (Entry<ale>)var4.next();
         $$0.r().a((ale)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dam<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((czr)$$4.b()).b());
         });
      }

      return $$2;
   }

   private static void a(arj $$0, eyw $$1, int $$2, float $$3) {
      int $$4 = azf.d((float)$$2 * $$3);
      float $$5 = azf.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bud.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(coc $$0) {
      for (cvs $$1 : this.m) {
         $$0.b($$1);
      }
   }
}
