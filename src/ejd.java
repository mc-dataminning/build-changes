import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ejd extends eir {
   public static final Codec<ejd> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ela.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ejd::new)
   );
   private final ekz b;
   private final boolean c;

   private ejd(List<eke> $$0, ekz $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eit b() {
      return eiu.c;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.b.a();
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(aup.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static eir.a<?> a(ekz $$0) {
      return a($$1 -> new ejd($$1, $$0, false));
   }

   public static eir.a<?> a(ekz $$0, boolean $$1) {
      return a($$2 -> new ejd($$2, $$0, $$1));
   }
}
