import java.util.Optional;

public class adu implements wk<acj> {
   private final Optional<bjt> a;
   private final Optional<bjt> b;

   public adu(Optional<bjt> $$0, Optional<bjt> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public adu(tu $$0) {
      this.a = $$0.b((tu.a<bjt>)($$0x -> $$0x.a(jy.e)));
      this.b = $$0.b((tu.a<bjt>)($$0x -> $$0x.a(jy.e)));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jy.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jy.e, $$1));
   }

   public void a(acj $$0) {
      $$0.a(this);
   }

   public Optional<bjt> a() {
      return this.a;
   }

   public Optional<bjt> d() {
      return this.b;
   }
}
