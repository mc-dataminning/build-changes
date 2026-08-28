import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dub extends dsr implements eam.b<eat.b>, eat {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awn> k = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awo.BV);
      $$0.put(2, awo.BW);
      $$0.put(3, awo.BX);
      $$0.put(4, awo.BU);
   });
   private int l;
   private final eat.d m = new dub.a();
   private eat.a n = new eat.a();
   private final eat.b r = new eat.b(this);

   public dub(jh $$0, dvo $$1) {
      super(dst.L, $$0, $$1);
   }

   @Override
   public eat.a gx() {
      return this.n;
   }

   @Override
   public eat.d gy() {
      return this.m;
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alj<vk> $$2 = $$1.a(vb.a);
      if ($$0.b("listener", 10)) {
         eat.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alj<vk> $$2 = $$1.a(vb.a);
      eat.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arr a(@Nullable bui $$0) {
      if ($$0 instanceof arr) {
         return (arr)$$0;
      } else {
         if ($$0 != null) {
            bve $$6 = $$0.cZ();
            if ($$6 instanceof arr) {
               return (arr)$$6;
            }
         }

         if ($$0 instanceof cpk $$3) {
            bui var3 = $$3.s();
            if (var3 instanceof arr) {
               return (arr)var3;
            }
         }

         if ($$0 instanceof ckz $$5) {
            bui var9 = $$5.s();
            if (var9 instanceof arr) {
               return (arr)var9;
            }
         }

         return null;
      }
   }

   public void a(arq $$0, @Nullable arr $$1) {
      if ($$1 != null) {
         dvo $$2 = this.m();
         if (!$$2.c(dpd.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bui)$$1);
            }
         }
      }
   }

   private boolean b(arq $$0, arr $$1) {
      OptionalInt $$2 = cnv.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arq $$0, @Nullable bui $$1) {
      jh $$2 = this.aB_();
      dvo $$3 = this.m();
      $$0.a($$2, $$3.b(dpd.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(eak.N, $$2, eak.a.a($$1));
   }

   private boolean b(arq $$0) {
      return this.m().c(dpd.d) && $$0.ak() != bse.a && $$0.ac().b(dfb.M);
   }

   public void a(arq $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dff)$$0);
         }

         cnt.a($$0, ezr.b(this.aB_()), null, 40);
      }
   }

   private void b(dff $$0) {
      awn $$1 = (awn)k.get(this.l);
      if ($$1 != null) {
         jh $$2 = this.aB_();
         int $$3 = $$2.u() + azn.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azn.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azn.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awp.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arq $$0) {
      return this.l < 4 ? false : bag.a(bup.bm, buo.k, $$0, this.aB_(), 20, 5, 6, bag.a.b).isPresent();
   }

   public eat.b b() {
      return this.r;
   }

   class a implements eat.d {
      private static final int b = 8;
      private final eao c = new eag(dub.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eao b() {
         return this.c;
      }

      @Override
      public axt<eak> c() {
         return axk.c;
      }

      @Override
      public boolean a(arq $$0, jh $$1, jq<eak> $$2, eak.a $$3) {
         return !dub.this.m().c(dpd.b) && dub.a($$3.a()) != null;
      }

      @Override
      public void a(arq $$0, jh $$1, jq<eak> $$2, @Nullable bui $$3, @Nullable bui $$4, float $$5) {
         dub.this.a($$0, dub.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dub.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
