import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtf extends drv implements dzr.b<dzy.b>, dzy {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awf> k = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awg.BX);
      $$0.put(2, awg.BY);
      $$0.put(3, awg.BZ);
      $$0.put(4, awg.BW);
   });
   private int l;
   private final dzy.d m = new dtf.a();
   private dzy.a n = new dzy.a();
   private final dzy.b r = new dzy.b(this);

   public dtf(jf $$0, dus $$1) {
      super(drx.L, $$0, $$1);
   }

   @Override
   public dzy.a gq() {
      return this.n;
   }

   @Override
   public dzy.d gr() {
      return this.m;
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alc<vd> $$2 = $$1.a(uu.a);
      if ($$0.b("listener", 10)) {
         dzy.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alc<vd> $$2 = $$1.a(uu.a);
      dzy.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static ark a(@Nullable btr $$0) {
      if ($$0 instanceof ark) {
         return (ark)$$0;
      } else {
         if ($$0 != null) {
            bun $$6 = $$0.cU();
            if ($$6 instanceof ark) {
               return (ark)$$6;
            }
         }

         if ($$0 instanceof cor $$3) {
            btr var3 = $$3.s();
            if (var3 instanceof ark) {
               return (ark)var3;
            }
         }

         if ($$0 instanceof ckh $$5) {
            btr var9 = $$5.s();
            if (var9 instanceof ark) {
               return (ark)var9;
            }
         }

         return null;
      }
   }

   public void a(arj $$0, @Nullable ark $$1) {
      if ($$1 != null) {
         dus $$2 = this.m();
         if (!$$2.c(doh.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (btr)$$1);
            }
         }
      }
   }

   private boolean b(arj $$0, ark $$1) {
      OptionalInt $$2 = cnd.a($$0, this.aC_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arj $$0, @Nullable btr $$1) {
      jf $$2 = this.aC_();
      dus $$3 = this.m();
      $$0.a($$2, $$3.b(doh.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dzp.N, $$2, dzp.a.a($$1));
   }

   private boolean b(arj $$0) {
      return this.m().c(doh.d) && $$0.am() != brp.a && $$0.ac().b(def.M);
   }

   public void a(arj $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dej)$$0);
         }

         cnb.a($$0, eyw.b(this.aC_()), null, 40);
      }
   }

   private void b(dej $$0) {
      awf $$1 = (awf)k.get(this.l);
      if ($$1 != null) {
         jf $$2 = this.aC_();
         int $$3 = $$2.u() + azf.b($$0.z, -10, 10);
         int $$4 = $$2.v() + azf.b($$0.z, -10, 10);
         int $$5 = $$2.w() + azf.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awh.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arj $$0) {
      return this.l < 4 ? false : azy.a(bty.bm, btx.k, $$0, this.aC_(), 20, 5, 6, azy.a.b).isPresent();
   }

   public dzy.b b() {
      return this.r;
   }

   class a implements dzy.d {
      private static final int b = 8;
      private final dzt c = new dzl(dtf.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dzt b() {
         return this.c;
      }

      @Override
      public axl<dzp> c() {
         return axc.c;
      }

      @Override
      public boolean a(arj $$0, jf $$1, jo<dzp> $$2, dzp.a $$3) {
         return !dtf.this.m().c(doh.b) && dtf.a($$3.a()) != null;
      }

      @Override
      public void a(arj $$0, jf $$1, jo<dzp> $$2, @Nullable btr $$3, @Nullable btr $$4, float $$5) {
         dtf.this.a($$0, dtf.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dtf.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
