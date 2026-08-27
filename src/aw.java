import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class aw extends cx<aw.a> {
   @Override
   public Codec<aw.a> a() {
      return aw.a.a;
   }

   public void a(apt $$0, ccd $$1, ccd $$2, @Nullable bpp $$3) {
      enb $$4 = br.b($$0, $$1);
      enb $$5 = br.b($$0, $$2);
      enb $$6 = $$3 != null ? br.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bc> d, Optional<bc> e) implements cx.a {
      public static final Codec<aw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aws.a(br.b, "player").forGetter(aw.a::a),
                  aws.a(br.b, "parent").forGetter(aw.a::c),
                  aws.a(br.b, "partner").forGetter(aw.a::d),
                  aws.a(br.b, "child").forGetter(aw.a::e)
               )
               .apply($$0, aw.a::new)
      );

      public static an<aw.a> b() {
         return am.p.a(new aw.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<aw.a> a(br.a $$0) {
         return am.p.a(new aw.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(br.a($$0))));
      }

      public static an<aw.a> a(Optional<br> $$0, Optional<br> $$1, Optional<br> $$2) {
         return am.p.a(new aw.a(Optional.empty(), br.a($$0), br.a($$1), br.a($$2)));
      }

      public boolean a(enb $$0, enb $$1, @Nullable enb $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bc> $$0, enb $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.c, ".parent");
         $$0.a(this.d, ".partner");
         $$0.a(this.e, ".child");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
