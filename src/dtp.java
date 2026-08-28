import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtp extends dsg implements eac.b<eaj.b>, eaj {
   private static final Logger b = LogUtils.getLogger();
   private eaj.a c;
   private final eaj.b d;
   private final eaj.d e = this.b();
   private int h;

   protected dtp(dsi<?> $$0, jg $$1, dvd $$2) {
      super($$0, $$1, $$2);
      this.c = new eaj.a();
      this.d = new eaj.b(this);
   }

   public dtp(jg $$0, dvd $$1) {
      this(dsi.I, $$0, $$1);
   }

   public eaj.d b() {
      return new dtp.a(this.aC_());
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alf<vg> $$2 = $$1.a(ux.a);
      if ($$0.b("listener", 10)) {
         eaj.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      alf<vg> $$2 = $$1.a(ux.a);
      eaj.a.a
         .encodeStart($$2, this.c)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public eaj.a gx() {
      return this.c;
   }

   @Override
   public eaj.d gy() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public eaj.b f() {
      return this.d;
   }

   protected class a implements eaj.d {
      public static final int b = 8;
      protected final jg c;
      private final eae a;

      public a(final jg $$1) {
         this.c = $$1;
         this.a = new dzw($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eae b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arm $$0, jg $$1, jp<eaa> $$2, @Nullable eaa.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(eaa.f) && !$$2.a(eaa.i) ? dor.q(dtp.this.m()) : false;
      }

      @Override
      public void a(arm $$0, jg $$1, jp<eaa> $$2, @Nullable btz $$3, @Nullable btz $$4, float $$5) {
         dvd $$6 = dtp.this.m();
         if (dor.q($$6)) {
            dtp.this.a(eaj.a_($$2));
            int $$7 = eaj.a_($$5, this.a());
            if ($$6.b() instanceof dor $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dtp.this.d());
            }
         }
      }

      @Override
      public void e() {
         dtp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
