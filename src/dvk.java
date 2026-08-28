import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvk extends dua implements ebw.b<ecd.b>, ecd {
   private static final Logger a = LogUtils.getLogger();
   private ecd.a b;
   private final ecd.b c;
   private final ecd.d d = this.b();
   private int h;

   protected dvk(duc<?> $$0, ji $$1, dwy $$2) {
      super($$0, $$1, $$2);
      this.b = new ecd.a();
      this.c = new ecd.b(this);
   }

   public dvk(ji $$0, dwy $$1) {
      this(duc.J, $$0, $$1);
   }

   public ecd.d b() {
      return new dvk.a(this.aA_());
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      akt<un> $$2 = $$1.a(ue.a);
      if ($$0.b("listener", 10)) {
         ecd.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.b = $$0x);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      akt<un> $$2 = $$1.a(ue.a);
      ecd.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public ecd.a gt() {
      return this.b;
   }

   @Override
   public ecd.d gu() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public ecd.b f() {
      return this.c;
   }

   protected class a implements ecd.d {
      public static final int b = 8;
      protected final ji c;
      private final eby a;

      public a(final ji $$1) {
         this.c = $$1;
         this.a = new ebq($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eby b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebu> $$2, @Nullable ebu.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ebu.f) && !$$2.a(ebu.i) ? dql.q(dvk.this.m()) : false;
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ebu> $$2, @Nullable bum $$3, @Nullable bum $$4, float $$5) {
         dwy $$6 = dvk.this.m();
         if (dql.q($$6)) {
            dvk.this.a(ecd.a_($$2));
            int $$7 = ecd.a_($$5, this.a());
            if ($$6.b() instanceof dql $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dvk.this.d());
            }
         }
      }

      @Override
      public void e() {
         dvk.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
