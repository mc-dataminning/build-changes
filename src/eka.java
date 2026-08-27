import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eka implements ekc {
   private static final String d = "block_entity";
   private static final eka.a e = new eka.a() {
      @Override
      public ti a(egp $$0) {
         dgo $$1 = $$0.c(eja.h);
         return $$1 != null ? $$1.o() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eix<?>> b() {
         return ImmutableSet.of(eja.h);
      }
   };
   public static final eka a = new eka(e);
   private static final Codec<eka.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         egp.b $$1 = egp.b.a($$0);
         return b($$1);
      }
   }, eka.a::a);
   public static final Codec<eka> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eka::new));
   public static final Codec<eka> c = f.xmap(eka::new, $$0 -> $$0.g);
   private final eka.a g;

   private static eka.a b(final egp.b $$0) {
      return new eka.a() {
         @Nullable
         @Override
         public ti a(egp $$0x) {
            blp $$1 = $$0.c($$0.a());
            return $$1 != null ? cm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eix<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eka(eka.a $$0) {
      this.g = $$0;
   }

   @Override
   public ekb a() {
      return ekd.c;
   }

   @Nullable
   @Override
   public ti a(egp $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eix<?>> b() {
      return this.g.b();
   }

   public static ekc a(egp.b $$0) {
      return new eka(b($$0));
   }

   interface a {
      @Nullable
      ti a(egp var1);

      String a();

      Set<eix<?>> b();
   }
}
