import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fci implements fck {
   private static final String d = "block_entity";
   private static final fci.a e = new fci.a() {
      @Override
      public uu a(eyn $$0) {
         dwn $$1 = $$0.c(fbh.h);
         return $$1 != null ? $$1.b($$1.i().F_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bav<?>> b() {
         return Set.of(fbh.h);
      }
   };
   public static final fci a = new fci(e);
   private static final Codec<fci.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eyn.b $$1 = eyn.b.a($$0);
         return b($$1);
      }
   }, fci.a::a);
   public static final MapCodec<fci> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fci::new));
   public static final Codec<fci> c = f.xmap(fci::new, $$0 -> $$0.g);
   private final fci.a g;

   private static fci.a b(final eyn.b $$0) {
      return new fci.a() {
         @Nullable
         @Override
         public uu a(eyn $$0x) {
            bwa $$1 = $$0.c($$0.a());
            return $$1 != null ? cy.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bav<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private fci(fci.a $$0) {
      this.g = $$0;
   }

   @Override
   public fcj a() {
      return fcl.c;
   }

   @Nullable
   @Override
   public uu a(eyn $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bav<?>> b() {
      return this.g.b();
   }

   public static fck a(eyn.b $$0) {
      return new fci(b($$0));
   }

   interface a {
      @Nullable
      uu a(eyn var1);

      String a();

      Set<bav<?>> b();
   }
}
