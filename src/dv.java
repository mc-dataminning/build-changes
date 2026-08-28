import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dv extends dw<dv.a> {
   @Override
   public Codec<dv.a> a() {
      return dv.a.a;
   }

   public void a(ark $$0, cvs $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<cs> c) implements dw.a {
      public static final Codec<dv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(dv.a::a), cs.a.optionalFieldOf("item").forGetter(dv.a::b)).apply($$0, dv.a::new)
      );

      public static ao<dv.a> a(Optional<cs> $$0) {
         return an.G.a(new dv.a(Optional.empty(), $$0));
      }

      public static ao<dv.a> a(jp<cvn> $$0, dei $$1) {
         return an.G.a(new dv.a(Optional.empty(), Optional.of(cs.a.a().a($$0, $$1).b())));
      }

      public boolean a(cvs $$0) {
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
