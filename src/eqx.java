import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eqx implements eqz {
   private static final String d = "block_entity";
   private static final eqx.a e = new eqx.a() {
      @Override
      public ul a(enk $$0) {
         dmo $$1 = $$0.c(epx.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<epu<?>> b() {
         return ImmutableSet.of(epx.h);
      }
   };
   public static final eqx a = new eqx(e);
   private static final Codec<eqx.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         enk.b $$1 = enk.b.a($$0);
         return b($$1);
      }
   }, eqx.a::a);
   public static final Codec<eqx> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eqx::new));
   public static final Codec<eqx> c = f.xmap(eqx::new, $$0 -> $$0.g);
   private final eqx.a g;

   private static eqx.a b(final enk.b $$0) {
      return new eqx.a() {
         @Nullable
         @Override
         public ul a(enk $$0x) {
            bqa $$1 = $$0.c($$0.a());
            return $$1 != null ? co.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<epu<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eqx(eqx.a $$0) {
      this.g = $$0;
   }

   @Override
   public eqy a() {
      return era.c;
   }

   @Nullable
   @Override
   public ul a(enk $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<epu<?>> b() {
      return this.g.b();
   }

   public static eqz a(enk.b $$0) {
      return new eqx(b($$0));
   }

   interface a {
      @Nullable
      ul a(enk var1);

      String a();

      Set<epu<?>> b();
   }
}
