import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dhe(dhe.a o, Map<ald<dgz>, dhe.a> p) {
   public static final String a = "_";
   public static final MapCodec<dhe> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhe.a.a.fieldOf("asset_name").forGetter(dhe::a),
               Codec.unboundedMap(ald.a(dha.a), dhe.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dhe::b)
            )
            .apply($$0, dhe::new)
   );
   public static final yu<ByteBuf, dhe> c = yu.a(dhe.a.b, dhe::a, ys.a(Object2ObjectOpenHashMap::new, ald.b(dha.a), dhe.a.b), dhe::b, dhe::new);
   public static final dhe d = a("quartz");
   public static final dhe e = a("iron", Map.of(dha.d, "iron_darker"));
   public static final dhe f = a("netherite", Map.of(dha.h, "netherite_darker"));
   public static final dhe g = a("redstone");
   public static final dhe h = a("copper");
   public static final dhe i = a("gold", Map.of(dha.e, "gold_darker"));
   public static final dhe j = a("emerald");
   public static final dhe k = a("diamond", Map.of(dha.f, "diamond_darker"));
   public static final dhe l = a("lapis");
   public static final dhe m = a("amethyst");
   public static final dhe n = a("resin");

   public static dhe a(String $$0) {
      return new dhe(new dhe.a($$0), Map.of());
   }

   public static dhe a(String $$0, Map<ald<dgz>, String> $$1) {
      return new dhe(new dhe.a($$0), Map.copyOf(Maps.transformValues($$1, dhe.a::new)));
   }

   public dhe.a a(ald<dgz> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public dhe.a a() {
      return this.o;
   }

   public Map<ald<dgz>, dhe.a> b() {
      return this.p;
   }

   public static record a(String c) {
      public static final Codec<dhe.a> a = ays.C.xmap(dhe.a::new, dhe.a::a);
      public static final yu<ByteBuf, dhe.a> b = ys.o.a(dhe.a::new, dhe.a::a);

      public a(String c) {
         if (!ale.i(c)) {
            throw new IllegalArgumentException("Invalid string to use as a resource path element: " + c);
         } else {
            this.c = c;
         }
      }

      public String a() {
         return this.c;
      }
   }
}
