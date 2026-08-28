import javax.annotation.Nullable;

public class dyx extends dxm implements efq.b<efx.b>, efx {
   private efx.a a;
   private final efx.b b;
   private final efx.d c = this.a();
   private int d;

   protected dyx(dxo<?> $$0, iv $$1, eao $$2) {
      super($$0, $$1, $$2);
      this.a = new efx.a();
      this.b = new efx.b(this);
   }

   public dyx(iv $$0, eao $$1) {
      this(dxo.J, $$0, $$1);
   }

   public efx.d a() {
      return new dyx.a(this.ax_());
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.d = $$0.f("last_vibration_frequency");
      ale<uw> $$2 = $$1.a(un.a);
      this.a = $$0.<efx.a>a("listener", efx.a.a, $$2).orElseGet(efx.a::new);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.d);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("listener", efx.a.a, $$2, this.a);
   }

   @Override
   public efx.a x() {
      return this.a;
   }

   @Override
   public efx.d gt() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public void a(int $$0) {
      this.d = $$0;
   }

   public efx.b f() {
      return this.b;
   }

   protected class a implements efx.d {
      public static final int b = 8;
      protected final iv c;
      private final efs a;

      public a(final iv $$1) {
         this.c = $$1;
         this.a = new efk($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public efs b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, iv $$1, jf<efo> $$2, @Nullable efo.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(efo.f) && !$$2.a(efo.i) ? dtn.q(dyx.this.m()) : false;
      }

      @Override
      public void a(arq $$0, iv $$1, jf<efo> $$2, @Nullable bwi $$3, @Nullable bwi $$4, float $$5) {
         eao $$6 = dyx.this.m();
         if (dtn.q($$6)) {
            dyx.this.a(efx.a_($$2));
            int $$7 = efx.a_($$5, this.a());
            if ($$6.b() instanceof dtn $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dyx.this.d());
            }
         }
      }

      @Override
      public void e() {
         dyx.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
