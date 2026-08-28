import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ezl implements ezn {
   private static final String d = "block_entity";
   private static final ezl.a e = new ezl.a() {
      @Override
      public un a(evq $$0) {
         dty $$1 = $$0.c(eyk.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bai<?>> b() {
         return Set.of(eyk.h);
      }
   };
   public static final ezl a = new ezl(e);
   private static final Codec<ezl.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         evq.b $$1 = evq.b.a($$0);
         return b($$1);
      }
   }, ezl.a::a);
   public static final MapCodec<ezl> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ezl::new));
   public static final Codec<ezl> c = f.xmap(ezl::new, $$0 -> $$0.g);
   private final ezl.a g;

   private static ezl.a b(final evq.b $$0) {
      return new ezl.a() {
         @Nullable
         @Override
         public un a(evq $$0x) {
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

   private ezl(ezl.a $$0) {
      this.g = $$0;
   }

   @Override
   public ezm a() {
      return ezo.c;
   }

   @Nullable
   @Override
   public un a(evq $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bai<?>> b() {
      return this.g.b();
   }

   public static ezn a(evq.b $$0) {
      return new ezl(b($$0));
   }

   interface a {
      @Nullable
      un a(evq var1);

      String a();

      Set<bai<?>> b();
   }
}
