import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class dg extends dy<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(asi $$0, bwe $$1, List<bvj> $$2) {
      List<ewo> $$3 = $$2.stream().map($$1x -> bw.b($$0, $$1x)).collect(Collectors.toList());
      ewo $$4 = bw.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bh> b, Optional<bh> c, Optional<bh> d) implements dy.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(dg.a::a),
                  bw.b.optionalFieldOf("lightning").forGetter(dg.a::b),
                  bw.b.optionalFieldOf("bystander").forGetter(dg.a::c)
               )
               .apply($$0, dg.a::new)
      );

      public static ap<dg.a> a(Optional<bw> $$0, Optional<bw> $$1) {
         return ao.V.a(new dg.a(Optional.empty(), bw.a($$0), bw.a($$1)));
      }

      public boolean a(ewo $$0, List<ewo> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<bh> b() {
         return this.c;
      }

      public Optional<bh> c() {
         return this.d;
      }
   }
}
