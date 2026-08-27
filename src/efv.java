import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class efv implements efx {
   private static final String d = "block_entity";
   private static final efv.a e = new efv.a() {
      @Override
      public rq a(eck $$0) {
         dcz $$1 = $$0.c(eev.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ees<?>> b() {
         return ImmutableSet.of(eev.h);
      }
   };
   public static final efv a = new efv(e);
   private static final Codec<efv.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eck.b $$1 = eck.b.a($$0);
         return b($$1);
      }
   }, efv.a::a);
   public static final Codec<efv> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, efv::new));
   public static final Codec<efv> c = f.xmap(efv::new, $$0 -> $$0.g);
   private final efv.a g;

   private static efv.a b(final eck.b $$0) {
      return new efv.a() {
         @Nullable
         @Override
         public rq a(eck $$0x) {
            biw $$1 = $$0.c($$0.a());
            return $$1 != null ? cn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ees<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private efv(efv.a $$0) {
      this.g = $$0;
   }

   @Override
   public efw a() {
      return efy.c;
   }

   @Nullable
   @Override
   public rq a(eck $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ees<?>> b() {
      return this.g.b();
   }

   public static efx a(eck.b $$0) {
      return new efv(b($$0));
   }

   interface a {
      @Nullable
      rq a(eck var1);

      String a();

      Set<ees<?>> b();
   }
}
