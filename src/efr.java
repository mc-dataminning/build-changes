import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class efr implements eft {
   private static final String d = "block_entity";
   private static final efr.a e = new efr.a() {
      @Override
      public rk a(ecg $$0) {
         dcl $$1 = $$0.c(eer.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eeo<?>> b() {
         return ImmutableSet.of(eer.h);
      }
   };
   public static final efr a = new efr(e);
   private static final Codec<efr.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ecg.b $$1 = ecg.b.a($$0);
         return b($$1);
      }
   }, efr.a::a);
   public static final Codec<efr> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, efr::new));
   public static final Codec<efr> c = f.xmap(efr::new, $$0 -> $$0.g);
   private final efr.a g;

   private static efr.a b(final ecg.b $$0) {
      return new efr.a() {
         @Nullable
         @Override
         public rk a(ecg $$0x) {
            bii $$1 = $$0.c($$0.a());
            return $$1 != null ? cl.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eeo<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private efr(efr.a $$0) {
      this.g = $$0;
   }

   @Override
   public efs a() {
      return efu.c;
   }

   @Nullable
   @Override
   public rk a(ecg $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eeo<?>> b() {
      return this.g.b();
   }

   public static eft a(ecg.b $$0) {
      return new efr(b($$0));
   }

   interface a {
      @Nullable
      rk a(ecg var1);

      String a();

      Set<eeo<?>> b();
   }
}
