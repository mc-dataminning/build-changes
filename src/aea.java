import java.util.Optional;

public class aea implements wo<acp> {
   private final Optional<bkg> a;
   private final Optional<bkg> b;

   public aea(Optional<bkg> $$0, Optional<bkg> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aea(ty $$0) {
      this.a = $$0.b((ty.a<bkg>)($$0x -> $$0x.a(kc.e)));
      this.b = $$0.b((ty.a<bkg>)($$0x -> $$0x.a(kc.e)));
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(kc.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(kc.e, $$1));
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public Optional<bkg> a() {
      return this.a;
   }

   public Optional<bkg> d() {
      return this.b;
   }
}
