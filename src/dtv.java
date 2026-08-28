import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtv extends dsm implements eai.b<eap.b>, eap {
   private static final Logger b = LogUtils.getLogger();
   private eap.a c;
   private final eap.b d;
   private final eap.d e = this.b();
   private int h;

   protected dtv(dso<?> $$0, jh $$1, dvj $$2) {
      super($$0, $$1, $$2);
      this.c = new eap.a();
      this.d = new eap.b(this);
   }

   public dtv(jh $$0, dvj $$1) {
      this(dso.I, $$0, $$1);
   }

   public eap.d b() {
      return new dtv.a(this.aB_());
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alg<vh> $$2 = $$1.a(uy.a);
      if ($$0.b("listener", 10)) {
         eap.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      alg<vh> $$2 = $$1.a(uy.a);
      eap.a.a
         .encodeStart($$2, this.c)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public eap.a gw() {
      return this.c;
   }

   @Override
   public eap.d gx() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public eap.b f() {
      return this.d;
   }

   protected class a implements eap.d {
      public static final int b = 8;
      protected final jh c;
      private final eak a;

      public a(final jh $$1) {
         this.c = $$1;
         this.a = new eac($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eak b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arn $$0, jh $$1, jq<eag> $$2, @Nullable eag.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(eag.f) && !$$2.a(eag.i) ? dox.q(dtv.this.m()) : false;
      }

      @Override
      public void a(arn $$0, jh $$1, jq<eag> $$2, @Nullable bue $$3, @Nullable bue $$4, float $$5) {
         dvj $$6 = dtv.this.m();
         if (dox.q($$6)) {
            dtv.this.a(eap.a_($$2));
            int $$7 = eap.a_($$5, this.a());
            if ($$6.b() instanceof dox $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dtv.this.d());
            }
         }
      }

      @Override
      public void e() {
         dtv.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
