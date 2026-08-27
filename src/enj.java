import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class enj implements enl {
   private static final String d = "block_entity";
   private static final enj.a e = new enj.a() {
      @Override
      public tv a(ejy $$0) {
         djl $$1 = $$0.c(emj.h);
         return $$1 != null ? $$1.b($$1.i().I_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<emg<?>> b() {
         return ImmutableSet.of(emj.h);
      }
   };
   public static final enj a = new enj(e);
   private static final Codec<enj.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ejy.b $$1 = ejy.b.a($$0);
         return b($$1);
      }
   }, enj.a::a);
   public static final Codec<enj> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, enj::new));
   public static final Codec<enj> c = f.xmap(enj::new, $$0 -> $$0.g);
   private final enj.a g;

   private static enj.a b(final ejy.b $$0) {
      return new enj.a() {
         @Nullable
         @Override
         public tv a(ejy $$0x) {
            bof $$1 = $$0.c($$0.a());
            return $$1 != null ? co.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<emg<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private enj(enj.a $$0) {
      this.g = $$0;
   }

   @Override
   public enk a() {
      return enm.c;
   }

   @Nullable
   @Override
   public tv a(ejy $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<emg<?>> b() {
      return this.g.b();
   }

   public static enl a(ejy.b $$0) {
      return new enj(b($$0));
   }

   interface a {
      @Nullable
      tv a(ejy var1);

      String a();

      Set<emg<?>> b();
   }
}
