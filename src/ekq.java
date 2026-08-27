import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ekq implements eks {
   private static final String d = "block_entity";
   private static final ekq.a e = new ekq.a() {
      @Override
      public tl a(ehf $$0) {
         dhd $$1 = $$0.c(ejq.h);
         return $$1 != null ? $$1.o() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ejn<?>> b() {
         return ImmutableSet.of(ejq.h);
      }
   };
   public static final ekq a = new ekq(e);
   private static final Codec<ekq.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         ehf.b $$1 = ehf.b.a($$0);
         return b($$1);
      }
   }, ekq.a::a);
   public static final Codec<ekq> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ekq::new));
   public static final Codec<ekq> c = f.xmap(ekq::new, $$0 -> $$0.g);
   private final ekq.a g;

   private static ekq.a b(final ehf.b $$0) {
      return new ekq.a() {
         @Nullable
         @Override
         public tl a(ehf $$0x) {
            blw $$1 = $$0.c($$0.a());
            return $$1 != null ? cm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ejn<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ekq(ekq.a $$0) {
      this.g = $$0;
   }

   @Override
   public ekr a() {
      return ekt.c;
   }

   @Nullable
   @Override
   public tl a(ehf $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ejn<?>> b() {
      return this.g.b();
   }

   public static eks a(ehf.b $$0) {
      return new ekq(b($$0));
   }

   interface a {
      @Nullable
      tl a(ehf var1);

      String a();

      Set<ejn<?>> b();
   }
}
