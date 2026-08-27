import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eii implements eik {
   private static final String d = "block_entity";
   private static final eii.a e = new eii.a() {
      @Override
      public sw a(eex $$0) {
         dfd $$1 = $$0.c(ehi.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ehf<?>> b() {
         return ImmutableSet.of(ehi.h);
      }
   };
   public static final eii a = new eii(e);
   private static final Codec<eii.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eex.b $$1 = eex.b.a($$0);
         return b($$1);
      }
   }, eii.a::a);
   public static final Codec<eii> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eii::new));
   public static final Codec<eii> c = f.xmap(eii::new, $$0 -> $$0.g);
   private final eii.a g;

   private static eii.a b(final eex.b $$0) {
      return new eii.a() {
         @Nullable
         @Override
         public sw a(eex $$0x) {
            bkq $$1 = $$0.c($$0.a());
            return $$1 != null ? cn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ehf<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eii(eii.a $$0) {
      this.g = $$0;
   }

   @Override
   public eij a() {
      return eil.c;
   }

   @Nullable
   @Override
   public sw a(eex $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ehf<?>> b() {
      return this.g.b();
   }

   public static eik a(eex.b $$0) {
      return new eii(b($$0));
   }

   interface a {
      @Nullable
      sw a(eex var1);

      String a();

      Set<ehf<?>> b();
   }
}
