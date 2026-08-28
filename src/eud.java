import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eud implements euf {
   private static final String d = "block_entity";
   private static final eud.a e = new eud.a() {
      @Override
      public vo a(eqh $$0) {
         dpg $$1 = $$0.c(etd.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eta<?>> b() {
         return ImmutableSet.of(etd.h);
      }
   };
   public static final eud a = new eud(e);
   private static final Codec<eud.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eqh.b $$1 = eqh.b.a($$0);
         return b($$1);
      }
   }, eud.a::a);
   public static final MapCodec<eud> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eud::new));
   public static final Codec<eud> c = f.xmap(eud::new, $$0 -> $$0.g);
   private final eud.a g;

   private static eud.a b(final eqh.b $$0) {
      return new eud.a() {
         @Nullable
         @Override
         public vo a(eqh $$0x) {
            bst $$1 = $$0.c($$0.a());
            return $$1 != null ? dg.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eta<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eud(eud.a $$0) {
      this.g = $$0;
   }

   @Override
   public eue a() {
      return eug.c;
   }

   @Nullable
   @Override
   public vo a(eqh $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eta<?>> b() {
      return this.g.b();
   }

   public static euf a(eqh.b $$0) {
      return new eud(b($$0));
   }

   interface a {
      @Nullable
      vo a(eqh var1);

      String a();

      Set<eta<?>> b();
   }
}
