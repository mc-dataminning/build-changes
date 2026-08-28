import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class faj implements fal {
   private static final String d = "block_entity";
   private static final faj.a e = new faj.a() {
      @Override
      public vu a(ewo $$0) {
         duw $$1 = $$0.c(ezi.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bbn<?>> b() {
         return Set.of(ezi.h);
      }
   };
   public static final faj a = new faj(e);
   private static final Codec<faj.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ewo.b $$1 = ewo.b.a($$0);
         return b($$1);
      }
   }, faj.a::a);
   public static final MapCodec<faj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, faj::new));
   public static final Codec<faj> c = f.xmap(faj::new, $$0 -> $$0.g);
   private final faj.a g;

   private static faj.a b(final ewo.b $$0) {
      return new faj.a() {
         @Nullable
         @Override
         public vu a(ewo $$0x) {
            bvj $$1 = $$0.c($$0.a());
            return $$1 != null ? dm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bbn<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private faj(faj.a $$0) {
      this.g = $$0;
   }

   @Override
   public fak a() {
      return fam.c;
   }

   @Nullable
   @Override
   public vu a(ewo $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bbn<?>> b() {
      return this.g.b();
   }

   public static fal a(ewo.b $$0) {
      return new faj(b($$0));
   }

   interface a {
      @Nullable
      vu a(ewo var1);

      String a();

      Set<bbn<?>> b();
   }
}
