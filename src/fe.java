import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record fe(List<fe.a> b) {
   public static final fe a = new fe(List.of());
   private static final int c = 8;
   private static final int d = 16;

   public fe(vr $$0) {
      this($$0.a(vr.a(ArrayList::new, 8), fe.a::new));
   }

   public void a(vr $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   public static fe a(xn<?> $$0, fe.b $$1) {
      List<fe.a> $$2 = $$0.a().stream().map($$1x -> {
         xh $$2x = $$1.sign($$1x.c());
         return $$2x != null ? new fe.a($$1x.a(), $$2x) : null;
      }).filter(Objects::nonNull).toList();
      return new fe($$2);
   }

   public List<fe.a> a() {
      return this.b;
   }

   public static record a(String a, xh b) {
      public a(vr $$0) {
         this($$0.d(16), xh.a($$0));
      }

      public void a(vr $$0) {
         $$0.a(this.a, 16);
         xh.a($$0, this.b);
      }
   }

   @FunctionalInterface
   public interface b {
      @Nullable
      xh sign(String var1);
   }
}
