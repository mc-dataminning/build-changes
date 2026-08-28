import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dhp(dhp.a o, Map<alf<dhk>, dhp.a> p) {
   public static final String a = "_";
   public static final MapCodec<dhp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhp.a.a.fieldOf("asset_name").forGetter(dhp::a),
               Codec.unboundedMap(alf.a(dhl.a), dhp.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dhp::b)
            )
            .apply($$0, dhp::new)
   );
   public static final yw<ByteBuf, dhp> c = yw.a(dhp.a.b, dhp::a, yu.a(Object2ObjectOpenHashMap::new, alf.b(dhl.a), dhp.a.b), dhp::b, dhp::new);
   public static final dhp d = a("quartz");
   public static final dhp e = a("iron", Map.of(dhl.d, "iron_darker"));
   public static final dhp f = a("netherite", Map.of(dhl.h, "netherite_darker"));
   public static final dhp g = a("redstone");
   public static final dhp h = a("copper");
   public static final dhp i = a("gold", Map.of(dhl.e, "gold_darker"));
   public static final dhp j = a("emerald");
   public static final dhp k = a("diamond", Map.of(dhl.f, "diamond_darker"));
   public static final dhp l = a("lapis");
   public static final dhp m = a("amethyst");
   public static final dhp n = a("resin");

   public static dhp a(String $$0) {
      return new dhp(new dhp.a($$0), Map.of());
   }

   public static dhp a(String $$0, Map<alf<dhk>, String> $$1) {
      return new dhp(new dhp.a($$0), Map.copyOf(Maps.transformValues($$1, dhp.a::new)));
   }

   public dhp.a a(alf<dhk> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public dhp.a a() {
      return this.o;
   }

   public Map<alf<dhk>, dhp.a> b() {
      return this.p;
   }

   public static record a(String c) {
      public static final Codec<dhp.a> a = ayu.C.xmap(dhp.a::new, dhp.a::a);
      public static final yw<ByteBuf, dhp.a> b = yu.o.a(dhp.a::new, dhp.a::a);

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
