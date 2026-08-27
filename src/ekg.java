import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class ekg implements eki {
   private static final String d = "block_entity";
   private static final ekg.a e = new ekg.a() {
      @Override
      public tk a(egv $$0) {
         dgu $$1 = $$0.c(ejg.h);
         return $$1 != null ? $$1.o() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ejd<?>> b() {
         return ImmutableSet.of(ejg.h);
      }
   };
   public static final ekg a = new ekg(e);
   private static final Codec<ekg.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         egv.b $$1 = egv.b.a($$0);
         return b($$1);
      }
   }, ekg.a::a);
   public static final Codec<ekg> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, ekg::new));
   public static final Codec<ekg> c = f.xmap(ekg::new, $$0 -> $$0.g);
   private final ekg.a g;

   private static ekg.a b(final egv.b $$0) {
      return new ekg.a() {
         @Nullable
         @Override
         public tk a(egv $$0x) {
            blu $$1 = $$0.c($$0.a());
            return $$1 != null ? cm.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ejd<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ekg(ekg.a $$0) {
      this.g = $$0;
   }

   @Override
   public ekh a() {
      return ekj.c;
   }

   @Nullable
   @Override
   public tk a(egv $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<ejd<?>> b() {
      return this.g.b();
   }

   public static eki a(egv.b $$0) {
      return new ekg(b($$0));
   }

   interface a {
      @Nullable
      tk a(egv var1);

      String a();

      Set<ejd<?>> b();
   }
}
