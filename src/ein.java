import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ein implements eip {
   private static final String d = "block_entity";
   private static final ein.a e = new ein.a() {
      @Override
      public ta a(efc $$0) {
         dfi $$1 = $$0.c(ehn.h);
         return $$1 != null ? $$1.o() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ehk<?>> b() {
         return ImmutableSet.of(ehn.h);
      }
   };
   public static final ein a = new ein(e);
   private static final Codec<ein.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         efc.b $$1 = efc.b.a($$0);
         return b($$1);
      }
   }, ein.a::a);
   public static final Codec<ein> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ein::new));
   public static final Codec<ein> c = f.xmap(ein::new, $$0 -> $$0.g);
   private final ein.a g;

   private static ein.a b(final efc.b $$0) {
      return new ein.a() {
         @Nullable
         @Override
         public ta a(efc $$0x) {
            bkv $$1 = $$0.c($$0.a());
            return $$1 != null ? cn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ehk<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ein(ein.a $$0) {
      this.g = $$0;
   }

   @Override
   public eio a() {
      return eiq.c;
   }

   @Nullable
   @Override
   public ta a(efc $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ehk<?>> b() {
      return this.g.b();
   }

   public static eip a(efc.b $$0) {
      return new ein(b($$0));
   }

   interface a {
      @Nullable
      ta a(efc var1);

      String a();

      Set<ehk<?>> b();
   }
}
