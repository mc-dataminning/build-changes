import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfd extends ddx implements dkn.b<dku.b>, dku {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<aqc> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aqd.zI);
      $$0.put(2, aqd.zJ);
      $$0.put(3, aqd.zK);
      $$0.put(4, aqd.zH);
   });
   private int k;
   private final dku.d l = new dfd.a();
   private dku.a m = new dku.a();
   private final dku.b n = new dku.b(this);

   public dfd(ht $$0, dgb $$1) {
      super(ddz.L, $$0, $$1);
   }

   @Override
   public dku.a gg() {
      return this.m;
   }

   @Override
   public dku.d gh() {
      return this.l;
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dku.a.a.parse(new Dynamic(sf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dku.a.a.encodeStart(sf.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static alr a(@Nullable bjt $$0) {
      if ($$0 instanceof alr) {
         return (alr)$$0;
      } else {
         if ($$0 != null) {
            bkj $$6 = $$0.cN();
            if ($$6 instanceof alr) {
               return (alr)$$6;
            }
         }

         if ($$0 instanceof cdp $$3) {
            bjt var3 = $$3.v();
            if (var3 instanceof alr) {
               return (alr)var3;
            }
         }

         if ($$0 instanceof bzq $$5) {
            bjt var9 = $$5.v();
            if (var9 instanceof alr) {
               return (alr)var9;
            }
         }

         return null;
      }
   }

   public void a(alq $$0, @Nullable alr $$1) {
      if ($$1 != null) {
         dgb $$2 = this.q();
         if (!$$2.c(das.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bjt)$$1);
            }
         }
      }
   }

   private boolean b(alq $$0, alr $$1) {
      OptionalInt $$2 = ccd.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(alq $$0, @Nullable bjt $$1) {
      ht $$2 = this.p();
      dgb $$3 = this.q();
      $$0.a($$2, $$3.a(das.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dkl.N, $$2, dkl.a.a($$1));
   }

   private boolean b(alq $$0) {
      return this.q().c(das.d) && $$0.ai() != bhy.a && $$0.X().b(cqv.J);
   }

   public void a(alq $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cqz)$$0);
         }

         ccb.a($$0, eif.b(this.p()), null, 40);
      }
   }

   private void b(cqz $$0) {
      aqc $$1 = (aqc)j.get(this.k);
      if ($$1 != null) {
         ht $$2 = this.p();
         int $$3 = $$2.u() + asy.b($$0.z, -10, 10);
         int $$4 = $$2.v() + asy.b($$0.z, -10, 10);
         int $$5 = $$2.w() + asy.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aqe.f, 5.0F, 1.0F);
      }
   }

   private boolean c(alq $$0) {
      return this.k < 4 ? false : atp.a(bjx.bi, bkn.k, $$0, this.p(), 20, 5, 6, atp.a.b).isPresent();
   }

   public dku.b c() {
      return this.n;
   }

   class a implements dku.d {
      private static final int b = 8;
      private final dkp c = new dkh(dfd.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dkp b() {
         return this.c;
      }

      @Override
      public arh<dkl> c() {
         return aqy.c;
      }

      @Override
      public boolean a(alq $$0, ht $$1, dkl $$2, dkl.a $$3) {
         return !dfd.this.q().c(das.b) && dfd.a($$3.a()) != null;
      }

      @Override
      public void a(alq $$0, ht $$1, dkl $$2, @Nullable bjt $$3, @Nullable bjt $$4, float $$5) {
         dfd.this.a($$0, dfd.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dfd.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
