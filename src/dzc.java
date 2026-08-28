import javax.annotation.Nullable;

public class dzc extends dxr implements efv.b<egc.b>, egc {
   private egc.a a;
   private final egc.b b;
   private final egc.d c = this.a();
   private int d;

   protected dzc(dxt<?> $$0, iv $$1, eat $$2) {
      super($$0, $$1, $$2);
      this.a = new egc.a();
      this.b = new egc.b(this);
   }

   public dzc(iv $$0, eat $$1) {
      this(dxt.J, $$0, $$1);
   }

   public egc.d a() {
      return new dzc.a(this.ax_());
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.d = $$0.f("last_vibration_frequency");
      ale<uw> $$2 = $$1.a(un.a);
      this.a = $$0.<egc.a>a("listener", egc.a.a, $$2).orElseGet(egc.a::new);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.d);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("listener", egc.a.a, $$2, this.a);
   }

   @Override
   public egc.a x() {
      return this.a;
   }

   @Override
   public egc.d gt() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public void a(int $$0) {
      this.d = $$0;
   }

   public egc.b f() {
      return this.b;
   }

   protected class a implements egc.d {
      public static final int b = 8;
      protected final iv c;
      private final efx a;

      public a(final iv $$1) {
         this.c = $$1;
         this.a = new efp($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public efx b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, iv $$1, jf<eft> $$2, @Nullable eft.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(eft.f) && !$$2.a(eft.i) ? dts.q(dzc.this.m()) : false;
      }

      @Override
      public void a(arq $$0, iv $$1, jf<eft> $$2, @Nullable bwi $$3, @Nullable bwi $$4, float $$5) {
         eat $$6 = dzc.this.m();
         if (dts.q($$6)) {
            dzc.this.a(egc.a_($$2));
            int $$7 = egc.a_($$5, this.a());
            if ($$6.b() instanceof dts $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dzc.this.d());
            }
         }
      }

      @Override
      public void e() {
         dzc.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
