import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fbg implements fbi {
   private static final String d = "block_entity";
   private static final fbg.a e = new fbg.a() {
      @Override
      public ut a(exl $$0) {
         dvl $$1 = $$0.c(faf.h);
         return $$1 != null ? $$1.b($$1.i().F_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bat<?>> b() {
         return Set.of(faf.h);
      }
   };
   public static final fbg a = new fbg(e);
   private static final Codec<fbg.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         exl.b $$1 = exl.b.a($$0);
         return b($$1);
      }
   }, fbg.a::a);
   public static final MapCodec<fbg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fbg::new));
   public static final Codec<fbg> c = f.xmap(fbg::new, $$0 -> $$0.g);
   private final fbg.a g;

   private static fbg.a b(final exl.b $$0) {
      return new fbg.a() {
         @Nullable
         @Override
         public ut a(exl $$0x) {
            bvs $$1 = $$0.c($$0.a());
            return $$1 != null ? dn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bat<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private fbg(fbg.a $$0) {
      this.g = $$0;
   }

   @Override
   public fbh a() {
      return fbj.c;
   }

   @Nullable
   @Override
   public ut a(exl $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bat<?>> b() {
      return this.g.b();
   }

   public static fbi a(exl.b $$0) {
      return new fbg(b($$0));
   }

   interface a {
      @Nullable
      ut a(exl var1);

      String a();

      Set<bat<?>> b();
   }
}
