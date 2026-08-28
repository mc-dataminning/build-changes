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

public record ddf(Map<ddf.d, List<ddf.c>> b) {
   private static final Codec<List<ddf.c>> c = ays.a(ddf.c.a.listOf());
   public static final Codec<ddf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.c(Codec.unboundedMap(ddf.d.g, c)).fieldOf("layers").forGetter(ddf::b)).apply($$0, ddf::new)
   );

   public static ddf.a a() {
      return new ddf.a();
   }

   public List<ddf.c> a(ddf.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<ddf.d, List<ddf.c>> a = new EnumMap<>(ddf.d.class);

      a() {
      }

      public ddf.a a(alh $$0) {
         return this.a($$0, false);
      }

      public ddf.a a(alh $$0, boolean $$1) {
         this.a(ddf.d.b, ddf.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public ddf.a b(alh $$0, boolean $$1) {
         return this.a(ddf.d.a, ddf.c.a($$0, $$1));
      }

      public ddf.a a(ddf.d $$0, ddf.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public ddf a() {
         return new ddf(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<ddf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ays.i.optionalFieldOf("color_when_undyed").forGetter(ddf.b::a)).apply($$0, ddf.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alh b, Optional<ddf.b> c, boolean d) {
      public static final Codec<ddf.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alh.a.fieldOf("texture").forGetter(ddf.c::a),
                  ddf.b.a.optionalFieldOf("dyeable").forGetter(ddf.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(ddf.c::c)
               )
               .apply($$0, ddf.c::new)
      );

      public c(alh $$0) {
         this($$0, Optional.empty(), false);
      }

      public static ddf.c a(alh $$0, boolean $$1) {
         return new ddf.c($$0, $$1 ? Optional.of(new ddf.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static ddf.c b(alh $$0, boolean $$1) {
         return new ddf.c($$0, $$1 ? Optional.of(new ddf.b(Optional.empty())) : Optional.empty(), false);
      }

      public alh a(ddf.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alh a() {
         return this.b;
      }

      public Optional<ddf.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements baf {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body");

      public static final Codec<ddf.d> g = baf.a(ddf.d::values);
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
