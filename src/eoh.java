import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eoh implements eoj {
   private static final String d = "block_entity";
   private static final eoh.a e = new eoh.a() {
      @Override
      public tx a(ekw $$0) {
         dki $$1 = $$0.c(enh.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ene<?>> b() {
         return ImmutableSet.of(enh.h);
      }
   };
   public static final eoh a = new eoh(e);
   private static final Codec<eoh.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ekw.b $$1 = ekw.b.a($$0);
         return b($$1);
      }
   }, eoh.a::a);
   public static final Codec<eoh> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eoh::new));
   public static final Codec<eoh> c = f.xmap(eoh::new, $$0 -> $$0.g);
   private final eoh.a g;

   private static eoh.a b(final ekw.b $$0) {
      return new eoh.a() {
         @Nullable
         @Override
         public tx a(ekw $$0x) {
            box $$1 = $$0.c($$0.a());
            return $$1 != null ? co.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ene<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eoh(eoh.a $$0) {
      this.g = $$0;
   }

   @Override
   public eoi a() {
      return eok.c;
   }

   @Nullable
   @Override
   public tx a(ekw $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ene<?>> b() {
      return this.g.b();
   }

   public static eoj a(ekw.b $$0) {
      return new eoh(b($$0));
   }

   interface a {
      @Nullable
      tx a(ekw var1);

      String a();

      Set<ene<?>> b();
   }
}
