import java.util.Optional;

public class acn implements ve<abd> {
   private final Optional<bih> a;
   private final Optional<bih> b;

   public acn(Optional<bih> $$0, Optional<bih> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acn(so $$0) {
      this.a = $$0.b((so.a<bih>)($$0x -> $$0x.a(jb.e)));
      this.b = $$0.b((so.a<bih>)($$0x -> $$0x.a(jb.e)));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jb.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jb.e, $$1));
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public Optional<bih> a() {
      return this.a;
   }

   public Optional<bih> d() {
      return this.b;
   }
}
