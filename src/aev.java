import java.util.Optional;

public record aev(Optional<ih<blh>> a, Optional<ih<blh>> b) implements xg<adk> {
   public aev(uj $$0) {
      this($$0.b((uj.a<ih<blh>>)($$0x -> $$0x.a(kd.d.t()))), $$0.b((uj.a<ih<blh>>)($$0x -> $$0x.a(kd.d.t()))));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(kd.d.t(), $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(kd.d.t(), $$1));
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public Optional<ih<blh>> d() {
      return this.b;
   }
}
