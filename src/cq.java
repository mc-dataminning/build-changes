import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cq extends de<cq.a> {
   @Override
   public Codec<cq.a> a() {
      return cq.a.a;
   }

   public void a(aqi $$0, brz $$1, List<brh> $$2) {
      List<eol> $$3 = $$2.stream().map($$1x -> br.b($$0, $$1x)).collect(Collectors.toList());
      eol $$4 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bc> d) implements de.a {
      public static final Codec<cq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(cq.a::a), axh.a(br.b, "lightning").forGetter(cq.a::b), axh.a(br.b, "bystander").forGetter(cq.a::c))
               .apply($$0, cq.a::new)
      );

      public static an<cq.a> a(Optional<br> $$0, Optional<br> $$1) {
         return am.V.a(new cq.a(Optional.empty(), br.a($$0), br.a($$1)));
      }

      public boolean a(eol $$0, List<eol> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
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
