import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class emg implements emi {
   private static final String d = "block_entity";
   private static final emg.a e = new emg.a() {
      @Override
      public tt a(eiv $$0) {
         dit $$1 = $$0.c(elg.h);
         return $$1 != null ? $$1.o() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eld<?>> b() {
         return ImmutableSet.of(elg.h);
      }
   };
   public static final emg a = new emg(e);
   private static final Codec<emg.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         eiv.b $$1 = eiv.b.a($$0);
         return b($$1);
      }
   }, emg.a::a);
   public static final Codec<emg> b = RecordCodecBuilder.create($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, emg::new));
   public static final Codec<emg> c = f.xmap(emg::new, $$0 -> $$0.g);
   private final emg.a g;

   private static emg.a b(final eiv.b $$0) {
      return new emg.a() {
         @Nullable
         @Override
         public tt a(eiv $$0x) {
            bno $$1 = $$0.c($$0.a());
            return $$1 != null ? co.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eld<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private emg(emg.a $$0) {
      this.g = $$0;
   }

   @Override
   public emh a() {
      return emj.c;
   }

   @Nullable
   @Override
   public tt a(eiv $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<eld<?>> b() {
      return this.g.b();
   }

   public static emi a(eiv.b $$0) {
      return new emg(b($$0));
   }

   interface a {
      @Nullable
      tt a(eiv var1);

      String a();

      Set<eld<?>> b();
   }
}
