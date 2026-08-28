import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drp extends dqh implements dyb.b<dyi.b>, dyi {
   private static final Logger b = LogUtils.getLogger();
   private dyi.a c;
   private final dyi.b d;
   private final dyi.d e = this.b();
   private int h;

   protected drp(dqj<?> $$0, jd $$1, dtc $$2) {
      super($$0, $$1, $$2);
      this.c = new dyi.a();
      this.d = new dyi.b(this);
   }

   public drp(jd $$0, dtc $$1) {
      this(dqj.I, $$0, $$1);
   }

   public dyi.d b() {
      return new drp.a(this.aD_());
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      akp<uy> $$2 = $$1.a(up.a);
      if ($$0.b("listener", 10)) {
         dyi.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      akp<uy> $$2 = $$1.a(up.a);
      dyi.a.a
         .encodeStart($$2, this.c)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dyi.a gn() {
      return this.c;
   }

   @Override
   public dyi.d go() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dyi.b f() {
      return this.d;
   }

   protected class a implements dyi.d {
      public static final int b = 8;
      protected final jd c;
      private final dyd a;

      public a(final jd $$1) {
         this.c = $$1;
         this.a = new dxv($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dyd b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqu $$0, jd $$1, jm<dxz> $$2, @Nullable dxz.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dxz.f) && !$$2.a(dxz.i) ? dms.n(drp.this.n()) : false;
      }

      @Override
      public void a(aqu $$0, jd $$1, jm<dxz> $$2, @Nullable bsr $$3, @Nullable bsr $$4, float $$5) {
         dtc $$6 = drp.this.n();
         if (dms.n($$6)) {
            drp.this.a(dyi.a_($$2));
            int $$7 = dyi.a_($$5, this.a());
            if ($$6.b() instanceof dms $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, drp.this.d());
            }
         }
      }

      @Override
      public void e() {
         drp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
