import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eul implements eun {
   private static final String d = "block_entity";
   private static final eul.a e = new eul.a() {
      @Override
      public uu a(eqo $$0) {
         dpn $$1 = $$0.c(etk.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eth<?>> b() {
         return ImmutableSet.of(etk.h);
      }
   };
   public static final eul a = new eul(e);
   private static final Codec<eul.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eqo.b $$1 = eqo.b.a($$0);
         return b($$1);
      }
   }, eul.a::a);
   public static final MapCodec<eul> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eul::new));
   public static final Codec<eul> c = f.xmap(eul::new, $$0 -> $$0.g);
   private final eul.a g;

   private static eul.a b(final eqo.b $$0) {
      return new eul.a() {
         @Nullable
         @Override
         public uu a(eqo $$0x) {
            bsd $$1 = $$0.c($$0.a());
            return $$1 != null ? dh.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eth<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eul(eul.a $$0) {
      this.g = $$0;
   }

   @Override
   public eum a() {
      return euo.c;
   }

   @Nullable
   @Override
   public uu a(eqo $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eth<?>> b() {
      return this.g.b();
   }

   public static eun a(eqo.b $$0) {
      return new eul(b($$0));
   }

   interface a {
      @Nullable
      uu a(eqo var1);

      String a();

      Set<eth<?>> b();
   }
}
