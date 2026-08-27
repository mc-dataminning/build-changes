import java.util.Optional;

public class aan implements uo<zb> {
   private final Optional<bey> a;
   private final Optional<bey> b;

   public aan(Optional<bey> $$0, Optional<bey> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aan(sf $$0) {
      this.a = $$0.b($$0x -> $$0x.a(jb.e));
      this.b = $$0.b($$0x -> $$0x.a(jb.e));
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jb.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jb.e, $$1));
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public Optional<bey> a() {
      return this.a;
   }

   public Optional<bey> c() {
      return this.b;
   }
}
