import java.util.Optional;

public class aeu implements xf<adj> {
   private final Optional<blf> a;
   private final Optional<blf> b;

   public aeu(Optional<blf> $$0, Optional<blf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aeu(ui $$0) {
      this.a = $$0.b((ui.a<blf>)($$0x -> $$0x.a(kd.d)));
      this.b = $$0.b((ui.a<blf>)($$0x -> $$0x.a(kd.d)));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(kd.d, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(kd.d, $$1));
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public Optional<blf> a() {
      return this.a;
   }

   public Optional<blf> d() {
      return this.b;
   }
}
