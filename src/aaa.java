import java.util.Optional;
import java.util.UUID;

public record aaa(Optional<UUID> b) implements zo<zu> {
   public static final zf<we, aaa> a = zo.a(aaa::a, aaa::new);

   private aaa(we $$0) {
      this($$0.b(kj.g));
   }

   private void a(we $$0) {
      $$0.a(this.b, kj.g);
   }

   @Override
   public zq<aaa> a() {
      return aag.f;
   }

   public void a(zu $$0) {
      $$0.a(this);
   }
}
