import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dhk(dhk.a o, Map<alf<dhf>, dhk.a> p) {
   public static final String a = "_";
   public static final MapCodec<dhk> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhk.a.a.fieldOf("asset_name").forGetter(dhk::a),
               Codec.unboundedMap(alf.a(dhg.a), dhk.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dhk::b)
            )
            .apply($$0, dhk::new)
   );
   public static final yw<ByteBuf, dhk> c = yw.a(dhk.a.b, dhk::a, yu.a(Object2ObjectOpenHashMap::new, alf.b(dhg.a), dhk.a.b), dhk::b, dhk::new);
   public static final dhk d = a("quartz");
   public static final dhk e = a("iron", Map.of(dhg.d, "iron_darker"));
   public static final dhk f = a("netherite", Map.of(dhg.h, "netherite_darker"));
   public static final dhk g = a("redstone");
   public static final dhk h = a("copper");
   public static final dhk i = a("gold", Map.of(dhg.e, "gold_darker"));
   public static final dhk j = a("emerald");
   public static final dhk k = a("diamond", Map.of(dhg.f, "diamond_darker"));
   public static final dhk l = a("lapis");
   public static final dhk m = a("amethyst");
   public static final dhk n = a("resin");

   public static dhk a(String $$0) {
      return new dhk(new dhk.a($$0), Map.of());
   }

   public static dhk a(String $$0, Map<alf<dhf>, String> $$1) {
      return new dhk(new dhk.a($$0), Map.copyOf(Maps.transformValues($$1, dhk.a::new)));
   }

   public dhk.a a(alf<dhf> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public dhk.a a() {
      return this.o;
   }

   public Map<alf<dhf>, dhk.a> b() {
      return this.p;
   }

   public static record a(String c) {
      public static final Codec<dhk.a> a = ayu.C.xmap(dhk.a::new, dhk.a::a);
      public static final yw<ByteBuf, dhk.a> b = yu.o.a(dhk.a::new, dhk.a::a);

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
