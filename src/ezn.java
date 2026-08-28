import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ezn implements ezp {
   private static final String d = "block_entity";
   private static final ezn.a e = new ezn.a() {
      @Override
      public un a(evs $$0) {
         dua $$1 = $$0.c(eym.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bai<?>> b() {
         return Set.of(eym.h);
      }
   };
   public static final ezn a = new ezn(e);
   private static final Codec<ezn.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         evs.b $$1 = evs.b.a($$0);
         return b($$1);
      }
   }, ezn.a::a);
   public static final MapCodec<ezn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ezn::new));
   public static final Codec<ezn> c = f.xmap(ezn::new, $$0 -> $$0.g);
   private final ezn.a g;

   private static ezn.a b(final evs.b $$0) {
      return new ezn.a() {
         @Nullable
         @Override
         public un a(evs $$0x) {
            bum $$1 = $$0.c($$0.a());
            return $$1 != null ? dn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bai<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private ezn(ezn.a $$0) {
      this.g = $$0;
   }

   @Override
   public ezo a() {
      return ezq.c;
   }

   @Nullable
   @Override
   public un a(evs $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bai<?>> b() {
      return this.g.b();
   }

   public static ezp a(evs.b $$0) {
      return new ezn(b($$0));
   }

   interface a {
      @Nullable
      un a(evs var1);

      String a();

      Set<bai<?>> b();
   }
}
