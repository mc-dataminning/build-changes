import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bo extends dv<bo.a> {
   @Override
   public Codec<bo.a> a() {
      return bo.a.a;
   }

   public void a(aqv $$0, @Nullable bsr $$1) {
      err $$2 = $$1 != null ? bv.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bg> b, Optional<di> c, Optional<bg> d) implements dv.a {
      public static final Codec<bo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(bo.a::a),
                  di.a.optionalFieldOf("effects").forGetter(bo.a::b),
                  bv.b.optionalFieldOf("source").forGetter(bo.a::c)
               )
               .apply($$0, bo.a::new)
      );

      public static ao<bo.a> a(di.a $$0) {
         return an.B.a(new bo.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static ao<bo.a> a(bv.a $$0) {
         return an.B.a(new bo.a(Optional.empty(), Optional.empty(), Optional.of(bv.a($$0.b()))));
      }

      public boolean a(aqv $$0, @Nullable err $$1) {
         return this.c.isPresent() && !this.c.get().a((btn)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<di> b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
