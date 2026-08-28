import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cs extends dj<cs.a> {
   @Override
   public Codec<cs.a> a() {
      return cs.a.a;
   }

   public void a(arr $$0, bxb $$1, List<bwd> $$2) {
      List<eyz> $$3 = $$2.stream().map($$1x -> bx.b($$0, $$1x)).collect(Collectors.toList());
      eyz $$4 = bx.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bi> b, Optional<bi> c, Optional<bi> d) implements dj.a {
      public static final Codec<cs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(cs.a::a),
                  bx.b.optionalFieldOf("lightning").forGetter(cs.a::b),
                  bx.b.optionalFieldOf("bystander").forGetter(cs.a::c)
               )
               .apply($$0, cs.a::new)
      );

      public static aq<cs.a> a(Optional<bx> $$0, Optional<bx> $$1) {
         return ap.V.a(new cs.a(Optional.empty(), bx.a($$0), bx.a($$1)));
      }

      public boolean a(eyz $$0, List<eyz> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<bi> b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }
   }
}
