import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class efw implements efy {
   private static final String d = "block_entity";
   private static final efw.a e = new efw.a() {
      @Override
      public rn a(ecl $$0) {
         dcq $$1 = $$0.c(eew.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eet<?>> b() {
         return ImmutableSet.of(eew.h);
      }
   };
   public static final efw a = new efw(e);
   private static final Codec<efw.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ecl.b $$1 = ecl.b.a($$0);
         return b($$1);
      }
   }, efw.a::a);
   public static final Codec<efw> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, efw::new));
   public static final Codec<efw> c = f.xmap(efw::new, $$0 -> $$0.g);
   private final efw.a g;

   private static efw.a b(final ecl.b $$0) {
      return new efw.a() {
         @Nullable
         @Override
         public rn a(ecl $$0x) {
            bil $$1 = $$0.c($$0.a());
            return $$1 != null ? cn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eet<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private efw(efw.a $$0) {
      this.g = $$0;
   }

   @Override
   public efx a() {
      return efz.c;
   }

   @Nullable
   @Override
   public rn a(ecl $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eet<?>> b() {
      return this.g.b();
   }

   public static efy a(ecl.b $$0) {
      return new efw(b($$0));
   }

   interface a {
      @Nullable
      rn a(ecl var1);

      String a();

      Set<eet<?>> b();
   }
}
