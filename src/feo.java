import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class feo implements feq {
   private static final String d = "block_entity";
   private static final feo.a e = new feo.a() {
      @Override
      public va a(fat $$0) {
         dyo $$1 = $$0.c(fdn.h);
         return $$1 != null ? $$1.b($$1.i().J_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bbk<?>> b() {
         return Set.of(fdn.h);
      }
   };
   public static final feo a = new feo(e);
   private static final Codec<feo.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         fat.b $$1 = fat.b.a($$0);
         return b($$1);
      }
   }, feo.a::a);
   public static final MapCodec<feo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, feo::new));
   public static final Codec<feo> c = f.xmap(feo::new, $$0 -> $$0.g);
   private final feo.a g;

   private static feo.a b(final fat.b $$0) {
      return new feo.a() {
         @Nullable
         @Override
         public va a(fat $$0x) {
            bxe $$1 = $$0.c($$0.a());
            return $$1 != null ? da.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bbk<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private feo(feo.a $$0) {
      this.g = $$0;
   }

   @Override
   public fep a() {
      return fer.c;
   }

   @Nullable
   @Override
   public va a(fat $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bbk<?>> b() {
      return this.g.b();
   }

   public static feq a(fat.b $$0) {
      return new feo(b($$0));
   }

   interface a {
      @Nullable
      va a(fat var1);

      String a();

      Set<bbk<?>> b();
   }
}
