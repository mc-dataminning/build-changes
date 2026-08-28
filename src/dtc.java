import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtc extends drs implements dzn.b<dzu.b>, dzu {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awd> k = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awe.BX);
      $$0.put(2, awe.BY);
      $$0.put(3, awe.BZ);
      $$0.put(4, awe.BW);
   });
   private int l;
   private final dzu.d m = new dtc.a();
   private dzu.a n = new dzu.a();
   private final dzu.b r = new dzu.b(this);

   public dtc(je $$0, duo $$1) {
      super(dru.L, $$0, $$1);
   }

   @Override
   public dzu.a gr() {
      return this.n;
   }

   @Override
   public dzu.d gs() {
      return this.m;
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      ala<vc> $$2 = $$1.a(ut.a);
      if ($$0.b("listener", 10)) {
         dzu.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      ala<vc> $$2 = $$1.a(ut.a);
      dzu.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static ari a(@Nullable bto $$0) {
      if ($$0 instanceof ari) {
         return (ari)$$0;
      } else {
         if ($$0 != null) {
            buk $$6 = $$0.cU();
            if ($$6 instanceof ari) {
               return (ari)$$6;
            }
         }

         if ($$0 instanceof coo $$3) {
            bto var3 = $$3.s();
            if (var3 instanceof ari) {
               return (ari)var3;
            }
         }

         if ($$0 instanceof cke $$5) {
            bto var9 = $$5.s();
            if (var9 instanceof ari) {
               return (ari)var9;
            }
         }

         return null;
      }
   }

   public void a(arh $$0, @Nullable ari $$1) {
      if ($$1 != null) {
         duo $$2 = this.m();
         if (!$$2.c(doe.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bto)$$1);
            }
         }
      }
   }

   private boolean b(arh $$0, ari $$1) {
      OptionalInt $$2 = cna.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arh $$0, @Nullable bto $$1) {
      je $$2 = this.aB_();
      duo $$3 = this.m();
      $$0.a($$2, $$3.b(doe.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dzl.N, $$2, dzl.a.a($$1));
   }

   private boolean b(arh $$0) {
      return this.m().c(doe.d) && $$0.am() != brm.a && $$0.ac().b(dec.M);
   }

   public void a(arh $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((deg)$$0);
         }

         cmy.a($$0, eys.b(this.aB_()), null, 40);
      }
   }

   private void b(deg $$0) {
      awd $$1 = (awd)k.get(this.l);
      if ($$1 != null) {
         je $$2 = this.aB_();
         int $$3 = $$2.u() + azd.b($$0.z, -10, 10);
         int $$4 = $$2.v() + azd.b($$0.z, -10, 10);
         int $$5 = $$2.w() + azd.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awf.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arh $$0) {
      return this.l < 4 ? false : azw.a(btv.bm, btu.k, $$0, this.aB_(), 20, 5, 6, azw.a.b).isPresent();
   }

   public dzu.b b() {
      return this.r;
   }

   class a implements dzu.d {
      private static final int b = 8;
      private final dzp c = new dzh(dtc.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dzp b() {
         return this.c;
      }

      @Override
      public axj<dzl> c() {
         return axa.c;
      }

      @Override
      public boolean a(arh $$0, je $$1, jn<dzl> $$2, dzl.a $$3) {
         return !dtc.this.m().c(doe.b) && dtc.a($$3.a()) != null;
      }

      @Override
      public void a(arh $$0, je $$1, jn<dzl> $$2, @Nullable bto $$3, @Nullable bto $$4, float $$5) {
         dtc.this.a($$0, dtc.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dtc.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
