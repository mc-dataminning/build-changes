import java.util.Optional;

public class aeu implements xf<adj> {
   private final Optional<blg> a;
   private final Optional<blg> b;

   public aeu(Optional<blg> $$0, Optional<blg> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aeu(ui $$0) {
      this.a = $$0.b((ui.a<blg>)($$0x -> $$0x.a(kd.d)));
      this.b = $$0.b((ui.a<blg>)($$0x -> $$0x.a(kd.d)));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(kd.d, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(kd.d, $$1));
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public Optional<blg> a() {
      return this.a;
   }

   public Optional<blg> d() {
      return this.b;
   }
}
