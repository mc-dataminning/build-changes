import java.util.Optional;

public class aeh implements wu<acw> {
   private final Optional<bkq> a;
   private final Optional<bkq> b;

   public aeh(Optional<bkq> $$0, Optional<bkq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aeh(ue $$0) {
      this.a = $$0.b((ue.a<bkq>)($$0x -> $$0x.a(kb.d)));
      this.b = $$0.b((ue.a<bkq>)($$0x -> $$0x.a(kb.d)));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(kb.d, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(kb.d, $$1));
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public Optional<bkq> a() {
      return this.a;
   }

   public Optional<bkq> d() {
      return this.b;
   }
}
