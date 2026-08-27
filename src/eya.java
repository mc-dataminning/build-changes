import java.util.OptionalInt;

public class eya extends exd {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final avf<eya.a, exz> c;
   private boolean d = false;

   public eya(vf $$0, ews $$1) {
      this(0, 0, $$0, $$1);
   }

   public eya(int $$0, int $$1, vf $$2, ews $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? exz.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : exz.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public eya b(int $$0) {
      super.a($$0);
      return this;
   }

   public eya c(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public eya d(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public eya b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int w() {
      return this.c.a(this.d()).b();
   }

   @Override
   public int u() {
      return this.c.a(this.d()).a() * 9;
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      exz $$4 = this.c.a(this.d());
      int $$5 = this.B();
      int $$6 = this.C();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.w() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private eya.a d() {
      return new eya.a(this.x(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(vf a, int b, OptionalInt c) {
   }
}
