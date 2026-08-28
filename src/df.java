import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class df extends dx<df.a> {
   @Override
   public Codec<df.a> a() {
      return df.a.a;
   }

   public void a(arn $$0, buu $$1, List<btz> $$2) {
      List<etw> $$3 = $$2.stream().map($$1x -> bv.b($$0, $$1x)).collect(Collectors.toList());
      etw $$4 = bv.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<bg> d) implements dx.a {
      public static final Codec<df.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(df.a::a),
                  bv.b.optionalFieldOf("lightning").forGetter(df.a::b),
                  bv.b.optionalFieldOf("bystander").forGetter(df.a::c)
               )
               .apply($$0, df.a::new)
      );

      public static ao<df.a> a(Optional<bv> $$0, Optional<bv> $$1) {
         return an.V.a(new df.a(Optional.empty(), bv.a($$0), bv.a($$1)));
      }

      public boolean a(etw $$0, List<etw> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bg> b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
