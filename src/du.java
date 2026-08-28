import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class du extends dv<du.a> {
   @Override
   public Codec<du.a> a() {
      return du.a.a;
   }

   public void a(arh $$0, cvl $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<cs> c) implements dv.a {
      public static final Codec<du.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(du.a::a), cs.a.optionalFieldOf("item").forGetter(du.a::b)).apply($$0, du.a::new)
      );

      public static ao<du.a> a(Optional<cs> $$0) {
         return an.G.a(new du.a(Optional.empty(), $$0));
      }

      public static ao<du.a> a(jo<cvg> $$0, ddr $$1) {
         return an.G.a(new du.a(Optional.empty(), Optional.of(cs.a.a().a($$0, $$1).b())));
      }

      public boolean a(cvl $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<cs> b() {
         return this.c;
      }
   }
}
