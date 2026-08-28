import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public record dfr(Map<dfr.d, List<dfr.c>> b) {
   private static final Codec<List<dfr.c>> c = azn.a(dfr.c.a.listOf());
   public static final Codec<dfr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.c(Codec.unboundedMap(dfr.d.g, c)).fieldOf("layers").forGetter(dfr::b)).apply($$0, dfr::new)
   );

   public static dfr.a a() {
      return new dfr.a();
   }

   public List<dfr.c> a(dfr.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<dfr.d, List<dfr.c>> a = new EnumMap<>(dfr.d.class);

      a() {
      }

      public dfr.a a(alz $$0) {
         return this.a($$0, false);
      }

      public dfr.a a(alz $$0, boolean $$1) {
         this.a(dfr.d.b, dfr.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public dfr.a b(alz $$0, boolean $$1) {
         return this.a(dfr.d.a, dfr.c.a($$0, $$1));
      }

      public dfr.a a(dfr.d $$0, dfr.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public dfr a() {
         return new dfr(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<dfr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azn.i.optionalFieldOf("color_when_undyed").forGetter(dfr.b::a)).apply($$0, dfr.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alz b, Optional<dfr.b> c, boolean d) {
      public static final Codec<dfr.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("texture").forGetter(dfr.c::a),
                  dfr.b.a.optionalFieldOf("dyeable").forGetter(dfr.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(dfr.c::c)
               )
               .apply($$0, dfr.c::new)
      );

      public c(alz $$0) {
         this($$0, Optional.empty(), false);
      }

      public static dfr.c a(alz $$0, boolean $$1) {
         return new dfr.c($$0, $$1 ? Optional.of(new dfr.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static dfr.c b(alz $$0, boolean $$1) {
         return new dfr.c($$0, $$1 ? Optional.of(new dfr.b(Optional.empty())) : Optional.empty(), false);
      }

      public alz a(dfr.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alz a() {
         return this.b;
      }

      public Optional<dfr.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bba {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body");

      public static final Codec<dfr.d> g = bba.a(dfr.d::values);
      private final String h;

      private d(final String $$0) {
         this.h = $$0;
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
