import java.util.Optional;

public class aer implements xd<adg> {
   private final Optional<bla> a;
   private final Optional<bla> b;

   public aer(Optional<bla> $$0, Optional<bla> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aer(ug $$0) {
      this.a = $$0.b((ug.a<bla>)($$0x -> $$0x.a(kd.d)));
      this.b = $$0.b((ug.a<bla>)($$0x -> $$0x.a(kd.d)));
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(kd.d, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(kd.d, $$1));
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public Optional<bla> a() {
      return this.a;
   }

   public Optional<bla> d() {
      return this.b;
   }
}
