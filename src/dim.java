import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record dim(dim.a o, Map<alj<dih>, dim.a> p) {
   public static final String a = "_";
   public static final MapCodec<dim> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dim.a.a.fieldOf("asset_name").forGetter(dim::a),
               Codec.unboundedMap(alj.a(dii.a), dim.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(dim::b)
            )
            .apply($$0, dim::new)
   );
   public static final za<ByteBuf, dim> c = za.a(dim.a.b, dim::a, yy.a(Object2ObjectOpenHashMap::new, alj.b(dii.a), dim.a.b), dim::b, dim::new);
   public static final dim d = a("quartz");
   public static final dim e = a("iron", Map.of(dii.d, "iron_darker"));
   public static final dim f = a("netherite", Map.of(dii.h, "netherite_darker"));
   public static final dim g = a("redstone");
   public static final dim h = a("copper");
   public static final dim i = a("gold", Map.of(dii.e, "gold_darker"));
   public static final dim j = a("emerald");
   public static final dim k = a("diamond", Map.of(dii.f, "diamond_darker"));
   public static final dim l = a("lapis");
   public static final dim m = a("amethyst");
   public static final dim n = a("resin");

   public static dim a(String $$0) {
      return new dim(new dim.a($$0), Map.of());
   }

   public static dim a(String $$0, Map<alj<dih>, String> $$1) {
      return new dim(new dim.a($$0), Map.copyOf(Maps.transformValues($$1, dim.a::new)));
   }

   public dim.a a(alj<dih> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public dim.a a() {
      return this.o;
   }

   public Map<alj<dih>, dim.a> b() {
      return this.p;
   }

   public static record a(String c) {
      public static final Codec<dim.a> a = ayy.C.xmap(dim.a::new, dim.a::a);
      public static final za<ByteBuf, dim.a> b = yy.p.a(dim.a::new, dim.a::a);

      public a(String c) {
         if (!alk.i(c)) {
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
