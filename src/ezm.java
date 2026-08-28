import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ezm implements ezo {
   private static final String d = "block_entity";
   private static final ezm.a e = new ezm.a() {
      @Override
      public un a(evr $$0) {
         dtz $$1 = $$0.c(eyl.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bai<?>> b() {
         return Set.of(eyl.h);
      }
   };
   public static final ezm a = new ezm(e);
   private static final Codec<ezm.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         evr.b $$1 = evr.b.a($$0);
         return b($$1);
      }
   }, ezm.a::a);
   public static final MapCodec<ezm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ezm::new));
   public static final Codec<ezm> c = f.xmap(ezm::new, $$0 -> $$0.g);
   private final ezm.a g;

   private static ezm.a b(final evr.b $$0) {
      return new ezm.a() {
         @Nullable
         @Override
         public un a(evr $$0x) {
            buk $$1 = $$0.c($$0.a());
            return $$1 != null ? dn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bai<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private ezm(ezm.a $$0) {
      this.g = $$0;
   }

   @Override
   public ezn a() {
      return ezp.c;
   }

   @Nullable
   @Override
   public un a(evr $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bai<?>> b() {
      return this.g.b();
   }

   public static ezo a(evr.b $$0) {
      return new ezm(b($$0));
   }

   interface a {
      @Nullable
      un a(evr var1);

      String a();

      Set<bai<?>> b();
   }
}
