import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ej extends dw<ej.a> {
   @Override
   public Codec<ej.a> a() {
      return ej.a.a;
   }

   public void a(ark $$0, cvs $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<cs> c) implements dw.a {
      public static final Codec<ej.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ej.a::a), cs.a.optionalFieldOf("item").forGetter(ej.a::b)).apply($$0, ej.a::new)
      );

      public static ao<ej.a> a(cs $$0) {
         return an.C.a(new ej.a(Optional.empty(), Optional.of($$0)));
      }

      public static ao<ej.a> a(jp<cvn> $$0, dei $$1) {
         return an.C.a(new ej.a(Optional.empty(), Optional.of(cs.a.a().a($$0, $$1).b())));
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
