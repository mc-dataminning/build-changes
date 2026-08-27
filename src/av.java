import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class av extends cv<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(ana $$0, bxs $$1, bxs $$2, @Nullable blk $$3) {
      egp $$4 = bp.b($$0, $$1);
      egp $$5 = bp.b($$0, $$2);
      egp $$6 = $$3 != null ? bp.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bb> b, Optional<bb> c, Optional<bb> d, Optional<bb> e) implements cv.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atq.a(bp.b, "player").forGetter(av.a::a),
                  atq.a(bp.b, "parent").forGetter(av.a::c),
                  atq.a(bp.b, "partner").forGetter(av.a::d),
                  atq.a(bp.b, "child").forGetter(av.a::e)
               )
               .apply($$0, av.a::new)
      );

      public static an<av.a> b() {
         return am.p.a(new av.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<av.a> a(bp.a $$0) {
         return am.p.a(new av.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bp.a($$0))));
      }

      public static an<av.a> a(Optional<bp> $$0, Optional<bp> $$1, Optional<bp> $$2) {
         return am.p.a(new av.a(Optional.empty(), bp.a($$0), bp.a($$1), bp.a($$2)));
      }

      public boolean a(egp $$0, egp $$1, @Nullable egp $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bb> $$0, egp $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.c, ".parent");
         $$0.a(this.d, ".partner");
         $$0.a(this.e, ".child");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
