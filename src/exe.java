import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class exe implements exg {
   private static final String d = "block_entity";
   private static final exe.a e = new exe.a() {
      @Override
      public vc a(eth $$0) {
         drs $$1 = $$0.c(ewd.h);
         return $$1 != null ? $$1.b($$1.i().F_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ewa<?>> b() {
         return ImmutableSet.of(ewd.h);
      }
   };
   public static final exe a = new exe(e);
   private static final Codec<exe.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eth.b $$1 = eth.b.a($$0);
         return b($$1);
      }
   }, exe.a::a);
   public static final MapCodec<exe> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, exe::new));
   public static final Codec<exe> c = f.xmap(exe::new, $$0 -> $$0.g);
   private final exe.a g;

   private static exe.a b(final eth.b $$0) {
      return new exe.a() {
         @Nullable
         @Override
         public vc a(eth $$0x) {
            bto $$1 = $$0.c($$0.a());
            return $$1 != null ? dk.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ewa<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private exe(exe.a $$0) {
      this.g = $$0;
   }

   @Override
   public exf a() {
      return exh.c;
   }

   @Nullable
   @Override
   public vc a(eth $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ewa<?>> b() {
      return this.g.b();
   }

   public static exg a(eth.b $$0) {
      return new exe(b($$0));
   }

   interface a {
      @Nullable
      vc a(eth var1);

      String a();

      Set<ewa<?>> b();
   }
}
