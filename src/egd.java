import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class egd implements egf {
   private static final String d = "block_entity";
   private static final egd.a e = new egd.a() {
      @Override
      public rs a(ecs $$0) {
         dcx $$1 = $$0.c(efd.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<efa<?>> b() {
         return ImmutableSet.of(efd.h);
      }
   };
   public static final egd a = new egd(e);
   private static final Codec<egd.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ecs.b $$1 = ecs.b.a($$0);
         return b($$1);
      }
   }, egd.a::a);
   public static final Codec<egd> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, egd::new));
   public static final Codec<egd> c = f.xmap(egd::new, $$0 -> $$0.g);
   private final egd.a g;

   private static egd.a b(final ecs.b $$0) {
      return new egd.a() {
         @Nullable
         @Override
         public rs a(ecs $$0x) {
            bis $$1 = $$0.c($$0.a());
            return $$1 != null ? cn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<efa<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private egd(egd.a $$0) {
      this.g = $$0;
   }

   @Override
   public ege a() {
      return egg.c;
   }

   @Nullable
   @Override
   public rs a(ecs $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<efa<?>> b() {
      return this.g.b();
   }

   public static egf a(ecs.b $$0) {
      return new egd(b($$0));
   }

   interface a {
      @Nullable
      rs a(ecs var1);

      String a();

      Set<efa<?>> b();
   }
}
