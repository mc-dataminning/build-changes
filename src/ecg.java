import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ecg extends eca {
   public static final Codec<ecg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eca.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               bnf.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ecg::new)
   );
   private final eca c;
   private final String d;
   @Nullable
   private dpz e;
   private final bnf f;

   public ecg(eca $$0, dpz $$1, bnf $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$1.f();
      this.f = $$2;
      Collection<Integer> $$3 = $$1.a();

      for (int $$4 = $$2.a(); $$4 <= $$2.b(); $$4++) {
         if (!$$3.contains($$4)) {
            throw new IllegalArgumentException("Property value out of range: " + $$1.f() + ": " + $$4);
         }
      }
   }

   public ecg(eca $$0, String $$1, bnf $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ecb<?> a() {
      return ecb.g;
   }

   @Override
   public doz a(axr $$0, ib $$1) {
      doz $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static dpz a(doz $$0, String $$1) {
      Collection<dqc<?>> $$2 = $$0.B();
      Optional<dpz> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof dpz).map($$0x -> (dpz)$$0x).findAny();
      return $$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
