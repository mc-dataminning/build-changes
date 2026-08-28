import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import javax.annotation.Nullable;

public abstract class dwk extends dwq implements bul, cwh, cws {
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
   protected jn<cyy> l = jn.a(3, cyy.k);
   int t;
   int u;
   int v;
   int w;
   protected final cvc m = new cvc() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return dwk.this.t;
            case 1:
               return dwk.this.u;
            case 2:
               return dwk.this.v;
            case 3:
               return dwk.this.w;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               dwk.this.t = $$1;
               break;
            case 1:
               dwk.this.u = $$1;
               break;
            case 2:
               dwk.this.v = $$1;
               break;
            case 3:
               dwk.this.w = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<alf<ddp<?>>> x = new Reference2IntOpenHashMap();
   private final ddw.a<dei, ? extends dcv> y;

   protected dwk(dwz<?> $$0, iu $$1, dzz $$2, dea<? extends dcv> $$3) {
      super($$0, $$1, $$2);
      this.y = ddw.a($$3);
   }

   private boolean k() {
      return this.t > 0;
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.l = jn.a(this.b(), cyy.k);
      btv.b($$0, this.l, $$1);
      this.v = $$0.g("cooking_time_spent");
      this.w = $$0.g("cooking_total_time");
      this.t = $$0.g("lit_time_remaining");
      this.u = $$0.g("lit_total_time");
      tz $$2 = $$0.p("RecipesUsed");

      for (String $$3 : $$2.e()) {
         this.x.put(alf.a(mg.bt, alg.a($$3)), $$2.h($$3));
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("cooking_time_spent", (short)this.v);
      $$0.a("cooking_total_time", (short)this.w);
      $$0.a("lit_time_remaining", (short)this.t);
      $$0.a("lit_total_time", (short)this.u);
      btv.a($$0, this.l, $$1);
      tz $$2 = new tz();
      this.x.forEach(($$1x, $$2x) -> $$2.a($$1x.a().toString(), $$2x.intValue()));
      $$0.a("RecipesUsed", $$2);
   }

   public static void a(arq $$0, iu $$1, dzz $$2, dwk $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.t--;
      }

      cyy $$6 = $$3.l.get(1);
      cyy $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.k() || $$9 && $$8) {
         dei $$10 = new dei($$7);
         ddu<? extends dcv> $$11;
         if ($$8) {
            $$11 = $$3.y.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.aj_();
         if (!$$3.k() && a($$0.F_(), $$11, $$10, $$3.l, $$13)) {
            $$3.t = $$3.a($$0.M(), $$6);
            $$3.u = $$3.t;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  cyu $$14 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     $$3.l.set(1, $$14.i());
                  }
               }
            }
         }

         if ($$3.k() && a($$0.F_(), $$11, $$10, $$3.l, $$13)) {
            $$3.v++;
            if ($$3.v == $$3.w) {
               $$3.v = 0;
               $$3.w = a($$0, $$3);
               if (b($$0.F_(), $$11, $$10, $$3.l, $$13)) {
                  $$3.a($$11);
               }

               $$5 = true;
            }
         } else {
            $$3.v = 0;
         }
      } else if (!$$3.k() && $$3.v > 0) {
         $$3.v = azm.a($$3.v - 2, 0, $$3.w);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dkv.b, Boolean.valueOf($$3.k()));
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(js $$0, @Nullable ddu<? extends dcv> $$1, dei $$2, jn<cyy> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         cyy $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            cyy $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!cyy.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(js $$0, @Nullable ddu<? extends dcv> $$1, dei $$2, jn<cyy> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         cyy $$5 = $$3.get(0);
         cyy $$6 = $$1.b().a($$2, $$0);
         cyy $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (cyy.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dmc.aW.h()) && !$$3.get(1).f() && $$3.get(1).a(czc.rl)) {
            $$3.set(1, new cyy(czc.rm));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(dxw $$0, cyy $$1) {
      return $$0.b($$1);
   }

   private static int a(arq $$0, dwk $$1) {
      dei $$2 = new dei($$1.a(0));
      return $$1.y.a($$2, $$0).map($$0x -> ((dcv)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(ja $$0) {
      if ($$0 == ja.a) {
         return r;
      } else {
         return $$0 == ja.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, cyy $$1, @Nullable ja $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cyy $$1, ja $$2) {
      return $$2 == ja.a && $$0 == 1 ? $$1.a(czc.rm) || $$1.a(czc.rl) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected jn<cyy> f() {
      return this.l;
   }

   @Override
   protected void a(jn<cyy> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, cyy $$1) {
      cyy $$2 = this.l.get($$0);
      boolean $$3 = !$$1.f() && cyy.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.f_($$1));
      if ($$0 == 0 && !$$3 && this.n instanceof arq $$4) {
         this.w = a($$4, this);
         this.v = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, cyy $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         cyy $$2 = this.l.get(1);
         return this.n.M().a($$1) || $$1.a(czc.rl) && !$$2.a(czc.rl);
      }
   }

   @Override
   public void a(@Nullable ddu<?> $$0) {
      if ($$0 != null) {
         alf<ddp<?>> $$1 = $$0.a();
         this.x.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public ddu<?> d() {
      return null;
   }

   @Override
   public void a(cqy $$0, List<cyy> $$1) {
   }

   public void a(arr $$0) {
      List<ddu<?>> $$1 = this.a($$0.y(), $$0.dt());
      $$0.a($$1);

      for (ddu<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.x.clear();
   }

   public List<ddu<?>> a(arq $$0, fei $$1) {
      List<ddu<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.x.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<alf<ddp<?>>> $$3 = (Entry<alf<ddp<?>>>)var4.next();
         $$0.t().b((alf<ddp<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((ddu<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dcv)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(arq $$0, fei $$1, int $$2, float $$3) {
      int $$4 = azm.d((float)$$2 * $$3);
      float $$5 = azm.i((float)$$2 * $$3);
      if ($$5 != 0.0F && Math.random() < (double)$$5) {
         $$4++;
      }

      bwr.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(crd $$0) {
      for (cyy $$1 : this.l) {
         $$0.b($$1);
      }
   }

   @Override
   public void a(iu $$0, dzz $$1) {
      super.a($$0, $$1);
      if (this.n instanceof arq $$2) {
         this.a($$2, fei.b($$0));
      }
   }
}
