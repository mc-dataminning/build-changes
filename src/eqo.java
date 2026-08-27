import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eqo implements eqq {
   private static final String d = "block_entity";
   private static final eqo.a e = new eqo.a() {
      @Override
      public uj a(enb $$0) {
         dmf $$1 = $$0.c(epo.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<epl<?>> b() {
         return ImmutableSet.of(epo.h);
      }
   };
   public static final eqo a = new eqo(e);
   private static final Codec<eqo.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         enb.b $$1 = enb.b.a($$0);
         return b($$1);
      }
   }, eqo.a::a);
   public static final Codec<eqo> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eqo::new));
   public static final Codec<eqo> c = f.xmap(eqo::new, $$0 -> $$0.g);
   private final eqo.a g;

   private static eqo.a b(final enb.b $$0) {
      return new eqo.a() {
         @Nullable
         @Override
         public uj a(enb $$0x) {
            bpv $$1 = $$0.c($$0.a());
            return $$1 != null ? co.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<epl<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eqo(eqo.a $$0) {
      this.g = $$0;
   }

   @Override
   public eqp a() {
      return eqr.c;
   }

   @Nullable
   @Override
   public uj a(enb $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<epl<?>> b() {
      return this.g.b();
   }

   public static eqq a(enb.b $$0) {
      return new eqo(b($$0));
   }

   interface a {
      @Nullable
      uj a(enb var1);

      String a();

      Set<epl<?>> b();
   }
}
