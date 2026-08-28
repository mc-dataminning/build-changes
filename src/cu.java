import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cu extends dl<cu.a> {
   @Override
   public Codec<cu.a> a() {
      return cu.a.a;
   }

   public void a(arv $$0, bxv $$1, List<bwv> $$2) {
      List<faj> $$3 = $$2.stream().map($$1x -> bz.b($$0, $$1x)).collect(Collectors.toList());
      faj $$4 = bz.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<bj> d) implements dl.a {
      public static final Codec<cu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(cu.a::a),
                  bz.b.optionalFieldOf("lightning").forGetter(cu.a::b),
                  bz.b.optionalFieldOf("bystander").forGetter(cu.a::c)
               )
               .apply($$0, cu.a::new)
      );

      public static ar<cu.a> a(Optional<bz> $$0, Optional<bz> $$1) {
         return aq.V.a(new cu.a(Optional.empty(), bz.a($$0), bz.a($$1)));
      }

      public boolean a(faj $$0, List<faj> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
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
