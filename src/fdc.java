import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fdc implements fde {
   private static final String d = "block_entity";
   private static final fdc.a e = new fdc.a() {
      @Override
      public uw a(ezh $$0) {
         dxf $$1 = $$0.c(fcb.h);
         return $$1 != null ? $$1.b($$1.i().F_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bax<?>> b() {
         return Set.of(fcb.h);
      }
   };
   public static final fdc a = new fdc(e);
   private static final Codec<fdc.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ezh.b $$1 = ezh.b.a($$0);
         return b($$1);
      }
   }, fdc.a::a);
   public static final MapCodec<fdc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fdc::new));
   public static final Codec<fdc> c = f.xmap(fdc::new, $$0 -> $$0.g);
   private final fdc.a g;

   private static fdc.a b(final ezh.b $$0) {
      return new fdc.a() {
         @Nullable
         @Override
         public uw a(ezh $$0x) {
            bwf $$1 = $$0.c($$0.a());
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

   private fdc(fdc.a $$0) {
      this.g = $$0;
   }

   @Override
   public fdd a() {
      return fdf.c;
   }

   @Nullable
   @Override
   public uw a(ezh $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bax<?>> b() {
      return this.g.b();
   }

   public static fde a(ezh.b $$0) {
      return new fdc(b($$0));
   }

   interface a {
      @Nullable
      uw a(ezh var1);

      String a();

      Set<bax<?>> b();
   }
}
