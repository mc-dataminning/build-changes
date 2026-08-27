import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class egn extends ehb {
   public static final Codec<egn> a = Codec.unit(() -> egn.b);
   public static final egn b = new egn();

   @Nullable
   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      ib $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dae.H);
      return $$7 && !dac.a($$4.b().j($$0, $$6)) ? new ehe.c($$6, dae.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected ehd<?> a() {
      return ehd.m;
   }
}
