import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ewq implements ews {
   private static final String d = "block_entity";
   private static final ewq.a e = new ewq.a() {
      @Override
      public vc a(est $$0) {
         dre $$1 = $$0.c(evp.h);
         return $$1 != null ? $$1.b($$1.i().F_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<evm<?>> b() {
         return ImmutableSet.of(evp.h);
      }
   };
   public static final ewq a = new ewq(e);
   private static final Codec<ewq.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         est.b $$1 = est.b.a($$0);
         return b($$1);
      }
   }, ewq.a::a);
   public static final MapCodec<ewq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ewq::new));
   public static final Codec<ewq> c = f.xmap(ewq::new, $$0 -> $$0.g);
   private final ewq.a g;

   private static ewq.a b(final est.b $$0) {
      return new ewq.a() {
         @Nullable
         @Override
         public vc a(est $$0x) {
            btj $$1 = $$0.c($$0.a());
            return $$1 != null ? dk.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<evm<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ewq(ewq.a $$0) {
      this.g = $$0;
   }

   @Override
   public ewr a() {
      return ewt.c;
   }

   @Nullable
   @Override
   public vc a(est $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<evm<?>> b() {
      return this.g.b();
   }

   public static ews a(est.b $$0) {
      return new ewq(b($$0));
   }

   interface a {
      @Nullable
      vc a(est var1);

      String a();

      Set<evm<?>> b();
   }
}
