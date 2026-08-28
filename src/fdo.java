import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fdo implements fdq {
   private static final String d = "block_entity";
   private static final fdo.a e = new fdo.a() {
      @Override
      public uw a(ezt $$0) {
         dxr $$1 = $$0.c(fcn.h);
         return $$1 != null ? $$1.b($$1.i().F_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bax<?>> b() {
         return Set.of(fcn.h);
      }
   };
   public static final fdo a = new fdo(e);
   private static final Codec<fdo.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ezt.b $$1 = ezt.b.a($$0);
         return b($$1);
      }
   }, fdo.a::a);
   public static final MapCodec<fdo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fdo::new));
   public static final Codec<fdo> c = f.xmap(fdo::new, $$0 -> $$0.g);
   private final fdo.a g;

   private static fdo.a b(final ezt.b $$0) {
      return new fdo.a() {
         @Nullable
         @Override
         public uw a(ezt $$0x) {
            bwi $$1 = $$0.c($$0.a());
            return $$1 != null ? cz.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bax<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private fdo(fdo.a $$0) {
      this.g = $$0;
   }

   @Override
   public fdp a() {
      return fdr.c;
   }

   @Nullable
   @Override
   public uw a(ezt $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bax<?>> b() {
      return this.g.b();
   }

   public static fdq a(ezt.b $$0) {
      return new fdo(b($$0));
   }

   interface a {
      @Nullable
      uw a(ezt var1);

      String a();

      Set<bax<?>> b();
   }
}
