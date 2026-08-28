import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class exz implements eyb {
   private static final String d = "block_entity";
   private static final exz.a e = new exz.a() {
      @Override
      public vh a(euc $$0) {
         dsm $$1 = $$0.c(ewy.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ewv<?>> b() {
         return ImmutableSet.of(ewy.h);
      }
   };
   public static final exz a = new exz(e);
   private static final Codec<exz.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         euc.b $$1 = euc.b.a($$0);
         return b($$1);
      }
   }, exz.a::a);
   public static final MapCodec<exz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, exz::new));
   public static final Codec<exz> c = f.xmap(exz::new, $$0 -> $$0.g);
   private final exz.a g;

   private static exz.a b(final euc.b $$0) {
      return new exz.a() {
         @Nullable
         @Override
         public vh a(euc $$0x) {
            bue $$1 = $$0.c($$0.a());
            return $$1 != null ? dm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ewv<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private exz(exz.a $$0) {
      this.g = $$0;
   }

   @Override
   public eya a() {
      return eyc.c;
   }

   @Nullable
   @Override
   public vh a(euc $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ewv<?>> b() {
      return this.g.b();
   }

   public static eyb a(euc.b $$0) {
      return new exz(b($$0));
   }

   interface a {
      @Nullable
      vh a(euc var1);

      String a();

      Set<ewv<?>> b();
   }
}
