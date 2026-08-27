import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ehw implements ehy {
   private static final String d = "block_entity";
   private static final ehw.a e = new ehw.a() {
      @Override
      public sw a(eel $$0) {
         der $$1 = $$0.c(egw.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<egt<?>> b() {
         return ImmutableSet.of(egw.h);
      }
   };
   public static final ehw a = new ehw(e);
   private static final Codec<ehw.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eel.b $$1 = eel.b.a($$0);
         return b($$1);
      }
   }, ehw.a::a);
   public static final Codec<ehw> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ehw::new));
   public static final Codec<ehw> c = f.xmap(ehw::new, $$0 -> $$0.g);
   private final ehw.a g;

   private static ehw.a b(final eel.b $$0) {
      return new ehw.a() {
         @Nullable
         @Override
         public sw a(eel $$0x) {
            bki $$1 = $$0.c($$0.a());
            return $$1 != null ? cn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<egt<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ehw(ehw.a $$0) {
      this.g = $$0;
   }

   @Override
   public ehx a() {
      return ehz.c;
   }

   @Nullable
   @Override
   public sw a(eel $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<egt<?>> b() {
      return this.g.b();
   }

   public static ehy a(eel.b $$0) {
      return new ehw(b($$0));
   }

   interface a {
      @Nullable
      sw a(eel var1);

      String a();

      Set<egt<?>> b();
   }
}
