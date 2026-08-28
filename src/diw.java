import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;

public record diw(diw.a o, Map<alq<dir>, diw.a> p) {
   public static final String a = "_";
   public static final MapCodec<diw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               diw.a.a.fieldOf("asset_name").forGetter(diw::a),
               Codec.unboundedMap(alq.a(dis.a), diw.a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(diw::b)
            )
            .apply($$0, diw::new)
   );
   public static final ze<ByteBuf, diw> c = ze.a(diw.a.b, diw::a, zc.a(Object2ObjectOpenHashMap::new, alq.b(dis.a), diw.a.b), diw::b, diw::new);
   public static final diw d = a("quartz");
   public static final diw e = a("iron", Map.of(dis.d, "iron_darker"));
   public static final diw f = a("netherite", Map.of(dis.h, "netherite_darker"));
   public static final diw g = a("redstone");
   public static final diw h = a("copper");
   public static final diw i = a("gold", Map.of(dis.e, "gold_darker"));
   public static final diw j = a("emerald");
   public static final diw k = a("diamond", Map.of(dis.f, "diamond_darker"));
   public static final diw l = a("lapis");
   public static final diw m = a("amethyst");
   public static final diw n = a("resin");

   public static diw a(String $$0) {
      return new diw(new diw.a($$0), Map.of());
   }

   public static diw a(String $$0, Map<alq<dir>, String> $$1) {
      return new diw(new diw.a($$0), Map.copyOf(Maps.transformValues($$1, diw.a::new)));
   }

   public diw.a a(alq<dir> $$0) {
      return this.p.getOrDefault($$0, this.o);
   }

   public diw.a a() {
      return this.o;
   }

   public Map<alq<dir>, diw.a> b() {
      return this.p;
   }

   public static record a(String c) {
      public static final Codec<diw.a> a = azg.C.xmap(diw.a::new, diw.a::a);
      public static final ze<ByteBuf, diw.a> b = zc.p.a(diw.a::new, diw.a::a);

      public a(String c) {
         if (!alr.i(c)) {
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
