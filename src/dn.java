import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dn extends dv<dn.a> {
   @Override
   public Codec<dn.a> a() {
      return dn.a.a;
   }

   public void a(aqv $$0, cuq $$1, bsr $$2) {
      erp $$3 = bv.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bg> b, Optional<cs> c, Optional<bg> d) implements dv.a {
      public static final Codec<dn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(dn.a::a),
                  cs.a.optionalFieldOf("item").forGetter(dn.a::b),
                  bv.b.optionalFieldOf("entity").forGetter(dn.a::c)
               )
               .apply($$0, dn.a::new)
      );

      public static ao<dn.a> a(Optional<bg> $$0, cs.a $$1, Optional<bg> $$2) {
         return an.T.a(new dn.a($$0, Optional.of($$1.b()), $$2));
      }

      public static ao<dn.a> a(cs.a $$0, Optional<bg> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cuq $$0, erp $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<cs> b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
