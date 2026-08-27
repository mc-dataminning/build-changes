import java.util.Optional;

public class aco implements vf<abe> {
   private final Optional<bid> a;
   private final Optional<bid> b;

   public aco(Optional<bid> $$0, Optional<bid> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aco(sq $$0) {
      this.a = $$0.b((sq.a<bid>)($$0x -> $$0x.a(jd.e)));
      this.b = $$0.b((sq.a<bid>)($$0x -> $$0x.a(jd.e)));
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jd.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jd.e, $$1));
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public Optional<bid> a() {
      return this.a;
   }

   public Optional<bid> d() {
      return this.b;
   }
}
