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

public record dfk(Map<dfk.d, List<dfk.c>> b) {
   private static final Codec<List<dfk.c>> c = azn.a(dfk.c.a.listOf());
   public static final Codec<dfk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.c(Codec.unboundedMap(dfk.d.g, c)).fieldOf("layers").forGetter(dfk::b)).apply($$0, dfk::new)
   );

   public static dfk.a a() {
      return new dfk.a();
   }

   public List<dfk.c> a(dfk.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<dfk.d, List<dfk.c>> a = new EnumMap<>(dfk.d.class);

      a() {
      }

      public dfk.a a(alz $$0) {
         return this.a($$0, false);
      }

      public dfk.a a(alz $$0, boolean $$1) {
         this.a(dfk.d.b, dfk.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public dfk.a b(alz $$0, boolean $$1) {
         return this.a(dfk.d.a, dfk.c.a($$0, $$1));
      }

      public dfk.a a(dfk.d $$0, dfk.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public dfk a() {
         return new dfk(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<dfk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azn.i.optionalFieldOf("color_when_undyed").forGetter(dfk.b::a)).apply($$0, dfk.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alz b, Optional<dfk.b> c, boolean d) {
      public static final Codec<dfk.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("texture").forGetter(dfk.c::a),
                  dfk.b.a.optionalFieldOf("dyeable").forGetter(dfk.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(dfk.c::c)
               )
               .apply($$0, dfk.c::new)
      );

      public c(alz $$0) {
         this($$0, Optional.empty(), false);
      }

      public static dfk.c a(alz $$0, boolean $$1) {
         return new dfk.c($$0, $$1 ? Optional.of(new dfk.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static dfk.c b(alz $$0, boolean $$1) {
         return new dfk.c($$0, $$1 ? Optional.of(new dfk.b(Optional.empty())) : Optional.empty(), false);
      }

      public alz a(dfk.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alz a() {
         return this.b;
      }

      public Optional<dfk.b> b() {
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

      public static final Codec<dfk.d> g = bba.a(dfk.d::values);
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
