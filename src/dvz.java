import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvz extends dup implements ecl.b<ecs.b>, ecs {
   private static final Logger a = LogUtils.getLogger();
   private ecs.a b;
   private final ecs.b c;
   private final ecs.d d = this.b();
   private int h;

   protected dvz(dur<?> $$0, jh $$1, dxn $$2) {
      super($$0, $$1, $$2);
      this.b = new ecs.a();
      this.c = new ecs.b(this);
   }

   public dvz(jh $$0, dxn $$1) {
      this(dur.J, $$0, $$1);
   }

   public ecs.d b() {
      return new dvz.a(this.aB_());
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alx<vu> $$2 = $$1.a(vl.a);
      if ($$0.b("listener", 10)) {
         ecs.a.a
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
      ecs.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public ecs.a gn() {
      return this.b;
   }

   @Override
   public ecs.d go() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public ecs.b f() {
      return this.c;
   }

   protected class a implements ecs.d {
      public static final int b = 8;
      protected final jh c;
      private final ecn a;

      public a(final jh $$1) {
         this.c = $$1;
         this.a = new ecf($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ecn b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecj> $$2, @Nullable ecj.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ecj.f) && !$$2.a(ecj.i) ? dra.q(dvz.this.m()) : false;
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecj> $$2, @Nullable bvf $$3, @Nullable bvf $$4, float $$5) {
         dxn $$6 = dvz.this.m();
         if (dra.q($$6)) {
            dvz.this.a(ecs.a_($$2));
            int $$7 = ecs.a_($$5, this.a());
            if ($$6.b() instanceof dra $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dvz.this.d());
            }
         }
      }

      @Override
      public void e() {
         dvz.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
