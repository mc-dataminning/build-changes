import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dg extends dw<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(ark $$0, ald<etq> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bg> b, ald<etq> c) implements dw.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(dg.a::a), ald.a(lw.be).fieldOf("loot_table").forGetter(dg.a::b)).apply($$0, dg.a::new)
      );

      public static ao<dg.a> a(ald<etq> $$0) {
         return an.Q.a(new dg.a(Optional.empty(), $$0));
      }

      public boolean b(ald<etq> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public ald<etq> b() {
         return this.c;
      }
   }
}
