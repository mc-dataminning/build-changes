import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class evh implements evj {
   private static final String d = "block_entity";
   private static final evh.a e = new evh.a() {
      @Override
      public vh a(erp $$0) {
         dqc $$1 = $$0.c(eug.h);
         return $$1 != null ? $$1.b($$1.i().I_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eud<?>> b() {
         return ImmutableSet.of(eug.h);
      }
   };
   public static final evh a = new evh(e);
   private static final Codec<evh.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         erp.b $$1 = erp.b.a($$0);
         return b($$1);
      }
   }, evh.a::a);
   public static final Codec<evh> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, evh::new));
   public static final Codec<evh> c = f.xmap(evh::new, $$0 -> $$0.g);
   private final evh.a g;

   private static evh.a b(final erp.b $$0) {
      return new evh.a() {
         @Nullable
         @Override
         public vh a(erp $$0x) {
            brv $$1 = $$0.c($$0.a());
            return $$1 != null ? cw.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eud<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private evh(evh.a $$0) {
      this.g = $$0;
   }

   @Override
   public evi a() {
      return evk.c;
   }

   @Nullable
   @Override
   public vh a(erp $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eud<?>> b() {
      return this.g.b();
   }

   public static evj a(erp.b $$0) {
      return new evh(b($$0));
   }

   interface a {
      @Nullable
      vh a(erp var1);

      String a();

      Set<eud<?>> b();
   }
}
