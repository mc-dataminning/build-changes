import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class dn extends dy<dn.a> {
   @Override
   public Codec<dn.a> a() {
      return dn.a.a;
   }

   public void a(asi $$0, cxk $$1, @Nullable bvf $$2) {
      ewh $$3 = bw.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bh> b, Optional<cu> c, Optional<bh> d) implements dy.a {
      public static final Codec<dn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(dn.a::a),
                  cu.a.optionalFieldOf("item").forGetter(dn.a::b),
                  bw.b.optionalFieldOf("entity").forGetter(dn.a::c)
               )
               .apply($$0, dn.a::new)
      );

      public static ap<dn.a> a(bh $$0, Optional<cu> $$1, Optional<bh> $$2) {
         return ao.R.a(new dn.a(Optional.of($$0), $$1, $$2));
      }

      public static ap<dn.a> a(Optional<bh> $$0, Optional<cu> $$1, Optional<bh> $$2) {
         return ao.S.a(new dn.a($$0, $$1, $$2));
      }

      public boolean a(asi $$0, cxk $$1, ewh $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
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
