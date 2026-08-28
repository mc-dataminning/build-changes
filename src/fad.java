import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fad implements faf {
   private static final String d = "block_entity";
   private static final fad.a e = new fad.a() {
      @Override
      public vj a(ewi $$0) {
         duq $$1 = $$0.c(ezc.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bbd<?>> b() {
         return Set.of(ezc.h);
      }
   };
   public static final fad a = new fad(e);
   private static final Codec<fad.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ewi.b $$1 = ewi.b.a($$0);
         return b($$1);
      }
   }, fad.a::a);
   public static final MapCodec<fad> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fad::new));
   public static final Codec<fad> c = f.xmap(fad::new, $$0 -> $$0.g);
   private final fad.a g;

   private static fad.a b(final ewi.b $$0) {
      return new fad.a() {
         @Nullable
         @Override
         public vj a(ewi $$0x) {
            bvb $$1 = $$0.c($$0.a());
            return $$1 != null ? dm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bbd<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private fad(fad.a $$0) {
      this.g = $$0;
   }

   @Override
   public fae a() {
      return fag.c;
   }

   @Nullable
   @Override
   public vj a(ewi $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bbd<?>> b() {
      return this.g.b();
   }

   public static faf a(ewi.b $$0) {
      return new fad(b($$0));
   }

   interface a {
      @Nullable
      vj a(ewi var1);

      String a();

      Set<bbd<?>> b();
   }
}
