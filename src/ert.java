import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ert implements erv {
   private static final String d = "block_entity";
   private static final ert.a e = new ert.a() {
      @Override
      public uv a(eoa $$0) {
         dnd $$1 = $$0.c(eqt.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eqq<?>> b() {
         return ImmutableSet.of(eqt.h);
      }
   };
   public static final ert a = new ert(e);
   private static final Codec<ert.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eoa.b $$1 = eoa.b.a($$0);
         return b($$1);
      }
   }, ert.a::a);
   public static final Codec<ert> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ert::new));
   public static final Codec<ert> c = f.xmap(ert::new, $$0 -> $$0.g);
   private final ert.a g;

   private static ert.a b(final eoa.b $$0) {
      return new ert.a() {
         @Nullable
         @Override
         public uv a(eoa $$0x) {
            bql $$1 = $$0.c($$0.a());
            return $$1 != null ? cu.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eqq<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ert(ert.a $$0) {
      this.g = $$0;
   }

   @Override
   public eru a() {
      return erw.c;
   }

   @Nullable
   @Override
   public uv a(eoa $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eqq<?>> b() {
      return this.g.b();
   }

   public static erv a(eoa.b $$0) {
      return new ert(b($$0));
   }

   interface a {
      @Nullable
      uv a(eoa var1);

      String a();

      Set<eqq<?>> b();
   }
}
