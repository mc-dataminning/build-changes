import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwg extends duw implements ecs.b<ecz.b>, ecz {
   private static final Logger a = LogUtils.getLogger();
   private ecz.a b;
   private final ecz.b c;
   private final ecz.d d = this.b();
   private int h;

   protected dwg(duy<?> $$0, jh $$1, dxu $$2) {
      super($$0, $$1, $$2);
      this.b = new ecz.a();
      this.c = new ecz.b(this);
   }

   public dwg(jh $$0, dxu $$1) {
      this(duy.J, $$0, $$1);
   }

   public ecz.d b() {
      return new dwg.a(this.aB_());
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alx<vu> $$2 = $$1.a(vl.a);
      if ($$0.b("listener", 10)) {
         ecz.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.b = $$0x);
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      alx<vu> $$2 = $$1.a(vl.a);
      ecz.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public ecz.a gn() {
      return this.b;
   }

   @Override
   public ecz.d go() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public ecz.b f() {
      return this.c;
   }

   protected class a implements ecz.d {
      public static final int b = 8;
      protected final jh c;
      private final ecu a;

      public a(final jh $$1) {
         this.c = $$1;
         this.a = new ecm($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ecu b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecq> $$2, @Nullable ecq.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ecq.f) && !$$2.a(ecq.i) ? drh.q(dwg.this.m()) : false;
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecq> $$2, @Nullable bvj $$3, @Nullable bvj $$4, float $$5) {
         dxu $$6 = dwg.this.m();
         if (drh.q($$6)) {
            dwg.this.a(ecz.a_($$2));
            int $$7 = ecz.a_($$5, this.a());
            if ($$6.b() instanceof drh $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dwg.this.d());
            }
         }
      }

      @Override
      public void e() {
         dwg.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
