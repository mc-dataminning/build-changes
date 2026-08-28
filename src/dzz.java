import javax.annotation.Nullable;

public class dzz extends dyo implements egs.b<egz.b>, egz {
   private static final int a = 0;
   private egz.a b;
   private final egz.b c;
   private final egz.d d;
   private int e = 0;

   protected dzz(dyq<?> $$0, iw $$1, ebq $$2) {
      super($$0, $$1, $$2);
      this.d = this.a();
      this.b = new egz.a();
      this.c = new egz.b(this);
   }

   public dzz(iw $$0, ebq $$1) {
      this(dyq.J, $$0, $$1);
   }

   public egz.d a() {
      return new dzz.a(this.ax_());
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e = $$0.b("last_vibration_frequency", 0);
      alp<va> $$2 = $$1.a(uo.a);
      this.b = $$0.<egz.a>a("listener", egz.a.a, $$2).orElseGet(egz.a::new);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.e);
      alp<va> $$2 = $$1.a(uo.a);
      $$0.a("listener", egz.a.a, $$2, this.b);
   }

   @Override
   public egz.a gw() {
      return this.b;
   }

   @Override
   public egz.d gx() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public egz.b f() {
      return this.c;
   }

   protected class a implements egz.d {
      public static final int b = 8;
      protected final iw c;
      private final egu a;

      public a(final iw $$1) {
         this.c = $$1;
         this.a = new egm($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public egu b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(asb $$0, iw $$1, jg<egq> $$2, @Nullable egq.a $$3) {
         if (!$$1.equals(this.c) || !$$2.a(egq.f) && !$$2.a(egq.i)) {
            return egz.a_($$2) == 0 ? false : dup.q(dzz.this.m());
         } else {
            return false;
         }
      }

      @Override
      public void a(asb $$0, iw $$1, jg<egq> $$2, @Nullable bxe $$3, @Nullable bxe $$4, float $$5) {
         ebq $$6 = dzz.this.m();
         if (dup.q($$6)) {
            int $$7 = egz.a_($$2);
            dzz.this.a($$7);
            int $$8 = egz.a_($$5, this.a());
            if ($$6.b() instanceof dup $$9) {
               $$9.a($$3, $$0, this.c, $$6, $$8, $$7);
            }
         }
      }

      @Override
      public void e() {
         dzz.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
