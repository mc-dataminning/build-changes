import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dd extends dr<dd.a> {
   @Override
   public Codec<dd.a> a() {
      return dd.a.a;
   }

   public void a(arf $$0, ald<eql> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bf> b, ald<eql> c) implements dr.a {
      public static final Codec<dd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(dd.a::a), ald.a(lq.aU).fieldOf("loot_table").forGetter(dd.a::b)).apply($$0, dd.a::new)
      );

      public static an<dd.a> a(ald<eql> $$0) {
         return am.Q.a(new dd.a(Optional.empty(), $$0));
      }

      public boolean b(ald<eql> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public ald<eql> b() {
         return this.c;
      }
   }
}
