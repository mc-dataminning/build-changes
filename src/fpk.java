import java.util.OptionalInt;

public class fpk extends fol {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final azo<fpk.a, fpj> c;
   private boolean d = false;

   public fpk(wo $$0, fnz $$1) {
      this(0, 0, $$0, $$1);
   }

   public fpk(int $$0, int $$1, wo $$2, fnz $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = af.a($$1x -> $$1x.c.isPresent() ? fpj.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : fpj.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fpk c(int $$0) {
      super.a($$0);
      return this;
   }

   public fpk d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fpk e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fpk b(boolean $$0) {
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
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      fpj $$4 = this.c.a(this.c());
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

   private fpk.a c() {
      return new fpk.a(this.B(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wo a, int b, OptionalInt c) {
   }
}
