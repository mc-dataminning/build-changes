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

public record dfj(Map<dfj.d, List<dfj.c>> b) {
   private static final Codec<List<dfj.c>> c = azd.a(dfj.c.a.listOf());
   public static final Codec<dfj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azd.c(Codec.unboundedMap(dfj.d.g, c)).fieldOf("layers").forGetter(dfj::b)).apply($$0, dfj::new)
   );

   public static dfj.a a() {
      return new dfj.a();
   }

   public List<dfj.c> a(dfj.d $$0) {
      return this.b.getOrDefault($$0, List.of());
   }

   public static class a {
      private final Map<dfj.d, List<dfj.c>> a = new EnumMap<>(dfj.d.class);

      a() {
      }

      public dfj.a a(alp $$0) {
         return this.a($$0, false);
      }

      public dfj.a a(alp $$0, boolean $$1) {
         this.a(dfj.d.b, dfj.c.a($$0, $$1));
         this.b($$0, $$1);
         return this;
      }

      public dfj.a b(alp $$0, boolean $$1) {
         return this.a(dfj.d.a, dfj.c.a($$0, $$1));
      }

      public dfj.a a(dfj.d $$0, dfj.c... $$1) {
         Collections.addAll(this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()), $$1);
         return this;
      }

      public dfj a() {
         return new dfj(this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
      }
   }

   public static record b(Optional<Integer> b) {
      public static final Codec<dfj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azd.i.optionalFieldOf("color_when_undyed").forGetter(dfj.b::a)).apply($$0, dfj.b::new)
      );

      public Optional<Integer> a() {
         return this.b;
      }
   }

   public static record c(alp b, Optional<dfj.b> c, boolean d) {
      public static final Codec<dfj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alp.a.fieldOf("texture").forGetter(dfj.c::a),
                  dfj.b.a.optionalFieldOf("dyeable").forGetter(dfj.c::b),
                  Codec.BOOL.optionalFieldOf("use_player_texture", false).forGetter(dfj.c::c)
               )
               .apply($$0, dfj.c::new)
      );

      public c(alp $$0) {
         this($$0, Optional.empty(), false);
      }

      public static dfj.c a(alp $$0, boolean $$1) {
         return new dfj.c($$0, $$1 ? Optional.of(new dfj.b(Optional.of(-6265536))) : Optional.empty(), false);
      }

      public static dfj.c b(alp $$0, boolean $$1) {
         return new dfj.c($$0, $$1 ? Optional.of(new dfj.b(Optional.empty())) : Optional.empty(), false);
      }

      public alp a(dfj.d $$0) {
         return this.b.a((UnaryOperator<String>)($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png"));
      }

      public alp a() {
         return this.b;
      }

      public Optional<dfj.b> b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }
   }

   public static enum d implements baq {
      a("humanoid"),
      b("humanoid_leggings"),
      c("wings"),
      d("wolf_body"),
      e("horse_body"),
      f("llama_body");

      public static final Codec<dfj.d> g = baq.a(dfj.d::values);
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
