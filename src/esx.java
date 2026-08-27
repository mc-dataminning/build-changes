import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class esx implements esz {
   private static final String d = "block_entity";
   private static final esx.a e = new esx.a() {
      @Override
      public va a(epf $$0) {
         dog $$1 = $$0.c(erx.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eru<?>> b() {
         return ImmutableSet.of(erx.h);
      }
   };
   public static final esx a = new esx(e);
   private static final Codec<esx.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         epf.b $$1 = epf.b.a($$0);
         return b($$1);
      }
   }, esx.a::a);
   public static final MapCodec<esx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, esx::new));
   public static final Codec<esx> c = f.xmap(esx::new, $$0 -> $$0.g);
   private final esx.a g;

   private static esx.a b(final epf.b $$0) {
      return new esx.a() {
         @Nullable
         @Override
         public va a(epf $$0x) {
            bru $$1 = $$0.c($$0.a());
            return $$1 != null ? cv.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eru<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private esx(esx.a $$0) {
      this.g = $$0;
   }

   @Override
   public esy a() {
      return eta.c;
   }

   @Nullable
   @Override
   public va a(epf $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eru<?>> b() {
      return this.g.b();
   }

   public static esz a(epf.b $$0) {
      return new esx(b($$0));
   }

   interface a {
      @Nullable
      va a(epf var1);

      String a();

      Set<eru<?>> b();
   }
}
