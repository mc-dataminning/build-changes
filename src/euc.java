import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class euc implements eue {
   private static final String d = "block_entity";
   private static final euc.a e = new euc.a() {
      @Override
      public vo a(eqg $$0) {
         dpf $$1 = $$0.c(etc.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<esz<?>> b() {
         return ImmutableSet.of(etc.h);
      }
   };
   public static final euc a = new euc(e);
   private static final Codec<euc.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eqg.b $$1 = eqg.b.a($$0);
         return b($$1);
      }
   }, euc.a::a);
   public static final MapCodec<euc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, euc::new));
   public static final Codec<euc> c = f.xmap(euc::new, $$0 -> $$0.g);
   private final euc.a g;

   private static euc.a b(final eqg.b $$0) {
      return new euc.a() {
         @Nullable
         @Override
         public vo a(eqg $$0x) {
            bss $$1 = $$0.c($$0.a());
            return $$1 != null ? dg.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<esz<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private euc(euc.a $$0) {
      this.g = $$0;
   }

   @Override
   public eud a() {
      return euf.c;
   }

   @Nullable
   @Override
   public vo a(eqg $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<esz<?>> b() {
      return this.g.b();
   }

   public static eue a(eqg.b $$0) {
      return new euc(b($$0));
   }

   interface a {
      @Nullable
      vo a(eqg var1);

      String a();

      Set<esz<?>> b();
   }
}
