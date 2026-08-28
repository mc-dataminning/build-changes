import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dc extends dk<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(arr $$0, czk $$1, bwi $$2) {
      ezo $$3 = by.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bj> b, Optional<cm> c, Optional<bj> d) implements dk.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(dc.a::a),
                  cm.a.optionalFieldOf("item").forGetter(dc.a::b),
                  by.b.optionalFieldOf("entity").forGetter(dc.a::c)
               )
               .apply($$0, dc.a::new)
      );

      public static ar<dc.a> a(Optional<bj> $$0, cm.a $$1, Optional<bj> $$2) {
         return aq.T.a(new dc.a($$0, Optional.of($$1.b()), $$2));
      }

      public static ar<dc.a> a(cm.a $$0, Optional<bj> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(czk $$0, ezo $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cm> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
