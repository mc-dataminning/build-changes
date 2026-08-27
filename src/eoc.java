import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class eoc {
   private final String a;
   private final String b;
   private final String c;
   private final Optional<String> d;
   private final Optional<String> e;
   private final eoc.a f;

   public eoc(String $$0, String $$1, String $$2, Optional<String> $$3, Optional<String> $$4, eoc.a $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public String a() {
      return "token:" + this.c + ":" + this.b;
   }

   public String b() {
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

   @Nullable
   public UUID g() {
      try {
         return UUIDTypeAdapter.fromString(this.b());
      } catch (IllegalArgumentException var2) {
         return null;
      }
   }

   public GameProfile h() {
      return new GameProfile(this.g(), this.c());
   }

   public eoc.a i() {
      return this.f;
   }

   public static enum a {
      a("legacy"),
      b("mojang"),
      c("msa");

      private static final Map<String, eoc.a> d = Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.e, Function.identity()));
      private final String e;

      private a(String $$0) {
         this.e = $$0;
      }

      @Nullable
      public static eoc.a a(String $$0) {
         return d.get($$0.toLowerCase(Locale.ROOT));
      }

      public String a() {
         return this.e;
      }
   }
}
