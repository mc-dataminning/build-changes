import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class efs implements efu {
   private static final String d = "block_entity";
   private static final efs.a e = new efs.a() {
      @Override
      public rk a(ech $$0) {
         dcm $$1 = $$0.c(ees.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eep<?>> b() {
         return ImmutableSet.of(ees.h);
      }
   };
   public static final efs a = new efs(e);
   private static final Codec<efs.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ech.b $$1 = ech.b.a($$0);
         return b($$1);
      }
   }, efs.a::a);
   public static final Codec<efs> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, efs::new));
   public static final Codec<efs> c = f.xmap(efs::new, $$0 -> $$0.g);
   private final efs.a g;

   private static efs.a b(final ech.b $$0) {
      return new efs.a() {
         @Nullable
         @Override
         public rk a(ech $$0x) {
            bii $$1 = $$0.c($$0.a());
            return $$1 != null ? cl.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eep<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private efs(efs.a $$0) {
      this.g = $$0;
   }

   @Override
   public eft a() {
      return efv.c;
   }

   @Nullable
   @Override
   public rk a(ech $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eep<?>> b() {
      return this.g.b();
   }

   public static efu a(ech.b $$0) {
      return new efs(b($$0));
   }

   interface a {
      @Nullable
      rk a(ech var1);

      String a();

      Set<eep<?>> b();
   }
}
