import java.util.Optional;

public class acf implements uw<aav> {
   private final Optional<bhr> a;
   private final Optional<bhr> b;

   public acf(Optional<bhr> $$0, Optional<bhr> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acf(sh $$0) {
      this.a = $$0.b((sh.a<bhr>)($$0x -> $$0x.a(jc.e)));
      this.b = $$0.b((sh.a<bhr>)($$0x -> $$0x.a(jc.e)));
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jc.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jc.e, $$1));
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public Optional<bhr> a() {
      return this.a;
   }

   public Optional<bhr> d() {
      return this.b;
   }
}
