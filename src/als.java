import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class als extends aut {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private Map<alf, af> c = Map.of();
   private ak d = new ak();
   private final jk.a e;

   public als(jk.a $$0) {
      super(b, "advancements");
      this.e = $$0;
   }

   protected void a(Map<alf, JsonElement> $$0, aup $$1, bni $$2) {
      ald<JsonElement> $$3 = this.e.a(JsonOps.INSTANCE);
      Builder<alf, af> $$4 = ImmutableMap.builder();
      $$0.forEach(($$2x, $$3x) -> {
         try {
            ae $$4x = (ae)ae.a.parse($$3, $$3x).getOrThrow(JsonParseException::new);
            this.a($$2x, $$4x);
            $$4.put($$2x, new af($$2x, $$4x));
         } catch (Exception var6x) {
            a.error("Parsing error loading custom advancement {}: {}", $$2x, var6x.getMessage());
         }
      });
      this.c = $$4.buildOrThrow();
      ak $$5 = new ak();
      $$5.a(this.c.values());

      for (ag $$6 : $$5.b()) {
         if ($$6.b().b().c().isPresent()) {
            as.a($$6);
         }
      }

      this.d = $$5;
   }

   private void a(alf $$0, ae $$1) {
      azf.a $$2 = new azf.a();
      $$1.a($$2, this.e.b());
      Multimap<String, String> $$3 = $$2.a();
      if (!$$3.isEmpty()) {
         String $$4 = $$3.asMap()
            .entrySet()
            .stream()
            .map($$0x -> "  at " + (String)$$0x.getKey() + ": " + String.join("; ", (Iterable<? extends CharSequence>)$$0x.getValue()))
            .collect(Collectors.joining("\n"));
         a.warn("Found validation problems in advancement {}: \n{}", $$0, $$4);
      }
   }

   @Nullable
   public af a(alf $$0) {
      return this.c.get($$0);
   }

   public ak a() {
      return this.d;
   }

   public Collection<af> b() {
      return this.c.values();
   }
}
