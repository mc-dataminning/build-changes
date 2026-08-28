import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dw extends dk<dw.a> {
   @Override
   public Codec<dw.a> a() {
      return dw.a.a;
   }

   public void a(arr $$0, cqq $$1, czk $$2) {
      ezo $$3 = by.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<cm> d) implements dk.a {
      public static final Codec<dw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(dw.a::a),
                  by.b.optionalFieldOf("villager").forGetter(dw.a::c),
                  cm.a.optionalFieldOf("item").forGetter(dw.a::d)
               )
               .apply($$0, dw.a::new)
      );

      public static ar<dw.a> b() {
         return aq.t.a(new dw.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<dw.a> a(by.a $$0) {
         return aq.t.a(new dw.a(Optional.of(by.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(ezo $$0, czk $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
