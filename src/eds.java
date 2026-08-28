import java.util.Optional;

public class eds<FC extends efu> {
   private final Optional<edc<?, ?>> a;
   private final dfd b;
   private final dwl c;
   private final azl d;
   private final je e;
   private final FC f;

   public eds(Optional<edc<?, ?>> $$0, dfd $$1, dwl $$2, azl $$3, je $$4, FC $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public Optional<edc<?, ?>> a() {
      return this.a;
   }

   public dfd b() {
      return this.b;
   }

   public dwl c() {
      return this.c;
   }

   public azl d() {
      return this.d;
   }

   public je e() {
      return this.e;
   }

   public FC f() {
      return this.f;
   }
}
