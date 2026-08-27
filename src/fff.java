import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fff(dnd a, io<dkg> b, dna c, ij<agp> d, agq e, csl f) {
   public fff(dnb $$0, ij<agp> $$1, agq $$2, csl $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fff(dnd $$0, dna $$1, ij<agp> $$2, agq $$3, csl $$4) {
      this($$0, $$2.a(agp.c).d(jz.aK), $$1, $$2.a(agp.c), $$3, $$4);
   }

   public fff a(dnd $$0, dna $$1) {
      return new fff($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fff a(fff.b $$0) {
      return new fff($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fff a(fff.a $$0) {
      return new fff(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public ip.b a() {
      return this.d.a();
   }

   public dnd b() {
      return this.a;
   }

   public io<dkg> c() {
      return this.b;
   }

   public dna d() {
      return this.c;
   }

   public ij<agp> e() {
      return this.d;
   }

   public agq f() {
      return this.e;
   }

   public csl g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<ip.b, dna, dna> {
   }

   public interface b extends UnaryOperator<dnd> {
   }
}
