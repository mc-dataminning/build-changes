import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eug implements eui {
   private static final String d = "block_entity";
   private static final eug.a e = new eug.a() {
      @Override
      public vp a(eqk $$0) {
         dpj $$1 = $$0.c(etg.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<etd<?>> b() {
         return ImmutableSet.of(etg.h);
      }
   };
   public static final eug a = new eug(e);
   private static final Codec<eug.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eqk.b $$1 = eqk.b.a($$0);
         return b($$1);
      }
   }, eug.a::a);
   public static final MapCodec<eug> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eug::new));
   public static final Codec<eug> c = f.xmap(eug::new, $$0 -> $$0.g);
   private final eug.a g;

   private static eug.a b(final eqk.b $$0) {
      return new eug.a() {
         @Nullable
         @Override
         public vp a(eqk $$0x) {
            bsw $$1 = $$0.c($$0.a());
            return $$1 != null ? dg.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<etd<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eug(eug.a $$0) {
      this.g = $$0;
   }

   @Override
   public euh a() {
      return euj.c;
   }

   @Nullable
   @Override
   public vp a(eqk $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<etd<?>> b() {
      return this.g.b();
   }

   public static eui a(eqk.b $$0) {
      return new eug(b($$0));
   }

   interface a {
      @Nullable
      vp a(eqk var1);

      String a();

      Set<etd<?>> b();
   }
}
