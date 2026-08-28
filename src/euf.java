import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class euf implements euh {
   private static final String d = "block_entity";
   private static final euf.a e = new euf.a() {
      @Override
      public vp a(eqj $$0) {
         dpi $$1 = $$0.c(etf.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<etc<?>> b() {
         return ImmutableSet.of(etf.h);
      }
   };
   public static final euf a = new euf(e);
   private static final Codec<euf.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eqj.b $$1 = eqj.b.a($$0);
         return b($$1);
      }
   }, euf.a::a);
   public static final MapCodec<euf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, euf::new));
   public static final Codec<euf> c = f.xmap(euf::new, $$0 -> $$0.g);
   private final euf.a g;

   private static euf.a b(final eqj.b $$0) {
      return new euf.a() {
         @Nullable
         @Override
         public vp a(eqj $$0x) {
            bsv $$1 = $$0.c($$0.a());
            return $$1 != null ? dg.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<etc<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private euf(euf.a $$0) {
      this.g = $$0;
   }

   @Override
   public eug a() {
      return eui.c;
   }

   @Nullable
   @Override
   public vp a(eqj $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<etc<?>> b() {
      return this.g.b();
   }

   public static euh a(eqj.b $$0) {
      return new euf(b($$0));
   }

   interface a {
      @Nullable
      vp a(eqj var1);

      String a();

      Set<etc<?>> b();
   }
}
