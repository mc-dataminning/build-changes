import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvj extends dtz implements ebv.b<ecc.b>, ecc {
   private static final Logger a = LogUtils.getLogger();
   private ecc.a b;
   private final ecc.b c;
   private final ecc.d d = this.b();
   private int h;

   protected dvj(dub<?> $$0, ji $$1, dwx $$2) {
      super($$0, $$1, $$2);
      this.b = new ecc.a();
      this.c = new ecc.b(this);
   }

   public dvj(ji $$0, dwx $$1) {
      this(dub.J, $$0, $$1);
   }

   public ecc.d b() {
      return new dvj.a(this.aA_());
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      aks<un> $$2 = $$1.a(ue.a);
      if ($$0.b("listener", 10)) {
         ecc.a.a
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
      ecc.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public ecc.a gq() {
      return this.b;
   }

   @Override
   public ecc.d gr() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public ecc.b f() {
      return this.c;
   }

   protected class a implements ecc.d {
      public static final int b = 8;
      protected final ji c;
      private final ebx a;

      public a(final ji $$1) {
         this.c = $$1;
         this.a = new ebp($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ebx b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arc $$0, ji $$1, jr<ebt> $$2, @Nullable ebt.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ebt.f) && !$$2.a(ebt.i) ? dqk.q(dvj.this.m()) : false;
      }

      @Override
      public void a(arc $$0, ji $$1, jr<ebt> $$2, @Nullable buk $$3, @Nullable buk $$4, float $$5) {
         dwx $$6 = dvj.this.m();
         if (dqk.q($$6)) {
            dvj.this.a(ecc.a_($$2));
            int $$7 = ecc.a_($$5, this.a());
            if ($$6.b() instanceof dqk $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dvj.this.d());
            }
         }
      }

      @Override
      public void e() {
         dvj.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
