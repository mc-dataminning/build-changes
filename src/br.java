import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class br<V> {
   private static final String a = "variant";
   final Codec<V> b;
   final Function<bfj, Optional<V>> c;
   final bp.a d;

   public static <V> br<V> a(hr<V> $$0, Function<bfj, Optional<V>> $$1) {
      return new br<>($$0.q(), $$1);
   }

   public static <V> br<V> a(Codec<V> $$0, Function<bfj, Optional<V>> $$1) {
      return new br<>($$0, $$1);
   }

   private br(Codec<V> $$0, Function<bfj, Optional<V>> $$1) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$1x -> {
         JsonElement $$2 = $$1x.get("variant");
         if ($$2 == null) {
            throw new JsonParseException("Missing variant field");
         } else {
            V $$3 = (V)ac.a($$0.decode(new Dynamic(JsonOps.INSTANCE, $$2)), JsonParseException::new).getFirst();
            return this.a($$3);
         }
      };
   }

   public bp.a a() {
      return this.d;
   }

   public bp a(final V $$0) {
      return new bp() {
         @Override
         public boolean a(bfj $$0x, aif $$1, @Nullable eei $$2) {
            return br.this.c.apply($$0).filter($$1x -> $$1x.equals($$0)).isPresent();
         }

         @Override
         public JsonObject a() {
            JsonObject $$0 = new JsonObject();
            $$0.add(
               "variant",
               ac.a(br.this.b.encodeStart(JsonOps.INSTANCE, $$0), $$1 -> new JsonParseException("Can't serialize variant " + $$0 + ", message " + $$1))
            );
            return $$0;
         }

         @Override
         public bp.a c() {
            return br.this.d;
         }
      };
   }
}
