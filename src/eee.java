import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eee extends eds {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egb.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eee::new)
   );
   private final ega b;
   private final boolean c;

   private eee(List<eff> $$0, ega $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edu b() {
      return edv.c;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.b.a();
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(arp.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static eds.a<?> a(ega $$0) {
      return a($$1 -> new eee($$1, $$0, false));
   }

   public static eds.a<?> a(ega $$0, boolean $$1) {
      return a($$2 -> new eee($$2, $$0, $$1));
   }
}
