import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cq extends df<cq.a> {
   @Override
   public Codec<cq.a> a() {
      return cq.a.a;
   }

   public void a(aqo $$0, bsp $$1, List<brw> $$2) {
      List<eph> $$3 = $$2.stream().map($$1x -> br.b($$0, $$1x)).collect(Collectors.toList());
      eph $$4 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bc> d) implements df.a {
      public static final Codec<cq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(cq.a::a),
                  br.b.optionalFieldOf("lightning").forGetter(cq.a::b),
                  br.b.optionalFieldOf("bystander").forGetter(cq.a::c)
               )
               .apply($$0, cq.a::new)
      );

      public static an<cq.a> a(Optional<br> $$0, Optional<br> $$1) {
         return am.V.a(new cq.a(Optional.empty(), br.a($$0), br.a($$1)));
      }

      public boolean a(eph $$0, List<eph> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
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
