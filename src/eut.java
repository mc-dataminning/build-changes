import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eut implements euv {
   private static final String d = "block_entity";
   private static final eut.a e = new eut.a() {
      @Override
      public uu a(eqw $$0) {
         dpq $$1 = $$0.c(ets.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<etp<?>> b() {
         return ImmutableSet.of(ets.h);
      }
   };
   public static final eut a = new eut(e);
   private static final Codec<eut.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eqw.b $$1 = eqw.b.a($$0);
         return b($$1);
      }
   }, eut.a::a);
   public static final MapCodec<eut> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eut::new));
   public static final Codec<eut> c = f.xmap(eut::new, $$0 -> $$0.g);
   private final eut.a g;

   private static eut.a b(final eqw.b $$0) {
      return new eut.a() {
         @Nullable
         @Override
         public uu a(eqw $$0x) {
            bsh $$1 = $$0.c($$0.a());
            return $$1 != null ? dh.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<etp<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eut(eut.a $$0) {
      this.g = $$0;
   }

   @Override
   public euu a() {
      return euw.c;
   }

   @Nullable
   @Override
   public uu a(eqw $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<etp<?>> b() {
      return this.g.b();
   }

   public static euv a(eqw.b $$0) {
      return new eut(b($$0));
   }

   interface a {
      @Nullable
      uu a(eqw var1);

      String a();

      Set<etp<?>> b();
   }
}
