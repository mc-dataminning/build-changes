import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class eye {
   private static final String a = "command_storage_";
   private final Map<String, eye.a> b = new HashMap<>();
   private final eyh c;

   public eye(eyh $$0) {
      this.c = $$0;
   }

   public tz a(alg $$0) {
      eye.a $$1 = this.a($$0.b());
      return $$1 != null ? $$1.b($$0.a()) : new tz();
   }

   @Nullable
   private eye.a a(String $$0) {
      eye.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         eye.a $$2 = this.c.b(eye.a.a($$0));
         if ($$2 != null) {
            this.b.put($$0, $$2);
         }

         return $$2;
      }
   }

   private eye.a b(String $$0) {
      eye.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         eye.a $$2 = this.c.a(eye.a.a($$0));
         this.b.put($$0, $$2);
         return $$2;
      }
   }

   public void a(alg $$0, tz $$1) {
      this.b($$0.b()).a($$0.a(), $$1);
   }

   public Stream<alg> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().c($$0.getKey()));
   }

   static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends exs {
      public static final Codec<eye.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ayu.C, tz.a).fieldOf("contents").forGetter($$0x -> $$0x.b)).apply($$0, eye.a::new)
      );
      private final Map<String, tz> b;

      private a(Map<String, tz> $$0) {
         this.b = $$0;
      }

      private a() {
         this(new HashMap<>());
      }

      public static ext<eye.a> a(String $$0) {
         return new ext<>(eye.c($$0), eye.a::new, a, bbb.h);
      }

      public tz b(String $$0) {
         tz $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new tz();
      }

      public void a(String $$0, tz $$1) {
         if ($$1.g()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.f();
      }

      public Stream<alg> c(String $$0) {
         return this.b.keySet().stream().map($$1 -> alg.a($$0, $$1));
      }
   }
}
