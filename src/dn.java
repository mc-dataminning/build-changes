import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dn extends dx<dn.a> {
   @Override
   public Codec<dn.a> a() {
      return dn.a.a;
   }

   public void a(arn $$0, btz $$1, bsp $$2, float $$3, float $$4, boolean $$5) {
      etw $$6 = bv.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bg> b, Optional<bj> c, Optional<bg> d) implements dx.a {
      public static final Codec<dn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(dn.a::a),
                  bj.a.optionalFieldOf("damage").forGetter(dn.a::c),
                  bv.b.optionalFieldOf("entity").forGetter(dn.a::d)
               )
               .apply($$0, dn.a::new)
      );

      public static ao<dn.a> b() {
         return an.h.a(new dn.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<dn.a> a(Optional<bj> $$0) {
         return an.h.a(new dn.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static ao<dn.a> a(bj.a $$0) {
         return an.h.a(new dn.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static ao<dn.a> b(Optional<bv> $$0) {
         return an.h.a(new dn.a(Optional.empty(), Optional.empty(), bv.a($$0)));
      }

      public static ao<dn.a> a(Optional<bj> $$0, Optional<bv> $$1) {
         return an.h.a(new dn.a(Optional.empty(), $$0, bv.a($$1)));
      }

      public static ao<dn.a> a(bj.a $$0, Optional<bv> $$1) {
         return an.h.a(new dn.a(Optional.empty(), Optional.of($$0.b()), bv.a($$1)));
      }

      public boolean a(arn $$0, etw $$1, bsp $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
