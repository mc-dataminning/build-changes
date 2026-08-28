import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class etz implements eub {
   private static final String d = "block_entity";
   private static final etz.a e = new etz.a() {
      @Override
      public vo a(eqd $$0) {
         dpc $$1 = $$0.c(esz.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<esw<?>> b() {
         return ImmutableSet.of(esz.h);
      }
   };
   public static final etz a = new etz(e);
   private static final Codec<etz.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eqd.b $$1 = eqd.b.a($$0);
         return b($$1);
      }
   }, etz.a::a);
   public static final MapCodec<etz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, etz::new));
   public static final Codec<etz> c = f.xmap(etz::new, $$0 -> $$0.g);
   private final etz.a g;

   private static etz.a b(final eqd.b $$0) {
      return new etz.a() {
         @Nullable
         @Override
         public vo a(eqd $$0x) {
            bsp $$1 = $$0.c($$0.a());
            return $$1 != null ? dg.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<esw<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private etz(etz.a $$0) {
      this.g = $$0;
   }

   @Override
   public eua a() {
      return euc.c;
   }

   @Nullable
   @Override
   public vo a(eqd $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<esw<?>> b() {
      return this.g.b();
   }

   public static eub a(eqd.b $$0) {
      return new etz(b($$0));
   }

   interface a {
      @Nullable
      vo a(eqd var1);

      String a();

      Set<esw<?>> b();
   }
}
