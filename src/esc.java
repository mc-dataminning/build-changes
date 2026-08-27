import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class esc implements ese {
   private static final String d = "block_entity";
   private static final esc.a e = new esc.a() {
      @Override
      public ux a(eol $$0) {
         dnm $$1 = $$0.c(erc.h);
         return $$1 != null ? $$1.b($$1.i().H_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eqz<?>> b() {
         return ImmutableSet.of(erc.h);
      }
   };
   public static final esc a = new esc(e);
   private static final Codec<esc.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eol.b $$1 = eol.b.a($$0);
         return b($$1);
      }
   }, esc.a::a);
   public static final Codec<esc> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, esc::new));
   public static final Codec<esc> c = f.xmap(esc::new, $$0 -> $$0.g);
   private final esc.a g;

   private static esc.a b(final eol.b $$0) {
      return new esc.a() {
         @Nullable
         @Override
         public ux a(eol $$0x) {
            brh $$1 = $$0.c($$0.a());
            return $$1 != null ? cv.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eqz<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private esc(esc.a $$0) {
      this.g = $$0;
   }

   @Override
   public esd a() {
      return esf.c;
   }

   @Nullable
   @Override
   public ux a(eol $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eqz<?>> b() {
      return this.g.b();
   }

   public static ese a(eol.b $$0) {
      return new esc(b($$0));
   }

   interface a {
      @Nullable
      ux a(eol var1);

      String a();

      Set<eqz<?>> b();
   }
}
