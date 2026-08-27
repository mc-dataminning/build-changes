import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cj extends cx<cj.a> {
   @Override
   public Codec<cj.a> a() {
      return cj.a.a;
   }

   public void a(apb $$0, bow $$1, List<bof> $$2) {
      List<ejy> $$3 = $$2.stream().map($$1x -> br.b($$0, $$1x)).collect(Collectors.toList());
      ejy $$4 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bc> d) implements cx.a {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(avu.a(br.b, "player").forGetter(cj.a::a), avu.a(br.b, "lightning").forGetter(cj.a::b), avu.a(br.b, "bystander").forGetter(cj.a::c))
               .apply($$0, cj.a::new)
      );

      public static an<cj.a> a(Optional<br> $$0, Optional<br> $$1) {
         return am.V.a(new cj.a(Optional.empty(), br.a($$0), br.a($$1)));
      }

      public boolean a(ejy $$0, List<ejy> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
