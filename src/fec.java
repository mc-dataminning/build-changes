import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fec implements fee {
   private static final String d = "block_entity";
   private static final fec.a e = new fec.a() {
      @Override
      public uy a(fah $$0) {
         dyc $$1 = $$0.c(fdb.h);
         return $$1 != null ? $$1.b($$1.i().J_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<baz<?>> b() {
         return Set.of(fdb.h);
      }
   };
   public static final fec a = new fec(e);
   private static final Codec<fec.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         fah.b $$1 = fah.b.a($$0);
         return b($$1);
      }
   }, fec.a::a);
   public static final MapCodec<fec> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fec::new));
   public static final Codec<fec> c = f.xmap(fec::new, $$0 -> $$0.g);
   private final fec.a g;

   private static fec.a b(final fah.b $$0) {
      return new fec.a() {
         @Nullable
         @Override
         public uy a(fah $$0x) {
            bwt $$1 = $$0.c($$0.a());
            return $$1 != null ? cz.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<baz<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private fec(fec.a $$0) {
      this.g = $$0;
   }

   @Override
   public fed a() {
      return fef.c;
   }

   @Nullable
   @Override
   public uy a(fah $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<baz<?>> b() {
      return this.g.b();
   }

   public static fee a(fah.b $$0) {
      return new fec(b($$0));
   }

   interface a {
      @Nullable
      uy a(fah var1);

      String a();

      Set<baz<?>> b();
   }
}
