import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvh extends dtx implements ebt.b<eca.b>, eca {
   private static final Logger a = LogUtils.getLogger();
   private eca.a b;
   private final eca.b c;
   private final eca.d d = this.b();
   private int h;

   protected dvh(dtz<?> $$0, ji $$1, dwv $$2) {
      super($$0, $$1, $$2);
      this.b = new eca.a();
      this.c = new eca.b(this);
   }

   public dvh(ji $$0, dwv $$1) {
      this(dtz.J, $$0, $$1);
   }

   public eca.d b() {
      return new dvh.a(this.aA_());
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      aks<un> $$2 = $$1.a(ue.a);
      if ($$0.b("listener", 10)) {
         eca.a.a
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
      eca.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public eca.a gq() {
      return this.b;
   }

   @Override
   public eca.d gr() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public eca.b f() {
      return this.c;
   }

   protected class a implements eca.d {
      public static final int b = 8;
      protected final ji c;
      private final ebv a;

      public a(final ji $$1) {
         this.c = $$1;
         this.a = new ebn($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ebv b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arc $$0, ji $$1, jr<ebr> $$2, @Nullable ebr.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ebr.f) && !$$2.a(ebr.i) ? dqi.q(dvh.this.m()) : false;
      }

      @Override
      public void a(arc $$0, ji $$1, jr<ebr> $$2, @Nullable buj $$3, @Nullable buj $$4, float $$5) {
         dwv $$6 = dvh.this.m();
         if (dqi.q($$6)) {
            dvh.this.a(eca.a_($$2));
            int $$7 = eca.a_($$5, this.a());
            if ($$6.b() instanceof dqi $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dvh.this.d());
            }
         }
      }

      @Override
      public void e() {
         dvh.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
