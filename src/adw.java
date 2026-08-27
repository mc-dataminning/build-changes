import java.util.Optional;

public class adw implements wk<acl> {
   private final Optional<bkb> a;
   private final Optional<bkb> b;

   public adw(Optional<bkb> $$0, Optional<bkb> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public adw(tu $$0) {
      this.a = $$0.b((tu.a<bkb>)($$0x -> $$0x.a(jy.e)));
      this.b = $$0.b((tu.a<bkb>)($$0x -> $$0x.a(jy.e)));
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jy.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jy.e, $$1));
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public Optional<bkb> a() {
      return this.a;
   }

   public Optional<bkb> d() {
      return this.b;
   }
}
