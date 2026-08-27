import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ekh implements ekj {
   private static final String d = "block_entity";
   private static final ekh.a e = new ekh.a() {
      @Override
      public tk a(egw $$0) {
         dgv $$1 = $$0.c(ejh.h);
         return $$1 != null ? $$1.o() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eje<?>> b() {
         return ImmutableSet.of(ejh.h);
      }
   };
   public static final ekh a = new ekh(e);
   private static final Codec<ekh.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         egw.b $$1 = egw.b.a($$0);
         return b($$1);
      }
   }, ekh.a::a);
   public static final Codec<ekh> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ekh::new));
   public static final Codec<ekh> c = f.xmap(ekh::new, $$0 -> $$0.g);
   private final ekh.a g;

   private static ekh.a b(final egw.b $$0) {
      return new ekh.a() {
         @Nullable
         @Override
         public tk a(egw $$0x) {
            blv $$1 = $$0.c($$0.a());
            return $$1 != null ? cm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eje<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ekh(ekh.a $$0) {
      this.g = $$0;
   }

   @Override
   public eki a() {
      return ekk.c;
   }

   @Nullable
   @Override
   public tk a(egw $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eje<?>> b() {
      return this.g.b();
   }

   public static ekj a(egw.b $$0) {
      return new ekh(b($$0));
   }

   interface a {
      @Nullable
      tk a(egw var1);

      String a();

      Set<eje<?>> b();
   }
}
