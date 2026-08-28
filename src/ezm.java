import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ezm {
   private static final String a = "command_storage_";
   private final Map<String, ezm.a> b = new HashMap<>();
   private final ezp c;

   public ezm(ezp $$0) {
      this.c = $$0;
   }

   public tz a(ali $$0) {
      ezm.a $$1 = this.a($$0.b());
      return $$1 != null ? $$1.b($$0.a()) : new tz();
   }

   @Nullable
   private ezm.a a(String $$0) {
      ezm.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         ezm.a $$2 = this.c.b(ezm.a.a($$0));
         if ($$2 != null) {
            this.b.put($$0, $$2);
         }

         return $$2;
      }
   }

   private ezm.a b(String $$0) {
      ezm.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         ezm.a $$2 = this.c.a(ezm.a.a($$0));
         this.b.put($$0, $$2);
         return $$2;
      }
   }

   public void a(ali $$0, tz $$1) {
      this.b($$0.b()).a($$0.a(), $$1);
   }

   public Stream<ali> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().c($$0.getKey()));
   }

   static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends eza {
      public static final Codec<ezm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ayw.C, tz.a).fieldOf("contents").forGetter($$0x -> $$0x.b)).apply($$0, ezm.a::new)
      );
      private final Map<String, tz> b;

      private a(Map<String, tz> $$0) {
         this.b = new HashMap<>($$0);
      }

      private a() {
         this(new HashMap<>());
      }

      public static ezb<ezm.a> a(String $$0) {
         return new ezb<>(ezm.c($$0), ezm.a::new, a, bbd.h);
      }

      public tz b(String $$0) {
         tz $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new tz();
      }

      public void a(String $$0, tz $$1) {
         if ($$1.j()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.f();
      }

      public Stream<ali> c(String $$0) {
         return this.b.keySet().stream().map($$1 -> ali.a($$0, $$1));
      }
   }
}
