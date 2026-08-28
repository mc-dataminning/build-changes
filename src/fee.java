import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fee implements feg {
   private static final String d = "block_entity";
   private static final fee.a e = new fee.a() {
      @Override
      public va a(faj $$0) {
         dye $$1 = $$0.c(fdd.h);
         return $$1 != null ? $$1.b($$1.i().J_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bbb<?>> b() {
         return Set.of(fdd.h);
      }
   };
   public static final fee a = new fee(e);
   private static final Codec<fee.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         faj.b $$1 = faj.b.a($$0);
         return b($$1);
      }
   }, fee.a::a);
   public static final MapCodec<fee> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fee::new));
   public static final Codec<fee> c = f.xmap(fee::new, $$0 -> $$0.g);
   private final fee.a g;

   private static fee.a b(final faj.b $$0) {
      return new fee.a() {
         @Nullable
         @Override
         public va a(faj $$0x) {
            bwv $$1 = $$0.c($$0.a());
            return $$1 != null ? da.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bbb<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private fee(fee.a $$0) {
      this.g = $$0;
   }

   @Override
   public fef a() {
      return feh.c;
   }

   @Nullable
   @Override
   public va a(faj $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bbb<?>> b() {
      return this.g.b();
   }

   public static feg a(faj.b $$0) {
      return new fee(b($$0));
   }

   interface a {
      @Nullable
      va a(faj var1);

      String a();

      Set<bbb<?>> b();
   }
}
