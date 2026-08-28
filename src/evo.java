import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class evo implements evq {
   private static final String d = "block_entity";
   private static final evo.a e = new evo.a() {
      @Override
      public uy a(err $$0) {
         dqh $$1 = $$0.c(eun.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<euk<?>> b() {
         return ImmutableSet.of(eun.h);
      }
   };
   public static final evo a = new evo(e);
   private static final Codec<evo.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         err.b $$1 = err.b.a($$0);
         return b($$1);
      }
   }, evo.a::a);
   public static final MapCodec<evo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, evo::new));
   public static final Codec<evo> c = f.xmap(evo::new, $$0 -> $$0.g);
   private final evo.a g;

   private static evo.a b(final err.b $$0) {
      return new evo.a() {
         @Nullable
         @Override
         public uy a(err $$0x) {
            bsr $$1 = $$0.c($$0.a());
            return $$1 != null ? dk.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<euk<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private evo(evo.a $$0) {
      this.g = $$0;
   }

   @Override
   public evp a() {
      return evr.c;
   }

   @Nullable
   @Override
   public uy a(err $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<euk<?>> b() {
      return this.g.b();
   }

   public static evq a(err.b $$0) {
      return new evo(b($$0));
   }

   interface a {
      @Nullable
      uy a(err var1);

      String a();

      Set<euk<?>> b();
   }
}
