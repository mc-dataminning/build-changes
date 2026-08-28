import java.util.OptionalInt;

public class ftp extends fsr {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final bae<ftp.a, fto> c;
   private boolean d = false;

   public ftp(wy $$0, fsf $$1) {
      this(0, 0, $$0, $$1);
   }

   public ftp(int $$0, int $$1, wy $$2, fsf $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ag.a($$1x -> $$1x.c.isPresent() ? fto.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : fto.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public ftp c(int $$0) {
      super.a($$0);
      return this;
   }

   public ftp d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public ftp e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public ftp b(boolean $$0) {
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
   public void b(fsh $$0, int $$1, int $$2, float $$3) {
      fto $$4 = this.c.a(this.c());
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

   private ftp.a c() {
      return new ftp.a(this.B(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wy a, int b, OptionalInt c) {
   }
}
