import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class at extends ds<at.a> {
   @Override
   public Codec<at.a> a() {
      return at.a.a;
   }

   public void a(aqn $$0, ja $$1, cuc $$2) {
      aqm $$3 = $$0.z();
      dsk $$4 = $$3.a_($$1);
      eqx $$5 = new eqx.a($$3).a(etq.f, $$1.b()).a(etq.a, $$0).a(etq.g, $$4).a(etq.i, $$2).a(etp.o);
      equ $$6 = new equ.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements ds.a {
      public static final Codec<at.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(at.a::a), bf.a.optionalFieldOf("location").forGetter(at.a::b)).apply($$0, at.a::new)
      );

      public boolean a(equ $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, etp.o, ".location"));
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<bf> b() {
         return this.c;
      }
   }
}
