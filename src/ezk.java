import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ezk implements ezm {
   private static final String d = "block_entity";
   private static final ezk.a e = new ezk.a() {
      @Override
      public un a(evp $$0) {
         dtx $$1 = $$0.c(eyj.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bah<?>> b() {
         return Set.of(eyj.h);
      }
   };
   public static final ezk a = new ezk(e);
   private static final Codec<ezk.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         evp.b $$1 = evp.b.a($$0);
         return b($$1);
      }
   }, ezk.a::a);
   public static final MapCodec<ezk> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ezk::new));
   public static final Codec<ezk> c = f.xmap(ezk::new, $$0 -> $$0.g);
   private final ezk.a g;

   private static ezk.a b(final evp.b $$0) {
      return new ezk.a() {
         @Nullable
         @Override
         public un a(evp $$0x) {
            buj $$1 = $$0.c($$0.a());
            return $$1 != null ? dn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bah<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private ezk(ezk.a $$0) {
      this.g = $$0;
   }

   @Override
   public ezl a() {
      return ezn.c;
   }

   @Nullable
   @Override
   public un a(evp $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bah<?>> b() {
      return this.g.b();
   }

   public static ezm a(evp.b $$0) {
      return new ezk(b($$0));
   }

   interface a {
      @Nullable
      un a(evp var1);

      String a();

      Set<bah<?>> b();
   }
}
