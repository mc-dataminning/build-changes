import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bi extends dk<bi.a> {
   @Override
   public Codec<bi.a> a() {
      return bi.a.a;
   }

   public void a(arr $$0, czn $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<cm> c) implements dk.a {
      public static final Codec<bi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(by.b.optionalFieldOf("player").forGetter(bi.a::a), cm.a.optionalFieldOf("item").forGetter(bi.a::c)).apply($$0, bi.a::new)
      );

      public static ar<bi.a> b() {
         return aq.A.a(new bi.a(Optional.empty(), Optional.empty()));
      }

      public static ar<bi.a> a(jg<czj> $$0, djl $$1) {
         return a(cm.a.a().a($$0, $$1.h()));
      }

      public static ar<bi.a> a(cm.a $$0) {
         return aq.A.a(new bi.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(czn $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
