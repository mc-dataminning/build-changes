import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bq extends dz<bq.a> {
   @Override
   public Codec<bq.a> a() {
      return bq.a.a;
   }

   public void a(ard $$0, @Nullable buk $$1) {
      evr $$2 = $$1 != null ? bx.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bi> b, Optional<dl> c, Optional<bi> d) implements dz.a {
      public static final Codec<bq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(bq.a::a),
                  dl.a.optionalFieldOf("effects").forGetter(bq.a::b),
                  bx.b.optionalFieldOf("source").forGetter(bq.a::c)
               )
               .apply($$0, bq.a::new)
      );

      public static aq<bq.a> a(dl.a $$0) {
         return ap.B.a(new bq.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static aq<bq.a> a(bx.a $$0) {
         return ap.B.a(new bq.a(Optional.empty(), Optional.empty(), Optional.of(bx.a($$0.b()))));
      }

      public boolean a(ard $$0, @Nullable evr $$1) {
         return this.c.isPresent() && !this.c.get().a((bvg)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<dl> b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }
   }
}
