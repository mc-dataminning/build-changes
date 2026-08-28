import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fcu implements fcw {
   private static final String d = "block_entity";
   private static final fcu.a e = new fcu.a() {
      @Override
      public uw a(eyz $$0) {
         dwx $$1 = $$0.c(fbt.h);
         return $$1 != null ? $$1.b($$1.i().F_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bax<?>> b() {
         return Set.of(fbt.h);
      }
   };
   public static final fcu a = new fcu(e);
   private static final Codec<fcu.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eyz.b $$1 = eyz.b.a($$0);
         return b($$1);
      }
   }, fcu.a::a);
   public static final MapCodec<fcu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fcu::new));
   public static final Codec<fcu> c = f.xmap(fcu::new, $$0 -> $$0.g);
   private final fcu.a g;

   private static fcu.a b(final eyz.b $$0) {
      return new fcu.a() {
         @Nullable
         @Override
         public uw a(eyz $$0x) {
            bwd $$1 = $$0.c($$0.a());
            return $$1 != null ? cy.b($$1) : null;
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

   private fcu(fcu.a $$0) {
      this.g = $$0;
   }

   @Override
   public fcv a() {
      return fcx.c;
   }

   @Nullable
   @Override
   public uw a(eyz $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bax<?>> b() {
      return this.g.b();
   }

   public static fcw a(eyz.b $$0) {
      return new fcu(b($$0));
   }

   interface a {
      @Nullable
      uw a(eyz var1);

      String a();

      Set<bax<?>> b();
   }
}
