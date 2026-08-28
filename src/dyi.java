import javax.annotation.Nullable;

public class dyi extends dwx implements efb.b<efi.b>, efi {
   private efi.a a;
   private final efi.b b;
   private final efi.d c = this.a();
   private int d;

   protected dyi(dwz<?> $$0, iu $$1, dzz $$2) {
      super($$0, $$1, $$2);
      this.a = new efi.a();
      this.b = new efi.b(this);
   }

   public dyi(iu $$0, dzz $$1) {
      this(dwz.J, $$0, $$1);
   }

   public efi.d a() {
      return new dyi.a(this.aw_());
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d = $$0.h("last_vibration_frequency");
      ale<uw> $$2 = $$1.a(un.a);
      this.a = $$0.<efi.a>a("listener", efi.a.a, $$2).orElseGet(efi.a::new);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.d);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("listener", efi.a.a, $$2, this.a);
   }

   @Override
   public efi.a x() {
      return this.a;
   }

   @Override
   public efi.d gq() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public void a(int $$0) {
      this.d = $$0;
   }

   public efi.b f() {
      return this.b;
   }

   protected class a implements efi.d {
      public static final int b = 8;
      protected final iu c;
      private final efd a;

      public a(final iu $$1) {
         this.c = $$1;
         this.a = new eev($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public efd b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<eez> $$2, @Nullable eez.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(eez.f) && !$$2.a(eez.i) ? dta.q(dyi.this.m()) : false;
      }

      @Override
      public void a(arq $$0, iu $$1, je<eez> $$2, @Nullable bwd $$3, @Nullable bwd $$4, float $$5) {
         dzz $$6 = dyi.this.m();
         if (dta.q($$6)) {
            dyi.this.a(efi.a_($$2));
            int $$7 = efi.a_($$5, this.a());
            if ($$6.b() instanceof dta $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dyi.this.d());
            }
         }
      }

      @Override
      public void e() {
         dyi.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
