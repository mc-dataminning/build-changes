import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ext implements exv {
   private static final String d = "block_entity";
   private static final ext.a e = new ext.a() {
      @Override
      public vg a(etw $$0) {
         dsg $$1 = $$0.c(ews.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ewp<?>> b() {
         return ImmutableSet.of(ews.h);
      }
   };
   public static final ext a = new ext(e);
   private static final Codec<ext.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         etw.b $$1 = etw.b.a($$0);
         return b($$1);
      }
   }, ext.a::a);
   public static final MapCodec<ext> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ext::new));
   public static final Codec<ext> c = f.xmap(ext::new, $$0 -> $$0.g);
   private final ext.a g;

   private static ext.a b(final etw.b $$0) {
      return new ext.a() {
         @Nullable
         @Override
         public vg a(etw $$0x) {
            btz $$1 = $$0.c($$0.a());
            return $$1 != null ? dl.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ewp<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ext(ext.a $$0) {
      this.g = $$0;
   }

   @Override
   public exu a() {
      return exw.c;
   }

   @Nullable
   @Override
   public vg a(etw $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ewp<?>> b() {
      return this.g.b();
   }

   public static exv a(etw.b $$0) {
      return new ext(b($$0));
   }

   interface a {
      @Nullable
      vg a(etw var1);

      String a();

      Set<ewp<?>> b();
   }
}
