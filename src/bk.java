import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bk extends dr<bk.a> {
   @Override
   public Codec<bk.a> a() {
      return bk.a.a;
   }

   public void a(arg $$0, iz $$1) {
      arf $$2 = $$0.z();
      dse $$3 = $$2.a_($$1);
      eqn $$4 = new eqn.a($$2).a(etg.f, $$1.b()).a(etg.a, $$0).a(etg.g, $$3).a(etf.p);
      eqk $$5 = new eqk.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bf> b, Optional<bf> c) implements dr.a {
      public static final Codec<bk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(bk.a::a), bf.a.optionalFieldOf("location").forGetter(bk.a::b)).apply($$0, bk.a::new)
      );

      public boolean a(eqk $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, etf.p, ".location"));
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
