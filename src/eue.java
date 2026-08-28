import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eue implements eug {
   private static final String d = "block_entity";
   private static final eue.a e = new eue.a() {
      @Override
      public vp a(eqi $$0) {
         dph $$1 = $$0.c(ete.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<etb<?>> b() {
         return ImmutableSet.of(ete.h);
      }
   };
   public static final eue a = new eue(e);
   private static final Codec<eue.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eqi.b $$1 = eqi.b.a($$0);
         return b($$1);
      }
   }, eue.a::a);
   public static final MapCodec<eue> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eue::new));
   public static final Codec<eue> c = f.xmap(eue::new, $$0 -> $$0.g);
   private final eue.a g;

   private static eue.a b(final eqi.b $$0) {
      return new eue.a() {
         @Nullable
         @Override
         public vp a(eqi $$0x) {
            bsu $$1 = $$0.c($$0.a());
            return $$1 != null ? dg.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<etb<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eue(eue.a $$0) {
      this.g = $$0;
   }

   @Override
   public euf a() {
      return euh.c;
   }

   @Nullable
   @Override
   public vp a(eqi $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<etb<?>> b() {
      return this.g.b();
   }

   public static eug a(eqi.b $$0) {
      return new eue(b($$0));
   }

   interface a {
      @Nullable
      vp a(eqi var1);

      String a();

      Set<etb<?>> b();
   }
}
