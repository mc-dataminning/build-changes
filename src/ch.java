import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ch extends cv<ch.a> {
   @Override
   public Codec<ch.a> a() {
      return ch.a.a;
   }

   public void a(amq $$0, blu $$1, List<blf> $$2) {
      List<ege> $$3 = $$2.stream().map($$1x -> bp.b($$0, $$1x)).collect(Collectors.toList());
      ege $$4 = bp.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bb> b, Optional<bb> c, Optional<bb> d) implements cv.a {
      public static final Codec<ch.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atg.a(bp.b, "player").forGetter(ch.a::a), atg.a(bp.b, "lightning").forGetter(ch.a::b), atg.a(bp.b, "bystander").forGetter(ch.a::c))
               .apply($$0, ch.a::new)
      );

      public static an<ch.a> a(Optional<bp> $$0, Optional<bp> $$1) {
         return am.T.a(new ch.a(Optional.empty(), bp.a($$0), bp.a($$1)));
      }

      public boolean a(ege $$0, List<ege> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<bb> b() {
         return this.c;
      }

      public Optional<bb> c() {
         return this.d;
      }
   }
}
