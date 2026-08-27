import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ejp implements ejr {
   private static final String d = "block_entity";
   private static final ejp.a e = new ejp.a() {
      @Override
      public tg a(ege $$0) {
         dgd $$1 = $$0.c(eip.h);
         return $$1 != null ? $$1.o() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eim<?>> b() {
         return ImmutableSet.of(eip.h);
      }
   };
   public static final ejp a = new ejp(e);
   private static final Codec<ejp.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ege.b $$1 = ege.b.a($$0);
         return b($$1);
      }
   }, ejp.a::a);
   public static final Codec<ejp> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ejp::new));
   public static final Codec<ejp> c = f.xmap(ejp::new, $$0 -> $$0.g);
   private final ejp.a g;

   private static ejp.a b(final ege.b $$0) {
      return new ejp.a() {
         @Nullable
         @Override
         public tg a(ege $$0x) {
            blf $$1 = $$0.c($$0.a());
            return $$1 != null ? cm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eim<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ejp(ejp.a $$0) {
      this.g = $$0;
   }

   @Override
   public ejq a() {
      return ejs.c;
   }

   @Nullable
   @Override
   public tg a(ege $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eim<?>> b() {
      return this.g.b();
   }

   public static ejr a(ege.b $$0) {
      return new ejp(b($$0));
   }

   interface a {
      @Nullable
      tg a(ege var1);

      String a();

      Set<eim<?>> b();
   }
}
