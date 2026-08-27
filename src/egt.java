import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class egt implements egv {
   private static final String d = "block_entity";
   private static final egt.a e = new egt.a() {
      @Override
      public sn a(edi $$0) {
         ddx $$1 = $$0.c(eft.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<efq<?>> b() {
         return ImmutableSet.of(eft.h);
      }
   };
   public static final egt a = new egt(e);
   private static final Codec<egt.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         edi.b $$1 = edi.b.a($$0);
         return b($$1);
      }
   }, egt.a::a);
   public static final Codec<egt> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, egt::new));
   public static final Codec<egt> c = f.xmap(egt::new, $$0 -> $$0.g);
   private final egt.a g;

   private static egt.a b(final edi.b $$0) {
      return new egt.a() {
         @Nullable
         @Override
         public sn a(edi $$0x) {
            bjt $$1 = $$0.c($$0.a());
            return $$1 != null ? cn.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<efq<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private egt(egt.a $$0) {
      this.g = $$0;
   }

   @Override
   public egu a() {
      return egw.c;
   }

   @Nullable
   @Override
   public sn a(edi $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<efq<?>> b() {
      return this.g.b();
   }

   public static egv a(edi.b $$0) {
      return new egt(b($$0));
   }

   interface a {
      @Nullable
      sn a(edi var1);

      String a();

      Set<efq<?>> b();
   }
}
