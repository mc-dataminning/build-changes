import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class dh extends dz<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(are $$0, bvg $$1, List<bul> $$2) {
      List<evr> $$3 = $$2.stream().map($$1x -> bx.b($$0, $$1x)).collect(Collectors.toList());
      evr $$4 = bx.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bi> b, Optional<bi> c, Optional<bi> d) implements dz.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(dh.a::a),
                  bx.b.optionalFieldOf("lightning").forGetter(dh.a::b),
                  bx.b.optionalFieldOf("bystander").forGetter(dh.a::c)
               )
               .apply($$0, dh.a::new)
      );

      public static aq<dh.a> a(Optional<bx> $$0, Optional<bx> $$1) {
         return ap.V.a(new dh.a(Optional.empty(), bx.a($$0), bx.a($$1)));
      }

      public boolean a(evr $$0, List<evr> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
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
