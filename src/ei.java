import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ei extends dv<ei.a> {
   @Override
   public Codec<ei.a> a() {
      return ei.a.a;
   }

   public void a(aqu $$0, cuo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<cs> c) implements dv.a {
      public static final Codec<ei.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ei.a::a), cs.a.optionalFieldOf("item").forGetter(ei.a::b)).apply($$0, ei.a::new)
      );

      public static ao<ei.a> a(cs $$0) {
         return an.C.a(new ei.a(Optional.empty(), Optional.of($$0)));
      }

      public static ao<ei.a> a(dct $$0) {
         return an.C.a(new ei.a(Optional.empty(), Optional.of(cs.a.a().a($$0).b())));
      }

      public boolean a(cuo $$0) {
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
