import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bi extends cv<bi.a> {
   @Override
   public Codec<bi.a> a() {
      return bi.a.a;
   }

   public void a(ana $$0, @Nullable blp $$1) {
      egp $$2 = $$1 != null ? bp.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bb> b, Optional<cl> c, Optional<bb> d) implements cv.a {
      public static final Codec<bi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(bi.a::a), atq.a(cl.a, "effects").forGetter(bi.a::b), atq.a(bp.b, "source").forGetter(bi.a::c))
               .apply($$0, bi.a::new)
      );

      public static an<bi.a> a(cl.a $$0) {
         return am.B.a(new bi.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static an<bi.a> a(bp.a $$0) {
         return am.B.a(new bi.a(Optional.empty(), Optional.empty(), Optional.of(bp.a($$0.b()))));
      }

      public boolean a(ana $$0, @Nullable egp $$1) {
         return this.c.isPresent() && !this.c.get().a((bmf)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<cl> b() {
         return this.c;
      }

      public Optional<bb> c() {
         return this.d;
      }
   }
}
