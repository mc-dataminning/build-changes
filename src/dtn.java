import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class dtn extends dtt implements bst, ctt, cue {
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
   protected ka<cwp> m = ka.a(3, cwp.j);
   int u;
   int v = 0;
   int w;
   int x;
   protected final cso n = new cso() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dtn.this.u;
            case 1:
               return dtn.this.v;
            case 2:
               return dtn.this.w;
            case 3:
               return dtn.this.x;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dtn.this.u = $$1;
               break;
            case 1:
               dtn.this.v = $$1;
               break;
            case 2:
               dtn.this.w = $$1;
               break;
            case 3:
               dtn.this.x = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<akt<dbe<?>>> y = new Reference2IntOpenHashMap();
   private final dbl.a<dbx, ? extends dak> z;

   protected dtn(dub<?> $$0, ji $$1, dwx $$2, dbp<? extends dak> $$3) {
      super($$0, $$1, $$2);
      this.z = dbl.a($$3);
   }

   private boolean k() {
      return this.u > 0;
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.m = ka.a(this.b(), cwp.j);
      bsd.b($$0, this.m, $$1);
      this.u = $$0.g("BurnTime");
      this.w = $$0.g("CookTime");
      this.x = $$0.g("CookTimeTotal");
      this.v = 0;
      tq $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.y.put(akt.a(mc.bk, aku.a($$3)), $$2.h($$3));
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("BurnTime", (short)this.u);
      $$0.a("CookTime", (short)this.w);
      $$0.a("CookTimeTotal", (short)this.x);
      bsd.a($$0, this.m, $$1);
      tq $$2 = new tq();
      this.y.forEach(($$1x, $$2x) -> $$2.a($$1x.a().toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(arc $$0, ji $$1, dwx $$2, dtn $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.u--;
      }

      cwp $$6 = $$3.m.get(1);
      cwp $$7 = $$3.m.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.v == 0) {
         $$3.v = $$3.a($$0.M(), $$6);
      }

      if ($$3.k() || $$9 && $$8) {
         dbx $$10 = new dbx($$7);
         dbj<? extends dak> $$11;
         if ($$8) {
            $$11 = $$3.z.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.an_();
         if (!$$3.k() && a($$0.K_(), $$11, $$10, $$3.m, $$13)) {
            $$3.u = $$3.a($$0.M(), $$6);
            $$3.v = $$3.u;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cwl $$14 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     $$3.m.set(1, $$14.k());
                  }
               }
            }
         }

         if ($$3.k() && a($$0.K_(), $$11, $$10, $$3.m, $$13)) {
            $$3.w++;
            if ($$3.w == $$3.x) {
               $$3.w = 0;
               $$3.x = a($$0, $$3);
               if (b($$0.K_(), $$11, $$10, $$3.m, $$13)) {
                  $$3.a($$11);
               }

               $$5 = true;
            }
         } else {
            $$3.w = 0;
         }
      } else if (!$$3.k() && $$3.w > 0) {
         $$3.w = ayz.a($$3.w - 2, 0, $$3.x);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dih.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(kf $$0, @Nullable dbj<? extends dak> $$1, dbx $$2, ka<cwp> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         cwp $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            cwp $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!cwp.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(kf $$0, @Nullable dbj<? extends dak> $$1, dbx $$2, ka<cwp> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         cwp $$5 = $$3.get(0);
         cwp $$6 = $$1.b().a($$2, $$0);
         cwp $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (cwp.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(djo.aW.j()) && !$$3.get(1).f() && $$3.get(1).a(cwt.rf)) {
            $$3.set(1, new cwp(cwt.rg));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dux $$0, cwp $$1) {
      return $$0.b($$1);
   }

   private static int a(arc $$0, dtn $$1) {
      dbx $$2 = new dbx($$1.a(0));
      return $$1.z.a($$2, $$0).map($$0x -> ((dak)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jn $$0) {
      if ($$0 == jn.a) {
         return s;
      } else {
         return $$0 == jn.b ? r : t;
      }
   }

   @Override
   public boolean a(int $$0, cwp $$1, @Nullable jn $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cwp $$1, jn $$2) {
      return $$2 == jn.a && $$0 == 1 ? $$1.a(cwt.rg) || $$1.a(cwt.rf) : true;
   }

   @Override
   public int b() {
      return this.m.size();
   }

   @Override
   protected ka<cwp> f() {
      return this.m;
   }

   @Override
   protected void a(ka<cwp> $$0) {
      this.m = $$0;
   }

   @Override
   public void a(int $$0, cwp $$1) {
      cwp $$2 = this.m.get($$0);
      boolean $$3 = !$$1.f() && cwp.c($$2, $$1);
      this.m.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3 && this.o instanceof arc $$4) {
         this.x = a($$4, this);
         this.w = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cwp $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cwp $$2 = this.m.get(1);
         return this.o.M().a($$1) || $$1.a(cwt.rf) && !$$2.a(cwt.rf);
      }
   }

   @Override
   public void a(@Nullable dbj<?> $$0) {
      if ($$0 != null) {
         akt<dbe<?>> $$1 = $$0.a();
         this.y.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dbj<?> d() {
      return null;
   }

   @Override
   public void a(cox $$0, List<cwp> $$1) {
   }

   public void a(ard $$0) {
      List<dbj<?>> $$1 = this.a($$0.y(), $$0.du());
      $$0.a($$1);

      for (dbj<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.m);
         }
      }

      this.y.clear();
   }

   public List<dbj<?>> a(arc $$0, fba $$1) {
      List<dbj<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.y.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<akt<dbe<?>>> $$3 = (Entry<akt<dbe<?>>>)var4.next();
         $$0.t().b((akt<dbe<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dbj<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dak)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(arc $$0, fba $$1, int $$2, float $$3) {
      int $$4 = ayz.d((float)$$2 * $$3);
      float $$5 = ayz.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      buw.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cpc $$0) {
      for (cwp $$1 : this.m) {
         $$0.b($$1);
      }
   }
}
