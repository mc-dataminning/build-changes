import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class egb implements egd {
   private static final String d = "block_entity";
   private static final egb.a e = new egb.a() {
      @Override
      public rr a(ecq $$0) {
         dcv $$1 = $$0.c(efb.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eey<?>> b() {
         return ImmutableSet.of(efb.h);
      }
   };
   public static final egb a = new egb(e);
   private static final Codec<egb.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ecq.b $$1 = ecq.b.a($$0);
         return b($$1);
      }
   }, egb.a::a);
   public static final Codec<egb> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, egb::new));
   public static final Codec<egb> c = f.xmap(egb::new, $$0 -> $$0.g);
   private final egb.a g;

   private static egb.a b(final ecq.b $$0) {
      return new egb.a() {
         @Nullable
         @Override
         public rr a(ecq $$0x) {
            biq $$1 = $$0.c($$0.a());
            return $$1 != null ? cn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eey<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private egb(egb.a $$0) {
      this.g = $$0;
   }

   @Override
   public egc a() {
      return ege.c;
   }

   @Nullable
   @Override
   public rr a(ecq $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eey<?>> b() {
      return this.g.b();
   }

   public static egd a(ecq.b $$0) {
      return new egb(b($$0));
   }

   interface a {
      @Nullable
      rr a(ecq var1);

      String a();

      Set<eey<?>> b();
   }
}
