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

public record ddw(Map<ddw.d, List<ddw.c>> b) {
   private static final Codec<List<ddw.c>> c = ayv.a(ddw.c.a.listOf());
   public static final Codec<ddw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayv.c(Codec.unboundedMap(ddw.d.g, c)).fieldOf("layers").forGetter(ddw::b)).apply($$0, ddw::new)
   );

   public static ddw.a a() {
      return new ddw.a();
   }

   public List<ddw.c> a(ddw.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<ddw.d, List<ddw.c>> a = new EnumMap<>(ddw.d.class);

      a() {
      }

      public ddw.a a(alj $$0) {
         return this.a($$0, false);
      }

      public ddw.a a(alj $$0, boolean $$1) {
         this.a(ddw.d.b, ddw.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public ddw.a b(alj $$0, boolean $$1) {
         return this.a(ddw.d.a, ddw.c.a($$0, $$1));
      }

      public ddw.a a(ddw.d $$0, ddw.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public ddw a() {
         return new ddw(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<ddw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayv.i.optionalFieldOf("color_when_undyed").forGetter(ddw.b::a)).apply($$0, ddw.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alj b, Optional<ddw.b> c, boolean d) {
      public static final Codec<ddw.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alj.a.fieldOf("texture").forGetter(ddw.c::a),
                  ddw.b.a.optionalFieldOf("dyeable").forGetter(ddw.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(ddw.c::c)
               )
               .apply($$0, ddw.c::new)
      );

      public c(alj $$0) {
         this($$0, Optional.empty(), false);
      }

      public static ddw.c a(alj $$0, boolean $$1) {
         return new ddw.c($$0, $$1 ? Optional.of(new ddw.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static ddw.c b(alj $$0, boolean $$1) {
         return new ddw.c($$0, $$1 ? Optional.of(new ddw.b(Optional.empty())) : Optional.empty(), false);
      }

      public alj a(ddw.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alj a() {
         return this.b;
      }

      public Optional<ddw.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements bai {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body");

      public static final Codec<ddw.d> g = bai.a(ddw.d::values);
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
