import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class evm implements evo {
   private static final String d = "block_entity";
   private static final evm.a e = new evm.a() {
      @Override
      public uy a(erp $$0) {
         dqh $$1 = $$0.c(eul.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eui<?>> b() {
         return ImmutableSet.of(eul.h);
      }
   };
   public static final evm a = new evm(e);
   private static final Codec<evm.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         erp.b $$1 = erp.b.a($$0);
         return b($$1);
      }
   }, evm.a::a);
   public static final MapCodec<evm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, evm::new));
   public static final Codec<evm> c = f.xmap(evm::new, $$0 -> $$0.g);
   private final evm.a g;

   private static evm.a b(final erp.b $$0) {
      return new evm.a() {
         @Nullable
         @Override
         public uy a(erp $$0x) {
            bsr $$1 = $$0.c($$0.a());
            return $$1 != null ? dk.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eui<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private evm(evm.a $$0) {
      this.g = $$0;
   }

   @Override
   public evn a() {
      return evp.c;
   }

   @Nullable
   @Override
   public uy a(erp $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eui<?>> b() {
      return this.g.b();
   }

   public static evo a(erp.b $$0) {
      return new evm(b($$0));
   }

   interface a {
      @Nullable
      uy a(erp var1);

      String a();

      Set<eui<?>> b();
   }
}
