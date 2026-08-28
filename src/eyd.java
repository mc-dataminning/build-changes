import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eyd implements eyf {
   private static final String d = "block_entity";
   private static final eyd.a e = new eyd.a() {
      @Override
      public vk a(eug $$0) {
         dsr $$1 = $$0.c(exc.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ewz<?>> b() {
         return ImmutableSet.of(exc.h);
      }
   };
   public static final eyd a = new eyd(e);
   private static final Codec<eyd.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eug.b $$1 = eug.b.a($$0);
         return b($$1);
      }
   }, eyd.a::a);
   public static final MapCodec<eyd> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eyd::new));
   public static final Codec<eyd> c = f.xmap(eyd::new, $$0 -> $$0.g);
   private final eyd.a g;

   private static eyd.a b(final eug.b $$0) {
      return new eyd.a() {
         @Nullable
         @Override
         public vk a(eug $$0x) {
            bui $$1 = $$0.c($$0.a());
            return $$1 != null ? dm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ewz<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eyd(eyd.a $$0) {
      this.g = $$0;
   }

   @Override
   public eye a() {
      return eyg.c;
   }

   @Nullable
   @Override
   public vk a(eug $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ewz<?>> b() {
      return this.g.b();
   }

   public static eyf a(eug.b $$0) {
      return new eyd(b($$0));
   }

   interface a {
      @Nullable
      vk a(eug var1);

      String a();

      Set<ewz<?>> b();
   }
}
