import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bk extends ds<bk.a> {
   @Override
   public Codec<bk.a> a() {
      return bk.a.a;
   }

   public void a(aqn $$0, ja $$1) {
      aqm $$2 = $$0.z();
      dsk $$3 = $$2.a_($$1);
      eqx $$4 = new eqx.a($$2).a(etq.f, $$1.b()).a(etq.a, $$0).a(etq.g, $$3).a(etp.p);
      equ $$5 = new equ.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements ds.a {
      public static final Codec<bk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(bk.a::a), bf.a.optionalFieldOf("location").forGetter(bk.a::b)).apply($$0, bk.a::new)
      );

      public boolean a(equ $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, etp.p, ".location"));
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
