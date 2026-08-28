import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends dw<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(ark $$0, jf $$1, cvs $$2) {
      arj $$3 = $$0.B();
      dus $$4 = $$3.a_($$1);
      eto $$5 = new eto.a($$3).a(ewh.f, $$1.b()).a(ewh.a, $$0).a(ewh.g, $$4).a(ewh.i, $$2).a(ewg.o);
      etl $$6 = new etl.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c) implements dw.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(au.a::a), bg.a.optionalFieldOf("location").forGetter(au.a::b)).apply($$0, au.a::new)
      );

      public boolean a(etl $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dw.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewg.o, ".location"));
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
