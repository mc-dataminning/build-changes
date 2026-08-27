import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dhv extends dgo implements dnm.b<dnt.b>, dnt {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<arl> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, arm.AG);
      $$0.put(2, arm.AH);
      $$0.put(3, arm.AI);
      $$0.put(4, arm.AF);
   });
   private int k;
   private final dnt.d l = new dhv.a();
   private dnt.a m = new dnt.a();
   private final dnt.b n = new dnt.b(this);

   public dhv(hx $$0, dja $$1) {
      super(dgq.L, $$0, $$1);
   }

   @Override
   public dnt.a gg() {
      return this.m;
   }

   @Override
   public dnt.d gh() {
      return this.l;
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dnt.a.a.parse(new Dynamic(sz.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dnt.a.a.encodeStart(sz.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static ana a(@Nullable blp $$0) {
      if ($$0 instanceof ana) {
         return (ana)$$0;
      } else {
         if ($$0 != null) {
            bmf $$6 = $$0.cN();
            if ($$6 instanceof ana) {
               return (ana)$$6;
            }
         }

         if ($$0 instanceof cft $$3) {
            blp var3 = $$3.w();
            if (var3 instanceof ana) {
               return (ana)var3;
            }
         }

         if ($$0 instanceof cbo $$5) {
            blp var9 = $$5.w();
            if (var9 instanceof ana) {
               return (ana)var9;
            }
         }

         return null;
      }
   }

   public void a(amz $$0, @Nullable ana $$1) {
      if ($$1 != null) {
         dja $$2 = this.r();
         if (!$$2.c(ddc.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (blp)$$1);
            }
         }
      }
   }

   private boolean b(amz $$0, ana $$1) {
      OptionalInt $$2 = ceh.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(amz $$0, @Nullable blp $$1) {
      hx $$2 = this.aB_();
      dja $$3 = this.r();
      $$0.a($$2, $$3.a(ddc.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dnk.N, $$2, dnk.a.a($$1));
   }

   private boolean b(amz $$0) {
      return this.r().c(ddc.d) && $$0.ak() != bjs.a && $$0.Z().b(cte.M);
   }

   public void a(amz $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cti)$$0);
         }

         cef.a($$0, elm.b(this.aB_()), null, 40);
      }
   }

   private void b(cti $$0) {
      arl $$1 = (arl)j.get(this.k);
      if ($$1 != null) {
         hx $$2 = this.aB_();
         int $$3 = $$2.u() + aui.b($$0.z, -10, 10);
         int $$4 = $$2.v() + aui.b($$0.z, -10, 10);
         int $$5 = $$2.w() + aui.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, arn.f, 5.0F, 1.0F);
      }
   }

   private boolean c(amz $$0) {
      return this.k < 4 ? false : avc.a(blt.bj, bmj.k, $$0, this.aB_(), 20, 5, 6, avc.a.b).isPresent();
   }

   public dnt.b c() {
      return this.n;
   }

   class a implements dnt.d {
      private static final int b = 8;
      private final dno c = new dng(dhv.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dno b() {
         return this.c;
      }

      @Override
      public asq<dnk> c() {
         return ash.c;
      }

      @Override
      public boolean a(amz $$0, hx $$1, dnk $$2, dnk.a $$3) {
         return !dhv.this.r().c(ddc.b) && dhv.a($$3.a()) != null;
      }

      @Override
      public void a(amz $$0, hx $$1, dnk $$2, @Nullable blp $$3, @Nullable blp $$4, float $$5) {
         dhv.this.a($$0, dhv.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dhv.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
