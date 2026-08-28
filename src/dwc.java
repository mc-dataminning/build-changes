import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwc extends dus implements ecr.b<ecy.b>, ecy {
   private static final Logger a = LogUtils.getLogger();
   private ecy.a b;
   private final ecy.b c;
   private final ecy.d d = this.b();
   private int h;

   protected dwc(duu<?> $$0, ji $$1, dxq $$2) {
      super($$0, $$1, $$2);
      this.b = new ecy.a();
      this.c = new ecy.b(this);
   }

   public dwc(ji $$0, dxq $$1) {
      this(duu.J, $$0, $$1);
   }

   public ecy.d b() {
      return new dwc.a(this.aA_());
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      aks<un> $$2 = $$1.a(ue.a);
      if ($$0.b("listener", 10)) {
         ecy.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.b = $$0x);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      aks<un> $$2 = $$1.a(ue.a);
      ecy.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public ecy.a x() {
      return this.b;
   }

   @Override
   public ecy.d gs() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public ecy.b f() {
      return this.c;
   }

   protected class a implements ecy.d {
      public static final int b = 8;
      protected final ji c;
      private final ect a;

      public a(final ji $$1) {
         this.c = $$1;
         this.a = new ecl($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ect b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ecp> $$2, @Nullable ecp.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ecp.f) && !$$2.a(ecp.i) ? drc.q(dwc.this.m()) : false;
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ecp> $$2, @Nullable bva $$3, @Nullable bva $$4, float $$5) {
         dxq $$6 = dwc.this.m();
         if (drc.q($$6)) {
            dwc.this.a(ecy.a_($$2));
            int $$7 = ecy.a_($$5, this.a());
            if ($$6.b() instanceof drc $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dwc.this.d());
            }
         }
      }

      @Override
      public void e() {
         dwc.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
