import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dhw(dhw.a o, Map<alf<dhr>, dhw.a> p) {
   public static final String a = "_";
   public static final MapCodec<dhw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhw.a.a.fieldOf("asset_name").forGetter(dhw::a),
               Codec.unboundedMap(alf.a(dhs.a), dhw.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dhw::b)
            )
            .apply($$0, dhw::new)
   );
   public static final yw<ByteBuf, dhw> c = yw.a(dhw.a.b, dhw::a, yu.a(Object2ObjectOpenHashMap::new, alf.b(dhs.a), dhw.a.b), dhw::b, dhw::new);
   public static final dhw d = a("quartz");
   public static final dhw e = a("iron", Map.of(dhs.d, "iron_darker"));
   public static final dhw f = a("netherite", Map.of(dhs.h, "netherite_darker"));
   public static final dhw g = a("redstone");
   public static final dhw h = a("copper");
   public static final dhw i = a("gold", Map.of(dhs.e, "gold_darker"));
   public static final dhw j = a("emerald");
   public static final dhw k = a("diamond", Map.of(dhs.f, "diamond_darker"));
   public static final dhw l = a("lapis");
   public static final dhw m = a("amethyst");
   public static final dhw n = a("resin");

   public static dhw a(String $$0) {
      return new dhw(new dhw.a($$0), Map.of());
   }

   public static dhw a(String $$0, Map<alf<dhr>, String> $$1) {
      return new dhw(new dhw.a($$0), Map.copyOf(Maps.transformValues($$1, dhw.a::new)));
   }

   public dhw.a a(alf<dhr> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public dhw.a a() {
      return this.o;
   }

   public Map<alf<dhr>, dhw.a> b() {
      return this.p;
   }

   public static record a(String c) {
      public static final Codec<dhw.a> a = ayu.C.xmap(dhw.a::new, dhw.a::a);
      public static final yw<ByteBuf, dhw.a> b = yu.p.a(dhw.a::new, dhw.a::a);

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
