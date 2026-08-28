import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dik(dik.a o, Map<alh<dif>, dik.a> p) {
   public static final String a = "_";
   public static final MapCodec<dik> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dik.a.a.fieldOf("asset_name").forGetter(dik::a),
               Codec.unboundedMap(alh.a(dig.a), dik.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dik::b)
            )
            .apply($$0, dik::new)
   );
   public static final yy<ByteBuf, dik> c = yy.a(dik.a.b, dik::a, yw.a(Object2ObjectOpenHashMap::new, alh.b(dig.a), dik.a.b), dik::b, dik::new);
   public static final dik d = a("quartz");
   public static final dik e = a("iron", Map.of(dig.d, "iron_darker"));
   public static final dik f = a("netherite", Map.of(dig.h, "netherite_darker"));
   public static final dik g = a("redstone");
   public static final dik h = a("copper");
   public static final dik i = a("gold", Map.of(dig.e, "gold_darker"));
   public static final dik j = a("emerald");
   public static final dik k = a("diamond", Map.of(dig.f, "diamond_darker"));
   public static final dik l = a("lapis");
   public static final dik m = a("amethyst");
   public static final dik n = a("resin");

   public static dik a(String $$0) {
      return new dik(new dik.a($$0), Map.of());
   }

   public static dik a(String $$0, Map<alh<dif>, String> $$1) {
      return new dik(new dik.a($$0), Map.copyOf(Maps.transformValues($$1, dik.a::new)));
   }

   public dik.a a(alh<dif> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public dik.a a() {
      return this.o;
   }

   public Map<alh<dif>, dik.a> b() {
      return this.p;
   }

   public static record a(String c) {
      public static final Codec<dik.a> a = ayw.C.xmap(dik.a::new, dik.a::a);
      public static final yy<ByteBuf, dik.a> b = yw.p.a(dik.a::new, dik.a::a);

      public a(String c) {
         if (!ali.i(c)) {
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
