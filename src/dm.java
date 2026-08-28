import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dm extends dw<dm.a> {
   @Override
   public Codec<dm.a> a() {
      return dm.a.a;
   }

   public void a(ark $$0, btr $$1, bsj $$2, float $$3, float $$4, boolean $$5) {
      etl $$6 = bv.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bg> b, Optional<bj> c, Optional<bg> d) implements dw.a {
      public static final Codec<dm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(dm.a::a),
                  bj.a.optionalFieldOf("damage").forGetter(dm.a::c),
                  bv.b.optionalFieldOf("entity").forGetter(dm.a::d)
               )
               .apply($$0, dm.a::new)
      );

      public static ao<dm.a> b() {
         return an.h.a(new dm.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<dm.a> a(Optional<bj> $$0) {
         return an.h.a(new dm.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static ao<dm.a> a(bj.a $$0) {
         return an.h.a(new dm.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static ao<dm.a> b(Optional<bv> $$0) {
         return an.h.a(new dm.a(Optional.empty(), Optional.empty(), bv.a($$0)));
      }

      public static ao<dm.a> a(Optional<bj> $$0, Optional<bv> $$1) {
         return an.h.a(new dm.a(Optional.empty(), $$0, bv.a($$1)));
      }

      public static ao<dm.a> a(bj.a $$0, Optional<bv> $$1) {
         return an.h.a(new dm.a(Optional.empty(), Optional.of($$0.b()), bv.a($$1)));
      }

      public boolean a(ark $$0, etl $$1, bsj $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dw.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
