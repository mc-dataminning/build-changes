import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class dtn extends dtt implements bsu, ctt, cue {
   protected static final int b = 0;
   protected static final int c = 1;
   protected static final int d = 2;
   public static final int e = 0;
   private static final int[] q = new int[]{0};
   private static final int[] r = new int[]{2, 1};
   private static final int[] s = new int[]{1};
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = 3;
   public static final int i = 4;
   public static final int j = 200;
   public static final int k = 2;
   protected ka<cwp> l = ka.a(3, cwp.j);
   int t;
   int u;
   int v;
   int w;
   protected final cso m = new cso() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dtn.this.t;
            case 1:
               return dtn.this.u;
            case 2:
               return dtn.this.v;
            case 3:
               return dtn.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dtn.this.t = $$1;
               break;
            case 1:
               dtn.this.u = $$1;
               break;
            case 2:
               dtn.this.v = $$1;
               break;
            case 3:
               dtn.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<aku<dbe<?>>> x = new Reference2IntOpenHashMap();
   private final dbl.a<dbx, ? extends dak> y;

   protected dtn(dub<?> $$0, ji $$1, dwx $$2, dbp<? extends dak> $$3) {
      super($$0, $$1, $$2);
      this.y = dbl.a($$3);
   }

   private boolean k() {
      return this.t > 0;
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.l = ka.a(this.b(), cwp.j);
      bse.b($$0, this.l, $$1);
      this.v = $$0.g("cooking_time_spent");
      this.w = $$0.g("cooking_total_time");
      this.t = $$0.g("lit_time_remaining");
      this.u = $$0.g("lit_total_time");
      tq $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.x.put(aku.a(mc.bk, akv.a($$3)), $$2.h($$3));
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("cooking_time_spent", (short)this.v);
      $$0.a("cooking_total_time", (short)this.w);
      $$0.a("lit_time_remaining", (short)this.t);
      $$0.a("lit_total_time", (short)this.u);
      bse.a($$0, this.l, $$1);
      tq $$2 = new tq();
      this.x.forEach(($$1x, $$2x) -> $$2.a($$1x.a().toString(), $$2x));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(ard $$0, ji $$1, dwx $$2, dtn $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.t--;
      }

      cwp $$6 = $$3.l.get(1);
      cwp $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.k() || $$9 && $$8) {
         dbx $$10 = new dbx($$7);
         dbj<? extends dak> $$11;
         if ($$8) {
            $$11 = $$3.y.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.an_();
         if (!$$3.k() && a($$0.K_(), $$11, $$10, $$3.l, $$13)) {
            $$3.t = $$3.a($$0.M(), $$6);
            $$3.u = $$3.t;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cwl $$14 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     $$3.l.set(1, $$14.k());
                  }
               }
            }
         }

         if ($$3.k() && a($$0.K_(), $$11, $$10, $$3.l, $$13)) {
            $$3.v++;
            if ($$3.v == $$3.w) {
               $$3.v = 0;
               $$3.w = a($$0, $$3);
               if (b($$0.K_(), $$11, $$10, $$3.l, $$13)) {
                  $$3.a($$11);
               }

               $$5 = true;
            }
         } else {
            $$3.v = 0;
         }
      } else if (!$$3.k() && $$3.v > 0) {
         $$3.v = ayz.a($$3.v - 2, 0, $$3.w);
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

   private static int a(ard $$0, dtn $$1) {
      dbx $$2 = new dbx($$1.a(0));
      return $$1.y.a($$2, $$0).map($$0x -> ((dak)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jn $$0) {
      if ($$0 == jn.a) {
         return r;
      } else {
         return $$0 == jn.b ? q : s;
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
      return this.l.size();
   }

   @Override
   protected ka<cwp> f() {
      return this.l;
   }

   @Override
   protected void a(ka<cwp> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cwp $$1) {
      cwp $$2 = this.l.get($$0);
      boolean $$3 = !$$1.f() && cwp.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.e_($$1));
      if ($$0 == 0 && !$$3 && this.n instanceof ard $$4) {
         this.w = a($$4, this);
         this.v = 0;
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
         cwp $$2 = this.l.get(1);
         return this.n.M().a($$1) || $$1.a(cwt.rf) && !$$2.a(cwt.rf);
      }
   }

   @Override
   public void a(@Nullable dbj<?> $$0) {
      if ($$0 != null) {
         aku<dbe<?>> $$1 = $$0.a();
         this.x.addTo($$1, 1);
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

   public void a(are $$0) {
      List<dbj<?>> $$1 = this.a($$0.y(), $$0.dt());
      $$0.a($$1);

      for (dbj<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.x.clear();
   }

   public List<dbj<?>> a(ard $$0, fba $$1) {
      List<dbj<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.x.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<aku<dbe<?>>> $$3 = (Entry<aku<dbe<?>>>)var4.next();
         $$0.t().b((aku<dbe<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dbj<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dak)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(ard $$0, fba $$1, int $$2, float $$3) {
      int $$4 = ayz.d((float)$$2 * $$3);
      float $$5 = ayz.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bux.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cpc $$0) {
      for (cwp $$1 : this.l) {
         $$0.b($$1);
      }
   }
}
