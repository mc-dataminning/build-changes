import java.util.Optional;

public class ach implements ux<aaw> {
   private final Optional<bht> a;
   private final Optional<bht> b;

   public ach(Optional<bht> $$0, Optional<bht> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ach(si $$0) {
      this.a = $$0.b((si.a<bht>)($$0x -> $$0x.a(jb.e)));
      this.b = $$0.b((si.a<bht>)($$0x -> $$0x.a(jb.e)));
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jb.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jb.e, $$1));
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public Optional<bht> a() {
      return this.a;
   }

   public Optional<bht> d() {
      return this.b;
   }
}
