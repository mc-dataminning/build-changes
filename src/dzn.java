import javax.annotation.Nullable;

public class dzn extends dyc implements egg.b<egn.b>, egn {
   private static final int a = 0;
   private egn.a b;
   private final egn.b c;
   private final egn.d d;
   private int e = 0;

   protected dzn(dye<?> $$0, iv $$1, ebe $$2) {
      super($$0, $$1, $$2);
      this.d = this.a();
      this.b = new egn.a();
      this.c = new egn.b(this);
   }

   public dzn(iv $$0, ebe $$1) {
      this(dye.J, $$0, $$1);
   }

   public egn.d a() {
      return new dzn.a(this.aB_());
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.e = $$0.b("last_vibration_frequency", 0);
      alg<uy> $$2 = $$1.a(un.a);
      this.b = $$0.<egn.a>a("listener", egn.a.a, $$2).orElseGet(egn.a::new);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.e);
      alg<uy> $$2 = $$1.a(un.a);
      $$0.a("listener", egn.a.a, $$2, this.b);
   }

   @Override
   public egn.a x() {
      return this.b;
   }

   @Override
   public egn.d gu() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public egn.b f() {
      return this.c;
   }

   protected class a implements egn.d {
      public static final int b = 8;
      protected final iv c;
      private final egi a;

      public a(final iv $$1) {
         this.c = $$1;
         this.a = new ega($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public egi b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ars $$0, iv $$1, jf<ege> $$2, @Nullable ege.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ege.f) && !$$2.a(ege.i) ? dud.q(dzn.this.m()) : false;
      }

      @Override
      public void a(ars $$0, iv $$1, jf<ege> $$2, @Nullable bwt $$3, @Nullable bwt $$4, float $$5) {
         ebe $$6 = dzn.this.m();
         if (dud.q($$6)) {
            dzn.this.a(egn.a_($$2));
            int $$7 = egn.a_($$5, this.a());
            if ($$6.b() instanceof dud $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dzn.this.d());
            }
         }
      }

      @Override
      public void e() {
         dzn.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
