import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends dy<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(ary $$0, cxg $$1, bvb $$2) {
      ewi $$3 = bw.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bh> b, Optional<cu> c, Optional<bh> d) implements dy.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(dq.a::a),
                  cu.a.optionalFieldOf("item").forGetter(dq.a::b),
                  bw.b.optionalFieldOf("entity").forGetter(dq.a::c)
               )
               .apply($$0, dq.a::new)
      );

      public static ap<dq.a> a(Optional<bh> $$0, cu.a $$1, Optional<bh> $$2) {
         return ao.T.a(new dq.a($$0, Optional.of($$1.b()), $$2));
      }

      public static ap<dq.a> a(cu.a $$0, Optional<bh> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cxg $$0, ewi $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<cu> b() {
         return this.c;
      }

      public Optional<bh> c() {
         return this.d;
      }
   }
}
