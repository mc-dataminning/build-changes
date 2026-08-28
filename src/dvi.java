import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvi extends dty implements ebu.b<ecb.b>, ecb {
   private static final Logger a = LogUtils.getLogger();
   private ecb.a b;
   private final ecb.b c;
   private final ecb.d d = this.b();
   private int h;

   protected dvi(dua<?> $$0, ji $$1, dww $$2) {
      super($$0, $$1, $$2);
      this.b = new ecb.a();
      this.c = new ecb.b(this);
   }

   public dvi(ji $$0, dww $$1) {
      this(dua.J, $$0, $$1);
   }

   public ecb.d b() {
      return new dvi.a(this.aA_());
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      akt<un> $$2 = $$1.a(ue.a);
      if ($$0.b("listener", 10)) {
         ecb.a.a
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
      ecb.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public ecb.a gt() {
      return this.b;
   }

   @Override
   public ecb.d gu() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public ecb.b f() {
      return this.c;
   }

   protected class a implements ecb.d {
      public static final int b = 8;
      protected final ji c;
      private final ebw a;

      public a(final ji $$1) {
         this.c = $$1;
         this.a = new ebo($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ebw b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebs> $$2, @Nullable ebs.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ebs.f) && !$$2.a(ebs.i) ? dqj.q(dvi.this.m()) : false;
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ebs> $$2, @Nullable buk $$3, @Nullable buk $$4, float $$5) {
         dww $$6 = dvi.this.m();
         if (dqj.q($$6)) {
            dvi.this.a(ecb.a_($$2));
            int $$7 = ecb.a_($$5, this.a());
            if ($$6.b() instanceof dqj $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dvi.this.d());
            }
         }
      }

      @Override
      public void e() {
         dvi.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
