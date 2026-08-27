import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cs extends de<cs.a> {
   @Override
   public Codec<cs.a> a() {
      return cs.a.a;
   }

   public void a(aqi $$0, akg<eoq> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bc> b, akg<eoq> c) implements de.a {
      public static final Codec<cs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(cs.a::a), akg.a(le.aU).fieldOf("loot_table").forGetter(cs.a::b)).apply($$0, cs.a::new)
      );

      public static an<cs.a> a(akg<eoq> $$0) {
         return am.Q.a(new cs.a(Optional.empty(), $$0));
      }

      public boolean b(akg<eoq> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public akg<eoq> b() {
         return this.c;
      }
   }
}
