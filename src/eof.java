import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eof implements eoh {
   private static final String d = "block_entity";
   private static final eof.a e = new eof.a() {
      @Override
      public tx a(eku $$0) {
         dkg $$1 = $$0.c(enf.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<enc<?>> b() {
         return ImmutableSet.of(enf.h);
      }
   };
   public static final eof a = new eof(e);
   private static final Codec<eof.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eku.b $$1 = eku.b.a($$0);
         return b($$1);
      }
   }, eof.a::a);
   public static final Codec<eof> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eof::new));
   public static final Codec<eof> c = f.xmap(eof::new, $$0 -> $$0.g);
   private final eof.a g;

   private static eof.a b(final eku.b $$0) {
      return new eof.a() {
         @Nullable
         @Override
         public tx a(eku $$0x) {
            bow $$1 = $$0.c($$0.a());
            return $$1 != null ? co.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<enc<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eof(eof.a $$0) {
      this.g = $$0;
   }

   @Override
   public eog a() {
      return eoi.c;
   }

   @Nullable
   @Override
   public tx a(eku $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<enc<?>> b() {
      return this.g.b();
   }

   public static eoh a(eku.b $$0) {
      return new eof(b($$0));
   }

   interface a {
      @Nullable
      tx a(eku var1);

      String a();

      Set<enc<?>> b();
   }
}
