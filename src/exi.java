import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class exi implements exk {
   private static final String d = "block_entity";
   private static final exi.a e = new exi.a() {
      @Override
      public vd a(etl $$0) {
         drv $$1 = $$0.c(ewh.h);
         return $$1 != null ? $$1.b($$1.i().G_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ewe<?>> b() {
         return ImmutableSet.of(ewh.h);
      }
   };
   public static final exi a = new exi(e);
   private static final Codec<exi.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         etl.b $$1 = etl.b.a($$0);
         return b($$1);
      }
   }, exi.a::a);
   public static final MapCodec<exi> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, exi::new));
   public static final Codec<exi> c = f.xmap(exi::new, $$0 -> $$0.g);
   private final exi.a g;

   private static exi.a b(final etl.b $$0) {
      return new exi.a() {
         @Nullable
         @Override
         public vd a(etl $$0x) {
            btr $$1 = $$0.c($$0.a());
            return $$1 != null ? dk.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ewe<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private exi(exi.a $$0) {
      this.g = $$0;
   }

   @Override
   public exj a() {
      return exl.c;
   }

   @Nullable
   @Override
   public vd a(etl $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ewe<?>> b() {
      return this.g.b();
   }

   public static exk a(etl.b $$0) {
      return new exi(b($$0));
   }

   interface a {
      @Nullable
      vd a(etl var1);

      String a();

      Set<ewe<?>> b();
   }
}
