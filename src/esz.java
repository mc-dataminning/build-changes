import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class esz implements etb {
   private static final String d = "block_entity";
   private static final esz.a e = new esz.a() {
      @Override
      public va a(eph $$0) {
         doi $$1 = $$0.c(erz.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<erw<?>> b() {
         return ImmutableSet.of(erz.h);
      }
   };
   public static final esz a = new esz(e);
   private static final Codec<esz.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eph.b $$1 = eph.b.a($$0);
         return b($$1);
      }
   }, esz.a::a);
   public static final MapCodec<esz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, esz::new));
   public static final Codec<esz> c = f.xmap(esz::new, $$0 -> $$0.g);
   private final esz.a g;

   private static esz.a b(final eph.b $$0) {
      return new esz.a() {
         @Nullable
         @Override
         public va a(eph $$0x) {
            brw $$1 = $$0.c($$0.a());
            return $$1 != null ? cv.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<erw<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private esz(esz.a $$0) {
      this.g = $$0;
   }

   @Override
   public eta a() {
      return etc.c;
   }

   @Nullable
   @Override
   public va a(eph $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<erw<?>> b() {
      return this.g.b();
   }

   public static etb a(eph.b $$0) {
      return new esz(b($$0));
   }

   interface a {
      @Nullable
      va a(eph var1);

      String a();

      Set<erw<?>> b();
   }
}
