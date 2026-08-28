import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class eyy {
   private static final String a = "command_storage_";
   private final Map<String, eyy.a> b = new HashMap<>();
   private final ezb c;

   public eyy(ezb $$0) {
      this.c = $$0;
   }

   public tz a(alg $$0) {
      eyy.a $$1 = this.a($$0.b());
      return $$1 != null ? $$1.b($$0.a()) : new tz();
   }

   @Nullable
   private eyy.a a(String $$0) {
      eyy.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         eyy.a $$2 = this.c.b(eyy.a.a($$0));
         if ($$2 != null) {
            this.b.put($$0, $$2);
         }

         return $$2;
      }
   }

   private eyy.a b(String $$0) {
      eyy.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         eyy.a $$2 = this.c.a(eyy.a.a($$0));
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

   static class a extends eym {
      public static final Codec<eyy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(ayu.C, tz.a).fieldOf("contents").forGetter($$0x -> $$0x.b)).apply($$0, eyy.a::new)
      );
      private final Map<String, tz> b;

      private a(Map<String, tz> $$0) {
         this.b = new HashMap<>($$0);
      }

      private a() {
         this(new HashMap<>());
      }

      public static eyn<eyy.a> a(String $$0) {
         return new eyn<>(eyy.c($$0), eyy.a::new, a, bbb.h);
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
