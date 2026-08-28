import javax.annotation.Nullable;

public class dyq extends dxf implements efj.b<efq.b>, efq {
   private efq.a a;
   private final efq.b b;
   private final efq.d c = this.a();
   private int d;

   protected dyq(dxh<?> $$0, iu $$1, eah $$2) {
      super($$0, $$1, $$2);
      this.a = new efq.a();
      this.b = new efq.b(this);
   }

   public dyq(iu $$0, eah $$1) {
      this(dxh.J, $$0, $$1);
   }

   public efq.d a() {
      return new dyq.a(this.ax_());
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d = $$0.h("last_vibration_frequency");
      ale<uw> $$2 = $$1.a(un.a);
      this.a = $$0.<efq.a>a("listener", efq.a.a, $$2).orElseGet(efq.a::new);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.d);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("listener", efq.a.a, $$2, this.a);
   }

   @Override
   public efq.a x() {
      return this.a;
   }

   @Override
   public efq.d gr() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public void a(int $$0) {
      this.d = $$0;
   }

   public efq.b f() {
      return this.b;
   }

   protected class a implements efq.d {
      public static final int b = 8;
      protected final iu c;
      private final efl a;

      public a(final iu $$1) {
         this.c = $$1;
         this.a = new efd($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public efl b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<efh> $$2, @Nullable efh.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(efh.f) && !$$2.a(efh.i) ? dtg.q(dyq.this.m()) : false;
      }

      @Override
      public void a(arq $$0, iu $$1, je<efh> $$2, @Nullable bwf $$3, @Nullable bwf $$4, float $$5) {
         eah $$6 = dyq.this.m();
         if (dtg.q($$6)) {
            dyq.this.a(efq.a_($$2));
            int $$7 = efq.a_($$5, this.a());
            if ($$6.b() instanceof dtg $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dyq.this.d());
            }
         }
      }

      @Override
      public void e() {
         dyq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
