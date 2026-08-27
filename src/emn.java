import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class emn implements emp {
   private static final String d = "block_entity";
   private static final emn.a e = new emn.a() {
      @Override
      public tt a(ejc $$0) {
         dix $$1 = $$0.c(eln.h);
         return $$1 != null ? $$1.o() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<elk<?>> b() {
         return ImmutableSet.of(eln.h);
      }
   };
   public static final emn a = new emn(e);
   private static final Codec<emn.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ejc.b $$1 = ejc.b.a($$0);
         return b($$1);
      }
   }, emn.a::a);
   public static final Codec<emn> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, emn::new));
   public static final Codec<emn> c = f.xmap(emn::new, $$0 -> $$0.g);
   private final emn.a g;

   private static emn.a b(final ejc.b $$0) {
      return new emn.a() {
         @Nullable
         @Override
         public tt a(ejc $$0x) {
            bnq $$1 = $$0.c($$0.a());
            return $$1 != null ? co.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<elk<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private emn(emn.a $$0) {
      this.g = $$0;
   }

   @Override
   public emo a() {
      return emq.c;
   }

   @Nullable
   @Override
   public tt a(ejc $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<elk<?>> b() {
      return this.g.b();
   }

   public static emp a(ejc.b $$0) {
      return new emn(b($$0));
   }

   interface a {
      @Nullable
      tt a(ejc var1);

      String a();

      Set<elk<?>> b();
   }
}
