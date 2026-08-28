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

public record dfs(Map<dfs.d, List<dfs.c>> b) {
   private static final Codec<List<dfs.c>> c = azn.a(dfs.c.a.listOf());
   public static final Codec<dfs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.c(Codec.unboundedMap(dfs.d.g, c)).fieldOf("layers").forGetter(dfs::b)).apply($$0, dfs::new)
   );

   public static dfs.a a() {
      return new dfs.a();
   }

   public List<dfs.c> a(dfs.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<dfs.d, List<dfs.c>> a = new EnumMap<>(dfs.d.class);

      a() {
      }

      public dfs.a a(alz $$0) {
         return this.a($$0, false);
      }

      public dfs.a a(alz $$0, boolean $$1) {
         this.a(dfs.d.b, dfs.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public dfs.a b(alz $$0, boolean $$1) {
         return this.a(dfs.d.a, dfs.c.a($$0, $$1));
      }

      public dfs.a a(dfs.d $$0, dfs.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public dfs a() {
         return new dfs(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<dfs.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azn.i.optionalFieldOf("color_when_undyed").forGetter(dfs.b::a)).apply($$0, dfs.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alz b, Optional<dfs.b> c, boolean d) {
      public static final Codec<dfs.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("texture").forGetter(dfs.c::a),
                  dfs.b.a.optionalFieldOf("dyeable").forGetter(dfs.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(dfs.c::c)
               )
               .apply($$0, dfs.c::new)
      );

      public c(alz $$0) {
         this($$0, Optional.empty(), false);
      }

      public static dfs.c a(alz $$0, boolean $$1) {
         return new dfs.c($$0, $$1 ? Optional.of(new dfs.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static dfs.c b(alz $$0, boolean $$1) {
         return new dfs.c($$0, $$1 ? Optional.of(new dfs.b(Optional.empty())) : Optional.empty(), false);
      }

      public alz a(dfs.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alz a() {
         return this.b;
      }

      public Optional<dfs.b> b() {
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

      public static final Codec<dfs.d> g = bba.a(dfs.d::values);
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
