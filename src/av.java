import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av extends dy<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(asi $$0, jh $$1, cxp $$2) {
      ash $$3 = $$0.y();
      dxv $$4 = $$3.a_($$1);
      ews $$5 = new ews.a($$3).a(ezj.f, $$1.b()).a(ezj.a, $$0).a(ezj.g, $$4).a(ezj.i, $$2).a(ezi.o);
      ewp $$6 = new ewp.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(av.a::a), bh.a.optionalFieldOf("location").forGetter(av.a::b)).apply($$0, av.a::new)
      );

      public boolean a(ewp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ezi.o, ".location"));
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<bh> b() {
         return this.c;
      }
   }
}
