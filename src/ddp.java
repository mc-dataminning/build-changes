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

public record ddp(Map<ddp.d, List<ddp.c>> b) {
   private static final Codec<List<ddp.c>> c = ayw.a(ddp.c.a.listOf());
   public static final Codec<ddp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.c(Codec.unboundedMap(ddp.d.g, c)).fieldOf("layers").forGetter(ddp::b)).apply($$0, ddp::new)
   );

   public static ddp.a a() {
      return new ddp.a();
   }

   public List<ddp.c> a(ddp.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<ddp.d, List<ddp.c>> a = new EnumMap<>(ddp.d.class);

      a() {
      }

      public ddp.a a(all $$0) {
         return this.a($$0, false);
      }

      public ddp.a a(all $$0, boolean $$1) {
         this.a(ddp.d.b, ddp.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public ddp.a b(all $$0, boolean $$1) {
         return this.a(ddp.d.a, ddp.c.a($$0, $$1));
      }

      public ddp.a a(ddp.d $$0, ddp.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public ddp a() {
         return new ddp(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<ddp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayw.i.optionalFieldOf("color_when_undyed").forGetter(ddp.b::a)).apply($$0, ddp.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(all b, Optional<ddp.b> c, boolean d) {
      public static final Codec<ddp.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  all.a.fieldOf("texture").forGetter(ddp.c::a),
                  ddp.b.a.optionalFieldOf("dyeable").forGetter(ddp.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(ddp.c::c)
               )
               .apply($$0, ddp.c::new)
      );

      public c(all $$0) {
         this($$0, Optional.empty(), false);
      }

      public static ddp.c a(all $$0, boolean $$1) {
         return new ddp.c($$0, $$1 ? Optional.of(new ddp.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static ddp.c b(all $$0, boolean $$1) {
         return new ddp.c($$0, $$1 ? Optional.of(new ddp.b(Optional.empty())) : Optional.empty(), false);
      }

      public all a(ddp.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public all a() {
         return this.b;
      }

      public Optional<ddp.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements baj {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body");

      public static final Codec<ddp.d> g = baj.a(ddp.d::values);
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
