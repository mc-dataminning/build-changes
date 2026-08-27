import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dou extends dnm implements dvc.b<dvj.b>, dvj {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avb> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avc.BC);
      $$0.put(2, avc.BD);
      $$0.put(3, avc.BE);
      $$0.put(4, avc.BB);
   });
   private int l;
   private final dvj.d m = new dou.a();
   private dvj.a q = new dvj.a();
   private final dvj.b r = new dvj.b(this);

   public dou(in $$0, dqh $$1) {
      super(dno.L, $$0, $$1);
   }

   @Override
   public dvj.a gr() {
      return this.q;
   }

   @Override
   public dvj.d gs() {
      return this.m;
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dvj.a.a.parse(new Dynamic(uo.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dvj.a.a.encodeStart(uo.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqi a(@Nullable brh $$0) {
      if ($$0 instanceof aqi) {
         return (aqi)$$0;
      } else {
         if ($$0 != null) {
            bsa $$6 = $$0.cO();
            if ($$6 instanceof aqi) {
               return (aqi)$$6;
            }
         }

         if ($$0 instanceof clz $$3) {
            brh var3 = $$3.u();
            if (var3 instanceof aqi) {
               return (aqi)var3;
            }
         }

         if ($$0 instanceof chr $$5) {
            brh var9 = $$5.u();
            if (var9 instanceof aqi) {
               return (aqi)var9;
            }
         }

         return null;
      }
   }

   public void a(aqh $$0, @Nullable aqi $$1) {
      if ($$1 != null) {
         dqh $$2 = this.n();
         if (!$$2.c(djy.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (brh)$$1);
            }
         }
      }
   }

   private boolean b(aqh $$0, aqi $$1) {
      OptionalInt $$2 = ckn.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqh $$0, @Nullable brh $$1) {
      in $$2 = this.az_();
      dqh $$3 = this.n();
      $$0.a($$2, $$3.a(djy.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dva.N, $$2, dva.a.a($$1));
   }

   private boolean b(aqh $$0) {
      return this.n().c(djy.d) && $$0.ak() != bpj.a && $$0.aa().b(czz.M);
   }

   public void a(aqh $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dad)$$0);
         }

         ckl.a($$0, etp.b(this.az_()), null, 40);
      }
   }

   private void b(dad $$0) {
      avb $$1 = (avb)k.get(this.l);
      if ($$1 != null) {
         in $$2 = this.az_();
         int $$3 = $$2.u() + axz.b($$0.z, -10, 10);
         int $$4 = $$2.v() + axz.b($$0.z, -10, 10);
         int $$5 = $$2.w() + axz.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avd.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqh $$0) {
      return this.l < 4 ? false : ayr.a(brn.bl, bse.k, $$0, this.az_(), 20, 5, 6, ayr.a.b).isPresent();
   }

   public dvj.b b() {
      return this.r;
   }

   class a implements dvj.d {
      private static final int b = 8;
      private final dve c = new duw(dou.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dve b() {
         return this.c;
      }

      @Override
      public awg<dva> c() {
         return avx.c;
      }

      @Override
      public boolean a(aqh $$0, in $$1, iw<dva> $$2, dva.a $$3) {
         return !dou.this.n().c(djy.b) && dou.a($$3.a()) != null;
      }

      @Override
      public void a(aqh $$0, in $$1, iw<dva> $$2, @Nullable brh $$3, @Nullable brh $$4, float $$5) {
         dou.this.a($$0, dou.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dou.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
