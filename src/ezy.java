import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ezy {
   private static final String a = "command_storage_";
   private final Map<String, ezy.a> b = new HashMap<>();
   private final fab c;

   public ezy(fab $$0) {
      this.c = $$0;
   }

   public ua a(alr $$0) {
      ezy.a $$1 = this.a($$0.b());
      return $$1 != null ? $$1.b($$0.a()) : new ua();
   }

   @Nullable
   private ezy.a a(String $$0) {
      ezy.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         ezy.a $$2 = this.c.b(ezy.a.a($$0));
         if ($$2 != null) {
            this.b.put($$0, $$2);
         }

         return $$2;
      }
   }

   private ezy.a b(String $$0) {
      ezy.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         ezy.a $$2 = this.c.a(ezy.a.a($$0));
         this.b.put($$0, $$2);
         return $$2;
      }
   }

   public void a(alr $$0, ua $$1) {
      this.b($$0.b()).a($$0.a(), $$1);
   }

   public Stream<alr> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().c($$0.getKey()));
   }

   static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends ezm {
      public static final Codec<ezy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(azg.C, ua.a).fieldOf("contents").forGetter($$0x -> $$0x.b)).apply($$0, ezy.a::new)
      );
      private final Map<String, ua> b;

      private a(Map<String, ua> $$0) {
         this.b = new HashMap<>($$0);
      }

      private a() {
         this(new HashMap<>());
      }

      public static ezn<ezy.a> a(String $$0) {
         return new ezn<>(ezy.c($$0), ezy.a::new, a, bbo.h);
      }

      public ua b(String $$0) {
         ua $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ua();
      }

      public void a(String $$0, ua $$1) {
         if ($$1.j()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.f();
      }

      public Stream<alr> c(String $$0) {
         return this.b.keySet().stream().map($$1 -> alr.a($$0, $$1));
      }
   }
}
