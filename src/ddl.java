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

public record ddl(Map<ddl.d, List<ddl.c>> b) {
   private static final Codec<List<ddl.c>> c = ayt.a(ddl.c.a.listOf());
   public static final Codec<ddl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayt.c(Codec.unboundedMap(ddl.d.g, c)).fieldOf("layers").forGetter(ddl::b)).apply($$0, ddl::new)
   );

   public static ddl.a a() {
      return new ddl.a();
   }

   public List<ddl.c> a(ddl.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<ddl.d, List<ddl.c>> a = new EnumMap<>(ddl.d.class);

      a() {
      }

      public ddl.a a(ali $$0) {
         return this.a($$0, false);
      }

      public ddl.a a(ali $$0, boolean $$1) {
         this.a(ddl.d.b, ddl.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public ddl.a b(ali $$0, boolean $$1) {
         return this.a(ddl.d.a, ddl.c.a($$0, $$1));
      }

      public ddl.a a(ddl.d $$0, ddl.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public ddl a() {
         return new ddl(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<ddl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayt.i.optionalFieldOf("color_when_undyed").forGetter(ddl.b::a)).apply($$0, ddl.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(ali b, Optional<ddl.b> c, boolean d) {
      public static final Codec<ddl.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a.fieldOf("texture").forGetter(ddl.c::a),
                  ddl.b.a.optionalFieldOf("dyeable").forGetter(ddl.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(ddl.c::c)
               )
               .apply($$0, ddl.c::new)
      );

      public c(ali $$0) {
         this($$0, Optional.empty(), false);
      }

      public static ddl.c a(ali $$0, boolean $$1) {
         return new ddl.c($$0, $$1 ? Optional.of(new ddl.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static ddl.c b(ali $$0, boolean $$1) {
         return new ddl.c($$0, $$1 ? Optional.of(new ddl.b(Optional.empty())) : Optional.empty(), false);
      }

      public ali a(ddl.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public ali a() {
         return this.b;
      }

      public Optional<ddl.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bag {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body");

      public static final Codec<ddl.d> g = bag.a(ddl.d::values);
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
