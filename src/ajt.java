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

public class ajt extends ass {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private Map<ajh, af> c = Map.of();
   private ak d = new ak();
   private final in.a e;
   private final ekz f;

   public ajt(in.a $$0, ekz $$1) {
      super(b, "advancements");
      this.e = $$0;
      this.f = $$1;
   }

   protected void a(Map<ajh, JsonElement> $$0, aso $$1, bjr $$2) {
      ajf<JsonElement> $$3 = this.e.a(JsonOps.INSTANCE);
      Builder<ajh, af> $$4 = ImmutableMap.builder();
      $$0.forEach(($$2x, $$3x) -> {
         try {
            ae $$4x = ac.a(ae.a.parse($$3, $$3x), JsonParseException::new);
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

   private void a(ajh $$0, ae $$1) {
      axb.a $$2 = new axb.a();
      $$1.a($$2, this.f);
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
   public af a(ajh $$0) {
      return this.c.get($$0);
   }

   public ak a() {
      return this.d;
   }

   public Collection<af> b() {
      return this.c.values();
   }
}
