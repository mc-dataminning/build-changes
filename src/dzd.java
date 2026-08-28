import java.util.List;
import java.util.Optional;

public final class dzd extends dzp<Boolean> {
   private static final List<Boolean> a = List.of(true, false);
   private static final int b = 0;
   private static final int c = 1;

   private dzd(String $$0) {
      super($$0, Boolean.class);
   }

   @Override
   public List<Boolean> a() {
      return a;
   }

   public static dzd a(String $$0) {
      return new dzd($$0);
   }

   @Override
   public Optional<Boolean> b(String $$0) {
      return switch ($$0) {
         case "true" -> Optional.of(true);
         case "false" -> Optional.of(false);
         default -> Optional.empty();
      };
   }

   public String a(Boolean $$0) {
      return $$0.toString();
   }

   public int b(Boolean $$0) {
      return $$0 ? 0 : 1;
   }
}
