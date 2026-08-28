import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fdj implements fdl {
   private static final String d = "block_entity";
   private static final fdj.a e = new fdj.a() {
      @Override
      public uw a(ezo $$0) {
         dxm $$1 = $$0.c(fci.h);
         return $$1 != null ? $$1.b($$1.i().F_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bax<?>> b() {
         return Set.of(fci.h);
      }
   };
   public static final fdj a = new fdj(e);
   private static final Codec<fdj.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ezo.b $$1 = ezo.b.a($$0);
         return b($$1);
      }
   }, fdj.a::a);
   public static final MapCodec<fdj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fdj::new));
   public static final Codec<fdj> c = f.xmap(fdj::new, $$0 -> $$0.g);
   private final fdj.a g;

   private static fdj.a b(final ezo.b $$0) {
      return new fdj.a() {
         @Nullable
         @Override
         public uw a(ezo $$0x) {
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

   private fdj(fdj.a $$0) {
      this.g = $$0;
   }

   @Override
   public fdk a() {
      return fdm.c;
   }

   @Nullable
   @Override
   public uw a(ezo $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bax<?>> b() {
      return this.g.b();
   }

   public static fdl a(ezo.b $$0) {
      return new fdj(b($$0));
   }

   interface a {
      @Nullable
      uw a(ezo var1);

      String a();

      Set<bax<?>> b();
   }
}
