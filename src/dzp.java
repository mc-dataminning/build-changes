import javax.annotation.Nullable;

public class dzp extends dye implements egi.b<egp.b>, egp {
   private static final int a = 0;
   private egp.a b;
   private final egp.b c;
   private final egp.d d;
   private int e = 0;

   protected dzp(dyg<?> $$0, iw $$1, ebg $$2) {
      super($$0, $$1, $$2);
      this.d = this.a();
      this.b = new egp.a();
      this.c = new egp.b(this);
   }

   public dzp(iw $$0, ebg $$1) {
      this(dyg.J, $$0, $$1);
   }

   public egp.d a() {
      return new dzp.a(this.aB_());
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e = $$0.b("last_vibration_frequency", 0);
      ali<va> $$2 = $$1.a(uo.a);
      this.b = $$0.<egp.a>a("listener", egp.a.a, $$2).orElseGet(egp.a::new);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.e);
      ali<va> $$2 = $$1.a(uo.a);
      $$0.a("listener", egp.a.a, $$2, this.b);
   }

   @Override
   public egp.a x() {
      return this.b;
   }

   @Override
   public egp.d gu() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public egp.b f() {
      return this.c;
   }

   protected class a implements egp.d {
      public static final int b = 8;
      protected final iw c;
      private final egk a;

      public a(final iw $$1) {
         this.c = $$1;
         this.a = new egc($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public egk b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aru $$0, iw $$1, jg<egg> $$2, @Nullable egg.a $$3) {
         if (!$$1.equals(this.c) || !$$2.a(egg.f) && !$$2.a(egg.i)) {
            return egp.a_($$2) == 0 ? false : duf.q(dzp.this.m());
         } else {
            return false;
         }
      }

      @Override
      public void a(aru $$0, iw $$1, jg<egg> $$2, @Nullable bwv $$3, @Nullable bwv $$4, float $$5) {
         ebg $$6 = dzp.this.m();
         if (duf.q($$6)) {
            int $$7 = egp.a_($$2);
            dzp.this.a($$7);
            int $$8 = egp.a_($$5, this.a());
            if ($$6.b() instanceof duf $$9) {
               $$9.a($$3, $$0, this.c, $$6, $$8, $$7);
            }
         }
      }

      @Override
      public void e() {
         dzp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
