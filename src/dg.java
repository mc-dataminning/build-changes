import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dg extends dv<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(arh $$0, ala<esy> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bg> b, ala<esy> c) implements dv.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(dg.a::a), ala.a(lv.bc).fieldOf("loot_table").forGetter(dg.a::b)).apply($$0, dg.a::new)
      );

      public static ao<dg.a> a(ala<esy> $$0) {
         return an.Q.a(new dg.a(Optional.empty(), $$0));
      }

      public boolean b(ala<esy> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public ala<esy> b() {
         return this.c;
      }
   }
}
