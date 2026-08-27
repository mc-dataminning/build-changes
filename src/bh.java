import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bh extends df<bh.a> {
   @Override
   public Codec<bh.a> a() {
      return bh.a.a;
   }

   public void a(aqn $$0, io $$1) {
      aqm $$2 = $$0.z();
      drb $$3 = $$2.a_($$1);
      epi $$4 = new epi.a($$2).a(erx.f, $$1.b()).a(erx.a, $$0).a(erx.g, $$3).a(erw.p);
      epf $$5 = new epf.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bc> b, Optional<bc> c) implements df.a {
      public static final Codec<bh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(bh.a::a), bc.a.optionalFieldOf("location").forGetter(bh.a::b)).apply($$0, bh.a::new)
      );

      public boolean a(epf $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, erw.p, ".location"));
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }
   }
}
