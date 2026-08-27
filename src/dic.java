import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dic extends dgv implements dnt.b<doa.b>, doa {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<arr> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ars.AG);
      $$0.put(2, ars.AH);
      $$0.put(3, ars.AI);
      $$0.put(4, ars.AF);
   });
   private int k;
   private final doa.d l = new dic.a();
   private doa.a m = new doa.a();
   private final doa.b n = new doa.b(this);

   public dic(hx $$0, djh $$1) {
      super(dgx.L, $$0, $$1);
   }

   @Override
   public doa.a gg() {
      return this.m;
   }

   @Override
   public doa.d gh() {
      return this.l;
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         doa.a.a.parse(new Dynamic(tb.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      doa.a.a.encodeStart(tb.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static ane a(@Nullable blv $$0) {
      if ($$0 instanceof ane) {
         return (ane)$$0;
      } else {
         if ($$0 != null) {
            bml $$6 = $$0.cN();
            if ($$6 instanceof ane) {
               return (ane)$$6;
            }
         }

         if ($$0 instanceof cga $$3) {
            blv var3 = $$3.w();
            if (var3 instanceof ane) {
               return (ane)var3;
            }
         }

         if ($$0 instanceof cbu $$5) {
            blv var9 = $$5.w();
            if (var9 instanceof ane) {
               return (ane)var9;
            }
         }

         return null;
      }
   }

   public void a(and $$0, @Nullable ane $$1) {
      if ($$1 != null) {
         djh $$2 = this.r();
         if (!$$2.c(ddj.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (blv)$$1);
            }
         }
      }
   }

   private boolean b(and $$0, ane $$1) {
      OptionalInt $$2 = ceo.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(and $$0, @Nullable blv $$1) {
      hx $$2 = this.aB_();
      djh $$3 = this.r();
      $$0.a($$2, $$3.a(ddj.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dnr.N, $$2, dnr.a.a($$1));
   }

   private boolean b(and $$0) {
      return this.r().c(ddj.d) && $$0.ak() != bjy.a && $$0.Z().b(ctl.M);
   }

   public void a(and $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((ctp)$$0);
         }

         cem.a($$0, elt.b(this.aB_()), null, 40);
      }
   }

   private void b(ctp $$0) {
      arr $$1 = (arr)j.get(this.k);
      if ($$1 != null) {
         hx $$2 = this.aB_();
         int $$3 = $$2.u() + auo.b($$0.z, -10, 10);
         int $$4 = $$2.v() + auo.b($$0.z, -10, 10);
         int $$5 = $$2.w() + auo.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, art.f, 5.0F, 1.0F);
      }
   }

   private boolean c(and $$0) {
      return this.k < 4 ? false : avi.a(blz.bj, bmp.k, $$0, this.aB_(), 20, 5, 6, avi.a.b).isPresent();
   }

   public doa.b c() {
      return this.n;
   }

   class a implements doa.d {
      private static final int b = 8;
      private final dnv c = new dnn(dic.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dnv b() {
         return this.c;
      }

      @Override
      public asw<dnr> c() {
         return asn.c;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnr $$2, dnr.a $$3) {
         return !dic.this.r().c(ddj.b) && dic.a($$3.a()) != null;
      }

      @Override
      public void a(and $$0, hx $$1, dnr $$2, @Nullable blv $$3, @Nullable blv $$4, float $$5) {
         dic.this.a($$0, dic.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dic.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
