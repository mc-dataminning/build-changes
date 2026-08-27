import java.util.OptionalInt;

public class ete extends esh {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final asp<ete.a, etd> c;
   private boolean d = false;

   public ete(tl $$0, erx $$1) {
      this(0, 0, $$0, $$1);
   }

   public ete(int $$0, int $$1, tl $$2, erx $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? etd.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : etd.a($$3, $$1x.a, $$1x.b));
      this.i = false;
   }

   public ete i(int $$0) {
      super.a($$0);
      return this;
   }

   public ete j(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public ete k(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public ete b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int l() {
      return this.c.a(this.e()).b();
   }

   @Override
   public int i() {
      return this.c.a(this.e()).a() * 9;
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      etd $$4 = this.c.a(this.e());
      int $$5 = this.r();
      int $$6 = this.t();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.l() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private ete.a e() {
      return new ete.a(this.m(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(tl a, int b, OptionalInt c) {
   }
}
