import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwh extends dux implements ect.b<eda.b>, eda {
   private static final Logger a = LogUtils.getLogger();
   private eda.a b;
   private final eda.b c;
   private final eda.d d = this.b();
   private int h;

   protected dwh(duz<?> $$0, jh $$1, dxv $$2) {
      super($$0, $$1, $$2);
      this.b = new eda.a();
      this.c = new eda.b(this);
   }

   public dwh(jh $$0, dxv $$1) {
      this(duz.J, $$0, $$1);
   }

   public eda.d b() {
      return new dwh.a(this.aB_());
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alx<vu> $$2 = $$1.a(vl.a);
      if ($$0.b("listener", 10)) {
         eda.a.a
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
      eda.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public eda.a gp() {
      return this.b;
   }

   @Override
   public eda.d gq() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public eda.b f() {
      return this.c;
   }

   protected class a implements eda.d {
      public static final int b = 8;
      protected final jh c;
      private final ecv a;

      public a(final jh $$1) {
         this.c = $$1;
         this.a = new ecn($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ecv b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecr> $$2, @Nullable ecr.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ecr.f) && !$$2.a(ecr.i) ? dri.q(dwh.this.m()) : false;
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecr> $$2, @Nullable bvk $$3, @Nullable bvk $$4, float $$5) {
         dxv $$6 = dwh.this.m();
         if (dri.q($$6)) {
            dwh.this.a(eda.a_($$2));
            int $$7 = eda.a_($$5, this.a());
            if ($$6.b() instanceof dri $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dwh.this.d());
            }
         }
      }

      @Override
      public void e() {
         dwh.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
