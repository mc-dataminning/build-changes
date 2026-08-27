import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epl extends eox {
   public static final Codec<epl> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(erh.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, epl::new)
   );
   private final erg b;
   private final boolean c;

   private epl(List<eql> $$0, erg $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eoz b() {
      return epa.c;
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.a();
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      int $$2 = this.c ? $$0.G() : 0;
      $$0.e(axm.a($$2 + this.b.a($$1), 0, $$0.i()));
      return $$0;
   }

   public static eox.a<?> a(erg $$0) {
      return a($$1 -> new epl($$1, $$0, false));
   }

   public static eox.a<?> a(erg $$0, boolean $$1) {
      return a($$2 -> new epl($$2, $$0, $$1));
   }
}
