import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fae implements fag {
   private static final String d = "block_entity";
   private static final fae.a e = new fae.a() {
      @Override
      public vu a(ewh $$0) {
         dup $$1 = $$0.c(ezd.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eza<?>> b() {
         return ImmutableSet.of(ezd.h);
      }
   };
   public static final fae a = new fae(e);
   private static final Codec<fae.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ewh.b $$1 = ewh.b.a($$0);
         return b($$1);
      }
   }, fae.a::a);
   public static final MapCodec<fae> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fae::new));
   public static final Codec<fae> c = f.xmap(fae::new, $$0 -> $$0.g);
   private final fae.a g;

   private static fae.a b(final ewh.b $$0) {
      return new fae.a() {
         @Nullable
         @Override
         public vu a(ewh $$0x) {
            bvf $$1 = $$0.c($$0.a());
            return $$1 != null ? dm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eza<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private fae(fae.a $$0) {
      this.g = $$0;
   }

   @Override
   public faf a() {
      return fah.c;
   }

   @Nullable
   @Override
   public vu a(ewh $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eza<?>> b() {
      return this.g.b();
   }

   public static fag a(ewh.b $$0) {
      return new fae(b($$0));
   }

   interface a {
      @Nullable
      vu a(ewh var1);

      String a();

      Set<eza<?>> b();
   }
}
