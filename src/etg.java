import com.mojang.util.UndashedUuid;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class etg {
   private final String a;
   private final UUID b;
   private final String c;
   private final Optional<String> d;
   private final Optional<String> e;
   private final etg.a f;

   public etg(String $$0, UUID $$1, String $$2, Optional<String> $$3, Optional<String> $$4, etg.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public String a() {
      return "token:" + this.c + ":" + UndashedUuid.toString(this.b);
   }

   public UUID b() {
      return this.b;
   }

   public String c() {
      return this.a;
   }

   public String d() {
      return this.c;
   }

   public Optional<String> e() {
      return this.e;
   }

   public Optional<String> f() {
      return this.d;
   }

   public etg.a g() {
      return this.f;
   }

   public static enum a {
      a("legacy"),
      b("mojang"),
      c("msa");

      private static final Map<String, etg.a> d = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, Function.identity()));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      @Nullable
      public static etg.a a(String $$0) {
         return d.get($$0.toLowerCase(Locale.ROOT));
      }

      public String a() {
         return this.e;
      }
   }
}
