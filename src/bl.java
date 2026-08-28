import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends dw<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(ark $$0, jf $$1) {
      arj $$2 = $$0.B();
      dus $$3 = $$2.a_($$1);
      eto $$4 = new eto.a($$2).a(ewh.f, $$1.b()).a(ewh.a, $$0).a(ewh.g, $$3).a(ewg.p);
      etl $$5 = new etl.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dw.a {
      public static final Codec<bl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(bl.a::a), bg.a.optionalFieldOf("location").forGetter(bl.a::b)).apply($$0, bl.a::new)
      );

      public boolean a(etl $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dw.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewg.p, ".location"));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bg> b() {
         return this.c;
      }
   }
}
