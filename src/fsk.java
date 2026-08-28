import java.util.OptionalInt;

public class fsk extends frm {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final bac<fsk.a, fsj> c;
   private boolean d = false;

   public fsk(ww $$0, fra $$1) {
      this(0, 0, $$0, $$1);
   }

   public fsk(int $$0, int $$1, ww $$2, fra $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = af.a($$1x -> $$1x.c.isPresent() ? fsj.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : fsj.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fsk c(int $$0) {
      super.a($$0);
      return this;
   }

   public fsk d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fsk e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fsk b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int A() {
      return this.c.a(this.c()).b();
   }

   @Override
   public int y() {
      return this.c.a(this.c()).a() * 9;
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      fsj $$4 = this.c.a(this.c());
      int $$5 = this.F();
      int $$6 = this.G();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.A() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private fsk.a c() {
      return new fsk.a(this.B(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(ww a, int b, OptionalInt c) {
   }
}
