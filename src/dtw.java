import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtw extends dsm implements eai.b<eap.b>, eap {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awk> k = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awl.BV);
      $$0.put(2, awl.BW);
      $$0.put(3, awl.BX);
      $$0.put(4, awl.BU);
   });
   private int l;
   private final eap.d m = new dtw.a();
   private eap.a n = new eap.a();
   private final eap.b r = new eap.b(this);

   public dtw(jh $$0, dvj $$1) {
      super(dso.L, $$0, $$1);
   }

   @Override
   public eap.a gw() {
      return this.n;
   }

   @Override
   public eap.d gx() {
      return this.m;
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alg<vh> $$2 = $$1.a(uy.a);
      if ($$0.b("listener", 10)) {
         eap.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alg<vh> $$2 = $$1.a(uy.a);
      eap.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aro a(@Nullable bue $$0) {
      if ($$0 instanceof aro) {
         return (aro)$$0;
      } else {
         if ($$0 != null) {
            bva $$6 = $$0.cY();
            if ($$6 instanceof aro) {
               return (aro)$$6;
            }
         }

         if ($$0 instanceof cpg $$3) {
            bue var3 = $$3.s();
            if (var3 instanceof aro) {
               return (aro)var3;
            }
         }

         if ($$0 instanceof ckv $$5) {
            bue var9 = $$5.s();
            if (var9 instanceof aro) {
               return (aro)var9;
            }
         }

         return null;
      }
   }

   public void a(arn $$0, @Nullable aro $$1) {
      if ($$1 != null) {
         dvj $$2 = this.m();
         if (!$$2.c(doy.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bue)$$1);
            }
         }
      }
   }

   private boolean b(arn $$0, aro $$1) {
      OptionalInt $$2 = cnr.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arn $$0, @Nullable bue $$1) {
      jh $$2 = this.aB_();
      dvj $$3 = this.m();
      $$0.a($$2, $$3.b(doy.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(eag.N, $$2, eag.a.a($$1));
   }

   private boolean b(arn $$0) {
      return this.m().c(doy.d) && $$0.ak() != bsa.a && $$0.ac().b(dex.M);
   }

   public void a(arn $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dfb)$$0);
         }

         cnp.a($$0, ezn.b(this.aB_()), null, 40);
      }
   }

   private void b(dfb $$0) {
      awk $$1 = (awk)k.get(this.l);
      if ($$1 != null) {
         jh $$2 = this.aB_();
         int $$3 = $$2.u() + azk.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azk.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azk.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awm.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arn $$0) {
      return this.l < 4 ? false : bad.a(bul.bm, buk.k, $$0, this.aB_(), 20, 5, 6, bad.a.b).isPresent();
   }

   public eap.b b() {
      return this.r;
   }

   class a implements eap.d {
      private static final int b = 8;
      private final eak c = new eac(dtw.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eak b() {
         return this.c;
      }

      @Override
      public axq<eag> c() {
         return axh.c;
      }

      @Override
      public boolean a(arn $$0, jh $$1, jq<eag> $$2, eag.a $$3) {
         return !dtw.this.m().c(doy.b) && dtw.a($$3.a()) != null;
      }

      @Override
      public void a(arn $$0, jh $$1, jq<eag> $$2, @Nullable bue $$3, @Nullable bue $$4, float $$5) {
         dtw.this.a($$0, dtw.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dtw.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
