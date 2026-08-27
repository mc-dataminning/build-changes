import java.util.Optional;

public class ack implements va<aaz> {
   private final Optional<bhw> a;
   private final Optional<bhw> b;

   public ack(Optional<bhw> $$0, Optional<bhw> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ack(sl $$0) {
      this.a = $$0.b((sl.a<bhw>)($$0x -> $$0x.a(jd.e)));
      this.b = $$0.b((sl.a<bhw>)($$0x -> $$0x.a(jd.e)));
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jd.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jd.e, $$1));
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public Optional<bhw> a() {
      return this.a;
   }

   public Optional<bhw> d() {
      return this.b;
   }
}
