import java.util.List;
import java.util.UUID;

public record aej(List<UUID> b) implements zo<acd> {
   public static final zf<we, aej> a = zo.a(aej::a, aej::new);

   private aej(we $$0) {
      this($$0.a(kj.g));
   }

   private void a(we $$0) {
      $$0.a(this.b, kj.g);
   }

   @Override
   public zq<aej> a() {
      return ags.af;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }
}
