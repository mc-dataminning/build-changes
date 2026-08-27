import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dgp extends dfi implements dlz.b<dmg.b>, dmg {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<aqu> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aqv.Al);
      $$0.put(2, aqv.Am);
      $$0.put(3, aqv.An);
      $$0.put(4, aqv.Ak);
   });
   private int k;
   private final dmg.d l = new dgp.a();
   private dmg.a m = new dmg.a();
   private final dmg.b n = new dmg.b(this);

   public dgp(hx $$0, dhn $$1) {
      super(dfk.L, $$0, $$1);
   }

   @Override
   public dmg.a gh() {
      return this.m;
   }

   @Override
   public dmg.d gi() {
      return this.l;
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dmg.a.a.parse(new Dynamic(sr.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dmg.a.a.encodeStart(sr.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static amj a(@Nullable bkv $$0) {
      if ($$0 instanceof amj) {
         return (amj)$$0;
      } else {
         if ($$0 != null) {
            bll $$6 = $$0.cO();
            if ($$6 instanceof amj) {
               return (amj)$$6;
            }
         }

         if ($$0 instanceof cer $$3) {
            bkv var3 = $$3.w();
            if (var3 instanceof amj) {
               return (amj)var3;
            }
         }

         if ($$0 instanceof cas $$5) {
            bkv var9 = $$5.w();
            if (var9 instanceof amj) {
               return (amj)var9;
            }
         }

         return null;
      }
   }

   public void a(ami $$0, @Nullable amj $$1) {
      if ($$1 != null) {
         dhn $$2 = this.r();
         if (!$$2.c(dby.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bkv)$$1);
            }
         }
      }
   }

   private boolean b(ami $$0, amj $$1) {
      OptionalInt $$2 = cdf.a($$0, this.aC_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(ami $$0, @Nullable bkv $$1) {
      hx $$2 = this.aC_();
      dhn $$3 = this.r();
      $$0.a($$2, $$3.a(dby.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dlx.N, $$2, dlx.a.a($$1));
   }

   private boolean b(ami $$0) {
      return this.r().c(dby.d) && $$0.aj() != biy.a && $$0.Y().b(csb.M);
   }

   public void a(ami $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((csf)$$0);
         }

         cdd.a($$0, ejz.b(this.aC_()), null, 40);
      }
   }

   private void b(csf $$0) {
      aqu $$1 = (aqu)j.get(this.k);
      if ($$1 != null) {
         hx $$2 = this.aC_();
         int $$3 = $$2.u() + atq.b($$0.z, -10, 10);
         int $$4 = $$2.v() + atq.b($$0.z, -10, 10);
         int $$5 = $$2.w() + atq.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aqw.f, 5.0F, 1.0F);
      }
   }

   private boolean c(ami $$0) {
      return this.k < 4 ? false : aui.a(bkz.bi, blp.k, $$0, this.aC_(), 20, 5, 6, aui.a.b).isPresent();
   }

   public dmg.b c() {
      return this.n;
   }

   class a implements dmg.d {
      private static final int b = 8;
      private final dmb c = new dlt(dgp.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dmb b() {
         return this.c;
      }

      @Override
      public arz<dlx> c() {
         return arq.c;
      }

      @Override
      public boolean a(ami $$0, hx $$1, dlx $$2, dlx.a $$3) {
         return !dgp.this.r().c(dby.b) && dgp.a($$3.a()) != null;
      }

      @Override
      public void a(ami $$0, hx $$1, dlx $$2, @Nullable bkv $$3, @Nullable bkv $$4, float $$5) {
         dgp.this.a($$0, dgp.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dgp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
