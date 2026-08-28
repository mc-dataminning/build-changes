import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ei extends dx<ei.a> {
   @Override
   public Codec<ei.a> a() {
      return ei.a.a;
   }

   public void a(arn $$0, cno $$1, cvx $$2) {
      etw $$3 = bv.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<ct> d) implements dx.a {
      public static final Codec<ei.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(ei.a::a),
                  bv.b.optionalFieldOf("villager").forGetter(ei.a::c),
                  ct.a.optionalFieldOf("item").forGetter(ei.a::d)
               )
               .apply($$0, ei.a::new)
      );

      public static ao<ei.a> b() {
         return an.t.a(new ei.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<ei.a> a(bv.a $$0) {
         return an.t.a(new ei.a(Optional.of(bv.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(etw $$0, cvx $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
