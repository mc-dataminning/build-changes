import java.util.Optional;

public class adk implements wb<aca> {
   private final Optional<bje> a;
   private final Optional<bje> b;

   public adk(Optional<bje> $$0, Optional<bje> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public adk(tl $$0) {
      this.a = $$0.b((tl.a<bje>)($$0x -> $$0x.a(jy.e)));
      this.b = $$0.b((tl.a<bje>)($$0x -> $$0x.a(jy.e)));
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jy.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jy.e, $$1));
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public Optional<bje> a() {
      return this.a;
   }

   public Optional<bje> d() {
      return this.b;
   }
}
