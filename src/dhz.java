import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dhz(dhz.a o, Map<alf<dhu>, dhz.a> p) {
   public static final String a = "_";
   public static final MapCodec<dhz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhz.a.a.fieldOf("asset_name").forGetter(dhz::a),
               Codec.unboundedMap(alf.a(dhv.a), dhz.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dhz::b)
            )
            .apply($$0, dhz::new)
   );
   public static final yw<ByteBuf, dhz> c = yw.a(dhz.a.b, dhz::a, yu.a(Object2ObjectOpenHashMap::new, alf.b(dhv.a), dhz.a.b), dhz::b, dhz::new);
   public static final dhz d = a("quartz");
   public static final dhz e = a("iron", Map.of(dhv.d, "iron_darker"));
   public static final dhz f = a("netherite", Map.of(dhv.h, "netherite_darker"));
   public static final dhz g = a("redstone");
   public static final dhz h = a("copper");
   public static final dhz i = a("gold", Map.of(dhv.e, "gold_darker"));
   public static final dhz j = a("emerald");
   public static final dhz k = a("diamond", Map.of(dhv.f, "diamond_darker"));
   public static final dhz l = a("lapis");
   public static final dhz m = a("amethyst");
   public static final dhz n = a("resin");

   public static dhz a(String $$0) {
      return new dhz(new dhz.a($$0), Map.of());
   }

   public static dhz a(String $$0, Map<alf<dhu>, String> $$1) {
      return new dhz(new dhz.a($$0), Map.copyOf(Maps.transformValues($$1, dhz.a::new)));
   }

   public dhz.a a(alf<dhu> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public dhz.a a() {
      return this.o;
   }

   public Map<alf<dhu>, dhz.a> b() {
      return this.p;
   }

   public static record a(String c) {
      public static final Codec<dhz.a> a = ayu.C.xmap(dhz.a::new, dhz.a::a);
      public static final yw<ByteBuf, dhz.a> b = yu.p.a(dhz.a::new, dhz.a::a);

      public a(String c) {
         if (!alg.i(c)) {
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
