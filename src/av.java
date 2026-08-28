import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av extends dy<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(aro $$0, jh $$1, cwb $$2) {
      arn $$3 = $$0.B();
      dvj $$4 = $$3.a_($$1);
      euf $$5 = new euf.a($$3).a(ewy.f, $$1.b()).a(ewy.a, $$0).a(ewy.g, $$4).a(ewy.i, $$2).a(ewx.o);
      euc $$6 = new euc.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bh> b, Optional<bh> c) implements dy.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bw.b.optionalFieldOf("player").forGetter(av.a::a), bh.a.optionalFieldOf("location").forGetter(av.a::b)).apply($$0, av.a::new)
      );

      public boolean a(euc $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, ewx.o, ".location"));
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
