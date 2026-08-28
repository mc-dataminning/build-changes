import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class eur implements eut {
   private static final String d = "block_entity";
   private static final eur.a e = new eur.a() {
      @Override
      public uu a(equ $$0) {
         dpp $$1 = $$0.c(etq.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<etn<?>> b() {
         return ImmutableSet.of(etq.h);
      }
   };
   public static final eur a = new eur(e);
   private static final Codec<eur.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         equ.b $$1 = equ.b.a($$0);
         return b($$1);
      }
   }, eur.a::a);
   public static final MapCodec<eur> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, eur::new));
   public static final Codec<eur> c = f.xmap(eur::new, $$0 -> $$0.g);
   private final eur.a g;

   private static eur.a b(final equ.b $$0) {
      return new eur.a() {
         @Nullable
         @Override
         public uu a(equ $$0x) {
            bsg $$1 = $$0.c($$0.a());
            return $$1 != null ? dh.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<etn<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eur(eur.a $$0) {
      this.g = $$0;
   }

   @Override
   public eus a() {
      return euu.c;
   }

   @Nullable
   @Override
   public uu a(equ $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<etn<?>> b() {
      return this.g.b();
   }

   public static eut a(equ.b $$0) {
      return new eur(b($$0));
   }

   interface a {
      @Nullable
      uu a(equ var1);

      String a();

      Set<etn<?>> b();
   }
}
