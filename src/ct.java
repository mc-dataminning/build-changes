import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ct extends dk<ct.a> {
   @Override
   public Codec<ct.a> a() {
      return ct.a.a;
   }

   public void a(art $$0, bxt $$1, List<bwt> $$2) {
      List<fah> $$3 = $$2.stream().map($$1x -> by.b($$0, $$1x)).collect(Collectors.toList());
      fah $$4 = by.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<bj> d) implements dk.a {
      public static final Codec<ct.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(ct.a::a),
                  by.b.optionalFieldOf("lightning").forGetter(ct.a::b),
                  by.b.optionalFieldOf("bystander").forGetter(ct.a::c)
               )
               .apply($$0, ct.a::new)
      );

      public static ar<ct.a> a(Optional<by> $$0, Optional<by> $$1) {
         return aq.V.a(new ct.a(Optional.empty(), by.a($$0), by.a($$1)));
      }

      public boolean a(fah $$0, List<fah> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<bj> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
