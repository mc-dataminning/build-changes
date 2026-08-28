import java.util.OptionalInt;

public class fsw extends fry {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final bae<fsw.a, fsv> c;
   private boolean d = false;

   public fsw(wy $$0, frm $$1) {
      this(0, 0, $$0, $$1);
   }

   public fsw(int $$0, int $$1, wy $$2, frm $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = af.a($$1x -> $$1x.c.isPresent() ? fsv.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : fsv.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fsw c(int $$0) {
      super.a($$0);
      return this;
   }

   public fsw d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fsw e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fsw b(boolean $$0) {
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
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      fsv $$4 = this.c.a(this.c());
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

   private fsw.a c() {
      return new fsw.a(this.B(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wy a, int b, OptionalInt c) {
   }
}
