import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class de extends dv<de.a> {
   @Override
   public Codec<de.a> a() {
      return de.a.a;
   }

   public void a(aqv $$0, btm $$1, List<bsr> $$2) {
      List<erp> $$3 = $$2.stream().map($$1x -> bv.b($$0, $$1x)).collect(Collectors.toList());
      erp $$4 = bv.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<bg> d) implements dv.a {
      public static final Codec<de.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(de.a::a),
                  bv.b.optionalFieldOf("lightning").forGetter(de.a::b),
                  bv.b.optionalFieldOf("bystander").forGetter(de.a::c)
               )
               .apply($$0, de.a::new)
      );

      public static ao<de.a> a(Optional<bv> $$0, Optional<bv> $$1) {
         return an.V.a(new de.a(Optional.empty(), bv.a($$0), bv.a($$1)));
      }

      public boolean a(erp $$0, List<erp> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
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
