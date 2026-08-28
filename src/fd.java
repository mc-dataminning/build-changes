import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record fd(List<fd.a> b) {
   public static final fd a = new fd(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public fd(wf $$0) {
      this($$0.a(wf.a(ArrayList::new, 8), fd.a::new));
   }

   public void a(wf $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static fd a(ya<?> $$0, fd.b $$1) {
      List<fd.a> $$2 = $$0.a().stream().map($$1x -> {
         xu $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new fd.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new fd($$2);
   }

   public List<fd.a> a() {
      return this.b;
   }

   public static record a(String a, xu b) {
      public a(wf $$0) {
         this($$0.d(16), xu.a($$0));
      }

      public void a(wf $$0) {
         $$0.a(this.a, 16);
         xu.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xu sign(String var1);
   }
}
